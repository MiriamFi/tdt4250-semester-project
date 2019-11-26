/**
 */
package imdb.impl;

import imdb.ImdbPackage;
import imdb.Rating;
import imdb.Title;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.RatingImpl#getAverageRating <em>Average Rating</em>}</li>
 *   <li>{@link imdb.impl.RatingImpl#getNumberOfVotes <em>Number Of Votes</em>}</li>
 *   <li>{@link imdb.impl.RatingImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatingImpl extends MinimalEObjectImpl.Container implements Rating {
	/**
	 * The default value of the '{@link #getAverageRating() <em>Average Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageRating()
	 * @generated
	 * @ordered
	 */
	protected static final float AVERAGE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAverageRating() <em>Average Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageRating()
	 * @generated
	 * @ordered
	 */
	protected float averageRating = AVERAGE_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfVotes() <em>Number Of Votes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfVotes()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_VOTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfVotes() <em>Number Of Votes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfVotes()
	 * @generated
	 * @ordered
	 */
	protected int numberOfVotes = NUMBER_OF_VOTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.RATING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAverageRating() {
		return averageRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageRating(float newAverageRating) {
		float oldAverageRating = averageRating;
		averageRating = newAverageRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.RATING__AVERAGE_RATING, oldAverageRating, averageRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfVotes() {
		return numberOfVotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfVotes(int newNumberOfVotes) {
		int oldNumberOfVotes = numberOfVotes;
		numberOfVotes = newNumberOfVotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.RATING__NUMBER_OF_VOTES, oldNumberOfVotes, numberOfVotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Title getTitle() {
		if (eContainerFeatureID() != ImdbPackage.RATING__TITLE) return null;
		return (Title)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(Title newTitle, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTitle, ImdbPackage.RATING__TITLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(Title newTitle) {
		if (newTitle != eInternalContainer() || (eContainerFeatureID() != ImdbPackage.RATING__TITLE && newTitle != null)) {
			if (EcoreUtil.isAncestor(this, newTitle))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, ImdbPackage.TITLE__RATING, Title.class, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.RATING__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImdbPackage.RATING__TITLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTitle((Title)otherEnd, msgs);
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
			case ImdbPackage.RATING__TITLE:
				return basicSetTitle(null, msgs);
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
			case ImdbPackage.RATING__TITLE:
				return eInternalContainer().eInverseRemove(this, ImdbPackage.TITLE__RATING, Title.class, msgs);
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
			case ImdbPackage.RATING__AVERAGE_RATING:
				return getAverageRating();
			case ImdbPackage.RATING__NUMBER_OF_VOTES:
				return getNumberOfVotes();
			case ImdbPackage.RATING__TITLE:
				return getTitle();
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
			case ImdbPackage.RATING__AVERAGE_RATING:
				setAverageRating((Float)newValue);
				return;
			case ImdbPackage.RATING__NUMBER_OF_VOTES:
				setNumberOfVotes((Integer)newValue);
				return;
			case ImdbPackage.RATING__TITLE:
				setTitle((Title)newValue);
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
			case ImdbPackage.RATING__AVERAGE_RATING:
				setAverageRating(AVERAGE_RATING_EDEFAULT);
				return;
			case ImdbPackage.RATING__NUMBER_OF_VOTES:
				setNumberOfVotes(NUMBER_OF_VOTES_EDEFAULT);
				return;
			case ImdbPackage.RATING__TITLE:
				setTitle((Title)null);
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
			case ImdbPackage.RATING__AVERAGE_RATING:
				return averageRating != AVERAGE_RATING_EDEFAULT;
			case ImdbPackage.RATING__NUMBER_OF_VOTES:
				return numberOfVotes != NUMBER_OF_VOTES_EDEFAULT;
			case ImdbPackage.RATING__TITLE:
				return getTitle() != null;
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
		result.append(" (averageRating: ");
		result.append(averageRating);
		result.append(", numberOfVotes: ");
		result.append(numberOfVotes);
		result.append(')');
		return result.toString();
	}

} //RatingImpl
