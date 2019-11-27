/**
 */
package imdb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Involvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.Involvement#getTitle <em>Title</em>}</li>
 *   <li>{@link imdb.Involvement#getPerson <em>Person</em>}</li>
 *   <li>{@link imdb.Involvement#getJobCategory <em>Job Category</em>}</li>
 *   <li>{@link imdb.Involvement#getJob <em>Job</em>}</li>
 *   <li>{@link imdb.Involvement#getCharacter <em>Character</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getInvolvement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueJobCategoryPerPersonConstraint actorIsBornConstraint'"
 * @generated
 */
public interface Involvement extends EObject {

	/**
	 * Returns the value of the '<em><b>Title</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imdb.Title#getInvolvements <em>Involvements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' container reference.
	 * @see #setTitle(Title)
	 * @see imdb.ImdbPackage#getInvolvement_Title()
	 * @see imdb.Title#getInvolvements
	 * @model opposite="involvements" required="true" transient="false"
	 * @generated
	 */
	Title getTitle();

	/**
	 * Sets the value of the '{@link imdb.Involvement#getTitle <em>Title</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' container reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Title value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link imdb.Person#getInvolvement <em>Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see imdb.ImdbPackage#getInvolvement_Person()
	 * @see imdb.Person#getInvolvement
	 * @model opposite="involvement" required="true"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link imdb.Involvement#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Job Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Category</em>' attribute.
	 * @see #setJobCategory(String)
	 * @see imdb.ImdbPackage#getInvolvement_JobCategory()
	 * @model required="true"
	 * @generated
	 */
	String getJobCategory();

	/**
	 * Sets the value of the '{@link imdb.Involvement#getJobCategory <em>Job Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Category</em>' attribute.
	 * @see #getJobCategory()
	 * @generated
	 */
	void setJobCategory(String value);

	/**
	 * Returns the value of the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' attribute.
	 * @see #setJob(String)
	 * @see imdb.ImdbPackage#getInvolvement_Job()
	 * @model
	 * @generated
	 */
	String getJob();

	/**
	 * Sets the value of the '{@link imdb.Involvement#getJob <em>Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' attribute.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(String value);

	/**
	 * Returns the value of the '<em><b>Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character</em>' attribute.
	 * @see #setCharacter(String)
	 * @see imdb.ImdbPackage#getInvolvement_Character()
	 * @model
	 * @generated
	 */
	String getCharacter();

	/**
	 * Sets the value of the '{@link imdb.Involvement#getCharacter <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character</em>' attribute.
	 * @see #getCharacter()
	 * @generated
	 */
	void setCharacter(String value);
} // Involvement
