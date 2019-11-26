/**
 */
package imdb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.Rating#getAverageRating <em>Average Rating</em>}</li>
 *   <li>{@link imdb.Rating#getNumberOfVotes <em>Number Of Votes</em>}</li>
 *   <li>{@link imdb.Rating#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getRating()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='numberOfVotesConstraint averageRatingConstraint'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 numberOfVotesConstraint='self.numberOfVotes &gt; 0'"
 * @generated
 */
public interface Rating extends EObject {
	/**
	 * Returns the value of the '<em><b>Average Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Rating</em>' attribute.
	 * @see #setAverageRating(float)
	 * @see imdb.ImdbPackage#getRating_AverageRating()
	 * @model required="true"
	 * @generated
	 */
	float getAverageRating();

	/**
	 * Sets the value of the '{@link imdb.Rating#getAverageRating <em>Average Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Rating</em>' attribute.
	 * @see #getAverageRating()
	 * @generated
	 */
	void setAverageRating(float value);

	/**
	 * Returns the value of the '<em><b>Number Of Votes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Votes</em>' attribute.
	 * @see #setNumberOfVotes(int)
	 * @see imdb.ImdbPackage#getRating_NumberOfVotes()
	 * @model required="true"
	 * @generated
	 */
	int getNumberOfVotes();

	/**
	 * Sets the value of the '{@link imdb.Rating#getNumberOfVotes <em>Number Of Votes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Votes</em>' attribute.
	 * @see #getNumberOfVotes()
	 * @generated
	 */
	void setNumberOfVotes(int value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imdb.Title#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' container reference.
	 * @see #setTitle(Title)
	 * @see imdb.ImdbPackage#getRating_Title()
	 * @see imdb.Title#getRating
	 * @model opposite="rating" required="true" transient="false"
	 * @generated
	 */
	Title getTitle();

	/**
	 * Sets the value of the '{@link imdb.Rating#getTitle <em>Title</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' container reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Title value);

} // Rating
