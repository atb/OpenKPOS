/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

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
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAccountDescription <em>Account Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAddressDetail <em>Address Detail</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getARCNo <em>ARC No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getATCUD <em>ATCUD</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getATDocCodeID <em>AT Doc Code ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAuditFile <em>Audit File</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAuditFileVersion <em>Audit File Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getBillingAddress <em>Billing Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCashVATSchemeIndicator <em>Cash VAT Scheme Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCity <em>City</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getClosingCreditBalance <em>Closing Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getClosingDebitBalance <em>Closing Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCNCode <em>CN Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCompanyAddress <em>Company Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getContact <em>Contact</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCountry <em>Country</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCreditAmount <em>Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCurrencyAmount <em>Currency Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCustomer <em>Customer</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCustomerTaxID <em>Customer Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDebitAmount <em>Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDeliveryID <em>Delivery ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDocArchivalNumber <em>Doc Archival Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDocumentNumber <em>Document Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getEACCode <em>EAC Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getEmail <em>Email</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getEndDate <em>End Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getFax <em>Fax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getFiscalYear <em>Fiscal Year</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getGeneralLedgerAccounts <em>General Ledger Accounts</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getGeneralLedgerEntries <em>General Ledger Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getGLPostingDate <em>GL Posting Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getGrossTotal <em>Gross Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getGroupingCategory <em>Grouping Category</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getHeader <em>Header</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getHeaderComment <em>Header Comment</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getIECAmount <em>IEC Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getInvoiceNo <em>Invoice No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getInvoiceStatus <em>Invoice Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getInvoiceStatusDate <em>Invoice Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getJournalID <em>Journal ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getLocationID <em>Location ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementComments <em>Movement Comments</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementDate <em>Movement Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementEndTime <em>Movement End Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementStartTime <em>Movement Start Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementStatus <em>Movement Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementStatusDate <em>Movement Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementType <em>Movement Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getNetTotal <em>Net Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getNumberOfEntries <em>Number Of Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getNumberOfMovementLines <em>Number Of Movement Lines</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getOpeningCreditBalance <em>Opening Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getOpeningDebitBalance <em>Opening Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getOriginatingON <em>Originating ON</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPaymentMechanism <em>Payment Mechanism</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPaymentRefNo <em>Payment Ref No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPaymentStatusDate <em>Payment Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProduct <em>Product</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductCompanyTaxID <em>Product Company Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductDescription <em>Product Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductGroup <em>Product Group</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductID <em>Product ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductNumberCode <em>Product Number Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductType <em>Product Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getReference <em>Reference</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getRegion <em>Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSelfBillingIndicator <em>Self Billing Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getShipFrom <em>Ship From</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getShipFromAddress <em>Ship From Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getShipToAddress <em>Ship To Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSoftwareCertificateNumber <em>Software Certificate Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSourceDocumentID <em>Source Document ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSourceDocuments <em>Source Documents</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSupplierID <em>Supplier ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSupplierTaxID <em>Supplier Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSystemID <em>System ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxAccountingBasis <em>Tax Accounting Basis</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxBase <em>Tax Base</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxCode <em>Tax Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxCountryRegion <em>Tax Country Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxEntity <em>Tax Entity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxExemptionCode <em>Tax Exemption Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxExemptionReason <em>Tax Exemption Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxExpirationDate <em>Tax Expiration Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxonomyReference <em>Taxonomy Reference</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxPayable <em>Tax Payable</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxPointDate <em>Tax Point Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxTable <em>Tax Table</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxTableEntry <em>Tax Table Entry</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxType <em>Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxVerificationDate <em>Tax Verification Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getThirdPartiesBillingIndicator <em>Third Parties Billing Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTotalCredit <em>Total Credit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTotalDebit <em>Total Debit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTotalQuantityIssued <em>Total Quantity Issued</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getUNNumber <em>UN Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWarehouseID <em>Warehouse ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWebsite <em>Website</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWithholdingTaxType <em>Withholding Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWorkDate <em>Work Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWorkStatus <em>Work Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWorkStatusDate <em>Work Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWorkType <em>Work Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot()
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Mixed()
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_XSISchemaLocation()
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_AccountDescription()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax100Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccountDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAccountDescription <em>Account Description</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_AccountID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.AccountIDType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccountID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAccountID <em>Account ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Address()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAddress <em>Address</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_AddressDetail()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax210Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressDetail();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAddressDetail <em>Address Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Detail</em>' attribute.
	 * @see #getAddressDetail()
	 * @generated
	 */
	void setAddressDetail(String value);

	/**
	 * Returns the value of the '<em><b>ARC No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ARC No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ARC No</em>' attribute.
	 * @see #setARCNo(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ARCNo()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax21Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ARCNo' namespace='##targetNamespace'"
	 * @generated
	 */
	String getARCNo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getARCNo <em>ARC No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ARC No</em>' attribute.
	 * @see #getARCNo()
	 * @generated
	 */
	void setARCNo(String value);

	/**
	 * Returns the value of the '<em><b>ATCUD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATCUD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATCUD</em>' attribute.
	 * @see #setATCUD(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ATCUD()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax100Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATCUD' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATCUD();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getATCUD <em>ATCUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATCUD</em>' attribute.
	 * @see #getATCUD()
	 * @generated
	 */
	void setATCUD(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ATDocCodeID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax200Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATDocCodeID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATDocCodeID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getATDocCodeID <em>AT Doc Code ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_AuditFile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditFile' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditFileType getAuditFile();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAuditFile <em>Audit File</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_AuditFileVersion()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.AuditFileVersionType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditFileVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuditFileVersion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getAuditFileVersion <em>Audit File Version</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_BillingAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BillingAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getBillingAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getBillingAddress <em>Billing Address</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_BuildingNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax10Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BuildingNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBuildingNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getBuildingNumber <em>Building Number</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_BusinessName()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBusinessName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getBusinessName <em>Business Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Name</em>' attribute.
	 * @see #getBusinessName()
	 * @generated
	 */
	void setBusinessName(String value);

	/**
	 * Returns the value of the '<em><b>Cash VAT Scheme Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cash VAT Scheme Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cash VAT Scheme Indicator</em>' attribute.
	 * @see #setCashVATSchemeIndicator(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_CashVATSchemeIndicator()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.CashVATSchemeIndicatorType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CashVATSchemeIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCashVATSchemeIndicator();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCashVATSchemeIndicator <em>Cash VAT Scheme Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cash VAT Scheme Indicator</em>' attribute.
	 * @see #getCashVATSchemeIndicator()
	 * @generated
	 */
	void setCashVATSchemeIndicator(BigInteger value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_City()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='City' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCity <em>City</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ClosingCreditBalance()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClosingCreditBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getClosingCreditBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getClosingCreditBalance <em>Closing Credit Balance</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ClosingDebitBalance()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClosingDebitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getClosingDebitBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getClosingDebitBalance <em>Closing Debit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Debit Balance</em>' attribute.
	 * @see #getClosingDebitBalance()
	 * @generated
	 */
	void setClosingDebitBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>CN Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CN Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CN Code</em>' attribute.
	 * @see #setCNCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_CNCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTCNCode" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CNCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCNCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCNCode <em>CN Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CN Code</em>' attribute.
	 * @see #getCNCode()
	 * @generated
	 */
	void setCNCode(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_CompanyAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompanyAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructurePT getCompanyAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCompanyAddress <em>Company Address</em>}' containment reference.
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
	 * Concatenacao da Conservatoria do Registo Comercial com o numero do registo comercial separados pelo caracter espaco. Nos casos em que nao existe o registo comercial, deve ser indicado o NIF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Company ID</em>' attribute.
	 * @see #setCompanyID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_CompanyID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.CompanyIDType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompanyID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompanyID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCompanyID <em>Company ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_CompanyName()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax100Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompanyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCompanyName <em>Company Name</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Contact()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Contact' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContact();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getContact <em>Contact</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Country()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.CountryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCountry <em>Country</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_CreditAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreditAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCreditAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCreditAmount <em>Credit Amount</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_CurrencyAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CurrencyAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCurrencyAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCurrencyAmount <em>Currency Amount</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_CurrencyCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.CurrencyCodeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CurrencyCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCurrencyCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCurrencyCode <em>Currency Code</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Customer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Customer' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerType getCustomer();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCustomer <em>Customer</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_CustomerID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CustomerID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomerID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCustomerID <em>Customer ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_CustomerTaxID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CustomerTaxID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomerTaxID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getCustomerTaxID <em>Customer Tax ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_DateCreated()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTDateSpan" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateCreated' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateCreated();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDateCreated <em>Date Created</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_DebitAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DebitAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDebitAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDebitAmount <em>Debit Amount</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_DeliveryDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeliveryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDeliveryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDeliveryDate <em>Delivery Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_DeliveryID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax255Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeliveryID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeliveryID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDeliveryID <em>Delivery ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Description()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax200Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDescription <em>Description</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_DocArchivalNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFTPTDocArchivalNumber" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocArchivalNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocArchivalNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDocArchivalNumber <em>Doc Archival Number</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_DocumentNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.DocumentNumberType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getDocumentNumber <em>Document Number</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_EACCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.EACCodeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EACCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEACCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getEACCode <em>EAC Code</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Email()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax254Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Email' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getEmail <em>Email</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_EndDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTDateSpan" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getEndDate <em>End Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ExchangeRate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdecimalType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExchangeRate' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getExchangeRate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getExchangeRate <em>Exchange Rate</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Fax()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Fax' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFax();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getFax <em>Fax</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_FiscalYear()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.FiscalYearType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FiscalYear' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFiscalYear();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getFiscalYear <em>Fiscal Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiscal Year</em>' attribute.
	 * @see #getFiscalYear()
	 * @generated
	 */
	void setFiscalYear(BigInteger value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_GeneralLedgerAccounts()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeneralLedgerAccounts' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralLedgerAccountsType getGeneralLedgerAccounts();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getGeneralLedgerAccounts <em>General Ledger Accounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Ledger Accounts</em>' containment reference.
	 * @see #getGeneralLedgerAccounts()
	 * @generated
	 */
	void setGeneralLedgerAccounts(GeneralLedgerAccountsType value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_GeneralLedgerEntries()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeneralLedgerEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralLedgerEntriesType getGeneralLedgerEntries();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getGeneralLedgerEntries <em>General Ledger Entries</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_GLPostingDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GLPostingDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGLPostingDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getGLPostingDate <em>GL Posting Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_GrossTotal()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GrossTotal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getGrossTotal();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getGrossTotal <em>Gross Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Total</em>' attribute.
	 * @see #getGrossTotal()
	 * @generated
	 */
	void setGrossTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Grouping Category</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.GroupingCategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GR para conta de 1. grau da contabilidade geral, GA para conta agregadora ou integradora da contabilidade geral, GM para conta de movimento da contabilidade geral, AR para conta de 1. grau da contabilidade analitica, AA para conta agregadora ou integradora da contabilidade analitica, AM para conta de movimento da contabilidade analitica 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouping Category</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.GroupingCategoryType
	 * @see #setGroupingCategory(GroupingCategoryType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_GroupingCategory()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroupingCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupingCategoryType getGroupingCategory();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getGroupingCategory <em>Grouping Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Category</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.GroupingCategoryType
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Hash()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax172Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Hash' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getHash <em>Hash</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_HashControl()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTHashControl" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HashControl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHashControl();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getHashControl <em>Hash Control</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Header()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderType getHeader();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getHeader <em>Header</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_HeaderComment()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax255Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HeaderComment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHeaderComment();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getHeaderComment <em>Header Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Comment</em>' attribute.
	 * @see #getHeaderComment()
	 * @generated
	 */
	void setHeaderComment(String value);

	/**
	 * Returns the value of the '<em><b>IEC Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IEC Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IEC Amount</em>' attribute.
	 * @see #setIECAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_IECAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IECAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getIECAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getIECAmount <em>IEC Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IEC Amount</em>' attribute.
	 * @see #getIECAmount()
	 * @generated
	 */
	void setIECAmount(BigDecimal value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_InvoiceDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getInvoiceDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getInvoiceDate <em>Invoice Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_InvoiceNo()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.InvoiceNoType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceNo' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInvoiceNo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getInvoiceNo <em>Invoice No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice No</em>' attribute.
	 * @see #getInvoiceNo()
	 * @generated
	 */
	void setInvoiceNo(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, S para Autofaturacao, A para Documento anulado, R para Documento de resumo doutros documentos criados noutras aplicacoes e gerado nesta aplicacao, F para Documento faturado 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.InvoiceStatusType
	 * @see #setInvoiceStatus(InvoiceStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_InvoiceStatus()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceStatusType getInvoiceStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getInvoiceStatus <em>Invoice Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.InvoiceStatusType
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_InvoiceStatusDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getInvoiceStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getInvoiceStatusDate <em>Invoice Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Status Date</em>' attribute.
	 * @see #getInvoiceStatusDate()
	 * @generated
	 */
	void setInvoiceStatusDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Invoice Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Restricao:FT para Fatura, emitida nos termos do artigo 36. do Codigo do IVA, FS para Fatura simplificada, emitida nos termos do artigo 40. do Codigo do IVA, FR para Fatura-recibo, ND para Nota de debito, NC para Nota de credito, VD para Venda a dinheiro e factura/recibo (a), TV para Talao de venda (a), TD para Talao de devolucao (a), AA para Alienacao de ativos (a), DA para Devolucao de  ativos (a). Para o setor Segurador, ainda pode ser preenchido com: RP para Premio ou recibo de premio, RE para Estorno ou recibo de estorno, CS para Imputacao a co-seguradoras, LD para Imputacao a co-seguradora lider, RA para Resseguro aceite. (a) Para os dados ate 2012-12-31
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.InvoiceTypeType
	 * @see #setInvoiceType(InvoiceTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_InvoiceType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceType' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceTypeType getInvoiceType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getInvoiceType <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.InvoiceTypeType
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_JournalID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTJournalID" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JournalID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJournalID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getJournalID <em>Journal ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_LineNumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLineNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getLineNumber <em>Line Number</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_LocationID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocationID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getLocationID <em>Location ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_MovementComments()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementComments' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMovementComments();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementComments <em>Movement Comments</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_MovementDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementDate <em>Movement Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_MovementEndTime()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementEndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementEndTime();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementEndTime <em>Movement End Time</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_MovementStartTime()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementStartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementStartTime();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementStartTime <em>Movement Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Start Time</em>' attribute.
	 * @see #getMovementStartTime()
	 * @generated
	 */
	void setMovementStartTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Movement Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.MovementStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, T para Por conta de terceiros, A para Documento anulado, F para Documento faturado, quando para este documento tambem existe na tabela 4.1. para Documentos comerciais a clientes (SalesInvoices) o correspondente do tipo fatura ou fatura simplificada, R para Documento de resumo doutros documentos criados noutras aplicacoes e gerado nesta aplicacao 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Movement Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.MovementStatusType
	 * @see #setMovementStatus(MovementStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_MovementStatus()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	MovementStatusType getMovementStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementStatus <em>Movement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.MovementStatusType
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_MovementStatusDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementStatusDate <em>Movement Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Status Date</em>' attribute.
	 * @see #getMovementStatusDate()
	 * @generated
	 */
	void setMovementStatusDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Movement Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.MovementTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Restricao: Tipos de Documento (GR para Guia de remessa, GT para Guia de transporte incluindo as globais, GA para Guia de movimentacao de ativos fixos proprios, GC para Guia de consignacao, GD para Guia ou nota de devolucao
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Movement Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.MovementTypeType
	 * @see #setMovementType(MovementTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_MovementType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MovementType' namespace='##targetNamespace'"
	 * @generated
	 */
	MovementTypeType getMovementType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getMovementType <em>Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.MovementTypeType
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_NetTotal()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetTotal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getNetTotal();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getNetTotal <em>Net Total</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_NumberOfEntries()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NumberOfEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfEntries();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getNumberOfEntries <em>Number Of Entries</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_NumberOfMovementLines()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NumberOfMovementLines' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfMovementLines();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getNumberOfMovementLines <em>Number Of Movement Lines</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_OpeningCreditBalance()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpeningCreditBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningCreditBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getOpeningCreditBalance <em>Opening Credit Balance</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_OpeningDebitBalance()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpeningDebitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningDebitBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getOpeningDebitBalance <em>Opening Debit Balance</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_OrderDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrderDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getOrderDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getOrderDate <em>Order Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_OriginatingON()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OriginatingON' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOriginatingON();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getOriginatingON <em>Originating ON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originating ON</em>' attribute.
	 * @see #getOriginatingON()
	 * @generated
	 */
	void setOriginatingON(String value);

	/**
	 * Returns the value of the '<em><b>Payment Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentMechanismType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *          Restricao:CC para Cartao credito, CD para Cartao debito, CH para Cheque bancario, CI para credito documentario internacional, CO para Cheque ou cartao oferta, CS para Compensacao de saldos em conta corrente, DE para Dinheiro eletronico, por exemplo em cartoes de fidelidade ou de pontos, LC para Letra comercial, MB para Referencias de pagamento para Multibanco, NU para Numerario, OU para Outros meios aqui nao assinalados, PR para Permuta de bens, TB para Transferencia bancaria ou debito direto autorizado, TR para titulos de compensacao extrassalarial independentemente do seu suporte, por exemplo, titulos de refeicao, educacao, etc.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.PaymentMechanismType
	 * @see #setPaymentMechanism(PaymentMechanismType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_PaymentMechanism()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PaymentMechanism' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentMechanismType getPaymentMechanism();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPaymentMechanism <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.PaymentMechanismType
	 * @see #getPaymentMechanism()
	 * @generated
	 */
	void setPaymentMechanism(PaymentMechanismType value);

	/**
	 * Returns the value of the '<em><b>Payment Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Ref No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Ref No</em>' attribute.
	 * @see #setPaymentRefNo(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_PaymentRefNo()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.PaymentRefNoType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PaymentRefNo' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPaymentRefNo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPaymentRefNo <em>Payment Ref No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Ref No</em>' attribute.
	 * @see #getPaymentRefNo()
	 * @generated
	 */
	void setPaymentRefNo(String value);

	/**
	 * Returns the value of the '<em><b>Payment Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para normal, A para Anulado 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.PaymentStatusType
	 * @see #setPaymentStatus(PaymentStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_PaymentStatus()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PaymentStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentStatusType getPaymentStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPaymentStatus <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.PaymentStatusType
	 * @see #getPaymentStatus()
	 * @generated
	 */
	void setPaymentStatus(PaymentStatusType value);

	/**
	 * Returns the value of the '<em><b>Payment Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Status Date</em>' attribute.
	 * @see #setPaymentStatusDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_PaymentStatusDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PaymentStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getPaymentStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPaymentStatusDate <em>Payment Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Status Date</em>' attribute.
	 * @see #getPaymentStatusDate()
	 * @generated
	 */
	void setPaymentStatusDate(XMLGregorianCalendar value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Period()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.PeriodType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Period' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPeriod();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPeriod <em>Period</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_PostalCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getPostalCode <em>Postal Code</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Product()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Product' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductType getProduct();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProduct <em>Product</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ProductCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductCode <em>Product Code</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ProductCompanyTaxID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductCompanyTaxID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductCompanyTaxID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductCompanyTaxID <em>Product Company Tax ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ProductDescription()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTProductDescription" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductDescription <em>Product Description</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ProductGroup()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductGroup();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductGroup <em>Product Group</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ProductID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTProductID" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductID <em>Product ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ProductNumberCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductNumberCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductNumberCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductNumberCode <em>Product Number Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Number Code</em>' attribute.
	 * @see #getProductNumberCode()
	 * @generated
	 */
	void setProductNumberCode(String value);

	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.ProductTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricao: P para Produtos, S para Servicos, O para Outros (Ex: portes debitados, adiantamentos recebidos ou alienacao de ativos), E para Impostos Especiais de Consumo (ex.:IABA, ISP, IT); I para impostos, taxas e encargos parafiscais exceto IVA e IS que deverao ser refletidos na tabela 2.5 Tabela de impostos (TaxTable)e Impostos Especiais de Consumo 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.ProductTypeType
	 * @see #setProductType(ProductTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ProductType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductType' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductTypeType getProductType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductType <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.ProductTypeType
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ProductVersion()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductVersion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getProductVersion <em>Product Version</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Quantity()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdecimalType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getQuantity <em>Quantity</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Reason()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getReason <em>Reason</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_RecordID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RecordID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRecordID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getRecordID <em>Record ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Reference()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getReference <em>Reference</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Region()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Region' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getRegion <em>Region</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_SelfBillingIndicator()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SelfBillingIndicatorType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SelfBillingIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSelfBillingIndicator();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSelfBillingIndicator <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Billing Indicator</em>' attribute.
	 * @see #getSelfBillingIndicator()
	 * @generated
	 */
	void setSelfBillingIndicator(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_SerialNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax100Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_SettlementAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SettlementAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSettlementAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSettlementAmount <em>Settlement Amount</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ShipFrom()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipFrom();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getShipFrom <em>Ship From</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ShipFromAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipFromAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getShipFromAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getShipFromAddress <em>Ship From Address</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ShipTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipTo' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipTo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getShipTo <em>Ship To</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ShipToAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipToAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getShipToAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getShipToAddress <em>Ship To Address</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_SoftwareCertificateNumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SoftwareCertificateNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSoftwareCertificateNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSoftwareCertificateNumber <em>Software Certificate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Certificate Number</em>' attribute.
	 * @see #getSoftwareCertificateNumber()
	 * @generated
	 */
	void setSoftwareCertificateNumber(BigInteger value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_SourceDocumentID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SourceDocumentID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceDocumentID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSourceDocumentID <em>Source Document ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_SourceDocuments()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SourceDocuments' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceDocumentsType getSourceDocuments();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSourceDocuments <em>Source Documents</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_SourceID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSourceID <em>Source ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_StartDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTDateSpan" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StartDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getStartDate <em>Start Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_StreetName()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax200Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StreetName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStreetName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getStreetName <em>Street Name</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Supplier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Supplier' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplierType getSupplier();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSupplier <em>Supplier</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_SupplierID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupplierID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSupplierID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSupplierID <em>Supplier ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_SupplierTaxID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupplierTaxID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSupplierTaxID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSupplierTaxID <em>Supplier Tax ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_SystemEntryDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SystemEntryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSystemEntryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSystemEntryDate <em>System Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Entry Date</em>' attribute.
	 * @see #getSystemEntryDate()
	 * @generated
	 */
	void setSystemEntryDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>System ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System ID</em>' attribute.
	 * @see #setSystemID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_SystemID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SystemID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getSystemID <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System ID</em>' attribute.
	 * @see #getSystemID()
	 * @generated
	 */
	void setSystemID(String value);

	/**
	 * Returns the value of the '<em><b>Tax Accounting Basis</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.TaxAccountingBasisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * C para Contabilidade, E para Faturacao emitida por terceiros, F para Faturacao, I para Contabilidade integrada com a faturacao, P para Faturacao parcial, R para Recibos (a), S para Autofaturacao, T para Documentos de transporte (a). (a) Deve ser indicado este tipo, se o programa apenas este emitir este tipo de documento. Caso contrario, devera ser utilizado o tipo C, F ou I 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Accounting Basis</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxAccountingBasisType
	 * @see #setTaxAccountingBasis(TaxAccountingBasisType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxAccountingBasis()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxAccountingBasis' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxAccountingBasisType getTaxAccountingBasis();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxAccountingBasis <em>Tax Accounting Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Accounting Basis</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxAccountingBasisType
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxAmount <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Amount</em>' attribute.
	 * @see #getTaxAmount()
	 * @generated
	 */
	void setTaxAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Base</em>' attribute.
	 * @see #setTaxBase(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxBase()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxBase' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxBase();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxBase <em>Tax Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Base</em>' attribute.
	 * @see #getTaxBase()
	 * @generated
	 */
	void setTaxBase(BigDecimal value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.TaxCodeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxCode <em>Tax Code</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxCountryRegion()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.TaxCountryRegionType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxCountryRegion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxCountryRegion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxCountryRegion <em>Tax Country Region</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxEntity()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxEntity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxEntity <em>Tax Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Entity</em>' attribute.
	 * @see #getTaxEntity()
	 * @generated
	 */
	void setTaxEntity(String value);

	/**
	 * Returns the value of the '<em><b>Tax Exemption Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Exemption Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Exemption Code</em>' attribute.
	 * @see #setTaxExemptionCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxExemptionCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTPortugueseTaxExemptionCode" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxExemptionCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxExemptionCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxExemptionCode <em>Tax Exemption Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Exemption Code</em>' attribute.
	 * @see #getTaxExemptionCode()
	 * @generated
	 */
	void setTaxExemptionCode(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxExemptionReason()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTPortugueseTaxExemptionReason" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxExemptionReason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxExemptionReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxExemptionReason <em>Tax Exemption Reason</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxExpirationDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxExpirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTaxExpirationDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxExpirationDate <em>Tax Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Expiration Date</em>' attribute.
	 * @see #getTaxExpirationDate()
	 * @generated
	 */
	void setTaxExpirationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Taxonomy Reference</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.TaxonomyReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * S para SNC base (Taxonomia S), M para SNC microentidades (Taxonomia M), N para Normas Internacionais de Contabilidade (Taxonomia S), O para outros referenciais contabilisticos cuja taxonomia nao se encontra codificada
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taxonomy Reference</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxonomyReferenceType
	 * @see #setTaxonomyReference(TaxonomyReferenceType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxonomyReference()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxonomyReference' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxonomyReferenceType getTaxonomyReference();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxonomyReference <em>Taxonomy Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxonomy Reference</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxonomyReferenceType
	 * @see #getTaxonomyReference()
	 * @generated
	 */
	void setTaxonomyReference(TaxonomyReferenceType value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxPayable()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxPayable' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxPayable();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxPayable <em>Tax Payable</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxPercentage()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdecimalType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxPercentage' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxPercentage();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxPercentage <em>Tax Percentage</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxPointDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxPointDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTaxPointDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxPointDate <em>Tax Point Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxTable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxTable' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxTableType getTaxTable();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxTable <em>Tax Table</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxTableEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxTableEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxTableEntryType getTaxTableEntry();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxTableEntry <em>Tax Table Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Table Entry</em>' containment reference.
	 * @see #getTaxTableEntry()
	 * @generated
	 */
	void setTaxTableEntry(TaxTableEntryType value);

	/**
	 * Returns the value of the '<em><b>Tax Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.TaxTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxTypeType
	 * @see #setTaxType(TaxTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxType' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxTypeType getTaxType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxType <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxTypeType
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TaxVerificationDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxVerificationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTaxVerificationDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTaxVerificationDate <em>Tax Verification Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Telephone()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Telephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Third Parties Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Parties Billing Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Parties Billing Indicator</em>' attribute.
	 * @see #setThirdPartiesBillingIndicator(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_ThirdPartiesBillingIndicator()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.ThirdPartiesBillingIndicatorType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThirdPartiesBillingIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getThirdPartiesBillingIndicator();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getThirdPartiesBillingIndicator <em>Third Parties Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Parties Billing Indicator</em>' attribute.
	 * @see #getThirdPartiesBillingIndicator()
	 * @generated
	 */
	void setThirdPartiesBillingIndicator(BigInteger value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TotalCredit()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TotalCredit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTotalCredit();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTotalCredit <em>Total Credit</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TotalDebit()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TotalDebit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTotalDebit();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTotalDebit <em>Total Debit</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TotalQuantityIssued()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdecimalType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TotalQuantityIssued' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTotalQuantityIssued();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTotalQuantityIssued <em>Total Quantity Issued</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TransactionDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransactionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTransactionDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTransactionDate <em>Transaction Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TransactionID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTTransactionID" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransactionID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransactionID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTransactionID <em>Transaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction ID</em>' attribute.
	 * @see #getTransactionID()
	 * @generated
	 */
	void setTransactionID(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.TransactionTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricao: N para Normal, R para Regularizacoes do periodo de tributacao, A para Apuramento de resultados, J para Movimentos de ajustamento 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TransactionTypeType
	 * @see #setTransactionType(TransactionTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_TransactionType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransactionType' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionTypeType getTransactionType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TransactionTypeType
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_UnitOfMeasure()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnitOfMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getUnitOfMeasure <em>Unit Of Measure</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_UnitPrice()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getUnitPrice();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getUnitPrice <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' attribute.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>UN Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UN Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UN Number</em>' attribute.
	 * @see #setUNNumber(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_UNNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTUNNumber" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UNNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUNNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getUNNumber <em>UN Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UN Number</em>' attribute.
	 * @see #getUNNumber()
	 * @generated
	 */
	void setUNNumber(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_WarehouseID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WarehouseID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWarehouseID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWarehouseID <em>Warehouse ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_Website()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Website' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

	/**
	 * Returns the value of the '<em><b>Withholding Tax Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.WithholdingTaxTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricao: IRS para Imposto Sobre o Rendimento das Pessoas Singulares, IRC para Imposto Sobre o Rendimento das Pessoas colectivas, IS para Imposto do selo 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Withholding Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.WithholdingTaxTypeType
	 * @see #setWithholdingTaxType(WithholdingTaxTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_WithholdingTaxType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WithholdingTaxType' namespace='##targetNamespace'"
	 * @generated
	 */
	WithholdingTaxTypeType getWithholdingTaxType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWithholdingTaxType <em>Withholding Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Withholding Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.WithholdingTaxTypeType
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_WorkDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WorkDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getWorkDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWorkDate <em>Work Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Date</em>' attribute.
	 * @see #getWorkDate()
	 * @generated
	 */
	void setWorkDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Work Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.WorkStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, A para Anulado, F para faturado (quando para este documento tambem existe na tabela 4.1. o correspondente do tipo fatura ou fatura simplificada) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.WorkStatusType
	 * @see #setWorkStatus(WorkStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_WorkStatus()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WorkStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkStatusType getWorkStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWorkStatus <em>Work Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.WorkStatusType
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_WorkStatusDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WorkStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getWorkStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWorkStatusDate <em>Work Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Status Date</em>' attribute.
	 * @see #getWorkStatusDate()
	 * @generated
	 */
	void setWorkStatusDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Work Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.WorkTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Restricao: DC para documentos emitidos ate 2017-06-30, CM para consulta de mesa, CC para credito de consignacao, FC para fatura de consignacao nos termos do art.38 do CIVA, FO para folha de obra, NE para nota de encomenda, OU para outros documentos suscetiveis de apresentacao ao cliente para conferencia de mercadorias ou de prestacao de servicos que nao se encontrem aqui devidamente identificados (ou seus equivalentes), OR para orcamento, PF para fatura pro-forma. Para o setor Segurador quando para os tipos de documentos a seguir identificados tambem deva existir na tabela 4.1 - Documentos comerciais a clientes (SalesInvoices) a correspondente fatura ou documento rectificativo de fatura, ainda pode ser preenchido com RP para premio ou recibo de premio, RE para estorno ou recibo de estorno, CS para imputacao a co-seguradoras, LD para imputacao a co-seguradora lider, RA para resseguro aceite.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.WorkTypeType
	 * @see #setWorkType(WorkTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentRoot_WorkType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WorkType' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkTypeType getWorkType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot#getWorkType <em>Work Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.WorkTypeType
	 * @see #getWorkType()
	 * @generated
	 */
	void setWorkType(WorkTypeType value);

} // DocumentRoot
