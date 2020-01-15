/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._301.OrderReferences;
import oecd.standard.audit.file.tax.p.t1._0._301._301Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order References</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.OrderReferencesImpl#getOriginatingON <em>Originating ON</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.OrderReferencesImpl#getOrderDate <em>Order Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderReferencesImpl extends EObjectImpl implements OrderReferences {
	/**
	 * The default value of the '{@link #getOriginatingON() <em>Originating ON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingON()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINATING_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginatingON() <em>Originating ON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingON()
	 * @generated
	 * @ordered
	 */
	protected String originatingON = ORIGINATING_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ORDER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar orderDate = ORDER_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderReferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _301Package.eINSTANCE.getOrderReferences();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginatingON() {
		return originatingON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginatingON(String newOriginatingON) {
		String oldOriginatingON = originatingON;
		originatingON = newOriginatingON;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.ORDER_REFERENCES__ORIGINATING_ON, oldOriginatingON, originatingON));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getOrderDate() {
		return orderDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderDate(XMLGregorianCalendar newOrderDate) {
		XMLGregorianCalendar oldOrderDate = orderDate;
		orderDate = newOrderDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.ORDER_REFERENCES__ORDER_DATE, oldOrderDate, orderDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _301Package.ORDER_REFERENCES__ORIGINATING_ON:
				return getOriginatingON();
			case _301Package.ORDER_REFERENCES__ORDER_DATE:
				return getOrderDate();
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
			case _301Package.ORDER_REFERENCES__ORIGINATING_ON:
				setOriginatingON((String)newValue);
				return;
			case _301Package.ORDER_REFERENCES__ORDER_DATE:
				setOrderDate((XMLGregorianCalendar)newValue);
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
			case _301Package.ORDER_REFERENCES__ORIGINATING_ON:
				setOriginatingON(ORIGINATING_ON_EDEFAULT);
				return;
			case _301Package.ORDER_REFERENCES__ORDER_DATE:
				setOrderDate(ORDER_DATE_EDEFAULT);
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
			case _301Package.ORDER_REFERENCES__ORIGINATING_ON:
				return ORIGINATING_ON_EDEFAULT == null ? originatingON != null : !ORIGINATING_ON_EDEFAULT.equals(originatingON);
			case _301Package.ORDER_REFERENCES__ORDER_DATE:
				return ORDER_DATE_EDEFAULT == null ? orderDate != null : !ORDER_DATE_EDEFAULT.equals(orderDate);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (originatingON: ");
		result.append(originatingON);
		result.append(", orderDate: ");
		result.append(orderDate);
		result.append(')');
		return result.toString();
	}

} //OrderReferencesImpl
