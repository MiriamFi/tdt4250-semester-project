/**
 */
package imdb.impl;

import imdb.ImdbPackage;
import imdb.Person;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
	protected static final int DEATH_YEAR_EDEFAULT = 0;
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
		result.append(')');
		return result.toString();
	}

} //PersonImpl
