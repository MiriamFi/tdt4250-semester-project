/**
 */
package imdb.impl;

import imdb.Genre;
import imdb.Imdb;
import imdb.ImdbPackage;
import imdb.Involvement;
import imdb.Rating;
import imdb.Title;
import imdb.TitleType;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.TitleImpl#getName <em>Name</em>}</li>
 *   <li>{@link imdb.impl.TitleImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link imdb.impl.TitleImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link imdb.impl.TitleImpl#getTitleType <em>Title Type</em>}</li>
 *   <li>{@link imdb.impl.TitleImpl#getStartYear <em>Start Year</em>}</li>
 *   <li>{@link imdb.impl.TitleImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link imdb.impl.TitleImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link imdb.impl.TitleImpl#getInvolvements <em>Involvements</em>}</li>
 *   <li>{@link imdb.impl.TitleImpl#getImdb <em>Imdb</em>}</li>
 *   <li>{@link imdb.impl.TitleImpl#getGenres <em>Genres</em>}</li>
 *   <li>{@link imdb.impl.TitleImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TitleImpl extends MinimalEObjectImpl.Container implements Title {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleType() <em>Title Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleType()
	 * @generated
	 * @ordered
	 */
	protected static final TitleType TITLE_TYPE_EDEFAULT = TitleType.OTHER;

	/**
	 * The cached value of the '{@link #getTitleType() <em>Title Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleType()
	 * @generated
	 * @ordered
	 */
	protected TitleType titleType = TITLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected static final int START_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected int startYear = START_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final int RUNTIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected int runtime = RUNTIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected Rating rating;

	/**
	 * The cached value of the '{@link #getInvolvements() <em>Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<Involvement> involvements;

	/**
	 * The cached value of the '{@link #getGenres() <em>Genres</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenres()
	 * @generated
	 * @ordered
	 */
	protected EList<Genre> genres;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.TITLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.TITLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.TITLE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.TITLE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleType getTitleType() {
		return titleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleType(TitleType newTitleType) {
		TitleType oldTitleType = titleType;
		titleType = newTitleType == null ? TITLE_TYPE_EDEFAULT : newTitleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.TITLE__TITLE_TYPE, oldTitleType, titleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartYear() {
		return startYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartYear(int newStartYear) {
		int oldStartYear = startYear;
		startYear = newStartYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.TITLE__START_YEAR, oldStartYear, startYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntime(int newRuntime) {
		int oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.TITLE__RUNTIME, oldRuntime, runtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rating getRating() {
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRating(Rating newRating, NotificationChain msgs) {
		Rating oldRating = rating;
		rating = newRating;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImdbPackage.TITLE__RATING, oldRating, newRating);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRating(Rating newRating) {
		if (newRating != rating) {
			NotificationChain msgs = null;
			if (rating != null)
				msgs = ((InternalEObject)rating).eInverseRemove(this, ImdbPackage.RATING__TITLE, Rating.class, msgs);
			if (newRating != null)
				msgs = ((InternalEObject)newRating).eInverseAdd(this, ImdbPackage.RATING__TITLE, Rating.class, msgs);
			msgs = basicSetRating(newRating, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.TITLE__RATING, newRating, newRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvements() {
		if (involvements == null) {
			involvements = new EObjectContainmentWithInverseEList<Involvement>(Involvement.class, this, ImdbPackage.TITLE__INVOLVEMENTS, ImdbPackage.INVOLVEMENT__TITLE);
		}
		return involvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imdb getImdb() {
		if (eContainerFeatureID() != ImdbPackage.TITLE__IMDB) return null;
		return (Imdb)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImdb(Imdb newImdb, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImdb, ImdbPackage.TITLE__IMDB, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImdb(Imdb newImdb) {
		if (newImdb != eInternalContainer() || (eContainerFeatureID() != ImdbPackage.TITLE__IMDB && newImdb != null)) {
			if (EcoreUtil.isAncestor(this, newImdb))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImdb != null)
				msgs = ((InternalEObject)newImdb).eInverseAdd(this, ImdbPackage.IMDB__TITLES, Imdb.class, msgs);
			msgs = basicSetImdb(newImdb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.TITLE__IMDB, newImdb, newImdb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Genre> getGenres() {
		if (genres == null) {
			genres = new EObjectResolvingEList<Genre>(Genre.class, this, ImdbPackage.TITLE__GENRES);
		}
		return genres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.TITLE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isFilteredBy(String searchString, boolean caseInsensitive) {
		String cleanedName = name;
		if (caseInsensitive)
			cleanedName = cleanedName.toLowerCase();

		return cleanedName.contains(searchString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setGenres(EList<Genre> genres) {
		this.genres = genres;
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
			case ImdbPackage.TITLE__RATING:
				if (rating != null)
					msgs = ((InternalEObject)rating).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImdbPackage.TITLE__RATING, null, msgs);
				return basicSetRating((Rating)otherEnd, msgs);
			case ImdbPackage.TITLE__INVOLVEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvolvements()).basicAdd(otherEnd, msgs);
			case ImdbPackage.TITLE__IMDB:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImdb((Imdb)otherEnd, msgs);
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
			case ImdbPackage.TITLE__RATING:
				return basicSetRating(null, msgs);
			case ImdbPackage.TITLE__INVOLVEMENTS:
				return ((InternalEList<?>)getInvolvements()).basicRemove(otherEnd, msgs);
			case ImdbPackage.TITLE__IMDB:
				return basicSetImdb(null, msgs);
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
			case ImdbPackage.TITLE__IMDB:
				return eInternalContainer().eInverseRemove(this, ImdbPackage.IMDB__TITLES, Imdb.class, msgs);
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
			case ImdbPackage.TITLE__NAME:
				return getName();
			case ImdbPackage.TITLE__REGION:
				return getRegion();
			case ImdbPackage.TITLE__LANGUAGE:
				return getLanguage();
			case ImdbPackage.TITLE__TITLE_TYPE:
				return getTitleType();
			case ImdbPackage.TITLE__START_YEAR:
				return getStartYear();
			case ImdbPackage.TITLE__RUNTIME:
				return getRuntime();
			case ImdbPackage.TITLE__RATING:
				return getRating();
			case ImdbPackage.TITLE__INVOLVEMENTS:
				return getInvolvements();
			case ImdbPackage.TITLE__IMDB:
				return getImdb();
			case ImdbPackage.TITLE__GENRES:
				return getGenres();
			case ImdbPackage.TITLE__ID:
				return getID();
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
			case ImdbPackage.TITLE__NAME:
				setName((String)newValue);
				return;
			case ImdbPackage.TITLE__REGION:
				setRegion((String)newValue);
				return;
			case ImdbPackage.TITLE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case ImdbPackage.TITLE__TITLE_TYPE:
				setTitleType((TitleType)newValue);
				return;
			case ImdbPackage.TITLE__START_YEAR:
				setStartYear((Integer)newValue);
				return;
			case ImdbPackage.TITLE__RUNTIME:
				setRuntime((Integer)newValue);
				return;
			case ImdbPackage.TITLE__RATING:
				setRating((Rating)newValue);
				return;
			case ImdbPackage.TITLE__INVOLVEMENTS:
				getInvolvements().clear();
				getInvolvements().addAll((Collection<? extends Involvement>)newValue);
				return;
			case ImdbPackage.TITLE__IMDB:
				setImdb((Imdb)newValue);
				return;
			case ImdbPackage.TITLE__GENRES:
				getGenres().clear();
				getGenres().addAll((Collection<? extends Genre>)newValue);
				return;
			case ImdbPackage.TITLE__ID:
				setID((String)newValue);
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
			case ImdbPackage.TITLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImdbPackage.TITLE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case ImdbPackage.TITLE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case ImdbPackage.TITLE__TITLE_TYPE:
				setTitleType(TITLE_TYPE_EDEFAULT);
				return;
			case ImdbPackage.TITLE__START_YEAR:
				setStartYear(START_YEAR_EDEFAULT);
				return;
			case ImdbPackage.TITLE__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
				return;
			case ImdbPackage.TITLE__RATING:
				setRating((Rating)null);
				return;
			case ImdbPackage.TITLE__INVOLVEMENTS:
				getInvolvements().clear();
				return;
			case ImdbPackage.TITLE__IMDB:
				setImdb((Imdb)null);
				return;
			case ImdbPackage.TITLE__GENRES:
				getGenres().clear();
				return;
			case ImdbPackage.TITLE__ID:
				setID(ID_EDEFAULT);
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
			case ImdbPackage.TITLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImdbPackage.TITLE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case ImdbPackage.TITLE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case ImdbPackage.TITLE__TITLE_TYPE:
				return titleType != TITLE_TYPE_EDEFAULT;
			case ImdbPackage.TITLE__START_YEAR:
				return startYear != START_YEAR_EDEFAULT;
			case ImdbPackage.TITLE__RUNTIME:
				return runtime != RUNTIME_EDEFAULT;
			case ImdbPackage.TITLE__RATING:
				return rating != null;
			case ImdbPackage.TITLE__INVOLVEMENTS:
				return involvements != null && !involvements.isEmpty();
			case ImdbPackage.TITLE__IMDB:
				return getImdb() != null;
			case ImdbPackage.TITLE__GENRES:
				return genres != null && !genres.isEmpty();
			case ImdbPackage.TITLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImdbPackage.TITLE___IS_FILTERED_BY__STRING_BOOLEAN:
				return isFilteredBy((String)arguments.get(0), (Boolean)arguments.get(1));
			case ImdbPackage.TITLE___SET_GENRES__ELIST:
				setGenres((EList<Genre>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", region: ");
		result.append(region);
		result.append(", language: ");
		result.append(language);
		result.append(", titleType: ");
		result.append(titleType);
		result.append(", startYear: ");
		result.append(startYear);
		result.append(", runtime: ");
		result.append(runtime);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TitleImpl
