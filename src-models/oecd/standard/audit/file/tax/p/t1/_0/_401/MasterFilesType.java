/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Files Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.MasterFilesType#getGeneralLedgerAccounts <em>General Ledger Accounts</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.MasterFilesType#getCustomer <em>Customer</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.MasterFilesType#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.MasterFilesType#getProduct <em>Product</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.MasterFilesType#getTaxTable <em>Tax Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getMasterFilesType()
 * @model extendedMetaData="name='MasterFiles_._type' kind='elementOnly'"
 * @generated
 */
public interface MasterFilesType extends EObject {
	/**
	 * Returns the value of the '<em><b>General Ledger Accounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Ledger Accounts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Ledger Accounts</em>' containment reference.
	 * @see #setGeneralLedgerAccounts(GeneralLedgerAccountsType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getMasterFilesType_GeneralLedgerAccounts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GeneralLedgerAccounts' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralLedgerAccountsType getGeneralLedgerAccounts();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.MasterFilesType#getGeneralLedgerAccounts <em>General Ledger Accounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Ledger Accounts</em>' containment reference.
	 * @see #getGeneralLedgerAccounts()
	 * @generated
	 */
	void setGeneralLedgerAccounts(GeneralLedgerAccountsType value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.CustomerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getMasterFilesType_Customer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Customer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CustomerType> getCustomer();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.SupplierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getMasterFilesType_Supplier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Supplier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupplierType> getSupplier();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getMasterFilesType_Product()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Product' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductType> getProduct();

	/**
	 * Returns the value of the '<em><b>Tax Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Table</em>' containment reference.
	 * @see #setTaxTable(TaxTableType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getMasterFilesType_TaxTable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TaxTable' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxTableType getTaxTable();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.MasterFilesType#getTaxTable <em>Tax Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Table</em>' containment reference.
	 * @see #getTaxTable()
	 * @generated
	 */
	void setTaxTable(TaxTableType value);

} // MasterFilesType
