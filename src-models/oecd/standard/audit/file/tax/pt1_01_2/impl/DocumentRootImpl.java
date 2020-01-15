/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.pt1_01_2.AddressStructure;
import oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT;
import oecd.standard.audit.file.tax.pt1_01_2.AuditFileType;
import oecd.standard.audit.file.tax.pt1_01_2.CreditNoteType;
import oecd.standard.audit.file.tax.pt1_01_2.CurrencyType;
import oecd.standard.audit.file.tax.pt1_01_2.CustomerType;
import oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot;
import oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType;
import oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType;
import oecd.standard.audit.file.tax.pt1_01_2.HeaderType;
import oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType;
import oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType;
import oecd.standard.audit.file.tax.pt1_01_2.OrderReferencesType;
import oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType;
import oecd.standard.audit.file.tax.pt1_01_2.ProductType;
import oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType;
import oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package;
import oecd.standard.audit.file.tax.pt1_01_2.ReferencesType;
import oecd.standard.audit.file.tax.pt1_01_2.SettlementType;
import oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure;
import oecd.standard.audit.file.tax.pt1_01_2.SourceDocumentsType;
import oecd.standard.audit.file.tax.pt1_01_2.SupplierType;
import oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType;
import oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType;
import oecd.standard.audit.file.tax.pt1_01_2.TaxTableType;
import oecd.standard.audit.file.tax.pt1_01_2.TaxType;
import oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType;
import oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getAccountDescription <em>Account Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getAddressDetail <em>Address Detail</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getAuditFile <em>Audit File</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getAuditFileVersion <em>Audit File Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getBillingAddress <em>Billing Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCity <em>City</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCompanyAddress <em>Company Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCreditAmount <em>Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCreditNote <em>Credit Note</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCurrencyCreditAmount <em>Currency Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCurrencyDebitAmount <em>Currency Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getCustomerTaxID <em>Customer Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getDebitAmount <em>Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getDeliveryID <em>Delivery ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getDocArchivalNumber <em>Doc Archival Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getFiscalYear <em>Fiscal Year</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getGeneralLedger <em>General Ledger</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getGeneralLedgerEntries <em>General Ledger Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getGLPostingDate <em>GL Posting Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getGrossTotal <em>Gross Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getHeaderComment <em>Header Comment</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getInvoiceNo <em>Invoice No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getInvoiceStatus <em>Invoice Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getJournalID <em>Journal ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getNetTotal <em>Net Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getNumberOfEntries <em>Number Of Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getOpeningCreditBalance <em>Opening Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getOpeningDebitBalance <em>Opening Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getOrderReferences <em>Order References</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getOriginatingON <em>Originating ON</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getPaymentMechanism <em>Payment Mechanism</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getProductCompanyTaxID <em>Product Company Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getProductDescription <em>Product Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getProductGroup <em>Product Group</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getProductNumberCode <em>Product Number Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getReferences <em>References</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getSelfBillingIndicator <em>Self Billing Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getSettlement <em>Settlement</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getShipFrom <em>Ship From</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getShipFromAddress <em>Ship From Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getShipToAddress <em>Ship To Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getSoftwareCertificateNumber <em>Software Certificate Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getSourceDocumentID <em>Source Document ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getSourceDocuments <em>Source Documents</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getSupplierID <em>Supplier ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getSupplierTaxID <em>Supplier Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTax <em>Tax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxAccountingBasis <em>Tax Accounting Basis</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxCode <em>Tax Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxCountryRegion <em>Tax Country Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxEntity <em>Tax Entity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxExemptionReason <em>Tax Exemption Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxExpirationDate <em>Tax Expiration Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxPayable <em>Tax Payable</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxPointDate <em>Tax Point Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxTable <em>Tax Table</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxTableEntry <em>Tax Table Entry</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxType <em>Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTaxVerificationDate <em>Tax Verification Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTotalCredit <em>Total Credit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTotalDebit <em>Total Debit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.DocumentRootImpl#getWebsite <em>Website</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAccountDescription() <em>Account Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAddressDetail() <em>Address Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_DETAIL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAuditFileVersion() <em>Audit File Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditFileVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String AUDIT_FILE_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBuildingNumber() <em>Building Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDING_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBusinessName() <em>Business Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCompanyID() <em>Company ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyID()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreditAmount() <em>Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CREDIT_AMOUNT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCurrencyCode() <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCurrencyCreditAmount() <em>Currency Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CURRENCY_CREDIT_AMOUNT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCurrencyDebitAmount() <em>Currency Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CURRENCY_DEBIT_AMOUNT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCustomerID() <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCustomerTaxID() <em>Customer Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerTaxID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_TAX_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_CREATED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDebitAmount() <em>Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DEBIT_AMOUNT_EDEFAULT = null;

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
	 * The default value of the '{@link #getDeliveryID() <em>Delivery ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryID()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDocArchivalNumber() <em>Doc Archival Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocArchivalNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_ARCHIVAL_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final String FAX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFiscalYear() <em>Fiscal Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalYear()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FISCAL_YEAR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGLPostingDate() <em>GL Posting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGLPostingDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GL_POSTING_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGrossTotal() <em>Gross Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal GROSS_TOTAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHash() <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHashControl() <em>Hash Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashControl()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_CONTROL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHeaderComment() <em>Header Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderComment()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_COMMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInvoiceDate() <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar INVOICE_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInvoiceNo() <em>Invoice No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceNo()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_NO_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInvoiceStatus() <em>Invoice Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceStatus()
	 * @generated
	 * @ordered
	 */
	protected static final InvoiceStatusType INVOICE_STATUS_EDEFAULT = InvoiceStatusType.N;

	/**
	 * The default value of the '{@link #getInvoiceType() <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceType()
	 * @generated
	 * @ordered
	 */
	protected static final InvoiceTypeType INVOICE_TYPE_EDEFAULT = InvoiceTypeType.FT;

	/**
	 * The default value of the '{@link #getJournalID() <em>Journal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalID()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNAL_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LINE_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNetTotal() <em>Net Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal NET_TOTAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNumberOfEntries() <em>Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEntries()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_ENTRIES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOpeningCreditBalance() <em>Opening Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningCreditBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OPENING_CREDIT_BALANCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOpeningDebitBalance() <em>Opening Debit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningDebitBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OPENING_DEBIT_BALANCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ORDER_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOriginatingON() <em>Originating ON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingON()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINATING_ON_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPaymentMechanism() <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentMechanismType PAYMENT_MECHANISM_EDEFAULT = PaymentMechanismType.NU;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PERIOD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProductCode() <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProductCompanyTaxID() <em>Product Company Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCompanyTaxID()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_COMPANY_TAX_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProductDescription() <em>Product Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProductGroup() <em>Product Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProductNumberCode() <em>Product Number Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductNumberCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NUMBER_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProductType() <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductType()
	 * @generated
	 * @ordered
	 */
	protected static final ProductTypeType PRODUCT_TYPE_EDEFAULT = ProductTypeType.P;

	/**
	 * The default value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRecordID() <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordID()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSelfBillingIndicator() <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfBillingIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SELF_BILLING_INDICATOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSettlementAmount() <em>Settlement Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SETTLEMENT_AMOUNT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSoftwareCertificateNumber() <em>Software Certificate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareCertificateNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSourceDocumentID() <em>Source Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocumentID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DOCUMENT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSourceID() <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStreetName() <em>Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetName()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSupplierID() <em>Supplier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierID()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSupplierTaxID() <em>Supplier Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierTaxID()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_TAX_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSystemEntryDate() <em>System Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemEntryDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SYSTEM_ENTRY_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTaxAccountingBasis() <em>Tax Accounting Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAccountingBasis()
	 * @generated
	 * @ordered
	 */
	protected static final TaxAccountingBasisType TAX_ACCOUNTING_BASIS_EDEFAULT = TaxAccountingBasisType.C;

	/**
	 * The default value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_AMOUNT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTaxCode() <em>Tax Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCode()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTaxCountryRegion() <em>Tax Country Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCountryRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_COUNTRY_REGION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTaxEntity() <em>Tax Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_ENTITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTaxExemptionReason() <em>Tax Exemption Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExemptionReason()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_EXEMPTION_REASON_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTaxExpirationDate() <em>Tax Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TAX_EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTaxPayable() <em>Tax Payable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPayable()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_PAYABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTaxPercentage() <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_PERCENTAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTaxPointDate() <em>Tax Point Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPointDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TAX_POINT_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTaxType() <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxType()
	 * @generated
	 * @ordered
	 */
	protected static final TaxTypeType TAX_TYPE_EDEFAULT = TaxTypeType.IVA;

	/**
	 * The default value of the '{@link #getTaxVerificationDate() <em>Tax Verification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxVerificationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TAX_VERIFICATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTotalCredit() <em>Total Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredit()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_CREDIT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTotalDebit() <em>Total Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDebit()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_DEBIT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TRANSACTION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransactionID() <em>Transaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionID()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransactionType() <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected static final TransactionTypeType TRANSACTION_TYPE_EDEFAULT = TransactionTypeType.N;

	/**
	 * The default value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_OF_MEASURE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNIT_PRICE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01_2Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Pt1_01_2Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Pt1_01_2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Pt1_01_2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountDescription() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ACCOUNT_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountDescription(String newAccountDescription) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ACCOUNT_DESCRIPTION, newAccountDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountID(String newAccountID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ACCOUNT_ID, newAccountID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getAddress() {
		return (AddressStructure)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressStructure newAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ADDRESS, newAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(AddressStructure newAddress) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressDetail() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ADDRESS_DETAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressDetail(String newAddressDetail) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ADDRESS_DETAIL, newAddressDetail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditFileType getAuditFile() {
		return (AuditFileType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__AUDIT_FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditFile(AuditFileType newAuditFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__AUDIT_FILE, newAuditFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditFile(AuditFileType newAuditFile) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__AUDIT_FILE, newAuditFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuditFileVersion() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__AUDIT_FILE_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditFileVersion(String newAuditFileVersion) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__AUDIT_FILE_VERSION, newAuditFileVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getBillingAddress() {
		return (AddressStructure)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__BILLING_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillingAddress(AddressStructure newBillingAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__BILLING_ADDRESS, newBillingAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingAddress(AddressStructure newBillingAddress) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__BILLING_ADDRESS, newBillingAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildingNumber() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__BUILDING_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingNumber(String newBuildingNumber) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__BUILDING_NUMBER, newBuildingNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessName() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__BUSINESS_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessName(String newBusinessName) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__BUSINESS_NAME, newBusinessName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructurePT getCompanyAddress() {
		return (AddressStructurePT)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__COMPANY_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompanyAddress(AddressStructurePT newCompanyAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__COMPANY_ADDRESS, newCompanyAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyAddress(AddressStructurePT newCompanyAddress) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__COMPANY_ADDRESS, newCompanyAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__COMPANY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyID(String newCompanyID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__COMPANY_ID, newCompanyID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyName() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__COMPANY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyName(String newCompanyName) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__COMPANY_NAME, newCompanyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContact() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CONTACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact(String newContact) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CONTACT, newContact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__COUNTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__COUNTRY, newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCreditAmount() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CREDIT_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditAmount(BigDecimal newCreditAmount) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CREDIT_AMOUNT, newCreditAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditNoteType getCreditNote() {
		return (CreditNoteType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CREDIT_NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreditNote(CreditNoteType newCreditNote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CREDIT_NOTE, newCreditNote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditNote(CreditNoteType newCreditNote) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CREDIT_NOTE, newCreditNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyType getCurrency() {
		return (CurrencyType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CURRENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrency(CurrencyType newCurrency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CURRENCY, newCurrency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(CurrencyType newCurrency) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CURRENCY, newCurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrencyCode() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CURRENCY_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyCode(String newCurrencyCode) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CURRENCY_CODE, newCurrencyCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCurrencyCreditAmount() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CURRENCY_CREDIT_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyCreditAmount(BigDecimal newCurrencyCreditAmount) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CURRENCY_CREDIT_AMOUNT, newCurrencyCreditAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCurrencyDebitAmount() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CURRENCY_DEBIT_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyDebitAmount(BigDecimal newCurrencyDebitAmount) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CURRENCY_DEBIT_AMOUNT, newCurrencyDebitAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerType getCustomer() {
		return (CustomerType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CUSTOMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(CustomerType newCustomer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CUSTOMER, newCustomer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(CustomerType newCustomer) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CUSTOMER, newCustomer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CUSTOMER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerID(String newCustomerID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CUSTOMER_ID, newCustomerID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerTaxID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CUSTOMER_TAX_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerTaxID(String newCustomerTaxID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__CUSTOMER_TAX_ID, newCustomerTaxID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateCreated() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DATE_CREATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCreated(XMLGregorianCalendar newDateCreated) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DATE_CREATED, newDateCreated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDebitAmount() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DEBIT_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebitAmount(BigDecimal newDebitAmount) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DEBIT_AMOUNT, newDebitAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDeliveryDate() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DELIVERY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(XMLGregorianCalendar newDeliveryDate) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DELIVERY_DATE, newDeliveryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeliveryID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DELIVERY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryID(String newDeliveryID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DELIVERY_ID, newDeliveryID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocArchivalNumber() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocArchivalNumber(String newDocArchivalNumber) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER, newDocArchivalNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__EMAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__EMAIL, newEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEndDate() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__END_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(XMLGregorianCalendar newEndDate) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__END_DATE, newEndDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFax() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__FAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(String newFax) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__FAX, newFax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFiscalYear() {
		return (BigInteger)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__FISCAL_YEAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiscalYear(BigInteger newFiscalYear) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__FISCAL_YEAR, newFiscalYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLedgerType getGeneralLedger() {
		return (GeneralLedgerType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__GENERAL_LEDGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralLedger(GeneralLedgerType newGeneralLedger, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__GENERAL_LEDGER, newGeneralLedger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralLedger(GeneralLedgerType newGeneralLedger) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__GENERAL_LEDGER, newGeneralLedger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLedgerEntriesType getGeneralLedgerEntries() {
		return (GeneralLedgerEntriesType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralLedgerEntries(GeneralLedgerEntriesType newGeneralLedgerEntries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES, newGeneralLedgerEntries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralLedgerEntries(GeneralLedgerEntriesType newGeneralLedgerEntries) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES, newGeneralLedgerEntries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGLPostingDate() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__GL_POSTING_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGLPostingDate(XMLGregorianCalendar newGLPostingDate) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__GL_POSTING_DATE, newGLPostingDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getGrossTotal() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__GROSS_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrossTotal(BigDecimal newGrossTotal) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__GROSS_TOTAL, newGrossTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHash() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__HASH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(String newHash) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__HASH, newHash);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHashControl() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__HASH_CONTROL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashControl(String newHashControl) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__HASH_CONTROL, newHashControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType getHeader() {
		return (HeaderType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__HEADER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderType newHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__HEADER, newHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HeaderType newHeader) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderComment() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__HEADER_COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderComment(String newHeaderComment) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__HEADER_COMMENT, newHeaderComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getInvoiceDate() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__INVOICE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceDate(XMLGregorianCalendar newInvoiceDate) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__INVOICE_DATE, newInvoiceDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvoiceNo() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__INVOICE_NO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceNo(String newInvoiceNo) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__INVOICE_NO, newInvoiceNo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceStatusType getInvoiceStatus() {
		return (InvoiceStatusType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__INVOICE_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceStatus(InvoiceStatusType newInvoiceStatus) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__INVOICE_STATUS, newInvoiceStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceTypeType getInvoiceType() {
		return (InvoiceTypeType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__INVOICE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceType(InvoiceTypeType newInvoiceType) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__INVOICE_TYPE, newInvoiceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJournalID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__JOURNAL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJournalID(String newJournalID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__JOURNAL_ID, newJournalID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLineNumber() {
		return (BigInteger)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__LINE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNumber(BigInteger newLineNumber) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__LINE_NUMBER, newLineNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getNetTotal() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__NET_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetTotal(BigDecimal newNetTotal) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__NET_TOTAL, newNetTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfEntries() {
		return (BigInteger)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__NUMBER_OF_ENTRIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfEntries(BigInteger newNumberOfEntries) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__NUMBER_OF_ENTRIES, newNumberOfEntries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOpeningCreditBalance() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__OPENING_CREDIT_BALANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpeningCreditBalance(BigDecimal newOpeningCreditBalance) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__OPENING_CREDIT_BALANCE, newOpeningCreditBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOpeningDebitBalance() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__OPENING_DEBIT_BALANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpeningDebitBalance(BigDecimal newOpeningDebitBalance) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__OPENING_DEBIT_BALANCE, newOpeningDebitBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getOrderDate() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ORDER_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderDate(XMLGregorianCalendar newOrderDate) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ORDER_DATE, newOrderDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderReferencesType getOrderReferences() {
		return (OrderReferencesType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ORDER_REFERENCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderReferences(OrderReferencesType newOrderReferences, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ORDER_REFERENCES, newOrderReferences, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderReferences(OrderReferencesType newOrderReferences) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ORDER_REFERENCES, newOrderReferences);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginatingON() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ORIGINATING_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginatingON(String newOriginatingON) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__ORIGINATING_ON, newOriginatingON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMechanismType getPaymentMechanism() {
		return (PaymentMechanismType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PAYMENT_MECHANISM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentMechanism(PaymentMechanismType newPaymentMechanism) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PAYMENT_MECHANISM, newPaymentMechanism);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPeriod() {
		return (BigInteger)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PERIOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(BigInteger newPeriod) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PERIOD, newPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__POSTAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__POSTAL_CODE, newPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType getProduct() {
		return (ProductType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(ProductType newProduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT, newProduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(ProductType newProduct) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductCode() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductCode(String newProductCode) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_CODE, newProductCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductCompanyTaxID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductCompanyTaxID(String newProductCompanyTaxID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID, newProductCompanyTaxID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductDescription() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDescription(String newProductDescription) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_DESCRIPTION, newProductDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductGroup() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductGroup(String newProductGroup) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_GROUP, newProductGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductID(String newProductID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_ID, newProductID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductNumberCode() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_NUMBER_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductNumberCode(String newProductNumberCode) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_NUMBER_CODE, newProductNumberCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTypeType getProductType() {
		return (ProductTypeType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductType(ProductTypeType newProductType) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_TYPE, newProductType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductVersion() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVersion(String newProductVersion) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__PRODUCT_VERSION, newProductVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getQuantity() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(BigDecimal newQuantity) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__REASON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__REASON, newReason);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecordID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__RECORD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordID(String newRecordID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__RECORD_ID, newRecordID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__REFERENCE, newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesType getReferences() {
		return (ReferencesType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__REFERENCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferences(ReferencesType newReferences, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__REFERENCES, newReferences, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(ReferencesType newReferences) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__REFERENCES, newReferences);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__REGION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__REGION, newRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSelfBillingIndicator() {
		return (BigInteger)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SELF_BILLING_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfBillingIndicator(BigInteger newSelfBillingIndicator) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SELF_BILLING_INDICATOR, newSelfBillingIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettlementType getSettlement() {
		return (SettlementType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SETTLEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettlement(SettlementType newSettlement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SETTLEMENT, newSettlement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettlement(SettlementType newSettlement) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SETTLEMENT, newSettlement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSettlementAmount() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SETTLEMENT_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettlementAmount(BigDecimal newSettlementAmount) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SETTLEMENT_AMOUNT, newSettlementAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShippingPointStructure getShipFrom() {
		return (ShippingPointStructure)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipFrom(ShippingPointStructure newShipFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_FROM, newShipFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipFrom(ShippingPointStructure newShipFrom) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_FROM, newShipFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getShipFromAddress() {
		return (AddressStructure)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_FROM_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipFromAddress(AddressStructure newShipFromAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_FROM_ADDRESS, newShipFromAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipFromAddress(AddressStructure newShipFromAddress) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_FROM_ADDRESS, newShipFromAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShippingPointStructure getShipTo() {
		return (ShippingPointStructure)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipTo(ShippingPointStructure newShipTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_TO, newShipTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipTo(ShippingPointStructure newShipTo) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_TO, newShipTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getShipToAddress() {
		return (AddressStructure)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_TO_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipToAddress(AddressStructure newShipToAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_TO_ADDRESS, newShipToAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipToAddress(AddressStructure newShipToAddress) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SHIP_TO_ADDRESS, newShipToAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoftwareCertificateNumber() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareCertificateNumber(String newSoftwareCertificateNumber) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER, newSoftwareCertificateNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDocumentID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SOURCE_DOCUMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDocumentID(String newSourceDocumentID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SOURCE_DOCUMENT_ID, newSourceDocumentID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentsType getSourceDocuments() {
		return (SourceDocumentsType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SOURCE_DOCUMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceDocuments(SourceDocumentsType newSourceDocuments, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SOURCE_DOCUMENTS, newSourceDocuments, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDocuments(SourceDocumentsType newSourceDocuments) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SOURCE_DOCUMENTS, newSourceDocuments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceID(String newSourceID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SOURCE_ID, newSourceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartDate() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(XMLGregorianCalendar newStartDate) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreetName() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__STREET_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetName(String newStreetName) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__STREET_NAME, newStreetName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierType getSupplier() {
		return (SupplierType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SUPPLIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(SupplierType newSupplier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SUPPLIER, newSupplier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(SupplierType newSupplier) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SUPPLIER, newSupplier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplierID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SUPPLIER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierID(String newSupplierID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SUPPLIER_ID, newSupplierID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplierTaxID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SUPPLIER_TAX_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierTaxID(String newSupplierTaxID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SUPPLIER_TAX_ID, newSupplierTaxID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getSystemEntryDate() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SYSTEM_ENTRY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemEntryDate(XMLGregorianCalendar newSystemEntryDate) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__SYSTEM_ENTRY_DATE, newSystemEntryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxType getTax() {
		return (TaxType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTax(TaxType newTax, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX, newTax, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTax(TaxType newTax) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX, newTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxAccountingBasisType getTaxAccountingBasis() {
		return (TaxAccountingBasisType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxAccountingBasis(TaxAccountingBasisType newTaxAccountingBasis) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS, newTaxAccountingBasis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxAmount() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxAmount(BigDecimal newTaxAmount) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_AMOUNT, newTaxAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxCode() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxCode(String newTaxCode) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_CODE, newTaxCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxCountryRegion() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_COUNTRY_REGION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxCountryRegion(String newTaxCountryRegion) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_COUNTRY_REGION, newTaxCountryRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxEntity() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxEntity(String newTaxEntity) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_ENTITY, newTaxEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxExemptionReason() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_EXEMPTION_REASON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxExemptionReason(String newTaxExemptionReason) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_EXEMPTION_REASON, newTaxExemptionReason);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTaxExpirationDate() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_EXPIRATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxExpirationDate(XMLGregorianCalendar newTaxExpirationDate) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_EXPIRATION_DATE, newTaxExpirationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxPayable() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_PAYABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxPayable(BigDecimal newTaxPayable) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_PAYABLE, newTaxPayable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxPercentage() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_PERCENTAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxPercentage(BigDecimal newTaxPercentage) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_PERCENTAGE, newTaxPercentage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTaxPointDate() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_POINT_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxPointDate(XMLGregorianCalendar newTaxPointDate) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_POINT_DATE, newTaxPointDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTableType getTaxTable() {
		return (TaxTableType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaxTable(TaxTableType newTaxTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_TABLE, newTaxTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxTable(TaxTableType newTaxTable) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_TABLE, newTaxTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTableEntryType getTaxTableEntry() {
		return (TaxTableEntryType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_TABLE_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaxTableEntry(TaxTableEntryType newTaxTableEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_TABLE_ENTRY, newTaxTableEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxTableEntry(TaxTableEntryType newTaxTableEntry) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_TABLE_ENTRY, newTaxTableEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTypeType getTaxType() {
		return (TaxTypeType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxType(TaxTypeType newTaxType) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_TYPE, newTaxType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTaxVerificationDate() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_VERIFICATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxVerificationDate(XMLGregorianCalendar newTaxVerificationDate) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TAX_VERIFICATION_DATE, newTaxVerificationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelephone() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TELEPHONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephone(String newTelephone) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TELEPHONE, newTelephone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTotalCredit() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TOTAL_CREDIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCredit(BigDecimal newTotalCredit) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TOTAL_CREDIT, newTotalCredit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTotalDebit() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TOTAL_DEBIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDebit(BigDecimal newTotalDebit) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TOTAL_DEBIT, newTotalDebit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTransactionDate() {
		return (XMLGregorianCalendar)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TRANSACTION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionDate(XMLGregorianCalendar newTransactionDate) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TRANSACTION_DATE, newTransactionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionID() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TRANSACTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionID(String newTransactionID) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TRANSACTION_ID, newTransactionID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType getTransactionType() {
		return (TransactionTypeType)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TRANSACTION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionType(TransactionTypeType newTransactionType) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__TRANSACTION_TYPE, newTransactionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitOfMeasure() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__UNIT_OF_MEASURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitOfMeasure(String newUnitOfMeasure) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__UNIT_OF_MEASURE, newUnitOfMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getUnitPrice() {
		return (BigDecimal)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__UNIT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(BigDecimal newUnitPrice) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__UNIT_PRICE, newUnitPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsite() {
		return (String)getMixed().get(Pt1_01_2Package.Literals.DOCUMENT_ROOT__WEBSITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsite(String newWebsite) {
		((FeatureMap.Internal)getMixed()).set(Pt1_01_2Package.Literals.DOCUMENT_ROOT__WEBSITE, newWebsite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pt1_01_2Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__ADDRESS:
				return basicSetAddress(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__AUDIT_FILE:
				return basicSetAuditFile(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__BILLING_ADDRESS:
				return basicSetBillingAddress(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_ADDRESS:
				return basicSetCompanyAddress(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__CREDIT_NOTE:
				return basicSetCreditNote(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY:
				return basicSetCurrency(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__GENERAL_LEDGER:
				return basicSetGeneralLedger(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES:
				return basicSetGeneralLedgerEntries(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__HEADER:
				return basicSetHeader(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__ORDER_REFERENCES:
				return basicSetOrderReferences(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT:
				return basicSetProduct(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__REFERENCES:
				return basicSetReferences(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__SETTLEMENT:
				return basicSetSettlement(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_FROM:
				return basicSetShipFrom(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_FROM_ADDRESS:
				return basicSetShipFromAddress(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_TO:
				return basicSetShipTo(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_TO_ADDRESS:
				return basicSetShipToAddress(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_DOCUMENTS:
				return basicSetSourceDocuments(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX:
				return basicSetTax(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TABLE:
				return basicSetTaxTable(null, msgs);
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TABLE_ENTRY:
				return basicSetTaxTableEntry(null, msgs);
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
			case Pt1_01_2Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Pt1_01_2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Pt1_01_2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Pt1_01_2Package.DOCUMENT_ROOT__ACCOUNT_DESCRIPTION:
				return getAccountDescription();
			case Pt1_01_2Package.DOCUMENT_ROOT__ACCOUNT_ID:
				return getAccountID();
			case Pt1_01_2Package.DOCUMENT_ROOT__ADDRESS:
				return getAddress();
			case Pt1_01_2Package.DOCUMENT_ROOT__ADDRESS_DETAIL:
				return getAddressDetail();
			case Pt1_01_2Package.DOCUMENT_ROOT__AUDIT_FILE:
				return getAuditFile();
			case Pt1_01_2Package.DOCUMENT_ROOT__AUDIT_FILE_VERSION:
				return getAuditFileVersion();
			case Pt1_01_2Package.DOCUMENT_ROOT__BILLING_ADDRESS:
				return getBillingAddress();
			case Pt1_01_2Package.DOCUMENT_ROOT__BUILDING_NUMBER:
				return getBuildingNumber();
			case Pt1_01_2Package.DOCUMENT_ROOT__BUSINESS_NAME:
				return getBusinessName();
			case Pt1_01_2Package.DOCUMENT_ROOT__CITY:
				return getCity();
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_ADDRESS:
				return getCompanyAddress();
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_ID:
				return getCompanyID();
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_NAME:
				return getCompanyName();
			case Pt1_01_2Package.DOCUMENT_ROOT__CONTACT:
				return getContact();
			case Pt1_01_2Package.DOCUMENT_ROOT__COUNTRY:
				return getCountry();
			case Pt1_01_2Package.DOCUMENT_ROOT__CREDIT_AMOUNT:
				return getCreditAmount();
			case Pt1_01_2Package.DOCUMENT_ROOT__CREDIT_NOTE:
				return getCreditNote();
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY:
				return getCurrency();
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_CODE:
				return getCurrencyCode();
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_CREDIT_AMOUNT:
				return getCurrencyCreditAmount();
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_DEBIT_AMOUNT:
				return getCurrencyDebitAmount();
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER:
				return getCustomer();
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER_ID:
				return getCustomerID();
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER_TAX_ID:
				return getCustomerTaxID();
			case Pt1_01_2Package.DOCUMENT_ROOT__DATE_CREATED:
				return getDateCreated();
			case Pt1_01_2Package.DOCUMENT_ROOT__DEBIT_AMOUNT:
				return getDebitAmount();
			case Pt1_01_2Package.DOCUMENT_ROOT__DELIVERY_DATE:
				return getDeliveryDate();
			case Pt1_01_2Package.DOCUMENT_ROOT__DELIVERY_ID:
				return getDeliveryID();
			case Pt1_01_2Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case Pt1_01_2Package.DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER:
				return getDocArchivalNumber();
			case Pt1_01_2Package.DOCUMENT_ROOT__EMAIL:
				return getEmail();
			case Pt1_01_2Package.DOCUMENT_ROOT__END_DATE:
				return getEndDate();
			case Pt1_01_2Package.DOCUMENT_ROOT__FAX:
				return getFax();
			case Pt1_01_2Package.DOCUMENT_ROOT__FISCAL_YEAR:
				return getFiscalYear();
			case Pt1_01_2Package.DOCUMENT_ROOT__GENERAL_LEDGER:
				return getGeneralLedger();
			case Pt1_01_2Package.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES:
				return getGeneralLedgerEntries();
			case Pt1_01_2Package.DOCUMENT_ROOT__GL_POSTING_DATE:
				return getGLPostingDate();
			case Pt1_01_2Package.DOCUMENT_ROOT__GROSS_TOTAL:
				return getGrossTotal();
			case Pt1_01_2Package.DOCUMENT_ROOT__HASH:
				return getHash();
			case Pt1_01_2Package.DOCUMENT_ROOT__HASH_CONTROL:
				return getHashControl();
			case Pt1_01_2Package.DOCUMENT_ROOT__HEADER:
				return getHeader();
			case Pt1_01_2Package.DOCUMENT_ROOT__HEADER_COMMENT:
				return getHeaderComment();
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_DATE:
				return getInvoiceDate();
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_NO:
				return getInvoiceNo();
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_STATUS:
				return getInvoiceStatus();
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_TYPE:
				return getInvoiceType();
			case Pt1_01_2Package.DOCUMENT_ROOT__JOURNAL_ID:
				return getJournalID();
			case Pt1_01_2Package.DOCUMENT_ROOT__LINE_NUMBER:
				return getLineNumber();
			case Pt1_01_2Package.DOCUMENT_ROOT__NET_TOTAL:
				return getNetTotal();
			case Pt1_01_2Package.DOCUMENT_ROOT__NUMBER_OF_ENTRIES:
				return getNumberOfEntries();
			case Pt1_01_2Package.DOCUMENT_ROOT__OPENING_CREDIT_BALANCE:
				return getOpeningCreditBalance();
			case Pt1_01_2Package.DOCUMENT_ROOT__OPENING_DEBIT_BALANCE:
				return getOpeningDebitBalance();
			case Pt1_01_2Package.DOCUMENT_ROOT__ORDER_DATE:
				return getOrderDate();
			case Pt1_01_2Package.DOCUMENT_ROOT__ORDER_REFERENCES:
				return getOrderReferences();
			case Pt1_01_2Package.DOCUMENT_ROOT__ORIGINATING_ON:
				return getOriginatingON();
			case Pt1_01_2Package.DOCUMENT_ROOT__PAYMENT_MECHANISM:
				return getPaymentMechanism();
			case Pt1_01_2Package.DOCUMENT_ROOT__PERIOD:
				return getPeriod();
			case Pt1_01_2Package.DOCUMENT_ROOT__POSTAL_CODE:
				return getPostalCode();
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT:
				return getProduct();
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_CODE:
				return getProductCode();
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID:
				return getProductCompanyTaxID();
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_DESCRIPTION:
				return getProductDescription();
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_GROUP:
				return getProductGroup();
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_ID:
				return getProductID();
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_NUMBER_CODE:
				return getProductNumberCode();
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_TYPE:
				return getProductType();
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_VERSION:
				return getProductVersion();
			case Pt1_01_2Package.DOCUMENT_ROOT__QUANTITY:
				return getQuantity();
			case Pt1_01_2Package.DOCUMENT_ROOT__REASON:
				return getReason();
			case Pt1_01_2Package.DOCUMENT_ROOT__RECORD_ID:
				return getRecordID();
			case Pt1_01_2Package.DOCUMENT_ROOT__REFERENCE:
				return getReference();
			case Pt1_01_2Package.DOCUMENT_ROOT__REFERENCES:
				return getReferences();
			case Pt1_01_2Package.DOCUMENT_ROOT__REGION:
				return getRegion();
			case Pt1_01_2Package.DOCUMENT_ROOT__SELF_BILLING_INDICATOR:
				return getSelfBillingIndicator();
			case Pt1_01_2Package.DOCUMENT_ROOT__SETTLEMENT:
				return getSettlement();
			case Pt1_01_2Package.DOCUMENT_ROOT__SETTLEMENT_AMOUNT:
				return getSettlementAmount();
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_FROM:
				return getShipFrom();
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_FROM_ADDRESS:
				return getShipFromAddress();
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_TO:
				return getShipTo();
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_TO_ADDRESS:
				return getShipToAddress();
			case Pt1_01_2Package.DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER:
				return getSoftwareCertificateNumber();
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_DOCUMENT_ID:
				return getSourceDocumentID();
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_DOCUMENTS:
				return getSourceDocuments();
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_ID:
				return getSourceID();
			case Pt1_01_2Package.DOCUMENT_ROOT__START_DATE:
				return getStartDate();
			case Pt1_01_2Package.DOCUMENT_ROOT__STREET_NAME:
				return getStreetName();
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER:
				return getSupplier();
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER_ID:
				return getSupplierID();
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER_TAX_ID:
				return getSupplierTaxID();
			case Pt1_01_2Package.DOCUMENT_ROOT__SYSTEM_ENTRY_DATE:
				return getSystemEntryDate();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX:
				return getTax();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS:
				return getTaxAccountingBasis();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_AMOUNT:
				return getTaxAmount();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_CODE:
				return getTaxCode();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_COUNTRY_REGION:
				return getTaxCountryRegion();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_ENTITY:
				return getTaxEntity();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_EXEMPTION_REASON:
				return getTaxExemptionReason();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_EXPIRATION_DATE:
				return getTaxExpirationDate();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_PAYABLE:
				return getTaxPayable();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_PERCENTAGE:
				return getTaxPercentage();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_POINT_DATE:
				return getTaxPointDate();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TABLE:
				return getTaxTable();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TABLE_ENTRY:
				return getTaxTableEntry();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TYPE:
				return getTaxType();
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_VERIFICATION_DATE:
				return getTaxVerificationDate();
			case Pt1_01_2Package.DOCUMENT_ROOT__TELEPHONE:
				return getTelephone();
			case Pt1_01_2Package.DOCUMENT_ROOT__TOTAL_CREDIT:
				return getTotalCredit();
			case Pt1_01_2Package.DOCUMENT_ROOT__TOTAL_DEBIT:
				return getTotalDebit();
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_DATE:
				return getTransactionDate();
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_ID:
				return getTransactionID();
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				return getTransactionType();
			case Pt1_01_2Package.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case Pt1_01_2Package.DOCUMENT_ROOT__UNIT_PRICE:
				return getUnitPrice();
			case Pt1_01_2Package.DOCUMENT_ROOT__WEBSITE:
				return getWebsite();
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
			case Pt1_01_2Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ACCOUNT_DESCRIPTION:
				setAccountDescription((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ACCOUNT_ID:
				setAccountID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressStructure)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ADDRESS_DETAIL:
				setAddressDetail((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__AUDIT_FILE:
				setAuditFile((AuditFileType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__AUDIT_FILE_VERSION:
				setAuditFileVersion((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__BILLING_ADDRESS:
				setBillingAddress((AddressStructure)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__BUILDING_NUMBER:
				setBuildingNumber((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__BUSINESS_NAME:
				setBusinessName((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CITY:
				setCity((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_ADDRESS:
				setCompanyAddress((AddressStructurePT)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_ID:
				setCompanyID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_NAME:
				setCompanyName((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CONTACT:
				setContact((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__COUNTRY:
				setCountry((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CREDIT_AMOUNT:
				setCreditAmount((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CREDIT_NOTE:
				setCreditNote((CreditNoteType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY:
				setCurrency((CurrencyType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_CODE:
				setCurrencyCode((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_CREDIT_AMOUNT:
				setCurrencyCreditAmount((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_DEBIT_AMOUNT:
				setCurrencyDebitAmount((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER:
				setCustomer((CustomerType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER_ID:
				setCustomerID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER_TAX_ID:
				setCustomerTaxID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DATE_CREATED:
				setDateCreated((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DEBIT_AMOUNT:
				setDebitAmount((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DELIVERY_DATE:
				setDeliveryDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DELIVERY_ID:
				setDeliveryID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER:
				setDocArchivalNumber((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__EMAIL:
				setEmail((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__END_DATE:
				setEndDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__FAX:
				setFax((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__FISCAL_YEAR:
				setFiscalYear((BigInteger)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__GENERAL_LEDGER:
				setGeneralLedger((GeneralLedgerType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES:
				setGeneralLedgerEntries((GeneralLedgerEntriesType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__GL_POSTING_DATE:
				setGLPostingDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__GROSS_TOTAL:
				setGrossTotal((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__HASH:
				setHash((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__HASH_CONTROL:
				setHashControl((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__HEADER_COMMENT:
				setHeaderComment((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_DATE:
				setInvoiceDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_NO:
				setInvoiceNo((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_STATUS:
				setInvoiceStatus((InvoiceStatusType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_TYPE:
				setInvoiceType((InvoiceTypeType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__JOURNAL_ID:
				setJournalID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__LINE_NUMBER:
				setLineNumber((BigInteger)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__NET_TOTAL:
				setNetTotal((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__NUMBER_OF_ENTRIES:
				setNumberOfEntries((BigInteger)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__OPENING_CREDIT_BALANCE:
				setOpeningCreditBalance((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__OPENING_DEBIT_BALANCE:
				setOpeningDebitBalance((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ORDER_DATE:
				setOrderDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ORDER_REFERENCES:
				setOrderReferences((OrderReferencesType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ORIGINATING_ON:
				setOriginatingON((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PAYMENT_MECHANISM:
				setPaymentMechanism((PaymentMechanismType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PERIOD:
				setPeriod((BigInteger)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT:
				setProduct((ProductType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_CODE:
				setProductCode((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID:
				setProductCompanyTaxID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_DESCRIPTION:
				setProductDescription((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_GROUP:
				setProductGroup((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_ID:
				setProductID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_NUMBER_CODE:
				setProductNumberCode((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_TYPE:
				setProductType((ProductTypeType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_VERSION:
				setProductVersion((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__REASON:
				setReason((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__RECORD_ID:
				setRecordID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__REFERENCE:
				setReference((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__REFERENCES:
				setReferences((ReferencesType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__REGION:
				setRegion((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SELF_BILLING_INDICATOR:
				setSelfBillingIndicator((BigInteger)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SETTLEMENT:
				setSettlement((SettlementType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SETTLEMENT_AMOUNT:
				setSettlementAmount((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_FROM:
				setShipFrom((ShippingPointStructure)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_FROM_ADDRESS:
				setShipFromAddress((AddressStructure)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_TO:
				setShipTo((ShippingPointStructure)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_TO_ADDRESS:
				setShipToAddress((AddressStructure)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER:
				setSoftwareCertificateNumber((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_DOCUMENT_ID:
				setSourceDocumentID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_DOCUMENTS:
				setSourceDocuments((SourceDocumentsType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__START_DATE:
				setStartDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__STREET_NAME:
				setStreetName((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER:
				setSupplier((SupplierType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER_ID:
				setSupplierID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER_TAX_ID:
				setSupplierTaxID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SYSTEM_ENTRY_DATE:
				setSystemEntryDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX:
				setTax((TaxType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS:
				setTaxAccountingBasis((TaxAccountingBasisType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_AMOUNT:
				setTaxAmount((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_CODE:
				setTaxCode((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_COUNTRY_REGION:
				setTaxCountryRegion((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_ENTITY:
				setTaxEntity((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_EXEMPTION_REASON:
				setTaxExemptionReason((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_EXPIRATION_DATE:
				setTaxExpirationDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_PAYABLE:
				setTaxPayable((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_PERCENTAGE:
				setTaxPercentage((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_POINT_DATE:
				setTaxPointDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TABLE:
				setTaxTable((TaxTableType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TABLE_ENTRY:
				setTaxTableEntry((TaxTableEntryType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TYPE:
				setTaxType((TaxTypeType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_VERIFICATION_DATE:
				setTaxVerificationDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TELEPHONE:
				setTelephone((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TOTAL_CREDIT:
				setTotalCredit((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TOTAL_DEBIT:
				setTotalDebit((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_DATE:
				setTransactionDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_ID:
				setTransactionID((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				setUnitOfMeasure((String)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__UNIT_PRICE:
				setUnitPrice((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__WEBSITE:
				setWebsite((String)newValue);
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
			case Pt1_01_2Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ACCOUNT_DESCRIPTION:
				setAccountDescription(ACCOUNT_DESCRIPTION_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ACCOUNT_ID:
				setAccountID(ACCOUNT_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressStructure)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ADDRESS_DETAIL:
				setAddressDetail(ADDRESS_DETAIL_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__AUDIT_FILE:
				setAuditFile((AuditFileType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__AUDIT_FILE_VERSION:
				setAuditFileVersion(AUDIT_FILE_VERSION_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__BILLING_ADDRESS:
				setBillingAddress((AddressStructure)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__BUILDING_NUMBER:
				setBuildingNumber(BUILDING_NUMBER_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__BUSINESS_NAME:
				setBusinessName(BUSINESS_NAME_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_ADDRESS:
				setCompanyAddress((AddressStructurePT)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_ID:
				setCompanyID(COMPANY_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_NAME:
				setCompanyName(COMPANY_NAME_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CONTACT:
				setContact(CONTACT_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CREDIT_AMOUNT:
				setCreditAmount(CREDIT_AMOUNT_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CREDIT_NOTE:
				setCreditNote((CreditNoteType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY:
				setCurrency((CurrencyType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_CODE:
				setCurrencyCode(CURRENCY_CODE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_CREDIT_AMOUNT:
				setCurrencyCreditAmount(CURRENCY_CREDIT_AMOUNT_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_DEBIT_AMOUNT:
				setCurrencyDebitAmount(CURRENCY_DEBIT_AMOUNT_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER:
				setCustomer((CustomerType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER_ID:
				setCustomerID(CUSTOMER_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER_TAX_ID:
				setCustomerTaxID(CUSTOMER_TAX_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DEBIT_AMOUNT:
				setDebitAmount(DEBIT_AMOUNT_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DELIVERY_ID:
				setDeliveryID(DELIVERY_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER:
				setDocArchivalNumber(DOC_ARCHIVAL_NUMBER_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__FISCAL_YEAR:
				setFiscalYear(FISCAL_YEAR_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__GENERAL_LEDGER:
				setGeneralLedger((GeneralLedgerType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES:
				setGeneralLedgerEntries((GeneralLedgerEntriesType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__GL_POSTING_DATE:
				setGLPostingDate(GL_POSTING_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__GROSS_TOTAL:
				setGrossTotal(GROSS_TOTAL_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__HASH:
				setHash(HASH_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__HASH_CONTROL:
				setHashControl(HASH_CONTROL_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__HEADER_COMMENT:
				setHeaderComment(HEADER_COMMENT_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_DATE:
				setInvoiceDate(INVOICE_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_NO:
				setInvoiceNo(INVOICE_NO_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_STATUS:
				setInvoiceStatus(INVOICE_STATUS_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_TYPE:
				setInvoiceType(INVOICE_TYPE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__JOURNAL_ID:
				setJournalID(JOURNAL_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__NET_TOTAL:
				setNetTotal(NET_TOTAL_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__NUMBER_OF_ENTRIES:
				setNumberOfEntries(NUMBER_OF_ENTRIES_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__OPENING_CREDIT_BALANCE:
				setOpeningCreditBalance(OPENING_CREDIT_BALANCE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__OPENING_DEBIT_BALANCE:
				setOpeningDebitBalance(OPENING_DEBIT_BALANCE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ORDER_DATE:
				setOrderDate(ORDER_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ORDER_REFERENCES:
				setOrderReferences((OrderReferencesType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__ORIGINATING_ON:
				setOriginatingON(ORIGINATING_ON_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PAYMENT_MECHANISM:
				setPaymentMechanism(PAYMENT_MECHANISM_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT:
				setProduct((ProductType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_CODE:
				setProductCode(PRODUCT_CODE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID:
				setProductCompanyTaxID(PRODUCT_COMPANY_TAX_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_DESCRIPTION:
				setProductDescription(PRODUCT_DESCRIPTION_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_GROUP:
				setProductGroup(PRODUCT_GROUP_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_ID:
				setProductID(PRODUCT_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_NUMBER_CODE:
				setProductNumberCode(PRODUCT_NUMBER_CODE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_TYPE:
				setProductType(PRODUCT_TYPE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_VERSION:
				setProductVersion(PRODUCT_VERSION_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__RECORD_ID:
				setRecordID(RECORD_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__REFERENCES:
				setReferences((ReferencesType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SELF_BILLING_INDICATOR:
				setSelfBillingIndicator(SELF_BILLING_INDICATOR_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SETTLEMENT:
				setSettlement((SettlementType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SETTLEMENT_AMOUNT:
				setSettlementAmount(SETTLEMENT_AMOUNT_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_FROM:
				setShipFrom((ShippingPointStructure)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_FROM_ADDRESS:
				setShipFromAddress((AddressStructure)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_TO:
				setShipTo((ShippingPointStructure)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_TO_ADDRESS:
				setShipToAddress((AddressStructure)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER:
				setSoftwareCertificateNumber(SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_DOCUMENT_ID:
				setSourceDocumentID(SOURCE_DOCUMENT_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_DOCUMENTS:
				setSourceDocuments((SourceDocumentsType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__STREET_NAME:
				setStreetName(STREET_NAME_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER:
				setSupplier((SupplierType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER_ID:
				setSupplierID(SUPPLIER_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER_TAX_ID:
				setSupplierTaxID(SUPPLIER_TAX_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__SYSTEM_ENTRY_DATE:
				setSystemEntryDate(SYSTEM_ENTRY_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX:
				setTax((TaxType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS:
				setTaxAccountingBasis(TAX_ACCOUNTING_BASIS_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_AMOUNT:
				setTaxAmount(TAX_AMOUNT_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_CODE:
				setTaxCode(TAX_CODE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_COUNTRY_REGION:
				setTaxCountryRegion(TAX_COUNTRY_REGION_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_ENTITY:
				setTaxEntity(TAX_ENTITY_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_EXEMPTION_REASON:
				setTaxExemptionReason(TAX_EXEMPTION_REASON_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_EXPIRATION_DATE:
				setTaxExpirationDate(TAX_EXPIRATION_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_PAYABLE:
				setTaxPayable(TAX_PAYABLE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_PERCENTAGE:
				setTaxPercentage(TAX_PERCENTAGE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_POINT_DATE:
				setTaxPointDate(TAX_POINT_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TABLE:
				setTaxTable((TaxTableType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TABLE_ENTRY:
				setTaxTableEntry((TaxTableEntryType)null);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TYPE:
				setTaxType(TAX_TYPE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_VERIFICATION_DATE:
				setTaxVerificationDate(TAX_VERIFICATION_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TELEPHONE:
				setTelephone(TELEPHONE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TOTAL_CREDIT:
				setTotalCredit(TOTAL_CREDIT_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TOTAL_DEBIT:
				setTotalDebit(TOTAL_DEBIT_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_ID:
				setTransactionID(TRANSACTION_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				setTransactionType(TRANSACTION_TYPE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				setUnitOfMeasure(UNIT_OF_MEASURE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__UNIT_PRICE:
				setUnitPrice(UNIT_PRICE_EDEFAULT);
				return;
			case Pt1_01_2Package.DOCUMENT_ROOT__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
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
			case Pt1_01_2Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Pt1_01_2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Pt1_01_2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Pt1_01_2Package.DOCUMENT_ROOT__ACCOUNT_DESCRIPTION:
				return ACCOUNT_DESCRIPTION_EDEFAULT == null ? getAccountDescription() != null : !ACCOUNT_DESCRIPTION_EDEFAULT.equals(getAccountDescription());
			case Pt1_01_2Package.DOCUMENT_ROOT__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? getAccountID() != null : !ACCOUNT_ID_EDEFAULT.equals(getAccountID());
			case Pt1_01_2Package.DOCUMENT_ROOT__ADDRESS:
				return getAddress() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__ADDRESS_DETAIL:
				return ADDRESS_DETAIL_EDEFAULT == null ? getAddressDetail() != null : !ADDRESS_DETAIL_EDEFAULT.equals(getAddressDetail());
			case Pt1_01_2Package.DOCUMENT_ROOT__AUDIT_FILE:
				return getAuditFile() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__AUDIT_FILE_VERSION:
				return AUDIT_FILE_VERSION_EDEFAULT == null ? getAuditFileVersion() != null : !AUDIT_FILE_VERSION_EDEFAULT.equals(getAuditFileVersion());
			case Pt1_01_2Package.DOCUMENT_ROOT__BILLING_ADDRESS:
				return getBillingAddress() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__BUILDING_NUMBER:
				return BUILDING_NUMBER_EDEFAULT == null ? getBuildingNumber() != null : !BUILDING_NUMBER_EDEFAULT.equals(getBuildingNumber());
			case Pt1_01_2Package.DOCUMENT_ROOT__BUSINESS_NAME:
				return BUSINESS_NAME_EDEFAULT == null ? getBusinessName() != null : !BUSINESS_NAME_EDEFAULT.equals(getBusinessName());
			case Pt1_01_2Package.DOCUMENT_ROOT__CITY:
				return CITY_EDEFAULT == null ? getCity() != null : !CITY_EDEFAULT.equals(getCity());
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_ADDRESS:
				return getCompanyAddress() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_ID:
				return COMPANY_ID_EDEFAULT == null ? getCompanyID() != null : !COMPANY_ID_EDEFAULT.equals(getCompanyID());
			case Pt1_01_2Package.DOCUMENT_ROOT__COMPANY_NAME:
				return COMPANY_NAME_EDEFAULT == null ? getCompanyName() != null : !COMPANY_NAME_EDEFAULT.equals(getCompanyName());
			case Pt1_01_2Package.DOCUMENT_ROOT__CONTACT:
				return CONTACT_EDEFAULT == null ? getContact() != null : !CONTACT_EDEFAULT.equals(getContact());
			case Pt1_01_2Package.DOCUMENT_ROOT__COUNTRY:
				return COUNTRY_EDEFAULT == null ? getCountry() != null : !COUNTRY_EDEFAULT.equals(getCountry());
			case Pt1_01_2Package.DOCUMENT_ROOT__CREDIT_AMOUNT:
				return CREDIT_AMOUNT_EDEFAULT == null ? getCreditAmount() != null : !CREDIT_AMOUNT_EDEFAULT.equals(getCreditAmount());
			case Pt1_01_2Package.DOCUMENT_ROOT__CREDIT_NOTE:
				return getCreditNote() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY:
				return getCurrency() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_CODE:
				return CURRENCY_CODE_EDEFAULT == null ? getCurrencyCode() != null : !CURRENCY_CODE_EDEFAULT.equals(getCurrencyCode());
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_CREDIT_AMOUNT:
				return CURRENCY_CREDIT_AMOUNT_EDEFAULT == null ? getCurrencyCreditAmount() != null : !CURRENCY_CREDIT_AMOUNT_EDEFAULT.equals(getCurrencyCreditAmount());
			case Pt1_01_2Package.DOCUMENT_ROOT__CURRENCY_DEBIT_AMOUNT:
				return CURRENCY_DEBIT_AMOUNT_EDEFAULT == null ? getCurrencyDebitAmount() != null : !CURRENCY_DEBIT_AMOUNT_EDEFAULT.equals(getCurrencyDebitAmount());
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER:
				return getCustomer() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? getCustomerID() != null : !CUSTOMER_ID_EDEFAULT.equals(getCustomerID());
			case Pt1_01_2Package.DOCUMENT_ROOT__CUSTOMER_TAX_ID:
				return CUSTOMER_TAX_ID_EDEFAULT == null ? getCustomerTaxID() != null : !CUSTOMER_TAX_ID_EDEFAULT.equals(getCustomerTaxID());
			case Pt1_01_2Package.DOCUMENT_ROOT__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? getDateCreated() != null : !DATE_CREATED_EDEFAULT.equals(getDateCreated());
			case Pt1_01_2Package.DOCUMENT_ROOT__DEBIT_AMOUNT:
				return DEBIT_AMOUNT_EDEFAULT == null ? getDebitAmount() != null : !DEBIT_AMOUNT_EDEFAULT.equals(getDebitAmount());
			case Pt1_01_2Package.DOCUMENT_ROOT__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? getDeliveryDate() != null : !DELIVERY_DATE_EDEFAULT.equals(getDeliveryDate());
			case Pt1_01_2Package.DOCUMENT_ROOT__DELIVERY_ID:
				return DELIVERY_ID_EDEFAULT == null ? getDeliveryID() != null : !DELIVERY_ID_EDEFAULT.equals(getDeliveryID());
			case Pt1_01_2Package.DOCUMENT_ROOT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case Pt1_01_2Package.DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER:
				return DOC_ARCHIVAL_NUMBER_EDEFAULT == null ? getDocArchivalNumber() != null : !DOC_ARCHIVAL_NUMBER_EDEFAULT.equals(getDocArchivalNumber());
			case Pt1_01_2Package.DOCUMENT_ROOT__EMAIL:
				return EMAIL_EDEFAULT == null ? getEmail() != null : !EMAIL_EDEFAULT.equals(getEmail());
			case Pt1_01_2Package.DOCUMENT_ROOT__END_DATE:
				return END_DATE_EDEFAULT == null ? getEndDate() != null : !END_DATE_EDEFAULT.equals(getEndDate());
			case Pt1_01_2Package.DOCUMENT_ROOT__FAX:
				return FAX_EDEFAULT == null ? getFax() != null : !FAX_EDEFAULT.equals(getFax());
			case Pt1_01_2Package.DOCUMENT_ROOT__FISCAL_YEAR:
				return FISCAL_YEAR_EDEFAULT == null ? getFiscalYear() != null : !FISCAL_YEAR_EDEFAULT.equals(getFiscalYear());
			case Pt1_01_2Package.DOCUMENT_ROOT__GENERAL_LEDGER:
				return getGeneralLedger() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES:
				return getGeneralLedgerEntries() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__GL_POSTING_DATE:
				return GL_POSTING_DATE_EDEFAULT == null ? getGLPostingDate() != null : !GL_POSTING_DATE_EDEFAULT.equals(getGLPostingDate());
			case Pt1_01_2Package.DOCUMENT_ROOT__GROSS_TOTAL:
				return GROSS_TOTAL_EDEFAULT == null ? getGrossTotal() != null : !GROSS_TOTAL_EDEFAULT.equals(getGrossTotal());
			case Pt1_01_2Package.DOCUMENT_ROOT__HASH:
				return HASH_EDEFAULT == null ? getHash() != null : !HASH_EDEFAULT.equals(getHash());
			case Pt1_01_2Package.DOCUMENT_ROOT__HASH_CONTROL:
				return HASH_CONTROL_EDEFAULT == null ? getHashControl() != null : !HASH_CONTROL_EDEFAULT.equals(getHashControl());
			case Pt1_01_2Package.DOCUMENT_ROOT__HEADER:
				return getHeader() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__HEADER_COMMENT:
				return HEADER_COMMENT_EDEFAULT == null ? getHeaderComment() != null : !HEADER_COMMENT_EDEFAULT.equals(getHeaderComment());
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_DATE:
				return INVOICE_DATE_EDEFAULT == null ? getInvoiceDate() != null : !INVOICE_DATE_EDEFAULT.equals(getInvoiceDate());
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_NO:
				return INVOICE_NO_EDEFAULT == null ? getInvoiceNo() != null : !INVOICE_NO_EDEFAULT.equals(getInvoiceNo());
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_STATUS:
				return getInvoiceStatus() != INVOICE_STATUS_EDEFAULT;
			case Pt1_01_2Package.DOCUMENT_ROOT__INVOICE_TYPE:
				return getInvoiceType() != INVOICE_TYPE_EDEFAULT;
			case Pt1_01_2Package.DOCUMENT_ROOT__JOURNAL_ID:
				return JOURNAL_ID_EDEFAULT == null ? getJournalID() != null : !JOURNAL_ID_EDEFAULT.equals(getJournalID());
			case Pt1_01_2Package.DOCUMENT_ROOT__LINE_NUMBER:
				return LINE_NUMBER_EDEFAULT == null ? getLineNumber() != null : !LINE_NUMBER_EDEFAULT.equals(getLineNumber());
			case Pt1_01_2Package.DOCUMENT_ROOT__NET_TOTAL:
				return NET_TOTAL_EDEFAULT == null ? getNetTotal() != null : !NET_TOTAL_EDEFAULT.equals(getNetTotal());
			case Pt1_01_2Package.DOCUMENT_ROOT__NUMBER_OF_ENTRIES:
				return NUMBER_OF_ENTRIES_EDEFAULT == null ? getNumberOfEntries() != null : !NUMBER_OF_ENTRIES_EDEFAULT.equals(getNumberOfEntries());
			case Pt1_01_2Package.DOCUMENT_ROOT__OPENING_CREDIT_BALANCE:
				return OPENING_CREDIT_BALANCE_EDEFAULT == null ? getOpeningCreditBalance() != null : !OPENING_CREDIT_BALANCE_EDEFAULT.equals(getOpeningCreditBalance());
			case Pt1_01_2Package.DOCUMENT_ROOT__OPENING_DEBIT_BALANCE:
				return OPENING_DEBIT_BALANCE_EDEFAULT == null ? getOpeningDebitBalance() != null : !OPENING_DEBIT_BALANCE_EDEFAULT.equals(getOpeningDebitBalance());
			case Pt1_01_2Package.DOCUMENT_ROOT__ORDER_DATE:
				return ORDER_DATE_EDEFAULT == null ? getOrderDate() != null : !ORDER_DATE_EDEFAULT.equals(getOrderDate());
			case Pt1_01_2Package.DOCUMENT_ROOT__ORDER_REFERENCES:
				return getOrderReferences() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__ORIGINATING_ON:
				return ORIGINATING_ON_EDEFAULT == null ? getOriginatingON() != null : !ORIGINATING_ON_EDEFAULT.equals(getOriginatingON());
			case Pt1_01_2Package.DOCUMENT_ROOT__PAYMENT_MECHANISM:
				return getPaymentMechanism() != PAYMENT_MECHANISM_EDEFAULT;
			case Pt1_01_2Package.DOCUMENT_ROOT__PERIOD:
				return PERIOD_EDEFAULT == null ? getPeriod() != null : !PERIOD_EDEFAULT.equals(getPeriod());
			case Pt1_01_2Package.DOCUMENT_ROOT__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? getPostalCode() != null : !POSTAL_CODE_EDEFAULT.equals(getPostalCode());
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT:
				return getProduct() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_CODE:
				return PRODUCT_CODE_EDEFAULT == null ? getProductCode() != null : !PRODUCT_CODE_EDEFAULT.equals(getProductCode());
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID:
				return PRODUCT_COMPANY_TAX_ID_EDEFAULT == null ? getProductCompanyTaxID() != null : !PRODUCT_COMPANY_TAX_ID_EDEFAULT.equals(getProductCompanyTaxID());
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_DESCRIPTION:
				return PRODUCT_DESCRIPTION_EDEFAULT == null ? getProductDescription() != null : !PRODUCT_DESCRIPTION_EDEFAULT.equals(getProductDescription());
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_GROUP:
				return PRODUCT_GROUP_EDEFAULT == null ? getProductGroup() != null : !PRODUCT_GROUP_EDEFAULT.equals(getProductGroup());
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? getProductID() != null : !PRODUCT_ID_EDEFAULT.equals(getProductID());
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_NUMBER_CODE:
				return PRODUCT_NUMBER_CODE_EDEFAULT == null ? getProductNumberCode() != null : !PRODUCT_NUMBER_CODE_EDEFAULT.equals(getProductNumberCode());
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_TYPE:
				return getProductType() != PRODUCT_TYPE_EDEFAULT;
			case Pt1_01_2Package.DOCUMENT_ROOT__PRODUCT_VERSION:
				return PRODUCT_VERSION_EDEFAULT == null ? getProductVersion() != null : !PRODUCT_VERSION_EDEFAULT.equals(getProductVersion());
			case Pt1_01_2Package.DOCUMENT_ROOT__QUANTITY:
				return QUANTITY_EDEFAULT == null ? getQuantity() != null : !QUANTITY_EDEFAULT.equals(getQuantity());
			case Pt1_01_2Package.DOCUMENT_ROOT__REASON:
				return REASON_EDEFAULT == null ? getReason() != null : !REASON_EDEFAULT.equals(getReason());
			case Pt1_01_2Package.DOCUMENT_ROOT__RECORD_ID:
				return RECORD_ID_EDEFAULT == null ? getRecordID() != null : !RECORD_ID_EDEFAULT.equals(getRecordID());
			case Pt1_01_2Package.DOCUMENT_ROOT__REFERENCE:
				return REFERENCE_EDEFAULT == null ? getReference() != null : !REFERENCE_EDEFAULT.equals(getReference());
			case Pt1_01_2Package.DOCUMENT_ROOT__REFERENCES:
				return getReferences() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__REGION:
				return REGION_EDEFAULT == null ? getRegion() != null : !REGION_EDEFAULT.equals(getRegion());
			case Pt1_01_2Package.DOCUMENT_ROOT__SELF_BILLING_INDICATOR:
				return SELF_BILLING_INDICATOR_EDEFAULT == null ? getSelfBillingIndicator() != null : !SELF_BILLING_INDICATOR_EDEFAULT.equals(getSelfBillingIndicator());
			case Pt1_01_2Package.DOCUMENT_ROOT__SETTLEMENT:
				return getSettlement() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__SETTLEMENT_AMOUNT:
				return SETTLEMENT_AMOUNT_EDEFAULT == null ? getSettlementAmount() != null : !SETTLEMENT_AMOUNT_EDEFAULT.equals(getSettlementAmount());
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_FROM:
				return getShipFrom() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_FROM_ADDRESS:
				return getShipFromAddress() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_TO:
				return getShipTo() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__SHIP_TO_ADDRESS:
				return getShipToAddress() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER:
				return SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT == null ? getSoftwareCertificateNumber() != null : !SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT.equals(getSoftwareCertificateNumber());
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_DOCUMENT_ID:
				return SOURCE_DOCUMENT_ID_EDEFAULT == null ? getSourceDocumentID() != null : !SOURCE_DOCUMENT_ID_EDEFAULT.equals(getSourceDocumentID());
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_DOCUMENTS:
				return getSourceDocuments() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? getSourceID() != null : !SOURCE_ID_EDEFAULT.equals(getSourceID());
			case Pt1_01_2Package.DOCUMENT_ROOT__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case Pt1_01_2Package.DOCUMENT_ROOT__STREET_NAME:
				return STREET_NAME_EDEFAULT == null ? getStreetName() != null : !STREET_NAME_EDEFAULT.equals(getStreetName());
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER:
				return getSupplier() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER_ID:
				return SUPPLIER_ID_EDEFAULT == null ? getSupplierID() != null : !SUPPLIER_ID_EDEFAULT.equals(getSupplierID());
			case Pt1_01_2Package.DOCUMENT_ROOT__SUPPLIER_TAX_ID:
				return SUPPLIER_TAX_ID_EDEFAULT == null ? getSupplierTaxID() != null : !SUPPLIER_TAX_ID_EDEFAULT.equals(getSupplierTaxID());
			case Pt1_01_2Package.DOCUMENT_ROOT__SYSTEM_ENTRY_DATE:
				return SYSTEM_ENTRY_DATE_EDEFAULT == null ? getSystemEntryDate() != null : !SYSTEM_ENTRY_DATE_EDEFAULT.equals(getSystemEntryDate());
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX:
				return getTax() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS:
				return getTaxAccountingBasis() != TAX_ACCOUNTING_BASIS_EDEFAULT;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_AMOUNT:
				return TAX_AMOUNT_EDEFAULT == null ? getTaxAmount() != null : !TAX_AMOUNT_EDEFAULT.equals(getTaxAmount());
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_CODE:
				return TAX_CODE_EDEFAULT == null ? getTaxCode() != null : !TAX_CODE_EDEFAULT.equals(getTaxCode());
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_COUNTRY_REGION:
				return TAX_COUNTRY_REGION_EDEFAULT == null ? getTaxCountryRegion() != null : !TAX_COUNTRY_REGION_EDEFAULT.equals(getTaxCountryRegion());
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_ENTITY:
				return TAX_ENTITY_EDEFAULT == null ? getTaxEntity() != null : !TAX_ENTITY_EDEFAULT.equals(getTaxEntity());
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_EXEMPTION_REASON:
				return TAX_EXEMPTION_REASON_EDEFAULT == null ? getTaxExemptionReason() != null : !TAX_EXEMPTION_REASON_EDEFAULT.equals(getTaxExemptionReason());
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_EXPIRATION_DATE:
				return TAX_EXPIRATION_DATE_EDEFAULT == null ? getTaxExpirationDate() != null : !TAX_EXPIRATION_DATE_EDEFAULT.equals(getTaxExpirationDate());
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_PAYABLE:
				return TAX_PAYABLE_EDEFAULT == null ? getTaxPayable() != null : !TAX_PAYABLE_EDEFAULT.equals(getTaxPayable());
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_PERCENTAGE:
				return TAX_PERCENTAGE_EDEFAULT == null ? getTaxPercentage() != null : !TAX_PERCENTAGE_EDEFAULT.equals(getTaxPercentage());
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_POINT_DATE:
				return TAX_POINT_DATE_EDEFAULT == null ? getTaxPointDate() != null : !TAX_POINT_DATE_EDEFAULT.equals(getTaxPointDate());
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TABLE:
				return getTaxTable() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TABLE_ENTRY:
				return getTaxTableEntry() != null;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_TYPE:
				return getTaxType() != TAX_TYPE_EDEFAULT;
			case Pt1_01_2Package.DOCUMENT_ROOT__TAX_VERIFICATION_DATE:
				return TAX_VERIFICATION_DATE_EDEFAULT == null ? getTaxVerificationDate() != null : !TAX_VERIFICATION_DATE_EDEFAULT.equals(getTaxVerificationDate());
			case Pt1_01_2Package.DOCUMENT_ROOT__TELEPHONE:
				return TELEPHONE_EDEFAULT == null ? getTelephone() != null : !TELEPHONE_EDEFAULT.equals(getTelephone());
			case Pt1_01_2Package.DOCUMENT_ROOT__TOTAL_CREDIT:
				return TOTAL_CREDIT_EDEFAULT == null ? getTotalCredit() != null : !TOTAL_CREDIT_EDEFAULT.equals(getTotalCredit());
			case Pt1_01_2Package.DOCUMENT_ROOT__TOTAL_DEBIT:
				return TOTAL_DEBIT_EDEFAULT == null ? getTotalDebit() != null : !TOTAL_DEBIT_EDEFAULT.equals(getTotalDebit());
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? getTransactionDate() != null : !TRANSACTION_DATE_EDEFAULT.equals(getTransactionDate());
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_ID:
				return TRANSACTION_ID_EDEFAULT == null ? getTransactionID() != null : !TRANSACTION_ID_EDEFAULT.equals(getTransactionID());
			case Pt1_01_2Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				return getTransactionType() != TRANSACTION_TYPE_EDEFAULT;
			case Pt1_01_2Package.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				return UNIT_OF_MEASURE_EDEFAULT == null ? getUnitOfMeasure() != null : !UNIT_OF_MEASURE_EDEFAULT.equals(getUnitOfMeasure());
			case Pt1_01_2Package.DOCUMENT_ROOT__UNIT_PRICE:
				return UNIT_PRICE_EDEFAULT == null ? getUnitPrice() != null : !UNIT_PRICE_EDEFAULT.equals(getUnitPrice());
			case Pt1_01_2Package.DOCUMENT_ROOT__WEBSITE:
				return WEBSITE_EDEFAULT == null ? getWebsite() != null : !WEBSITE_EDEFAULT.equals(getWebsite());
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
