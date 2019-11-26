package imdb.dataset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import imdb.Imdb;
import imdb.ImdbFactory;
import imdb.ImdbPackage;
import imdb.Title;
import imdb.TitleType;

public class DatasetDeserializer {
	
	
	public static final String outputXmiFilePath = "output.xmi";
	private static Imdb imdb;
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		DatasetDeserializer.deserialize();

		System.out.println("Hello Overworld");
		
	}
	
	
	public static void deserialize() {
		// get instantiated EPackage
		// imdbPackage can be found in ImdbPackage.eINSTANCE;

		// get instantiated EFactory
		// imdbFactory can be found in ImdbFactory.eINSTANCE;
		
		// Create Imdb class. Saved in ImdbPackage
		imdb = ImdbFactory.eINSTANCE.createImdb();
		
		
		deserializeSubsetBasics();
	}
	
	
	// Create all titles from file
	public static void deserializeSubsetBasics(){
		String filename = "src/imdb/dataset/subsetbasics.tsv";
		System.out.println(System.getProperty("user.dir"));
		// Open file
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    for(String line; (line = br.readLine()) != null; ) {
		    	System.out.print(1);
		    	deserializeSubsetBasicsLine(line);
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializeSubsetBasicsLine(String line){
		// Split string by delimitter tab
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
		
		title.setTitleType(TitleType.get(titleType.toUpperCase()));
		
		title.setName(titleName);
		title.setStartYear(titleStartYear);
		title.setRuntime(titleRuntimeMinutes);
		
		
	}
	

	public static void deserializeSubsetName(){
		String filename = "subsetname.tsv";
		
	}

	public static void deserializeSubsetRating(){
		String filename = "subsetrating.tsv";
		
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
	
	
	public static void serializeToXMI(String file) {
		ResourceSet resourceSet = new ResourceSetImpl();
		/*
		* Register XML Factory implementation using DEFAULT_EXTENSION
		*/
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    "*", new  XMLResourceFactoryImpl());
		 
		/*
		* Create empty resource with the given URI
		*/
		Resource resource = resourceSet.createResource(URI.createURI("./bookStore.xml"));
		 
		/*
		* Add instances to contents list of the resource 
		*/
		//resource.getContents().add();
		 
		try{
		    /*
		    * Save the resource
		    */
		      resource.save(null);
		   }catch (IOException e) {
		      e.printStackTrace();
		   }
	}
	
	
	
	
	

}
