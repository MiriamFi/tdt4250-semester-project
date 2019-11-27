package imdb.dataset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import imdb.Imdb;
import imdb.ImdbFactory;
import imdb.Involvement;
import imdb.Person;
import imdb.Rating;
import imdb.Title;
import imdb.TitleType;

public class DatasetDeserializer {
	
	
	public static final String outputXmiFilePath = "src/imdb/dataset/deserialized.xmi";
	private static Imdb imdb;
	
	private static HashMap<String, Title> titleMap = new HashMap<String, Title>();
	private static HashMap<String, Person> personMap = new HashMap<String, Person>();
	
	
	
	public static void main(String[] args) {

		// get instantiated EPackage
		// imdbPackage can be found in ImdbPackage.eINSTANCE;

		// get instantiated EFactory
		// imdbFactory can be found in ImdbFactory.eINSTANCE;
		
		// Create Imdb class. Saved in ImdbPackage
		imdb = ImdbFactory.eINSTANCE.createImdb();
		
		
		System.out.println("Start deserializing to Ecore instances");
		DatasetDeserializer.deserialize();
		System.out.println("\nStart serializing to XMI");
		serializeToXMI(outputXmiFilePath);
		System.out.println("Saved to "+outputXmiFilePath);
		
	}
	
	
	public static void deserialize() {
		deserializeTitles();
		System.out.println("Done deserializing all titles");
		
		hash500RandomTVSeries();
		System.out.println("Picked out 500 TV Series titles");
		
		
		deserializeRatings();
		System.out.println("Done getting corresponding ratings");
		
		
		
		
		deserializePersons();
		hashPersons();
		System.out.println("Done deserializing all persons");
		
		
		// deserialize involvements
		System.out.println();
		
		
		
		// remove all person not connected to titles or
		// involvements that are connected to a titles
		
		List<Person> persons = imdb.getPersons().stream()
			.filter(person -> { 
				for (Title title : person.getKnownForTitles()) {
					// If person has titleMap titles in knownForTitles
					if (titleMap.containsValue(title))
						return true;
					
					// If person is connected to titleMap titles through involvements
					for (Involvement involvement: title.getInvolvements()) {
						if (involvement.getPerson() == person)
							return true;
					}
				}
				return false;
			})
			.collect(Collectors.toList());
		
		// Update ecore model
		imdb.getPersons().clear();
		imdb.getPersons().addAll(persons);
		
	}
	
	
	// Create all titles from file
	public static void deserializeTitles(){
		String filename = "src/imdb/dataset/titles.tsv";
		// Open file
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    for(String line; (line = br.readLine()) != null; ) {
		    	deserializeEachTitle(line);
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializeEachTitle(String line){
		// Split string by delimiter tab
		String[] columnValues = line.split("\\t");
		Title title = ImdbFactory.eINSTANCE.createTitle();
		title.setImdb(imdb);
		
		// Since possibly not all title types are defined, 
		
		String titleID = columnValues[0];
		String titleType = columnValues[1];
		String titleName = columnValues[2];
		String titleIsAdult = columnValues[4];
		
		// If start year is \N, make it a 0
		int titleStartYear = 0;
		try {
			titleStartYear = Integer.parseInt(columnValues[5]);
		} catch (NumberFormatException e) {
			// do nothing
		}
		String titleEndYear = columnValues[6];
		

		// If runtimeMinutes is \N, make it a 0
		int titleRuntimeMinutes = 0;
		try {
			titleRuntimeMinutes = Integer.parseInt(columnValues[7]);
		} catch (NumberFormatException e) {
			// do nothing
		}
		String[] titleGenres = columnValues[8].split(",");
		
		
		
		title.setID(titleID);
		title.setTitleType(TitleType.get(titleType.toUpperCase()));
		
		title.setName(titleName);
		title.setStartYear(titleStartYear);
		title.setRuntime(titleRuntimeMinutes);
		
		
	}
	
	
	
	private static void hash500RandomTVSeries() {
		// Hash the titles by id for faster query
		// List<T> has the same performance for search as List<T>
		//imdb.getTitles().forEach(title -> titleMap.put(title.getID(), title));

		// Hash titles
		List<Title> tvSeries = imdb.getTitles().stream()
					.filter(title -> title.getTitleType() == TitleType.TVSERIES)
					.collect(Collectors.toList());
		
		// Randomise the list
		Collections.shuffle(tvSeries);
		
		// Pick 500
		tvSeries = tvSeries.stream()
				.limit(500) // no need to check if the list is shorter than 500
				.collect(Collectors.toList());
		
		// Update the titleMap
		tvSeries.forEach(series -> titleMap.put(series.getID(), series));
		
		
		// Append to ecore model
		imdb.getTitles().clear();
		imdb.getTitles().addAll(tvSeries);
	}
	
	
	
	public static void deserializePersons() {
		String filename = "src/imdb/dataset/persons.tsv";
		// Open file
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    for(String line; (line = br.readLine()) != null; ) {
		    	deserializePerson(line);
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void deserializePerson(String line){
		// Split string by delimiter tab
		String[] columnValues = line.split("\\t");
		Person person = ImdbFactory.eINSTANCE.createPerson();
		
		person.setImdb(imdb);
		
		String ID = columnValues[0];
		String name = columnValues[1];
		

		// If start year is \N, make it a 0
		int birthYear = 0;
		try {
			birthYear = Integer.parseInt(columnValues[2]);
		} catch (NumberFormatException e) {
			// do nothing
		}

		// If start year is \N, make it a 0
		int deathYear = 0;
		try {
			deathYear = Integer.parseInt(columnValues[3]);
		} catch (NumberFormatException e) {
			// do nothing
		}
		

		String[] professions = columnValues[4].split(",");
		String[] knownForTitlesIDs = columnValues[5].split(",");
		
		List<Title> knownForTitles = Arrays.asList(knownForTitlesIDs).stream()
					.map(titleID -> titleMap.get(titleID))	// get Title by id
					.filter(title -> title != null) 		// remove null titles
					.collect(Collectors.toList());			// construct the list
		
		
		person.setName(name);
		person.setBirthYear(birthYear);
		person.setDeathYear(deathYear);
		person.getProfessions().clear(); 
		person.getProfessions().addAll(Arrays.asList(professions));
		
		person.getKnownForTitles().clear();
		person.getKnownForTitles().addAll(knownForTitles);
		
		
	}

	
	
	private static void hashPersons() {
		imdb.getPersons().forEach(person -> personMap.put(person.getID(), person));
	}
	
	// Create all titles from file
	public static void deserializeRatings(){
		String filename = "src/imdb/dataset/ratings.tsv";
		// Open file
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    // skip the first line, it contains the column headers
			br.readLine();
			for(String line; (line = br.readLine()) != null; ) {
		    	deserializeEachRating(line);
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializeEachRating(String line){
		// Split string by delimiter tab
		String[] columnValues = line.split("\\t");
		Rating rating = ImdbFactory.eINSTANCE.createRating();
		
		String titleID = columnValues[0];
		
		// Stop deserialization when the titleID is not in titleMap
		if (titleMap.get(titleID) == null) return;
		
		float averageRating = Float.parseFloat(columnValues[1]);
		int numVotes = Integer.parseInt(columnValues[2]);
		
		rating.setTitle(titleMap.get(titleID));
		rating.setAverageRating(averageRating);
		rating.setNumberOfVotes(numVotes);
		
	}
	
	
	public static void deserializeSubsetPrincipals(){

		String filename = "subsetprincipals.tsv";
		// Open file
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    for(String line; (line = br.readLine()) != null; ) {
		    	
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void serializeToXMI(String filepath) {
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register XML Factory implementation using DEFAULT_EXTENSION
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    "*", new  XMLResourceFactoryImpl());
		 
		// Create empty resource with the given URI
		Resource resource = resourceSet.createResource(URI.createURI(filepath));
		 
		// Add instances to contents list of the resource 

		resource.getContents().add(imdb);
		
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
