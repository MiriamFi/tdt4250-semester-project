/**
 */
package imdb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tv Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.TvSeries#getEndYear <em>End Year</em>}</li>
 *   <li>{@link imdb.TvSeries#getEpisodes <em>Episodes</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getTvSeries()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='endYearConstraint'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 endYearConstraint='(self.endYear &gt; 0 and self.endYear &lt;= 2050 and self.endYear &gt;= self.startYear) or self.endYear = -1'"
 * @generated
 */
public interface TvSeries extends Title {
	/**
	 * Returns the value of the '<em><b>End Year</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Year</em>' attribute.
	 * @see #setEndYear(int)
	 * @see imdb.ImdbPackage#getTvSeries_EndYear()
	 * @model default="-1"
	 * @generated
	 */
	int getEndYear();

	/**
	 * Sets the value of the '{@link imdb.TvSeries#getEndYear <em>End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Year</em>' attribute.
	 * @see #getEndYear()
	 * @generated
	 */
	void setEndYear(int value);

	/**
	 * Returns the value of the '<em><b>Episodes</b></em>' containment reference list.
	 * The list contents are of type {@link imdb.Episode}.
	 * It is bidirectional and its opposite is '{@link imdb.Episode#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episodes</em>' containment reference list.
	 * @see imdb.ImdbPackage#getTvSeries_Episodes()
	 * @see imdb.Episode#getSeries
	 * @model opposite="series" containment="true"
	 * @generated
	 */
	EList<Episode> getEpisodes();

} // TvSeries
