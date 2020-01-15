/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201.impl;

import java.util.Collection;

import oecd.standard.audit.file.tax.p.t1._0._201.TaxTableEntryType;
import oecd.standard.audit.file.tax.p.t1._0._201.TaxTableType;
import oecd.standard.audit.file.tax.p.t1._0._201._201Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.TaxTableTypeImpl#getTaxTableEntry <em>Tax Table Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaxTableTypeImpl extends EObjectImpl implements TaxTableType {
	/**
	 * The cached value of the '{@link #getTaxTableEntry() <em>Tax Table Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxTableEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<TaxTableEntryType> taxTableEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxTableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _201Package.eINSTANCE.getTaxTableType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaxTableEntryType> getTaxTableEntry() {
		if (taxTableEntry == null) {
			taxTableEntry = new EObjectContainmentEList<TaxTableEntryType>(TaxTableEntryType.class, this, _201Package.TAX_TABLE_TYPE__TAX_TABLE_ENTRY);
		}
		return taxTableEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _201Package.TAX_TABLE_TYPE__TAX_TABLE_ENTRY:
				return ((InternalEList<?>)getTaxTableEntry()).basicRemove(otherEnd, msgs);
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
			case _201Package.TAX_TABLE_TYPE__TAX_TABLE_ENTRY:
				return getTaxTableEntry();
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
			case _201Package.TAX_TABLE_TYPE__TAX_TABLE_ENTRY:
				getTaxTableEntry().clear();
				getTaxTableEntry().addAll((Collection<? extends TaxTableEntryType>)newValue);
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
			case _201Package.TAX_TABLE_TYPE__TAX_TABLE_ENTRY:
				getTaxTableEntry().clear();
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
			case _201Package.TAX_TABLE_TYPE__TAX_TABLE_ENTRY:
				return taxTableEntry != null && !taxTableEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaxTableTypeImpl
