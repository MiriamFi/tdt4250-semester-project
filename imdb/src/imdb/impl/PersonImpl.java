/**
 */
package imdb.impl;

import imdb.Imdb;
import imdb.ImdbPackage;
import imdb.Involvement;
import imdb.Person;

import imdb.Title;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link imdb.impl.PersonImpl#getBirthYear <em>Birth Year</em>}</li>
 *   <li>{@link imdb.impl.PersonImpl#getDeathYear <em>Death Year</em>}</li>
 *   <li>{@link imdb.impl.PersonImpl#getProfessions <em>Professions</em>}</li>
 *   <li>{@link imdb.impl.PersonImpl#getKnownForTitles <em>Known For Titles</em>}</li>
 *   <li>{@link imdb.impl.PersonImpl#getInvolvement <em>Involvement</em>}</li>
 *   <li>{@link imdb.impl.PersonImpl#getImdb <em>Imdb</em>}</li>
 *   <li>{@link imdb.impl.PersonImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
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
	 * The default value of the '{@link #getBirthYear() <em>Birth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthYear()
	 * @generated
	 * @ordered
	 */
	protected static final int BIRTH_YEAR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBirthYear() <em>Birth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthYear()
	 * @generated
	 * @ordered
	 */
	protected int birthYear = BIRTH_YEAR_EDEFAULT;
	/**
	 * The default value of the '{@link #getDeathYear() <em>Death Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathYear()
	 * @generated
	 * @ordered
	 */
	protected static final int DEATH_YEAR_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getDeathYear() <em>Death Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathYear()
	 * @generated
	 * @ordered
	 */
	protected int deathYear = DEATH_YEAR_EDEFAULT;
	/**
	 * The cached value of the '{@link #getProfessions() <em>Professions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> professions;

	/**
	 * The cached value of the '{@link #getKnownForTitles() <em>Known For Titles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownForTitles()
	 * @generated
	 * @ordered
	 */
	protected EList<Title> knownForTitles;
	/**
	 * The cached value of the '{@link #getInvolvement() <em>Involvement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvement()
	 * @generated
	 * @ordered
	 */
	protected EList<Involvement> involvement;

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
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.PERSON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthYear(int newBirthYear) {
		int oldBirthYear = birthYear;
		birthYear = newBirthYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.PERSON__BIRTH_YEAR, oldBirthYear, birthYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDeathYear() {
		return deathYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeathYear(int newDeathYear) {
		int oldDeathYear = deathYear;
		deathYear = newDeathYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.PERSON__DEATH_YEAR, oldDeathYear, deathYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProfessions() {
		if (professions == null) {
			professions = new EDataTypeUniqueEList<String>(String.class, this, ImdbPackage.PERSON__PROFESSIONS);
		}
		return professions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Title> getKnownForTitles() {
		if (knownForTitles == null) {
			knownForTitles = new EObjectResolvingEList<Title>(Title.class, this, ImdbPackage.PERSON__KNOWN_FOR_TITLES);
		}
		return knownForTitles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Involvement> getInvolvement() {
		if (involvement == null) {
			involvement = new EObjectWithInverseResolvingEList<Involvement>(Involvement.class, this, ImdbPackage.PERSON__INVOLVEMENT, ImdbPackage.INVOLVEMENT__PERSON);
		}
		return involvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imdb getImdb() {
		if (eContainerFeatureID() != ImdbPackage.PERSON__IMDB) return null;
		return (Imdb)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImdb(Imdb newImdb, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImdb, ImdbPackage.PERSON__IMDB, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImdb(Imdb newImdb) {
		if (newImdb != eInternalContainer() || (eContainerFeatureID() != ImdbPackage.PERSON__IMDB && newImdb != null)) {
			if (EcoreUtil.isAncestor(this, newImdb))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImdb != null)
				msgs = ((InternalEObject)newImdb).eInverseAdd(this, ImdbPackage.IMDB__PERSONS, Imdb.class, msgs);
			msgs = basicSetImdb(newImdb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.PERSON__IMDB, newImdb, newImdb));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.PERSON__ID, oldID, id));
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
			case ImdbPackage.PERSON__INVOLVEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvolvement()).basicAdd(otherEnd, msgs);
			case ImdbPackage.PERSON__IMDB:
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
			case ImdbPackage.PERSON__INVOLVEMENT:
				return ((InternalEList<?>)getInvolvement()).basicRemove(otherEnd, msgs);
			case ImdbPackage.PERSON__IMDB:
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
			case ImdbPackage.PERSON__IMDB:
				return eInternalContainer().eInverseRemove(this, ImdbPackage.IMDB__PERSONS, Imdb.class, msgs);
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
			case ImdbPackage.PERSON__NAME:
				return getName();
			case ImdbPackage.PERSON__BIRTH_YEAR:
				return getBirthYear();
			case ImdbPackage.PERSON__DEATH_YEAR:
				return getDeathYear();
			case ImdbPackage.PERSON__PROFESSIONS:
				return getProfessions();
			case ImdbPackage.PERSON__KNOWN_FOR_TITLES:
				return getKnownForTitles();
			case ImdbPackage.PERSON__INVOLVEMENT:
				return getInvolvement();
			case ImdbPackage.PERSON__IMDB:
				return getImdb();
			case ImdbPackage.PERSON__ID:
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
			case ImdbPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case ImdbPackage.PERSON__BIRTH_YEAR:
				setBirthYear((Integer)newValue);
				return;
			case ImdbPackage.PERSON__DEATH_YEAR:
				setDeathYear((Integer)newValue);
				return;
			case ImdbPackage.PERSON__PROFESSIONS:
				getProfessions().clear();
				getProfessions().addAll((Collection<? extends String>)newValue);
				return;
			case ImdbPackage.PERSON__KNOWN_FOR_TITLES:
				getKnownForTitles().clear();
				getKnownForTitles().addAll((Collection<? extends Title>)newValue);
				return;
			case ImdbPackage.PERSON__INVOLVEMENT:
				getInvolvement().clear();
				getInvolvement().addAll((Collection<? extends Involvement>)newValue);
				return;
			case ImdbPackage.PERSON__IMDB:
				setImdb((Imdb)newValue);
				return;
			case ImdbPackage.PERSON__ID:
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
			case ImdbPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImdbPackage.PERSON__BIRTH_YEAR:
				setBirthYear(BIRTH_YEAR_EDEFAULT);
				return;
			case ImdbPackage.PERSON__DEATH_YEAR:
				setDeathYear(DEATH_YEAR_EDEFAULT);
				return;
			case ImdbPackage.PERSON__PROFESSIONS:
				getProfessions().clear();
				return;
			case ImdbPackage.PERSON__KNOWN_FOR_TITLES:
				getKnownForTitles().clear();
				return;
			case ImdbPackage.PERSON__INVOLVEMENT:
				getInvolvement().clear();
				return;
			case ImdbPackage.PERSON__IMDB:
				setImdb((Imdb)null);
				return;
			case ImdbPackage.PERSON__ID:
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
			case ImdbPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImdbPackage.PERSON__BIRTH_YEAR:
				return birthYear != BIRTH_YEAR_EDEFAULT;
			case ImdbPackage.PERSON__DEATH_YEAR:
				return deathYear != DEATH_YEAR_EDEFAULT;
			case ImdbPackage.PERSON__PROFESSIONS:
				return professions != null && !professions.isEmpty();
			case ImdbPackage.PERSON__KNOWN_FOR_TITLES:
				return knownForTitles != null && !knownForTitles.isEmpty();
			case ImdbPackage.PERSON__INVOLVEMENT:
				return involvement != null && !involvement.isEmpty();
			case ImdbPackage.PERSON__IMDB:
				return getImdb() != null;
			case ImdbPackage.PERSON__ID:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", birthYear: ");
		result.append(birthYear);
		result.append(", deathYear: ");
		result.append(deathYear);
		result.append(", professions: ");
		result.append(professions);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
