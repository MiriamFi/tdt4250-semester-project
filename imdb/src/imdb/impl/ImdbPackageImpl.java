/**
 */
package imdb.impl;

import imdb.Episode;
import imdb.Imdb;
import imdb.ImdbFactory;
import imdb.ImdbPackage;
import imdb.Involvement;
import imdb.Person;
import imdb.Rating;
import imdb.Title;
import imdb.TitleType;
import imdb.TitleTypeWrapper;
import imdb.TvSeries;
import imdb.util.ImdbValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImdbPackageImpl extends EPackageImpl implements ImdbPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imdbEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tvSeriesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratingEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass involvementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleTypeWrapperEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum titleTypeEEnum = null;
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see imdb.ImdbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImdbPackageImpl() {
		super(eNS_URI, ImdbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ImdbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImdbPackage init() {
		if (isInited) return (ImdbPackage)EPackage.Registry.INSTANCE.getEPackage(ImdbPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredImdbPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ImdbPackageImpl theImdbPackage = registeredImdbPackage instanceof ImdbPackageImpl ? (ImdbPackageImpl)registeredImdbPackage : new ImdbPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theImdbPackage.createPackageContents();

		// Initialize created meta-data
		theImdbPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theImdbPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return ImdbValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theImdbPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImdbPackage.eNS_URI, theImdbPackage);
		return theImdbPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImdb() {
		return imdbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImdb_Titles() {
		return (EReference)imdbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImdb_Persons() {
		return (EReference)imdbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTitle() {
		return titleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitle_Name() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitle_Region() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitle_Language() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitle_TitleType() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitle_StartYear() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitle_Runtime() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitle_Rating() {
		return (EReference)titleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitle_Involvements() {
		return (EReference)titleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitle_Imdb() {
		return (EReference)titleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitle_Genre() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitle_ID() {
		return (EAttribute)titleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTvSeries() {
		return tvSeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTvSeries_EndYear() {
		return (EAttribute)tvSeriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTvSeries_Episodes() {
		return (EReference)tvSeriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_BirthYear() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_DeathYear() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Professions() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_KnownForTitles() {
		return (EReference)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Involvement() {
		return (EReference)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_Imdb() {
		return (EReference)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_ID() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEpisode() {
		return episodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEpisode_Series() {
		return (EReference)episodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEpisode_SeasonNumber() {
		return (EAttribute)episodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEpisode_EpisodeNumber() {
		return (EAttribute)episodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRating() {
		return ratingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRating_AverageRating() {
		return (EAttribute)ratingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRating_NumberOfVotes() {
		return (EAttribute)ratingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRating_Title() {
		return (EReference)ratingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvolvement() {
		return involvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvolvement_Title() {
		return (EReference)involvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvolvement_Person() {
		return (EReference)involvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvolvement_Job() {
		return (EAttribute)involvementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvolvement_Character() {
		return (EAttribute)involvementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTitleTypeWrapper() {
		return titleTypeWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitleTypeWrapper_TitleType() {
		return (EAttribute)titleTypeWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTitleTypeWrapper__Equals__Object() {
		return titleTypeWrapperEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTitleTypeWrapper__HashCode() {
		return titleTypeWrapperEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTitleType() {
		return titleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImdbFactory getImdbFactory() {
		return (ImdbFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		imdbEClass = createEClass(IMDB);
		createEReference(imdbEClass, IMDB__TITLES);
		createEReference(imdbEClass, IMDB__PERSONS);

		titleEClass = createEClass(TITLE);
		createEAttribute(titleEClass, TITLE__NAME);
		createEAttribute(titleEClass, TITLE__REGION);
		createEAttribute(titleEClass, TITLE__LANGUAGE);
		createEAttribute(titleEClass, TITLE__TITLE_TYPE);
		createEAttribute(titleEClass, TITLE__START_YEAR);
		createEAttribute(titleEClass, TITLE__RUNTIME);
		createEReference(titleEClass, TITLE__RATING);
		createEReference(titleEClass, TITLE__INVOLVEMENTS);
		createEReference(titleEClass, TITLE__IMDB);
		createEAttribute(titleEClass, TITLE__GENRE);
		createEAttribute(titleEClass, TITLE__ID);

		tvSeriesEClass = createEClass(TV_SERIES);
		createEAttribute(tvSeriesEClass, TV_SERIES__END_YEAR);
		createEReference(tvSeriesEClass, TV_SERIES__EPISODES);

		episodeEClass = createEClass(EPISODE);
		createEReference(episodeEClass, EPISODE__SERIES);
		createEAttribute(episodeEClass, EPISODE__SEASON_NUMBER);
		createEAttribute(episodeEClass, EPISODE__EPISODE_NUMBER);

		ratingEClass = createEClass(RATING);
		createEAttribute(ratingEClass, RATING__AVERAGE_RATING);
		createEAttribute(ratingEClass, RATING__NUMBER_OF_VOTES);
		createEReference(ratingEClass, RATING__TITLE);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__BIRTH_YEAR);
		createEAttribute(personEClass, PERSON__DEATH_YEAR);
		createEAttribute(personEClass, PERSON__PROFESSIONS);
		createEReference(personEClass, PERSON__KNOWN_FOR_TITLES);
		createEReference(personEClass, PERSON__INVOLVEMENT);
		createEReference(personEClass, PERSON__IMDB);
		createEAttribute(personEClass, PERSON__ID);

		involvementEClass = createEClass(INVOLVEMENT);
		createEReference(involvementEClass, INVOLVEMENT__TITLE);
		createEReference(involvementEClass, INVOLVEMENT__PERSON);
		createEAttribute(involvementEClass, INVOLVEMENT__JOB);
		createEAttribute(involvementEClass, INVOLVEMENT__CHARACTER);

		titleTypeWrapperEClass = createEClass(TITLE_TYPE_WRAPPER);
		createEAttribute(titleTypeWrapperEClass, TITLE_TYPE_WRAPPER__TITLE_TYPE);
		createEOperation(titleTypeWrapperEClass, TITLE_TYPE_WRAPPER___EQUALS__OBJECT);
		createEOperation(titleTypeWrapperEClass, TITLE_TYPE_WRAPPER___HASH_CODE);

		// Create enums
		titleTypeEEnum = createEEnum(TITLE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tvSeriesEClass.getESuperTypes().add(this.getTitle());
		episodeEClass.getESuperTypes().add(this.getTitle());

		// Initialize classes, features, and operations; add parameters
		initEClass(imdbEClass, Imdb.class, "Imdb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImdb_Titles(), this.getTitle(), this.getTitle_Imdb(), "titles", null, 0, -1, Imdb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImdb_Persons(), this.getPerson(), this.getPerson_Imdb(), "persons", null, 0, -1, Imdb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titleEClass, Title.class, "Title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitle_Name(), ecorePackage.getEString(), "name", null, 1, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitle_Region(), ecorePackage.getEString(), "region", null, 0, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitle_Language(), ecorePackage.getEString(), "language", null, 0, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitle_TitleType(), this.getTitleType(), "titleType", null, 1, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitle_StartYear(), ecorePackage.getEInt(), "startYear", null, 0, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitle_Runtime(), ecorePackage.getEInt(), "runtime", null, 0, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTitle_Rating(), this.getRating(), this.getRating_Title(), "rating", null, 0, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTitle_Involvements(), this.getInvolvement(), this.getInvolvement_Title(), "involvements", null, 0, -1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTitle_Imdb(), this.getImdb(), this.getImdb_Titles(), "imdb", null, 0, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitle_Genre(), ecorePackage.getEString(), "genre", null, 0, -1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitle_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tvSeriesEClass, TvSeries.class, "TvSeries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTvSeries_EndYear(), ecorePackage.getEInt(), "endYear", "-1", 0, 1, TvSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTvSeries_Episodes(), this.getEpisode(), this.getEpisode_Series(), "episodes", null, 0, -1, TvSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(episodeEClass, Episode.class, "Episode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEpisode_Series(), this.getTvSeries(), this.getTvSeries_Episodes(), "series", null, 1, 1, Episode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpisode_SeasonNumber(), ecorePackage.getEInt(), "seasonNumber", null, 1, 1, Episode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpisode_EpisodeNumber(), ecorePackage.getEInt(), "episodeNumber", null, 1, 1, Episode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ratingEClass, Rating.class, "Rating", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRating_AverageRating(), ecorePackage.getEFloat(), "averageRating", null, 1, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRating_NumberOfVotes(), ecorePackage.getEInt(), "numberOfVotes", null, 1, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRating_Title(), this.getTitle(), this.getTitle_Rating(), "title", null, 1, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_BirthYear(), ecorePackage.getEInt(), "birthYear", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_DeathYear(), ecorePackage.getEInt(), "deathYear", "-1", 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Professions(), ecorePackage.getEString(), "professions", null, 0, 3, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_KnownForTitles(), this.getTitle(), null, "knownForTitles", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Involvement(), this.getInvolvement(), this.getInvolvement_Person(), "involvement", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Imdb(), this.getImdb(), this.getImdb_Persons(), "imdb", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(involvementEClass, Involvement.class, "Involvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvolvement_Title(), this.getTitle(), this.getTitle_Involvements(), "title", null, 1, 1, Involvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvolvement_Person(), this.getPerson(), this.getPerson_Involvement(), "person", null, 1, 1, Involvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvolvement_Job(), ecorePackage.getEString(), "job", null, 1, 1, Involvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvolvement_Character(), ecorePackage.getEString(), "character", null, 0, 1, Involvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titleTypeWrapperEClass, TitleTypeWrapper.class, "TitleTypeWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitleTypeWrapper_TitleType(), this.getTitleType(), "titleType", null, 1, 1, TitleTypeWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTitleTypeWrapper__Equals__Object(), ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTitleTypeWrapper__HashCode(), ecorePackage.getEInt(), "hashCode", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(titleTypeEEnum, TitleType.class, "TitleType");
		addEEnumLiteral(titleTypeEEnum, TitleType.OTHER);
		addEEnumLiteral(titleTypeEEnum, TitleType.MOVIE);
		addEEnumLiteral(titleTypeEEnum, TitleType.SHORT);
		addEEnumLiteral(titleTypeEEnum, TitleType.TVSERIES);
		addEEnumLiteral(titleTypeEEnum, TitleType.TVEPISODE);
		addEEnumLiteral(titleTypeEEnum, TitleType.VIDEO);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (titleEClass,
		   source,
		   new String[] {
			   "constraints", "startYearConstraint runtimeConstraint uniqueCharactersConstraint imdbNotNullConstraint titleTypeConstraint"
		   });
		addAnnotation
		  (tvSeriesEClass,
		   source,
		   new String[] {
			   "constraints", "endYearConstraint"
		   });
		addAnnotation
		  (episodeEClass,
		   source,
		   new String[] {
			   "constraints", "noImdbContainerConstraint seasonNumberConstraint episodeNumberConstraint"
		   });
		addAnnotation
		  (ratingEClass,
		   source,
		   new String[] {
			   "constraints", "numberOfVotesConstraint averageRatingConstraint"
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "constraints", "birthYearConstraint deathYearConstraint"
		   });
		addAnnotation
		  (involvementEClass,
		   source,
		   new String[] {
			   "constraints", "uniqueJobPerPersonConstraint actorIsBornConstraint"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (titleEClass,
		   source,
		   new String[] {
			   "startYearConstraint", "self.startYear > 0 and self.startYear <= 2050",
			   "runtimeConstraint", "self.runtime > 0",
			   "uniqueCharactersConstraint", "self.involvements -> isUnique(inv | inv.character)"
		   });
		addAnnotation
		  (tvSeriesEClass,
		   source,
		   new String[] {
			   "endYearConstraint", "(self.endYear > 0 and self.endYear <= 2050 and self.endYear >= self.startYear) or self.endYear = -1"
		   });
		addAnnotation
		  (episodeEClass,
		   source,
		   new String[] {
			   "noImdbContainerConstraint", "self.imdb = null",
			   "seasonNumberConstraint", "self.seasonNumber > 0",
			   "episodeNumberConstraint", "self.episodeNumber > 0"
		   });
		addAnnotation
		  (ratingEClass,
		   source,
		   new String[] {
			   "numberOfVotesConstraint", "self.numberOfVotes > 0"
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "birthYearConstraint", "self.birthYear > 0 and self.birthYear <= 2019",
			   "deathYearConstraint", "(self.deathYear > 0 and self.deathYear <= 2019 and self.deathYear >= self.birthYear) or self.deathYear = -1"
		   });
	}

} //ImdbPackageImpl
