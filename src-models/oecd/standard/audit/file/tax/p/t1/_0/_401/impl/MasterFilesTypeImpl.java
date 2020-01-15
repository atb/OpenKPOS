/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.util.Collection;

import oecd.standard.audit.file.tax.p.t1._0._401.CustomerType;
import oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerAccountsType;
import oecd.standard.audit.file.tax.p.t1._0._401.MasterFilesType;
import oecd.standard.audit.file.tax.p.t1._0._401.ProductType;
import oecd.standard.audit.file.tax.p.t1._0._401.SupplierType;
import oecd.standard.audit.file.tax.p.t1._0._401.TaxTableType;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Files Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.MasterFilesTypeImpl#getGeneralLedgerAccounts <em>General Ledger Accounts</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.MasterFilesTypeImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.MasterFilesTypeImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.MasterFilesTypeImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.MasterFilesTypeImpl#getTaxTable <em>Tax Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasterFilesTypeImpl extends EObjectImpl implements MasterFilesType {
	/**
	 * The cached value of the '{@link #getGeneralLedgerAccounts() <em>General Ledger Accounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralLedgerAccounts()
	 * @generated
	 * @ordered
	 */
	protected GeneralLedgerAccountsType generalLedgerAccounts;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerType> customer;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplierType> supplier;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductType> product;

	/**
	 * The cached value of the '{@link #getTaxTable() <em>Tax Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxTable()
	 * @generated
	 * @ordered
	 */
	protected TaxTableType taxTable;

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
		return _401Package.eINSTANCE.getMasterFilesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLedgerAccountsType getGeneralLedgerAccounts() {
		return generalLedgerAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralLedgerAccounts(GeneralLedgerAccountsType newGeneralLedgerAccounts, NotificationChain msgs) {
		GeneralLedgerAccountsType oldGeneralLedgerAccounts = generalLedgerAccounts;
		generalLedgerAccounts = newGeneralLedgerAccounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.MASTER_FILES_TYPE__GENERAL_LEDGER_ACCOUNTS, oldGeneralLedgerAccounts, newGeneralLedgerAccounts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralLedgerAccounts(GeneralLedgerAccountsType newGeneralLedgerAccounts) {
		if (newGeneralLedgerAccounts != generalLedgerAccounts) {
			NotificationChain msgs = null;
			if (generalLedgerAccounts != null)
				msgs = ((InternalEObject)generalLedgerAccounts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.MASTER_FILES_TYPE__GENERAL_LEDGER_ACCOUNTS, null, msgs);
			if (newGeneralLedgerAccounts != null)
				msgs = ((InternalEObject)newGeneralLedgerAccounts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.MASTER_FILES_TYPE__GENERAL_LEDGER_ACCOUNTS, null, msgs);
			msgs = basicSetGeneralLedgerAccounts(newGeneralLedgerAccounts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.MASTER_FILES_TYPE__GENERAL_LEDGER_ACCOUNTS, newGeneralLedgerAccounts, newGeneralLedgerAccounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerType> getCustomer() {
		if (customer == null) {
			customer = new EObjectContainmentEList<CustomerType>(CustomerType.class, this, _401Package.MASTER_FILES_TYPE__CUSTOMER);
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplierType> getSupplier() {
		if (supplier == null) {
			supplier = new EObjectContainmentEList<SupplierType>(SupplierType.class, this, _401Package.MASTER_FILES_TYPE__SUPPLIER);
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductType> getProduct() {
		if (product == null) {
			product = new EObjectContainmentEList<ProductType>(ProductType.class, this, _401Package.MASTER_FILES_TYPE__PRODUCT);
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTableType getTaxTable() {
		return taxTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaxTable(TaxTableType newTaxTable, NotificationChain msgs) {
		TaxTableType oldTaxTable = taxTable;
		taxTable = newTaxTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.MASTER_FILES_TYPE__TAX_TABLE, oldTaxTable, newTaxTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxTable(TaxTableType newTaxTable) {
		if (newTaxTable != taxTable) {
			NotificationChain msgs = null;
			if (taxTable != null)
				msgs = ((InternalEObject)taxTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.MASTER_FILES_TYPE__TAX_TABLE, null, msgs);
			if (newTaxTable != null)
				msgs = ((InternalEObject)newTaxTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.MASTER_FILES_TYPE__TAX_TABLE, null, msgs);
			msgs = basicSetTaxTable(newTaxTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.MASTER_FILES_TYPE__TAX_TABLE, newTaxTable, newTaxTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.MASTER_FILES_TYPE__GENERAL_LEDGER_ACCOUNTS:
				return basicSetGeneralLedgerAccounts(null, msgs);
			case _401Package.MASTER_FILES_TYPE__CUSTOMER:
				return ((InternalEList<?>)getCustomer()).basicRemove(otherEnd, msgs);
			case _401Package.MASTER_FILES_TYPE__SUPPLIER:
				return ((InternalEList<?>)getSupplier()).basicRemove(otherEnd, msgs);
			case _401Package.MASTER_FILES_TYPE__PRODUCT:
				return ((InternalEList<?>)getProduct()).basicRemove(otherEnd, msgs);
			case _401Package.MASTER_FILES_TYPE__TAX_TABLE:
				return basicSetTaxTable(null, msgs);
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
			case _401Package.MASTER_FILES_TYPE__GENERAL_LEDGER_ACCOUNTS:
				return getGeneralLedgerAccounts();
			case _401Package.MASTER_FILES_TYPE__CUSTOMER:
				return getCustomer();
			case _401Package.MASTER_FILES_TYPE__SUPPLIER:
				return getSupplier();
			case _401Package.MASTER_FILES_TYPE__PRODUCT:
				return getProduct();
			case _401Package.MASTER_FILES_TYPE__TAX_TABLE:
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
			case _401Package.MASTER_FILES_TYPE__GENERAL_LEDGER_ACCOUNTS:
				setGeneralLedgerAccounts((GeneralLedgerAccountsType)newValue);
				return;
			case _401Package.MASTER_FILES_TYPE__CUSTOMER:
				getCustomer().clear();
				getCustomer().addAll((Collection<? extends CustomerType>)newValue);
				return;
			case _401Package.MASTER_FILES_TYPE__SUPPLIER:
				getSupplier().clear();
				getSupplier().addAll((Collection<? extends SupplierType>)newValue);
				return;
			case _401Package.MASTER_FILES_TYPE__PRODUCT:
				getProduct().clear();
				getProduct().addAll((Collection<? extends ProductType>)newValue);
				return;
			case _401Package.MASTER_FILES_TYPE__TAX_TABLE:
				setTaxTable((TaxTableType)newValue);
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
			case _401Package.MASTER_FILES_TYPE__GENERAL_LEDGER_ACCOUNTS:
				setGeneralLedgerAccounts((GeneralLedgerAccountsType)null);
				return;
			case _401Package.MASTER_FILES_TYPE__CUSTOMER:
				getCustomer().clear();
				return;
			case _401Package.MASTER_FILES_TYPE__SUPPLIER:
				getSupplier().clear();
				return;
			case _401Package.MASTER_FILES_TYPE__PRODUCT:
				getProduct().clear();
				return;
			case _401Package.MASTER_FILES_TYPE__TAX_TABLE:
				setTaxTable((TaxTableType)null);
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
			case _401Package.MASTER_FILES_TYPE__GENERAL_LEDGER_ACCOUNTS:
				return generalLedgerAccounts != null;
			case _401Package.MASTER_FILES_TYPE__CUSTOMER:
				return customer != null && !customer.isEmpty();
			case _401Package.MASTER_FILES_TYPE__SUPPLIER:
				return supplier != null && !supplier.isEmpty();
			case _401Package.MASTER_FILES_TYPE__PRODUCT:
				return product != null && !product.isEmpty();
			case _401Package.MASTER_FILES_TYPE__TAX_TABLE:
				return taxTable != null;
		}
		return super.eIsSet(featureID);
	}

} //MasterFilesTypeImpl
