/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *       <doc:Title xmlns:doc="urn:schemas-basda-org:schema-extensions:documentation">Standard Audit File - Portuguese Version</doc:Title>
 *       <doc:Subject xmlns:doc="urn:schemas-basda-org:schema-extensions:documentation">Standard Audit File - Portuguese Version</doc:Subject>
 *       <doc:Copyright xmlns:doc="urn:schemas-basda-org:schema-extensions:documentation">Copyright OECD</doc:Copyright>
 *       <doc:Version xmlns:doc="urn:schemas-basda-org:schema-extensions:documentation">
 *         <doc:Number>1.03_01</doc:Number>
 *         <doc:Status>Production</doc:Status>
 *       </doc:Version>
 *       <doc:Author xmlns:doc="urn:schemas-basda-org:schema-extensions:documentation">Autoridade Tributaria e Aduaneira</doc:Author>
 *       <doc:ModificationDate xmlns:doc="urn:schemas-basda-org:schema-extensions:documentation">2013-10-01</doc:ModificationDate>
 *     
 * <!-- end-model-doc -->
 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Factory
 * @model kind="package"
 * @generated
 */
public interface _301Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_301";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:OECD:StandardAuditFile-Tax:PT_1.03_01";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "saft";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_301Package eINSTANCE = oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl.init();

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.AddressStructureImpl <em>Address Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.AddressStructureImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getAddressStructure()
	 * @generated
	 */
	int ADDRESS_STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Building Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE__BUILDING_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE__STREET_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE__ADDRESS_DETAIL = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE__CITY = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE__REGION = 5;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE__COUNTRY = 6;

	/**
	 * The number of structural features of the '<em>Address Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.AddressStructurePTImpl <em>Address Structure PT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.AddressStructurePTImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getAddressStructurePT()
	 * @generated
	 */
	int ADDRESS_STRUCTURE_PT = 1;

	/**
	 * The feature id for the '<em><b>Building Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE_PT__BUILDING_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE_PT__STREET_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE_PT__ADDRESS_DETAIL = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE_PT__CITY = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE_PT__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE_PT__REGION = 5;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE_PT__COUNTRY = 6;

	/**
	 * The number of structural features of the '<em>Address Structure PT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_STRUCTURE_PT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.AuditFileTypeImpl <em>Audit File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.AuditFileTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getAuditFileType()
	 * @generated
	 */
	int AUDIT_FILE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_FILE_TYPE__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Master Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_FILE_TYPE__MASTER_FILES = 1;

	/**
	 * The feature id for the '<em><b>General Ledger Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES = 2;

	/**
	 * The feature id for the '<em><b>Source Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_FILE_TYPE__SOURCE_DOCUMENTS = 3;

	/**
	 * The number of structural features of the '<em>Audit File Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIT_FILE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.CurrencyImpl <em>Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.CurrencyImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 3;

	/**
	 * The feature id for the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__CURRENCY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Currency Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__CURRENCY_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Exchange Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__EXCHANGE_RATE = 2;

	/**
	 * The number of structural features of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.CustomerTypeImpl <em>Customer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.CustomerTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getCustomerType()
	 * @generated
	 */
	int CUSTOMER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__CUSTOMER_ID = 0;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__ACCOUNT_ID = 1;

	/**
	 * The feature id for the '<em><b>Customer Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__CUSTOMER_TAX_ID = 2;

	/**
	 * The feature id for the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__COMPANY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__CONTACT = 4;

	/**
	 * The feature id for the '<em><b>Billing Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__BILLING_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Ship To Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__SHIP_TO_ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__TELEPHONE = 7;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__FAX = 8;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__EMAIL = 9;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__WEBSITE = 10;

	/**
	 * The feature id for the '<em><b>Self Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__SELF_BILLING_INDICATOR = 11;

	/**
	 * The number of structural features of the '<em>Customer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Account Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCOUNT_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCOUNT_ID = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Address Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS_DETAIL = 6;

	/**
	 * The feature id for the '<em><b>AT Doc Code ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AT_DOC_CODE_ID = 7;

	/**
	 * The feature id for the '<em><b>Audit File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDIT_FILE = 8;

	/**
	 * The feature id for the '<em><b>Audit File Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDIT_FILE_VERSION = 9;

	/**
	 * The feature id for the '<em><b>Billing Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BILLING_ADDRESS = 10;

	/**
	 * The feature id for the '<em><b>Building Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUILDING_NUMBER = 11;

	/**
	 * The feature id for the '<em><b>Business Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUSINESS_NAME = 12;

	/**
	 * The feature id for the '<em><b>Cash VAT Scheme Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CASH_VAT_SCHEME_INDICATOR = 13;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITY = 14;

	/**
	 * The feature id for the '<em><b>Closing Credit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLOSING_CREDIT_BALANCE = 15;

	/**
	 * The feature id for the '<em><b>Closing Debit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLOSING_DEBIT_BALANCE = 16;

	/**
	 * The feature id for the '<em><b>Company Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPANY_ADDRESS = 17;

	/**
	 * The feature id for the '<em><b>Company ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPANY_ID = 18;

	/**
	 * The feature id for the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPANY_NAME = 19;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT = 20;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY = 21;

	/**
	 * The feature id for the '<em><b>Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREDIT_AMOUNT = 22;

	/**
	 * The feature id for the '<em><b>Currency Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENCY_AMOUNT = 23;

	/**
	 * The feature id for the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENCY_CODE = 24;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOMER = 25;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOMER_ID = 26;

	/**
	 * The feature id for the '<em><b>Customer Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOMER_TAX_ID = 27;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_CREATED = 28;

	/**
	 * The feature id for the '<em><b>Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEBIT_AMOUNT = 29;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELIVERY_DATE = 30;

	/**
	 * The feature id for the '<em><b>Delivery ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELIVERY_ID = 31;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 32;

	/**
	 * The feature id for the '<em><b>Doc Archival Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER = 33;

	/**
	 * The feature id for the '<em><b>Document Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT_NUMBER = 34;

	/**
	 * The feature id for the '<em><b>EAC Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EAC_CODE = 35;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMAIL = 36;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_DATE = 37;

	/**
	 * The feature id for the '<em><b>Exchange Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXCHANGE_RATE = 38;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FAX = 39;

	/**
	 * The feature id for the '<em><b>Fiscal Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FISCAL_YEAR = 40;

	/**
	 * The feature id for the '<em><b>General Ledger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERAL_LEDGER = 41;

	/**
	 * The feature id for the '<em><b>General Ledger Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES = 42;

	/**
	 * The feature id for the '<em><b>GL Posting Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GL_POSTING_DATE = 43;

	/**
	 * The feature id for the '<em><b>Gross Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROSS_TOTAL = 44;

	/**
	 * The feature id for the '<em><b>Grouping Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUPING_CATEGORY = 45;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HASH = 46;

	/**
	 * The feature id for the '<em><b>Hash Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HASH_CONTROL = 47;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADER = 48;

	/**
	 * The feature id for the '<em><b>Header Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADER_COMMENT = 49;

	/**
	 * The feature id for the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVOICE_DATE = 50;

	/**
	 * The feature id for the '<em><b>Invoice No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVOICE_NO = 51;

	/**
	 * The feature id for the '<em><b>Invoice Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVOICE_STATUS = 52;

	/**
	 * The feature id for the '<em><b>Invoice Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVOICE_STATUS_DATE = 53;

	/**
	 * The feature id for the '<em><b>Invoice Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVOICE_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Journal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOURNAL_ID = 55;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_NUMBER = 56;

	/**
	 * The feature id for the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION_ID = 57;

	/**
	 * The feature id for the '<em><b>Movement Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOVEMENT_COMMENTS = 58;

	/**
	 * The feature id for the '<em><b>Movement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOVEMENT_DATE = 59;

	/**
	 * The feature id for the '<em><b>Movement End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOVEMENT_END_TIME = 60;

	/**
	 * The feature id for the '<em><b>Movement Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOVEMENT_START_TIME = 61;

	/**
	 * The feature id for the '<em><b>Movement Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOVEMENT_STATUS = 62;

	/**
	 * The feature id for the '<em><b>Movement Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOVEMENT_STATUS_DATE = 63;

	/**
	 * The feature id for the '<em><b>Movement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MOVEMENT_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Net Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NET_TOTAL = 65;

	/**
	 * The feature id for the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER_OF_ENTRIES = 66;

	/**
	 * The feature id for the '<em><b>Number Of Movement Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER_OF_MOVEMENT_LINES = 67;

	/**
	 * The feature id for the '<em><b>Opening Credit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPENING_CREDIT_BALANCE = 68;

	/**
	 * The feature id for the '<em><b>Opening Debit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPENING_DEBIT_BALANCE = 69;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORDER_DATE = 70;

	/**
	 * The feature id for the '<em><b>Originating ON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIGINATING_ON = 71;

	/**
	 * The feature id for the '<em><b>Payment Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAYMENT_MECHANISM = 72;

	/**
	 * The feature id for the '<em><b>Payment Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAYMENT_REF_NO = 73;

	/**
	 * The feature id for the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAYMENT_STATUS = 74;

	/**
	 * The feature id for the '<em><b>Payment Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAYMENT_STATUS_DATE = 75;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERIOD = 76;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSTAL_CODE = 77;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT = 78;

	/**
	 * The feature id for the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_CODE = 79;

	/**
	 * The feature id for the '<em><b>Product Company Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID = 80;

	/**
	 * The feature id for the '<em><b>Product Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_DESCRIPTION = 81;

	/**
	 * The feature id for the '<em><b>Product Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_GROUP = 82;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_ID = 83;

	/**
	 * The feature id for the '<em><b>Product Number Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_NUMBER_CODE = 84;

	/**
	 * The feature id for the '<em><b>Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_VERSION = 86;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUANTITY = 87;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REASON = 88;

	/**
	 * The feature id for the '<em><b>Record ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECORD_ID = 89;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCE = 90;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGION = 91;

	/**
	 * The feature id for the '<em><b>Self Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SELF_BILLING_INDICATOR = 92;

	/**
	 * The feature id for the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SETTLEMENT_AMOUNT = 93;

	/**
	 * The feature id for the '<em><b>Ship From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHIP_FROM = 94;

	/**
	 * The feature id for the '<em><b>Ship From Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHIP_FROM_ADDRESS = 95;

	/**
	 * The feature id for the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHIP_TO = 96;

	/**
	 * The feature id for the '<em><b>Ship To Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHIP_TO_ADDRESS = 97;

	/**
	 * The feature id for the '<em><b>Software Certificate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER = 98;

	/**
	 * The feature id for the '<em><b>Source Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_DOCUMENT_ID = 99;

	/**
	 * The feature id for the '<em><b>Source Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_DOCUMENTS = 100;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_ID = 101;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_DATE = 102;

	/**
	 * The feature id for the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STREET_NAME = 103;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPPLIER = 104;

	/**
	 * The feature id for the '<em><b>Supplier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPPLIER_ID = 105;

	/**
	 * The feature id for the '<em><b>Supplier Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPPLIER_TAX_ID = 106;

	/**
	 * The feature id for the '<em><b>System Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM_ENTRY_DATE = 107;

	/**
	 * The feature id for the '<em><b>System ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM_ID = 108;

	/**
	 * The feature id for the '<em><b>Tax Accounting Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS = 109;

	/**
	 * The feature id for the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_AMOUNT = 110;

	/**
	 * The feature id for the '<em><b>Tax Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_CODE = 111;

	/**
	 * The feature id for the '<em><b>Tax Country Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_COUNTRY_REGION = 112;

	/**
	 * The feature id for the '<em><b>Tax Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_ENTITY = 113;

	/**
	 * The feature id for the '<em><b>Tax Exemption Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_EXEMPTION_REASON = 114;

	/**
	 * The feature id for the '<em><b>Tax Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_EXPIRATION_DATE = 115;

	/**
	 * The feature id for the '<em><b>Tax Payable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_PAYABLE = 116;

	/**
	 * The feature id for the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_PERCENTAGE = 117;

	/**
	 * The feature id for the '<em><b>Tax Point Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_POINT_DATE = 118;

	/**
	 * The feature id for the '<em><b>Tax Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_TABLE = 119;

	/**
	 * The feature id for the '<em><b>Tax Table Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_TABLE_ENTRY = 120;

	/**
	 * The feature id for the '<em><b>Tax Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_TYPE = 121;

	/**
	 * The feature id for the '<em><b>Tax Verification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_VERIFICATION_DATE = 122;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TELEPHONE = 123;

	/**
	 * The feature id for the '<em><b>Third Parties Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THIRD_PARTIES_BILLING_INDICATOR = 124;

	/**
	 * The feature id for the '<em><b>Total Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOTAL_CREDIT = 125;

	/**
	 * The feature id for the '<em><b>Total Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOTAL_DEBIT = 126;

	/**
	 * The feature id for the '<em><b>Total Quantity Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOTAL_QUANTITY_ISSUED = 127;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_DATE = 128;

	/**
	 * The feature id for the '<em><b>Transaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_ID = 129;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_TYPE = 130;

	/**
	 * The feature id for the '<em><b>Unit Of Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNIT_OF_MEASURE = 131;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNIT_PRICE = 132;

	/**
	 * The feature id for the '<em><b>Warehouse ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAREHOUSE_ID = 133;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEBSITE = 134;

	/**
	 * The feature id for the '<em><b>Withholding Tax Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WITHHOLDING_TAX_TYPE = 135;

	/**
	 * The feature id for the '<em><b>Work Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WORK_DATE = 136;

	/**
	 * The feature id for the '<em><b>Work Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WORK_STATUS = 137;

	/**
	 * The feature id for the '<em><b>Work Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WORK_STATUS_DATE = 138;

	/**
	 * The feature id for the '<em><b>Work Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WORK_TYPE = 139;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 140;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusTypeImpl <em>Document Status Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getDocumentStatusType()
	 * @generated
	 */
	int DOCUMENT_STATUS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Work Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE__WORK_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Work Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE__WORK_STATUS_DATE = 1;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE__REASON = 2;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE__SOURCE_ID = 3;

	/**
	 * The feature id for the '<em><b>Source Billing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE__SOURCE_BILLING = 4;

	/**
	 * The number of structural features of the '<em>Document Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusType1Impl <em>Document Status Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusType1Impl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getDocumentStatusType1()
	 * @generated
	 */
	int DOCUMENT_STATUS_TYPE1 = 7;

	/**
	 * The feature id for the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Payment Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS_DATE = 1;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE1__REASON = 2;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE1__SOURCE_ID = 3;

	/**
	 * The feature id for the '<em><b>Source Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE1__SOURCE_PAYMENT = 4;

	/**
	 * The number of structural features of the '<em>Document Status Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE1_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusType2Impl <em>Document Status Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusType2Impl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getDocumentStatusType2()
	 * @generated
	 */
	int DOCUMENT_STATUS_TYPE2 = 8;

	/**
	 * The feature id for the '<em><b>Movement Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE2__MOVEMENT_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Movement Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE2__MOVEMENT_STATUS_DATE = 1;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE2__REASON = 2;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE2__SOURCE_ID = 3;

	/**
	 * The feature id for the '<em><b>Source Billing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE2__SOURCE_BILLING = 4;

	/**
	 * The number of structural features of the '<em>Document Status Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE2_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusType3Impl <em>Document Status Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusType3Impl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getDocumentStatusType3()
	 * @generated
	 */
	int DOCUMENT_STATUS_TYPE3 = 9;

	/**
	 * The feature id for the '<em><b>Invoice Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE3__INVOICE_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Invoice Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE3__INVOICE_STATUS_DATE = 1;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE3__REASON = 2;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE3__SOURCE_ID = 3;

	/**
	 * The feature id for the '<em><b>Source Billing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE3__SOURCE_BILLING = 4;

	/**
	 * The number of structural features of the '<em>Document Status Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STATUS_TYPE3_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentTotalsTypeImpl <em>Document Totals Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentTotalsTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getDocumentTotalsType()
	 * @generated
	 */
	int DOCUMENT_TOTALS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Tax Payable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE__TAX_PAYABLE = 0;

	/**
	 * The feature id for the '<em><b>Net Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE__NET_TOTAL = 1;

	/**
	 * The feature id for the '<em><b>Gross Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE__GROSS_TOTAL = 2;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE__CURRENCY = 3;

	/**
	 * The number of structural features of the '<em>Document Totals Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentTotalsType1Impl <em>Document Totals Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentTotalsType1Impl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getDocumentTotalsType1()
	 * @generated
	 */
	int DOCUMENT_TOTALS_TYPE1 = 11;

	/**
	 * The feature id for the '<em><b>Tax Payable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE1__TAX_PAYABLE = 0;

	/**
	 * The feature id for the '<em><b>Net Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE1__NET_TOTAL = 1;

	/**
	 * The feature id for the '<em><b>Gross Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE1__GROSS_TOTAL = 2;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE1__CURRENCY = 3;

	/**
	 * The number of structural features of the '<em>Document Totals Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE1_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentTotalsType2Impl <em>Document Totals Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentTotalsType2Impl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getDocumentTotalsType2()
	 * @generated
	 */
	int DOCUMENT_TOTALS_TYPE2 = 12;

	/**
	 * The feature id for the '<em><b>Tax Payable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE2__TAX_PAYABLE = 0;

	/**
	 * The feature id for the '<em><b>Net Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE2__NET_TOTAL = 1;

	/**
	 * The feature id for the '<em><b>Gross Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE2__GROSS_TOTAL = 2;

	/**
	 * The feature id for the '<em><b>Settlement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE2__SETTLEMENT = 3;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE2__CURRENCY = 4;

	/**
	 * The number of structural features of the '<em>Document Totals Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE2_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentTotalsType3Impl <em>Document Totals Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentTotalsType3Impl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getDocumentTotalsType3()
	 * @generated
	 */
	int DOCUMENT_TOTALS_TYPE3 = 13;

	/**
	 * The feature id for the '<em><b>Tax Payable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE3__TAX_PAYABLE = 0;

	/**
	 * The feature id for the '<em><b>Net Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE3__NET_TOTAL = 1;

	/**
	 * The feature id for the '<em><b>Gross Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE3__GROSS_TOTAL = 2;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE3__CURRENCY = 3;

	/**
	 * The feature id for the '<em><b>Settlement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE3__SETTLEMENT = 4;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE3__PAYMENT = 5;

	/**
	 * The number of structural features of the '<em>Document Totals Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE3_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.GeneralLedgerEntriesTypeImpl <em>General Ledger Entries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.GeneralLedgerEntriesTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getGeneralLedgerEntriesType()
	 * @generated
	 */
	int GENERAL_LEDGER_ENTRIES_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_ENTRIES_TYPE__NUMBER_OF_ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Total Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_DEBIT = 1;

	/**
	 * The feature id for the '<em><b>Total Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_CREDIT = 2;

	/**
	 * The feature id for the '<em><b>Journal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_ENTRIES_TYPE__JOURNAL = 3;

	/**
	 * The number of structural features of the '<em>General Ledger Entries Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_ENTRIES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.GeneralLedgerTypeImpl <em>General Ledger Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.GeneralLedgerTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getGeneralLedgerType()
	 * @generated
	 */
	int GENERAL_LEDGER_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_TYPE__ACCOUNT_ID = 0;

	/**
	 * The feature id for the '<em><b>Account Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_TYPE__ACCOUNT_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Opening Debit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_TYPE__OPENING_DEBIT_BALANCE = 2;

	/**
	 * The feature id for the '<em><b>Opening Credit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_TYPE__OPENING_CREDIT_BALANCE = 3;

	/**
	 * The feature id for the '<em><b>Closing Debit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_TYPE__CLOSING_DEBIT_BALANCE = 4;

	/**
	 * The feature id for the '<em><b>Closing Credit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_TYPE__CLOSING_CREDIT_BALANCE = 5;

	/**
	 * The feature id for the '<em><b>Grouping Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_TYPE__GROUPING_CATEGORY = 6;

	/**
	 * The feature id for the '<em><b>Grouping Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_TYPE__GROUPING_CODE = 7;

	/**
	 * The number of structural features of the '<em>General Ledger Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl <em>Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.HeaderTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getHeaderType()
	 * @generated
	 */
	int HEADER_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Audit File Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__AUDIT_FILE_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Company ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__COMPANY_ID = 1;

	/**
	 * The feature id for the '<em><b>Tax Registration Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__TAX_REGISTRATION_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Tax Accounting Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__TAX_ACCOUNTING_BASIS = 3;

	/**
	 * The feature id for the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__COMPANY_NAME = 4;

	/**
	 * The feature id for the '<em><b>Business Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__BUSINESS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Company Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__COMPANY_ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>Fiscal Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__FISCAL_YEAR = 7;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__START_DATE = 8;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__END_DATE = 9;

	/**
	 * The feature id for the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__CURRENCY_CODE = 10;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__DATE_CREATED = 11;

	/**
	 * The feature id for the '<em><b>Tax Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__TAX_ENTITY = 12;

	/**
	 * The feature id for the '<em><b>Product Company Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__PRODUCT_COMPANY_TAX_ID = 13;

	/**
	 * The feature id for the '<em><b>Software Certificate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__SOFTWARE_CERTIFICATE_NUMBER = 14;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__PRODUCT_ID = 15;

	/**
	 * The feature id for the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__PRODUCT_VERSION = 16;

	/**
	 * The feature id for the '<em><b>Header Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__HEADER_COMMENT = 17;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__TELEPHONE = 18;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__FAX = 19;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__EMAIL = 20;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE__WEBSITE = 21;

	/**
	 * The number of structural features of the '<em>Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_TYPE_FEATURE_COUNT = 22;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.InvoiceTypeImpl <em>Invoice Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.InvoiceTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getInvoiceType()
	 * @generated
	 */
	int INVOICE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Invoice No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__INVOICE_NO = 0;

	/**
	 * The feature id for the '<em><b>Document Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__DOCUMENT_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__HASH = 2;

	/**
	 * The feature id for the '<em><b>Hash Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__HASH_CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__PERIOD = 4;

	/**
	 * The feature id for the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__INVOICE_DATE = 5;

	/**
	 * The feature id for the '<em><b>Invoice Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__INVOICE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Special Regimes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__SPECIAL_REGIMES = 7;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__SOURCE_ID = 8;

	/**
	 * The feature id for the '<em><b>EAC Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__EAC_CODE = 9;

	/**
	 * The feature id for the '<em><b>System Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__SYSTEM_ENTRY_DATE = 10;

	/**
	 * The feature id for the '<em><b>Transaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__TRANSACTION_ID = 11;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__CUSTOMER_ID = 12;

	/**
	 * The feature id for the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__SHIP_TO = 13;

	/**
	 * The feature id for the '<em><b>Ship From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__SHIP_FROM = 14;

	/**
	 * The feature id for the '<em><b>Movement End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__MOVEMENT_END_TIME = 15;

	/**
	 * The feature id for the '<em><b>Movement Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__MOVEMENT_START_TIME = 16;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__LINE = 17;

	/**
	 * The feature id for the '<em><b>Document Totals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__DOCUMENT_TOTALS = 18;

	/**
	 * The feature id for the '<em><b>Withholding Tax</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__WITHHOLDING_TAX = 19;

	/**
	 * The number of structural features of the '<em>Invoice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.JournalTypeImpl <em>Journal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.JournalTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getJournalType()
	 * @generated
	 */
	int JOURNAL_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Journal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_TYPE__JOURNAL_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_TYPE__TRANSACTION = 2;

	/**
	 * The number of structural features of the '<em>Journal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNAL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineTypeImpl <em>Line Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.LineTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getLineType()
	 * @generated
	 */
	int LINE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__LINE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Order References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__ORDER_REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__PRODUCT_CODE = 2;

	/**
	 * The feature id for the '<em><b>Product Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__PRODUCT_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Unit Of Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__UNIT_OF_MEASURE = 5;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__UNIT_PRICE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__DEBIT_AMOUNT = 8;

	/**
	 * The feature id for the '<em><b>Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__CREDIT_AMOUNT = 9;

	/**
	 * The feature id for the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__TAX = 10;

	/**
	 * The feature id for the '<em><b>Tax Exemption Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__TAX_EXEMPTION_REASON = 11;

	/**
	 * The feature id for the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__SETTLEMENT_AMOUNT = 12;

	/**
	 * The number of structural features of the '<em>Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType1Impl <em>Line Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType1Impl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getLineType1()
	 * @generated
	 */
	int LINE_TYPE1 = 20;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__LINE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Source Document ID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__SOURCE_DOCUMENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__SETTLEMENT_AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__DEBIT_AMOUNT = 3;

	/**
	 * The feature id for the '<em><b>Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__CREDIT_AMOUNT = 4;

	/**
	 * The feature id for the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__TAX = 5;

	/**
	 * The feature id for the '<em><b>Tax Exemption Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__TAX_EXEMPTION_REASON = 6;

	/**
	 * The number of structural features of the '<em>Line Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType2Impl <em>Line Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType2Impl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getLineType2()
	 * @generated
	 */
	int LINE_TYPE2 = 21;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__LINE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Order References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__ORDER_REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__PRODUCT_CODE = 2;

	/**
	 * The feature id for the '<em><b>Product Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__PRODUCT_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Unit Of Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__UNIT_OF_MEASURE = 5;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__UNIT_PRICE = 6;

	/**
	 * The feature id for the '<em><b>Tax Point Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__TAX_POINT_DATE = 7;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__REFERENCES = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__DEBIT_AMOUNT = 10;

	/**
	 * The feature id for the '<em><b>Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__CREDIT_AMOUNT = 11;

	/**
	 * The feature id for the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__TAX = 12;

	/**
	 * The feature id for the '<em><b>Tax Exemption Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__TAX_EXEMPTION_REASON = 13;

	/**
	 * The feature id for the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2__SETTLEMENT_AMOUNT = 14;

	/**
	 * The number of structural features of the '<em>Line Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE2_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType3Impl <em>Line Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType3Impl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getLineType3()
	 * @generated
	 */
	int LINE_TYPE3 = 22;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__LINE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Order References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__ORDER_REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__PRODUCT_CODE = 2;

	/**
	 * The feature id for the '<em><b>Product Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__PRODUCT_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Unit Of Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__UNIT_OF_MEASURE = 5;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__UNIT_PRICE = 6;

	/**
	 * The feature id for the '<em><b>Tax Point Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__TAX_POINT_DATE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__DEBIT_AMOUNT = 9;

	/**
	 * The feature id for the '<em><b>Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__CREDIT_AMOUNT = 10;

	/**
	 * The feature id for the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__TAX = 11;

	/**
	 * The feature id for the '<em><b>Tax Exemption Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__TAX_EXEMPTION_REASON = 12;

	/**
	 * The feature id for the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3__SETTLEMENT_AMOUNT = 13;

	/**
	 * The number of structural features of the '<em>Line Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE3_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType4Impl <em>Line Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.LineType4Impl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getLineType4()
	 * @generated
	 */
	int LINE_TYPE4 = 23;

	/**
	 * The feature id for the '<em><b>Record ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE4__RECORD_ID = 0;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE4__ACCOUNT_ID = 1;

	/**
	 * The feature id for the '<em><b>Source Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE4__SOURCE_DOCUMENT_ID = 2;

	/**
	 * The feature id for the '<em><b>System Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE4__SYSTEM_ENTRY_DATE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE4__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE4__DEBIT_AMOUNT = 5;

	/**
	 * The feature id for the '<em><b>Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE4__CREDIT_AMOUNT = 6;

	/**
	 * The number of structural features of the '<em>Line Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE4_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.MasterFilesTypeImpl <em>Master Files Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.MasterFilesTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getMasterFilesType()
	 * @generated
	 */
	int MASTER_FILES_TYPE = 24;

	/**
	 * The feature id for the '<em><b>General Ledger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE__GENERAL_LEDGER = 0;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE__CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE__SUPPLIER = 2;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE__PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Tax Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE__TAX_TABLE = 4;

	/**
	 * The number of structural features of the '<em>Master Files Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.MovementOfGoodsTypeImpl <em>Movement Of Goods Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.MovementOfGoodsTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getMovementOfGoodsType()
	 * @generated
	 */
	int MOVEMENT_OF_GOODS_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Number Of Movement Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OF_GOODS_TYPE__NUMBER_OF_MOVEMENT_LINES = 0;

	/**
	 * The feature id for the '<em><b>Total Quantity Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OF_GOODS_TYPE__TOTAL_QUANTITY_ISSUED = 1;

	/**
	 * The feature id for the '<em><b>Stock Movement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OF_GOODS_TYPE__STOCK_MOVEMENT = 2;

	/**
	 * The number of structural features of the '<em>Movement Of Goods Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OF_GOODS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.MovementTaxImpl <em>Movement Tax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.MovementTaxImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getMovementTax()
	 * @generated
	 */
	int MOVEMENT_TAX = 26;

	/**
	 * The feature id for the '<em><b>Tax Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TAX__TAX_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Tax Country Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TAX__TAX_COUNTRY_REGION = 1;

	/**
	 * The feature id for the '<em><b>Tax Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TAX__TAX_CODE = 2;

	/**
	 * The feature id for the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TAX__TAX_PERCENTAGE = 3;

	/**
	 * The number of structural features of the '<em>Movement Tax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_TAX_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.OrderReferencesImpl <em>Order References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.OrderReferencesImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getOrderReferences()
	 * @generated
	 */
	int ORDER_REFERENCES = 27;

	/**
	 * The feature id for the '<em><b>Originating ON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REFERENCES__ORIGINATING_ON = 0;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REFERENCES__ORDER_DATE = 1;

	/**
	 * The number of structural features of the '<em>Order References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REFERENCES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentMethodImpl <em>Payment Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentMethodImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPaymentMethod()
	 * @generated
	 */
	int PAYMENT_METHOD = 28;

	/**
	 * The feature id for the '<em><b>Payment Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__PAYMENT_MECHANISM = 0;

	/**
	 * The feature id for the '<em><b>Payment Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__PAYMENT_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__PAYMENT_DATE = 2;

	/**
	 * The number of structural features of the '<em>Payment Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentsTypeImpl <em>Payments Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentsTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPaymentsType()
	 * @generated
	 */
	int PAYMENTS_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENTS_TYPE__NUMBER_OF_ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Total Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENTS_TYPE__TOTAL_DEBIT = 1;

	/**
	 * The feature id for the '<em><b>Total Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENTS_TYPE__TOTAL_CREDIT = 2;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENTS_TYPE__PAYMENT = 3;

	/**
	 * The number of structural features of the '<em>Payments Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENTS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTaxImpl <em>Payment Tax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTaxImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPaymentTax()
	 * @generated
	 */
	int PAYMENT_TAX = 30;

	/**
	 * The feature id for the '<em><b>Tax Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TAX__TAX_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Tax Country Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TAX__TAX_COUNTRY_REGION = 1;

	/**
	 * The feature id for the '<em><b>Tax Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TAX__TAX_CODE = 2;

	/**
	 * The feature id for the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TAX__TAX_PERCENTAGE = 3;

	/**
	 * The feature id for the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TAX__TAX_AMOUNT = 4;

	/**
	 * The number of structural features of the '<em>Payment Tax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TAX_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl <em>Payment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.PaymentTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPaymentType()
	 * @generated
	 */
	int PAYMENT_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Payment Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__PAYMENT_REF_NO = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__PERIOD = 1;

	/**
	 * The feature id for the '<em><b>Transaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__TRANSACTION_ID = 2;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__TRANSACTION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Payment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__PAYMENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>System ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__SYSTEM_ID = 6;

	/**
	 * The feature id for the '<em><b>Document Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__DOCUMENT_STATUS = 7;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__PAYMENT_METHOD = 8;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__SOURCE_ID = 9;

	/**
	 * The feature id for the '<em><b>System Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__SYSTEM_ENTRY_DATE = 10;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__CUSTOMER_ID = 11;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__LINE = 12;

	/**
	 * The feature id for the '<em><b>Document Totals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__DOCUMENT_TOTALS = 13;

	/**
	 * The feature id for the '<em><b>Withholding Tax</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__WITHHOLDING_TAX = 14;

	/**
	 * The number of structural features of the '<em>Payment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.ProductTypeImpl <em>Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.ProductTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getProductType()
	 * @generated
	 */
	int PRODUCT_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_CODE = 1;

	/**
	 * The feature id for the '<em><b>Product Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Product Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Product Number Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_NUMBER_CODE = 4;

	/**
	 * The number of structural features of the '<em>Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.ReferencesImpl <em>References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.ReferencesImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getReferences()
	 * @generated
	 */
	int REFERENCES = 33;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__REASON = 1;

	/**
	 * The number of structural features of the '<em>References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.SalesInvoicesTypeImpl <em>Sales Invoices Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.SalesInvoicesTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSalesInvoicesType()
	 * @generated
	 */
	int SALES_INVOICES_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_INVOICES_TYPE__NUMBER_OF_ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Total Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_INVOICES_TYPE__TOTAL_DEBIT = 1;

	/**
	 * The feature id for the '<em><b>Total Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_INVOICES_TYPE__TOTAL_CREDIT = 2;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_INVOICES_TYPE__INVOICE = 3;

	/**
	 * The number of structural features of the '<em>Sales Invoices Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_INVOICES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.SettlementImpl <em>Settlement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.SettlementImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSettlement()
	 * @generated
	 */
	int SETTLEMENT = 35;

	/**
	 * The feature id for the '<em><b>Settlement Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__SETTLEMENT_DISCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__SETTLEMENT_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Settlement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__SETTLEMENT_DATE = 2;

	/**
	 * The feature id for the '<em><b>Payment Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__PAYMENT_TERMS = 3;

	/**
	 * The number of structural features of the '<em>Settlement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.SettlementTypeImpl <em>Settlement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.SettlementTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSettlementType()
	 * @generated
	 */
	int SETTLEMENT_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TYPE__SETTLEMENT_AMOUNT = 0;

	/**
	 * The number of structural features of the '<em>Settlement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.ShippingPointStructureImpl <em>Shipping Point Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.ShippingPointStructureImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getShippingPointStructure()
	 * @generated
	 */
	int SHIPPING_POINT_STRUCTURE = 37;

	/**
	 * The feature id for the '<em><b>Delivery ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_POINT_STRUCTURE__DELIVERY_ID = 0;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_POINT_STRUCTURE__DELIVERY_DATE = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_POINT_STRUCTURE__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Warehouse ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_POINT_STRUCTURE__WAREHOUSE_ID = 3;

	/**
	 * The feature id for the '<em><b>Location ID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_POINT_STRUCTURE__LOCATION_ID = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_POINT_STRUCTURE__ADDRESS = 5;

	/**
	 * The number of structural features of the '<em>Shipping Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_POINT_STRUCTURE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.SourceDocumentIDTypeImpl <em>Source Document ID Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.SourceDocumentIDTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSourceDocumentIDType()
	 * @generated
	 */
	int SOURCE_DOCUMENT_ID_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Originating ON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_ID_TYPE__ORIGINATING_ON = 0;

	/**
	 * The feature id for the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_ID_TYPE__INVOICE_DATE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_ID_TYPE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Source Document ID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENT_ID_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.SourceDocumentsTypeImpl <em>Source Documents Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.SourceDocumentsTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSourceDocumentsType()
	 * @generated
	 */
	int SOURCE_DOCUMENTS_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Sales Invoices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENTS_TYPE__SALES_INVOICES = 0;

	/**
	 * The feature id for the '<em><b>Movement Of Goods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENTS_TYPE__MOVEMENT_OF_GOODS = 1;

	/**
	 * The feature id for the '<em><b>Working Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENTS_TYPE__WORKING_DOCUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Payments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENTS_TYPE__PAYMENTS = 3;

	/**
	 * The number of structural features of the '<em>Source Documents Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENTS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.SpecialRegimesImpl <em>Special Regimes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.SpecialRegimesImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSpecialRegimes()
	 * @generated
	 */
	int SPECIAL_REGIMES = 40;

	/**
	 * The feature id for the '<em><b>Self Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_REGIMES__SELF_BILLING_INDICATOR = 0;

	/**
	 * The feature id for the '<em><b>Cash VAT Scheme Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_REGIMES__CASH_VAT_SCHEME_INDICATOR = 1;

	/**
	 * The feature id for the '<em><b>Third Parties Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_REGIMES__THIRD_PARTIES_BILLING_INDICATOR = 2;

	/**
	 * The number of structural features of the '<em>Special Regimes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_REGIMES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.StockMovementTypeImpl <em>Stock Movement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.StockMovementTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getStockMovementType()
	 * @generated
	 */
	int STOCK_MOVEMENT_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Document Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__DOCUMENT_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Document Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__DOCUMENT_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__HASH = 2;

	/**
	 * The feature id for the '<em><b>Hash Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__HASH_CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__PERIOD = 4;

	/**
	 * The feature id for the '<em><b>Movement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__MOVEMENT_DATE = 5;

	/**
	 * The feature id for the '<em><b>Movement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__MOVEMENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>System Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__SYSTEM_ENTRY_DATE = 7;

	/**
	 * The feature id for the '<em><b>Transaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__TRANSACTION_ID = 8;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__CUSTOMER_ID = 9;

	/**
	 * The feature id for the '<em><b>Supplier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__SUPPLIER_ID = 10;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__SOURCE_ID = 11;

	/**
	 * The feature id for the '<em><b>EAC Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__EAC_CODE = 12;

	/**
	 * The feature id for the '<em><b>Movement Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__MOVEMENT_COMMENTS = 13;

	/**
	 * The feature id for the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__SHIP_TO = 14;

	/**
	 * The feature id for the '<em><b>Ship From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__SHIP_FROM = 15;

	/**
	 * The feature id for the '<em><b>Movement End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__MOVEMENT_END_TIME = 16;

	/**
	 * The feature id for the '<em><b>Movement Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__MOVEMENT_START_TIME = 17;

	/**
	 * The feature id for the '<em><b>AT Doc Code ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__AT_DOC_CODE_ID = 18;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__LINE = 19;

	/**
	 * The feature id for the '<em><b>Document Totals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE__DOCUMENT_TOTALS = 20;

	/**
	 * The number of structural features of the '<em>Stock Movement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_MOVEMENT_TYPE_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.SupplierAddressStructureImpl <em>Supplier Address Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.SupplierAddressStructureImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSupplierAddressStructure()
	 * @generated
	 */
	int SUPPLIER_ADDRESS_STRUCTURE = 42;

	/**
	 * The feature id for the '<em><b>Building Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_ADDRESS_STRUCTURE__BUILDING_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_ADDRESS_STRUCTURE__STREET_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_ADDRESS_STRUCTURE__ADDRESS_DETAIL = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_ADDRESS_STRUCTURE__CITY = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_ADDRESS_STRUCTURE__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_ADDRESS_STRUCTURE__REGION = 5;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_ADDRESS_STRUCTURE__COUNTRY = 6;

	/**
	 * The number of structural features of the '<em>Supplier Address Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_ADDRESS_STRUCTURE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.SupplierTypeImpl <em>Supplier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.SupplierTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSupplierType()
	 * @generated
	 */
	int SUPPLIER_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Supplier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__SUPPLIER_ID = 0;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__ACCOUNT_ID = 1;

	/**
	 * The feature id for the '<em><b>Supplier Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__SUPPLIER_TAX_ID = 2;

	/**
	 * The feature id for the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__COMPANY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__CONTACT = 4;

	/**
	 * The feature id for the '<em><b>Billing Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__BILLING_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Ship From Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__SHIP_FROM_ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__TELEPHONE = 7;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__FAX = 8;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__EMAIL = 9;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__WEBSITE = 10;

	/**
	 * The feature id for the '<em><b>Self Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE__SELF_BILLING_INDICATOR = 11;

	/**
	 * The number of structural features of the '<em>Supplier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.TaxImpl <em>Tax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.TaxImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTax()
	 * @generated
	 */
	int TAX = 44;

	/**
	 * The feature id for the '<em><b>Tax Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX__TAX_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Tax Country Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX__TAX_COUNTRY_REGION = 1;

	/**
	 * The feature id for the '<em><b>Tax Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX__TAX_CODE = 2;

	/**
	 * The feature id for the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX__TAX_PERCENTAGE = 3;

	/**
	 * The feature id for the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX__TAX_AMOUNT = 4;

	/**
	 * The number of structural features of the '<em>Tax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.TaxTableEntryTypeImpl <em>Tax Table Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.TaxTableEntryTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTaxTableEntryType()
	 * @generated
	 */
	int TAX_TABLE_ENTRY_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Tax Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TABLE_ENTRY_TYPE__TAX_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Tax Country Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TABLE_ENTRY_TYPE__TAX_COUNTRY_REGION = 1;

	/**
	 * The feature id for the '<em><b>Tax Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TABLE_ENTRY_TYPE__TAX_CODE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TABLE_ENTRY_TYPE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Tax Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TABLE_ENTRY_TYPE__TAX_EXPIRATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TABLE_ENTRY_TYPE__TAX_PERCENTAGE = 5;

	/**
	 * The feature id for the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TABLE_ENTRY_TYPE__TAX_AMOUNT = 6;

	/**
	 * The number of structural features of the '<em>Tax Table Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TABLE_ENTRY_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.TaxTableTypeImpl <em>Tax Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.TaxTableTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTaxTableType()
	 * @generated
	 */
	int TAX_TABLE_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Tax Table Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TABLE_TYPE__TAX_TABLE_ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Tax Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TABLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.TransactionTypeImpl <em>Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.TransactionTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTransactionType()
	 * @generated
	 */
	int TRANSACTION_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Transaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__TRANSACTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__PERIOD = 1;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__TRANSACTION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__SOURCE_ID = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Doc Archival Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__DOC_ARCHIVAL_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__TRANSACTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>GL Posting Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__GL_POSTING_DATE = 7;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__CUSTOMER_ID = 8;

	/**
	 * The feature id for the '<em><b>Supplier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__SUPPLIER_ID = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__LINE = 10;

	/**
	 * The number of structural features of the '<em>Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.WithholdingTaxImpl <em>Withholding Tax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.WithholdingTaxImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getWithholdingTax()
	 * @generated
	 */
	int WITHHOLDING_TAX = 48;

	/**
	 * The feature id for the '<em><b>Withholding Tax Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHHOLDING_TAX__WITHHOLDING_TAX_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Withholding Tax Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHHOLDING_TAX__WITHHOLDING_TAX_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Withholding Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHHOLDING_TAX__WITHHOLDING_TAX_AMOUNT = 2;

	/**
	 * The number of structural features of the '<em>Withholding Tax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHHOLDING_TAX_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.WorkDocumentTypeImpl <em>Work Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.WorkDocumentTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getWorkDocumentType()
	 * @generated
	 */
	int WORK_DOCUMENT_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Document Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__DOCUMENT_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Document Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__DOCUMENT_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__HASH = 2;

	/**
	 * The feature id for the '<em><b>Hash Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__HASH_CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__PERIOD = 4;

	/**
	 * The feature id for the '<em><b>Work Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__WORK_DATE = 5;

	/**
	 * The feature id for the '<em><b>Work Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__WORK_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__SOURCE_ID = 7;

	/**
	 * The feature id for the '<em><b>EAC Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__EAC_CODE = 8;

	/**
	 * The feature id for the '<em><b>System Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__SYSTEM_ENTRY_DATE = 9;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__CUSTOMER_ID = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__LINE = 11;

	/**
	 * The feature id for the '<em><b>Document Totals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE__DOCUMENT_TOTALS = 12;

	/**
	 * The number of structural features of the '<em>Work Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_DOCUMENT_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.WorkingDocumentsTypeImpl <em>Working Documents Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl.WorkingDocumentsTypeImpl
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getWorkingDocumentsType()
	 * @generated
	 */
	int WORKING_DOCUMENTS_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DOCUMENTS_TYPE__NUMBER_OF_ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Total Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DOCUMENTS_TYPE__TOTAL_DEBIT = 1;

	/**
	 * The feature id for the '<em><b>Total Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DOCUMENTS_TYPE__TOTAL_CREDIT = 2;

	/**
	 * The feature id for the '<em><b>Work Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DOCUMENTS_TYPE__WORK_DOCUMENT = 3;

	/**
	 * The number of structural features of the '<em>Working Documents Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DOCUMENTS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.GroupingCategoryType <em>Grouping Category Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GroupingCategoryType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getGroupingCategoryType()
	 * @generated
	 */
	int GROUPING_CATEGORY_TYPE = 51;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceStatusType <em>Invoice Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceStatusType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getInvoiceStatusType()
	 * @generated
	 */
	int INVOICE_STATUS_TYPE = 52;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType <em>Invoice Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getInvoiceTypeType()
	 * @generated
	 */
	int INVOICE_TYPE_TYPE = 53;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType <em>Movement Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getMovementStatusType()
	 * @generated
	 */
	int MOVEMENT_STATUS_TYPE = 54;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementTypeType <em>Movement Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getMovementTypeType()
	 * @generated
	 */
	int MOVEMENT_TYPE_TYPE = 55;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType <em>Payment Mechanism Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPaymentMechanismType()
	 * @generated
	 */
	int PAYMENT_MECHANISM_TYPE = 56;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType <em>Payment Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPaymentStatusType()
	 * @generated
	 */
	int PAYMENT_STATUS_TYPE = 57;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.ProductTypeType <em>Product Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ProductTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getProductTypeType()
	 * @generated
	 */
	int PRODUCT_TYPE_TYPE = 58;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTMovementTaxType <em>SAFTPT Movement Tax Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTMovementTaxType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFTPTMovementTaxType()
	 * @generated
	 */
	int SAFTPT_MOVEMENT_TAX_TYPE = 59;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTPaymentType <em>SAFTPT Payment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTPaymentType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFTPTPaymentType()
	 * @generated
	 */
	int SAFTPT_PAYMENT_TYPE = 60;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling <em>SAFTPT Source Billing</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFTPTSourceBilling()
	 * @generated
	 */
	int SAFTPT_SOURCE_BILLING = 61;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment <em>SAFTPT Source Payment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFTPTSourcePayment()
	 * @generated
	 */
	int SAFTPT_SOURCE_PAYMENT = 62;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxAccountingBasisType <em>Tax Accounting Basis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxAccountingBasisType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTaxAccountingBasisType()
	 * @generated
	 */
	int TAX_ACCOUNTING_BASIS_TYPE = 63;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType <em>Tax Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTaxTypeType()
	 * @generated
	 */
	int TAX_TYPE_TYPE = 64;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionTypeType <em>Transaction Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTransactionTypeType()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE = 65;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTaxTypeType <em>Withholding Tax Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTaxTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getWithholdingTaxTypeType()
	 * @generated
	 */
	int WITHHOLDING_TAX_TYPE_TYPE = 66;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType <em>Work Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getWorkStatusType()
	 * @generated
	 */
	int WORK_STATUS_TYPE = 67;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkTypeType <em>Work Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getWorkTypeType()
	 * @generated
	 */
	int WORK_TYPE_TYPE = 68;

	/**
	 * The meta object id for the '<em>Account ID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getAccountIDType()
	 * @generated
	 */
	int ACCOUNT_ID_TYPE = 69;

	/**
	 * The meta object id for the '<em>Audit File Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getAuditFileVersionType()
	 * @generated
	 */
	int AUDIT_FILE_VERSION_TYPE = 70;

	/**
	 * The meta object id for the '<em>Cash VAT Scheme Indicator Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getCashVATSchemeIndicatorType()
	 * @generated
	 */
	int CASH_VAT_SCHEME_INDICATOR_TYPE = 71;

	/**
	 * The meta object id for the '<em>Company ID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getCompanyIDType()
	 * @generated
	 */
	int COMPANY_ID_TYPE = 72;

	/**
	 * The meta object id for the '<em>Country Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getCountryType()
	 * @generated
	 */
	int COUNTRY_TYPE = 73;

	/**
	 * The meta object id for the '<em>Currency Code Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getCurrencyCodeType()
	 * @generated
	 */
	int CURRENCY_CODE_TYPE = 74;

	/**
	 * The meta object id for the '<em>Document Number Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getDocumentNumberType()
	 * @generated
	 */
	int DOCUMENT_NUMBER_TYPE = 75;

	/**
	 * The meta object id for the '<em>EAC Code Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getEACCodeType()
	 * @generated
	 */
	int EAC_CODE_TYPE = 76;

	/**
	 * The meta object id for the '<em>Fiscal Year Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getFiscalYearType()
	 * @generated
	 */
	int FISCAL_YEAR_TYPE = 77;

	/**
	 * The meta object id for the '<em>Grouping Category Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GroupingCategoryType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getGroupingCategoryTypeObject()
	 * @generated
	 */
	int GROUPING_CATEGORY_TYPE_OBJECT = 78;

	/**
	 * The meta object id for the '<em>Invoice No Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getInvoiceNoType()
	 * @generated
	 */
	int INVOICE_NO_TYPE = 79;

	/**
	 * The meta object id for the '<em>Invoice Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceStatusType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getInvoiceStatusTypeObject()
	 * @generated
	 */
	int INVOICE_STATUS_TYPE_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Invoice Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getInvoiceTypeTypeObject()
	 * @generated
	 */
	int INVOICE_TYPE_TYPE_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Movement Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getMovementStatusTypeObject()
	 * @generated
	 */
	int MOVEMENT_STATUS_TYPE_OBJECT = 82;

	/**
	 * The meta object id for the '<em>Movement Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getMovementTypeTypeObject()
	 * @generated
	 */
	int MOVEMENT_TYPE_TYPE_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Payment Mechanism Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPaymentMechanismTypeObject()
	 * @generated
	 */
	int PAYMENT_MECHANISM_TYPE_OBJECT = 84;

	/**
	 * The meta object id for the '<em>Payment Ref No Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPaymentRefNoType()
	 * @generated
	 */
	int PAYMENT_REF_NO_TYPE = 85;

	/**
	 * The meta object id for the '<em>Payment Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPaymentStatusTypeObject()
	 * @generated
	 */
	int PAYMENT_STATUS_TYPE_OBJECT = 86;

	/**
	 * The meta object id for the '<em>Payment Tax Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPaymentTaxCode()
	 * @generated
	 */
	int PAYMENT_TAX_CODE = 87;

	/**
	 * The meta object id for the '<em>Period Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPeriodType()
	 * @generated
	 */
	int PERIOD_TYPE = 88;

	/**
	 * The meta object id for the '<em>Postal Code PT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getPostalCodePT()
	 * @generated
	 */
	int POSTAL_CODE_PT = 89;

	/**
	 * The meta object id for the '<em>Product Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ProductTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getProductTypeTypeObject()
	 * @generated
	 */
	int PRODUCT_TYPE_TYPE_OBJECT = 90;

	/**
	 * The meta object id for the '<em>SA Fdate Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFdateTimeType()
	 * @generated
	 */
	int SA_FDATE_TIME_TYPE = 91;

	/**
	 * The meta object id for the '<em>SA Fdate Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFdateType()
	 * @generated
	 */
	int SA_FDATE_TYPE = 92;

	/**
	 * The meta object id for the '<em>SA Fdecimal Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFdecimalType()
	 * @generated
	 */
	int SA_FDECIMAL_TYPE = 93;

	/**
	 * The meta object id for the '<em>SA Fmonetary Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFmonetaryType()
	 * @generated
	 */
	int SA_FMONETARY_TYPE = 94;

	/**
	 * The meta object id for the '<em>SAFPT Accounting Period</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTAccountingPeriod()
	 * @generated
	 */
	int SAFPT_ACCOUNTING_PERIOD = 95;

	/**
	 * The meta object id for the '<em>SAFPT Date Span</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTDateSpan()
	 * @generated
	 */
	int SAFPT_DATE_SPAN = 96;

	/**
	 * The meta object id for the '<em>SAFPTGL Account ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTGLAccountID()
	 * @generated
	 */
	int SAFPTGL_ACCOUNT_ID = 97;

	/**
	 * The meta object id for the '<em>SAFPT Journal ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTJournalID()
	 * @generated
	 */
	int SAFPT_JOURNAL_ID = 98;

	/**
	 * The meta object id for the '<em>SAFPT Portuguese Tax Exemption</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTPortugueseTaxExemption()
	 * @generated
	 */
	int SAFPT_PORTUGUESE_TAX_EXEMPTION = 99;

	/**
	 * The meta object id for the '<em>SAFPT Portuguese Vat Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTPortugueseVatNumber()
	 * @generated
	 */
	int SAFPT_PORTUGUESE_VAT_NUMBER = 100;

	/**
	 * The meta object id for the '<em>SAFPT Product ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTProductID()
	 * @generated
	 */
	int SAFPT_PRODUCT_ID = 101;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max100 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax100Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX100_CAR = 102;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max10 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax10Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR = 103;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max172 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax172Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX172_CAR = 104;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max200 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax200Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR = 105;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max20 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax20Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR = 106;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max255 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax255Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR = 107;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max30 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax30Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR = 108;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max35 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax35Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX35_CAR = 109;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max3 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax3Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR = 110;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max40 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax40Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR = 111;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max50 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax50Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR = 112;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max60 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax60Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR = 113;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max70 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax70Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR = 114;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max90 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMandatoryMax90Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX90_CAR = 115;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Max40 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTtextTypeMax40Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MAX40_CAR = 116;

	/**
	 * The meta object id for the '<em>SAFPT Transaction ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFPTTransactionID()
	 * @generated
	 */
	int SAFPT_TRANSACTION_ID = 117;

	/**
	 * The meta object id for the '<em>SAFTPT Doc Archival Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFTPTDocArchivalNumber()
	 * @generated
	 */
	int SAFTPT_DOC_ARCHIVAL_NUMBER = 118;

	/**
	 * The meta object id for the '<em>SAFTPT Movement Tax Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFTPTMovementTaxCode()
	 * @generated
	 */
	int SAFTPT_MOVEMENT_TAX_CODE = 119;

	/**
	 * The meta object id for the '<em>SAFTPT Movement Tax Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTMovementTaxType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFTPTMovementTaxTypeObject()
	 * @generated
	 */
	int SAFTPT_MOVEMENT_TAX_TYPE_OBJECT = 120;

	/**
	 * The meta object id for the '<em>SAFTPT Payment Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTPaymentType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFTPTPaymentTypeObject()
	 * @generated
	 */
	int SAFTPT_PAYMENT_TYPE_OBJECT = 121;

	/**
	 * The meta object id for the '<em>SAFTPT Source Billing Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFTPTSourceBillingObject()
	 * @generated
	 */
	int SAFTPT_SOURCE_BILLING_OBJECT = 122;

	/**
	 * The meta object id for the '<em>SAFTPT Source Payment Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSAFTPTSourcePaymentObject()
	 * @generated
	 */
	int SAFTPT_SOURCE_PAYMENT_OBJECT = 123;

	/**
	 * The meta object id for the '<em>Self Billing Indicator Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSelfBillingIndicatorType()
	 * @generated
	 */
	int SELF_BILLING_INDICATOR_TYPE = 124;

	/**
	 * The meta object id for the '<em>Supplier Country</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getSupplierCountry()
	 * @generated
	 */
	int SUPPLIER_COUNTRY = 125;

	/**
	 * The meta object id for the '<em>Tax Accounting Basis Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxAccountingBasisType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTaxAccountingBasisTypeObject()
	 * @generated
	 */
	int TAX_ACCOUNTING_BASIS_TYPE_OBJECT = 126;

	/**
	 * The meta object id for the '<em>Tax Code Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTaxCodeType()
	 * @generated
	 */
	int TAX_CODE_TYPE = 127;

	/**
	 * The meta object id for the '<em>Tax Country Region Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTaxCountryRegionType()
	 * @generated
	 */
	int TAX_COUNTRY_REGION_TYPE = 128;

	/**
	 * The meta object id for the '<em>Tax Table Entry Tax Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTaxTableEntryTaxCode()
	 * @generated
	 */
	int TAX_TABLE_ENTRY_TAX_CODE = 129;

	/**
	 * The meta object id for the '<em>Tax Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTaxTypeTypeObject()
	 * @generated
	 */
	int TAX_TYPE_TYPE_OBJECT = 130;

	/**
	 * The meta object id for the '<em>Third Parties Billing Indicator Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getThirdPartiesBillingIndicatorType()
	 * @generated
	 */
	int THIRD_PARTIES_BILLING_INDICATOR_TYPE = 131;

	/**
	 * The meta object id for the '<em>Transaction Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getTransactionTypeTypeObject()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE_OBJECT = 132;

	/**
	 * The meta object id for the '<em>Withholding Tax Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTaxTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getWithholdingTaxTypeTypeObject()
	 * @generated
	 */
	int WITHHOLDING_TAX_TYPE_TYPE_OBJECT = 133;

	/**
	 * The meta object id for the '<em>Work Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getWorkStatusTypeObject()
	 * @generated
	 */
	int WORK_STATUS_TYPE_OBJECT = 134;

	/**
	 * The meta object id for the '<em>Work Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkTypeType
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.impl._301PackageImpl#getWorkTypeTypeObject()
	 * @generated
	 */
	int WORK_TYPE_TYPE_OBJECT = 135;


	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure <em>Address Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Structure</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure
	 * @generated
	 */
	EClass getAddressStructure();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getBuildingNumber <em>Building Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getBuildingNumber()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_BuildingNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getStreetName <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Name</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getStreetName()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_StreetName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getAddressDetail <em>Address Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Detail</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getAddressDetail()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_AddressDetail();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getCity()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_City();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getPostalCode()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getRegion()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_Region();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure#getCountry()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_Country();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT <em>Address Structure PT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Structure PT</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT
	 * @generated
	 */
	EClass getAddressStructurePT();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getBuildingNumber <em>Building Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getBuildingNumber()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_BuildingNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getStreetName <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Name</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getStreetName()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_StreetName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getAddressDetail <em>Address Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Detail</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getAddressDetail()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_AddressDetail();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getCity()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_City();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getPostalCode()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getRegion()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_Region();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT#getCountry()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_Country();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType <em>Audit File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audit File Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType
	 * @generated
	 */
	EClass getAuditFileType();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType#getHeader()
	 * @see #getAuditFileType()
	 * @generated
	 */
	EReference getAuditFileType_Header();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType#getMasterFiles <em>Master Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Files</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType#getMasterFiles()
	 * @see #getAuditFileType()
	 * @generated
	 */
	EReference getAuditFileType_MasterFiles();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType#getGeneralLedgerEntries <em>General Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Ledger Entries</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType#getGeneralLedgerEntries()
	 * @see #getAuditFileType()
	 * @generated
	 */
	EReference getAuditFileType_GeneralLedgerEntries();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType#getSourceDocuments <em>Source Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Documents</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType#getSourceDocuments()
	 * @see #getAuditFileType()
	 * @generated
	 */
	EReference getAuditFileType_SourceDocuments();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Currency
	 * @generated
	 */
	EClass getCurrency();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Currency#getCurrencyCode <em>Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Currency#getCurrencyCode()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_CurrencyCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Currency#getCurrencyAmount <em>Currency Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Currency#getCurrencyAmount()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_CurrencyAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Currency#getExchangeRate <em>Exchange Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Rate</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Currency#getExchangeRate()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_ExchangeRate();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType <em>Customer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType
	 * @generated
	 */
	EClass getCustomerType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getCustomerID()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_CustomerID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getAccountID()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_AccountID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getCustomerTaxID <em>Customer Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getCustomerTaxID()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_CustomerTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getCompanyName()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getContact()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_Contact();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getBillingAddress <em>Billing Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Billing Address</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getBillingAddress()
	 * @see #getCustomerType()
	 * @generated
	 */
	EReference getCustomerType_BillingAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getShipToAddress <em>Ship To Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ship To Address</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getShipToAddress()
	 * @see #getCustomerType()
	 * @generated
	 */
	EReference getCustomerType_ShipToAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getTelephone()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getFax()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_Fax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getEmail()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_Email();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getWebsite()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_Website();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getSelfBillingIndicator <em>Self Billing Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Billing Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.CustomerType#getSelfBillingIndicator()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_SelfBillingIndicator();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAccountDescription <em>Account Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAccountDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AccountDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAccountID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AccountID();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Address();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAddressDetail <em>Address Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Detail</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAddressDetail()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AddressDetail();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getATDocCodeID <em>AT Doc Code ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AT Doc Code ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getATDocCodeID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ATDocCodeID();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAuditFile <em>Audit File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audit File</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAuditFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuditFile();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAuditFileVersion <em>Audit File Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audit File Version</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getAuditFileVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AuditFileVersion();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getBillingAddress <em>Billing Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Billing Address</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getBillingAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BillingAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getBuildingNumber <em>Building Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getBuildingNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BuildingNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getBusinessName <em>Business Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Name</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getBusinessName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BusinessName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCashVATSchemeIndicator <em>Cash VAT Scheme Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cash VAT Scheme Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCashVATSchemeIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CashVATSchemeIndicator();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_City();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getClosingCreditBalance <em>Closing Credit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closing Credit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getClosingCreditBalance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ClosingCreditBalance();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getClosingDebitBalance <em>Closing Debit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closing Debit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getClosingDebitBalance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ClosingDebitBalance();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCompanyAddress <em>Company Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Company Address</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCompanyAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CompanyAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCompanyID <em>Company ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCompanyID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CompanyID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCompanyName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getContact()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Contact();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCountry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Country();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCreditAmount <em>Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCreditAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CreditAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCurrencyAmount <em>Currency Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCurrencyAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CurrencyAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCurrencyCode <em>Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCurrencyCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CurrencyCode();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customer</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCustomer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Customer();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCustomerID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CustomerID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCustomerTaxID <em>Customer Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getCustomerTaxID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CustomerTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDateCreated()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DateCreated();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDebitAmount <em>Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDebitAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DebitAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDeliveryDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DeliveryDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDeliveryID <em>Delivery ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDeliveryID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DeliveryID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDocArchivalNumber <em>Doc Archival Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Archival Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDocArchivalNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DocArchivalNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDocumentNumber <em>Document Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getDocumentNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DocumentNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getEACCode <em>EAC Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAC Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getEACCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EACCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getEmail()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Email();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getEndDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getExchangeRate <em>Exchange Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Rate</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getExchangeRate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ExchangeRate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getFax()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Fax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getFiscalYear <em>Fiscal Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fiscal Year</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getFiscalYear()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FiscalYear();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getGeneralLedger <em>General Ledger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Ledger</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getGeneralLedger()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GeneralLedger();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getGeneralLedgerEntries <em>General Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Ledger Entries</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getGeneralLedgerEntries()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GeneralLedgerEntries();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getGLPostingDate <em>GL Posting Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GL Posting Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getGLPostingDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GLPostingDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getGrossTotal <em>Gross Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Total</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getGrossTotal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GrossTotal();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getGroupingCategory <em>Grouping Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping Category</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getGroupingCategory()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GroupingCategory();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getHash()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Hash();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getHashControl <em>Hash Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Control</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getHashControl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HashControl();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getHeader()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Header();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getHeaderComment <em>Header Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Comment</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getHeaderComment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HeaderComment();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getInvoiceDate <em>Invoice Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getInvoiceDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InvoiceDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getInvoiceNo <em>Invoice No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice No</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getInvoiceNo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InvoiceNo();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getInvoiceStatus <em>Invoice Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getInvoiceStatus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InvoiceStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getInvoiceStatusDate <em>Invoice Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Status Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getInvoiceStatusDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InvoiceStatusDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getInvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getInvoiceType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InvoiceType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getJournalID <em>Journal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journal ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getJournalID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_JournalID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getLineNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LineNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getLocationID <em>Location ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getLocationID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LocationID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementComments <em>Movement Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Comments</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementComments()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MovementComments();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementDate <em>Movement Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MovementDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementEndTime <em>Movement End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement End Time</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementEndTime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MovementEndTime();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementStartTime <em>Movement Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Start Time</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementStartTime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MovementStartTime();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementStatus <em>Movement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementStatus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MovementStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementStatusDate <em>Movement Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Status Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementStatusDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MovementStatusDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementType <em>Movement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getMovementType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MovementType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getNetTotal <em>Net Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Total</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getNetTotal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NetTotal();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getNumberOfEntries()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getNumberOfMovementLines <em>Number Of Movement Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Movement Lines</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getNumberOfMovementLines()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumberOfMovementLines();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getOpeningCreditBalance <em>Opening Credit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Credit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getOpeningCreditBalance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OpeningCreditBalance();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getOpeningDebitBalance <em>Opening Debit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Debit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getOpeningDebitBalance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OpeningDebitBalance();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getOrderDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OrderDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getOriginatingON <em>Originating ON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originating ON</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getOriginatingON()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OriginatingON();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPaymentMechanism <em>Payment Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Mechanism</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPaymentMechanism()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PaymentMechanism();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPaymentRefNo <em>Payment Ref No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Ref No</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPaymentRefNo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PaymentRefNo();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPaymentStatus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PaymentStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPaymentStatusDate <em>Payment Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Status Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPaymentStatusDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PaymentStatusDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPeriod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Period();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getPostalCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProduct()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Product();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductCode <em>Product Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductCompanyTaxID <em>Product Company Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Company Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductCompanyTaxID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductCompanyTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductDescription <em>Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductGroup <em>Product Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Group</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductGroup();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductNumberCode <em>Product Number Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Number Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductNumberCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductNumberCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Version</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getProductVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductVersion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getQuantity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getReason()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Reason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getRecordID <em>Record ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getRecordID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RecordID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Reference();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getRegion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Region();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSelfBillingIndicator <em>Self Billing Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Billing Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSelfBillingIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SelfBillingIndicator();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSettlementAmount <em>Settlement Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSettlementAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SettlementAmount();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getShipFrom <em>Ship From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship From</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getShipFrom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShipFrom();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getShipFromAddress <em>Ship From Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship From Address</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getShipFromAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShipFromAddress();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getShipTo <em>Ship To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship To</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getShipTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShipTo();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getShipToAddress <em>Ship To Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship To Address</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getShipToAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShipToAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSoftwareCertificateNumber <em>Software Certificate Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Certificate Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSoftwareCertificateNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SoftwareCertificateNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSourceDocumentID <em>Source Document ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Document ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSourceDocumentID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SourceDocumentID();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSourceDocuments <em>Source Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Documents</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSourceDocuments()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SourceDocuments();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSourceID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getStartDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getStreetName <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Name</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getStreetName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StreetName();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplier</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSupplier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Supplier();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSupplierID <em>Supplier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSupplierID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SupplierID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSupplierTaxID <em>Supplier Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSupplierTaxID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SupplierTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSystemEntryDate <em>System Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Entry Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSystemEntryDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SystemEntryDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSystemID <em>System ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getSystemID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SystemID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxAccountingBasis <em>Tax Accounting Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Accounting Basis</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxAccountingBasis()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxAccountingBasis();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxAmount <em>Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxCode <em>Tax Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxCountryRegion <em>Tax Country Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Country Region</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxCountryRegion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxCountryRegion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxEntity <em>Tax Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Entity</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxEntity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxEntity();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxExemptionReason <em>Tax Exemption Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Exemption Reason</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxExemptionReason()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxExemptionReason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxExpirationDate <em>Tax Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Expiration Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxExpirationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxPayable <em>Tax Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Payable</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxPayable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxPayable();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxPercentage <em>Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Percentage</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxPercentage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxPercentage();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxPointDate <em>Tax Point Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Point Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxPointDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxPointDate();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxTable <em>Tax Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax Table</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaxTable();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxTableEntry <em>Tax Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax Table Entry</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxTableEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaxTableEntry();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxVerificationDate <em>Tax Verification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Verification Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTaxVerificationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxVerificationDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTelephone()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getThirdPartiesBillingIndicator <em>Third Parties Billing Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third Parties Billing Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getThirdPartiesBillingIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ThirdPartiesBillingIndicator();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTotalCredit <em>Total Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Credit</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTotalCredit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TotalCredit();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTotalDebit <em>Total Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Debit</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTotalDebit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TotalDebit();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTotalQuantityIssued <em>Total Quantity Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Quantity Issued</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTotalQuantityIssued()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TotalQuantityIssued();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTransactionDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransactionDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTransactionID <em>Transaction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTransactionID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransactionID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getTransactionType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getUnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Measure</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getUnitOfMeasure()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UnitOfMeasure();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getUnitPrice()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UnitPrice();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWarehouseID <em>Warehouse ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warehouse ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWarehouseID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WarehouseID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWebsite()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Website();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWithholdingTaxType <em>Withholding Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Withholding Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWithholdingTaxType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WithholdingTaxType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWorkDate <em>Work Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWorkDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WorkDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWorkStatus <em>Work Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWorkStatus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WorkStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWorkStatusDate <em>Work Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Status Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWorkStatusDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WorkStatusDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWorkType <em>Work Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot#getWorkType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WorkType();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType <em>Document Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Status Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType
	 * @generated
	 */
	EClass getDocumentStatusType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getWorkStatus <em>Work Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getWorkStatus()
	 * @see #getDocumentStatusType()
	 * @generated
	 */
	EAttribute getDocumentStatusType_WorkStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getWorkStatusDate <em>Work Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Status Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getWorkStatusDate()
	 * @see #getDocumentStatusType()
	 * @generated
	 */
	EAttribute getDocumentStatusType_WorkStatusDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getReason()
	 * @see #getDocumentStatusType()
	 * @generated
	 */
	EAttribute getDocumentStatusType_Reason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getSourceID()
	 * @see #getDocumentStatusType()
	 * @generated
	 */
	EAttribute getDocumentStatusType_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getSourceBilling <em>Source Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Billing</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getSourceBilling()
	 * @see #getDocumentStatusType()
	 * @generated
	 */
	EAttribute getDocumentStatusType_SourceBilling();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1 <em>Document Status Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Status Type1</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1
	 * @generated
	 */
	EClass getDocumentStatusType1();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getPaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getPaymentStatus()
	 * @see #getDocumentStatusType1()
	 * @generated
	 */
	EAttribute getDocumentStatusType1_PaymentStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getPaymentStatusDate <em>Payment Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Status Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getPaymentStatusDate()
	 * @see #getDocumentStatusType1()
	 * @generated
	 */
	EAttribute getDocumentStatusType1_PaymentStatusDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getReason()
	 * @see #getDocumentStatusType1()
	 * @generated
	 */
	EAttribute getDocumentStatusType1_Reason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getSourceID()
	 * @see #getDocumentStatusType1()
	 * @generated
	 */
	EAttribute getDocumentStatusType1_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getSourcePayment <em>Source Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Payment</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getSourcePayment()
	 * @see #getDocumentStatusType1()
	 * @generated
	 */
	EAttribute getDocumentStatusType1_SourcePayment();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2 <em>Document Status Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Status Type2</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2
	 * @generated
	 */
	EClass getDocumentStatusType2();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getMovementStatus <em>Movement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getMovementStatus()
	 * @see #getDocumentStatusType2()
	 * @generated
	 */
	EAttribute getDocumentStatusType2_MovementStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getMovementStatusDate <em>Movement Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Status Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getMovementStatusDate()
	 * @see #getDocumentStatusType2()
	 * @generated
	 */
	EAttribute getDocumentStatusType2_MovementStatusDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getReason()
	 * @see #getDocumentStatusType2()
	 * @generated
	 */
	EAttribute getDocumentStatusType2_Reason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getSourceID()
	 * @see #getDocumentStatusType2()
	 * @generated
	 */
	EAttribute getDocumentStatusType2_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getSourceBilling <em>Source Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Billing</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getSourceBilling()
	 * @see #getDocumentStatusType2()
	 * @generated
	 */
	EAttribute getDocumentStatusType2_SourceBilling();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3 <em>Document Status Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Status Type3</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3
	 * @generated
	 */
	EClass getDocumentStatusType3();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3#getInvoiceStatus <em>Invoice Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3#getInvoiceStatus()
	 * @see #getDocumentStatusType3()
	 * @generated
	 */
	EAttribute getDocumentStatusType3_InvoiceStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3#getInvoiceStatusDate <em>Invoice Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Status Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3#getInvoiceStatusDate()
	 * @see #getDocumentStatusType3()
	 * @generated
	 */
	EAttribute getDocumentStatusType3_InvoiceStatusDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3#getReason()
	 * @see #getDocumentStatusType3()
	 * @generated
	 */
	EAttribute getDocumentStatusType3_Reason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3#getSourceID()
	 * @see #getDocumentStatusType3()
	 * @generated
	 */
	EAttribute getDocumentStatusType3_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3#getSourceBilling <em>Source Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Billing</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType3#getSourceBilling()
	 * @see #getDocumentStatusType3()
	 * @generated
	 */
	EAttribute getDocumentStatusType3_SourceBilling();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType <em>Document Totals Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Totals Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType
	 * @generated
	 */
	EClass getDocumentTotalsType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType#getTaxPayable <em>Tax Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Payable</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType#getTaxPayable()
	 * @see #getDocumentTotalsType()
	 * @generated
	 */
	EAttribute getDocumentTotalsType_TaxPayable();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType#getNetTotal <em>Net Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Total</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType#getNetTotal()
	 * @see #getDocumentTotalsType()
	 * @generated
	 */
	EAttribute getDocumentTotalsType_NetTotal();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType#getGrossTotal <em>Gross Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Total</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType#getGrossTotal()
	 * @see #getDocumentTotalsType()
	 * @generated
	 */
	EAttribute getDocumentTotalsType_GrossTotal();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType#getCurrency()
	 * @see #getDocumentTotalsType()
	 * @generated
	 */
	EReference getDocumentTotalsType_Currency();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType1 <em>Document Totals Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Totals Type1</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType1
	 * @generated
	 */
	EClass getDocumentTotalsType1();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType1#getTaxPayable <em>Tax Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Payable</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType1#getTaxPayable()
	 * @see #getDocumentTotalsType1()
	 * @generated
	 */
	EAttribute getDocumentTotalsType1_TaxPayable();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType1#getNetTotal <em>Net Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Total</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType1#getNetTotal()
	 * @see #getDocumentTotalsType1()
	 * @generated
	 */
	EAttribute getDocumentTotalsType1_NetTotal();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType1#getGrossTotal <em>Gross Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Total</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType1#getGrossTotal()
	 * @see #getDocumentTotalsType1()
	 * @generated
	 */
	EAttribute getDocumentTotalsType1_GrossTotal();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType1#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType1#getCurrency()
	 * @see #getDocumentTotalsType1()
	 * @generated
	 */
	EReference getDocumentTotalsType1_Currency();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2 <em>Document Totals Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Totals Type2</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2
	 * @generated
	 */
	EClass getDocumentTotalsType2();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2#getTaxPayable <em>Tax Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Payable</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2#getTaxPayable()
	 * @see #getDocumentTotalsType2()
	 * @generated
	 */
	EAttribute getDocumentTotalsType2_TaxPayable();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2#getNetTotal <em>Net Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Total</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2#getNetTotal()
	 * @see #getDocumentTotalsType2()
	 * @generated
	 */
	EAttribute getDocumentTotalsType2_NetTotal();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2#getGrossTotal <em>Gross Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Total</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2#getGrossTotal()
	 * @see #getDocumentTotalsType2()
	 * @generated
	 */
	EAttribute getDocumentTotalsType2_GrossTotal();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2#getSettlement <em>Settlement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settlement</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2#getSettlement()
	 * @see #getDocumentTotalsType2()
	 * @generated
	 */
	EReference getDocumentTotalsType2_Settlement();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType2#getCurrency()
	 * @see #getDocumentTotalsType2()
	 * @generated
	 */
	EReference getDocumentTotalsType2_Currency();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3 <em>Document Totals Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Totals Type3</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3
	 * @generated
	 */
	EClass getDocumentTotalsType3();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getTaxPayable <em>Tax Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Payable</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getTaxPayable()
	 * @see #getDocumentTotalsType3()
	 * @generated
	 */
	EAttribute getDocumentTotalsType3_TaxPayable();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getNetTotal <em>Net Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Total</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getNetTotal()
	 * @see #getDocumentTotalsType3()
	 * @generated
	 */
	EAttribute getDocumentTotalsType3_NetTotal();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getGrossTotal <em>Gross Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Total</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getGrossTotal()
	 * @see #getDocumentTotalsType3()
	 * @generated
	 */
	EAttribute getDocumentTotalsType3_GrossTotal();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getCurrency()
	 * @see #getDocumentTotalsType3()
	 * @generated
	 */
	EReference getDocumentTotalsType3_Currency();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getSettlement <em>Settlement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settlement</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getSettlement()
	 * @see #getDocumentTotalsType3()
	 * @generated
	 */
	EReference getDocumentTotalsType3_Settlement();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payment</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.DocumentTotalsType3#getPayment()
	 * @see #getDocumentTotalsType3()
	 * @generated
	 */
	EReference getDocumentTotalsType3_Payment();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerEntriesType <em>General Ledger Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Ledger Entries Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerEntriesType
	 * @generated
	 */
	EClass getGeneralLedgerEntriesType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerEntriesType#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerEntriesType#getNumberOfEntries()
	 * @see #getGeneralLedgerEntriesType()
	 * @generated
	 */
	EAttribute getGeneralLedgerEntriesType_NumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerEntriesType#getTotalDebit <em>Total Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Debit</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerEntriesType#getTotalDebit()
	 * @see #getGeneralLedgerEntriesType()
	 * @generated
	 */
	EAttribute getGeneralLedgerEntriesType_TotalDebit();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerEntriesType#getTotalCredit <em>Total Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Credit</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerEntriesType#getTotalCredit()
	 * @see #getGeneralLedgerEntriesType()
	 * @generated
	 */
	EAttribute getGeneralLedgerEntriesType_TotalCredit();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerEntriesType#getJournal <em>Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Journal</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerEntriesType#getJournal()
	 * @see #getGeneralLedgerEntriesType()
	 * @generated
	 */
	EReference getGeneralLedgerEntriesType_Journal();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType <em>General Ledger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Ledger Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType
	 * @generated
	 */
	EClass getGeneralLedgerType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getAccountID()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_AccountID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getAccountDescription <em>Account Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getAccountDescription()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_AccountDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getOpeningDebitBalance <em>Opening Debit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Debit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getOpeningDebitBalance()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_OpeningDebitBalance();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getOpeningCreditBalance <em>Opening Credit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Credit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getOpeningCreditBalance()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_OpeningCreditBalance();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getClosingDebitBalance <em>Closing Debit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closing Debit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getClosingDebitBalance()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_ClosingDebitBalance();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getClosingCreditBalance <em>Closing Credit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closing Credit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getClosingCreditBalance()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_ClosingCreditBalance();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getGroupingCategory <em>Grouping Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping Category</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getGroupingCategory()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_GroupingCategory();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getGroupingCode <em>Grouping Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType#getGroupingCode()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_GroupingCode();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType
	 * @generated
	 */
	EClass getHeaderType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getAuditFileVersion <em>Audit File Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audit File Version</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getAuditFileVersion()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_AuditFileVersion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getCompanyID <em>Company ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getCompanyID()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_CompanyID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getTaxRegistrationNumber <em>Tax Registration Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Registration Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getTaxRegistrationNumber()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_TaxRegistrationNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getTaxAccountingBasis <em>Tax Accounting Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Accounting Basis</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getTaxAccountingBasis()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_TaxAccountingBasis();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getCompanyName()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getBusinessName <em>Business Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Name</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getBusinessName()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_BusinessName();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getCompanyAddress <em>Company Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Company Address</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getCompanyAddress()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_CompanyAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getFiscalYear <em>Fiscal Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fiscal Year</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getFiscalYear()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_FiscalYear();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getStartDate()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getEndDate()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getCurrencyCode <em>Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getCurrencyCode()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_CurrencyCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getDateCreated()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_DateCreated();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getTaxEntity <em>Tax Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Entity</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getTaxEntity()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_TaxEntity();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getProductCompanyTaxID <em>Product Company Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Company Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getProductCompanyTaxID()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_ProductCompanyTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getSoftwareCertificateNumber <em>Software Certificate Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Certificate Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getSoftwareCertificateNumber()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_SoftwareCertificateNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getProductID()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_ProductID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Version</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getProductVersion()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_ProductVersion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getHeaderComment <em>Header Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Comment</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getHeaderComment()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_HeaderComment();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getTelephone()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getFax()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Fax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getEmail()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Email();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.HeaderType#getWebsite()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Website();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType
	 * @generated
	 */
	EClass getInvoiceType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getInvoiceNo <em>Invoice No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice No</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getInvoiceNo()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_InvoiceNo();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getDocumentStatus <em>Document Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getDocumentStatus()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_DocumentStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getHash()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_Hash();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getHashControl <em>Hash Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Control</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getHashControl()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_HashControl();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getPeriod()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_Period();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getInvoiceDate <em>Invoice Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getInvoiceDate()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_InvoiceDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getInvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getInvoiceType()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_InvoiceType();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getSpecialRegimes <em>Special Regimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Special Regimes</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getSpecialRegimes()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_SpecialRegimes();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getSourceID()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getEACCode <em>EAC Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAC Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getEACCode()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_EACCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getSystemEntryDate <em>System Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Entry Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getSystemEntryDate()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_SystemEntryDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getTransactionID <em>Transaction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getTransactionID()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_TransactionID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getCustomerID()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_CustomerID();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getShipTo <em>Ship To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship To</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getShipTo()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_ShipTo();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getShipFrom <em>Ship From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship From</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getShipFrom()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_ShipFrom();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getMovementEndTime <em>Movement End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement End Time</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getMovementEndTime()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_MovementEndTime();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getMovementStartTime <em>Movement Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Start Time</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getMovementStartTime()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_MovementStartTime();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getLine()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_Line();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getDocumentTotals <em>Document Totals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Totals</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getDocumentTotals()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_DocumentTotals();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getWithholdingTax <em>Withholding Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Withholding Tax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceType#getWithholdingTax()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_WithholdingTax();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.JournalType <em>Journal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journal Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.JournalType
	 * @generated
	 */
	EClass getJournalType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.JournalType#getJournalID <em>Journal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journal ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.JournalType#getJournalID()
	 * @see #getJournalType()
	 * @generated
	 */
	EAttribute getJournalType_JournalID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.JournalType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.JournalType#getDescription()
	 * @see #getJournalType()
	 * @generated
	 */
	EAttribute getJournalType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.JournalType#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transaction</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.JournalType#getTransaction()
	 * @see #getJournalType()
	 * @generated
	 */
	EReference getJournalType_Transaction();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType
	 * @generated
	 */
	EClass getLineType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getLineNumber()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_LineNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getOrderReferences <em>Order References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order References</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getOrderReferences()
	 * @see #getLineType()
	 * @generated
	 */
	EReference getLineType_OrderReferences();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getProductCode <em>Product Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getProductCode()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_ProductCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getProductDescription <em>Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getProductDescription()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_ProductDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getQuantity()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getUnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Measure</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getUnitOfMeasure()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_UnitOfMeasure();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getUnitPrice()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_UnitPrice();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getDescription()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getDebitAmount <em>Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getDebitAmount()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_DebitAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getCreditAmount <em>Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getCreditAmount()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_CreditAmount();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getTax <em>Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getTax()
	 * @see #getLineType()
	 * @generated
	 */
	EReference getLineType_Tax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getTaxExemptionReason <em>Tax Exemption Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Exemption Reason</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getTaxExemptionReason()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_TaxExemptionReason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType#getSettlementAmount <em>Settlement Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType#getSettlementAmount()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_SettlementAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType1 <em>Line Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Type1</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType1
	 * @generated
	 */
	EClass getLineType1();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getLineNumber()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_LineNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getSourceDocumentID <em>Source Document ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Document ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getSourceDocumentID()
	 * @see #getLineType1()
	 * @generated
	 */
	EReference getLineType1_SourceDocumentID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getSettlementAmount <em>Settlement Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getSettlementAmount()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_SettlementAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getDebitAmount <em>Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getDebitAmount()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_DebitAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getCreditAmount <em>Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getCreditAmount()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_CreditAmount();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getTax <em>Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getTax()
	 * @see #getLineType1()
	 * @generated
	 */
	EReference getLineType1_Tax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getTaxExemptionReason <em>Tax Exemption Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Exemption Reason</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType1#getTaxExemptionReason()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_TaxExemptionReason();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2 <em>Line Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Type2</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2
	 * @generated
	 */
	EClass getLineType2();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getLineNumber()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_LineNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getOrderReferences <em>Order References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order References</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getOrderReferences()
	 * @see #getLineType2()
	 * @generated
	 */
	EReference getLineType2_OrderReferences();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getProductCode <em>Product Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getProductCode()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_ProductCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getProductDescription <em>Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getProductDescription()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_ProductDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getQuantity()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getUnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Measure</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getUnitOfMeasure()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_UnitOfMeasure();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getUnitPrice()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_UnitPrice();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getTaxPointDate <em>Tax Point Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Point Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getTaxPointDate()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_TaxPointDate();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getReferences()
	 * @see #getLineType2()
	 * @generated
	 */
	EReference getLineType2_References();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getDescription()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getDebitAmount <em>Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getDebitAmount()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_DebitAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getCreditAmount <em>Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getCreditAmount()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_CreditAmount();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getTax <em>Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getTax()
	 * @see #getLineType2()
	 * @generated
	 */
	EReference getLineType2_Tax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getTaxExemptionReason <em>Tax Exemption Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Exemption Reason</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getTaxExemptionReason()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_TaxExemptionReason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getSettlementAmount <em>Settlement Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType2#getSettlementAmount()
	 * @see #getLineType2()
	 * @generated
	 */
	EAttribute getLineType2_SettlementAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3 <em>Line Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Type3</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3
	 * @generated
	 */
	EClass getLineType3();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getLineNumber()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_LineNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getOrderReferences <em>Order References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order References</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getOrderReferences()
	 * @see #getLineType3()
	 * @generated
	 */
	EReference getLineType3_OrderReferences();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getProductCode <em>Product Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getProductCode()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_ProductCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getProductDescription <em>Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getProductDescription()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_ProductDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getQuantity()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getUnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Measure</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getUnitOfMeasure()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_UnitOfMeasure();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getUnitPrice()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_UnitPrice();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getTaxPointDate <em>Tax Point Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Point Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getTaxPointDate()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_TaxPointDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getDescription()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getDebitAmount <em>Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getDebitAmount()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_DebitAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getCreditAmount <em>Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getCreditAmount()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_CreditAmount();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getTax <em>Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getTax()
	 * @see #getLineType3()
	 * @generated
	 */
	EReference getLineType3_Tax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getTaxExemptionReason <em>Tax Exemption Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Exemption Reason</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getTaxExemptionReason()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_TaxExemptionReason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getSettlementAmount <em>Settlement Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType3#getSettlementAmount()
	 * @see #getLineType3()
	 * @generated
	 */
	EAttribute getLineType3_SettlementAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType4 <em>Line Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Type4</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType4
	 * @generated
	 */
	EClass getLineType4();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getRecordID <em>Record ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getRecordID()
	 * @see #getLineType4()
	 * @generated
	 */
	EAttribute getLineType4_RecordID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getAccountID()
	 * @see #getLineType4()
	 * @generated
	 */
	EAttribute getLineType4_AccountID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getSourceDocumentID <em>Source Document ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Document ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getSourceDocumentID()
	 * @see #getLineType4()
	 * @generated
	 */
	EAttribute getLineType4_SourceDocumentID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getSystemEntryDate <em>System Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Entry Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getSystemEntryDate()
	 * @see #getLineType4()
	 * @generated
	 */
	EAttribute getLineType4_SystemEntryDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getDescription()
	 * @see #getLineType4()
	 * @generated
	 */
	EAttribute getLineType4_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getDebitAmount <em>Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getDebitAmount()
	 * @see #getLineType4()
	 * @generated
	 */
	EAttribute getLineType4_DebitAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getCreditAmount <em>Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.LineType4#getCreditAmount()
	 * @see #getLineType4()
	 * @generated
	 */
	EAttribute getLineType4_CreditAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType <em>Master Files Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Files Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType
	 * @generated
	 */
	EClass getMasterFilesType();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType#getGeneralLedger <em>General Ledger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Ledger</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType#getGeneralLedger()
	 * @see #getMasterFilesType()
	 * @generated
	 */
	EReference getMasterFilesType_GeneralLedger();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customer</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType#getCustomer()
	 * @see #getMasterFilesType()
	 * @generated
	 */
	EReference getMasterFilesType_Customer();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplier</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType#getSupplier()
	 * @see #getMasterFilesType()
	 * @generated
	 */
	EReference getMasterFilesType_Supplier();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType#getProduct()
	 * @see #getMasterFilesType()
	 * @generated
	 */
	EReference getMasterFilesType_Product();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType#getTaxTable <em>Tax Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax Table</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MasterFilesType#getTaxTable()
	 * @see #getMasterFilesType()
	 * @generated
	 */
	EReference getMasterFilesType_TaxTable();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementOfGoodsType <em>Movement Of Goods Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement Of Goods Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementOfGoodsType
	 * @generated
	 */
	EClass getMovementOfGoodsType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementOfGoodsType#getNumberOfMovementLines <em>Number Of Movement Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Movement Lines</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementOfGoodsType#getNumberOfMovementLines()
	 * @see #getMovementOfGoodsType()
	 * @generated
	 */
	EAttribute getMovementOfGoodsType_NumberOfMovementLines();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementOfGoodsType#getTotalQuantityIssued <em>Total Quantity Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Quantity Issued</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementOfGoodsType#getTotalQuantityIssued()
	 * @see #getMovementOfGoodsType()
	 * @generated
	 */
	EAttribute getMovementOfGoodsType_TotalQuantityIssued();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementOfGoodsType#getStockMovement <em>Stock Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stock Movement</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementOfGoodsType#getStockMovement()
	 * @see #getMovementOfGoodsType()
	 * @generated
	 */
	EReference getMovementOfGoodsType_StockMovement();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementTax <em>Movement Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement Tax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementTax
	 * @generated
	 */
	EClass getMovementTax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementTax#getTaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementTax#getTaxType()
	 * @see #getMovementTax()
	 * @generated
	 */
	EAttribute getMovementTax_TaxType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementTax#getTaxCountryRegion <em>Tax Country Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Country Region</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementTax#getTaxCountryRegion()
	 * @see #getMovementTax()
	 * @generated
	 */
	EAttribute getMovementTax_TaxCountryRegion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementTax#getTaxCode <em>Tax Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementTax#getTaxCode()
	 * @see #getMovementTax()
	 * @generated
	 */
	EAttribute getMovementTax_TaxCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementTax#getTaxPercentage <em>Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Percentage</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementTax#getTaxPercentage()
	 * @see #getMovementTax()
	 * @generated
	 */
	EAttribute getMovementTax_TaxPercentage();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.OrderReferences <em>Order References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order References</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.OrderReferences
	 * @generated
	 */
	EClass getOrderReferences();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.OrderReferences#getOriginatingON <em>Originating ON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originating ON</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.OrderReferences#getOriginatingON()
	 * @see #getOrderReferences()
	 * @generated
	 */
	EAttribute getOrderReferences_OriginatingON();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.OrderReferences#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.OrderReferences#getOrderDate()
	 * @see #getOrderReferences()
	 * @generated
	 */
	EAttribute getOrderReferences_OrderDate();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Method</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod
	 * @generated
	 */
	EClass getPaymentMethod();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentMechanism <em>Payment Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Mechanism</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentMechanism()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EAttribute getPaymentMethod_PaymentMechanism();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentAmount <em>Payment Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentAmount()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EAttribute getPaymentMethod_PaymentAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentDate <em>Payment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentDate()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EAttribute getPaymentMethod_PaymentDate();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentsType <em>Payments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payments Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentsType
	 * @generated
	 */
	EClass getPaymentsType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentsType#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentsType#getNumberOfEntries()
	 * @see #getPaymentsType()
	 * @generated
	 */
	EAttribute getPaymentsType_NumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentsType#getTotalDebit <em>Total Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Debit</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentsType#getTotalDebit()
	 * @see #getPaymentsType()
	 * @generated
	 */
	EAttribute getPaymentsType_TotalDebit();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentsType#getTotalCredit <em>Total Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Credit</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentsType#getTotalCredit()
	 * @see #getPaymentsType()
	 * @generated
	 */
	EAttribute getPaymentsType_TotalCredit();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentsType#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payment</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentsType#getPayment()
	 * @see #getPaymentsType()
	 * @generated
	 */
	EReference getPaymentsType_Payment();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax <em>Payment Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Tax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax
	 * @generated
	 */
	EClass getPaymentTax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax#getTaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax#getTaxType()
	 * @see #getPaymentTax()
	 * @generated
	 */
	EAttribute getPaymentTax_TaxType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax#getTaxCountryRegion <em>Tax Country Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Country Region</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax#getTaxCountryRegion()
	 * @see #getPaymentTax()
	 * @generated
	 */
	EAttribute getPaymentTax_TaxCountryRegion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax#getTaxCode <em>Tax Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax#getTaxCode()
	 * @see #getPaymentTax()
	 * @generated
	 */
	EAttribute getPaymentTax_TaxCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax#getTaxPercentage <em>Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Percentage</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax#getTaxPercentage()
	 * @see #getPaymentTax()
	 * @generated
	 */
	EAttribute getPaymentTax_TaxPercentage();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax#getTaxAmount <em>Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentTax#getTaxAmount()
	 * @see #getPaymentTax()
	 * @generated
	 */
	EAttribute getPaymentTax_TaxAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType
	 * @generated
	 */
	EClass getPaymentType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getPaymentRefNo <em>Payment Ref No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Ref No</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getPaymentRefNo()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_PaymentRefNo();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getPeriod()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_Period();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getTransactionID <em>Transaction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getTransactionID()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_TransactionID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getTransactionDate()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_TransactionDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getPaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getPaymentType()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_PaymentType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getDescription()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getSystemID <em>System ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getSystemID()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_SystemID();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getDocumentStatus <em>Document Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getDocumentStatus()
	 * @see #getPaymentType()
	 * @generated
	 */
	EReference getPaymentType_DocumentStatus();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payment Method</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getPaymentMethod()
	 * @see #getPaymentType()
	 * @generated
	 */
	EReference getPaymentType_PaymentMethod();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getSourceID()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getSystemEntryDate <em>System Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Entry Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getSystemEntryDate()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_SystemEntryDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getCustomerID()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_CustomerID();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getLine()
	 * @see #getPaymentType()
	 * @generated
	 */
	EReference getPaymentType_Line();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getDocumentTotals <em>Document Totals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Totals</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getDocumentTotals()
	 * @see #getPaymentType()
	 * @generated
	 */
	EReference getPaymentType_DocumentTotals();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getWithholdingTax <em>Withholding Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Withholding Tax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentType#getWithholdingTax()
	 * @see #getPaymentType()
	 * @generated
	 */
	EReference getPaymentType_WithholdingTax();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ProductType
	 * @generated
	 */
	EClass getProductType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.ProductType#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ProductType#getProductType()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.ProductType#getProductCode <em>Product Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ProductType#getProductCode()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.ProductType#getProductGroup <em>Product Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Group</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ProductType#getProductGroup()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductGroup();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.ProductType#getProductDescription <em>Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ProductType#getProductDescription()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.ProductType#getProductNumberCode <em>Product Number Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Number Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ProductType#getProductNumberCode()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductNumberCode();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.References <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.References
	 * @generated
	 */
	EClass getReferences();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.References#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.References#getReference()
	 * @see #getReferences()
	 * @generated
	 */
	EAttribute getReferences_Reference();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.References#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.References#getReason()
	 * @see #getReferences()
	 * @generated
	 */
	EAttribute getReferences_Reason();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.SalesInvoicesType <em>Sales Invoices Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Invoices Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SalesInvoicesType
	 * @generated
	 */
	EClass getSalesInvoicesType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SalesInvoicesType#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SalesInvoicesType#getNumberOfEntries()
	 * @see #getSalesInvoicesType()
	 * @generated
	 */
	EAttribute getSalesInvoicesType_NumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SalesInvoicesType#getTotalDebit <em>Total Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Debit</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SalesInvoicesType#getTotalDebit()
	 * @see #getSalesInvoicesType()
	 * @generated
	 */
	EAttribute getSalesInvoicesType_TotalDebit();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SalesInvoicesType#getTotalCredit <em>Total Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Credit</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SalesInvoicesType#getTotalCredit()
	 * @see #getSalesInvoicesType()
	 * @generated
	 */
	EAttribute getSalesInvoicesType_TotalCredit();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.SalesInvoicesType#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invoice</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SalesInvoicesType#getInvoice()
	 * @see #getSalesInvoicesType()
	 * @generated
	 */
	EReference getSalesInvoicesType_Invoice();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.Settlement <em>Settlement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settlement</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Settlement
	 * @generated
	 */
	EClass getSettlement();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Settlement#getSettlementDiscount <em>Settlement Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Discount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Settlement#getSettlementDiscount()
	 * @see #getSettlement()
	 * @generated
	 */
	EAttribute getSettlement_SettlementDiscount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Settlement#getSettlementAmount <em>Settlement Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Settlement#getSettlementAmount()
	 * @see #getSettlement()
	 * @generated
	 */
	EAttribute getSettlement_SettlementAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Settlement#getSettlementDate <em>Settlement Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Settlement#getSettlementDate()
	 * @see #getSettlement()
	 * @generated
	 */
	EAttribute getSettlement_SettlementDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Settlement#getPaymentTerms <em>Payment Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Terms</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Settlement#getPaymentTerms()
	 * @see #getSettlement()
	 * @generated
	 */
	EAttribute getSettlement_PaymentTerms();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.SettlementType <em>Settlement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settlement Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SettlementType
	 * @generated
	 */
	EClass getSettlementType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SettlementType#getSettlementAmount <em>Settlement Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SettlementType#getSettlementAmount()
	 * @see #getSettlementType()
	 * @generated
	 */
	EAttribute getSettlementType_SettlementAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure <em>Shipping Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipping Point Structure</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure
	 * @generated
	 */
	EClass getShippingPointStructure();

	/**
	 * Returns the meta object for the attribute list '{@link oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getDeliveryID <em>Delivery ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Delivery ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getDeliveryID()
	 * @see #getShippingPointStructure()
	 * @generated
	 */
	EAttribute getShippingPointStructure_DeliveryID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getDeliveryDate()
	 * @see #getShippingPointStructure()
	 * @generated
	 */
	EAttribute getShippingPointStructure_DeliveryDate();

	/**
	 * Returns the meta object for the attribute list '{@link oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getGroup()
	 * @see #getShippingPointStructure()
	 * @generated
	 */
	EAttribute getShippingPointStructure_Group();

	/**
	 * Returns the meta object for the attribute list '{@link oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getWarehouseID <em>Warehouse ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Warehouse ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getWarehouseID()
	 * @see #getShippingPointStructure()
	 * @generated
	 */
	EAttribute getShippingPointStructure_WarehouseID();

	/**
	 * Returns the meta object for the attribute list '{@link oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getLocationID <em>Location ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getLocationID()
	 * @see #getShippingPointStructure()
	 * @generated
	 */
	EAttribute getShippingPointStructure_LocationID();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure#getAddress()
	 * @see #getShippingPointStructure()
	 * @generated
	 */
	EReference getShippingPointStructure_Address();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentIDType <em>Source Document ID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Document ID Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentIDType
	 * @generated
	 */
	EClass getSourceDocumentIDType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentIDType#getOriginatingON <em>Originating ON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originating ON</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentIDType#getOriginatingON()
	 * @see #getSourceDocumentIDType()
	 * @generated
	 */
	EAttribute getSourceDocumentIDType_OriginatingON();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentIDType#getInvoiceDate <em>Invoice Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentIDType#getInvoiceDate()
	 * @see #getSourceDocumentIDType()
	 * @generated
	 */
	EAttribute getSourceDocumentIDType_InvoiceDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentIDType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentIDType#getDescription()
	 * @see #getSourceDocumentIDType()
	 * @generated
	 */
	EAttribute getSourceDocumentIDType_Description();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType <em>Source Documents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Documents Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType
	 * @generated
	 */
	EClass getSourceDocumentsType();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType#getSalesInvoices <em>Sales Invoices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sales Invoices</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType#getSalesInvoices()
	 * @see #getSourceDocumentsType()
	 * @generated
	 */
	EReference getSourceDocumentsType_SalesInvoices();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType#getMovementOfGoods <em>Movement Of Goods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Movement Of Goods</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType#getMovementOfGoods()
	 * @see #getSourceDocumentsType()
	 * @generated
	 */
	EReference getSourceDocumentsType_MovementOfGoods();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType#getWorkingDocuments <em>Working Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Working Documents</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType#getWorkingDocuments()
	 * @see #getSourceDocumentsType()
	 * @generated
	 */
	EReference getSourceDocumentsType_WorkingDocuments();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType#getPayments <em>Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payments</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType#getPayments()
	 * @see #getSourceDocumentsType()
	 * @generated
	 */
	EReference getSourceDocumentsType_Payments();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes <em>Special Regimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Regimes</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes
	 * @generated
	 */
	EClass getSpecialRegimes();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getSelfBillingIndicator <em>Self Billing Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Billing Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getSelfBillingIndicator()
	 * @see #getSpecialRegimes()
	 * @generated
	 */
	EAttribute getSpecialRegimes_SelfBillingIndicator();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getCashVATSchemeIndicator <em>Cash VAT Scheme Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cash VAT Scheme Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getCashVATSchemeIndicator()
	 * @see #getSpecialRegimes()
	 * @generated
	 */
	EAttribute getSpecialRegimes_CashVATSchemeIndicator();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getThirdPartiesBillingIndicator <em>Third Parties Billing Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third Parties Billing Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes#getThirdPartiesBillingIndicator()
	 * @see #getSpecialRegimes()
	 * @generated
	 */
	EAttribute getSpecialRegimes_ThirdPartiesBillingIndicator();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType <em>Stock Movement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Movement Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType
	 * @generated
	 */
	EClass getStockMovementType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getDocumentNumber <em>Document Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getDocumentNumber()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_DocumentNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getDocumentStatus <em>Document Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getDocumentStatus()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EReference getStockMovementType_DocumentStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getHash()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_Hash();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getHashControl <em>Hash Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Control</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getHashControl()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_HashControl();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getPeriod()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_Period();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getMovementDate <em>Movement Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getMovementDate()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_MovementDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getMovementType <em>Movement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getMovementType()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_MovementType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getSystemEntryDate <em>System Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Entry Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getSystemEntryDate()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_SystemEntryDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getTransactionID <em>Transaction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getTransactionID()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_TransactionID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getCustomerID()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_CustomerID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getSupplierID <em>Supplier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getSupplierID()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_SupplierID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getSourceID()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getEACCode <em>EAC Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAC Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getEACCode()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_EACCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getMovementComments <em>Movement Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Comments</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getMovementComments()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_MovementComments();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getShipTo <em>Ship To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship To</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getShipTo()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EReference getStockMovementType_ShipTo();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getShipFrom <em>Ship From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship From</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getShipFrom()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EReference getStockMovementType_ShipFrom();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getMovementEndTime <em>Movement End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement End Time</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getMovementEndTime()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_MovementEndTime();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getMovementStartTime <em>Movement Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Movement Start Time</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getMovementStartTime()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_MovementStartTime();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getATDocCodeID <em>AT Doc Code ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AT Doc Code ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getATDocCodeID()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EAttribute getStockMovementType_ATDocCodeID();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getLine()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EReference getStockMovementType_Line();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getDocumentTotals <em>Document Totals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Totals</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.StockMovementType#getDocumentTotals()
	 * @see #getStockMovementType()
	 * @generated
	 */
	EReference getStockMovementType_DocumentTotals();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure <em>Supplier Address Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier Address Structure</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure
	 * @generated
	 */
	EClass getSupplierAddressStructure();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getBuildingNumber <em>Building Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getBuildingNumber()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_BuildingNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getStreetName <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Name</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getStreetName()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_StreetName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getAddressDetail <em>Address Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Detail</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getAddressDetail()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_AddressDetail();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getCity()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_City();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getPostalCode()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getRegion()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_Region();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierAddressStructure#getCountry()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_Country();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType <em>Supplier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType
	 * @generated
	 */
	EClass getSupplierType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getSupplierID <em>Supplier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getSupplierID()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_SupplierID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getAccountID()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_AccountID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getSupplierTaxID <em>Supplier Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getSupplierTaxID()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_SupplierTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getCompanyName()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getContact()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_Contact();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getBillingAddress <em>Billing Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Billing Address</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getBillingAddress()
	 * @see #getSupplierType()
	 * @generated
	 */
	EReference getSupplierType_BillingAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getShipFromAddress <em>Ship From Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ship From Address</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getShipFromAddress()
	 * @see #getSupplierType()
	 * @generated
	 */
	EReference getSupplierType_ShipFromAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getTelephone()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getFax()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_Fax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getEmail()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_Email();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getWebsite()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_Website();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getSelfBillingIndicator <em>Self Billing Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Billing Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SupplierType#getSelfBillingIndicator()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_SelfBillingIndicator();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.Tax <em>Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Tax
	 * @generated
	 */
	EClass getTax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Tax#getTaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Tax#getTaxType()
	 * @see #getTax()
	 * @generated
	 */
	EAttribute getTax_TaxType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Tax#getTaxCountryRegion <em>Tax Country Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Country Region</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Tax#getTaxCountryRegion()
	 * @see #getTax()
	 * @generated
	 */
	EAttribute getTax_TaxCountryRegion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Tax#getTaxCode <em>Tax Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Tax#getTaxCode()
	 * @see #getTax()
	 * @generated
	 */
	EAttribute getTax_TaxCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Tax#getTaxPercentage <em>Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Percentage</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Tax#getTaxPercentage()
	 * @see #getTax()
	 * @generated
	 */
	EAttribute getTax_TaxPercentage();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.Tax#getTaxAmount <em>Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.Tax#getTaxAmount()
	 * @see #getTax()
	 * @generated
	 */
	EAttribute getTax_TaxAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType <em>Tax Table Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Table Entry Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType
	 * @generated
	 */
	EClass getTaxTableEntryType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxType()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxCountryRegion <em>Tax Country Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Country Region</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxCountryRegion()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxCountryRegion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxCode <em>Tax Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxCode()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getDescription()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxExpirationDate <em>Tax Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Expiration Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxExpirationDate()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxPercentage <em>Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Percentage</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxPercentage()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxPercentage();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxAmount <em>Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType#getTaxAmount()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableType <em>Tax Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Table Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTableType
	 * @generated
	 */
	EClass getTaxTableType();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTableType#getTaxTableEntry <em>Tax Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tax Table Entry</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTableType#getTaxTableEntry()
	 * @see #getTaxTableType()
	 * @generated
	 */
	EReference getTaxTableType_TaxTableEntry();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType
	 * @generated
	 */
	EClass getTransactionType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getTransactionID <em>Transaction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getTransactionID()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_TransactionID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getPeriod()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Period();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getTransactionDate()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_TransactionDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getSourceID()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getDescription()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getDocArchivalNumber <em>Doc Archival Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Archival Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getDocArchivalNumber()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_DocArchivalNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getTransactionType()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getGLPostingDate <em>GL Posting Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GL Posting Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getGLPostingDate()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_GLPostingDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getCustomerID()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_CustomerID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getSupplierID <em>Supplier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getSupplierID()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_SupplierID();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionType#getLine()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Line();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTax <em>Withholding Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Withholding Tax</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTax
	 * @generated
	 */
	EClass getWithholdingTax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTax#getWithholdingTaxType <em>Withholding Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Withholding Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTax#getWithholdingTaxType()
	 * @see #getWithholdingTax()
	 * @generated
	 */
	EAttribute getWithholdingTax_WithholdingTaxType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTax#getWithholdingTaxDescription <em>Withholding Tax Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Withholding Tax Description</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTax#getWithholdingTaxDescription()
	 * @see #getWithholdingTax()
	 * @generated
	 */
	EAttribute getWithholdingTax_WithholdingTaxDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTax#getWithholdingTaxAmount <em>Withholding Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Withholding Tax Amount</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTax#getWithholdingTaxAmount()
	 * @see #getWithholdingTax()
	 * @generated
	 */
	EAttribute getWithholdingTax_WithholdingTaxAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType <em>Work Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Document Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType
	 * @generated
	 */
	EClass getWorkDocumentType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getDocumentNumber <em>Document Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Number</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getDocumentNumber()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EAttribute getWorkDocumentType_DocumentNumber();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getDocumentStatus <em>Document Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Status</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getDocumentStatus()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EReference getWorkDocumentType_DocumentStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getHash()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EAttribute getWorkDocumentType_Hash();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getHashControl <em>Hash Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Control</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getHashControl()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EAttribute getWorkDocumentType_HashControl();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getPeriod()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EAttribute getWorkDocumentType_Period();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getWorkDate <em>Work Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getWorkDate()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EAttribute getWorkDocumentType_WorkDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getWorkType <em>Work Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getWorkType()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EAttribute getWorkDocumentType_WorkType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getSourceID()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EAttribute getWorkDocumentType_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getEACCode <em>EAC Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAC Code</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getEACCode()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EAttribute getWorkDocumentType_EACCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getSystemEntryDate <em>System Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Entry Date</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getSystemEntryDate()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EAttribute getWorkDocumentType_SystemEntryDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getCustomerID()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EAttribute getWorkDocumentType_CustomerID();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getLine()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EReference getWorkDocumentType_Line();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getDocumentTotals <em>Document Totals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Totals</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkDocumentType#getDocumentTotals()
	 * @see #getWorkDocumentType()
	 * @generated
	 */
	EReference getWorkDocumentType_DocumentTotals();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkingDocumentsType <em>Working Documents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Working Documents Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkingDocumentsType
	 * @generated
	 */
	EClass getWorkingDocumentsType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkingDocumentsType#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkingDocumentsType#getNumberOfEntries()
	 * @see #getWorkingDocumentsType()
	 * @generated
	 */
	EAttribute getWorkingDocumentsType_NumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkingDocumentsType#getTotalDebit <em>Total Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Debit</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkingDocumentsType#getTotalDebit()
	 * @see #getWorkingDocumentsType()
	 * @generated
	 */
	EAttribute getWorkingDocumentsType_TotalDebit();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkingDocumentsType#getTotalCredit <em>Total Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Credit</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkingDocumentsType#getTotalCredit()
	 * @see #getWorkingDocumentsType()
	 * @generated
	 */
	EAttribute getWorkingDocumentsType_TotalCredit();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkingDocumentsType#getWorkDocument <em>Work Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Document</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkingDocumentsType#getWorkDocument()
	 * @see #getWorkingDocumentsType()
	 * @generated
	 */
	EReference getWorkingDocumentsType_WorkDocument();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.GroupingCategoryType <em>Grouping Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grouping Category Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GroupingCategoryType
	 * @generated
	 */
	EEnum getGroupingCategoryType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceStatusType <em>Invoice Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Invoice Status Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceStatusType
	 * @generated
	 */
	EEnum getInvoiceStatusType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType <em>Invoice Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Invoice Type Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType
	 * @generated
	 */
	EEnum getInvoiceTypeType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType <em>Movement Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Movement Status Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType
	 * @generated
	 */
	EEnum getMovementStatusType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementTypeType <em>Movement Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Movement Type Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementTypeType
	 * @generated
	 */
	EEnum getMovementTypeType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType <em>Payment Mechanism Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Mechanism Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType
	 * @generated
	 */
	EEnum getPaymentMechanismType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType <em>Payment Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Status Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType
	 * @generated
	 */
	EEnum getPaymentStatusType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.ProductTypeType <em>Product Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product Type Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ProductTypeType
	 * @generated
	 */
	EEnum getProductTypeType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTMovementTaxType <em>SAFTPT Movement Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SAFTPT Movement Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTMovementTaxType
	 * @generated
	 */
	EEnum getSAFTPTMovementTaxType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTPaymentType <em>SAFTPT Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SAFTPT Payment Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTPaymentType
	 * @generated
	 */
	EEnum getSAFTPTPaymentType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling <em>SAFTPT Source Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SAFTPT Source Billing</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling
	 * @generated
	 */
	EEnum getSAFTPTSourceBilling();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment <em>SAFTPT Source Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SAFTPT Source Payment</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment
	 * @generated
	 */
	EEnum getSAFTPTSourcePayment();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxAccountingBasisType <em>Tax Accounting Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Accounting Basis Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxAccountingBasisType
	 * @generated
	 */
	EEnum getTaxAccountingBasisType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType <em>Tax Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Type Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType
	 * @generated
	 */
	EEnum getTaxTypeType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionTypeType <em>Transaction Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Type Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionTypeType
	 * @generated
	 */
	EEnum getTransactionTypeType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTaxTypeType <em>Withholding Tax Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Withholding Tax Type Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTaxTypeType
	 * @generated
	 */
	EEnum getWithholdingTaxTypeType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType <em>Work Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Status Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType
	 * @generated
	 */
	EEnum getWorkStatusType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkTypeType <em>Work Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Type Type</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkTypeType
	 * @generated
	 */
	EEnum getWorkTypeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Account ID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Account ID Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='AccountID_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='30' pattern='(([0-9a-zA-Z\\-/._+*]*)|Desconhecido)'"
	 * @generated
	 */
	EDataType getAccountIDType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Audit File Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Audit File Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='AuditFileVersion_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='1.03_01'"
	 * @generated
	 */
	EDataType getAuditFileVersionType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Cash VAT Scheme Indicator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cash VAT Scheme Indicator Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='CashVATSchemeIndicator_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0' maxInclusive='1'"
	 * @generated
	 */
	EDataType getCashVATSchemeIndicatorType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Company ID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Company ID Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CompanyID_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='50' pattern='([0-9]{9})+|([a-zA-Z0-9\\-/_\343\303\365\325\351\311\352\312\340\300\341\301\363\323\347\307\355\315\372\332\272\252&%20]+%20[0-9/]+)'"
	 * @generated
	 */
	EDataType getCompanyIDType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Country Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Country_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='2' pattern='AD|AE|AF|AG|AI|AL|AM|AO|AQ|AR|AS|AT|AU|AW|AX|AZ|BA|BB|BD|BE|BF|BG|BH|BI|BJ|BL|BM|BN|BO|BQ|BR|BS|BT|BV|BW|BY|BZ|CA|CC|CD|CF|CG|CH|CI|CK|CL|CM|CN|CO|CR|CU|CV|CW|CX|CY|CZ|DE|DJ|DK|DM|DO|DZ|EC|EE|EG|EH|ER|ES|ET|FI|FJ|FK|FM|FO|FR|GA|GB|GD|GE|GF|GG|GH|GI|GL|GM|GN|GP|GQ|GR|GS|GT|GU|GW|GY|HK|HM|HN|HR|HT|HU|ID|IE|IL|IM|IN|IO|IQ|IR|IS|IT|JE|JM|JO|JP|KE|KG|KH|KI|KM|KN|KP|KR|KW|KY|KZ|LA|LB|LC|LI|LK|LR|LS|LT|LU|LV|LY|MA|MC|MD|ME|MF|MG|MH|MK|ML|MM|MN|MO|MP|MQ|MR|MS|MT|MU|MV|MW|MX|MY|MZ|NA|NC|NE|NF|NG|NI|NL|NO|NP|NR|NU|NZ|OM|PA|PE|PF|PG|PH|PK|PL|PM|PN|PR|PS|PT|PW|PY|QA|RE|RO|RS|RU|RW|SA|SB|SC|SD|SE|SG|SH|SI|SJ|SK|SL|SM|SN|SO|SR|SS|ST|SV|SX|SY|SZ|TC|TD|TF|TG|TH|TJ|TK|TL|TM|TN|TO|TR|TT|TV|TW|TZ|UA|UG|UM|US|UY|UZ|VA|VC|VE|VG|VI|VN|VU|WF|WS|XK|YE|YT|ZA|ZM|ZW|Desconhecido|'"
	 * @generated
	 */
	EDataType getCountryType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Currency Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Currency Code Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CurrencyCode_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='3' pattern='AED|AFN|ALL|AMD|ANG|AOA|ARS|AUD|AWG|AZN|BAM|BBD|BDT|BGN|BHD|BIF|BMD|BND|BOB|BOV|BRL|BSD|BTN|BWP|BYR|BZD|CAD|CDF|CHE|CHF|CHW|CLF|CLP|CNY|COP|COU|CRC|CUC|CUP|CVE|CZK|DJF|DKK|DOP|DZD|EGP|ERN|ETB|FJD|FKP|GBP|GEL|GHS|GIP|GMD|GNF|GTQ|GYD|HKD|HNL|HRK|HTG|HUF|IDR|ILS|INR|IQD|IRR|ISK|JMD|JOD|JPY|KES|KGS|KHR|KMF|KPW|KRW|KWD|KYD|KZT|LAK|LBP|LKR|LRD|LSL|LTL|LVL|LYD|MAD|MDL|MGA|MKD|MMK|MNT|MOP|MRO|MUR|MVR|MWK|MXN|MXV|MYR|MZN|NAD|NGN|NIO|NOK|NPR|NZD|OMR|PAB|PEN|PGK|PHP|PKR|PLN|PYG|QAR|RON|RSD|RUB|RWF|SAR|SBD|SCR|SDG|SEK|SGD|SHP|SLL|SOS|SRD|SSP|STD|SVC|SYP|SZL|THB|TJS|TMT|TND|TOP|TRY|TTD|TWD|TZS|UAH|UGX|USD|USN|USS|UYI|UYU|UZS|VEF|VND|VUV|WST|XAF|XAG|XAU|XBA|XBB|XBC|XBD|XCD|XDR|XFU|XOF|XPD|XPF|XPT|XSU|XUA|YER|ZAR|ZMW|ZWL|EEK|SKK|TMM|ZMK|ZWD|ZWR|'"
	 * @generated
	 */
	EDataType getCurrencyCodeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Document Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Document Number Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DocumentNumber_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='60' pattern='[^%20]+%20[^/^%20]+/[0-9]+'"
	 * @generated
	 */
	EDataType getDocumentNumberType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EAC Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EAC Code Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='EACCode_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='5' pattern='(([0-9]*))'"
	 * @generated
	 */
	EDataType getEACCodeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Fiscal Year Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fiscal Year Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='FiscalYear_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='2000' maxInclusive='9999'"
	 * @generated
	 */
	EDataType getFiscalYearType();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.GroupingCategoryType <em>Grouping Category Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Grouping Category Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.GroupingCategoryType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.GroupingCategoryType"
	 *        extendedMetaData="name='GroupingCategory_._type:Object' baseType='GroupingCategory_._type'"
	 * @generated
	 */
	EDataType getGroupingCategoryTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Invoice No Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invoice No Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='InvoiceNo_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='60' pattern='[^%20]+%20[^/^%20]+/[0-9]+'"
	 * @generated
	 */
	EDataType getInvoiceNoType();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceStatusType <em>Invoice Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invoice Status Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceStatusType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.InvoiceStatusType"
	 *        extendedMetaData="name='InvoiceStatus_._type:Object' baseType='InvoiceStatus_._type'"
	 * @generated
	 */
	EDataType getInvoiceStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType <em>Invoice Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invoice Type Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType"
	 *        extendedMetaData="name='InvoiceType_._type:Object' baseType='InvoiceType_._type'"
	 * @generated
	 */
	EDataType getInvoiceTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType <em>Movement Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Movement Status Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType"
	 *        extendedMetaData="name='MovementStatus_._type:Object' baseType='MovementStatus_._type'"
	 * @generated
	 */
	EDataType getMovementStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.MovementTypeType <em>Movement Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Movement Type Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementTypeType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.MovementTypeType"
	 *        extendedMetaData="name='MovementType_._type:Object' baseType='MovementType_._type'"
	 * @generated
	 */
	EDataType getMovementTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType <em>Payment Mechanism Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Payment Mechanism Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType"
	 *        extendedMetaData="name='PaymentMechanism_._type:Object' baseType='PaymentMechanism_._type'"
	 * @generated
	 */
	EDataType getPaymentMechanismTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Payment Ref No Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Payment Ref No Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PaymentRefNo_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='60' pattern='[^%20]+%20[^/^%20]+/[0-9]+'"
	 * @generated
	 */
	EDataType getPaymentRefNoType();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType <em>Payment Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Payment Status Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType"
	 *        extendedMetaData="name='PaymentStatus_._type:Object' baseType='PaymentStatus_._type'"
	 * @generated
	 */
	EDataType getPaymentStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Payment Tax Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Payment Tax Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PaymentTaxCode' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='10' pattern='RED|INT|NOR|ISE|OUT|([0-9.])*|NA'"
	 * @generated
	 */
	EDataType getPaymentTaxCode();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Period Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Period_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='1' maxInclusive='12'"
	 * @generated
	 */
	EDataType getPeriodType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Postal Code PT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Postal Code PT</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PostalCodePT' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([0-9]{4}-[0-9]{3})'"
	 * @generated
	 */
	EDataType getPostalCodePT();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.ProductTypeType <em>Product Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Product Type Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.ProductTypeType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.ProductTypeType"
	 *        extendedMetaData="name='ProductType_._type:Object' baseType='ProductType_._type'"
	 * @generated
	 */
	EDataType getProductTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>SA Fdate Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SA Fdate Time Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='SAFdateTimeType' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getSAFdateTimeType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>SA Fdate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SA Fdate Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='SAFdateType' baseType='http://www.eclipse.org/emf/2003/XMLType#date'"
	 * @generated
	 */
	EDataType getSAFdateType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>SA Fdecimal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SA Fdecimal Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='SAFdecimalType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.00'"
	 * @generated
	 */
	EDataType getSAFdecimalType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>SA Fmonetary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SA Fmonetary Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='SAFmonetaryType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.00'"
	 * @generated
	 */
	EDataType getSAFmonetaryType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>SAFPT Accounting Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFPT Accounting Period</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='SAFPTAccountingPeriod' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='1' maxInclusive='16'"
	 * @generated
	 */
	EDataType getSAFPTAccountingPeriod();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>SAFPT Date Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFPT Date Span</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='SAFPTDateSpan' baseType='http://www.eclipse.org/emf/2003/XMLType#date' minInclusive='2000-01-01' maxInclusive='9999-12-31'"
	 * @generated
	 */
	EDataType getSAFPTDateSpan();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFPTGL Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFPTGL Account ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTGLAccountID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='30' pattern='(([0-9a-zA-Z\\-/._+*]*))'"
	 * @generated
	 */
	EDataType getSAFPTGLAccountID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFPT Journal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFPT Journal ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTJournalID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='30' pattern='[^%20]{1,30}'"
	 * @generated
	 */
	EDataType getSAFPTJournalID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFPT Portuguese Tax Exemption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFPT Portuguese Tax Exemption</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTPortugueseTaxExemption' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='6' maxLength='60'"
	 * @generated
	 */
	EDataType getSAFPTPortugueseTaxExemption();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>SAFPT Portuguese Vat Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFPT Portuguese Vat Number</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='SAFPTPortugueseVatNumber' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='100000000' maxInclusive='999999999'"
	 * @generated
	 */
	EDataType getSAFPTPortugueseVatNumber();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFPT Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFPT Product ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTProductID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='3' maxLength='255' pattern='[^/]+/[^/]+'"
	 * @generated
	 */
	EDataType getSAFPTProductID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max100 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max100 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax100Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='100'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax100Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max10 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max10 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax10Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='10'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax10Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max172 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max172 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax172Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='172'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax172Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max200 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max200 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax200Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='200'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax200Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max20 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max20 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax20Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='20'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax20Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max255 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max255 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax255Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='255'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax255Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max30 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max30 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax30Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='30'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax30Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max35 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max35 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax35Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='35'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax35Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max3 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max3 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax3Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='3'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax3Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max40 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max40 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax40Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='40'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax40Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max50 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max50 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax50Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='50'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax50Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max60 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max60 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax60Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='60'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax60Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max70 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max70 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax70Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='70'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax70Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Mandatory Max90 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Mandatory Max90 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMandatoryMax90Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='90'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMandatoryMax90Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFP Ttext Type Max40 Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFP Ttext Type Max40 Car</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTtextTypeMax40Car' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='0' maxLength='40'"
	 * @generated
	 */
	EDataType getSAFPTtextTypeMax40Car();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFPT Transaction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFPT Transaction ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTTransactionID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='70' pattern='[1-9][0-9]{3}-[01][0-9]-[0-3][0-9]%20[^%20]{1,30}%20[^%20]{1,20}'"
	 * @generated
	 */
	EDataType getSAFPTTransactionID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFTPT Doc Archival Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFTPT Doc Archival Number</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFTPTDocArchivalNumber' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='20' pattern='[^%20]{1,20}'"
	 * @generated
	 */
	EDataType getSAFTPTDocArchivalNumber();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFTPT Movement Tax Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFTPT Movement Tax Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFTPTMovementTaxCode' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='3' pattern='RED|INT|NOR|ISE|OUT|NS'"
	 * @generated
	 */
	EDataType getSAFTPTMovementTaxCode();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTMovementTaxType <em>SAFTPT Movement Tax Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFTPT Movement Tax Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTMovementTaxType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTMovementTaxType"
	 *        extendedMetaData="name='SAFTPTMovementTaxType:Object' baseType='SAFTPTMovementTaxType'"
	 * @generated
	 */
	EDataType getSAFTPTMovementTaxTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTPaymentType <em>SAFTPT Payment Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFTPT Payment Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTPaymentType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTPaymentType"
	 *        extendedMetaData="name='SAFTPTPaymentType:Object' baseType='SAFTPTPaymentType'"
	 * @generated
	 */
	EDataType getSAFTPTPaymentTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling <em>SAFTPT Source Billing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFTPT Source Billing Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling"
	 *        extendedMetaData="name='SAFTPTSourceBilling:Object' baseType='SAFTPTSourceBilling'"
	 * @generated
	 */
	EDataType getSAFTPTSourceBillingObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment <em>SAFTPT Source Payment Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFTPT Source Payment Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment"
	 *        extendedMetaData="name='SAFTPTSourcePayment:Object' baseType='SAFTPTSourcePayment'"
	 * @generated
	 */
	EDataType getSAFTPTSourcePaymentObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Self Billing Indicator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Self Billing Indicator Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='SelfBillingIndicator_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0' maxInclusive='1'"
	 * @generated
	 */
	EDataType getSelfBillingIndicatorType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Supplier Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Supplier Country</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SupplierCountry' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='2' pattern='AD|AE|AF|AG|AI|AL|AM|AO|AQ|AR|AS|AT|AU|AW|AX|AZ|BA|BB|BD|BE|BF|BG|BH|BI|BJ|BL|BM|BN|BO|BQ|BR|BS|BT|BV|BW|BY|BZ|CA|CC|CD|CF|CG|CH|CI|CK|CL|CM|CN|CO|CR|CU|CV|CW|CX|CY|CZ|DE|DJ|DK|DM|DO|DZ|EC|EE|EG|EH|ER|ES|ET|FI|FJ|FK|FM|FO|FR|GA|GB|GD|GE|GF|GG|GH|GI|GL|GM|GN|GP|GQ|GR|GS|GT|GU|GW|GY|HK|HM|HN|HR|HT|HU|ID|IE|IL|IM|IN|IO|IQ|IR|IS|IT|JE|JM|JO|JP|KE|KG|KH|KI|KM|KN|KP|KR|KW|KY|KZ|LA|LB|LC|LI|LK|LR|LS|LT|LU|LV|LY|MA|MC|MD|ME|MF|MG|MH|MK|ML|MM|MN|MO|MP|MQ|MR|MS|MT|MU|MV|MW|MX|MY|MZ|NA|NC|NE|NF|NG|NI|NL|NO|NP|NR|NU|NZ|OM|PA|PE|PF|PG|PH|PK|PL|PM|PN|PR|PS|PT|PW|PY|QA|RE|RO|RS|RU|RW|SA|SB|SC|SD|SE|SG|SH|SI|SJ|SK|SL|SM|SN|SO|SR|SS|ST|SV|SX|SY|SZ|TC|TD|TF|TG|TH|TJ|TK|TL|TM|TN|TO|TR|TT|TV|TW|TZ|UA|UG|UM|US|UY|UZ|VA|VC|VE|VG|VI|VN|VU|WF|WS|XK|YE|YT|ZA|ZM|ZW|'"
	 * @generated
	 */
	EDataType getSupplierCountry();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxAccountingBasisType <em>Tax Accounting Basis Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tax Accounting Basis Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxAccountingBasisType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.TaxAccountingBasisType"
	 *        extendedMetaData="name='TaxAccountingBasis_._type:Object' baseType='TaxAccountingBasis_._type'"
	 * @generated
	 */
	EDataType getTaxAccountingBasisTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Tax Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tax Code Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TaxCode_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='10' pattern='RED|INT|NOR|ISE|OUT|([0-9.])*|NS'"
	 * @generated
	 */
	EDataType getTaxCodeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Tax Country Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tax Country Region Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TaxCountryRegion_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='2' maxLength='5' pattern='AD|AE|AF|AG|AI|AL|AM|AO|AQ|AR|AS|AT|AU|AW|AX|AZ|BA|BB|BD|BE|BF|BG|BH|BI|BJ|BL|BM|BN|BO|BQ|BR|BS|BT|BV|BW|BY|BZ|CA|CC|CD|CF|CG|CH|CI|CK|CL|CM|CN|CO|CR|CU|CV|CW|CX|CY|CZ|DE|DJ|DK|DM|DO|DZ|EC|EE|EG|EH|ER|ES|ET|FI|FJ|FK|FM|FO|FR|GA|GB|GD|GE|GF|GG|GH|GI|GL|GM|GN|GP|GQ|GR|GS|GT|GU|GW|GY|HK|HM|HN|HR|HT|HU|ID|IE|IL|IM|IN|IO|IQ|IR|IS|IT|JE|JM|JO|JP|KE|KG|KH|KI|KM|KN|KP|KR|KW|KY|KZ|LA|LB|LC|LI|LK|LR|LS|LT|LU|LV|LY|MA|MC|MD|ME|MF|MG|MH|MK|ML|MM|MN|MO|MP|MQ|MR|MS|MT|MU|MV|MW|MX|MY|MZ|NA|NC|NE|NF|NG|NI|NL|NO|NP|NR|NU|NZ|OM|PA|PE|PF|PG|PH|PK|PL|PM|PN|PR|PS|PT|PW|PY|QA|RE|RO|RS|RU|RW|SA|SB|SC|SD|SE|SG|SH|SI|SJ|SK|SL|SM|SN|SO|SR|SS|ST|SV|SX|SY|SZ|TC|TD|TF|TG|TH|TJ|TK|TL|TM|TN|TO|TR|TT|TV|TW|TZ|UA|UG|UM|US|UY|UZ|VA|VC|VE|VG|VI|VN|VU|WF|WS|XK|YE|YT|ZA|ZM|ZW|PT-AC|PT-MA'"
	 * @generated
	 */
	EDataType getTaxCountryRegionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Tax Table Entry Tax Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tax Table Entry Tax Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TaxTableEntryTaxCode' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='10' pattern='RED|INT|NOR|ISE|OUT|([0-9.])*|NS|NA'"
	 * @generated
	 */
	EDataType getTaxTableEntryTaxCode();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType <em>Tax Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tax Type Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType"
	 *        extendedMetaData="name='TaxType_._type:Object' baseType='TaxType_._type'"
	 * @generated
	 */
	EDataType getTaxTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Third Parties Billing Indicator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Third Parties Billing Indicator Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='ThirdPartiesBillingIndicator_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0' maxInclusive='1'"
	 * @generated
	 */
	EDataType getThirdPartiesBillingIndicatorType();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.TransactionTypeType <em>Transaction Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transaction Type Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.TransactionTypeType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.TransactionTypeType"
	 *        extendedMetaData="name='TransactionType_._type:Object' baseType='TransactionType_._type'"
	 * @generated
	 */
	EDataType getTransactionTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTaxTypeType <em>Withholding Tax Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Withholding Tax Type Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTaxTypeType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTaxTypeType"
	 *        extendedMetaData="name='WithholdingTaxType_._type:Object' baseType='WithholdingTaxType_._type'"
	 * @generated
	 */
	EDataType getWithholdingTaxTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType <em>Work Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Work Status Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType"
	 *        extendedMetaData="name='WorkStatus_._type:Object' baseType='WorkStatus_._type'"
	 * @generated
	 */
	EDataType getWorkStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.p.t1._0._301.WorkTypeType <em>Work Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Work Type Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkTypeType
	 * @model instanceClass="oecd.standard.audit.file.tax.p.t1._0._301.WorkTypeType"
	 *        extendedMetaData="name='WorkType_._type:Object' baseType='WorkType_._type'"
	 * @generated
	 */
	EDataType getWorkTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_301Factory get_301Factory();

} //_301Package
