/**
 */
package imdb.impl;

import imdb.Genre;
import imdb.Imdb;
import imdb.ImdbPackage;

import imdb.Person;
import imdb.Title;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imdb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.ImdbImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link imdb.impl.ImdbImpl#getGenres <em>Genres</em>}</li>
 *   <li>{@link imdb.impl.ImdbImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImdbImpl extends MinimalEObjectImpl.Container implements Imdb {
	/**
	 * The cached value of the '{@link #getTitles() <em>Titles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitles()
	 * @generated
	 * @ordered
	 */
	protected EList<Title> titles;
	/**
	 * The cached value of the '{@link #getGenres() <em>Genres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenres()
	 * @generated
	 * @ordered
	 */
	protected EList<Genre> genres;
	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImdbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.IMDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Title> getTitles() {
		if (titles == null) {
			titles = new EObjectContainmentWithInverseEList<Title>(Title.class, this, ImdbPackage.IMDB__TITLES, ImdbPackage.TITLE__IMDB);
		}
		return titles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Genre> getGenres() {
		if (genres == null) {
			genres = new EObjectContainmentWithInverseEList<Genre>(Genre.class, this, ImdbPackage.IMDB__GENRES, ImdbPackage.GENRE__IMDB);
		}
		return genres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentWithInverseEList<Person>(Person.class, this, ImdbPackage.IMDB__PERSONS, ImdbPackage.PERSON__IMDB);
		}
		return persons;
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
			case ImdbPackage.IMDB__TITLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTitles()).basicAdd(otherEnd, msgs);
			case ImdbPackage.IMDB__GENRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenres()).basicAdd(otherEnd, msgs);
			case ImdbPackage.IMDB__PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersons()).basicAdd(otherEnd, msgs);
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
			case ImdbPackage.IMDB__TITLES:
				return ((InternalEList<?>)getTitles()).basicRemove(otherEnd, msgs);
			case ImdbPackage.IMDB__GENRES:
				return ((InternalEList<?>)getGenres()).basicRemove(otherEnd, msgs);
			case ImdbPackage.IMDB__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
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
			case ImdbPackage.IMDB__TITLES:
				return getTitles();
			case ImdbPackage.IMDB__GENRES:
				return getGenres();
			case ImdbPackage.IMDB__PERSONS:
				return getPersons();
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
			case ImdbPackage.IMDB__TITLES:
				getTitles().clear();
				getTitles().addAll((Collection<? extends Title>)newValue);
				return;
			case ImdbPackage.IMDB__GENRES:
				getGenres().clear();
				getGenres().addAll((Collection<? extends Genre>)newValue);
				return;
			case ImdbPackage.IMDB__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
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
			case ImdbPackage.IMDB__TITLES:
				getTitles().clear();
				return;
			case ImdbPackage.IMDB__GENRES:
				getGenres().clear();
				return;
			case ImdbPackage.IMDB__PERSONS:
				getPersons().clear();
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
			case ImdbPackage.IMDB__TITLES:
				return titles != null && !titles.isEmpty();
			case ImdbPackage.IMDB__GENRES:
				return genres != null && !genres.isEmpty();
			case ImdbPackage.IMDB__PERSONS:
				return persons != null && !persons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImdbImpl
