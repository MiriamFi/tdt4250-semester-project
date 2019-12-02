package imdb.dataset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import imdb.Episode;
import imdb.Genre;
import imdb.Imdb;
import imdb.ImdbFactory;
import imdb.Involvement;
import imdb.Person;
import imdb.Rating;
import imdb.Title;
import imdb.TitleType;
import imdb.TvSeries;

public class DatasetDeserializer {
	public static final String DATASET_FOLDER_PATH = "src/imdb/dataset/";
	public static final String OUTPUT_XMI_FILE_PATH = DATASET_FOLDER_PATH + "Imdb.imdb";

	private static final String TAB_CHAR = "\\t";
	private static final String NO_VALUE_CHAR = "\\N";

	private static Imdb imdb;

	private static Map<String, Title> allTitlesMap = new HashMap<>();
	private static Map<String, Title> pickedTitlesMap = new HashMap<>();
	private static Map<String, Person> personMap = new HashMap<>();
	private static Map<String, Genre> genreMap = new HashMap<>();

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
		serializeToXMI(OUTPUT_XMI_FILE_PATH);
		System.out.println("Saved to " + OUTPUT_XMI_FILE_PATH);
	}

	public static void deserialize() {
		deserializeTitles();
		System.out.println("Done deserializing all titles");

		// Pick tv series first !important
		int targetTvSeriesAtLeastCount = 10;
		while (pickedTitlesMap.size() < targetTvSeriesAtLeastCount) {
			pickRandomTitles(TitleType.TVSERIES, 10);
			System.out.println("Picked tvseries");

			deserializeEpisodesDetails();
			System.out.println("Done deserializing episodes by picked titles");

			// Assume all picked titles are tv series
			// Remove all series without episodes
			List<Title> seriesWithoutEpisodes = pickedTitlesMap.values().stream()
					.filter(title -> ((TvSeries) title).getEpisodes().isEmpty())
					.collect(Collectors.toList());
			seriesWithoutEpisodes.forEach(series -> pickedTitlesMap.remove(series.getID()));
		}

		pickRandomTitles(TitleType.MOVIE, 5);
		pickRandomTitles(TitleType.SHORT, 5);
		pickRandomTitles(TitleType.VIDEO, 5);

		// Append to ecore model
		imdb.getTitles().clear();
		imdb.getTitles().addAll(pickedTitlesMap.values());


		deserializeRatings();
		System.out.println("Done getting corresponding ratings");

		deserializePersons();
		System.out.println("Done deserializing all persons");
		hashPersons();
		System.out.println("Hashed all persons");

		deserializeInvolvements();
		System.out.println("Done deserialize all involvements");


		// remove all persons not connected to titles or
		// involvements that are connected to a titles
		Map<String, Person> smallerPersonMap = new HashMap<String, Person>();

		// For each parsed title, get all persons connected with involvements
		for (Title title : pickedTitlesMap.values()) {
			for (Involvement involvement : title.getInvolvements()) {
				smallerPersonMap.put(involvement.getPerson().getID(), involvement.getPerson());
			}
		}

		// Get each person that is connected to a title in titleMap through knownForTitles
		imdb.getPersons().forEach(person -> {
			for (Title title : person.getKnownForTitles()) {
				if (pickedTitlesMap.containsValue(title))
					smallerPersonMap.put(person.getID(), person);
			}
		});

		// Update ecore model
		imdb.getPersons().clear();
		imdb.getPersons().addAll(smallerPersonMap.values());

		System.out.println("Removed all disconnected persons");
	}

	public static void deserializeEpisodesDetails() {
		String filename = "src/imdb/dataset/episodesDetails.tsv";
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			br.readLine(); // skip the first line, as it contains the column headers
			int i = 0;
			for (String line; (line = br.readLine()) != null; ) {
				deserializeEpisodeDetails(line);

				if (++i % 100_000 == 0)
					System.out.println(i + " episodes deserialized");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializeEpisodeDetails(String line) {
		// Split string by delimiter tab
		String[] columnValues = line.split(TAB_CHAR);

		String episodeID = columnValues[0];
		String parentTitleID = columnValues[1];

		// There are episodes that are connected to Movies
		// We will filter them away
		Title parentTitle = pickedTitlesMap.get(parentTitleID);
		if (parentTitle == null || parentTitle.getTitleType() != TitleType.TVSERIES)
			return;

		TvSeries series = (TvSeries) parentTitle;
		Episode episode = (Episode) allTitlesMap.get(episodeID);
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

		//pickedTitlesMap.put(episodeID, episode);
	}

	public static void deserializeTitles() {
		String filename = "src/imdb/dataset/titles.tsv";
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			br.readLine(); // skip the first line, as it contains the column headers
			int i = 0;
			for (String line; (line = br.readLine()) != null; ) {
				deserializeEachTitle(line);

				if (++i % 100_000 == 0)
					System.out.println(i + " titles deserialized");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializeEachTitle(String line) {
		// Split string by delimiter tab
		String[] columnValues = line.split(TAB_CHAR);

		String titleID = columnValues[0];
		String titleTypeString = columnValues[1];
		String titleName = columnValues[2];
		// String titleIsAdult = columnValues[4];

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

		String[] genreStrings = columnValues[8].split(",");
		// If genres is \N, make it an empty array
		if (genreStrings.length == 1 && genreStrings[0].equals(NO_VALUE_CHAR))
			genreStrings = new String[0];


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
		title.setTitleType(titleType); // null if not

		title.setName(titleName);
		title.setStartYear(titleStartYear);
		title.setRuntime(titleRuntimeMinutes);

		EList<Genre> titleGenres = title.getGenres(); // genres is null, so will return a new empty list
		for (String genreString : genreStrings) {
			Genre genre = genreMap.get(genreString);
			if (genre == null) {
				genre = ImdbFactory.eINSTANCE.createGenre();
				genre.setName(genreString);
				genre.setImdb(imdb);
				genreMap.put(genreString, genre);
			}
			titleGenres.add(genre);
		}

		allTitlesMap.put(titleID, title);
	}

	private static List<Title> pickRandomTitles(TitleType titleType, int number) {
		// Hash the titles by id for faster query
		// EList<T> has the same performance for search as List<T>
		//imdb.getTitles().forEach(title -> titleMap.put(title.getID(), title));

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
		titles.forEach(title -> pickedTitlesMap.put(title.getID(), title));

		return titles;
	}

	public static void deserializePersons() {
		String filename = "src/imdb/dataset/persons.tsv";
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			br.readLine(); // skip the first line, as it contains the column headers
			int i = 0;
			for (String line; (line = br.readLine()) != null; ) {
				deserializePerson(line);

				if (++i % 100_000 == 0)
					System.out.println(i + " persons deserialized");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializePerson(String line) {
		// Split string by delimiter tab
		String[] columnValues = line.split(TAB_CHAR);
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
				.map(titleID -> pickedTitlesMap.get(titleID)) // get Title by id
				.filter(title -> title != null) // remove null titles
				.collect(Collectors.toList()); // construct the list


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

	public static void deserializeRatings() {
		String filename = "src/imdb/dataset/ratings.tsv";
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			br.readLine(); // skip the first line, as it contains the column headers
			int i = 0;
			for (String line; (line = br.readLine()) != null; ) {
				deserializeEachRating(line);

				if (++i % 100_000 == 0)
					System.out.println(i + " ratings deserialized");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializeEachRating(String line) {
		// Split string by delimiter tab
		String[] columnValues = line.split(TAB_CHAR);

		String titleID = columnValues[0];
		// Stop deserialization when the titleID is not in titleMap
		if (pickedTitlesMap.get(titleID) == null)
			return;

		Rating rating = ImdbFactory.eINSTANCE.createRating();

		float averageRating = Float.parseFloat(columnValues[1]);
		int numVotes = Integer.parseInt(columnValues[2]);

		rating.setTitle(pickedTitlesMap.get(titleID));
		rating.setAverageRating(averageRating);
		rating.setNumberOfVotes(numVotes);
	}

	public static void deserializeInvolvements() {
		String filename = "src/imdb/dataset/involvements.tsv";
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			br.readLine(); // skip the first line, as it contains the column headers
			int i = 0;
			for (String line; (line = br.readLine()) != null; ) {
				deserializeInvolvement(line);

				if (++i % 100_000 == 0)
					System.out.println(i + " involvements deserialized");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserializeInvolvement(String line) {
		// Split string by delimiter tab
		String[] columnValues = line.split(TAB_CHAR);

		String titleID = columnValues[0];
		// Stop deserialization when the titleID is not in titleMap
		if (pickedTitlesMap.get(titleID) == null)
			return;

		String personID = columnValues[2];
		// Stop deserialization when the personID is not in personMap
		if (personMap.get(personID) == null)
			return;

		String category = columnValues[3];
		String job = columnValues[4];
		String charactersString = columnValues[5];
		// character is stored as "[""name 1"",""name 2 something""]"
		// That is for when a name itself contains commas, such as "Superintendent, Department Store"
		String[] characters;
		if (charactersString.equals(NO_VALUE_CHAR)) {
			characters = null;
			createInvolvement(titleID, personID, category, job, null);
		} else {
			characters = charactersString.substring(4, charactersString.length() - 4).split("\"\",\"\"");
			for (String character : characters) {
				createInvolvement(titleID, personID, category, job, character);
			}
		}
	}

	private static void createInvolvement(String titleID, String personID, String category, String job, String character) {
		Involvement involvement = ImdbFactory.eINSTANCE.createInvolvement();
		involvement.setTitle(pickedTitlesMap.get(titleID)); // both ways
		involvement.setPerson(personMap.get(personID));
		involvement.setJob(category);
		involvement.setCharacter(character);
	}

	public static void serializeToXMI(String filepath) {
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register XML Factory implementation using DEFAULT_EXTENSION

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMLResourceFactoryImpl());

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
