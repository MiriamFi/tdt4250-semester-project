/**
 */
package imdb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Episode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.Episode#getSeries <em>Series</em>}</li>
 *   <li>{@link imdb.Episode#getSeasonNumber <em>Season Number</em>}</li>
 *   <li>{@link imdb.Episode#getEpisodeNumber <em>Episode Number</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getEpisode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noImdbContainerConstraint seasonNumberConstraint episodeNumberConstraint'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 noImdbContainerConstraint='self.imdb = null' seasonNumberConstraint='self.seasonNumber &gt; 0' episodeNumberConstraint='self.episodeNumber &gt; 0'"
 * @generated
 */
public interface Episode extends Title {
	/**
	 * Returns the value of the '<em><b>Series</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imdb.TvSeries#getEpisodes <em>Episodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' container reference.
	 * @see #setSeries(TvSeries)
	 * @see imdb.ImdbPackage#getEpisode_Series()
	 * @see imdb.TvSeries#getEpisodes
	 * @model opposite="episodes" required="true" transient="false"
	 * @generated
	 */
	TvSeries getSeries();

	/**
	 * Sets the value of the '{@link imdb.Episode#getSeries <em>Series</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' container reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(TvSeries value);

	/**
	 * Returns the value of the '<em><b>Season Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season Number</em>' attribute.
	 * @see #setSeasonNumber(int)
	 * @see imdb.ImdbPackage#getEpisode_SeasonNumber()
	 * @model required="true"
	 * @generated
	 */
	int getSeasonNumber();

	/**
	 * Sets the value of the '{@link imdb.Episode#getSeasonNumber <em>Season Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season Number</em>' attribute.
	 * @see #getSeasonNumber()
	 * @generated
	 */
	void setSeasonNumber(int value);

	/**
	 * Returns the value of the '<em><b>Episode Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episode Number</em>' attribute.
	 * @see #setEpisodeNumber(int)
	 * @see imdb.ImdbPackage#getEpisode_EpisodeNumber()
	 * @model required="true"
	 * @generated
	 */
	int getEpisodeNumber();

	/**
	 * Sets the value of the '{@link imdb.Episode#getEpisodeNumber <em>Episode Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Episode Number</em>' attribute.
	 * @see #getEpisodeNumber()
	 * @generated
	 */
	void setEpisodeNumber(int value);

} // Episode
