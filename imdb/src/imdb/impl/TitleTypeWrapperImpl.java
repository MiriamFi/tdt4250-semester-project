/**
 */
package imdb.impl;

import imdb.ImdbPackage;
import imdb.TitleType;
import imdb.TitleTypeWrapper;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Title Type Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.TitleTypeWrapperImpl#getTitleType <em>Title Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TitleTypeWrapperImpl extends MinimalEObjectImpl.Container implements TitleTypeWrapper {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleTypeWrapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.TITLE_TYPE_WRAPPER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.TITLE_TYPE_WRAPPER__TITLE_TYPE, oldTitleType, titleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (obj instanceof TitleTypeWrapper)
			return this.titleType == ((TitleTypeWrapper) obj).getTitleType();
		else if (obj instanceof TitleType)
			return this.titleType == obj;
		else
			return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int hashCode() {
		return this.titleType.hashCode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImdbPackage.TITLE_TYPE_WRAPPER__TITLE_TYPE:
				return getTitleType();
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
			case ImdbPackage.TITLE_TYPE_WRAPPER__TITLE_TYPE:
				setTitleType((TitleType)newValue);
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
			case ImdbPackage.TITLE_TYPE_WRAPPER__TITLE_TYPE:
				setTitleType(TITLE_TYPE_EDEFAULT);
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
			case ImdbPackage.TITLE_TYPE_WRAPPER__TITLE_TYPE:
				return titleType != TITLE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImdbPackage.TITLE_TYPE_WRAPPER___EQUALS__OBJECT:
				return equals(arguments.get(0));
			case ImdbPackage.TITLE_TYPE_WRAPPER___HASH_CODE:
				return hashCode();
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
		result.append(" (titleType: ");
		result.append(titleType);
		result.append(')');
		return result.toString();
	}

} //TitleTypeWrapperImpl
