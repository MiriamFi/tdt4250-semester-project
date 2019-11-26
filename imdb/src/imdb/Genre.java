/**
 */
package imdb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.Genre#getName <em>Name</em>}</li>
 *   <li>{@link imdb.Genre#getImdb <em>Imdb</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getGenre()
 * @model
 * @generated
 */
public interface Genre extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see imdb.ImdbPackage#getGenre_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link imdb.Genre#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Imdb</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imdb.Imdb#getGenres <em>Genres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imdb</em>' container reference.
	 * @see #setImdb(Imdb)
	 * @see imdb.ImdbPackage#getGenre_Imdb()
	 * @see imdb.Imdb#getGenres
	 * @model opposite="genres" transient="false"
	 * @generated
	 */
	Imdb getImdb();

	/**
	 * Sets the value of the '{@link imdb.Genre#getImdb <em>Imdb</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imdb</em>' container reference.
	 * @see #getImdb()
	 * @generated
	 */
	void setImdb(Imdb value);

} // Genre
