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
 *   <li>{@link imdb.Person#getKnownForTitles <em>Known For Titles</em>}</li>
 *   <li>{@link imdb.Person#getInvolvement <em>Involvement</em>}</li>
 *   <li>{@link imdb.Person#getImdb <em>Imdb</em>}</li>
 *   <li>{@link imdb.Person#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getPerson()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='numberOfVotesConstraint averageRatingConstraint'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 birthYearConstraint='self.birthYear &gt; 0 and self.birthYear &lt;= 2019' deathYearConstraint='self.deathYear &gt; -2 and self.deathYear &lt;= 2019 and self.deathYear &gt;= self.birthYear'"
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

	/**
	 * Returns the value of the '<em><b>Known For Titles</b></em>' reference list.
	 * The list contents are of type {@link imdb.Title}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Known For Titles</em>' reference list.
	 * @see imdb.ImdbPackage#getPerson_KnownForTitles()
	 * @model
	 * @generated
	 */
	EList<Title> getKnownForTitles();

	/**
	 * Returns the value of the '<em><b>Involvement</b></em>' reference list.
	 * The list contents are of type {@link imdb.Involvement}.
	 * It is bidirectional and its opposite is '{@link imdb.Involvement#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involvement</em>' reference list.
	 * @see imdb.ImdbPackage#getPerson_Involvement()
	 * @see imdb.Involvement#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<Involvement> getInvolvement();

	/**
	 * Returns the value of the '<em><b>Imdb</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imdb.Imdb#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imdb</em>' container reference.
	 * @see #setImdb(Imdb)
	 * @see imdb.ImdbPackage#getPerson_Imdb()
	 * @see imdb.Imdb#getPersons
	 * @model opposite="persons" transient="false"
	 * @generated
	 */
	Imdb getImdb();

	/**
	 * Sets the value of the '{@link imdb.Person#getImdb <em>Imdb</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imdb</em>' container reference.
	 * @see #getImdb()
	 * @generated
	 */
	void setImdb(Imdb value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see imdb.ImdbPackage#getPerson_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link imdb.Person#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // Person
