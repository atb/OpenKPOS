/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2;

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
 *         <doc:Number>1.01_01</doc:Number>
 *         <doc:Status>Production</doc:Status>
 *       </doc:Version>
 *       <doc:Author xmlns:doc="urn:schemas-basda-org:schema-extensions:documentation">DGCI</doc:Author>
 *       <doc:ModificationDate xmlns:doc="urn:schemas-basda-org:schema-extensions:documentation">2009-10-22</doc:ModificationDate>
 *     
 * <!-- end-model-doc -->
 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Factory
 * @model kind="package"
 * @generated
 */
public interface Pt1_01_2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pt1_01_2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:OECD:StandardAuditFile-Tax:PT_1.01_01";

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
	Pt1_01_2Package eINSTANCE = oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl.init();

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.AddressStructureImpl <em>Address Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.AddressStructureImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getAddressStructure()
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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.AddressStructurePTImpl <em>Address Structure PT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.AddressStructurePTImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getAddressStructurePT()
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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.AuditFileTypeImpl <em>Audit File Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.AuditFileTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getAuditFileType()
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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CreditNoteTypeImpl <em>Credit Note Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.CreditNoteTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCreditNoteType()
	 * @generated
	 */
	int CREDIT_NOTE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_NOTE_TYPE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_NOTE_TYPE__REASON = 1;

	/**
	 * The number of structural features of the '<em>Credit Note Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_NOTE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CurrencyTypeImpl <em>Currency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.CurrencyTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCurrencyType()
	 * @generated
	 */
	int CURRENCY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_TYPE__CURRENCY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Currency Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_TYPE__CURRENCY_CREDIT_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Currency Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_TYPE__CURRENCY_DEBIT_AMOUNT = 2;

	/**
	 * The number of structural features of the '<em>Currency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl <em>Customer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCustomerType()
	 * @generated
	 */
	int CUSTOMER_TYPE = 5;

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
	 * The feature id for the '<em><b>Ship To Address</b></em>' containment reference.
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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

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
	 * The feature id for the '<em><b>Audit File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDIT_FILE = 7;

	/**
	 * The feature id for the '<em><b>Audit File Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUDIT_FILE_VERSION = 8;

	/**
	 * The feature id for the '<em><b>Billing Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BILLING_ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>Building Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUILDING_NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Business Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUSINESS_NAME = 11;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITY = 12;

	/**
	 * The feature id for the '<em><b>Company Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPANY_ADDRESS = 13;

	/**
	 * The feature id for the '<em><b>Company ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPANY_ID = 14;

	/**
	 * The feature id for the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPANY_NAME = 15;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTACT = 16;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY = 17;

	/**
	 * The feature id for the '<em><b>Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREDIT_AMOUNT = 18;

	/**
	 * The feature id for the '<em><b>Credit Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREDIT_NOTE = 19;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENCY = 20;

	/**
	 * The feature id for the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENCY_CODE = 21;

	/**
	 * The feature id for the '<em><b>Currency Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENCY_CREDIT_AMOUNT = 22;

	/**
	 * The feature id for the '<em><b>Currency Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CURRENCY_DEBIT_AMOUNT = 23;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOMER = 24;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOMER_ID = 25;

	/**
	 * The feature id for the '<em><b>Customer Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CUSTOMER_TAX_ID = 26;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_CREATED = 27;

	/**
	 * The feature id for the '<em><b>Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEBIT_AMOUNT = 28;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELIVERY_DATE = 29;

	/**
	 * The feature id for the '<em><b>Delivery ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELIVERY_ID = 30;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 31;

	/**
	 * The feature id for the '<em><b>Doc Archival Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER = 32;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMAIL = 33;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_DATE = 34;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FAX = 35;

	/**
	 * The feature id for the '<em><b>Fiscal Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FISCAL_YEAR = 36;

	/**
	 * The feature id for the '<em><b>General Ledger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERAL_LEDGER = 37;

	/**
	 * The feature id for the '<em><b>General Ledger Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES = 38;

	/**
	 * The feature id for the '<em><b>GL Posting Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GL_POSTING_DATE = 39;

	/**
	 * The feature id for the '<em><b>Gross Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROSS_TOTAL = 40;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HASH = 41;

	/**
	 * The feature id for the '<em><b>Hash Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HASH_CONTROL = 42;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADER = 43;

	/**
	 * The feature id for the '<em><b>Header Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADER_COMMENT = 44;

	/**
	 * The feature id for the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVOICE_DATE = 45;

	/**
	 * The feature id for the '<em><b>Invoice No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVOICE_NO = 46;

	/**
	 * The feature id for the '<em><b>Invoice Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVOICE_STATUS = 47;

	/**
	 * The feature id for the '<em><b>Invoice Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INVOICE_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Journal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOURNAL_ID = 49;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_NUMBER = 50;

	/**
	 * The feature id for the '<em><b>Net Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NET_TOTAL = 51;

	/**
	 * The feature id for the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER_OF_ENTRIES = 52;

	/**
	 * The feature id for the '<em><b>Opening Credit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPENING_CREDIT_BALANCE = 53;

	/**
	 * The feature id for the '<em><b>Opening Debit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPENING_DEBIT_BALANCE = 54;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORDER_DATE = 55;

	/**
	 * The feature id for the '<em><b>Order References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORDER_REFERENCES = 56;

	/**
	 * The feature id for the '<em><b>Originating ON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIGINATING_ON = 57;

	/**
	 * The feature id for the '<em><b>Payment Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAYMENT_MECHANISM = 58;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERIOD = 59;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSTAL_CODE = 60;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT = 61;

	/**
	 * The feature id for the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_CODE = 62;

	/**
	 * The feature id for the '<em><b>Product Company Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID = 63;

	/**
	 * The feature id for the '<em><b>Product Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_DESCRIPTION = 64;

	/**
	 * The feature id for the '<em><b>Product Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_GROUP = 65;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_ID = 66;

	/**
	 * The feature id for the '<em><b>Product Number Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_NUMBER_CODE = 67;

	/**
	 * The feature id for the '<em><b>Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT_VERSION = 69;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUANTITY = 70;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REASON = 71;

	/**
	 * The feature id for the '<em><b>Record ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECORD_ID = 72;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCE = 73;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCES = 74;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGION = 75;

	/**
	 * The feature id for the '<em><b>Self Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SELF_BILLING_INDICATOR = 76;

	/**
	 * The feature id for the '<em><b>Settlement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SETTLEMENT = 77;

	/**
	 * The feature id for the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SETTLEMENT_AMOUNT = 78;

	/**
	 * The feature id for the '<em><b>Ship From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHIP_FROM = 79;

	/**
	 * The feature id for the '<em><b>Ship From Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHIP_FROM_ADDRESS = 80;

	/**
	 * The feature id for the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHIP_TO = 81;

	/**
	 * The feature id for the '<em><b>Ship To Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHIP_TO_ADDRESS = 82;

	/**
	 * The feature id for the '<em><b>Software Certificate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER = 83;

	/**
	 * The feature id for the '<em><b>Source Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_DOCUMENT_ID = 84;

	/**
	 * The feature id for the '<em><b>Source Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_DOCUMENTS = 85;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_ID = 86;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_DATE = 87;

	/**
	 * The feature id for the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STREET_NAME = 88;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPPLIER = 89;

	/**
	 * The feature id for the '<em><b>Supplier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPPLIER_ID = 90;

	/**
	 * The feature id for the '<em><b>Supplier Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPPLIER_TAX_ID = 91;

	/**
	 * The feature id for the '<em><b>System Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM_ENTRY_DATE = 92;

	/**
	 * The feature id for the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX = 93;

	/**
	 * The feature id for the '<em><b>Tax Accounting Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS = 94;

	/**
	 * The feature id for the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_AMOUNT = 95;

	/**
	 * The feature id for the '<em><b>Tax Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_CODE = 96;

	/**
	 * The feature id for the '<em><b>Tax Country Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_COUNTRY_REGION = 97;

	/**
	 * The feature id for the '<em><b>Tax Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_ENTITY = 98;

	/**
	 * The feature id for the '<em><b>Tax Exemption Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_EXEMPTION_REASON = 99;

	/**
	 * The feature id for the '<em><b>Tax Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_EXPIRATION_DATE = 100;

	/**
	 * The feature id for the '<em><b>Tax Payable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_PAYABLE = 101;

	/**
	 * The feature id for the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_PERCENTAGE = 102;

	/**
	 * The feature id for the '<em><b>Tax Point Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_POINT_DATE = 103;

	/**
	 * The feature id for the '<em><b>Tax Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_TABLE = 104;

	/**
	 * The feature id for the '<em><b>Tax Table Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_TABLE_ENTRY = 105;

	/**
	 * The feature id for the '<em><b>Tax Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_TYPE = 106;

	/**
	 * The feature id for the '<em><b>Tax Verification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TAX_VERIFICATION_DATE = 107;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TELEPHONE = 108;

	/**
	 * The feature id for the '<em><b>Total Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOTAL_CREDIT = 109;

	/**
	 * The feature id for the '<em><b>Total Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOTAL_DEBIT = 110;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_DATE = 111;

	/**
	 * The feature id for the '<em><b>Transaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_ID = 112;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_TYPE = 113;

	/**
	 * The feature id for the '<em><b>Unit Of Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNIT_OF_MEASURE = 114;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNIT_PRICE = 115;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEBSITE = 116;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 117;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentTotalsTypeImpl <em>Document Totals Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentTotalsTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getDocumentTotalsType()
	 * @generated
	 */
	int DOCUMENT_TOTALS_TYPE = 7;

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
	 * The feature id for the '<em><b>Settlement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE__SETTLEMENT = 4;

	/**
	 * The number of structural features of the '<em>Document Totals Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TOTALS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.GeneralLedgerEntriesTypeImpl <em>General Ledger Entries Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.GeneralLedgerEntriesTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getGeneralLedgerEntriesType()
	 * @generated
	 */
	int GENERAL_LEDGER_ENTRIES_TYPE = 8;

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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.GeneralLedgerTypeImpl <em>General Ledger Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.GeneralLedgerTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getGeneralLedgerType()
	 * @generated
	 */
	int GENERAL_LEDGER_TYPE = 9;

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
	 * The number of structural features of the '<em>General Ledger Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_LEDGER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.HeaderTypeImpl <em>Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.HeaderTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getHeaderType()
	 * @generated
	 */
	int HEADER_TYPE = 10;

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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.InvoiceTypeImpl <em>Invoice Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.InvoiceTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceType()
	 * @generated
	 */
	int INVOICE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Invoice No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__INVOICE_NO = 0;

	/**
	 * The feature id for the '<em><b>Invoice Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__INVOICE_STATUS = 1;

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
	 * The feature id for the '<em><b>Self Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__SELF_BILLING_INDICATOR = 7;

	/**
	 * The feature id for the '<em><b>System Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__SYSTEM_ENTRY_DATE = 8;

	/**
	 * The feature id for the '<em><b>Transaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__TRANSACTION_ID = 9;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__CUSTOMER_ID = 10;

	/**
	 * The feature id for the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__SHIP_TO = 11;

	/**
	 * The feature id for the '<em><b>Ship From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__SHIP_FROM = 12;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__LINE = 13;

	/**
	 * The feature id for the '<em><b>Document Totals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__DOCUMENT_TOTALS = 14;

	/**
	 * The number of structural features of the '<em>Invoice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.JournalTypeImpl <em>Journal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.JournalTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getJournalType()
	 * @generated
	 */
	int JOURNAL_TYPE = 12;

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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.LineTypeImpl <em>Line Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.LineTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getLineType()
	 * @generated
	 */
	int LINE_TYPE = 13;

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
	 * The feature id for the '<em><b>Tax Point Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__TAX_POINT_DATE = 7;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__REFERENCES = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__DEBIT_AMOUNT = 10;

	/**
	 * The feature id for the '<em><b>Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__CREDIT_AMOUNT = 11;

	/**
	 * The feature id for the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__TAX = 12;

	/**
	 * The feature id for the '<em><b>Tax Exemption Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__TAX_EXEMPTION_REASON = 13;

	/**
	 * The feature id for the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE__SETTLEMENT_AMOUNT = 14;

	/**
	 * The number of structural features of the '<em>Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.LineType1Impl <em>Line Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.LineType1Impl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getLineType1()
	 * @generated
	 */
	int LINE_TYPE1 = 14;

	/**
	 * The feature id for the '<em><b>Record ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__RECORD_ID = 0;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__ACCOUNT_ID = 1;

	/**
	 * The feature id for the '<em><b>Source Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__SOURCE_DOCUMENT_ID = 2;

	/**
	 * The feature id for the '<em><b>System Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__SYSTEM_ENTRY_DATE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__DEBIT_AMOUNT = 5;

	/**
	 * The feature id for the '<em><b>Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1__CREDIT_AMOUNT = 6;

	/**
	 * The number of structural features of the '<em>Line Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TYPE1_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.MasterFilesTypeImpl <em>Master Files Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.MasterFilesTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getMasterFilesType()
	 * @generated
	 */
	int MASTER_FILES_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>General Ledger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE__GENERAL_LEDGER = 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE__CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE__SUPPLIER = 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE__PRODUCT = 4;

	/**
	 * The feature id for the '<em><b>Tax Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE__TAX_TABLE = 5;

	/**
	 * The number of structural features of the '<em>Master Files Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FILES_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.OrderReferencesTypeImpl <em>Order References Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.OrderReferencesTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getOrderReferencesType()
	 * @generated
	 */
	int ORDER_REFERENCES_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Originating ON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REFERENCES_TYPE__ORIGINATING_ON = 0;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REFERENCES_TYPE__ORDER_DATE = 1;

	/**
	 * The number of structural features of the '<em>Order References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REFERENCES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.ProductTypeImpl <em>Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.ProductTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getProductType()
	 * @generated
	 */
	int PRODUCT_TYPE = 17;

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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.ReferencesTypeImpl <em>References Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.ReferencesTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getReferencesType()
	 * @generated
	 */
	int REFERENCES_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Credit Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TYPE__CREDIT_NOTE = 0;

	/**
	 * The number of structural features of the '<em>References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SalesInvoicesTypeImpl <em>Sales Invoices Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.SalesInvoicesTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSalesInvoicesType()
	 * @generated
	 */
	int SALES_INVOICES_TYPE = 19;

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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SettlementTypeImpl <em>Settlement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.SettlementTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSettlementType()
	 * @generated
	 */
	int SETTLEMENT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Settlement Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TYPE__SETTLEMENT_DISCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TYPE__SETTLEMENT_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Settlement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TYPE__SETTLEMENT_DATE = 2;

	/**
	 * The feature id for the '<em><b>Payment Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TYPE__PAYMENT_MECHANISM = 3;

	/**
	 * The number of structural features of the '<em>Settlement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.ShippingPointStructureImpl <em>Shipping Point Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.ShippingPointStructureImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getShippingPointStructure()
	 * @generated
	 */
	int SHIPPING_POINT_STRUCTURE = 21;

	/**
	 * The feature id for the '<em><b>Delivery ID</b></em>' attribute.
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
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_POINT_STRUCTURE__ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Shipping Point Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_POINT_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SourceDocumentsTypeImpl <em>Source Documents Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.SourceDocumentsTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSourceDocumentsType()
	 * @generated
	 */
	int SOURCE_DOCUMENTS_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Sales Invoices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENTS_TYPE__SALES_INVOICES = 0;

	/**
	 * The number of structural features of the '<em>Source Documents Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DOCUMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SupplierAddressStructureImpl <em>Supplier Address Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.SupplierAddressStructureImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSupplierAddressStructure()
	 * @generated
	 */
	int SUPPLIER_ADDRESS_STRUCTURE = 23;

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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SupplierTypeImpl <em>Supplier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.SupplierTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSupplierType()
	 * @generated
	 */
	int SUPPLIER_TYPE = 24;

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
	 * The feature id for the '<em><b>Ship From Address</b></em>' containment reference.
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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTableEntryTypeImpl <em>Tax Table Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTableEntryTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxTableEntryType()
	 * @generated
	 */
	int TAX_TABLE_ENTRY_TYPE = 25;

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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTableTypeImpl <em>Tax Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTableTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxTableType()
	 * @generated
	 */
	int TAX_TABLE_TYPE = 26;

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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTypeImpl <em>Tax Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxType()
	 * @generated
	 */
	int TAX_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Tax Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TYPE__TAX_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Tax Country Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TYPE__TAX_COUNTRY_REGION = 1;

	/**
	 * The feature id for the '<em><b>Tax Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TYPE__TAX_CODE = 2;

	/**
	 * The feature id for the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TYPE__TAX_PERCENTAGE = 3;

	/**
	 * The feature id for the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TYPE__TAX_AMOUNT = 4;

	/**
	 * The number of structural features of the '<em>Tax Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TransactionTypeImpl <em>Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.TransactionTypeImpl
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTransactionType()
	 * @generated
	 */
	int TRANSACTION_TYPE = 28;

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
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType <em>Invoice Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceStatusType()
	 * @generated
	 */
	int INVOICE_STATUS_TYPE = 29;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType <em>Invoice Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceTypeType()
	 * @generated
	 */
	int INVOICE_TYPE_TYPE = 30;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType <em>Payment Mechanism Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getPaymentMechanismType()
	 * @generated
	 */
	int PAYMENT_MECHANISM_TYPE = 31;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType <em>Product Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getProductTypeType()
	 * @generated
	 */
	int PRODUCT_TYPE_TYPE = 32;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType <em>Tax Accounting Basis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxAccountingBasisType()
	 * @generated
	 */
	int TAX_ACCOUNTING_BASIS_TYPE = 33;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType <em>Tax Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxTypeType()
	 * @generated
	 */
	int TAX_TYPE_TYPE = 34;

	/**
	 * The meta object id for the '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType <em>Transaction Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTransactionTypeType()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE = 35;

	/**
	 * The meta object id for the '<em>Account ID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getAccountIDType()
	 * @generated
	 */
	int ACCOUNT_ID_TYPE = 36;

	/**
	 * The meta object id for the '<em>Audit File Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getAuditFileVersionType()
	 * @generated
	 */
	int AUDIT_FILE_VERSION_TYPE = 37;

	/**
	 * The meta object id for the '<em>Company ID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCompanyIDType()
	 * @generated
	 */
	int COMPANY_ID_TYPE = 38;

	/**
	 * The meta object id for the '<em>Country Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCountryType()
	 * @generated
	 */
	int COUNTRY_TYPE = 39;

	/**
	 * The meta object id for the '<em>Currency Code Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCurrencyCodeType()
	 * @generated
	 */
	int CURRENCY_CODE_TYPE = 40;

	/**
	 * The meta object id for the '<em>Fiscal Year Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getFiscalYearType()
	 * @generated
	 */
	int FISCAL_YEAR_TYPE = 41;

	/**
	 * The meta object id for the '<em>Invoice No Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceNoType()
	 * @generated
	 */
	int INVOICE_NO_TYPE = 42;

	/**
	 * The meta object id for the '<em>Invoice Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceStatusTypeObject()
	 * @generated
	 */
	int INVOICE_STATUS_TYPE_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Invoice Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceTypeTypeObject()
	 * @generated
	 */
	int INVOICE_TYPE_TYPE_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Payment Mechanism Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getPaymentMechanismTypeObject()
	 * @generated
	 */
	int PAYMENT_MECHANISM_TYPE_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Period Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getPeriodType()
	 * @generated
	 */
	int PERIOD_TYPE = 46;

	/**
	 * The meta object id for the '<em>Postal Code PT</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getPostalCodePT()
	 * @generated
	 */
	int POSTAL_CODE_PT = 47;

	/**
	 * The meta object id for the '<em>Product Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getProductTypeTypeObject()
	 * @generated
	 */
	int PRODUCT_TYPE_TYPE_OBJECT = 48;

	/**
	 * The meta object id for the '<em>SA Fdate Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFdateTimeType()
	 * @generated
	 */
	int SA_FDATE_TIME_TYPE = 49;

	/**
	 * The meta object id for the '<em>SA Fdate Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFdateType()
	 * @generated
	 */
	int SA_FDATE_TYPE = 50;

	/**
	 * The meta object id for the '<em>SA Fdecimal Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFdecimalType()
	 * @generated
	 */
	int SA_FDECIMAL_TYPE = 51;

	/**
	 * The meta object id for the '<em>SA Fmonetary Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFmonetaryType()
	 * @generated
	 */
	int SA_FMONETARY_TYPE = 52;

	/**
	 * The meta object id for the '<em>SAFPT Accounting Period</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTAccountingPeriod()
	 * @generated
	 */
	int SAFPT_ACCOUNTING_PERIOD = 53;

	/**
	 * The meta object id for the '<em>SAFPT Currency Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTCurrencyCode()
	 * @generated
	 */
	int SAFPT_CURRENCY_CODE = 54;

	/**
	 * The meta object id for the '<em>SAFPT Date Span</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTDateSpan()
	 * @generated
	 */
	int SAFPT_DATE_SPAN = 55;

	/**
	 * The meta object id for the '<em>SAFPTGL Account ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTGLAccountID()
	 * @generated
	 */
	int SAFPTGL_ACCOUNT_ID = 56;

	/**
	 * The meta object id for the '<em>SAFPT Portuguese Vat Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTPortugueseVatNumber()
	 * @generated
	 */
	int SAFPT_PORTUGUESE_VAT_NUMBER = 57;

	/**
	 * The meta object id for the '<em>SAFPT Product ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTProductID()
	 * @generated
	 */
	int SAFPT_PRODUCT_ID = 58;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max10 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax10Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR = 59;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max200 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax200Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR = 60;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max20 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax20Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR = 61;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max255 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax255Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR = 62;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max30 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax30Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR = 63;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max3 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax3Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR = 64;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max40 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax40Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR = 65;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max50 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax50Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR = 66;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max60 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax60Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR = 67;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Mandatory Max70 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax70Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR = 68;

	/**
	 * The meta object id for the '<em>SAFP Ttext Type Max40 Car</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMax40Car()
	 * @generated
	 */
	int SAFP_TTEXT_TYPE_MAX40_CAR = 69;

	/**
	 * The meta object id for the '<em>SAFPT Transaction ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTTransactionID()
	 * @generated
	 */
	int SAFPT_TRANSACTION_ID = 70;

	/**
	 * The meta object id for the '<em>Self Billing Indicator Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSelfBillingIndicatorType()
	 * @generated
	 */
	int SELF_BILLING_INDICATOR_TYPE = 71;

	/**
	 * The meta object id for the '<em>Supplier Country</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSupplierCountry()
	 * @generated
	 */
	int SUPPLIER_COUNTRY = 72;

	/**
	 * The meta object id for the '<em>Tax Accounting Basis Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxAccountingBasisTypeObject()
	 * @generated
	 */
	int TAX_ACCOUNTING_BASIS_TYPE_OBJECT = 73;

	/**
	 * The meta object id for the '<em>Tax Code Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxCodeType()
	 * @generated
	 */
	int TAX_CODE_TYPE = 74;

	/**
	 * The meta object id for the '<em>Tax Country Region Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxCountryRegionType()
	 * @generated
	 */
	int TAX_COUNTRY_REGION_TYPE = 75;

	/**
	 * The meta object id for the '<em>Tax Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxTypeTypeObject()
	 * @generated
	 */
	int TAX_TYPE_TYPE_OBJECT = 76;

	/**
	 * The meta object id for the '<em>Transaction Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType
	 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTransactionTypeTypeObject()
	 * @generated
	 */
	int TRANSACTION_TYPE_TYPE_OBJECT = 77;


	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructure <em>Address Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Structure</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructure
	 * @generated
	 */
	EClass getAddressStructure();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getBuildingNumber <em>Building Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Number</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getBuildingNumber()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_BuildingNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getStreetName <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Name</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getStreetName()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_StreetName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getAddressDetail <em>Address Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Detail</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getAddressDetail()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_AddressDetail();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getCity()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_City();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getPostalCode()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getRegion()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_Region();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructure#getCountry()
	 * @see #getAddressStructure()
	 * @generated
	 */
	EAttribute getAddressStructure_Country();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT <em>Address Structure PT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Structure PT</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT
	 * @generated
	 */
	EClass getAddressStructurePT();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getBuildingNumber <em>Building Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Number</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getBuildingNumber()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_BuildingNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getStreetName <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Name</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getStreetName()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_StreetName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getAddressDetail <em>Address Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Detail</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getAddressDetail()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_AddressDetail();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getCity()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_City();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getPostalCode()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getRegion()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_Region();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT#getCountry()
	 * @see #getAddressStructurePT()
	 * @generated
	 */
	EAttribute getAddressStructurePT_Country();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.AuditFileType <em>Audit File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audit File Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AuditFileType
	 * @generated
	 */
	EClass getAuditFileType();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.AuditFileType#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AuditFileType#getHeader()
	 * @see #getAuditFileType()
	 * @generated
	 */
	EReference getAuditFileType_Header();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.AuditFileType#getMasterFiles <em>Master Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Files</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AuditFileType#getMasterFiles()
	 * @see #getAuditFileType()
	 * @generated
	 */
	EReference getAuditFileType_MasterFiles();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.AuditFileType#getGeneralLedgerEntries <em>General Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Ledger Entries</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AuditFileType#getGeneralLedgerEntries()
	 * @see #getAuditFileType()
	 * @generated
	 */
	EReference getAuditFileType_GeneralLedgerEntries();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.AuditFileType#getSourceDocuments <em>Source Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Documents</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AuditFileType#getSourceDocuments()
	 * @see #getAuditFileType()
	 * @generated
	 */
	EReference getAuditFileType_SourceDocuments();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.CreditNoteType <em>Credit Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Note Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CreditNoteType
	 * @generated
	 */
	EClass getCreditNoteType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CreditNoteType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CreditNoteType#getReference()
	 * @see #getCreditNoteType()
	 * @generated
	 */
	EAttribute getCreditNoteType_Reference();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CreditNoteType#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CreditNoteType#getReason()
	 * @see #getCreditNoteType()
	 * @generated
	 */
	EAttribute getCreditNoteType_Reason();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.CurrencyType <em>Currency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CurrencyType
	 * @generated
	 */
	EClass getCurrencyType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CurrencyType#getCurrencyCode <em>Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CurrencyType#getCurrencyCode()
	 * @see #getCurrencyType()
	 * @generated
	 */
	EAttribute getCurrencyType_CurrencyCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CurrencyType#getCurrencyCreditAmount <em>Currency Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Credit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CurrencyType#getCurrencyCreditAmount()
	 * @see #getCurrencyType()
	 * @generated
	 */
	EAttribute getCurrencyType_CurrencyCreditAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CurrencyType#getCurrencyDebitAmount <em>Currency Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Debit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CurrencyType#getCurrencyDebitAmount()
	 * @see #getCurrencyType()
	 * @generated
	 */
	EAttribute getCurrencyType_CurrencyDebitAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType <em>Customer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType
	 * @generated
	 */
	EClass getCustomerType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getCustomerID()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_CustomerID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getAccountID()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_AccountID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getCustomerTaxID <em>Customer Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getCustomerTaxID()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_CustomerTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getCompanyName()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getContact()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_Contact();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getBillingAddress <em>Billing Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Billing Address</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getBillingAddress()
	 * @see #getCustomerType()
	 * @generated
	 */
	EReference getCustomerType_BillingAddress();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getShipToAddress <em>Ship To Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship To Address</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getShipToAddress()
	 * @see #getCustomerType()
	 * @generated
	 */
	EReference getCustomerType_ShipToAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getTelephone()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getFax()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_Fax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getEmail()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_Email();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getWebsite()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_Website();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getSelfBillingIndicator <em>Self Billing Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Billing Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType#getSelfBillingIndicator()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_SelfBillingIndicator();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAccountDescription <em>Account Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Description</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAccountDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AccountDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAccountID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AccountID();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Address();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAddressDetail <em>Address Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Detail</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAddressDetail()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AddressDetail();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAuditFile <em>Audit File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Audit File</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAuditFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuditFile();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAuditFileVersion <em>Audit File Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audit File Version</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAuditFileVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AuditFileVersion();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBillingAddress <em>Billing Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Billing Address</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBillingAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BillingAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBuildingNumber <em>Building Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Number</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBuildingNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BuildingNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBusinessName <em>Business Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Name</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBusinessName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BusinessName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_City();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyAddress <em>Company Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Company Address</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CompanyAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyID <em>Company ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CompanyID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getContact()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Contact();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCountry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Country();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCreditAmount <em>Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCreditAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CreditAmount();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCreditNote <em>Credit Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credit Note</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCreditNote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreditNote();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Currency();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyCode <em>Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CurrencyCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyCreditAmount <em>Currency Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Credit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyCreditAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CurrencyCreditAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyDebitAmount <em>Currency Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Debit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyDebitAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CurrencyDebitAmount();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customer</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Customer();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomerID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CustomerID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomerTaxID <em>Customer Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomerTaxID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CustomerTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDateCreated()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DateCreated();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDebitAmount <em>Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDebitAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DebitAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDeliveryDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DeliveryDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDeliveryID <em>Delivery ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDeliveryID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DeliveryID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDocArchivalNumber <em>Doc Archival Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Archival Number</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDocArchivalNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DocArchivalNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getEmail()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Email();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getEndDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getFax()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Fax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getFiscalYear <em>Fiscal Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fiscal Year</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getFiscalYear()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FiscalYear();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGeneralLedger <em>General Ledger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Ledger</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGeneralLedger()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GeneralLedger();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGeneralLedgerEntries <em>General Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Ledger Entries</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGeneralLedgerEntries()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GeneralLedgerEntries();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGLPostingDate <em>GL Posting Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GL Posting Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGLPostingDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GLPostingDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGrossTotal <em>Gross Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Total</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGrossTotal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GrossTotal();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHash()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Hash();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHashControl <em>Hash Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Control</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHashControl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HashControl();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHeader()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Header();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHeaderComment <em>Header Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Comment</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHeaderComment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HeaderComment();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceDate <em>Invoice Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InvoiceDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceNo <em>Invoice No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice No</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceNo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InvoiceNo();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceStatus <em>Invoice Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Status</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceStatus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InvoiceStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_InvoiceType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getJournalID <em>Journal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journal ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getJournalID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_JournalID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getLineNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LineNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getNetTotal <em>Net Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Total</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getNetTotal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NetTotal();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getNumberOfEntries()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOpeningCreditBalance <em>Opening Credit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Credit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOpeningCreditBalance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OpeningCreditBalance();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOpeningDebitBalance <em>Opening Debit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Debit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOpeningDebitBalance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OpeningDebitBalance();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOrderDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OrderDate();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOrderReferences <em>Order References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order References</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOrderReferences()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OrderReferences();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOriginatingON <em>Originating ON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originating ON</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOriginatingON()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OriginatingON();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPaymentMechanism <em>Payment Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Mechanism</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPaymentMechanism()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PaymentMechanism();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPeriod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Period();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPostalCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProduct()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Product();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductCode <em>Product Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductCompanyTaxID <em>Product Company Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Company Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductCompanyTaxID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductCompanyTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductDescription <em>Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Description</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductGroup <em>Product Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Group</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductGroup();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductNumberCode <em>Product Number Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Number Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductNumberCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductNumberCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Version</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ProductVersion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getQuantity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReason()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Reason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getRecordID <em>Record ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getRecordID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RecordID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReference()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReferences()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_References();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getRegion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Region();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSelfBillingIndicator <em>Self Billing Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Billing Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSelfBillingIndicator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SelfBillingIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSettlement <em>Settlement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settlement</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSettlement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Settlement();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSettlementAmount <em>Settlement Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSettlementAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SettlementAmount();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipFrom <em>Ship From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship From</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipFrom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShipFrom();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipFromAddress <em>Ship From Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship From Address</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipFromAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShipFromAddress();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipTo <em>Ship To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship To</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShipTo();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipToAddress <em>Ship To Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship To Address</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipToAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ShipToAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSoftwareCertificateNumber <em>Software Certificate Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Certificate Number</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSoftwareCertificateNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SoftwareCertificateNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceDocumentID <em>Source Document ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Document ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceDocumentID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SourceDocumentID();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceDocuments <em>Source Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Documents</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceDocuments()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SourceDocuments();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getStartDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getStreetName <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Name</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getStreetName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StreetName();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplier</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Supplier();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplierID <em>Supplier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplierID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SupplierID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplierTaxID <em>Supplier Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplierTaxID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SupplierTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSystemEntryDate <em>System Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Entry Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSystemEntryDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SystemEntryDate();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTax <em>Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTax()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxAccountingBasis <em>Tax Accounting Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Accounting Basis</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxAccountingBasis()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxAccountingBasis();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxAmount <em>Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxAmount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxCode <em>Tax Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxCountryRegion <em>Tax Country Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Country Region</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxCountryRegion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxCountryRegion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxEntity <em>Tax Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Entity</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxEntity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxEntity();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxExemptionReason <em>Tax Exemption Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Exemption Reason</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxExemptionReason()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxExemptionReason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxExpirationDate <em>Tax Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Expiration Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxExpirationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPayable <em>Tax Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Payable</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPayable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxPayable();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPercentage <em>Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Percentage</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPercentage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxPercentage();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPointDate <em>Tax Point Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Point Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPointDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxPointDate();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxTable <em>Tax Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax Table</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaxTable();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxTableEntry <em>Tax Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax Table Entry</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxTableEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TaxTableEntry();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxVerificationDate <em>Tax Verification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Verification Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxVerificationDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TaxVerificationDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTelephone()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTotalCredit <em>Total Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Credit</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTotalCredit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TotalCredit();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTotalDebit <em>Total Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Debit</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTotalDebit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TotalDebit();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransactionDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionID <em>Transaction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransactionID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getUnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Measure</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getUnitOfMeasure()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UnitOfMeasure();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getUnitPrice()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_UnitPrice();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getWebsite()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Website();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType <em>Document Totals Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Totals Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType
	 * @generated
	 */
	EClass getDocumentTotalsType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType#getTaxPayable <em>Tax Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Payable</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType#getTaxPayable()
	 * @see #getDocumentTotalsType()
	 * @generated
	 */
	EAttribute getDocumentTotalsType_TaxPayable();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType#getNetTotal <em>Net Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Total</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType#getNetTotal()
	 * @see #getDocumentTotalsType()
	 * @generated
	 */
	EAttribute getDocumentTotalsType_NetTotal();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType#getGrossTotal <em>Gross Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Total</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType#getGrossTotal()
	 * @see #getDocumentTotalsType()
	 * @generated
	 */
	EAttribute getDocumentTotalsType_GrossTotal();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType#getCurrency()
	 * @see #getDocumentTotalsType()
	 * @generated
	 */
	EReference getDocumentTotalsType_Currency();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType#getSettlement <em>Settlement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settlement</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType#getSettlement()
	 * @see #getDocumentTotalsType()
	 * @generated
	 */
	EReference getDocumentTotalsType_Settlement();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType <em>General Ledger Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Ledger Entries Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType
	 * @generated
	 */
	EClass getGeneralLedgerEntriesType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType#getNumberOfEntries()
	 * @see #getGeneralLedgerEntriesType()
	 * @generated
	 */
	EAttribute getGeneralLedgerEntriesType_NumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType#getTotalDebit <em>Total Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Debit</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType#getTotalDebit()
	 * @see #getGeneralLedgerEntriesType()
	 * @generated
	 */
	EAttribute getGeneralLedgerEntriesType_TotalDebit();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType#getTotalCredit <em>Total Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Credit</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType#getTotalCredit()
	 * @see #getGeneralLedgerEntriesType()
	 * @generated
	 */
	EAttribute getGeneralLedgerEntriesType_TotalCredit();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType#getJournal <em>Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Journal</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType#getJournal()
	 * @see #getGeneralLedgerEntriesType()
	 * @generated
	 */
	EReference getGeneralLedgerEntriesType_Journal();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType <em>General Ledger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Ledger Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType
	 * @generated
	 */
	EClass getGeneralLedgerType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType#getAccountID()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_AccountID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType#getAccountDescription <em>Account Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Description</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType#getAccountDescription()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_AccountDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType#getOpeningDebitBalance <em>Opening Debit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Debit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType#getOpeningDebitBalance()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_OpeningDebitBalance();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType#getOpeningCreditBalance <em>Opening Credit Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Credit Balance</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType#getOpeningCreditBalance()
	 * @see #getGeneralLedgerType()
	 * @generated
	 */
	EAttribute getGeneralLedgerType_OpeningCreditBalance();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType
	 * @generated
	 */
	EClass getHeaderType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getAuditFileVersion <em>Audit File Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audit File Version</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getAuditFileVersion()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_AuditFileVersion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getCompanyID <em>Company ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getCompanyID()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_CompanyID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getTaxRegistrationNumber <em>Tax Registration Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Registration Number</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getTaxRegistrationNumber()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_TaxRegistrationNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getTaxAccountingBasis <em>Tax Accounting Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Accounting Basis</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getTaxAccountingBasis()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_TaxAccountingBasis();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getCompanyName()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getBusinessName <em>Business Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Name</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getBusinessName()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_BusinessName();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getCompanyAddress <em>Company Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Company Address</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getCompanyAddress()
	 * @see #getHeaderType()
	 * @generated
	 */
	EReference getHeaderType_CompanyAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getFiscalYear <em>Fiscal Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fiscal Year</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getFiscalYear()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_FiscalYear();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getStartDate()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getEndDate()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getCurrencyCode <em>Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getCurrencyCode()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_CurrencyCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getDateCreated()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_DateCreated();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getTaxEntity <em>Tax Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Entity</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getTaxEntity()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_TaxEntity();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getProductCompanyTaxID <em>Product Company Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Company Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getProductCompanyTaxID()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_ProductCompanyTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getSoftwareCertificateNumber <em>Software Certificate Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Certificate Number</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getSoftwareCertificateNumber()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_SoftwareCertificateNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getProductID()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_ProductID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Version</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getProductVersion()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_ProductVersion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getHeaderComment <em>Header Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Comment</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getHeaderComment()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_HeaderComment();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getTelephone()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getFax()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Fax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getEmail()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Email();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType#getWebsite()
	 * @see #getHeaderType()
	 * @generated
	 */
	EAttribute getHeaderType_Website();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType
	 * @generated
	 */
	EClass getInvoiceType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getInvoiceNo <em>Invoice No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice No</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getInvoiceNo()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_InvoiceNo();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getInvoiceStatus <em>Invoice Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Status</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getInvoiceStatus()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_InvoiceStatus();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getHash()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_Hash();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getHashControl <em>Hash Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Control</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getHashControl()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_HashControl();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getPeriod()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_Period();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getInvoiceDate <em>Invoice Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getInvoiceDate()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_InvoiceDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getInvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getInvoiceType()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_InvoiceType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getSelfBillingIndicator <em>Self Billing Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Billing Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getSelfBillingIndicator()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_SelfBillingIndicator();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getSystemEntryDate <em>System Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Entry Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getSystemEntryDate()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_SystemEntryDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getTransactionID <em>Transaction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getTransactionID()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_TransactionID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getCustomerID()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_CustomerID();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getShipTo <em>Ship To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship To</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getShipTo()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_ShipTo();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getShipFrom <em>Ship From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship From</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getShipFrom()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_ShipFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getLine()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_Line();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getDocumentTotals <em>Document Totals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Totals</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType#getDocumentTotals()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_DocumentTotals();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.JournalType <em>Journal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journal Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.JournalType
	 * @generated
	 */
	EClass getJournalType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.JournalType#getJournalID <em>Journal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journal ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.JournalType#getJournalID()
	 * @see #getJournalType()
	 * @generated
	 */
	EAttribute getJournalType_JournalID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.JournalType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.JournalType#getDescription()
	 * @see #getJournalType()
	 * @generated
	 */
	EAttribute getJournalType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.JournalType#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transaction</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.JournalType#getTransaction()
	 * @see #getJournalType()
	 * @generated
	 */
	EReference getJournalType_Transaction();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType
	 * @generated
	 */
	EClass getLineType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getLineNumber()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_LineNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getOrderReferences <em>Order References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order References</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getOrderReferences()
	 * @see #getLineType()
	 * @generated
	 */
	EReference getLineType_OrderReferences();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getProductCode <em>Product Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getProductCode()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_ProductCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getProductDescription <em>Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Description</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getProductDescription()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_ProductDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getQuantity()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getUnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Measure</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getUnitOfMeasure()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_UnitOfMeasure();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getUnitPrice()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_UnitPrice();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getTaxPointDate <em>Tax Point Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Point Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getTaxPointDate()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_TaxPointDate();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getReferences()
	 * @see #getLineType()
	 * @generated
	 */
	EReference getLineType_References();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getDescription()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getDebitAmount <em>Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getDebitAmount()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_DebitAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getCreditAmount <em>Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getCreditAmount()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_CreditAmount();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getTax <em>Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getTax()
	 * @see #getLineType()
	 * @generated
	 */
	EReference getLineType_Tax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getTaxExemptionReason <em>Tax Exemption Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Exemption Reason</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getTaxExemptionReason()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_TaxExemptionReason();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType#getSettlementAmount <em>Settlement Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType#getSettlementAmount()
	 * @see #getLineType()
	 * @generated
	 */
	EAttribute getLineType_SettlementAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType1 <em>Line Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Type1</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType1
	 * @generated
	 */
	EClass getLineType1();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType1#getRecordID <em>Record ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType1#getRecordID()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_RecordID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType1#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType1#getAccountID()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_AccountID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType1#getSourceDocumentID <em>Source Document ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Document ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType1#getSourceDocumentID()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_SourceDocumentID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType1#getSystemEntryDate <em>System Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Entry Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType1#getSystemEntryDate()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_SystemEntryDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType1#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType1#getDescription()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType1#getDebitAmount <em>Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType1#getDebitAmount()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_DebitAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType1#getCreditAmount <em>Credit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType1#getCreditAmount()
	 * @see #getLineType1()
	 * @generated
	 */
	EAttribute getLineType1_CreditAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType <em>Master Files Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Files Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType
	 * @generated
	 */
	EClass getMasterFilesType();

	/**
	 * Returns the meta object for the attribute list '{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getGroup()
	 * @see #getMasterFilesType()
	 * @generated
	 */
	EAttribute getMasterFilesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getGeneralLedger <em>General Ledger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Ledger</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getGeneralLedger()
	 * @see #getMasterFilesType()
	 * @generated
	 */
	EReference getMasterFilesType_GeneralLedger();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customer</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getCustomer()
	 * @see #getMasterFilesType()
	 * @generated
	 */
	EReference getMasterFilesType_Customer();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplier</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getSupplier()
	 * @see #getMasterFilesType()
	 * @generated
	 */
	EReference getMasterFilesType_Supplier();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getProduct()
	 * @see #getMasterFilesType()
	 * @generated
	 */
	EReference getMasterFilesType_Product();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getTaxTable <em>Tax Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tax Table</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType#getTaxTable()
	 * @see #getMasterFilesType()
	 * @generated
	 */
	EReference getMasterFilesType_TaxTable();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.OrderReferencesType <em>Order References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order References Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.OrderReferencesType
	 * @generated
	 */
	EClass getOrderReferencesType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.OrderReferencesType#getOriginatingON <em>Originating ON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originating ON</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.OrderReferencesType#getOriginatingON()
	 * @see #getOrderReferencesType()
	 * @generated
	 */
	EAttribute getOrderReferencesType_OriginatingON();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.OrderReferencesType#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.OrderReferencesType#getOrderDate()
	 * @see #getOrderReferencesType()
	 * @generated
	 */
	EAttribute getOrderReferencesType_OrderDate();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductType
	 * @generated
	 */
	EClass getProductType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.ProductType#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductType#getProductType()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.ProductType#getProductCode <em>Product Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductType#getProductCode()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.ProductType#getProductGroup <em>Product Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Group</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductType#getProductGroup()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductGroup();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.ProductType#getProductDescription <em>Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Description</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductType#getProductDescription()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductDescription();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.ProductType#getProductNumberCode <em>Product Number Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Number Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductType#getProductNumberCode()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductNumberCode();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.ReferencesType <em>References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ReferencesType
	 * @generated
	 */
	EClass getReferencesType();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.ReferencesType#getCreditNote <em>Credit Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credit Note</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ReferencesType#getCreditNote()
	 * @see #getReferencesType()
	 * @generated
	 */
	EReference getReferencesType_CreditNote();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType <em>Sales Invoices Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Invoices Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType
	 * @generated
	 */
	EClass getSalesInvoicesType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType#getNumberOfEntries <em>Number Of Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Entries</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType#getNumberOfEntries()
	 * @see #getSalesInvoicesType()
	 * @generated
	 */
	EAttribute getSalesInvoicesType_NumberOfEntries();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType#getTotalDebit <em>Total Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Debit</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType#getTotalDebit()
	 * @see #getSalesInvoicesType()
	 * @generated
	 */
	EAttribute getSalesInvoicesType_TotalDebit();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType#getTotalCredit <em>Total Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Credit</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType#getTotalCredit()
	 * @see #getSalesInvoicesType()
	 * @generated
	 */
	EAttribute getSalesInvoicesType_TotalCredit();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invoice</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType#getInvoice()
	 * @see #getSalesInvoicesType()
	 * @generated
	 */
	EReference getSalesInvoicesType_Invoice();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.SettlementType <em>Settlement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settlement Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SettlementType
	 * @generated
	 */
	EClass getSettlementType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SettlementType#getSettlementDiscount <em>Settlement Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Discount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SettlementType#getSettlementDiscount()
	 * @see #getSettlementType()
	 * @generated
	 */
	EAttribute getSettlementType_SettlementDiscount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SettlementType#getSettlementAmount <em>Settlement Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SettlementType#getSettlementAmount()
	 * @see #getSettlementType()
	 * @generated
	 */
	EAttribute getSettlementType_SettlementAmount();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SettlementType#getSettlementDate <em>Settlement Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SettlementType#getSettlementDate()
	 * @see #getSettlementType()
	 * @generated
	 */
	EAttribute getSettlementType_SettlementDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SettlementType#getPaymentMechanism <em>Payment Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Mechanism</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SettlementType#getPaymentMechanism()
	 * @see #getSettlementType()
	 * @generated
	 */
	EAttribute getSettlementType_PaymentMechanism();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure <em>Shipping Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipping Point Structure</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure
	 * @generated
	 */
	EClass getShippingPointStructure();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure#getDeliveryID <em>Delivery ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure#getDeliveryID()
	 * @see #getShippingPointStructure()
	 * @generated
	 */
	EAttribute getShippingPointStructure_DeliveryID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure#getDeliveryDate()
	 * @see #getShippingPointStructure()
	 * @generated
	 */
	EAttribute getShippingPointStructure_DeliveryDate();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure#getAddress()
	 * @see #getShippingPointStructure()
	 * @generated
	 */
	EReference getShippingPointStructure_Address();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.SourceDocumentsType <em>Source Documents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Documents Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SourceDocumentsType
	 * @generated
	 */
	EClass getSourceDocumentsType();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.SourceDocumentsType#getSalesInvoices <em>Sales Invoices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sales Invoices</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SourceDocumentsType#getSalesInvoices()
	 * @see #getSourceDocumentsType()
	 * @generated
	 */
	EReference getSourceDocumentsType_SalesInvoices();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure <em>Supplier Address Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier Address Structure</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure
	 * @generated
	 */
	EClass getSupplierAddressStructure();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getBuildingNumber <em>Building Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Number</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getBuildingNumber()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_BuildingNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getStreetName <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Name</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getStreetName()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_StreetName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getAddressDetail <em>Address Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Detail</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getAddressDetail()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_AddressDetail();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getCity()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_City();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getPostalCode()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getRegion()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_Region();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure#getCountry()
	 * @see #getSupplierAddressStructure()
	 * @generated
	 */
	EAttribute getSupplierAddressStructure_Country();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType <em>Supplier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType
	 * @generated
	 */
	EClass getSupplierType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getSupplierID <em>Supplier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getSupplierID()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_SupplierID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getAccountID()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_AccountID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getSupplierTaxID <em>Supplier Tax ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Tax ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getSupplierTaxID()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_SupplierTaxID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getCompanyName()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getContact()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_Contact();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getBillingAddress <em>Billing Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Billing Address</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getBillingAddress()
	 * @see #getSupplierType()
	 * @generated
	 */
	EReference getSupplierType_BillingAddress();

	/**
	 * Returns the meta object for the containment reference '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getShipFromAddress <em>Ship From Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship From Address</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getShipFromAddress()
	 * @see #getSupplierType()
	 * @generated
	 */
	EReference getSupplierType_ShipFromAddress();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getTelephone()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getFax()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_Fax();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getEmail()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_Email();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getWebsite()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_Website();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getSelfBillingIndicator <em>Self Billing Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Billing Indicator</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType#getSelfBillingIndicator()
	 * @see #getSupplierType()
	 * @generated
	 */
	EAttribute getSupplierType_SelfBillingIndicator();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType <em>Tax Table Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Table Entry Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType
	 * @generated
	 */
	EClass getTaxTableEntryType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxType()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxCountryRegion <em>Tax Country Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Country Region</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxCountryRegion()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxCountryRegion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxCode <em>Tax Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxCode()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getDescription()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxExpirationDate <em>Tax Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Expiration Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxExpirationDate()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxPercentage <em>Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Percentage</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxPercentage()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxPercentage();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxAmount <em>Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType#getTaxAmount()
	 * @see #getTaxTableEntryType()
	 * @generated
	 */
	EAttribute getTaxTableEntryType_TaxAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableType <em>Tax Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Table Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableType
	 * @generated
	 */
	EClass getTaxTableType();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableType#getTaxTableEntry <em>Tax Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tax Table Entry</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableType#getTaxTableEntry()
	 * @see #getTaxTableType()
	 * @generated
	 */
	EReference getTaxTableType_TaxTableEntry();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxType
	 * @generated
	 */
	EClass getTaxType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxType#getTaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxType#getTaxType()
	 * @see #getTaxType()
	 * @generated
	 */
	EAttribute getTaxType_TaxType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxType#getTaxCountryRegion <em>Tax Country Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Country Region</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxType#getTaxCountryRegion()
	 * @see #getTaxType()
	 * @generated
	 */
	EAttribute getTaxType_TaxCountryRegion();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxType#getTaxCode <em>Tax Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Code</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxType#getTaxCode()
	 * @see #getTaxType()
	 * @generated
	 */
	EAttribute getTaxType_TaxCode();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxType#getTaxPercentage <em>Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Percentage</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxType#getTaxPercentage()
	 * @see #getTaxType()
	 * @generated
	 */
	EAttribute getTaxType_TaxPercentage();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxType#getTaxAmount <em>Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Amount</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxType#getTaxAmount()
	 * @see #getTaxType()
	 * @generated
	 */
	EAttribute getTaxType_TaxAmount();

	/**
	 * Returns the meta object for class '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType
	 * @generated
	 */
	EClass getTransactionType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getTransactionID <em>Transaction ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getTransactionID()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_TransactionID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getPeriod()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Period();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getTransactionDate()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_TransactionDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getSourceID()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getDescription()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Description();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getDocArchivalNumber <em>Doc Archival Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Archival Number</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getDocArchivalNumber()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_DocArchivalNumber();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getTransactionType()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getGLPostingDate <em>GL Posting Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GL Posting Date</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getGLPostingDate()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_GLPostingDate();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getCustomerID()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_CustomerID();

	/**
	 * Returns the meta object for the attribute '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getSupplierID <em>Supplier ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier ID</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getSupplierID()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_SupplierID();

	/**
	 * Returns the meta object for the containment reference list '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType#getLine()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Line();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType <em>Invoice Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Invoice Status Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType
	 * @generated
	 */
	EEnum getInvoiceStatusType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType <em>Invoice Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Invoice Type Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType
	 * @generated
	 */
	EEnum getInvoiceTypeType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType <em>Payment Mechanism Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Mechanism Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType
	 * @generated
	 */
	EEnum getPaymentMechanismType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType <em>Product Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product Type Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType
	 * @generated
	 */
	EEnum getProductTypeType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType <em>Tax Accounting Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Accounting Basis Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType
	 * @generated
	 */
	EEnum getTaxAccountingBasisType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType <em>Tax Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Type Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType
	 * @generated
	 */
	EEnum getTaxTypeType();

	/**
	 * Returns the meta object for enum '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType <em>Transaction Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Type Type</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType
	 * @generated
	 */
	EEnum getTransactionTypeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Account ID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Account ID Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='AccountID_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='30' pattern='(([1-8][0-9a-zA-Z]*)|Desconhecido)'"
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
	 *        extendedMetaData="name='AuditFileVersion_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='1.01_01'"
	 * @generated
	 */
	EDataType getAuditFileVersionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Company ID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Company ID Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CompanyID_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='50' pattern='([0-9])+|([a-zA-Z0-9\'/\']+%20[0-9]+)'"
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
	 *        extendedMetaData="name='Country_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='2' pattern='AF|AX|AL|DZ|AS|AD|AO|AI|AQ|AG|AR|AM|AW|AU|AT|AZ|BS|BH|BD|BB|BY|BE|BZ|BJ|BM|BT|BO|BA|BW|BV|BR|IO|BN|BG|BF|BI|KH|CM|CA|CV|KY|CF|TD|CL|CN|CX|CC|CO|KM|CG|CD|CK|CR|CI|HR|CU|CY|CZ|DK|DJ|DM|DO|EC|EG|SV|GQ|ER|EE|ET|FK|FO|FJ|FI|FR|GF|PF|TF|GA|GM|GE|DE|GH|GI|GR|GL|GD|GP|GU|GT|GG|GN|GW|GY|HT|HM|VA|HN|HK|HU|IS|IN|ID|IR|IQ|IE|IM|IL|IT|JM|JP|JE|JO|KZ|KE|KI|KP|KR|KW|KG|LA|LV|LB|LS|LR|LY|LI|LT|LU|MO|MK|MG|MW|MY|MV|ML|MT|MH|MQ|MR|MU|YT|MX|FM|MD|MC|MN|ME|MS|MA|MZ|MM|NA|NR|NP|NL|AN|NC|NZ|NI|NE|NG|NU|NF|MP|NO|OM|PK|PW|PS|PA|PG|PY|PE|PH|PN|PL|PT|PR|QA|RE|RO|RU|RW|BL|SH|KN|LC|MF|PM|VC|WS|SM|ST|SA|SN|RS|SC|SL|SG|SK|SI|SB|SO|ZA|GS|ES|LK|SD|SR|SJ|SZ|SE|CH|SY|TW|TJ|TZ|TH|TL|TG|TK|TO|TT|TN|TR|TM|TC|TV|UG|UA|AE|GB|US|UM|UY|UZ|VU|VE|VN|VG|VI|WF|EH|YE|ZM|ZW|Desconhecido|'"
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
	 *        extendedMetaData="name='CurrencyCode_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='3' pattern='ADP|AED|AFA|ALL|AMD|ANG|AON|AOR|ARS|ATS|AUD|AWG|AZM|AZN|BAM|BBD|BDT|BEF|BGL|BGN|BHD|BIF|BMD|BND|BRL|BSD|BTN|BWP|BYR|BZD|CAD|CDF|CHF|CLF|CLP|CNY|COP|CRC|CUP|CVE|CYP|CZK|DEM|DJF|DKK|DOP|DZD|ECS|ECV|EEK|EGP|ERN|ESP|ETB|EUR|FIM|FJD|FKP|FRF|GBP|GEL|GHC|GIP|GMD|GNF|GRD|GTQ|GWP|GYD|HKD|HNL|HRK|HTG|HUF|IDR|IEP|ILS|INR|IQD|IRR|ISK|ITL|JMD|JOD|JPY|KES|KGS|KHR|KMF|KPW|KRW|KWD|KYD|KZT|LAK|LBP|LKR|LRD|LSL|LTL|LUF|LVL|LYD|MAD|MDL|MGF|MKD|MMK|MNT|MOP|MRO|MTL|MUR|MVR|MWK|MXN|MXV|MYR|MZM|MZN|NAD|NGN|NIO|NLG|NOK|NPR|NZD|OMR|PAB|PEN|PGK|PHP|PKR|PLN|PTE|PYG|QAR|ROL|RUB|RUR|RWF|SAR|SBD|SCR|SDD|SEK|SGD|SHP|SIT|SKK|SLL|SOS|SRG|STD|SVC|SYP|SZL|THB|TJR|TJS|TMM|TND|TOP|TPE|TRY|TTD|TWD|TZS|UAH|UGX|USD|USN|USS|UYU|UZS|VEB|VND|VUV|WST|XAF|XAG|XAU|XBA|XBB|XBC|XBD|XCD|XDR|XFO|XFU|XOF|XPD|XPF|XPT|XTS|XXX|YER|YUM|ZAL|ZAR|ZMK|ZRN|ZWD|'"
	 * @generated
	 */
	EDataType getCurrencyCodeType();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>Invoice No Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invoice No Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='InvoiceNo_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='60' pattern='([a-zA-Z0-9./_-])+%20([a-zA-Z0-9]\052/[0-9]+)'"
	 * @generated
	 */
	EDataType getInvoiceNoType();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType <em>Invoice Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invoice Status Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType
	 * @model instanceClass="oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType"
	 *        extendedMetaData="name='InvoiceStatus_._type:Object' baseType='InvoiceStatus_._type'"
	 * @generated
	 */
	EDataType getInvoiceStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType <em>Invoice Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invoice Type Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType
	 * @model instanceClass="oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType"
	 *        extendedMetaData="name='InvoiceType_._type:Object' baseType='InvoiceType_._type'"
	 * @generated
	 */
	EDataType getInvoiceTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType <em>Payment Mechanism Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Payment Mechanism Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType
	 * @model instanceClass="oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType"
	 *        extendedMetaData="name='PaymentMechanism_._type:Object' baseType='PaymentMechanism_._type'"
	 * @generated
	 */
	EDataType getPaymentMechanismTypeObject();

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
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType <em>Product Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Product Type Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType
	 * @model instanceClass="oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType"
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
	 *        extendedMetaData="name='SAFdecimalType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
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
	 *        extendedMetaData="name='SAFmonetaryType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal'"
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
	 * Returns the meta object for data type '{@link java.lang.String <em>SAFPT Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SAFPT Currency Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SAFPTCurrencyCode' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='EUR'"
	 * @generated
	 */
	EDataType getSAFPTCurrencyCode();

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
	 *        extendedMetaData="name='SAFPTGLAccountID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='30' pattern='(([1-8][0-9a-zA-Z]*))'"
	 * @generated
	 */
	EDataType getSAFPTGLAccountID();

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
	 *        extendedMetaData="name='SAFPTProductID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='3' maxLength='255' pattern='\\w+(\\s\\w+)\052/\\w+(\\s\\w+)*'"
	 * @generated
	 */
	EDataType getSAFPTProductID();

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
	 *        extendedMetaData="name='SAFPTTransactionID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='70' pattern='[1-9][0-9]{3}-[01][0-9]-[0-3][0-9]%20\\w{1,30}%20\\w{1,20}'"
	 * @generated
	 */
	EDataType getSAFPTTransactionID();

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
	 *        extendedMetaData="name='SupplierCountry' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='2' pattern='AF|AX|AL|DZ|AS|AD|AO|AI|AQ|AG|AR|AM|AW|AU|AT|AZ|BS|BH|BD|BB|BY|BE|BZ|BJ|BM|BT|BO|BA|BW|BV|BR|IO|BN|BG|BF|BI|KH|CM|CA|CV|KY|CF|TD|CL|CN|CX|CC|CO|KM|CG|CD|CK|CR|CI|HR|CU|CY|CZ|DK|DJ|DM|DO|EC|EG|SV|GQ|ER|EE|ET|FK|FO|FJ|FI|FR|GF|PF|TF|GA|GM|GE|DE|GH|GI|GR|GL|GD|GP|GU|GT|GG|GN|GW|GY|HT|HM|VA|HN|HK|HU|IS|IN|ID|IR|IQ|IE|IM|IL|IT|JM|JP|JE|JO|KZ|KE|KI|KP|KR|KW|KG|LA|LV|LB|LS|LR|LY|LI|LT|LU|MO|MK|MG|MW|MY|MV|ML|MT|MH|MQ|MR|MU|YT|MX|FM|MD|MC|MN|ME|MS|MA|MZ|MM|NA|NR|NP|NL|AN|NC|NZ|NI|NE|NG|NU|NF|MP|NO|OM|PK|PW|PS|PA|PG|PY|PE|PH|PN|PL|PT|PR|QA|RE|RO|RU|RW|BL|SH|KN|LC|MF|PM|VC|WS|SM|ST|SA|SN|RS|SC|SL|SG|SK|SI|SB|SO|ZA|GS|ES|LK|SD|SR|SJ|SZ|SE|CH|SY|TW|TJ|TZ|TH|TL|TG|TK|TO|TT|TN|TR|TM|TC|TV|UG|UA|AE|GB|US|UM|UY|UZ|VU|VE|VN|VG|VI|WF|EH|YE|ZM|ZW|'"
	 * @generated
	 */
	EDataType getSupplierCountry();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType <em>Tax Accounting Basis Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tax Accounting Basis Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType
	 * @model instanceClass="oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType"
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
	 *        extendedMetaData="name='TaxCode_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='10' pattern='RED|INT|NOR|ISE|OUT|([0-9.])*'"
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
	 *        extendedMetaData="name='TaxCountryRegion_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='2' maxLength='5' pattern='AF|AX|AL|DZ|AS|AD|AO|AI|AQ|AG|AR|AM|AW|AU|AT|AZ|BS|BH|BD|BB|BY|BE|BZ|BJ|BM|BT|BO|BA|BW|BV|BR|IO|BN|BG|BF|BI|KH|CM|CA|CV|KY|CF|TD|CL|CN|CX|CC|CO|KM|CG|CD|CK|CR|CI|HR|CU|CY|CZ|DK|DJ|DM|DO|EC|EG|SV|GQ|ER|EE|ET|FK|FO|FJ|FI|FR|GF|PF|TF|GA|GM|GE|DE|GH|GI|GR|GL|GD|GP|GU|GT|GG|GN|GW|GY|HT|HM|VA|HN|HK|HU|IS|IN|ID|IR|IQ|IE|IM|IL|IT|JM|JP|JE|JO|KZ|KE|KI|KP|KR|KW|KG|LA|LV|LB|LS|LR|LY|LI|LT|LU|MO|MK|MG|MW|MY|MV|ML|MT|MH|MQ|MR|MU|YT|MX|FM|MD|MC|MN|ME|MS|MA|MZ|MM|NA|NR|NP|NL|AN|NC|NZ|NI|NE|NG|NU|NF|MP|NO|OM|PK|PW|PS|PA|PG|PY|PE|PH|PN|PL|PT|PR|QA|RE|RO|RU|RW|BL|SH|KN|LC|MF|PM|VC|WS|SM|ST|SA|SN|RS|SC|SL|SG|SK|SI|SB|SO|ZA|GS|ES|LK|SD|SR|SJ|SZ|SE|CH|SY|TW|TJ|TZ|TH|TL|TG|TK|TO|TT|TN|TR|TM|TC|TV|UG|UA|AE|GB|US|UM|UY|UZ|VU|VE|VN|VG|VI|WF|EH|YE|ZM|ZW|PT-AC|PT-MA'"
	 * @generated
	 */
	EDataType getTaxCountryRegionType();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType <em>Tax Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tax Type Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType
	 * @model instanceClass="oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType"
	 *        extendedMetaData="name='TaxType_._type:Object' baseType='TaxType_._type'"
	 * @generated
	 */
	EDataType getTaxTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType <em>Transaction Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transaction Type Type Object</em>'.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType
	 * @model instanceClass="oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType"
	 *        extendedMetaData="name='TransactionType_._type:Object' baseType='TransactionType_._type'"
	 * @generated
	 */
	EDataType getTransactionTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Pt1_01_2Factory getPt1_01_2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.AddressStructureImpl <em>Address Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.AddressStructureImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getAddressStructure()
		 * @generated
		 */
		EClass ADDRESS_STRUCTURE = eINSTANCE.getAddressStructure();

		/**
		 * The meta object literal for the '<em><b>Building Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE__BUILDING_NUMBER = eINSTANCE.getAddressStructure_BuildingNumber();

		/**
		 * The meta object literal for the '<em><b>Street Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE__STREET_NAME = eINSTANCE.getAddressStructure_StreetName();

		/**
		 * The meta object literal for the '<em><b>Address Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE__ADDRESS_DETAIL = eINSTANCE.getAddressStructure_AddressDetail();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE__CITY = eINSTANCE.getAddressStructure_City();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE__POSTAL_CODE = eINSTANCE.getAddressStructure_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE__REGION = eINSTANCE.getAddressStructure_Region();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE__COUNTRY = eINSTANCE.getAddressStructure_Country();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.AddressStructurePTImpl <em>Address Structure PT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.AddressStructurePTImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getAddressStructurePT()
		 * @generated
		 */
		EClass ADDRESS_STRUCTURE_PT = eINSTANCE.getAddressStructurePT();

		/**
		 * The meta object literal for the '<em><b>Building Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE_PT__BUILDING_NUMBER = eINSTANCE.getAddressStructurePT_BuildingNumber();

		/**
		 * The meta object literal for the '<em><b>Street Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE_PT__STREET_NAME = eINSTANCE.getAddressStructurePT_StreetName();

		/**
		 * The meta object literal for the '<em><b>Address Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE_PT__ADDRESS_DETAIL = eINSTANCE.getAddressStructurePT_AddressDetail();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE_PT__CITY = eINSTANCE.getAddressStructurePT_City();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE_PT__POSTAL_CODE = eINSTANCE.getAddressStructurePT_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE_PT__REGION = eINSTANCE.getAddressStructurePT_Region();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_STRUCTURE_PT__COUNTRY = eINSTANCE.getAddressStructurePT_Country();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.AuditFileTypeImpl <em>Audit File Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.AuditFileTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getAuditFileType()
		 * @generated
		 */
		EClass AUDIT_FILE_TYPE = eINSTANCE.getAuditFileType();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIT_FILE_TYPE__HEADER = eINSTANCE.getAuditFileType_Header();

		/**
		 * The meta object literal for the '<em><b>Master Files</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIT_FILE_TYPE__MASTER_FILES = eINSTANCE.getAuditFileType_MasterFiles();

		/**
		 * The meta object literal for the '<em><b>General Ledger Entries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES = eINSTANCE.getAuditFileType_GeneralLedgerEntries();

		/**
		 * The meta object literal for the '<em><b>Source Documents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIT_FILE_TYPE__SOURCE_DOCUMENTS = eINSTANCE.getAuditFileType_SourceDocuments();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CreditNoteTypeImpl <em>Credit Note Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.CreditNoteTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCreditNoteType()
		 * @generated
		 */
		EClass CREDIT_NOTE_TYPE = eINSTANCE.getCreditNoteType();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_NOTE_TYPE__REFERENCE = eINSTANCE.getCreditNoteType_Reference();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_NOTE_TYPE__REASON = eINSTANCE.getCreditNoteType_Reason();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CurrencyTypeImpl <em>Currency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.CurrencyTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCurrencyType()
		 * @generated
		 */
		EClass CURRENCY_TYPE = eINSTANCE.getCurrencyType();

		/**
		 * The meta object literal for the '<em><b>Currency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_TYPE__CURRENCY_CODE = eINSTANCE.getCurrencyType_CurrencyCode();

		/**
		 * The meta object literal for the '<em><b>Currency Credit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_TYPE__CURRENCY_CREDIT_AMOUNT = eINSTANCE.getCurrencyType_CurrencyCreditAmount();

		/**
		 * The meta object literal for the '<em><b>Currency Debit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_TYPE__CURRENCY_DEBIT_AMOUNT = eINSTANCE.getCurrencyType_CurrencyDebitAmount();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl <em>Customer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCustomerType()
		 * @generated
		 */
		EClass CUSTOMER_TYPE = eINSTANCE.getCustomerType();

		/**
		 * The meta object literal for the '<em><b>Customer ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__CUSTOMER_ID = eINSTANCE.getCustomerType_CustomerID();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__ACCOUNT_ID = eINSTANCE.getCustomerType_AccountID();

		/**
		 * The meta object literal for the '<em><b>Customer Tax ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__CUSTOMER_TAX_ID = eINSTANCE.getCustomerType_CustomerTaxID();

		/**
		 * The meta object literal for the '<em><b>Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__COMPANY_NAME = eINSTANCE.getCustomerType_CompanyName();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__CONTACT = eINSTANCE.getCustomerType_Contact();

		/**
		 * The meta object literal for the '<em><b>Billing Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_TYPE__BILLING_ADDRESS = eINSTANCE.getCustomerType_BillingAddress();

		/**
		 * The meta object literal for the '<em><b>Ship To Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_TYPE__SHIP_TO_ADDRESS = eINSTANCE.getCustomerType_ShipToAddress();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__TELEPHONE = eINSTANCE.getCustomerType_Telephone();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__FAX = eINSTANCE.getCustomerType_Fax();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__EMAIL = eINSTANCE.getCustomerType_Email();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__WEBSITE = eINSTANCE.getCustomerType_Website();

		/**
		 * The meta object literal for the '<em><b>Self Billing Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__SELF_BILLING_INDICATOR = eINSTANCE.getCustomerType_SelfBillingIndicator();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Account Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACCOUNT_DESCRIPTION = eINSTANCE.getDocumentRoot_AccountDescription();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACCOUNT_ID = eINSTANCE.getDocumentRoot_AccountID();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADDRESS = eINSTANCE.getDocumentRoot_Address();

		/**
		 * The meta object literal for the '<em><b>Address Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ADDRESS_DETAIL = eINSTANCE.getDocumentRoot_AddressDetail();

		/**
		 * The meta object literal for the '<em><b>Audit File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUDIT_FILE = eINSTANCE.getDocumentRoot_AuditFile();

		/**
		 * The meta object literal for the '<em><b>Audit File Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__AUDIT_FILE_VERSION = eINSTANCE.getDocumentRoot_AuditFileVersion();

		/**
		 * The meta object literal for the '<em><b>Billing Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BILLING_ADDRESS = eINSTANCE.getDocumentRoot_BillingAddress();

		/**
		 * The meta object literal for the '<em><b>Building Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BUILDING_NUMBER = eINSTANCE.getDocumentRoot_BuildingNumber();

		/**
		 * The meta object literal for the '<em><b>Business Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BUSINESS_NAME = eINSTANCE.getDocumentRoot_BusinessName();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CITY = eINSTANCE.getDocumentRoot_City();

		/**
		 * The meta object literal for the '<em><b>Company Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPANY_ADDRESS = eINSTANCE.getDocumentRoot_CompanyAddress();

		/**
		 * The meta object literal for the '<em><b>Company ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COMPANY_ID = eINSTANCE.getDocumentRoot_CompanyID();

		/**
		 * The meta object literal for the '<em><b>Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COMPANY_NAME = eINSTANCE.getDocumentRoot_CompanyName();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONTACT = eINSTANCE.getDocumentRoot_Contact();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COUNTRY = eINSTANCE.getDocumentRoot_Country();

		/**
		 * The meta object literal for the '<em><b>Credit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CREDIT_AMOUNT = eINSTANCE.getDocumentRoot_CreditAmount();

		/**
		 * The meta object literal for the '<em><b>Credit Note</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CREDIT_NOTE = eINSTANCE.getDocumentRoot_CreditNote();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CURRENCY = eINSTANCE.getDocumentRoot_Currency();

		/**
		 * The meta object literal for the '<em><b>Currency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CURRENCY_CODE = eINSTANCE.getDocumentRoot_CurrencyCode();

		/**
		 * The meta object literal for the '<em><b>Currency Credit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CURRENCY_CREDIT_AMOUNT = eINSTANCE.getDocumentRoot_CurrencyCreditAmount();

		/**
		 * The meta object literal for the '<em><b>Currency Debit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CURRENCY_DEBIT_AMOUNT = eINSTANCE.getDocumentRoot_CurrencyDebitAmount();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CUSTOMER = eINSTANCE.getDocumentRoot_Customer();

		/**
		 * The meta object literal for the '<em><b>Customer ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CUSTOMER_ID = eINSTANCE.getDocumentRoot_CustomerID();

		/**
		 * The meta object literal for the '<em><b>Customer Tax ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CUSTOMER_TAX_ID = eINSTANCE.getDocumentRoot_CustomerTaxID();

		/**
		 * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATE_CREATED = eINSTANCE.getDocumentRoot_DateCreated();

		/**
		 * The meta object literal for the '<em><b>Debit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DEBIT_AMOUNT = eINSTANCE.getDocumentRoot_DebitAmount();

		/**
		 * The meta object literal for the '<em><b>Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DELIVERY_DATE = eINSTANCE.getDocumentRoot_DeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Delivery ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DELIVERY_ID = eINSTANCE.getDocumentRoot_DeliveryID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

		/**
		 * The meta object literal for the '<em><b>Doc Archival Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER = eINSTANCE.getDocumentRoot_DocArchivalNumber();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EMAIL = eINSTANCE.getDocumentRoot_Email();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__END_DATE = eINSTANCE.getDocumentRoot_EndDate();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FAX = eINSTANCE.getDocumentRoot_Fax();

		/**
		 * The meta object literal for the '<em><b>Fiscal Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FISCAL_YEAR = eINSTANCE.getDocumentRoot_FiscalYear();

		/**
		 * The meta object literal for the '<em><b>General Ledger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERAL_LEDGER = eINSTANCE.getDocumentRoot_GeneralLedger();

		/**
		 * The meta object literal for the '<em><b>General Ledger Entries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES = eINSTANCE.getDocumentRoot_GeneralLedgerEntries();

		/**
		 * The meta object literal for the '<em><b>GL Posting Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GL_POSTING_DATE = eINSTANCE.getDocumentRoot_GLPostingDate();

		/**
		 * The meta object literal for the '<em><b>Gross Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GROSS_TOTAL = eINSTANCE.getDocumentRoot_GrossTotal();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HASH = eINSTANCE.getDocumentRoot_Hash();

		/**
		 * The meta object literal for the '<em><b>Hash Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HASH_CONTROL = eINSTANCE.getDocumentRoot_HashControl();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HEADER = eINSTANCE.getDocumentRoot_Header();

		/**
		 * The meta object literal for the '<em><b>Header Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HEADER_COMMENT = eINSTANCE.getDocumentRoot_HeaderComment();

		/**
		 * The meta object literal for the '<em><b>Invoice Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INVOICE_DATE = eINSTANCE.getDocumentRoot_InvoiceDate();

		/**
		 * The meta object literal for the '<em><b>Invoice No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INVOICE_NO = eINSTANCE.getDocumentRoot_InvoiceNo();

		/**
		 * The meta object literal for the '<em><b>Invoice Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INVOICE_STATUS = eINSTANCE.getDocumentRoot_InvoiceStatus();

		/**
		 * The meta object literal for the '<em><b>Invoice Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INVOICE_TYPE = eINSTANCE.getDocumentRoot_InvoiceType();

		/**
		 * The meta object literal for the '<em><b>Journal ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__JOURNAL_ID = eINSTANCE.getDocumentRoot_JournalID();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LINE_NUMBER = eINSTANCE.getDocumentRoot_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Net Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NET_TOTAL = eINSTANCE.getDocumentRoot_NetTotal();

		/**
		 * The meta object literal for the '<em><b>Number Of Entries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NUMBER_OF_ENTRIES = eINSTANCE.getDocumentRoot_NumberOfEntries();

		/**
		 * The meta object literal for the '<em><b>Opening Credit Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__OPENING_CREDIT_BALANCE = eINSTANCE.getDocumentRoot_OpeningCreditBalance();

		/**
		 * The meta object literal for the '<em><b>Opening Debit Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__OPENING_DEBIT_BALANCE = eINSTANCE.getDocumentRoot_OpeningDebitBalance();

		/**
		 * The meta object literal for the '<em><b>Order Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORDER_DATE = eINSTANCE.getDocumentRoot_OrderDate();

		/**
		 * The meta object literal for the '<em><b>Order References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORDER_REFERENCES = eINSTANCE.getDocumentRoot_OrderReferences();

		/**
		 * The meta object literal for the '<em><b>Originating ON</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORIGINATING_ON = eINSTANCE.getDocumentRoot_OriginatingON();

		/**
		 * The meta object literal for the '<em><b>Payment Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PAYMENT_MECHANISM = eINSTANCE.getDocumentRoot_PaymentMechanism();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PERIOD = eINSTANCE.getDocumentRoot_Period();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__POSTAL_CODE = eINSTANCE.getDocumentRoot_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PRODUCT = eINSTANCE.getDocumentRoot_Product();

		/**
		 * The meta object literal for the '<em><b>Product Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRODUCT_CODE = eINSTANCE.getDocumentRoot_ProductCode();

		/**
		 * The meta object literal for the '<em><b>Product Company Tax ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID = eINSTANCE.getDocumentRoot_ProductCompanyTaxID();

		/**
		 * The meta object literal for the '<em><b>Product Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRODUCT_DESCRIPTION = eINSTANCE.getDocumentRoot_ProductDescription();

		/**
		 * The meta object literal for the '<em><b>Product Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRODUCT_GROUP = eINSTANCE.getDocumentRoot_ProductGroup();

		/**
		 * The meta object literal for the '<em><b>Product ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRODUCT_ID = eINSTANCE.getDocumentRoot_ProductID();

		/**
		 * The meta object literal for the '<em><b>Product Number Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRODUCT_NUMBER_CODE = eINSTANCE.getDocumentRoot_ProductNumberCode();

		/**
		 * The meta object literal for the '<em><b>Product Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRODUCT_TYPE = eINSTANCE.getDocumentRoot_ProductType();

		/**
		 * The meta object literal for the '<em><b>Product Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PRODUCT_VERSION = eINSTANCE.getDocumentRoot_ProductVersion();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__QUANTITY = eINSTANCE.getDocumentRoot_Quantity();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REASON = eINSTANCE.getDocumentRoot_Reason();

		/**
		 * The meta object literal for the '<em><b>Record ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RECORD_ID = eINSTANCE.getDocumentRoot_RecordID();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REFERENCE = eINSTANCE.getDocumentRoot_Reference();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCES = eINSTANCE.getDocumentRoot_References();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REGION = eINSTANCE.getDocumentRoot_Region();

		/**
		 * The meta object literal for the '<em><b>Self Billing Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SELF_BILLING_INDICATOR = eINSTANCE.getDocumentRoot_SelfBillingIndicator();

		/**
		 * The meta object literal for the '<em><b>Settlement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SETTLEMENT = eINSTANCE.getDocumentRoot_Settlement();

		/**
		 * The meta object literal for the '<em><b>Settlement Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SETTLEMENT_AMOUNT = eINSTANCE.getDocumentRoot_SettlementAmount();

		/**
		 * The meta object literal for the '<em><b>Ship From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHIP_FROM = eINSTANCE.getDocumentRoot_ShipFrom();

		/**
		 * The meta object literal for the '<em><b>Ship From Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHIP_FROM_ADDRESS = eINSTANCE.getDocumentRoot_ShipFromAddress();

		/**
		 * The meta object literal for the '<em><b>Ship To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHIP_TO = eINSTANCE.getDocumentRoot_ShipTo();

		/**
		 * The meta object literal for the '<em><b>Ship To Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHIP_TO_ADDRESS = eINSTANCE.getDocumentRoot_ShipToAddress();

		/**
		 * The meta object literal for the '<em><b>Software Certificate Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER = eINSTANCE.getDocumentRoot_SoftwareCertificateNumber();

		/**
		 * The meta object literal for the '<em><b>Source Document ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SOURCE_DOCUMENT_ID = eINSTANCE.getDocumentRoot_SourceDocumentID();

		/**
		 * The meta object literal for the '<em><b>Source Documents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOURCE_DOCUMENTS = eINSTANCE.getDocumentRoot_SourceDocuments();

		/**
		 * The meta object literal for the '<em><b>Source ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SOURCE_ID = eINSTANCE.getDocumentRoot_SourceID();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__START_DATE = eINSTANCE.getDocumentRoot_StartDate();

		/**
		 * The meta object literal for the '<em><b>Street Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STREET_NAME = eINSTANCE.getDocumentRoot_StreetName();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUPPLIER = eINSTANCE.getDocumentRoot_Supplier();

		/**
		 * The meta object literal for the '<em><b>Supplier ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SUPPLIER_ID = eINSTANCE.getDocumentRoot_SupplierID();

		/**
		 * The meta object literal for the '<em><b>Supplier Tax ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SUPPLIER_TAX_ID = eINSTANCE.getDocumentRoot_SupplierTaxID();

		/**
		 * The meta object literal for the '<em><b>System Entry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SYSTEM_ENTRY_DATE = eINSTANCE.getDocumentRoot_SystemEntryDate();

		/**
		 * The meta object literal for the '<em><b>Tax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TAX = eINSTANCE.getDocumentRoot_Tax();

		/**
		 * The meta object literal for the '<em><b>Tax Accounting Basis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS = eINSTANCE.getDocumentRoot_TaxAccountingBasis();

		/**
		 * The meta object literal for the '<em><b>Tax Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_AMOUNT = eINSTANCE.getDocumentRoot_TaxAmount();

		/**
		 * The meta object literal for the '<em><b>Tax Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_CODE = eINSTANCE.getDocumentRoot_TaxCode();

		/**
		 * The meta object literal for the '<em><b>Tax Country Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_COUNTRY_REGION = eINSTANCE.getDocumentRoot_TaxCountryRegion();

		/**
		 * The meta object literal for the '<em><b>Tax Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_ENTITY = eINSTANCE.getDocumentRoot_TaxEntity();

		/**
		 * The meta object literal for the '<em><b>Tax Exemption Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_EXEMPTION_REASON = eINSTANCE.getDocumentRoot_TaxExemptionReason();

		/**
		 * The meta object literal for the '<em><b>Tax Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_EXPIRATION_DATE = eINSTANCE.getDocumentRoot_TaxExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Tax Payable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_PAYABLE = eINSTANCE.getDocumentRoot_TaxPayable();

		/**
		 * The meta object literal for the '<em><b>Tax Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_PERCENTAGE = eINSTANCE.getDocumentRoot_TaxPercentage();

		/**
		 * The meta object literal for the '<em><b>Tax Point Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_POINT_DATE = eINSTANCE.getDocumentRoot_TaxPointDate();

		/**
		 * The meta object literal for the '<em><b>Tax Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TAX_TABLE = eINSTANCE.getDocumentRoot_TaxTable();

		/**
		 * The meta object literal for the '<em><b>Tax Table Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TAX_TABLE_ENTRY = eINSTANCE.getDocumentRoot_TaxTableEntry();

		/**
		 * The meta object literal for the '<em><b>Tax Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_TYPE = eINSTANCE.getDocumentRoot_TaxType();

		/**
		 * The meta object literal for the '<em><b>Tax Verification Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TAX_VERIFICATION_DATE = eINSTANCE.getDocumentRoot_TaxVerificationDate();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TELEPHONE = eINSTANCE.getDocumentRoot_Telephone();

		/**
		 * The meta object literal for the '<em><b>Total Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TOTAL_CREDIT = eINSTANCE.getDocumentRoot_TotalCredit();

		/**
		 * The meta object literal for the '<em><b>Total Debit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TOTAL_DEBIT = eINSTANCE.getDocumentRoot_TotalDebit();

		/**
		 * The meta object literal for the '<em><b>Transaction Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSACTION_DATE = eINSTANCE.getDocumentRoot_TransactionDate();

		/**
		 * The meta object literal for the '<em><b>Transaction ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSACTION_ID = eINSTANCE.getDocumentRoot_TransactionID();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TRANSACTION_TYPE = eINSTANCE.getDocumentRoot_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Unit Of Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__UNIT_OF_MEASURE = eINSTANCE.getDocumentRoot_UnitOfMeasure();

		/**
		 * The meta object literal for the '<em><b>Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__UNIT_PRICE = eINSTANCE.getDocumentRoot_UnitPrice();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__WEBSITE = eINSTANCE.getDocumentRoot_Website();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentTotalsTypeImpl <em>Document Totals Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentTotalsTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getDocumentTotalsType()
		 * @generated
		 */
		EClass DOCUMENT_TOTALS_TYPE = eINSTANCE.getDocumentTotalsType();

		/**
		 * The meta object literal for the '<em><b>Tax Payable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TOTALS_TYPE__TAX_PAYABLE = eINSTANCE.getDocumentTotalsType_TaxPayable();

		/**
		 * The meta object literal for the '<em><b>Net Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TOTALS_TYPE__NET_TOTAL = eINSTANCE.getDocumentTotalsType_NetTotal();

		/**
		 * The meta object literal for the '<em><b>Gross Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TOTALS_TYPE__GROSS_TOTAL = eINSTANCE.getDocumentTotalsType_GrossTotal();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TOTALS_TYPE__CURRENCY = eINSTANCE.getDocumentTotalsType_Currency();

		/**
		 * The meta object literal for the '<em><b>Settlement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TOTALS_TYPE__SETTLEMENT = eINSTANCE.getDocumentTotalsType_Settlement();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.GeneralLedgerEntriesTypeImpl <em>General Ledger Entries Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.GeneralLedgerEntriesTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getGeneralLedgerEntriesType()
		 * @generated
		 */
		EClass GENERAL_LEDGER_ENTRIES_TYPE = eINSTANCE.getGeneralLedgerEntriesType();

		/**
		 * The meta object literal for the '<em><b>Number Of Entries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_LEDGER_ENTRIES_TYPE__NUMBER_OF_ENTRIES = eINSTANCE.getGeneralLedgerEntriesType_NumberOfEntries();

		/**
		 * The meta object literal for the '<em><b>Total Debit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_DEBIT = eINSTANCE.getGeneralLedgerEntriesType_TotalDebit();

		/**
		 * The meta object literal for the '<em><b>Total Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_CREDIT = eINSTANCE.getGeneralLedgerEntriesType_TotalCredit();

		/**
		 * The meta object literal for the '<em><b>Journal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_LEDGER_ENTRIES_TYPE__JOURNAL = eINSTANCE.getGeneralLedgerEntriesType_Journal();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.GeneralLedgerTypeImpl <em>General Ledger Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.GeneralLedgerTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getGeneralLedgerType()
		 * @generated
		 */
		EClass GENERAL_LEDGER_TYPE = eINSTANCE.getGeneralLedgerType();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_LEDGER_TYPE__ACCOUNT_ID = eINSTANCE.getGeneralLedgerType_AccountID();

		/**
		 * The meta object literal for the '<em><b>Account Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_LEDGER_TYPE__ACCOUNT_DESCRIPTION = eINSTANCE.getGeneralLedgerType_AccountDescription();

		/**
		 * The meta object literal for the '<em><b>Opening Debit Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_LEDGER_TYPE__OPENING_DEBIT_BALANCE = eINSTANCE.getGeneralLedgerType_OpeningDebitBalance();

		/**
		 * The meta object literal for the '<em><b>Opening Credit Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_LEDGER_TYPE__OPENING_CREDIT_BALANCE = eINSTANCE.getGeneralLedgerType_OpeningCreditBalance();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.HeaderTypeImpl <em>Header Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.HeaderTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getHeaderType()
		 * @generated
		 */
		EClass HEADER_TYPE = eINSTANCE.getHeaderType();

		/**
		 * The meta object literal for the '<em><b>Audit File Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__AUDIT_FILE_VERSION = eINSTANCE.getHeaderType_AuditFileVersion();

		/**
		 * The meta object literal for the '<em><b>Company ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__COMPANY_ID = eINSTANCE.getHeaderType_CompanyID();

		/**
		 * The meta object literal for the '<em><b>Tax Registration Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__TAX_REGISTRATION_NUMBER = eINSTANCE.getHeaderType_TaxRegistrationNumber();

		/**
		 * The meta object literal for the '<em><b>Tax Accounting Basis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__TAX_ACCOUNTING_BASIS = eINSTANCE.getHeaderType_TaxAccountingBasis();

		/**
		 * The meta object literal for the '<em><b>Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__COMPANY_NAME = eINSTANCE.getHeaderType_CompanyName();

		/**
		 * The meta object literal for the '<em><b>Business Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__BUSINESS_NAME = eINSTANCE.getHeaderType_BusinessName();

		/**
		 * The meta object literal for the '<em><b>Company Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_TYPE__COMPANY_ADDRESS = eINSTANCE.getHeaderType_CompanyAddress();

		/**
		 * The meta object literal for the '<em><b>Fiscal Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__FISCAL_YEAR = eINSTANCE.getHeaderType_FiscalYear();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__START_DATE = eINSTANCE.getHeaderType_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__END_DATE = eINSTANCE.getHeaderType_EndDate();

		/**
		 * The meta object literal for the '<em><b>Currency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__CURRENCY_CODE = eINSTANCE.getHeaderType_CurrencyCode();

		/**
		 * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__DATE_CREATED = eINSTANCE.getHeaderType_DateCreated();

		/**
		 * The meta object literal for the '<em><b>Tax Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__TAX_ENTITY = eINSTANCE.getHeaderType_TaxEntity();

		/**
		 * The meta object literal for the '<em><b>Product Company Tax ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__PRODUCT_COMPANY_TAX_ID = eINSTANCE.getHeaderType_ProductCompanyTaxID();

		/**
		 * The meta object literal for the '<em><b>Software Certificate Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__SOFTWARE_CERTIFICATE_NUMBER = eINSTANCE.getHeaderType_SoftwareCertificateNumber();

		/**
		 * The meta object literal for the '<em><b>Product ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__PRODUCT_ID = eINSTANCE.getHeaderType_ProductID();

		/**
		 * The meta object literal for the '<em><b>Product Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__PRODUCT_VERSION = eINSTANCE.getHeaderType_ProductVersion();

		/**
		 * The meta object literal for the '<em><b>Header Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__HEADER_COMMENT = eINSTANCE.getHeaderType_HeaderComment();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__TELEPHONE = eINSTANCE.getHeaderType_Telephone();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__FAX = eINSTANCE.getHeaderType_Fax();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__EMAIL = eINSTANCE.getHeaderType_Email();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_TYPE__WEBSITE = eINSTANCE.getHeaderType_Website();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.InvoiceTypeImpl <em>Invoice Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.InvoiceTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceType()
		 * @generated
		 */
		EClass INVOICE_TYPE = eINSTANCE.getInvoiceType();

		/**
		 * The meta object literal for the '<em><b>Invoice No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__INVOICE_NO = eINSTANCE.getInvoiceType_InvoiceNo();

		/**
		 * The meta object literal for the '<em><b>Invoice Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__INVOICE_STATUS = eINSTANCE.getInvoiceType_InvoiceStatus();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__HASH = eINSTANCE.getInvoiceType_Hash();

		/**
		 * The meta object literal for the '<em><b>Hash Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__HASH_CONTROL = eINSTANCE.getInvoiceType_HashControl();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__PERIOD = eINSTANCE.getInvoiceType_Period();

		/**
		 * The meta object literal for the '<em><b>Invoice Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__INVOICE_DATE = eINSTANCE.getInvoiceType_InvoiceDate();

		/**
		 * The meta object literal for the '<em><b>Invoice Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__INVOICE_TYPE = eINSTANCE.getInvoiceType_InvoiceType();

		/**
		 * The meta object literal for the '<em><b>Self Billing Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__SELF_BILLING_INDICATOR = eINSTANCE.getInvoiceType_SelfBillingIndicator();

		/**
		 * The meta object literal for the '<em><b>System Entry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__SYSTEM_ENTRY_DATE = eINSTANCE.getInvoiceType_SystemEntryDate();

		/**
		 * The meta object literal for the '<em><b>Transaction ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__TRANSACTION_ID = eINSTANCE.getInvoiceType_TransactionID();

		/**
		 * The meta object literal for the '<em><b>Customer ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__CUSTOMER_ID = eINSTANCE.getInvoiceType_CustomerID();

		/**
		 * The meta object literal for the '<em><b>Ship To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TYPE__SHIP_TO = eINSTANCE.getInvoiceType_ShipTo();

		/**
		 * The meta object literal for the '<em><b>Ship From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TYPE__SHIP_FROM = eINSTANCE.getInvoiceType_ShipFrom();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TYPE__LINE = eINSTANCE.getInvoiceType_Line();

		/**
		 * The meta object literal for the '<em><b>Document Totals</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TYPE__DOCUMENT_TOTALS = eINSTANCE.getInvoiceType_DocumentTotals();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.JournalTypeImpl <em>Journal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.JournalTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getJournalType()
		 * @generated
		 */
		EClass JOURNAL_TYPE = eINSTANCE.getJournalType();

		/**
		 * The meta object literal for the '<em><b>Journal ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNAL_TYPE__JOURNAL_ID = eINSTANCE.getJournalType_JournalID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNAL_TYPE__DESCRIPTION = eINSTANCE.getJournalType_Description();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNAL_TYPE__TRANSACTION = eINSTANCE.getJournalType_Transaction();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.LineTypeImpl <em>Line Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.LineTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getLineType()
		 * @generated
		 */
		EClass LINE_TYPE = eINSTANCE.getLineType();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__LINE_NUMBER = eINSTANCE.getLineType_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Order References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_TYPE__ORDER_REFERENCES = eINSTANCE.getLineType_OrderReferences();

		/**
		 * The meta object literal for the '<em><b>Product Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__PRODUCT_CODE = eINSTANCE.getLineType_ProductCode();

		/**
		 * The meta object literal for the '<em><b>Product Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__PRODUCT_DESCRIPTION = eINSTANCE.getLineType_ProductDescription();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__QUANTITY = eINSTANCE.getLineType_Quantity();

		/**
		 * The meta object literal for the '<em><b>Unit Of Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__UNIT_OF_MEASURE = eINSTANCE.getLineType_UnitOfMeasure();

		/**
		 * The meta object literal for the '<em><b>Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__UNIT_PRICE = eINSTANCE.getLineType_UnitPrice();

		/**
		 * The meta object literal for the '<em><b>Tax Point Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__TAX_POINT_DATE = eINSTANCE.getLineType_TaxPointDate();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_TYPE__REFERENCES = eINSTANCE.getLineType_References();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__DESCRIPTION = eINSTANCE.getLineType_Description();

		/**
		 * The meta object literal for the '<em><b>Debit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__DEBIT_AMOUNT = eINSTANCE.getLineType_DebitAmount();

		/**
		 * The meta object literal for the '<em><b>Credit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__CREDIT_AMOUNT = eINSTANCE.getLineType_CreditAmount();

		/**
		 * The meta object literal for the '<em><b>Tax</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_TYPE__TAX = eINSTANCE.getLineType_Tax();

		/**
		 * The meta object literal for the '<em><b>Tax Exemption Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__TAX_EXEMPTION_REASON = eINSTANCE.getLineType_TaxExemptionReason();

		/**
		 * The meta object literal for the '<em><b>Settlement Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE__SETTLEMENT_AMOUNT = eINSTANCE.getLineType_SettlementAmount();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.LineType1Impl <em>Line Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.LineType1Impl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getLineType1()
		 * @generated
		 */
		EClass LINE_TYPE1 = eINSTANCE.getLineType1();

		/**
		 * The meta object literal for the '<em><b>Record ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE1__RECORD_ID = eINSTANCE.getLineType1_RecordID();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE1__ACCOUNT_ID = eINSTANCE.getLineType1_AccountID();

		/**
		 * The meta object literal for the '<em><b>Source Document ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE1__SOURCE_DOCUMENT_ID = eINSTANCE.getLineType1_SourceDocumentID();

		/**
		 * The meta object literal for the '<em><b>System Entry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE1__SYSTEM_ENTRY_DATE = eINSTANCE.getLineType1_SystemEntryDate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE1__DESCRIPTION = eINSTANCE.getLineType1_Description();

		/**
		 * The meta object literal for the '<em><b>Debit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE1__DEBIT_AMOUNT = eINSTANCE.getLineType1_DebitAmount();

		/**
		 * The meta object literal for the '<em><b>Credit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TYPE1__CREDIT_AMOUNT = eINSTANCE.getLineType1_CreditAmount();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.MasterFilesTypeImpl <em>Master Files Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.MasterFilesTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getMasterFilesType()
		 * @generated
		 */
		EClass MASTER_FILES_TYPE = eINSTANCE.getMasterFilesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_FILES_TYPE__GROUP = eINSTANCE.getMasterFilesType_Group();

		/**
		 * The meta object literal for the '<em><b>General Ledger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_FILES_TYPE__GENERAL_LEDGER = eINSTANCE.getMasterFilesType_GeneralLedger();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_FILES_TYPE__CUSTOMER = eINSTANCE.getMasterFilesType_Customer();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_FILES_TYPE__SUPPLIER = eINSTANCE.getMasterFilesType_Supplier();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_FILES_TYPE__PRODUCT = eINSTANCE.getMasterFilesType_Product();

		/**
		 * The meta object literal for the '<em><b>Tax Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_FILES_TYPE__TAX_TABLE = eINSTANCE.getMasterFilesType_TaxTable();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.OrderReferencesTypeImpl <em>Order References Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.OrderReferencesTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getOrderReferencesType()
		 * @generated
		 */
		EClass ORDER_REFERENCES_TYPE = eINSTANCE.getOrderReferencesType();

		/**
		 * The meta object literal for the '<em><b>Originating ON</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_REFERENCES_TYPE__ORIGINATING_ON = eINSTANCE.getOrderReferencesType_OriginatingON();

		/**
		 * The meta object literal for the '<em><b>Order Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_REFERENCES_TYPE__ORDER_DATE = eINSTANCE.getOrderReferencesType_OrderDate();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.ProductTypeImpl <em>Product Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.ProductTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getProductType()
		 * @generated
		 */
		EClass PRODUCT_TYPE = eINSTANCE.getProductType();

		/**
		 * The meta object literal for the '<em><b>Product Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__PRODUCT_TYPE = eINSTANCE.getProductType_ProductType();

		/**
		 * The meta object literal for the '<em><b>Product Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__PRODUCT_CODE = eINSTANCE.getProductType_ProductCode();

		/**
		 * The meta object literal for the '<em><b>Product Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__PRODUCT_GROUP = eINSTANCE.getProductType_ProductGroup();

		/**
		 * The meta object literal for the '<em><b>Product Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__PRODUCT_DESCRIPTION = eINSTANCE.getProductType_ProductDescription();

		/**
		 * The meta object literal for the '<em><b>Product Number Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__PRODUCT_NUMBER_CODE = eINSTANCE.getProductType_ProductNumberCode();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.ReferencesTypeImpl <em>References Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.ReferencesTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getReferencesType()
		 * @generated
		 */
		EClass REFERENCES_TYPE = eINSTANCE.getReferencesType();

		/**
		 * The meta object literal for the '<em><b>Credit Note</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_TYPE__CREDIT_NOTE = eINSTANCE.getReferencesType_CreditNote();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SalesInvoicesTypeImpl <em>Sales Invoices Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.SalesInvoicesTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSalesInvoicesType()
		 * @generated
		 */
		EClass SALES_INVOICES_TYPE = eINSTANCE.getSalesInvoicesType();

		/**
		 * The meta object literal for the '<em><b>Number Of Entries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_INVOICES_TYPE__NUMBER_OF_ENTRIES = eINSTANCE.getSalesInvoicesType_NumberOfEntries();

		/**
		 * The meta object literal for the '<em><b>Total Debit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_INVOICES_TYPE__TOTAL_DEBIT = eINSTANCE.getSalesInvoicesType_TotalDebit();

		/**
		 * The meta object literal for the '<em><b>Total Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_INVOICES_TYPE__TOTAL_CREDIT = eINSTANCE.getSalesInvoicesType_TotalCredit();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_INVOICES_TYPE__INVOICE = eINSTANCE.getSalesInvoicesType_Invoice();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SettlementTypeImpl <em>Settlement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.SettlementTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSettlementType()
		 * @generated
		 */
		EClass SETTLEMENT_TYPE = eINSTANCE.getSettlementType();

		/**
		 * The meta object literal for the '<em><b>Settlement Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTLEMENT_TYPE__SETTLEMENT_DISCOUNT = eINSTANCE.getSettlementType_SettlementDiscount();

		/**
		 * The meta object literal for the '<em><b>Settlement Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTLEMENT_TYPE__SETTLEMENT_AMOUNT = eINSTANCE.getSettlementType_SettlementAmount();

		/**
		 * The meta object literal for the '<em><b>Settlement Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTLEMENT_TYPE__SETTLEMENT_DATE = eINSTANCE.getSettlementType_SettlementDate();

		/**
		 * The meta object literal for the '<em><b>Payment Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTLEMENT_TYPE__PAYMENT_MECHANISM = eINSTANCE.getSettlementType_PaymentMechanism();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.ShippingPointStructureImpl <em>Shipping Point Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.ShippingPointStructureImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getShippingPointStructure()
		 * @generated
		 */
		EClass SHIPPING_POINT_STRUCTURE = eINSTANCE.getShippingPointStructure();

		/**
		 * The meta object literal for the '<em><b>Delivery ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPPING_POINT_STRUCTURE__DELIVERY_ID = eINSTANCE.getShippingPointStructure_DeliveryID();

		/**
		 * The meta object literal for the '<em><b>Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPPING_POINT_STRUCTURE__DELIVERY_DATE = eINSTANCE.getShippingPointStructure_DeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPPING_POINT_STRUCTURE__ADDRESS = eINSTANCE.getShippingPointStructure_Address();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SourceDocumentsTypeImpl <em>Source Documents Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.SourceDocumentsTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSourceDocumentsType()
		 * @generated
		 */
		EClass SOURCE_DOCUMENTS_TYPE = eINSTANCE.getSourceDocumentsType();

		/**
		 * The meta object literal for the '<em><b>Sales Invoices</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_DOCUMENTS_TYPE__SALES_INVOICES = eINSTANCE.getSourceDocumentsType_SalesInvoices();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SupplierAddressStructureImpl <em>Supplier Address Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.SupplierAddressStructureImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSupplierAddressStructure()
		 * @generated
		 */
		EClass SUPPLIER_ADDRESS_STRUCTURE = eINSTANCE.getSupplierAddressStructure();

		/**
		 * The meta object literal for the '<em><b>Building Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_ADDRESS_STRUCTURE__BUILDING_NUMBER = eINSTANCE.getSupplierAddressStructure_BuildingNumber();

		/**
		 * The meta object literal for the '<em><b>Street Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_ADDRESS_STRUCTURE__STREET_NAME = eINSTANCE.getSupplierAddressStructure_StreetName();

		/**
		 * The meta object literal for the '<em><b>Address Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_ADDRESS_STRUCTURE__ADDRESS_DETAIL = eINSTANCE.getSupplierAddressStructure_AddressDetail();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_ADDRESS_STRUCTURE__CITY = eINSTANCE.getSupplierAddressStructure_City();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_ADDRESS_STRUCTURE__POSTAL_CODE = eINSTANCE.getSupplierAddressStructure_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_ADDRESS_STRUCTURE__REGION = eINSTANCE.getSupplierAddressStructure_Region();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_ADDRESS_STRUCTURE__COUNTRY = eINSTANCE.getSupplierAddressStructure_Country();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SupplierTypeImpl <em>Supplier Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.SupplierTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSupplierType()
		 * @generated
		 */
		EClass SUPPLIER_TYPE = eINSTANCE.getSupplierType();

		/**
		 * The meta object literal for the '<em><b>Supplier ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_TYPE__SUPPLIER_ID = eINSTANCE.getSupplierType_SupplierID();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_TYPE__ACCOUNT_ID = eINSTANCE.getSupplierType_AccountID();

		/**
		 * The meta object literal for the '<em><b>Supplier Tax ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_TYPE__SUPPLIER_TAX_ID = eINSTANCE.getSupplierType_SupplierTaxID();

		/**
		 * The meta object literal for the '<em><b>Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_TYPE__COMPANY_NAME = eINSTANCE.getSupplierType_CompanyName();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_TYPE__CONTACT = eINSTANCE.getSupplierType_Contact();

		/**
		 * The meta object literal for the '<em><b>Billing Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_TYPE__BILLING_ADDRESS = eINSTANCE.getSupplierType_BillingAddress();

		/**
		 * The meta object literal for the '<em><b>Ship From Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_TYPE__SHIP_FROM_ADDRESS = eINSTANCE.getSupplierType_ShipFromAddress();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_TYPE__TELEPHONE = eINSTANCE.getSupplierType_Telephone();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_TYPE__FAX = eINSTANCE.getSupplierType_Fax();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_TYPE__EMAIL = eINSTANCE.getSupplierType_Email();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_TYPE__WEBSITE = eINSTANCE.getSupplierType_Website();

		/**
		 * The meta object literal for the '<em><b>Self Billing Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_TYPE__SELF_BILLING_INDICATOR = eINSTANCE.getSupplierType_SelfBillingIndicator();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTableEntryTypeImpl <em>Tax Table Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTableEntryTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxTableEntryType()
		 * @generated
		 */
		EClass TAX_TABLE_ENTRY_TYPE = eINSTANCE.getTaxTableEntryType();

		/**
		 * The meta object literal for the '<em><b>Tax Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TABLE_ENTRY_TYPE__TAX_TYPE = eINSTANCE.getTaxTableEntryType_TaxType();

		/**
		 * The meta object literal for the '<em><b>Tax Country Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TABLE_ENTRY_TYPE__TAX_COUNTRY_REGION = eINSTANCE.getTaxTableEntryType_TaxCountryRegion();

		/**
		 * The meta object literal for the '<em><b>Tax Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TABLE_ENTRY_TYPE__TAX_CODE = eINSTANCE.getTaxTableEntryType_TaxCode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TABLE_ENTRY_TYPE__DESCRIPTION = eINSTANCE.getTaxTableEntryType_Description();

		/**
		 * The meta object literal for the '<em><b>Tax Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TABLE_ENTRY_TYPE__TAX_EXPIRATION_DATE = eINSTANCE.getTaxTableEntryType_TaxExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Tax Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TABLE_ENTRY_TYPE__TAX_PERCENTAGE = eINSTANCE.getTaxTableEntryType_TaxPercentage();

		/**
		 * The meta object literal for the '<em><b>Tax Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TABLE_ENTRY_TYPE__TAX_AMOUNT = eINSTANCE.getTaxTableEntryType_TaxAmount();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTableTypeImpl <em>Tax Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTableTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxTableType()
		 * @generated
		 */
		EClass TAX_TABLE_TYPE = eINSTANCE.getTaxTableType();

		/**
		 * The meta object literal for the '<em><b>Tax Table Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_TABLE_TYPE__TAX_TABLE_ENTRY = eINSTANCE.getTaxTableType_TaxTableEntry();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTypeImpl <em>Tax Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxType()
		 * @generated
		 */
		EClass TAX_TYPE = eINSTANCE.getTaxType();

		/**
		 * The meta object literal for the '<em><b>Tax Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TYPE__TAX_TYPE = eINSTANCE.getTaxType_TaxType();

		/**
		 * The meta object literal for the '<em><b>Tax Country Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TYPE__TAX_COUNTRY_REGION = eINSTANCE.getTaxType_TaxCountryRegion();

		/**
		 * The meta object literal for the '<em><b>Tax Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TYPE__TAX_CODE = eINSTANCE.getTaxType_TaxCode();

		/**
		 * The meta object literal for the '<em><b>Tax Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TYPE__TAX_PERCENTAGE = eINSTANCE.getTaxType_TaxPercentage();

		/**
		 * The meta object literal for the '<em><b>Tax Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_TYPE__TAX_AMOUNT = eINSTANCE.getTaxType_TaxAmount();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TransactionTypeImpl <em>Transaction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.TransactionTypeImpl
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTransactionType()
		 * @generated
		 */
		EClass TRANSACTION_TYPE = eINSTANCE.getTransactionType();

		/**
		 * The meta object literal for the '<em><b>Transaction ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__TRANSACTION_ID = eINSTANCE.getTransactionType_TransactionID();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__PERIOD = eINSTANCE.getTransactionType_Period();

		/**
		 * The meta object literal for the '<em><b>Transaction Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__TRANSACTION_DATE = eINSTANCE.getTransactionType_TransactionDate();

		/**
		 * The meta object literal for the '<em><b>Source ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__SOURCE_ID = eINSTANCE.getTransactionType_SourceID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__DESCRIPTION = eINSTANCE.getTransactionType_Description();

		/**
		 * The meta object literal for the '<em><b>Doc Archival Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__DOC_ARCHIVAL_NUMBER = eINSTANCE.getTransactionType_DocArchivalNumber();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__TRANSACTION_TYPE = eINSTANCE.getTransactionType_TransactionType();

		/**
		 * The meta object literal for the '<em><b>GL Posting Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__GL_POSTING_DATE = eINSTANCE.getTransactionType_GLPostingDate();

		/**
		 * The meta object literal for the '<em><b>Customer ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__CUSTOMER_ID = eINSTANCE.getTransactionType_CustomerID();

		/**
		 * The meta object literal for the '<em><b>Supplier ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__SUPPLIER_ID = eINSTANCE.getTransactionType_SupplierID();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__LINE = eINSTANCE.getTransactionType_Line();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType <em>Invoice Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceStatusType()
		 * @generated
		 */
		EEnum INVOICE_STATUS_TYPE = eINSTANCE.getInvoiceStatusType();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType <em>Invoice Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceTypeType()
		 * @generated
		 */
		EEnum INVOICE_TYPE_TYPE = eINSTANCE.getInvoiceTypeType();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType <em>Payment Mechanism Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getPaymentMechanismType()
		 * @generated
		 */
		EEnum PAYMENT_MECHANISM_TYPE = eINSTANCE.getPaymentMechanismType();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType <em>Product Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getProductTypeType()
		 * @generated
		 */
		EEnum PRODUCT_TYPE_TYPE = eINSTANCE.getProductTypeType();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType <em>Tax Accounting Basis Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxAccountingBasisType()
		 * @generated
		 */
		EEnum TAX_ACCOUNTING_BASIS_TYPE = eINSTANCE.getTaxAccountingBasisType();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType <em>Tax Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxTypeType()
		 * @generated
		 */
		EEnum TAX_TYPE_TYPE = eINSTANCE.getTaxTypeType();

		/**
		 * The meta object literal for the '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType <em>Transaction Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTransactionTypeType()
		 * @generated
		 */
		EEnum TRANSACTION_TYPE_TYPE = eINSTANCE.getTransactionTypeType();

		/**
		 * The meta object literal for the '<em>Account ID Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getAccountIDType()
		 * @generated
		 */
		EDataType ACCOUNT_ID_TYPE = eINSTANCE.getAccountIDType();

		/**
		 * The meta object literal for the '<em>Audit File Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getAuditFileVersionType()
		 * @generated
		 */
		EDataType AUDIT_FILE_VERSION_TYPE = eINSTANCE.getAuditFileVersionType();

		/**
		 * The meta object literal for the '<em>Company ID Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCompanyIDType()
		 * @generated
		 */
		EDataType COMPANY_ID_TYPE = eINSTANCE.getCompanyIDType();

		/**
		 * The meta object literal for the '<em>Country Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCountryType()
		 * @generated
		 */
		EDataType COUNTRY_TYPE = eINSTANCE.getCountryType();

		/**
		 * The meta object literal for the '<em>Currency Code Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getCurrencyCodeType()
		 * @generated
		 */
		EDataType CURRENCY_CODE_TYPE = eINSTANCE.getCurrencyCodeType();

		/**
		 * The meta object literal for the '<em>Fiscal Year Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getFiscalYearType()
		 * @generated
		 */
		EDataType FISCAL_YEAR_TYPE = eINSTANCE.getFiscalYearType();

		/**
		 * The meta object literal for the '<em>Invoice No Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceNoType()
		 * @generated
		 */
		EDataType INVOICE_NO_TYPE = eINSTANCE.getInvoiceNoType();

		/**
		 * The meta object literal for the '<em>Invoice Status Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceStatusTypeObject()
		 * @generated
		 */
		EDataType INVOICE_STATUS_TYPE_OBJECT = eINSTANCE.getInvoiceStatusTypeObject();

		/**
		 * The meta object literal for the '<em>Invoice Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getInvoiceTypeTypeObject()
		 * @generated
		 */
		EDataType INVOICE_TYPE_TYPE_OBJECT = eINSTANCE.getInvoiceTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Payment Mechanism Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getPaymentMechanismTypeObject()
		 * @generated
		 */
		EDataType PAYMENT_MECHANISM_TYPE_OBJECT = eINSTANCE.getPaymentMechanismTypeObject();

		/**
		 * The meta object literal for the '<em>Period Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getPeriodType()
		 * @generated
		 */
		EDataType PERIOD_TYPE = eINSTANCE.getPeriodType();

		/**
		 * The meta object literal for the '<em>Postal Code PT</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getPostalCodePT()
		 * @generated
		 */
		EDataType POSTAL_CODE_PT = eINSTANCE.getPostalCodePT();

		/**
		 * The meta object literal for the '<em>Product Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getProductTypeTypeObject()
		 * @generated
		 */
		EDataType PRODUCT_TYPE_TYPE_OBJECT = eINSTANCE.getProductTypeTypeObject();

		/**
		 * The meta object literal for the '<em>SA Fdate Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFdateTimeType()
		 * @generated
		 */
		EDataType SA_FDATE_TIME_TYPE = eINSTANCE.getSAFdateTimeType();

		/**
		 * The meta object literal for the '<em>SA Fdate Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFdateType()
		 * @generated
		 */
		EDataType SA_FDATE_TYPE = eINSTANCE.getSAFdateType();

		/**
		 * The meta object literal for the '<em>SA Fdecimal Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFdecimalType()
		 * @generated
		 */
		EDataType SA_FDECIMAL_TYPE = eINSTANCE.getSAFdecimalType();

		/**
		 * The meta object literal for the '<em>SA Fmonetary Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFmonetaryType()
		 * @generated
		 */
		EDataType SA_FMONETARY_TYPE = eINSTANCE.getSAFmonetaryType();

		/**
		 * The meta object literal for the '<em>SAFPT Accounting Period</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTAccountingPeriod()
		 * @generated
		 */
		EDataType SAFPT_ACCOUNTING_PERIOD = eINSTANCE.getSAFPTAccountingPeriod();

		/**
		 * The meta object literal for the '<em>SAFPT Currency Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTCurrencyCode()
		 * @generated
		 */
		EDataType SAFPT_CURRENCY_CODE = eINSTANCE.getSAFPTCurrencyCode();

		/**
		 * The meta object literal for the '<em>SAFPT Date Span</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTDateSpan()
		 * @generated
		 */
		EDataType SAFPT_DATE_SPAN = eINSTANCE.getSAFPTDateSpan();

		/**
		 * The meta object literal for the '<em>SAFPTGL Account ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTGLAccountID()
		 * @generated
		 */
		EDataType SAFPTGL_ACCOUNT_ID = eINSTANCE.getSAFPTGLAccountID();

		/**
		 * The meta object literal for the '<em>SAFPT Portuguese Vat Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTPortugueseVatNumber()
		 * @generated
		 */
		EDataType SAFPT_PORTUGUESE_VAT_NUMBER = eINSTANCE.getSAFPTPortugueseVatNumber();

		/**
		 * The meta object literal for the '<em>SAFPT Product ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTProductID()
		 * @generated
		 */
		EDataType SAFPT_PRODUCT_ID = eINSTANCE.getSAFPTProductID();

		/**
		 * The meta object literal for the '<em>SAFP Ttext Type Mandatory Max10 Car</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax10Car()
		 * @generated
		 */
		EDataType SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR = eINSTANCE.getSAFPTtextTypeMandatoryMax10Car();

		/**
		 * The meta object literal for the '<em>SAFP Ttext Type Mandatory Max200 Car</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax200Car()
		 * @generated
		 */
		EDataType SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR = eINSTANCE.getSAFPTtextTypeMandatoryMax200Car();

		/**
		 * The meta object literal for the '<em>SAFP Ttext Type Mandatory Max20 Car</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax20Car()
		 * @generated
		 */
		EDataType SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR = eINSTANCE.getSAFPTtextTypeMandatoryMax20Car();

		/**
		 * The meta object literal for the '<em>SAFP Ttext Type Mandatory Max255 Car</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax255Car()
		 * @generated
		 */
		EDataType SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR = eINSTANCE.getSAFPTtextTypeMandatoryMax255Car();

		/**
		 * The meta object literal for the '<em>SAFP Ttext Type Mandatory Max30 Car</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax30Car()
		 * @generated
		 */
		EDataType SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR = eINSTANCE.getSAFPTtextTypeMandatoryMax30Car();

		/**
		 * The meta object literal for the '<em>SAFP Ttext Type Mandatory Max3 Car</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax3Car()
		 * @generated
		 */
		EDataType SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR = eINSTANCE.getSAFPTtextTypeMandatoryMax3Car();

		/**
		 * The meta object literal for the '<em>SAFP Ttext Type Mandatory Max40 Car</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax40Car()
		 * @generated
		 */
		EDataType SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR = eINSTANCE.getSAFPTtextTypeMandatoryMax40Car();

		/**
		 * The meta object literal for the '<em>SAFP Ttext Type Mandatory Max50 Car</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax50Car()
		 * @generated
		 */
		EDataType SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR = eINSTANCE.getSAFPTtextTypeMandatoryMax50Car();

		/**
		 * The meta object literal for the '<em>SAFP Ttext Type Mandatory Max60 Car</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax60Car()
		 * @generated
		 */
		EDataType SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR = eINSTANCE.getSAFPTtextTypeMandatoryMax60Car();

		/**
		 * The meta object literal for the '<em>SAFP Ttext Type Mandatory Max70 Car</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMandatoryMax70Car()
		 * @generated
		 */
		EDataType SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR = eINSTANCE.getSAFPTtextTypeMandatoryMax70Car();

		/**
		 * The meta object literal for the '<em>SAFP Ttext Type Max40 Car</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTtextTypeMax40Car()
		 * @generated
		 */
		EDataType SAFP_TTEXT_TYPE_MAX40_CAR = eINSTANCE.getSAFPTtextTypeMax40Car();

		/**
		 * The meta object literal for the '<em>SAFPT Transaction ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSAFPTTransactionID()
		 * @generated
		 */
		EDataType SAFPT_TRANSACTION_ID = eINSTANCE.getSAFPTTransactionID();

		/**
		 * The meta object literal for the '<em>Self Billing Indicator Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSelfBillingIndicatorType()
		 * @generated
		 */
		EDataType SELF_BILLING_INDICATOR_TYPE = eINSTANCE.getSelfBillingIndicatorType();

		/**
		 * The meta object literal for the '<em>Supplier Country</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getSupplierCountry()
		 * @generated
		 */
		EDataType SUPPLIER_COUNTRY = eINSTANCE.getSupplierCountry();

		/**
		 * The meta object literal for the '<em>Tax Accounting Basis Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxAccountingBasisTypeObject()
		 * @generated
		 */
		EDataType TAX_ACCOUNTING_BASIS_TYPE_OBJECT = eINSTANCE.getTaxAccountingBasisTypeObject();

		/**
		 * The meta object literal for the '<em>Tax Code Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxCodeType()
		 * @generated
		 */
		EDataType TAX_CODE_TYPE = eINSTANCE.getTaxCodeType();

		/**
		 * The meta object literal for the '<em>Tax Country Region Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxCountryRegionType()
		 * @generated
		 */
		EDataType TAX_COUNTRY_REGION_TYPE = eINSTANCE.getTaxCountryRegionType();

		/**
		 * The meta object literal for the '<em>Tax Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTaxTypeTypeObject()
		 * @generated
		 */
		EDataType TAX_TYPE_TYPE_OBJECT = eINSTANCE.getTaxTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Transaction Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType
		 * @see oecd.standard.audit.file.tax.pt1_01_2.impl.Pt1_01_2PackageImpl#getTransactionTypeTypeObject()
		 * @generated
		 */
		EDataType TRANSACTION_TYPE_TYPE_OBJECT = eINSTANCE.getTransactionTypeTypeObject();

	}

} //Pt1_01_2Package
