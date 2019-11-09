/**
 */
package imdb;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.Person#getName <em>Name</em>}</li>
 *   <li>{@link imdb.Person#getBirthYear <em>Birth Year</em>}</li>
 *   <li>{@link imdb.Person#getDeathYear <em>Death Year</em>}</li>
 *   <li>{@link imdb.Person#getProfessions <em>Professions</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see imdb.ImdbPackage#getPerson_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link imdb.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Birth Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Year</em>' attribute.
	 * @see #setBirthYear(int)
	 * @see imdb.ImdbPackage#getPerson_BirthYear()
	 * @model required="true"
	 * @generated
	 */
	int getBirthYear();

	/**
	 * Sets the value of the '{@link imdb.Person#getBirthYear <em>Birth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Year</em>' attribute.
	 * @see #getBirthYear()
	 * @generated
	 */
	void setBirthYear(int value);

	/**
	 * Returns the value of the '<em><b>Death Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Death Year</em>' attribute.
	 * @see #setDeathYear(int)
	 * @see imdb.ImdbPackage#getPerson_DeathYear()
	 * @model
	 * @generated
	 */
	int getDeathYear();

	/**
	 * Sets the value of the '{@link imdb.Person#getDeathYear <em>Death Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Death Year</em>' attribute.
	 * @see #getDeathYear()
	 * @generated
	 */
	void setDeathYear(int value);

	/**
	 * Returns the value of the '<em><b>Professions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professions</em>' attribute list.
	 * @see imdb.ImdbPackage#getPerson_Professions()
	 * @model upper="3"
	 * @generated
	 */
	EList<String> getProfessions();
} // Person
