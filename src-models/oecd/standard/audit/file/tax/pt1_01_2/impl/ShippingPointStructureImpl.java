/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.pt1_01_2.AddressStructure;
import oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package;
import oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipping Point Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.ShippingPointStructureImpl#getDeliveryID <em>Delivery ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.ShippingPointStructureImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.ShippingPointStructureImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShippingPointStructureImpl extends EObjectImpl implements ShippingPointStructure {
	/**
	 * The default value of the '{@link #getDeliveryID() <em>Delivery ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryID()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryID() <em>Delivery ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryID()
	 * @generated
	 * @ordered
	 */
	protected String deliveryID = DELIVERY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar deliveryDate = DELIVERY_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressStructure address;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShippingPointStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01_2Package.Literals.SHIPPING_POINT_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeliveryID() {
		return deliveryID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryID(String newDeliveryID) {
		String oldDeliveryID = deliveryID;
		deliveryID = newDeliveryID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__DELIVERY_ID, oldDeliveryID, deliveryID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(XMLGregorianCalendar newDeliveryDate) {
		XMLGregorianCalendar oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__DELIVERY_DATE, oldDeliveryDate, deliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressStructure newAddress, NotificationChain msgs) {
		AddressStructure oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(AddressStructure newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__ADDRESS:
				return basicSetAddress(null, msgs);
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
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__DELIVERY_ID:
				return getDeliveryID();
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__DELIVERY_DATE:
				return getDeliveryDate();
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__ADDRESS:
				return getAddress();
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
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__DELIVERY_ID:
				setDeliveryID((String)newValue);
				return;
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__DELIVERY_DATE:
				setDeliveryDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__ADDRESS:
				setAddress((AddressStructure)newValue);
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
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__DELIVERY_ID:
				setDeliveryID(DELIVERY_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__ADDRESS:
				setAddress((AddressStructure)null);
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
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__DELIVERY_ID:
				return DELIVERY_ID_EDEFAULT == null ? deliveryID != null : !DELIVERY_ID_EDEFAULT.equals(deliveryID);
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE__ADDRESS:
				return address != null;
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
		result.append(" (deliveryID: ");
		result.append(deliveryID);
		result.append(", deliveryDate: ");
		result.append(deliveryDate);
		result.append(')');
		return result.toString();
	}

} //ShippingPointStructureImpl
