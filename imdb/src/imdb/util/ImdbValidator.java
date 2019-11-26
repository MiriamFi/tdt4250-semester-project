/**
 */
package imdb.util;

import imdb.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see imdb.ImdbPackage
 * @generated
 */
public class ImdbValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ImdbValidator INSTANCE = new ImdbValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "imdb";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImdbValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ImdbPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ImdbPackage.IMDB:
				return validateImdb((Imdb)value, diagnostics, context);
			case ImdbPackage.TITLE:
				return validateTitle((Title)value, diagnostics, context);
			case ImdbPackage.TV_SERIES:
				return validateTvSeries((TvSeries)value, diagnostics, context);
			case ImdbPackage.EPISODE:
				return validateEpisode((Episode)value, diagnostics, context);
			case ImdbPackage.RATING:
				return validateRating((Rating)value, diagnostics, context);
			case ImdbPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case ImdbPackage.INVOLVEMENT:
				return validateInvolvement((Involvement)value, diagnostics, context);
			case ImdbPackage.TITLE_TYPE:
				return validateTitleType((TitleType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImdb(Imdb imdb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imdb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitle(Title title, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(title, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(title, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(title, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(title, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(title, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(title, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(title, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(title, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(title, diagnostics, context);
		if (result || diagnostics != null) result &= validateTitle_startYearConstraint(title, diagnostics, context);
		if (result || diagnostics != null) result &= validateTitle_runtimeConstraint(title, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the startYearConstraint constraint of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TITLE__START_YEAR_CONSTRAINT__EEXPRESSION = "self.startYear > 0 and self.startYear <= 2050";

	/**
	 * Validates the startYearConstraint constraint of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitle_startYearConstraint(Title title, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ImdbPackage.Literals.TITLE,
				 title,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "startYearConstraint",
				 TITLE__START_YEAR_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the runtimeConstraint constraint of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TITLE__RUNTIME_CONSTRAINT__EEXPRESSION = "self.runtime > 0";

	/**
	 * Validates the runtimeConstraint constraint of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitle_runtimeConstraint(Title title, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ImdbPackage.Literals.TITLE,
				 title,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "runtimeConstraint",
				 TITLE__RUNTIME_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTvSeries(TvSeries tvSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tvSeries, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tvSeries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tvSeries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tvSeries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tvSeries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tvSeries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tvSeries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tvSeries, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tvSeries, diagnostics, context);
		if (result || diagnostics != null) result &= validateTitle_startYearConstraint(tvSeries, diagnostics, context);
		if (result || diagnostics != null) result &= validateTitle_runtimeConstraint(tvSeries, diagnostics, context);
		if (result || diagnostics != null) result &= validateTvSeries_endYearConstraint(tvSeries, diagnostics, context);
		if (result || diagnostics != null) result &= validateTvSeries_hasTitleTypeTvseries(tvSeries, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the endYearConstraint constraint of '<em>Tv Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TV_SERIES__END_YEAR_CONSTRAINT__EEXPRESSION = "self.endYear > 0 and self.endYear <= 2050 and self.endYear >= self.startYear";

	/**
	 * Validates the endYearConstraint constraint of '<em>Tv Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTvSeries_endYearConstraint(TvSeries tvSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ImdbPackage.Literals.TV_SERIES,
				 tvSeries,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "endYearConstraint",
				 TV_SERIES__END_YEAR_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the hasTitleTypeTvseries constraint of '<em>Tv Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTvSeries_hasTitleTypeTvseries(TvSeries tvSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasTitleTypeTvseries", getObjectLabel(tvSeries, context) },
						 new Object[] { tvSeries },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisode(Episode episode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(episode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(episode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(episode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(episode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(episode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(episode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(episode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(episode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(episode, diagnostics, context);
		if (result || diagnostics != null) result &= validateTitle_startYearConstraint(episode, diagnostics, context);
		if (result || diagnostics != null) result &= validateTitle_runtimeConstraint(episode, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisode_seasonNumberConstraint(episode, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisode_episodeNumberConstraint(episode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the seasonNumberConstraint constraint of '<em>Episode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EPISODE__SEASON_NUMBER_CONSTRAINT__EEXPRESSION = "self.seasonNumber> 0";

	/**
	 * Validates the seasonNumberConstraint constraint of '<em>Episode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisode_seasonNumberConstraint(Episode episode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ImdbPackage.Literals.EPISODE,
				 episode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "seasonNumberConstraint",
				 EPISODE__SEASON_NUMBER_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the episodeNumberConstraint constraint of '<em>Episode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EPISODE__EPISODE_NUMBER_CONSTRAINT__EEXPRESSION = "self.episodeNumber> 0";

	/**
	 * Validates the episodeNumberConstraint constraint of '<em>Episode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisode_episodeNumberConstraint(Episode episode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ImdbPackage.Literals.EPISODE,
				 episode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "episodeNumberConstraint",
				 EPISODE__EPISODE_NUMBER_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRating(Rating rating, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rating, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rating, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rating, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rating, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rating, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rating, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rating, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rating, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rating, diagnostics, context);
		if (result || diagnostics != null) result &= validateRating_numberOfVotesConstraint(rating, diagnostics, context);
		if (result || diagnostics != null) result &= validateRating_averageRatingConstraint(rating, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the numberOfVotesConstraint constraint of '<em>Rating</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RATING__NUMBER_OF_VOTES_CONSTRAINT__EEXPRESSION = "self.numberOfVotes > 0";

	/**
	 * Validates the numberOfVotesConstraint constraint of '<em>Rating</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRating_numberOfVotesConstraint(Rating rating, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ImdbPackage.Literals.RATING,
				 rating,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "numberOfVotesConstraint",
				 RATING__NUMBER_OF_VOTES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the averageRatingConstraint constraint of '<em>Rating</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRating_averageRatingConstraint(Rating rating, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "averageRatingConstraint", getObjectLabel(rating, context) },
						 new Object[] { rating },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_numberOfVotesConstraint(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_averageRatingConstraint(person, diagnostics, context);
		return result;
	}

	/**
	 * Validates the numberOfVotesConstraint constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_numberOfVotesConstraint(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "numberOfVotesConstraint", getObjectLabel(person, context) },
						 new Object[] { person },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the averageRatingConstraint constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_averageRatingConstraint(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "averageRatingConstraint", getObjectLabel(person, context) },
						 new Object[] { person },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvolvement(Involvement involvement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(involvement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(involvement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(involvement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(involvement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(involvement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(involvement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(involvement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(involvement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(involvement, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvolvement_uniqueInvolvementConstraint(involvement, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvolvement_actorIsBornConstraint(involvement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueInvolvementConstraint constraint of '<em>Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvolvement_uniqueInvolvementConstraint(Involvement involvement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "uniqueInvolvementConstraint", getObjectLabel(involvement, context) },
						 new Object[] { involvement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the actorIsBornConstraint constraint of '<em>Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvolvement_actorIsBornConstraint(Involvement involvement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "actorIsBornConstraint", getObjectLabel(involvement, context) },
						 new Object[] { involvement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitleType(TitleType titleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ImdbValidator
