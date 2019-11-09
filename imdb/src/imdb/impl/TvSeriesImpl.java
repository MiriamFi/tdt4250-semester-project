/**
 */
package imdb.impl;

import imdb.Episode;
import imdb.ImdbPackage;
import imdb.TvSeries;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tv Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.TvSeriesImpl#getEndYear <em>End Year</em>}</li>
 *   <li>{@link imdb.impl.TvSeriesImpl#getEpisodes <em>Episodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TvSeriesImpl extends TitleImpl implements TvSeries {
	/**
	 * The default value of the '{@link #getEndYear() <em>End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndYear()
	 * @generated
	 * @ordered
	 */
	protected static final int END_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndYear() <em>End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndYear()
	 * @generated
	 * @ordered
	 */
	protected int endYear = END_YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEpisodes() <em>Episodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Episode> episodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TvSeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.TV_SERIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndYear() {
		return endYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndYear(int newEndYear) {
		int oldEndYear = endYear;
		endYear = newEndYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.TV_SERIES__END_YEAR, oldEndYear, endYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Episode> getEpisodes() {
		if (episodes == null) {
			episodes = new EObjectContainmentWithInverseEList<Episode>(Episode.class, this, ImdbPackage.TV_SERIES__EPISODES, ImdbPackage.EPISODE__SERIES);
		}
		return episodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImdbPackage.TV_SERIES__EPISODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEpisodes()).basicAdd(otherEnd, msgs);
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
			case ImdbPackage.TV_SERIES__EPISODES:
				return ((InternalEList<?>)getEpisodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImdbPackage.TV_SERIES__END_YEAR:
				return getEndYear();
			case ImdbPackage.TV_SERIES__EPISODES:
				return getEpisodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImdbPackage.TV_SERIES__END_YEAR:
				setEndYear((Integer)newValue);
				return;
			case ImdbPackage.TV_SERIES__EPISODES:
				getEpisodes().clear();
				getEpisodes().addAll((Collection<? extends Episode>)newValue);
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
			case ImdbPackage.TV_SERIES__END_YEAR:
				setEndYear(END_YEAR_EDEFAULT);
				return;
			case ImdbPackage.TV_SERIES__EPISODES:
				getEpisodes().clear();
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
			case ImdbPackage.TV_SERIES__END_YEAR:
				return endYear != END_YEAR_EDEFAULT;
			case ImdbPackage.TV_SERIES__EPISODES:
				return episodes != null && !episodes.isEmpty();
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
		result.append(" (endYear: ");
		result.append(endYear);
		result.append(')');
		return result.toString();
	}

} //TvSeriesImpl
