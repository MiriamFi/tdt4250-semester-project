/**
 */
package imdb.impl;

import imdb.Episode;
import imdb.ImdbPackage;
import imdb.TvSeries;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Episode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.EpisodeImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link imdb.impl.EpisodeImpl#getSeasonNumber <em>Season Number</em>}</li>
 *   <li>{@link imdb.impl.EpisodeImpl#getEpisodeNumber <em>Episode Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpisodeImpl extends TitleImpl implements Episode {
	/**
	 * The default value of the '{@link #getSeasonNumber() <em>Season Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEASON_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeasonNumber() <em>Season Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasonNumber()
	 * @generated
	 * @ordered
	 */
	protected int seasonNumber = SEASON_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpisodeNumber() <em>Episode Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int EPISODE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEpisodeNumber() <em>Episode Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeNumber()
	 * @generated
	 * @ordered
	 */
	protected int episodeNumber = EPISODE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.EPISODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TvSeries getSeries() {
		if (eContainerFeatureID() != ImdbPackage.EPISODE__SERIES) return null;
		return (TvSeries)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(TvSeries newSeries, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSeries, ImdbPackage.EPISODE__SERIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeries(TvSeries newSeries) {
		if (newSeries != eInternalContainer() || (eContainerFeatureID() != ImdbPackage.EPISODE__SERIES && newSeries != null)) {
			if (EcoreUtil.isAncestor(this, newSeries))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, ImdbPackage.TV_SERIES__EPISODES, TvSeries.class, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.EPISODE__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSeasonNumber() {
		return seasonNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeasonNumber(int newSeasonNumber) {
		int oldSeasonNumber = seasonNumber;
		seasonNumber = newSeasonNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.EPISODE__SEASON_NUMBER, oldSeasonNumber, seasonNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEpisodeNumber() {
		return episodeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEpisodeNumber(int newEpisodeNumber) {
		int oldEpisodeNumber = episodeNumber;
		episodeNumber = newEpisodeNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.EPISODE__EPISODE_NUMBER, oldEpisodeNumber, episodeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImdbPackage.EPISODE__SERIES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSeries((TvSeries)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImdbPackage.EPISODE__SERIES:
				return basicSetSeries(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ImdbPackage.EPISODE__SERIES:
				return eInternalContainer().eInverseRemove(this, ImdbPackage.TV_SERIES__EPISODES, TvSeries.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImdbPackage.EPISODE__SERIES:
				return getSeries();
			case ImdbPackage.EPISODE__SEASON_NUMBER:
				return getSeasonNumber();
			case ImdbPackage.EPISODE__EPISODE_NUMBER:
				return getEpisodeNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImdbPackage.EPISODE__SERIES:
				setSeries((TvSeries)newValue);
				return;
			case ImdbPackage.EPISODE__SEASON_NUMBER:
				setSeasonNumber((Integer)newValue);
				return;
			case ImdbPackage.EPISODE__EPISODE_NUMBER:
				setEpisodeNumber((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImdbPackage.EPISODE__SERIES:
				setSeries((TvSeries)null);
				return;
			case ImdbPackage.EPISODE__SEASON_NUMBER:
				setSeasonNumber(SEASON_NUMBER_EDEFAULT);
				return;
			case ImdbPackage.EPISODE__EPISODE_NUMBER:
				setEpisodeNumber(EPISODE_NUMBER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImdbPackage.EPISODE__SERIES:
				return getSeries() != null;
			case ImdbPackage.EPISODE__SEASON_NUMBER:
				return seasonNumber != SEASON_NUMBER_EDEFAULT;
			case ImdbPackage.EPISODE__EPISODE_NUMBER:
				return episodeNumber != EPISODE_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (seasonNumber: ");
		result.append(seasonNumber);
		result.append(", episodeNumber: ");
		result.append(episodeNumber);
		result.append(')');
		return result.toString();
	}

} //EpisodeImpl
