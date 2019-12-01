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

import imdb.Episode;
import imdb.Imdb;
import imdb.ImdbFactory;
import imdb.Involvement;
import imdb.Person;
import imdb.Rating;
import imdb.Title;
import imdb.TitleType;
import imdb.TvSeries;

public class DatasetDeserializer {
	
	
	public static final String outputXmiFilePath = "src/imdb/dataset/Imdb.imdb";
	private static Imdb imdb;


	private static HashMap<String, Title> allTitleMap = new HashMap<String, Title>();
	private static HashMap<String, Title> pickedTitleMap = new HashMap<String, Title>();
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
		
		// Pick tv series first !important
		int targetTvSeriesAtLeastCount = 10;
		while (pickedTitleMap.size() < targetTvSeriesAtLeastCount) {
			pickRandomTitles(TitleType.TVSERIES, 10);
			System.out.println("Picked tvseries");

			deserializeEpisodesDetails();
			System.out.println("Done deserializing episodes by picked titles");
			
			// Assumes all picked titles are tv series
			// Remove all series without episodes
			List<Title> seriesWithoutEpisodes = pickedTitleMap.values().stream()
				.filter(title -> ((TvSeries)title).getEpisodes().size() <= 0)
				.collect(Collectors.toList());
			seriesWithoutEpisodes.forEach(series -> pickedTitleMap.remove(series.getID()));
		}
		

		pickRandomTitles(TitleType.MOVIE, 5);
		pickRandomTitles(TitleType.SHORT, 5);
		pickRandomTitles(TitleType.VIDEO, 5);
		
		
		// Append to ecore model
		imdb.getTitles().clear();
		imdb.getTitles().addAll(pickedTitleMap.values());
		
		deserializeRatings();
		System.out.println("Done getting corresponding ratings");
		
		
		
		
		deserializePersons();
		System.out.println("Done deserializing all persons");
		hashPersons();
		System.out.println("Hashed all persons");
		
		
		deserializeInvolvements();
		
		System.out.println("Done deserialize all involvements");
		
		
		
		// remove all person not connected to titles or
		// involvements that are connected to a titles
		HashMap<String, Person> smallerPersonMap = new HashMap<String, Person>();
		
		
		// For each parsed title, get all persons connected with involvements
		for (Title title: pickedTitleMap.values()) {
			for (Involvement involvement: title.getInvolvements()) {
				smallerPersonMap.put(involvement.getPerson().getID(), involvement.getPerson());
			}
		}
		
		// Get each person that is connected to a title in titleMap through knownForTitles
		imdb.getPersons().forEach(person -> {
			for (Title title : person.getKnownForTitles()) {
				if (pickedTitleMap.containsValue(title))
					smallerPersonMap.put(person.getID(), person);
			}
		});
		
		
		// Update ecore model
		imdb.getPersons().clear();
		imdb.getPersons().addAll(smallerPersonMap.values());

