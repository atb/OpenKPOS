/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAccountDescription <em>Account Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAddressDetail <em>Address Detail</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getATDocCodeID <em>AT Doc Code ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAuditFile <em>Audit File</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAuditFileVersion <em>Audit File Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getBillingAddress <em>Billing Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCity <em>City</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getClosingCreditBalance <em>Closing Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getClosingDebitBalance <em>Closing Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCompanyAddress <em>Company Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getContact <em>Contact</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCountry <em>Country</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCreditAmount <em>Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCurrencyAmount <em>Currency Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCustomer <em>Customer</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCustomerTaxID <em>Customer Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDebitAmount <em>Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDeliveryID <em>Delivery ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDocArchivalNumber <em>Doc Archival Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDocumentNumber <em>Document Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getEACCode <em>EAC Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getEmail <em>Email</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getEndDate <em>End Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getFax <em>Fax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getFiscalYear <em>Fiscal Year</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getGeneralLedger <em>General Ledger</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getGeneralLedgerEntries <em>General Ledger Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getGLPostingDate <em>GL Posting Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getGrossTotal <em>Gross Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getGroupingCategory <em>Grouping Category</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getHeader <em>Header</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getHeaderComment <em>Header Comment</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getInvoiceNo <em>Invoice No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getInvoiceStatus <em>Invoice Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getInvoiceStatusDate <em>Invoice Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getJournalID <em>Journal ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getLocationID <em>Location ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementComments <em>Movement Comments</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementDate <em>Movement Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementEndTime <em>Movement End Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementStartTime <em>Movement Start Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementStatus <em>Movement Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementStatusDate <em>Movement Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementType <em>Movement Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getNetTotal <em>Net Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getNumberOfEntries <em>Number Of Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getNumberOfMovementLines <em>Number Of Movement Lines</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getOpeningCreditBalance <em>Opening Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getOpeningDebitBalance <em>Opening Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getOriginatingON <em>Originating ON</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getPaymentMechanism <em>Payment Mechanism</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProduct <em>Product</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductCompanyTaxID <em>Product Company Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductDescription <em>Product Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductGroup <em>Product Group</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductID <em>Product ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductNumberCode <em>Product Number Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductType <em>Product Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getReference <em>Reference</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getRegion <em>Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSelfBillingIndicator <em>Self Billing Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getShipFrom <em>Ship From</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getShipFromAddress <em>Ship From Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getShipToAddress <em>Ship To Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSoftwareCertificateNumber <em>Software Certificate Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSourceBilling <em>Source Billing</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSourceDocumentID <em>Source Document ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSourceDocuments <em>Source Documents</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSupplierID <em>Supplier ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSupplierTaxID <em>Supplier Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxAccountingBasis <em>Tax Accounting Basis</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxCode <em>Tax Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxCountryRegion <em>Tax Country Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxEntity <em>Tax Entity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxExemptionReason <em>Tax Exemption Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxExpirationDate <em>Tax Expiration Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxPayable <em>Tax Payable</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxPointDate <em>Tax Point Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxTable <em>Tax Table</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxTableEntry <em>Tax Table Entry</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxType <em>Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxVerificationDate <em>Tax Verification Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTotalCredit <em>Total Credit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTotalDebit <em>Total Debit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTotalQuantityIssued <em>Total Quantity Issued</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWarehouseID <em>Warehouse ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWebsite <em>Website</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWithholdingTaxType <em>Withholding Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWorkDate <em>Work Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWorkStatus <em>Work Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWorkStatusDate <em>Work Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWorkType <em>Work Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Account Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Description</em>' attribute.
	 * @see #setAccountDescription(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_AccountDescription()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccountDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAccountDescription <em>Account Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Description</em>' attribute.
	 * @see #getAccountDescription()
	 * @generated
	 */
	void setAccountDescription(String value);

	/**
	 * Returns the value of the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account ID</em>' attribute.
	 * @see #setAccountID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_AccountID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.AccountIDType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccountID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #getAccountID()
	 * @generated
	 */
	void setAccountID(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressStructure)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Address()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressStructure value);

	/**
	 * Returns the value of the '<em><b>Address Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Detail</em>' attribute.
	 * @see #setAddressDetail(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_AddressDetail()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax100Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressDetail();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAddressDetail <em>Address Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Detail</em>' attribute.
	 * @see #getAddressDetail()
	 * @generated
	 */
	void setAddressDetail(String value);

	/**
	 * Returns the value of the '<em><b>AT Doc Code ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AT Doc Code ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AT Doc Code ID</em>' attribute.
	 * @see #setATDocCodeID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ATDocCodeID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax200Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATDocCodeID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATDocCodeID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getATDocCodeID <em>AT Doc Code ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AT Doc Code ID</em>' attribute.
	 * @see #getATDocCodeID()
	 * @generated
	 */
	void setATDocCodeID(String value);

	/**
	 * Returns the value of the '<em><b>Audit File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit File</em>' containment reference.
	 * @see #setAuditFile(AuditFileType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_AuditFile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditFile' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditFileType getAuditFile();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAuditFile <em>Audit File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit File</em>' containment reference.
	 * @see #getAuditFile()
	 * @generated
	 */
	void setAuditFile(AuditFileType value);

	/**
	 * Returns the value of the '<em><b>Audit File Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit File Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit File Version</em>' attribute.
	 * @see #setAuditFileVersion(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_AuditFileVersion()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.AuditFileVersionType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditFileVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuditFileVersion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getAuditFileVersion <em>Audit File Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit File Version</em>' attribute.
	 * @see #getAuditFileVersion()
	 * @generated
	 */
	void setAuditFileVersion(String value);

	/**
	 * Returns the value of the '<em><b>Billing Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Address</em>' containment reference.
	 * @see #setBillingAddress(AddressStructure)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_BillingAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BillingAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getBillingAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getBillingAddress <em>Billing Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Address</em>' containment reference.
	 * @see #getBillingAddress()
	 * @generated
	 */
	void setBillingAddress(AddressStructure value);

	/**
	 * Returns the value of the '<em><b>Building Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Number</em>' attribute.
	 * @see #setBuildingNumber(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_BuildingNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax10Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BuildingNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBuildingNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getBuildingNumber <em>Building Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Number</em>' attribute.
	 * @see #getBuildingNumber()
	 * @generated
	 */
	void setBuildingNumber(String value);

	/**
	 * Returns the value of the '<em><b>Business Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Name</em>' attribute.
	 * @see #setBusinessName(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_BusinessName()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBusinessName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getBusinessName <em>Business Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Name</em>' attribute.
	 * @see #getBusinessName()
	 * @generated
	 */
	void setBusinessName(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_City()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='City' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Closing Credit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closing Credit Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Credit Balance</em>' attribute.
	 * @see #setClosingCreditBalance(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ClosingCreditBalance()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClosingCreditBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getClosingCreditBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getClosingCreditBalance <em>Closing Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Credit Balance</em>' attribute.
	 * @see #getClosingCreditBalance()
	 * @generated
	 */
	void setClosingCreditBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Closing Debit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closing Debit Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Debit Balance</em>' attribute.
	 * @see #setClosingDebitBalance(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ClosingDebitBalance()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClosingDebitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getClosingDebitBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getClosingDebitBalance <em>Closing Debit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Debit Balance</em>' attribute.
	 * @see #getClosingDebitBalance()
	 * @generated
	 */
	void setClosingDebitBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Company Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Address</em>' containment reference.
	 * @see #setCompanyAddress(AddressStructurePT)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_CompanyAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompanyAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructurePT getCompanyAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCompanyAddress <em>Company Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Address</em>' containment reference.
	 * @see #getCompanyAddress()
	 * @generated
	 */
	void setCompanyAddress(AddressStructurePT value);

	/**
	 * Returns the value of the '<em><b>Company ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Obt�m-se pela concatena��o da Conservat�ria do Registo Comercial com o n�mero do registo comercial separados pelo car�cter espa�o. Nos casos em que n�o existe o registo comercial, deve ser indicado o NIF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Company ID</em>' attribute.
	 * @see #setCompanyID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_CompanyID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.CompanyIDType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompanyID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompanyID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCompanyID <em>Company ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company ID</em>' attribute.
	 * @see #getCompanyID()
	 * @generated
	 */
	void setCompanyID(String value);

	/**
	 * Returns the value of the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name</em>' attribute.
	 * @see #setCompanyName(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_CompanyName()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax100Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompanyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCompanyName <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name</em>' attribute.
	 * @see #getCompanyName()
	 * @generated
	 */
	void setCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute.
	 * @see #setContact(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Contact()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Contact' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContact();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getContact <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' attribute.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Country()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.CountryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Amount</em>' attribute.
	 * @see #setCreditAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_CreditAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreditAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCreditAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCreditAmount <em>Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Amount</em>' attribute.
	 * @see #getCreditAmount()
	 * @generated
	 */
	void setCreditAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Amount</em>' attribute.
	 * @see #setCurrencyAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_CurrencyAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CurrencyAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCurrencyAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCurrencyAmount <em>Currency Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Amount</em>' attribute.
	 * @see #getCurrencyAmount()
	 * @generated
	 */
	void setCurrencyAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Code</em>' attribute.
	 * @see #setCurrencyCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_CurrencyCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.CurrencyCodeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CurrencyCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCurrencyCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCurrencyCode <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Code</em>' attribute.
	 * @see #getCurrencyCode()
	 * @generated
	 */
	void setCurrencyCode(String value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference.
	 * @see #setCustomer(CustomerType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Customer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Customer' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerType getCustomer();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCustomer <em>Customer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' containment reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(CustomerType value);

	/**
	 * Returns the value of the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer ID</em>' attribute.
	 * @see #setCustomerID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_CustomerID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CustomerID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomerID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCustomerID <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer ID</em>' attribute.
	 * @see #getCustomerID()
	 * @generated
	 */
	void setCustomerID(String value);

	/**
	 * Returns the value of the '<em><b>Customer Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Tax ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Tax ID</em>' attribute.
	 * @see #setCustomerTaxID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_CustomerTaxID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CustomerTaxID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomerTaxID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getCustomerTaxID <em>Customer Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Tax ID</em>' attribute.
	 * @see #getCustomerTaxID()
	 * @generated
	 */
	void setCustomerTaxID(String value);

	/**
	 * Returns the value of the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Created</em>' attribute.
	 * @see #setDateCreated(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_DateCreated()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTDateSpan" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateCreated' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateCreated();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit Amount</em>' attribute.
	 * @see #setDebitAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_DebitAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DebitAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDebitAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDebitAmount <em>Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit Amount</em>' attribute.
	 * @see #getDebitAmount()
	 * @generated
	 */
	void setDebitAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Date</em>' attribute.
	 * @see #setDeliveryDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_DeliveryDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeliveryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDeliveryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #getDeliveryDate()
	 * @generated
	 */
	void setDeliveryDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Delivery ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery ID</em>' attribute.
	 * @see #setDeliveryID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_DeliveryID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeliveryID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeliveryID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDeliveryID <em>Delivery ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery ID</em>' attribute.
	 * @see #getDeliveryID()
	 * @generated
	 */
	void setDeliveryID(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Description()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax200Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Doc Archival Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc Archival Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Archival Number</em>' attribute.
	 * @see #setDocArchivalNumber(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_DocArchivalNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFTPTDocArchivalNumber" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocArchivalNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocArchivalNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDocArchivalNumber <em>Doc Archival Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Archival Number</em>' attribute.
	 * @see #getDocArchivalNumber()
	 * @generated
	 */
	void setDocArchivalNumber(String value);

	/**
	 * Returns the value of the '<em><b>Document Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Number</em>' attribute.
	 * @see #setDocumentNumber(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_DocumentNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.DocumentNumberType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getDocumentNumber <em>Document Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Number</em>' attribute.
	 * @see #getDocumentNumber()
	 * @generated
	 */
	void setDocumentNumber(String value);

	/**
	 * Returns the value of the '<em><b>EAC Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAC Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAC Code</em>' attribute.
	 * @see #setEACCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_EACCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.EACCodeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EACCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEACCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getEACCode <em>EAC Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAC Code</em>' attribute.
	 * @see #getEACCode()
	 * @generated
	 */
	void setEACCode(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Email()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Email' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_EndDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTDateSpan" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Exchange Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Rate</em>' attribute.
	 * @see #setExchangeRate(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ExchangeRate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdecimalType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExchangeRate' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getExchangeRate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getExchangeRate <em>Exchange Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Rate</em>' attribute.
	 * @see #getExchangeRate()
	 * @generated
	 */
	void setExchangeRate(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fax</em>' attribute.
	 * @see #setFax(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Fax()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Fax' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFax();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getFax <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fax</em>' attribute.
	 * @see #getFax()
	 * @generated
	 */
	void setFax(String value);

	/**
	 * Returns the value of the '<em><b>Fiscal Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiscal Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiscal Year</em>' attribute.
	 * @see #setFiscalYear(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_FiscalYear()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.FiscalYearType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FiscalYear' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFiscalYear();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getFiscalYear <em>Fiscal Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiscal Year</em>' attribute.
	 * @see #getFiscalYear()
	 * @generated
	 */
	void setFiscalYear(BigInteger value);

	/**
	 * Returns the value of the '<em><b>General Ledger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Ledger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Ledger</em>' containment reference.
	 * @see #setGeneralLedger(GeneralLedgerType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_GeneralLedger()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeneralLedger' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralLedgerType getGeneralLedger();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getGeneralLedger <em>General Ledger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Ledger</em>' containment reference.
	 * @see #getGeneralLedger()
	 * @generated
	 */
	void setGeneralLedger(GeneralLedgerType value);

	/**
	 * Returns the value of the '<em><b>General Ledger Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Ledger Entries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Ledger Entries</em>' containment reference.
	 * @see #setGeneralLedgerEntries(GeneralLedgerEntriesType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_GeneralLedgerEntries()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeneralLedgerEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralLedgerEntriesType getGeneralLedgerEntries();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getGeneralLedgerEntries <em>General Ledger Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Ledger Entries</em>' containment reference.
	 * @see #getGeneralLedgerEntries()
	 * @generated
	 */
	void setGeneralLedgerEntries(GeneralLedgerEntriesType value);

	/**
	 * Returns the value of the '<em><b>GL Posting Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GL Posting Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GL Posting Date</em>' attribute.
	 * @see #setGLPostingDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_GLPostingDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GLPostingDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGLPostingDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getGLPostingDate <em>GL Posting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GL Posting Date</em>' attribute.
	 * @see #getGLPostingDate()
	 * @generated
	 */
	void setGLPostingDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Gross Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gross Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gross Total</em>' attribute.
	 * @see #setGrossTotal(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_GrossTotal()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GrossTotal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getGrossTotal();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getGrossTotal <em>Gross Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Total</em>' attribute.
	 * @see #getGrossTotal()
	 * @generated
	 */
	void setGrossTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Grouping Category</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.GroupingCategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GR para conta de 1� grau da contabilidade geral, GA para conta agregadora ou integradora da contabilidade geral, GM para conta de movimento da contabilidade geral, AR para conta de 1� grau da contabilidade anal�tica, AA para conta agregadora ou integradora da contabilidade anal�tica, AM para conta de movimento da contabilidade anal�tica 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouping Category</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.GroupingCategoryType
	 * @see #setGroupingCategory(GroupingCategoryType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_GroupingCategory()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroupingCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupingCategoryType getGroupingCategory();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getGroupingCategory <em>Grouping Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Category</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.GroupingCategoryType
	 * @see #getGroupingCategory()
	 * @generated
	 */
	void setGroupingCategory(GroupingCategoryType value);

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see #setHash(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Hash()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax172Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Hash' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(String value);

	/**
	 * Returns the value of the '<em><b>Hash Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash Control</em>' attribute.
	 * @see #setHashControl(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_HashControl()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax40Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HashControl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHashControl();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getHashControl <em>Hash Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Control</em>' attribute.
	 * @see #getHashControl()
	 * @generated
	 */
	void setHashControl(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeaderType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Header()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderType getHeader();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeaderType value);

	/**
	 * Returns the value of the '<em><b>Header Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Comment</em>' attribute.
	 * @see #setHeaderComment(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_HeaderComment()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax255Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HeaderComment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHeaderComment();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getHeaderComment <em>Header Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Comment</em>' attribute.
	 * @see #getHeaderComment()
	 * @generated
	 */
	void setHeaderComment(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Date</em>' attribute.
	 * @see #setInvoiceDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_InvoiceDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getInvoiceDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getInvoiceDate <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Date</em>' attribute.
	 * @see #getInvoiceDate()
	 * @generated
	 */
	void setInvoiceDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Invoice No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice No</em>' attribute.
	 * @see #setInvoiceNo(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_InvoiceNo()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.InvoiceNoType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceNo' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInvoiceNo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getInvoiceNo <em>Invoice No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice No</em>' attribute.
	 * @see #getInvoiceNo()
	 * @generated
	 */
	void setInvoiceNo(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.InvoiceStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, S para autofatura��o, A para anulado, R para documento de resumo doutros documentos criados noutras aplica��es e gerado nesta aplica��o, F para faturado 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.InvoiceStatusType
	 * @see #setInvoiceStatus(InvoiceStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_InvoiceStatus()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceStatusType getInvoiceStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getInvoiceStatus <em>Invoice Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.InvoiceStatusType
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	void setInvoiceStatus(InvoiceStatusType value);

	/**
	 * Returns the value of the '<em><b>Invoice Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Status Date</em>' attribute.
	 * @see #setInvoiceStatusDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_InvoiceStatusDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getInvoiceStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getInvoiceStatusDate <em>Invoice Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Status Date</em>' attribute.
	 * @see #getInvoiceStatusDate()
	 * @generated
	 */
	void setInvoiceStatusDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Invoice Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.InvoiceTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Restri��o:  FT-Fatura nos termos do art.� 36� do CIVA, FS-Fatura simplificada nos termos do art.� 40� do CIVA, FR-Fatura-Recibo, ND-Nota de d�bito, NC-Nota de Cr�dito,VD-Venda a dinheiro (a), TV-Tal�o de Venda (a), TD-Tal�o de devolu��o (a), AA-Aliena��o Activos (a),DA-Devolu��o Activos (a), RP-Pr�mio ou Recibo Pr�mio, RE-Estorno ou Recibo de Estorno, CS-Imputa��o a Co-Seguradoras, LD-Imputa��o a Co-Seguradora L�der, RA-Resseguro Aceite. (a) Para dados at� 2012-12-31
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.InvoiceTypeType
	 * @see #setInvoiceType(InvoiceTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_InvoiceType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceType' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceTypeType getInvoiceType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getInvoiceType <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.InvoiceTypeType
	 * @see #getInvoiceType()
	 * @generated
	 */
	void setInvoiceType(InvoiceTypeType value);

	/**
	 * Returns the value of the '<em><b>Journal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Journal ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journal ID</em>' attribute.
	 * @see #setJournalID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_JournalID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTJournalID" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JournalID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJournalID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getJournalID <em>Journal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journal ID</em>' attribute.
	 * @see #getJournalID()
	 * @generated
	 */
	void setJournalID(String value);

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_LineNumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLineNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location ID</em>' attribute.
	 * @see #setLocationID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_LocationID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocationID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getLocationID <em>Location ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location ID</em>' attribute.
	 * @see #getLocationID()
	 * @generated
	 */
	void setLocationID(String value);

	/**
	 * Returns the value of the '<em><b>Movement Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Comments</em>' attribute.
	 * @see #setMovementComments(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_MovementComments()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementComments' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMovementComments();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementComments <em>Movement Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Comments</em>' attribute.
	 * @see #getMovementComments()
	 * @generated
	 */
	void setMovementComments(String value);

	/**
	 * Returns the value of the '<em><b>Movement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Date</em>' attribute.
	 * @see #setMovementDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_MovementDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementDate <em>Movement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Date</em>' attribute.
	 * @see #getMovementDate()
	 * @generated
	 */
	void setMovementDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Movement End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement End Time</em>' attribute.
	 * @see #setMovementEndTime(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_MovementEndTime()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementEndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementEndTime();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementEndTime <em>Movement End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement End Time</em>' attribute.
	 * @see #getMovementEndTime()
	 * @generated
	 */
	void setMovementEndTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Movement Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Start Time</em>' attribute.
	 * @see #setMovementStartTime(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_MovementStartTime()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementStartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementStartTime();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementStartTime <em>Movement Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Start Time</em>' attribute.
	 * @see #getMovementStartTime()
	 * @generated
	 */
	void setMovementStartTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Movement Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.MovementStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, T por conta de terceiros, A para Anulado, R para documento de resumo doutros documentos criados noutras aplica��es e gerado nesta aplica��o. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Movement Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.MovementStatusType
	 * @see #setMovementStatus(MovementStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_MovementStatus()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	MovementStatusType getMovementStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementStatus <em>Movement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.MovementStatusType
	 * @see #getMovementStatus()
	 * @generated
	 */
	void setMovementStatus(MovementStatusType value);

	/**
	 * Returns the value of the '<em><b>Movement Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Status Date</em>' attribute.
	 * @see #setMovementStatusDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_MovementStatusDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementStatusDate <em>Movement Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Status Date</em>' attribute.
	 * @see #getMovementStatusDate()
	 * @generated
	 */
	void setMovementStatusDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Movement Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.MovementTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Restri��o: Tipos de Documento (GR para Guia de remessa, GT para Guia de transporte, GA para Guia de movimenta��o de ativos pr�prios, GC para Guia de consigna��o, GD para Guia ou nota de devolu��o)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Movement Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.MovementTypeType
	 * @see #setMovementType(MovementTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_MovementType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementType' namespace='##targetNamespace'"
	 * @generated
	 */
	MovementTypeType getMovementType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getMovementType <em>Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.MovementTypeType
	 * @see #getMovementType()
	 * @generated
	 */
	void setMovementType(MovementTypeType value);

	/**
	 * Returns the value of the '<em><b>Net Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Total</em>' attribute.
	 * @see #setNetTotal(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_NetTotal()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetTotal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getNetTotal();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getNetTotal <em>Net Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Total</em>' attribute.
	 * @see #getNetTotal()
	 * @generated
	 */
	void setNetTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Entries</em>' attribute.
	 * @see #setNumberOfEntries(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_NumberOfEntries()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NumberOfEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfEntries();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getNumberOfEntries <em>Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Entries</em>' attribute.
	 * @see #getNumberOfEntries()
	 * @generated
	 */
	void setNumberOfEntries(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Of Movement Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Movement Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Movement Lines</em>' attribute.
	 * @see #setNumberOfMovementLines(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_NumberOfMovementLines()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NumberOfMovementLines' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfMovementLines();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getNumberOfMovementLines <em>Number Of Movement Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Movement Lines</em>' attribute.
	 * @see #getNumberOfMovementLines()
	 * @generated
	 */
	void setNumberOfMovementLines(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Opening Credit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening Credit Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Credit Balance</em>' attribute.
	 * @see #setOpeningCreditBalance(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_OpeningCreditBalance()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpeningCreditBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningCreditBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getOpeningCreditBalance <em>Opening Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Credit Balance</em>' attribute.
	 * @see #getOpeningCreditBalance()
	 * @generated
	 */
	void setOpeningCreditBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Opening Debit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening Debit Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Debit Balance</em>' attribute.
	 * @see #setOpeningDebitBalance(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_OpeningDebitBalance()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpeningDebitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningDebitBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getOpeningDebitBalance <em>Opening Debit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Debit Balance</em>' attribute.
	 * @see #getOpeningDebitBalance()
	 * @generated
	 */
	void setOpeningDebitBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Date</em>' attribute.
	 * @see #setOrderDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_OrderDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrderDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getOrderDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Originating ON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originating ON</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originating ON</em>' attribute.
	 * @see #setOriginatingON(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_OriginatingON()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OriginatingON' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOriginatingON();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getOriginatingON <em>Originating ON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originating ON</em>' attribute.
	 * @see #getOriginatingON()
	 * @generated
	 */
	void setOriginatingON(String value);

	/**
	 * Returns the value of the '<em><b>Payment Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.PaymentMechanismType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *          Restri��o: Meio de pagamento (CC para Cart�o de Cr�dito, CD para Cart�o de D�bito, CH para Cheque, CS para Compensa��o de saldos em conta corrente, LC para Letra comercial, MB para Multibanco, NU para Numer�rio, PR para Permuta, TB para Transfer�ncia Banc�ria, TR para Ticket Restaurante)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.PaymentMechanismType
	 * @see #setPaymentMechanism(PaymentMechanismType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_PaymentMechanism()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PaymentMechanism' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentMechanismType getPaymentMechanism();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getPaymentMechanism <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.PaymentMechanismType
	 * @see #getPaymentMechanism()
	 * @generated
	 */
	void setPaymentMechanism(PaymentMechanismType value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Period()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.PeriodType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Period' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPeriod();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_PostalCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(ProductType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Product()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Product' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductType getProduct();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(ProductType value);

	/**
	 * Returns the value of the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Code</em>' attribute.
	 * @see #setProductCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ProductCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductCode <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Code</em>' attribute.
	 * @see #getProductCode()
	 * @generated
	 */
	void setProductCode(String value);

	/**
	 * Returns the value of the '<em><b>Product Company Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Company Tax ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Company Tax ID</em>' attribute.
	 * @see #setProductCompanyTaxID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ProductCompanyTaxID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductCompanyTaxID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductCompanyTaxID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductCompanyTaxID <em>Product Company Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Company Tax ID</em>' attribute.
	 * @see #getProductCompanyTaxID()
	 * @generated
	 */
	void setProductCompanyTaxID(String value);

	/**
	 * Returns the value of the '<em><b>Product Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Description</em>' attribute.
	 * @see #setProductDescription(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ProductDescription()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax200Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductDescription <em>Product Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Description</em>' attribute.
	 * @see #getProductDescription()
	 * @generated
	 */
	void setProductDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Group</em>' attribute.
	 * @see #setProductGroup(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ProductGroup()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductGroup();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductGroup <em>Product Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Group</em>' attribute.
	 * @see #getProductGroup()
	 * @generated
	 */
	void setProductGroup(String value);

	/**
	 * Returns the value of the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product ID</em>' attribute.
	 * @see #setProductID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ProductID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTProductID" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductID <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product ID</em>' attribute.
	 * @see #getProductID()
	 * @generated
	 */
	void setProductID(String value);

	/**
	 * Returns the value of the '<em><b>Product Number Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Number Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Number Code</em>' attribute.
	 * @see #setProductNumberCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ProductNumberCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductNumberCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductNumberCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductNumberCode <em>Product Number Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Number Code</em>' attribute.
	 * @see #getProductNumberCode()
	 * @generated
	 */
	void setProductNumberCode(String value);

	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.ProductTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restri��o: Tipo de produto: P - Produtos, S - Servi�os, O - Outros, I - Impostos, taxas e encargos parafiscais excepto IVA e IS uma vez que se encontram reflectidos na tabela de impostos
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.ProductTypeType
	 * @see #setProductType(ProductTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ProductType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductType' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductTypeType getProductType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductType <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.ProductTypeType
	 * @see #getProductType()
	 * @generated
	 */
	void setProductType(ProductTypeType value);

	/**
	 * Returns the value of the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Version</em>' attribute.
	 * @see #setProductVersion(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ProductVersion()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductVersion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getProductVersion <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Version</em>' attribute.
	 * @see #getProductVersion()
	 * @generated
	 */
	void setProductVersion(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Quantity()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdecimalType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Reason()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Record ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record ID</em>' attribute.
	 * @see #setRecordID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_RecordID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RecordID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRecordID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getRecordID <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record ID</em>' attribute.
	 * @see #getRecordID()
	 * @generated
	 */
	void setRecordID(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Reference()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Region()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Region' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Self Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Billing Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Billing Indicator</em>' attribute.
	 * @see #setSelfBillingIndicator(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_SelfBillingIndicator()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SelfBillingIndicatorType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SelfBillingIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSelfBillingIndicator();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSelfBillingIndicator <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Billing Indicator</em>' attribute.
	 * @see #getSelfBillingIndicator()
	 * @generated
	 */
	void setSelfBillingIndicator(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlement Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlement Amount</em>' attribute.
	 * @see #setSettlementAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_SettlementAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SettlementAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSettlementAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSettlementAmount <em>Settlement Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Amount</em>' attribute.
	 * @see #getSettlementAmount()
	 * @generated
	 */
	void setSettlementAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Ship From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship From</em>' containment reference.
	 * @see #setShipFrom(ShippingPointStructure)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ShipFrom()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipFrom();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getShipFrom <em>Ship From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship From</em>' containment reference.
	 * @see #getShipFrom()
	 * @generated
	 */
	void setShipFrom(ShippingPointStructure value);

	/**
	 * Returns the value of the '<em><b>Ship From Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship From Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship From Address</em>' containment reference.
	 * @see #setShipFromAddress(AddressStructure)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ShipFromAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipFromAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getShipFromAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getShipFromAddress <em>Ship From Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship From Address</em>' containment reference.
	 * @see #getShipFromAddress()
	 * @generated
	 */
	void setShipFromAddress(AddressStructure value);

	/**
	 * Returns the value of the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship To</em>' containment reference.
	 * @see #setShipTo(ShippingPointStructure)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ShipTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipTo' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipTo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getShipTo <em>Ship To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship To</em>' containment reference.
	 * @see #getShipTo()
	 * @generated
	 */
	void setShipTo(ShippingPointStructure value);

	/**
	 * Returns the value of the '<em><b>Ship To Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship To Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship To Address</em>' containment reference.
	 * @see #setShipToAddress(AddressStructure)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_ShipToAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipToAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getShipToAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getShipToAddress <em>Ship To Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship To Address</em>' containment reference.
	 * @see #getShipToAddress()
	 * @generated
	 */
	void setShipToAddress(AddressStructure value);

	/**
	 * Returns the value of the '<em><b>Software Certificate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Certificate Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Certificate Number</em>' attribute.
	 * @see #setSoftwareCertificateNumber(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_SoftwareCertificateNumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SoftwareCertificateNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSoftwareCertificateNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSoftwareCertificateNumber <em>Software Certificate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Certificate Number</em>' attribute.
	 * @see #getSoftwareCertificateNumber()
	 * @generated
	 */
	void setSoftwareCertificateNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Source Billing</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.SourceBillingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * P para documento produzido na aplica��o, I para documento integrado e produzido noutra aplica��o, M para documento proveniente de recupera��o de emiss�o manual 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Billing</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.SourceBillingType
	 * @see #setSourceBilling(SourceBillingType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_SourceBilling()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SourceBilling' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceBillingType getSourceBilling();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSourceBilling <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Billing</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.SourceBillingType
	 * @see #getSourceBilling()
	 * @generated
	 */
	void setSourceBilling(SourceBillingType value);

	/**
	 * Returns the value of the '<em><b>Source Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Document ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Document ID</em>' attribute.
	 * @see #setSourceDocumentID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_SourceDocumentID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SourceDocumentID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceDocumentID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSourceDocumentID <em>Source Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Document ID</em>' attribute.
	 * @see #getSourceDocumentID()
	 * @generated
	 */
	void setSourceDocumentID(String value);

	/**
	 * Returns the value of the '<em><b>Source Documents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Documents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Documents</em>' containment reference.
	 * @see #setSourceDocuments(SourceDocumentsType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_SourceDocuments()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SourceDocuments' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceDocumentsType getSourceDocuments();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSourceDocuments <em>Source Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Documents</em>' containment reference.
	 * @see #getSourceDocuments()
	 * @generated
	 */
	void setSourceDocuments(SourceDocumentsType value);

	/**
	 * Returns the value of the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source ID</em>' attribute.
	 * @see #setSourceID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_SourceID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_StartDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTDateSpan" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StartDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Name</em>' attribute.
	 * @see #setStreetName(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_StreetName()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax90Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StreetName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStreetName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getStreetName <em>Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Name</em>' attribute.
	 * @see #getStreetName()
	 * @generated
	 */
	void setStreetName(String value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference.
	 * @see #setSupplier(SupplierType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Supplier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Supplier' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplierType getSupplier();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSupplier <em>Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' containment reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(SupplierType value);

	/**
	 * Returns the value of the '<em><b>Supplier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier ID</em>' attribute.
	 * @see #setSupplierID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_SupplierID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupplierID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSupplierID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSupplierID <em>Supplier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier ID</em>' attribute.
	 * @see #getSupplierID()
	 * @generated
	 */
	void setSupplierID(String value);

	/**
	 * Returns the value of the '<em><b>Supplier Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Tax ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Tax ID</em>' attribute.
	 * @see #setSupplierTaxID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_SupplierTaxID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupplierTaxID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSupplierTaxID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSupplierTaxID <em>Supplier Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Tax ID</em>' attribute.
	 * @see #getSupplierTaxID()
	 * @generated
	 */
	void setSupplierTaxID(String value);

	/**
	 * Returns the value of the '<em><b>System Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Entry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Entry Date</em>' attribute.
	 * @see #setSystemEntryDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_SystemEntryDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SystemEntryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSystemEntryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getSystemEntryDate <em>System Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Entry Date</em>' attribute.
	 * @see #getSystemEntryDate()
	 * @generated
	 */
	void setSystemEntryDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Tax Accounting Basis</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.TaxAccountingBasisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * C para Contabilidade, F para Fatura��o incluindo os documentos de transporte, I para Contabilidade-Fatura��o incluindo os documentos de transporte, S para Autofatura��o, E � Fatura��o, incluindo documentos de transporte, emitida por terceiros, P para Fatura��o parcial incluindo os documentos de transporte
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Accounting Basis</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.TaxAccountingBasisType
	 * @see #setTaxAccountingBasis(TaxAccountingBasisType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxAccountingBasis()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxAccountingBasis' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxAccountingBasisType getTaxAccountingBasis();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxAccountingBasis <em>Tax Accounting Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Accounting Basis</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.TaxAccountingBasisType
	 * @see #getTaxAccountingBasis()
	 * @generated
	 */
	void setTaxAccountingBasis(TaxAccountingBasisType value);

	/**
	 * Returns the value of the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Amount</em>' attribute.
	 * @see #setTaxAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxAmount <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Amount</em>' attribute.
	 * @see #getTaxAmount()
	 * @generated
	 */
	void setTaxAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Code</em>' attribute.
	 * @see #setTaxCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.TaxCodeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxCode <em>Tax Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Code</em>' attribute.
	 * @see #getTaxCode()
	 * @generated
	 */
	void setTaxCode(String value);

	/**
	 * Returns the value of the '<em><b>Tax Country Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Country Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Country Region</em>' attribute.
	 * @see #setTaxCountryRegion(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxCountryRegion()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.TaxCountryRegionType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxCountryRegion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxCountryRegion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxCountryRegion <em>Tax Country Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Country Region</em>' attribute.
	 * @see #getTaxCountryRegion()
	 * @generated
	 */
	void setTaxCountryRegion(String value);

	/**
	 * Returns the value of the '<em><b>Tax Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Entity</em>' attribute.
	 * @see #setTaxEntity(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxEntity()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxEntity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxEntity <em>Tax Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Entity</em>' attribute.
	 * @see #getTaxEntity()
	 * @generated
	 */
	void setTaxEntity(String value);

	/**
	 * Returns the value of the '<em><b>Tax Exemption Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Exemption Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Exemption Reason</em>' attribute.
	 * @see #setTaxExemptionReason(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxExemptionReason()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTPortugueseTaxExemption" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxExemptionReason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxExemptionReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxExemptionReason <em>Tax Exemption Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Exemption Reason</em>' attribute.
	 * @see #getTaxExemptionReason()
	 * @generated
	 */
	void setTaxExemptionReason(String value);

	/**
	 * Returns the value of the '<em><b>Tax Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Expiration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Expiration Date</em>' attribute.
	 * @see #setTaxExpirationDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxExpirationDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxExpirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTaxExpirationDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxExpirationDate <em>Tax Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Expiration Date</em>' attribute.
	 * @see #getTaxExpirationDate()
	 * @generated
	 */
	void setTaxExpirationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Tax Payable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Payable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Payable</em>' attribute.
	 * @see #setTaxPayable(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxPayable()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxPayable' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxPayable();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxPayable <em>Tax Payable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Payable</em>' attribute.
	 * @see #getTaxPayable()
	 * @generated
	 */
	void setTaxPayable(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Percentage</em>' attribute.
	 * @see #setTaxPercentage(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxPercentage()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdecimalType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxPercentage' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxPercentage();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxPercentage <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Percentage</em>' attribute.
	 * @see #getTaxPercentage()
	 * @generated
	 */
	void setTaxPercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Point Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Point Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Point Date</em>' attribute.
	 * @see #setTaxPointDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxPointDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxPointDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTaxPointDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxPointDate <em>Tax Point Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Point Date</em>' attribute.
	 * @see #getTaxPointDate()
	 * @generated
	 */
	void setTaxPointDate(XMLGregorianCalendar value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxTable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxTable' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxTableType getTaxTable();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxTable <em>Tax Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Table</em>' containment reference.
	 * @see #getTaxTable()
	 * @generated
	 */
	void setTaxTable(TaxTableType value);

	/**
	 * Returns the value of the '<em><b>Tax Table Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Table Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Table Entry</em>' containment reference.
	 * @see #setTaxTableEntry(TaxTableEntryType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxTableEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxTableEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxTableEntryType getTaxTableEntry();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxTableEntry <em>Tax Table Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Table Entry</em>' containment reference.
	 * @see #getTaxTableEntry()
	 * @generated
	 */
	void setTaxTableEntry(TaxTableEntryType value);

	/**
	 * Returns the value of the '<em><b>Tax Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.TaxTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.TaxTypeType
	 * @see #setTaxType(TaxTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxType' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxTypeType getTaxType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxType <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.TaxTypeType
	 * @see #getTaxType()
	 * @generated
	 */
	void setTaxType(TaxTypeType value);

	/**
	 * Returns the value of the '<em><b>Tax Verification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Verification Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Verification Date</em>' attribute.
	 * @see #setTaxVerificationDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TaxVerificationDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxVerificationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTaxVerificationDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTaxVerificationDate <em>Tax Verification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Verification Date</em>' attribute.
	 * @see #getTaxVerificationDate()
	 * @generated
	 */
	void setTaxVerificationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Telephone()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Telephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Total Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Credit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Credit</em>' attribute.
	 * @see #setTotalCredit(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TotalCredit()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TotalCredit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTotalCredit();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTotalCredit <em>Total Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Credit</em>' attribute.
	 * @see #getTotalCredit()
	 * @generated
	 */
	void setTotalCredit(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Total Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Debit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Debit</em>' attribute.
	 * @see #setTotalDebit(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TotalDebit()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TotalDebit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTotalDebit();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTotalDebit <em>Total Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Debit</em>' attribute.
	 * @see #getTotalDebit()
	 * @generated
	 */
	void setTotalDebit(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Total Quantity Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Quantity Issued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Quantity Issued</em>' attribute.
	 * @see #setTotalQuantityIssued(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TotalQuantityIssued()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdecimalType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TotalQuantityIssued' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTotalQuantityIssued();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTotalQuantityIssued <em>Total Quantity Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Quantity Issued</em>' attribute.
	 * @see #getTotalQuantityIssued()
	 * @generated
	 */
	void setTotalQuantityIssued(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date</em>' attribute.
	 * @see #setTransactionDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TransactionDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransactionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTransactionDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTransactionDate <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date</em>' attribute.
	 * @see #getTransactionDate()
	 * @generated
	 */
	void setTransactionDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Transaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction ID</em>' attribute.
	 * @see #setTransactionID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TransactionID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTTransactionID" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransactionID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransactionID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTransactionID <em>Transaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction ID</em>' attribute.
	 * @see #getTransactionID()
	 * @generated
	 */
	void setTransactionID(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.TransactionTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restri��o: Tipifica��o dos movimentos contabil�sticos - N - Normal, R - Regulariza��es do per�odo de tributa��o, A - Apuramento de resultados, J - Movimentos de Ajustamento 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.TransactionTypeType
	 * @see #setTransactionType(TransactionTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_TransactionType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransactionType' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionTypeType getTransactionType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.TransactionTypeType
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(TransactionTypeType value);

	/**
	 * Returns the value of the '<em><b>Unit Of Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Of Measure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Of Measure</em>' attribute.
	 * @see #setUnitOfMeasure(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_UnitOfMeasure()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnitOfMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getUnitOfMeasure <em>Unit Of Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measure</em>' attribute.
	 * @see #getUnitOfMeasure()
	 * @generated
	 */
	void setUnitOfMeasure(String value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Price</em>' attribute.
	 * @see #setUnitPrice(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_UnitPrice()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getUnitPrice();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getUnitPrice <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' attribute.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Warehouse ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warehouse ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warehouse ID</em>' attribute.
	 * @see #setWarehouseID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_WarehouseID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WarehouseID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWarehouseID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWarehouseID <em>Warehouse ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warehouse ID</em>' attribute.
	 * @see #getWarehouseID()
	 * @generated
	 */
	void setWarehouseID(String value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Website</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_Website()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Website' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

	/**
	 * Returns the value of the '<em><b>Withholding Tax Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTaxTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restri��o: IRS para Imposto Sobre o Rendimento das Pessoas Singulares, IRC para Imposto Sobre o Rendimento das Pessoas colectivas, IS para Imposto de selo 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Withholding Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTaxTypeType
	 * @see #setWithholdingTaxType(WithholdingTaxTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_WithholdingTaxType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WithholdingTaxType' namespace='##targetNamespace'"
	 * @generated
	 */
	WithholdingTaxTypeType getWithholdingTaxType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWithholdingTaxType <em>Withholding Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Withholding Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.WithholdingTaxTypeType
	 * @see #getWithholdingTaxType()
	 * @generated
	 */
	void setWithholdingTaxType(WithholdingTaxTypeType value);

	/**
	 * Returns the value of the '<em><b>Work Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Date</em>' attribute.
	 * @see #setWorkDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_WorkDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WorkDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getWorkDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWorkDate <em>Work Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Date</em>' attribute.
	 * @see #getWorkDate()
	 * @generated
	 */
	void setWorkDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Work Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.WorkStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, A para Anulado, F para faturado (quando para este documento tamb�m existe na tabela 4.1. o correspondente do tipo fatura ou fatura simplificada) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.WorkStatusType
	 * @see #setWorkStatus(WorkStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_WorkStatus()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WorkStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkStatusType getWorkStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWorkStatus <em>Work Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.WorkStatusType
	 * @see #getWorkStatus()
	 * @generated
	 */
	void setWorkStatus(WorkStatusType value);

	/**
	 * Returns the value of the '<em><b>Work Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Status Date</em>' attribute.
	 * @see #setWorkStatusDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_WorkStatusDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WorkStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getWorkStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWorkStatusDate <em>Work Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Status Date</em>' attribute.
	 * @see #getWorkStatusDate()
	 * @generated
	 */
	void setWorkStatusDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Work Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.WorkTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Restri��o: DC para documentos suscet�veis de apresenta��o ao cliente para confer�ncia de entrega de mercadorias ou da presta��o de servi�os
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.WorkTypeType
	 * @see #setWorkType(WorkTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentRoot_WorkType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WorkType' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkTypeType getWorkType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentRoot#getWorkType <em>Work Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.WorkTypeType
	 * @see #getWorkType()
	 * @generated
	 */
	void setWorkType(WorkTypeType value);

} // DocumentRoot
