/**
 */
package imdb.impl;

import imdb.ImdbPackage;
import imdb.Involvement;
import imdb.Person;
import imdb.Title;

import imdb.TvSeries;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.InvolvementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link imdb.impl.InvolvementImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link imdb.impl.InvolvementImpl#getJobCategory <em>Job Category</em>}</li>
 *   <li>{@link imdb.impl.InvolvementImpl#getJob <em>Job</em>}</li>
 *   <li>{@link imdb.impl.InvolvementImpl#getCharacter <em>Character</em>}</li>
 *   <li>{@link imdb.impl.InvolvementImpl#getTvseries <em>Tvseries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvolvementImpl extends MinimalEObjectImpl.Container implements Involvement {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The default value of the '{@link #getJobCategory() <em>Job Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobCategory() <em>Job Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobCategory()
	 * @generated
	 * @ordered
	 */
	protected String jobCategory = JOB_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getJob() <em>Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected String job = JOB_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacter() <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacter()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacter() <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacter()
	 * @generated
	 * @ordered
	 */
	protected String character = CHARACTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTvseries() <em>Tvseries</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTvseries()
	 * @generated
	 * @ordered
	 */
	protected TvSeries tvseries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.INVOLVEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Title getTitle() {
		if (eContainerFeatureID() != ImdbPackage.INVOLVEMENT__TITLE) return null;
		return (Title)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(Title newTitle, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTitle, ImdbPackage.INVOLVEMENT__TITLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(Title newTitle) {
		if (newTitle != eInternalContainer() || (eContainerFeatureID() != ImdbPackage.INVOLVEMENT__TITLE && newTitle != null)) {
			if (EcoreUtil.isAncestor(this, newTitle))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, ImdbPackage.TITLE__INVOLVEMENTS, Title.class, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.INVOLVEMENT__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImdbPackage.INVOLVEMENT__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImdbPackage.INVOLVEMENT__PERSON, oldPerson, newPerson);
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
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, ImdbPackage.PERSON__INVOLVEMENT, Person.class, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, ImdbPackage.PERSON__INVOLVEMENT, Person.class, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.INVOLVEMENT__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobCategory() {
		return jobCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobCategory(String newJobCategory) {
		String oldJobCategory = jobCategory;
		jobCategory = newJobCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.INVOLVEMENT__JOB_CATEGORY, oldJobCategory, jobCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJob() {
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJob(String newJob) {
		String oldJob = job;
		job = newJob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.INVOLVEMENT__JOB, oldJob, job));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharacter() {
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacter(String newCharacter) {
		String oldCharacter = character;
		character = newCharacter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.INVOLVEMENT__CHARACTER, oldCharacter, character));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TvSeries getTvseries() {
		if (tvseries != null && tvseries.eIsProxy()) {
			InternalEObject oldTvseries = (InternalEObject)tvseries;
			tvseries = (TvSeries)eResolveProxy(oldTvseries);
			if (tvseries != oldTvseries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImdbPackage.INVOLVEMENT__TVSERIES, oldTvseries, tvseries));
			}
		}
		return tvseries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TvSeries basicGetTvseries() {
		return tvseries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTvseries(TvSeries newTvseries) {
		TvSeries oldTvseries = tvseries;
		tvseries = newTvseries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.INVOLVEMENT__TVSERIES, oldTvseries, tvseries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImdbPackage.INVOLVEMENT__TITLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTitle((Title)otherEnd, msgs);
			case ImdbPackage.INVOLVEMENT__PERSON:
				if (person != null)
					msgs = ((InternalEObject)person).eInverseRemove(this, ImdbPackage.PERSON__INVOLVEMENT, Person.class, msgs);
				return basicSetPerson((Person)otherEnd, msgs);
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
			case ImdbPackage.INVOLVEMENT__TITLE:
				return basicSetTitle(null, msgs);
			case ImdbPackage.INVOLVEMENT__PERSON:
				return basicSetPerson(null, msgs);
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
			case ImdbPackage.INVOLVEMENT__TITLE:
				return eInternalContainer().eInverseRemove(this, ImdbPackage.TITLE__INVOLVEMENTS, Title.class, msgs);
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
			case ImdbPackage.INVOLVEMENT__TITLE:
				return getTitle();
			case ImdbPackage.INVOLVEMENT__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case ImdbPackage.INVOLVEMENT__JOB_CATEGORY:
				return getJobCategory();
			case ImdbPackage.INVOLVEMENT__JOB:
				return getJob();
			case ImdbPackage.INVOLVEMENT__CHARACTER:
				return getCharacter();
			case ImdbPackage.INVOLVEMENT__TVSERIES:
				if (resolve) return getTvseries();
				return basicGetTvseries();
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
			case ImdbPackage.INVOLVEMENT__TITLE:
				setTitle((Title)newValue);
				return;
			case ImdbPackage.INVOLVEMENT__PERSON:
				setPerson((Person)newValue);
				return;
			case ImdbPackage.INVOLVEMENT__JOB_CATEGORY:
				setJobCategory((String)newValue);
				return;
			case ImdbPackage.INVOLVEMENT__JOB:
				setJob((String)newValue);
				return;
			case ImdbPackage.INVOLVEMENT__CHARACTER:
				setCharacter((String)newValue);
				return;
			case ImdbPackage.INVOLVEMENT__TVSERIES:
				setTvseries((TvSeries)newValue);
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
			case ImdbPackage.INVOLVEMENT__TITLE:
				setTitle((Title)null);
				return;
			case ImdbPackage.INVOLVEMENT__PERSON:
				setPerson((Person)null);
				return;
			case ImdbPackage.INVOLVEMENT__JOB_CATEGORY:
				setJobCategory(JOB_CATEGORY_EDEFAULT);
				return;
			case ImdbPackage.INVOLVEMENT__JOB:
				setJob(JOB_EDEFAULT);
				return;
			case ImdbPackage.INVOLVEMENT__CHARACTER:
				setCharacter(CHARACTER_EDEFAULT);
				return;
			case ImdbPackage.INVOLVEMENT__TVSERIES:
				setTvseries((TvSeries)null);
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
			case ImdbPackage.INVOLVEMENT__TITLE:
				return getTitle() != null;
			case ImdbPackage.INVOLVEMENT__PERSON:
				return person != null;
			case ImdbPackage.INVOLVEMENT__JOB_CATEGORY:
				return JOB_CATEGORY_EDEFAULT == null ? jobCategory != null : !JOB_CATEGORY_EDEFAULT.equals(jobCategory);
			case ImdbPackage.INVOLVEMENT__JOB:
				return JOB_EDEFAULT == null ? job != null : !JOB_EDEFAULT.equals(job);
			case ImdbPackage.INVOLVEMENT__CHARACTER:
				return CHARACTER_EDEFAULT == null ? character != null : !CHARACTER_EDEFAULT.equals(character);
			case ImdbPackage.INVOLVEMENT__TVSERIES:
				return tvseries != null;
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
		result.append(" (jobCategory: ");
		result.append(jobCategory);
		result.append(", job: ");
		result.append(job);
		result.append(", character: ");
		result.append(character);
		result.append(')');
		return result.toString();
	}

} //InvolvementImpl
