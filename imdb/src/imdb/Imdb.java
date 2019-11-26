/**
 */
package imdb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imdb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.Imdb#getTitles <em>Titles</em>}</li>
 *   <li>{@link imdb.Imdb#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getImdb()
 * @model
 * @generated
 */
public interface Imdb extends EObject {
	/**
	 * Returns the value of the '<em><b>Titles</b></em>' containment reference list.
	 * The list contents are of type {@link imdb.Title}.
	 * It is bidirectional and its opposite is '{@link imdb.Title#getImdb <em>Imdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titles</em>' containment reference list.
	 * @see imdb.ImdbPackage#getImdb_Titles()
	 * @see imdb.Title#getImdb
	 * @model opposite="imdb" containment="true"
	 * @generated
	 */
	EList<Title> getTitles();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link imdb.Person}.
	 * It is bidirectional and its opposite is '{@link imdb.Person#getImdb <em>Imdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see imdb.ImdbPackage#getImdb_Persons()
	 * @see imdb.Person#getImdb
	 * @model opposite="imdb" containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // Imdb
