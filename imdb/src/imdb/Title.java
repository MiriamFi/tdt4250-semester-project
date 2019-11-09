/**
 */
package imdb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.Title#getName <em>Name</em>}</li>
 *   <li>{@link imdb.Title#getRegion <em>Region</em>}</li>
 *   <li>{@link imdb.Title#getLanguage <em>Language</em>}</li>
 *   <li>{@link imdb.Title#getTitleType <em>Title Type</em>}</li>
 *   <li>{@link imdb.Title#getStartYear <em>Start Year</em>}</li>
 *   <li>{@link imdb.Title#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link imdb.Title#getGenres <em>Genres</em>}</li>
 *   <li>{@link imdb.Title#getRating <em>Rating</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see imdb.ImdbPackage#getTitle_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link imdb.Title#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see imdb.ImdbPackage#getTitle_Region()
	 * @model
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link imdb.Title#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see imdb.ImdbPackage#getTitle_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link imdb.Title#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Title Type</b></em>' attribute.
	 * The literals are from the enumeration {@link imdb.TitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Type</em>' attribute.
	 * @see imdb.TitleType
	 * @see #setTitleType(TitleType)
	 * @see imdb.ImdbPackage#getTitle_TitleType()
	 * @model required="true"
	 * @generated
	 */
	TitleType getTitleType();

	/**
	 * Sets the value of the '{@link imdb.Title#getTitleType <em>Title Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Type</em>' attribute.
	 * @see imdb.TitleType
	 * @see #getTitleType()
	 * @generated
	 */
	void setTitleType(TitleType value);

	/**
	 * Returns the value of the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Year</em>' attribute.
	 * @see #setStartYear(int)
	 * @see imdb.ImdbPackage#getTitle_StartYear()
	 * @model required="true"
	 * @generated
	 */
	int getStartYear();

	/**
	 * Sets the value of the '{@link imdb.Title#getStartYear <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Year</em>' attribute.
	 * @see #getStartYear()
	 * @generated
	 */
	void setStartYear(int value);

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see #setRuntime(int)
	 * @see imdb.ImdbPackage#getTitle_Runtime()
	 * @model
	 * @generated
	 */
	int getRuntime();

	/**
	 * Sets the value of the '{@link imdb.Title#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(int value);

	/**
	 * Returns the value of the '<em><b>Genres</b></em>' reference list.
	 * The list contents are of type {@link imdb.Genre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genres</em>' reference list.
	 * @see imdb.ImdbPackage#getTitle_Genres()
	 * @model upper="3"
	 * @generated
	 */
	EList<Genre> getGenres();

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link imdb.Rating#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' containment reference.
	 * @see #setRating(Rating)
	 * @see imdb.ImdbPackage#getTitle_Rating()
	 * @see imdb.Rating#getTitle
	 * @model opposite="title" containment="true"
	 * @generated
	 */
	Rating getRating();

	/**
	 * Sets the value of the '{@link imdb.Title#getRating <em>Rating</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' containment reference.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(Rating value);

} // Title
