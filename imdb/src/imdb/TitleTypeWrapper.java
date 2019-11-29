/**
 */
package imdb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title Type Wrapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.TitleTypeWrapper#getTitleType <em>Title Type</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getTitleTypeWrapper()
 * @model
 * @generated
 */
public interface TitleTypeWrapper extends EObject {
	/**
	 * Returns the value of the '<em><b>Title Type</b></em>' attribute.
	 * The literals are from the enumeration {@link imdb.TitleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Type</em>' attribute.
	 * @see imdb.TitleType
	 * @see #setTitleType(TitleType)
	 * @see imdb.ImdbPackage#getTitleTypeWrapper_TitleType()
	 * @model required="true"
	 * @generated
	 */
	TitleType getTitleType();

	/**
	 * Sets the value of the '{@link imdb.TitleTypeWrapper#getTitleType <em>Title Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Type</em>' attribute.
	 * @see imdb.TitleType
	 * @see #getTitleType()
	 * @generated
	 */
	void setTitleType(TitleType value);

} // TitleTypeWrapper
