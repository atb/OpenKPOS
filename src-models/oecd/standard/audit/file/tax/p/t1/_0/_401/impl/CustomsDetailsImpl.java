/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.util.Collection;

import oecd.standard.audit.file.tax.p.t1._0._401.CustomsDetails;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customs Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.CustomsDetailsImpl#getCNCode <em>CN Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.CustomsDetailsImpl#getUNNumber <em>UN Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomsDetailsImpl extends EObjectImpl implements CustomsDetails {
	/**
	 * The cached value of the '{@link #getCNCode() <em>CN Code</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNCode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cNCode;

	/**
	 * The cached value of the '{@link #getUNNumber() <em>UN Number</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<String> uNNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomsDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getCustomsDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCNCode() {
		if (cNCode == null) {
			cNCode = new EDataTypeEList<String>(String.class, this, _401Package.CUSTOMS_DETAILS__CN_CODE);
		}
		return cNCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUNNumber() {
		if (uNNumber == null) {
			uNNumber = new EDataTypeEList<String>(String.class, this, _401Package.CUSTOMS_DETAILS__UN_NUMBER);
		}
		return uNNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _401Package.CUSTOMS_DETAILS__CN_CODE:
				return getCNCode();
			case _401Package.CUSTOMS_DETAILS__UN_NUMBER:
				return getUNNumber();
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
			case _401Package.CUSTOMS_DETAILS__CN_CODE:
				getCNCode().clear();
				getCNCode().addAll((Collection<? extends String>)newValue);
				return;
			case _401Package.CUSTOMS_DETAILS__UN_NUMBER:
				getUNNumber().clear();
				getUNNumber().addAll((Collection<? extends String>)newValue);
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
			case _401Package.CUSTOMS_DETAILS__CN_CODE:
				getCNCode().clear();
				return;
			case _401Package.CUSTOMS_DETAILS__UN_NUMBER:
				getUNNumber().clear();
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
			case _401Package.CUSTOMS_DETAILS__CN_CODE:
				return cNCode != null && !cNCode.isEmpty();
			case _401Package.CUSTOMS_DETAILS__UN_NUMBER:
				return uNNumber != null && !uNNumber.isEmpty();
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
		result.append(" (cNCode: ");
		result.append(cNCode);
		result.append(", uNNumber: ");
		result.append(uNNumber);
		result.append(')');
		return result.toString();
	}

} //CustomsDetailsImpl
