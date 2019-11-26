/**
 */
package imdb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Title Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see imdb.ImdbPackage#getTitleType()
 * @model
 * @generated
 */
public enum TitleType implements Enumerator {
	/**
	 * The '<em><b>MOVIE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVIE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVIE(0, "MOVIE", "MOVIE"),

	/**
	 * The '<em><b>SHORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT(1, "SHORT", "SHORT"),

	/**
	 * The '<em><b>TVSERIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TVSERIES_VALUE
	 * @generated
	 * @ordered
	 */
	TVSERIES(2, "TVSERIES", "TVSERIES"),

	/**
	 * The '<em><b>TVEPISODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TVEPISODE_VALUE
	 * @generated
	 * @ordered
	 */
	TVEPISODE(3, "TVEPISODE", "TVEPISODE"),

	/**
	 * The '<em><b>VIDEO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO(4, "VIDEO", "VIDEO");

	/**
	 * The '<em><b>MOVIE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVIE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVIE_VALUE = 0;

	/**
	 * The '<em><b>SHORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_VALUE = 1;

	/**
	 * The '<em><b>TVSERIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TVSERIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TVSERIES_VALUE = 2;

	/**
	 * The '<em><b>TVEPISODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TVEPISODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TVEPISODE_VALUE = 3;

	/**
	 * The '<em><b>VIDEO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_VALUE = 4;

	/**
	 * An array of all the '<em><b>Title Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TitleType[] VALUES_ARRAY =
		new TitleType[] {
			MOVIE,
			SHORT,
			TVSERIES,
			TVEPISODE,
			VIDEO,
		};

	/**
	 * A public read-only list of all the '<em><b>Title Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TitleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Title Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TitleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TitleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TitleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TitleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TitleType get(int value) {
		switch (value) {
			case MOVIE_VALUE: return MOVIE;
			case SHORT_VALUE: return SHORT;
			case TVSERIES_VALUE: return TVSERIES;
			case TVEPISODE_VALUE: return TVEPISODE;
			case VIDEO_VALUE: return VIDEO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TitleType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TitleType