		System.out.println("Removed all disconnected persons");
		
	}
	
	public static void deserializeEpisodesDetails(){
		String filename = "src/imdb/dataset/episodesDetails.tsv";
		// Open file
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
			// skip the first line, it contains the column headers
			br.readLine();
			for(String line; (line = br.readLine()) != null; ) {
		    	deserializeEpisodeDetails(line);
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializeEpisodeDetails(String line){
		// Split string by delimiter tab
		String[] columnValues = line.split("\\t");
		
		String episodeID = columnValues[0];
		String parentTitleID = columnValues[1];
		
		// There are episodes that are connected to Movies
		// We will filter them away
		Title parentTitle = pickedTitleMap.get(parentTitleID);
		if (parentTitle == null) return;
		if (parentTitle.getTitleType() != TitleType.TVSERIES) return;
		
				
		TvSeries series = (TvSeries) parentTitle;
		Episode episode = (Episode) allTitleMap.get(episodeID);
		if (episode == null)
			return;
		
		// If start year is \N, make it a 0
		int seasonNumber = 0;
		try {
			seasonNumber = Integer.parseInt(columnValues[2]);
		} catch (NumberFormatException e) {
			// do nothing
		}
		// If start year is \N, make it a 0
		int episodeNumber = 0;
		try {
			episodeNumber = Integer.parseInt(columnValues[3]);
		} catch (NumberFormatException e) {
			// do nothing
		}
		episode.setImdb(null);
		episode.setSeries(series);
		episode.setEpisodeNumber(episodeNumber);
		episode.setSeasonNumber(seasonNumber);
		
		//pickedTitleMap.put(episodeID, episode);
	}
	
	
	
	
	
	
	
	public static void deserializeTitles(){
		String filename = "src/imdb/dataset/titles.tsv";
		// Open file
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
			br.readLine(); //skip first line
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
		
		String titleID = columnValues[0];
		String titleTypeString = columnValues[1];
		String titleName = columnValues[2];
		//String titleIsAdult = columnValues[4];
		
		// If start year is \N, make it a 0
		int titleStartYear = 0;
		try {
			titleStartYear = Integer.parseInt(columnValues[5]);
		} catch (NumberFormatException e) {
			// do nothing
		}
		int titleEndYear = 0;
		try {
			titleEndYear = Integer.parseInt(columnValues[6]);
		} catch (NumberFormatException e) {
			// do nothing
		}
		

		// If runtimeMinutes is \N, make it a 0
		int titleRuntimeMinutes = 0;
		try {
			titleRuntimeMinutes = Integer.parseInt(columnValues[7]);
		} catch (NumberFormatException e) {
			// do nothing
		}
		// String[] titleGenres = columnValues[8].split(",");
		
		
		TitleType titleType = TitleType.get(titleTypeString.toUpperCase());
		Title title;
		
		if (titleType == TitleType.TVSERIES) {
			TvSeries tvSeries = ImdbFactory.eINSTANCE.createTvSeries();
			tvSeries.setEndYear(titleEndYear);
			title = tvSeries;
		} else if (titleType == TitleType.TVEPISODE) {
			Episode episode = ImdbFactory.eINSTANCE.createEpisode();
			title = episode;
		} else {
			title = ImdbFactory.eINSTANCE.createTitle();
		}
		title.setImdb(imdb);
		title.setID(titleID);
		title.setTitleType(titleType); //null if not
		
		title.setName(titleName);
		title.setStartYear(titleStartYear);
		title.setRuntime(titleRuntimeMinutes);
		allTitleMap.put(titleID, title);
		
	}
	
	
	
	
	
	private static List<Title> pickRandomTitles(TitleType titleType, int number) {
		// Hash the titles by id for faster query
		// EList<T> has the same performance for search as List<T>
		// imdb.getTitles().forEach(title -> titleMap.put(title.getID(), title));

		// Hash titles
		List<Title> titles = imdb.getTitles().stream()
					.filter(title -> title.getTitleType() == titleType)
					.collect(Collectors.toList());
		
		// Randomise the list
		Collections.shuffle(titles);
		
		// Pick number of titles
		titles = titles.stream()
				.limit(number) // no need to check if the list is shorter than 500
				.collect(Collectors.toList());
		
		// Update the titleMap
		titles.forEach(title -> pickedTitleMap.put(title.getID(), title));
		
		return titles;
	}
	
	
	public static void deserializePersons() {
		String filename = "src/imdb/dataset/persons.tsv";
		// Open file
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
			br.readLine(); //skip first line
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
					.map(titleID -> pickedTitleMap.get(titleID))	// get Title by id
					.filter(title -> title != null) 		// remove null titles
					.collect(Collectors.toList());			// construct the list
		
		
		person.setID(ID);
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
		
		String titleID = columnValues[0];
		// Stop deserialization when the titleID is not in titleMap
		if (pickedTitleMap.get(titleID) == null) return;
		
		
		Rating rating = ImdbFactory.eINSTANCE.createRating();
		
		float averageRating = Float.parseFloat(columnValues[1]);
		int numVotes = Integer.parseInt(columnValues[2]);
		
		rating.setTitle(pickedTitleMap.get(titleID));
		rating.setAverageRating(averageRating);
		rating.setNumberOfVotes(numVotes);
		
	}
	
	public static void deserializeInvolvements(){
		String filename = "src/imdb/dataset/involvements.tsv";
		// Open file
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    // skip the first line, it contains the column headers
			br.readLine();
			for(String line; (line = br.readLine()) != null; ) {
		    	deserializeInvolvement(line);
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializeInvolvement(String line){
		// Split string by delimiter tab
		String[] columnValues = line.split("\\t");

		String titleID = columnValues[0];
		// Stop deserialization when the titleID is not in titleMap
		if (pickedTitleMap.get(titleID) == null) return;
		
		String personID = columnValues[2];
		// Stop deserialization when the personID is not in personMap
		if (personMap.get(personID) == null) return;
		
		String category = columnValues[3];
		String job = columnValues[4];
		String charactersString = columnValues[5];
		// character is stored as "[""name 1"",""name 2 something""]"  That is for when a name itself contain comma such as "Superintendant, Department Store
		String[] characters;
		if (charactersString.equals("\\N")){
			characters = null;
			createInvolvement(titleID, personID, category, job, null);
		} else {
			characters = charactersString.substring(4,charactersString.length()-4).split("\"\",\"\"");
			for(String character: characters) {
				createInvolvement(titleID, personID, category, job, character);
			}
		}
	}
	
	private static void createInvolvement(String titleID, String personID, String category, String job, String character) {
		Involvement involvement = ImdbFactory.eINSTANCE.createInvolvement();
		involvement.setTitle(pickedTitleMap.get(titleID)); // both ways
		involvement.setPerson(personMap.get(personID));
		involvement.setJob(category);
		involvement.setCharacter(character);
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
