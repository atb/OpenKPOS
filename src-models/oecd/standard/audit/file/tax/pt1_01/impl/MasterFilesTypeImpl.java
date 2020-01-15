/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01.impl;

import java.util.Collection;

import oecd.standard.audit.file.tax.pt1_01.CustomerType;
import oecd.standard.audit.file.tax.pt1_01.GeneralLedgerType;
import oecd.standard.audit.file.tax.pt1_01.MasterFilesType;
import oecd.standard.audit.file.tax.pt1_01.ProductType;
import oecd.standard.audit.file.tax.pt1_01.Pt1_01Package;
import oecd.standard.audit.file.tax.pt1_01.SupplierType;
import oecd.standard.audit.file.tax.pt1_01.TaxTableType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Files Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.MasterFilesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.MasterFilesTypeImpl#getGeneralLedger <em>General Ledger</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.MasterFilesTypeImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.MasterFilesTypeImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.MasterFilesTypeImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.MasterFilesTypeImpl#getTaxTable <em>Tax Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasterFilesTypeImpl extends EObjectImpl implements MasterFilesType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterFilesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01Package.Literals.MASTER_FILES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Pt1_01Package.MASTER_FILES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralLedgerType> getGeneralLedger() {
		return getGroup().list(Pt1_01Package.Literals.MASTER_FILES_TYPE__GENERAL_LEDGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerType> getCustomer() {
		return getGroup().list(Pt1_01Package.Literals.MASTER_FILES_TYPE__CUSTOMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplierType> getSupplier() {
		return getGroup().list(Pt1_01Package.Literals.MASTER_FILES_TYPE__SUPPLIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductType> getProduct() {
		return getGroup().list(Pt1_01Package.Literals.MASTER_FILES_TYPE__PRODUCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaxTableType> getTaxTable() {
		return getGroup().list(Pt1_01Package.Literals.MASTER_FILES_TYPE__TAX_TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pt1_01Package.MASTER_FILES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Pt1_01Package.MASTER_FILES_TYPE__GENERAL_LEDGER:
				return ((InternalEList<?>)getGeneralLedger()).basicRemove(otherEnd, msgs);
			case Pt1_01Package.MASTER_FILES_TYPE__CUSTOMER:
				return ((InternalEList<?>)getCustomer()).basicRemove(otherEnd, msgs);
			case Pt1_01Package.MASTER_FILES_TYPE__SUPPLIER:
				return ((InternalEList<?>)getSupplier()).basicRemove(otherEnd, msgs);
			case Pt1_01Package.MASTER_FILES_TYPE__PRODUCT:
				return ((InternalEList<?>)getProduct()).basicRemove(otherEnd, msgs);
			case Pt1_01Package.MASTER_FILES_TYPE__TAX_TABLE:
				return ((InternalEList<?>)getTaxTable()).basicRemove(otherEnd, msgs);
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
			case Pt1_01Package.MASTER_FILES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Pt1_01Package.MASTER_FILES_TYPE__GENERAL_LEDGER:
				return getGeneralLedger();
			case Pt1_01Package.MASTER_FILES_TYPE__CUSTOMER:
				return getCustomer();
			case Pt1_01Package.MASTER_FILES_TYPE__SUPPLIER:
				return getSupplier();
			case Pt1_01Package.MASTER_FILES_TYPE__PRODUCT:
				return getProduct();
			case Pt1_01Package.MASTER_FILES_TYPE__TAX_TABLE:
				return getTaxTable();
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
			case Pt1_01Package.MASTER_FILES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Pt1_01Package.MASTER_FILES_TYPE__GENERAL_LEDGER:
				getGeneralLedger().clear();
				getGeneralLedger().addAll((Collection<? extends GeneralLedgerType>)newValue);
				return;
			case Pt1_01Package.MASTER_FILES_TYPE__CUSTOMER:
				getCustomer().clear();
				getCustomer().addAll((Collection<? extends CustomerType>)newValue);
				return;
			case Pt1_01Package.MASTER_FILES_TYPE__SUPPLIER:
				getSupplier().clear();
				getSupplier().addAll((Collection<? extends SupplierType>)newValue);
				return;
			case Pt1_01Package.MASTER_FILES_TYPE__PRODUCT:
				getProduct().clear();
				getProduct().addAll((Collection<? extends ProductType>)newValue);
				return;
			case Pt1_01Package.MASTER_FILES_TYPE__TAX_TABLE:
				getTaxTable().clear();
				getTaxTable().addAll((Collection<? extends TaxTableType>)newValue);
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
			case Pt1_01Package.MASTER_FILES_TYPE__GROUP:
				getGroup().clear();
				return;
			case Pt1_01Package.MASTER_FILES_TYPE__GENERAL_LEDGER:
				getGeneralLedger().clear();
				return;
			case Pt1_01Package.MASTER_FILES_TYPE__CUSTOMER:
				getCustomer().clear();
				return;
			case Pt1_01Package.MASTER_FILES_TYPE__SUPPLIER:
				getSupplier().clear();
				return;
			case Pt1_01Package.MASTER_FILES_TYPE__PRODUCT:
				getProduct().clear();
				return;
			case Pt1_01Package.MASTER_FILES_TYPE__TAX_TABLE:
				getTaxTable().clear();
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
			case Pt1_01Package.MASTER_FILES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Pt1_01Package.MASTER_FILES_TYPE__GENERAL_LEDGER:
				return !getGeneralLedger().isEmpty();
			case Pt1_01Package.MASTER_FILES_TYPE__CUSTOMER:
				return !getCustomer().isEmpty();
			case Pt1_01Package.MASTER_FILES_TYPE__SUPPLIER:
				return !getSupplier().isEmpty();
			case Pt1_01Package.MASTER_FILES_TYPE__PRODUCT:
				return !getProduct().isEmpty();
			case Pt1_01Package.MASTER_FILES_TYPE__TAX_TABLE:
				return !getTaxTable().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //MasterFilesTypeImpl
