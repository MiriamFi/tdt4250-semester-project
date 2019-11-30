/**
 */
package imdb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see imdb.ImdbPackage
 * @generated
 */
public interface ImdbFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImdbFactory eINSTANCE = imdb.impl.ImdbFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Imdb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imdb</em>'.
	 * @generated
	 */
	Imdb createImdb();

	/**
	 * Returns a new object of class '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title</em>'.
	 * @generated
	 */
	Title createTitle();

	/**
	 * Returns a new object of class '<em>Tv Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tv Series</em>'.
	 * @generated
	 */
	TvSeries createTvSeries();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Episode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode</em>'.
	 * @generated
	 */
	Episode createEpisode();

	/**
	 * Returns a new object of class '<em>Rating</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rating</em>'.
	 * @generated
	 */
	Rating createRating();

	/**
	 * Returns a new object of class '<em>Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Involvement</em>'.
	 * @generated
	 */
	Involvement createInvolvement();

	/**
	 * Returns a new object of class '<em>Title Type Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title Type Wrapper</em>'.
	 * @generated
	 */
	TitleTypeWrapper createTitleTypeWrapper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImdbPackage getImdbPackage();

} //ImdbFactory
