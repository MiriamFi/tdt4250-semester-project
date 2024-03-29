/**
 */
package imdb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see imdb.ImdbFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface ImdbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imdb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://no/ntnu/tdt4250/imdb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "no.ntnu.tdt4250.imdb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImdbPackage eINSTANCE = imdb.impl.ImdbPackageImpl.init();

	/**
	 * The meta object id for the '{@link imdb.impl.ImdbImpl <em>Imdb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.ImdbImpl
	 * @see imdb.impl.ImdbPackageImpl#getImdb()
	 * @generated
	 */
	int IMDB = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMDB__TITLES = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMDB__PERSONS = 1;

	/**
	 * The feature id for the '<em><b>Genres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMDB__GENRES = 2;

	/**
	 * The number of structural features of the '<em>Imdb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMDB_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Imdb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMDB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imdb.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.TitleImpl
	 * @see imdb.impl.ImdbPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__REGION = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Title Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TITLE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__START_YEAR = 4;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__RUNTIME = 5;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__RATING = 6;

	/**
	 * The feature id for the '<em><b>Involvements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__INVOLVEMENTS = 7;

	/**
	 * The feature id for the '<em><b>Imdb</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__IMDB = 8;

	/**
	 * The feature id for the '<em><b>Genres</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__GENRES = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__ID = 10;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Is Filtered By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE___IS_FILTERED_BY__STRING_BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Set Genres</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE___SET_GENRES__ELIST = 1;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link imdb.impl.TvSeriesImpl <em>Tv Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.TvSeriesImpl
	 * @see imdb.impl.ImdbPackageImpl#getTvSeries()
	 * @generated
	 */
	int TV_SERIES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__NAME = TITLE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__REGION = TITLE__REGION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__LANGUAGE = TITLE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Title Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__TITLE_TYPE = TITLE__TITLE_TYPE;

	/**
	 * The feature id for the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__START_YEAR = TITLE__START_YEAR;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__RUNTIME = TITLE__RUNTIME;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__RATING = TITLE__RATING;

	/**
	 * The feature id for the '<em><b>Involvements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__INVOLVEMENTS = TITLE__INVOLVEMENTS;

	/**
	 * The feature id for the '<em><b>Imdb</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__IMDB = TITLE__IMDB;

	/**
	 * The feature id for the '<em><b>Genres</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__GENRES = TITLE__GENRES;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__ID = TITLE__ID;

	/**
	 * The feature id for the '<em><b>End Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__END_YEAR = TITLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Episodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES__EPISODES = TITLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tv Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES_FEATURE_COUNT = TITLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Filtered By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES___IS_FILTERED_BY__STRING_BOOLEAN = TITLE___IS_FILTERED_BY__STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Set Genres</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES___SET_GENRES__ELIST = TITLE___SET_GENRES__ELIST;

	/**
	 * The number of operations of the '<em>Tv Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TV_SERIES_OPERATION_COUNT = TITLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imdb.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.PersonImpl
	 * @see imdb.impl.ImdbPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 6;

	/**
	 * The meta object id for the '{@link imdb.impl.EpisodeImpl <em>Episode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.EpisodeImpl
	 * @see imdb.impl.ImdbPackageImpl#getEpisode()
	 * @generated
	 */
	int EPISODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__NAME = TITLE__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__REGION = TITLE__REGION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__LANGUAGE = TITLE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Title Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__TITLE_TYPE = TITLE__TITLE_TYPE;

	/**
	 * The feature id for the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__START_YEAR = TITLE__START_YEAR;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__RUNTIME = TITLE__RUNTIME;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__RATING = TITLE__RATING;

	/**
	 * The feature id for the '<em><b>Involvements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__INVOLVEMENTS = TITLE__INVOLVEMENTS;

	/**
	 * The feature id for the '<em><b>Imdb</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__IMDB = TITLE__IMDB;

	/**
	 * The feature id for the '<em><b>Genres</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__GENRES = TITLE__GENRES;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__ID = TITLE__ID;

	/**
	 * The feature id for the '<em><b>Series</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__SERIES = TITLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Season Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__SEASON_NUMBER = TITLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Episode Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__EPISODE_NUMBER = TITLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Episode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_FEATURE_COUNT = TITLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Filtered By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE___IS_FILTERED_BY__STRING_BOOLEAN = TITLE___IS_FILTERED_BY__STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Set Genres</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE___SET_GENRES__ELIST = TITLE___SET_GENRES__ELIST;

	/**
	 * The number of operations of the '<em>Episode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OPERATION_COUNT = TITLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imdb.impl.GenreImpl <em>Genre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.GenreImpl
	 * @see imdb.impl.ImdbPackageImpl#getGenre()
	 * @generated
	 */
	int GENRE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Imdb</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE__IMDB = 1;

	/**
	 * The number of structural features of the '<em>Genre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Genre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imdb.impl.RatingImpl <em>Rating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.RatingImpl
	 * @see imdb.impl.ImdbPackageImpl#getRating()
	 * @generated
	 */
	int RATING = 5;

	/**
	 * The feature id for the '<em><b>Average Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__AVERAGE_RATING = 0;

	/**
	 * The feature id for the '<em><b>Number Of Votes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__NUMBER_OF_VOTES = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__TITLE = 2;

	/**
	 * The number of structural features of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Birth Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_YEAR = 1;

	/**
	 * The feature id for the '<em><b>Death Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEATH_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Professions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PROFESSIONS = 3;

	/**
	 * The feature id for the '<em><b>Known For Titles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__KNOWN_FOR_TITLES = 4;

	/**
	 * The feature id for the '<em><b>Involvements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__INVOLVEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Imdb</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IMDB = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = 7;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Is Filtered By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___IS_FILTERED_BY__STRING_BOOLEAN = 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link imdb.impl.InvolvementImpl <em>Involvement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.InvolvementImpl
	 * @see imdb.impl.ImdbPackageImpl#getInvolvement()
	 * @generated
	 */
	int INVOLVEMENT = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEMENT__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEMENT__JOB = 2;

	/**
	 * The feature id for the '<em><b>Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEMENT__CHARACTER = 3;

	/**
	 * The number of structural features of the '<em>Involvement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Involvement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imdb.impl.TitleTypeWrapperImpl <em>Title Type Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.TitleTypeWrapperImpl
	 * @see imdb.impl.ImdbPackageImpl#getTitleTypeWrapper()
	 * @generated
	 */
	int TITLE_TYPE_WRAPPER = 8;

	/**
	 * The feature id for the '<em><b>Title Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_WRAPPER__TITLE_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Title Type Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_WRAPPER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_WRAPPER___EQUALS__OBJECT = 0;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_WRAPPER___HASH_CODE = 1;

	/**
	 * The number of operations of the '<em>Title Type Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_WRAPPER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link imdb.TitleType <em>Title Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.TitleType
	 * @see imdb.impl.ImdbPackageImpl#getTitleType()
	 * @generated
	 */
	int TITLE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link imdb.Imdb <em>Imdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imdb</em>'.
	 * @see imdb.Imdb
	 * @generated
	 */
	EClass getImdb();

	/**
	 * Returns the meta object for the containment reference list '{@link imdb.Imdb#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Titles</em>'.
	 * @see imdb.Imdb#getTitles()
	 * @see #getImdb()
	 * @generated
	 */
	EReference getImdb_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link imdb.Imdb#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see imdb.Imdb#getPersons()
	 * @see #getImdb()
	 * @generated
	 */
	EReference getImdb_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link imdb.Imdb#getGenres <em>Genres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Genres</em>'.
	 * @see imdb.Imdb#getGenres()
	 * @see #getImdb()
	 * @generated
	 */
	EReference getImdb_Genres();

	/**
	 * Returns the meta object for class '{@link imdb.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see imdb.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Title#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see imdb.Title#getName()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Name();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Title#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see imdb.Title#getRegion()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Region();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Title#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see imdb.Title#getLanguage()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Language();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Title#getTitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Type</em>'.
	 * @see imdb.Title#getTitleType()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_TitleType();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Title#getStartYear <em>Start Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Year</em>'.
	 * @see imdb.Title#getStartYear()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_StartYear();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Title#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see imdb.Title#getRuntime()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Runtime();

	/**
	 * Returns the meta object for the containment reference '{@link imdb.Title#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rating</em>'.
	 * @see imdb.Title#getRating()
	 * @see #getTitle()
	 * @generated
	 */
	EReference getTitle_Rating();

	/**
	 * Returns the meta object for the containment reference list '{@link imdb.Title#getInvolvements <em>Involvements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Involvements</em>'.
	 * @see imdb.Title#getInvolvements()
	 * @see #getTitle()
	 * @generated
	 */
	EReference getTitle_Involvements();

	/**
	 * Returns the meta object for the container reference '{@link imdb.Title#getImdb <em>Imdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Imdb</em>'.
	 * @see imdb.Title#getImdb()
	 * @see #getTitle()
	 * @generated
	 */
	EReference getTitle_Imdb();

	/**
	 * Returns the meta object for the reference list '{@link imdb.Title#getGenres <em>Genres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Genres</em>'.
	 * @see imdb.Title#getGenres()
	 * @see #getTitle()
	 * @generated
	 */
	EReference getTitle_Genres();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Title#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see imdb.Title#getID()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_ID();

	/**
	 * Returns the meta object for the '{@link imdb.Title#isFilteredBy(java.lang.String, boolean) <em>Is Filtered By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Filtered By</em>' operation.
	 * @see imdb.Title#isFilteredBy(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getTitle__IsFilteredBy__String_boolean();

	/**
	 * Returns the meta object for the '{@link imdb.Title#setGenres(org.eclipse.emf.common.util.EList) <em>Set Genres</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Genres</em>' operation.
	 * @see imdb.Title#setGenres(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getTitle__SetGenres__EList();

	/**
	 * Returns the meta object for class '{@link imdb.TvSeries <em>Tv Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tv Series</em>'.
	 * @see imdb.TvSeries
	 * @generated
	 */
	EClass getTvSeries();

	/**
	 * Returns the meta object for the attribute '{@link imdb.TvSeries#getEndYear <em>End Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Year</em>'.
	 * @see imdb.TvSeries#getEndYear()
	 * @see #getTvSeries()
	 * @generated
	 */
	EAttribute getTvSeries_EndYear();

	/**
	 * Returns the meta object for the containment reference list '{@link imdb.TvSeries#getEpisodes <em>Episodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Episodes</em>'.
	 * @see imdb.TvSeries#getEpisodes()
	 * @see #getTvSeries()
	 * @generated
	 */
	EReference getTvSeries_Episodes();

	/**
	 * Returns the meta object for class '{@link imdb.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see imdb.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see imdb.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Person#getBirthYear <em>Birth Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Year</em>'.
	 * @see imdb.Person#getBirthYear()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthYear();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Person#getDeathYear <em>Death Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Death Year</em>'.
	 * @see imdb.Person#getDeathYear()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DeathYear();

	/**
	 * Returns the meta object for the attribute list '{@link imdb.Person#getProfessions <em>Professions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Professions</em>'.
	 * @see imdb.Person#getProfessions()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Professions();

	/**
	 * Returns the meta object for the reference list '{@link imdb.Person#getKnownForTitles <em>Known For Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Known For Titles</em>'.
	 * @see imdb.Person#getKnownForTitles()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_KnownForTitles();

	/**
	 * Returns the meta object for the reference list '{@link imdb.Person#getInvolvements <em>Involvements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involvements</em>'.
	 * @see imdb.Person#getInvolvements()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Involvements();

	/**
	 * Returns the meta object for the container reference '{@link imdb.Person#getImdb <em>Imdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Imdb</em>'.
	 * @see imdb.Person#getImdb()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Imdb();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Person#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see imdb.Person#getID()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ID();

	/**
	 * Returns the meta object for the '{@link imdb.Person#isFilteredBy(java.lang.String, boolean) <em>Is Filtered By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Filtered By</em>' operation.
	 * @see imdb.Person#isFilteredBy(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getPerson__IsFilteredBy__String_boolean();

	/**
	 * Returns the meta object for class '{@link imdb.Episode <em>Episode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Episode</em>'.
	 * @see imdb.Episode
	 * @generated
	 */
	EClass getEpisode();

	/**
	 * Returns the meta object for the container reference '{@link imdb.Episode#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Series</em>'.
	 * @see imdb.Episode#getSeries()
	 * @see #getEpisode()
	 * @generated
	 */
	EReference getEpisode_Series();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Episode#getSeasonNumber <em>Season Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Season Number</em>'.
	 * @see imdb.Episode#getSeasonNumber()
	 * @see #getEpisode()
	 * @generated
	 */
	EAttribute getEpisode_SeasonNumber();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Episode#getEpisodeNumber <em>Episode Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Episode Number</em>'.
	 * @see imdb.Episode#getEpisodeNumber()
	 * @see #getEpisode()
	 * @generated
	 */
	EAttribute getEpisode_EpisodeNumber();

	/**
	 * Returns the meta object for class '{@link imdb.Genre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genre</em>'.
	 * @see imdb.Genre
	 * @generated
	 */
	EClass getGenre();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Genre#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see imdb.Genre#getName()
	 * @see #getGenre()
	 * @generated
	 */
	EAttribute getGenre_Name();

	/**
	 * Returns the meta object for the container reference '{@link imdb.Genre#getImdb <em>Imdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Imdb</em>'.
	 * @see imdb.Genre#getImdb()
	 * @see #getGenre()
	 * @generated
	 */
	EReference getGenre_Imdb();

	/**
	 * Returns the meta object for class '{@link imdb.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating</em>'.
	 * @see imdb.Rating
	 * @generated
	 */
	EClass getRating();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Rating#getAverageRating <em>Average Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Rating</em>'.
	 * @see imdb.Rating#getAverageRating()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_AverageRating();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Rating#getNumberOfVotes <em>Number Of Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Votes</em>'.
	 * @see imdb.Rating#getNumberOfVotes()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_NumberOfVotes();

	/**
	 * Returns the meta object for the container reference '{@link imdb.Rating#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Title</em>'.
	 * @see imdb.Rating#getTitle()
	 * @see #getRating()
	 * @generated
	 */
	EReference getRating_Title();

	/**
	 * Returns the meta object for class '{@link imdb.Involvement <em>Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Involvement</em>'.
	 * @see imdb.Involvement
	 * @generated
	 */
	EClass getInvolvement();

	/**
	 * Returns the meta object for the container reference '{@link imdb.Involvement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Title</em>'.
	 * @see imdb.Involvement#getTitle()
	 * @see #getInvolvement()
	 * @generated
	 */
	EReference getInvolvement_Title();

	/**
	 * Returns the meta object for the reference '{@link imdb.Involvement#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see imdb.Involvement#getPerson()
	 * @see #getInvolvement()
	 * @generated
	 */
	EReference getInvolvement_Person();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Involvement#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job</em>'.
	 * @see imdb.Involvement#getJob()
	 * @see #getInvolvement()
	 * @generated
	 */
	EAttribute getInvolvement_Job();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Involvement#getCharacter <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character</em>'.
	 * @see imdb.Involvement#getCharacter()
	 * @see #getInvolvement()
	 * @generated
	 */
	EAttribute getInvolvement_Character();

	/**
	 * Returns the meta object for class '{@link imdb.TitleTypeWrapper <em>Title Type Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Type Wrapper</em>'.
	 * @see imdb.TitleTypeWrapper
	 * @generated
	 */
	EClass getTitleTypeWrapper();

	/**
	 * Returns the meta object for the attribute '{@link imdb.TitleTypeWrapper#getTitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Type</em>'.
	 * @see imdb.TitleTypeWrapper#getTitleType()
	 * @see #getTitleTypeWrapper()
	 * @generated
	 */
	EAttribute getTitleTypeWrapper_TitleType();

	/**
	 * Returns the meta object for the '{@link imdb.TitleTypeWrapper#equals(java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see imdb.TitleTypeWrapper#equals(java.lang.Object)
	 * @generated
	 */
	EOperation getTitleTypeWrapper__Equals__Object();

	/**
	 * Returns the meta object for the '{@link imdb.TitleTypeWrapper#hashCode() <em>Hash Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Hash Code</em>' operation.
	 * @see imdb.TitleTypeWrapper#hashCode()
	 * @generated
	 */
	EOperation getTitleTypeWrapper__HashCode();

	/**
	 * Returns the meta object for enum '{@link imdb.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Title Type</em>'.
	 * @see imdb.TitleType
	 * @generated
	 */
	EEnum getTitleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImdbFactory getImdbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link imdb.impl.ImdbImpl <em>Imdb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.ImdbImpl
		 * @see imdb.impl.ImdbPackageImpl#getImdb()
		 * @generated
		 */
		EClass IMDB = eINSTANCE.getImdb();

		/**
		 * The meta object literal for the '<em><b>Titles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMDB__TITLES = eINSTANCE.getImdb_Titles();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMDB__PERSONS = eINSTANCE.getImdb_Persons();

		/**
		 * The meta object literal for the '<em><b>Genres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMDB__GENRES = eINSTANCE.getImdb_Genres();

		/**
		 * The meta object literal for the '{@link imdb.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.TitleImpl
		 * @see imdb.impl.ImdbPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__NAME = eINSTANCE.getTitle_Name();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__REGION = eINSTANCE.getTitle_Region();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__LANGUAGE = eINSTANCE.getTitle_Language();

		/**
		 * The meta object literal for the '<em><b>Title Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__TITLE_TYPE = eINSTANCE.getTitle_TitleType();

		/**
		 * The meta object literal for the '<em><b>Start Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__START_YEAR = eINSTANCE.getTitle_StartYear();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__RUNTIME = eINSTANCE.getTitle_Runtime();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__RATING = eINSTANCE.getTitle_Rating();

		/**
		 * The meta object literal for the '<em><b>Involvements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__INVOLVEMENTS = eINSTANCE.getTitle_Involvements();

		/**
		 * The meta object literal for the '<em><b>Imdb</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__IMDB = eINSTANCE.getTitle_Imdb();

		/**
		 * The meta object literal for the '<em><b>Genres</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__GENRES = eINSTANCE.getTitle_Genres();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__ID = eINSTANCE.getTitle_ID();

		/**
		 * The meta object literal for the '<em><b>Is Filtered By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TITLE___IS_FILTERED_BY__STRING_BOOLEAN = eINSTANCE.getTitle__IsFilteredBy__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Set Genres</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TITLE___SET_GENRES__ELIST = eINSTANCE.getTitle__SetGenres__EList();

		/**
		 * The meta object literal for the '{@link imdb.impl.TvSeriesImpl <em>Tv Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.TvSeriesImpl
		 * @see imdb.impl.ImdbPackageImpl#getTvSeries()
		 * @generated
		 */
		EClass TV_SERIES = eINSTANCE.getTvSeries();

		/**
		 * The meta object literal for the '<em><b>End Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TV_SERIES__END_YEAR = eINSTANCE.getTvSeries_EndYear();

		/**
		 * The meta object literal for the '<em><b>Episodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TV_SERIES__EPISODES = eINSTANCE.getTvSeries_Episodes();

		/**
		 * The meta object literal for the '{@link imdb.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.PersonImpl
		 * @see imdb.impl.ImdbPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Birth Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_YEAR = eINSTANCE.getPerson_BirthYear();

		/**
		 * The meta object literal for the '<em><b>Death Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DEATH_YEAR = eINSTANCE.getPerson_DeathYear();

		/**
		 * The meta object literal for the '<em><b>Professions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PROFESSIONS = eINSTANCE.getPerson_Professions();

		/**
		 * The meta object literal for the '<em><b>Known For Titles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__KNOWN_FOR_TITLES = eINSTANCE.getPerson_KnownForTitles();

		/**
		 * The meta object literal for the '<em><b>Involvements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__INVOLVEMENTS = eINSTANCE.getPerson_Involvements();

		/**
		 * The meta object literal for the '<em><b>Imdb</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__IMDB = eINSTANCE.getPerson_Imdb();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ID = eINSTANCE.getPerson_ID();

		/**
		 * The meta object literal for the '<em><b>Is Filtered By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___IS_FILTERED_BY__STRING_BOOLEAN = eINSTANCE.getPerson__IsFilteredBy__String_boolean();

		/**
		 * The meta object literal for the '{@link imdb.impl.EpisodeImpl <em>Episode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.EpisodeImpl
		 * @see imdb.impl.ImdbPackageImpl#getEpisode()
		 * @generated
		 */
		EClass EPISODE = eINSTANCE.getEpisode();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPISODE__SERIES = eINSTANCE.getEpisode_Series();

		/**
		 * The meta object literal for the '<em><b>Season Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODE__SEASON_NUMBER = eINSTANCE.getEpisode_SeasonNumber();

		/**
		 * The meta object literal for the '<em><b>Episode Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODE__EPISODE_NUMBER = eINSTANCE.getEpisode_EpisodeNumber();

		/**
		 * The meta object literal for the '{@link imdb.impl.GenreImpl <em>Genre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.GenreImpl
		 * @see imdb.impl.ImdbPackageImpl#getGenre()
		 * @generated
		 */
		EClass GENRE = eINSTANCE.getGenre();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENRE__NAME = eINSTANCE.getGenre_Name();

		/**
		 * The meta object literal for the '<em><b>Imdb</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENRE__IMDB = eINSTANCE.getGenre_Imdb();

		/**
		 * The meta object literal for the '{@link imdb.impl.RatingImpl <em>Rating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.RatingImpl
		 * @see imdb.impl.ImdbPackageImpl#getRating()
		 * @generated
		 */
		EClass RATING = eINSTANCE.getRating();

		/**
		 * The meta object literal for the '<em><b>Average Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__AVERAGE_RATING = eINSTANCE.getRating_AverageRating();

		/**
		 * The meta object literal for the '<em><b>Number Of Votes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__NUMBER_OF_VOTES = eINSTANCE.getRating_NumberOfVotes();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATING__TITLE = eINSTANCE.getRating_Title();

		/**
		 * The meta object literal for the '{@link imdb.impl.InvolvementImpl <em>Involvement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.InvolvementImpl
		 * @see imdb.impl.ImdbPackageImpl#getInvolvement()
		 * @generated
		 */
		EClass INVOLVEMENT = eINSTANCE.getInvolvement();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVEMENT__TITLE = eINSTANCE.getInvolvement_Title();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVEMENT__PERSON = eINSTANCE.getInvolvement_Person();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOLVEMENT__JOB = eINSTANCE.getInvolvement_Job();

		/**
		 * The meta object literal for the '<em><b>Character</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOLVEMENT__CHARACTER = eINSTANCE.getInvolvement_Character();

		/**
		 * The meta object literal for the '{@link imdb.impl.TitleTypeWrapperImpl <em>Title Type Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.TitleTypeWrapperImpl
		 * @see imdb.impl.ImdbPackageImpl#getTitleTypeWrapper()
		 * @generated
		 */
		EClass TITLE_TYPE_WRAPPER = eINSTANCE.getTitleTypeWrapper();

		/**
		 * The meta object literal for the '<em><b>Title Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE_WRAPPER__TITLE_TYPE = eINSTANCE.getTitleTypeWrapper_TitleType();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TITLE_TYPE_WRAPPER___EQUALS__OBJECT = eINSTANCE.getTitleTypeWrapper__Equals__Object();

		/**
		 * The meta object literal for the '<em><b>Hash Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TITLE_TYPE_WRAPPER___HASH_CODE = eINSTANCE.getTitleTypeWrapper__HashCode();

		/**
		 * The meta object literal for the '{@link imdb.TitleType <em>Title Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.TitleType
		 * @see imdb.impl.ImdbPackageImpl#getTitleType()
		 * @generated
		 */
		EEnum TITLE_TYPE = eINSTANCE.getTitleType();

	}

} //ImdbPackage
