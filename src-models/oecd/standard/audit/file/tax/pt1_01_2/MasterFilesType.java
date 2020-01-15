/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Files Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getGroup <em>Group</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getGeneralLedger <em>General Ledger</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getCustomer <em>Customer</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getProduct <em>Product</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getTaxTable <em>Tax Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getMasterFilesType()
 * @model extendedMetaData="name='MasterFiles_._type' kind='elementOnly'"
 * @generated
 */
public interface MasterFilesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getMasterFilesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>General Ledger</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Ledger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Ledger</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getMasterFilesType_GeneralLedger()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeneralLedger' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GeneralLedgerType> getGeneralLedger();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getMasterFilesType_Customer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Customer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CustomerType> getCustomer();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getMasterFilesType_Supplier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Supplier' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SupplierType> getSupplier();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.pt1_01_2.ProductType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getMasterFilesType_Product()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Product' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ProductType> getProduct();

	/**
	 * Returns the value of the '<em><b>Tax Table</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Table</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getMasterFilesType_TaxTable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxTable' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TaxTableType> getTaxTable();

} // MasterFilesType
