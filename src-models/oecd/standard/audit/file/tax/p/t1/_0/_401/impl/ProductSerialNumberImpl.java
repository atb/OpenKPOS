/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.util.Collection;

import oecd.standard.audit.file.tax.p.t1._0._401.ProductSerialNumber;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Serial Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ProductSerialNumberImpl#getSerialNumber <em>Serial Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductSerialNumberImpl extends EObjectImpl implements ProductSerialNumber {
	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serialNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSerialNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getProductSerialNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSerialNumber() {
		if (serialNumber == null) {
			serialNumber = new EDataTypeEList<String>(String.class, this, _401Package.PRODUCT_SERIAL_NUMBER__SERIAL_NUMBER);
		}
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _401Package.PRODUCT_SERIAL_NUMBER__SERIAL_NUMBER:
				return getSerialNumber();
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
			case _401Package.PRODUCT_SERIAL_NUMBER__SERIAL_NUMBER:
				getSerialNumber().clear();
				getSerialNumber().addAll((Collection<? extends String>)newValue);
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
			case _401Package.PRODUCT_SERIAL_NUMBER__SERIAL_NUMBER:
				getSerialNumber().clear();
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
			case _401Package.PRODUCT_SERIAL_NUMBER__SERIAL_NUMBER:
				return serialNumber != null && !serialNumber.isEmpty();
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
		result.append(" (serialNumber: ");
		result.append(serialNumber);
		result.append(')');
		return result.toString();
	}

} //ProductSerialNumberImpl
