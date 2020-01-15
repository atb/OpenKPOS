/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2;

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
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAccountDescription <em>Account Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAddressDetail <em>Address Detail</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAuditFile <em>Audit File</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAuditFileVersion <em>Audit File Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBillingAddress <em>Billing Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCity <em>City</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyAddress <em>Company Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getContact <em>Contact</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCountry <em>Country</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCreditAmount <em>Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCreditNote <em>Credit Note</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrency <em>Currency</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyCreditAmount <em>Currency Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyDebitAmount <em>Currency Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomer <em>Customer</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomerTaxID <em>Customer Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDebitAmount <em>Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDeliveryID <em>Delivery ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDocArchivalNumber <em>Doc Archival Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getEmail <em>Email</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getEndDate <em>End Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getFax <em>Fax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getFiscalYear <em>Fiscal Year</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGeneralLedger <em>General Ledger</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGeneralLedgerEntries <em>General Ledger Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGLPostingDate <em>GL Posting Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGrossTotal <em>Gross Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHeader <em>Header</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHeaderComment <em>Header Comment</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceNo <em>Invoice No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceStatus <em>Invoice Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getJournalID <em>Journal ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getNetTotal <em>Net Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getNumberOfEntries <em>Number Of Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOpeningCreditBalance <em>Opening Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOpeningDebitBalance <em>Opening Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOrderReferences <em>Order References</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOriginatingON <em>Originating ON</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPaymentMechanism <em>Payment Mechanism</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProduct <em>Product</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductCompanyTaxID <em>Product Company Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductDescription <em>Product Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductGroup <em>Product Group</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductID <em>Product ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductNumberCode <em>Product Number Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductType <em>Product Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReference <em>Reference</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReferences <em>References</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getRegion <em>Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSelfBillingIndicator <em>Self Billing Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSettlement <em>Settlement</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipFrom <em>Ship From</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipFromAddress <em>Ship From Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipToAddress <em>Ship To Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSoftwareCertificateNumber <em>Software Certificate Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceDocumentID <em>Source Document ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceDocuments <em>Source Documents</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplierID <em>Supplier ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplierTaxID <em>Supplier Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTax <em>Tax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxAccountingBasis <em>Tax Accounting Basis</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxCode <em>Tax Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxCountryRegion <em>Tax Country Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxEntity <em>Tax Entity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxExemptionReason <em>Tax Exemption Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxExpirationDate <em>Tax Expiration Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPayable <em>Tax Payable</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPointDate <em>Tax Point Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxTable <em>Tax Table</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxTableEntry <em>Tax Table Entry</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxType <em>Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxVerificationDate <em>Tax Verification Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTotalCredit <em>Total Credit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTotalDebit <em>Total Debit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getWebsite <em>Website</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot()
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Mixed()
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_XSISchemaLocation()
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_AccountDescription()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccountDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAccountDescription <em>Account Description</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_AccountID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.AccountIDType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccountID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAccountID <em>Account ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Address()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAddress <em>Address</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_AddressDetail()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressDetail();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAddressDetail <em>Address Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Detail</em>' attribute.
	 * @see #getAddressDetail()
	 * @generated
	 */
	void setAddressDetail(String value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_AuditFile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditFile' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditFileType getAuditFile();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAuditFile <em>Audit File</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_AuditFileVersion()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.AuditFileVersionType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditFileVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuditFileVersion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getAuditFileVersion <em>Audit File Version</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_BillingAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BillingAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getBillingAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBillingAddress <em>Billing Address</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_BuildingNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax10Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BuildingNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBuildingNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBuildingNumber <em>Building Number</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_BusinessName()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBusinessName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getBusinessName <em>Business Name</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_City()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='City' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_CompanyAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompanyAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructurePT getCompanyAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyAddress <em>Company Address</em>}' containment reference.
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
	 * Obtém-se pela concatenação da Conservatória do Registo Comercial com o número do registo comercial separados pelo carácter espaço. Nos casos em que não existe o registo comercial, deve ser indicado o NIF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Company ID</em>' attribute.
	 * @see #setCompanyID(String)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_CompanyID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.CompanyIDType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompanyID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompanyID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyID <em>Company ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_CompanyName()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompanyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCompanyName <em>Company Name</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Contact()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Contact' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContact();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getContact <em>Contact</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Country()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.CountryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCountry <em>Country</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_CreditAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreditAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCreditAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCreditAmount <em>Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Amount</em>' attribute.
	 * @see #getCreditAmount()
	 * @generated
	 */
	void setCreditAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Credit Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Note</em>' containment reference.
	 * @see #setCreditNote(CreditNoteType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_CreditNote()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CreditNote' namespace='##targetNamespace'"
	 * @generated
	 */
	CreditNoteType getCreditNote();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCreditNote <em>Credit Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Note</em>' containment reference.
	 * @see #getCreditNote()
	 * @generated
	 */
	void setCreditNote(CreditNoteType value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' containment reference.
	 * @see #setCurrency(CurrencyType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Currency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Currency' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrencyType getCurrency();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrency <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' containment reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(CurrencyType value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_CurrencyCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.CurrencyCodeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CurrencyCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCurrencyCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyCode <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Code</em>' attribute.
	 * @see #getCurrencyCode()
	 * @generated
	 */
	void setCurrencyCode(String value);

	/**
	 * Returns the value of the '<em><b>Currency Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Credit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Credit Amount</em>' attribute.
	 * @see #setCurrencyCreditAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_CurrencyCreditAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CurrencyCreditAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCurrencyCreditAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyCreditAmount <em>Currency Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Credit Amount</em>' attribute.
	 * @see #getCurrencyCreditAmount()
	 * @generated
	 */
	void setCurrencyCreditAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Debit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Debit Amount</em>' attribute.
	 * @see #setCurrencyDebitAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_CurrencyDebitAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CurrencyDebitAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCurrencyDebitAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCurrencyDebitAmount <em>Currency Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Debit Amount</em>' attribute.
	 * @see #getCurrencyDebitAmount()
	 * @generated
	 */
	void setCurrencyDebitAmount(BigDecimal value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Customer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Customer' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomerType getCustomer();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomer <em>Customer</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_CustomerID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CustomerID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomerID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomerID <em>Customer ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_CustomerTaxID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CustomerTaxID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomerTaxID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getCustomerTaxID <em>Customer Tax ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_DateCreated()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTDateSpan" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateCreated' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateCreated();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDateCreated <em>Date Created</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_DebitAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DebitAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDebitAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDebitAmount <em>Debit Amount</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_DeliveryDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeliveryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDeliveryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDeliveryDate <em>Delivery Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_DeliveryID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeliveryID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDeliveryID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDeliveryID <em>Delivery ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Description()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDescription <em>Description</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_DocArchivalNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocArchivalNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocArchivalNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getDocArchivalNumber <em>Doc Archival Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Archival Number</em>' attribute.
	 * @see #getDocArchivalNumber()
	 * @generated
	 */
	void setDocArchivalNumber(String value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Email()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Email' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getEmail <em>Email</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_EndDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTDateSpan" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(XMLGregorianCalendar value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Fax()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Fax' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFax();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getFax <em>Fax</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_FiscalYear()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.FiscalYearType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FiscalYear' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFiscalYear();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getFiscalYear <em>Fiscal Year</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_GeneralLedger()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeneralLedger' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralLedgerType getGeneralLedger();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGeneralLedger <em>General Ledger</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_GeneralLedgerEntries()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeneralLedgerEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralLedgerEntriesType getGeneralLedgerEntries();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGeneralLedgerEntries <em>General Ledger Entries</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_GLPostingDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GLPostingDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGLPostingDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGLPostingDate <em>GL Posting Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_GrossTotal()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GrossTotal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getGrossTotal();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getGrossTotal <em>Gross Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Total</em>' attribute.
	 * @see #getGrossTotal()
	 * @generated
	 */
	void setGrossTotal(BigDecimal value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Hash()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax200Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Hash' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHash <em>Hash</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_HashControl()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax40Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HashControl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHashControl();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHashControl <em>Hash Control</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Header()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderType getHeader();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHeader <em>Header</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_HeaderComment()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax255Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HeaderComment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHeaderComment();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getHeaderComment <em>Header Comment</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_InvoiceDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getInvoiceDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceDate <em>Invoice Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_InvoiceNo()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.InvoiceNoType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceNo' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInvoiceNo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceNo <em>Invoice No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice No</em>' attribute.
	 * @see #getInvoiceNo()
	 * @generated
	 */
	void setInvoiceNo(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, A para Anulado, F para Facturado, S para autofacturação
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType
	 * @see #setInvoiceStatus(InvoiceStatusType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_InvoiceStatus()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceStatusType getInvoiceStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceStatus <em>Invoice Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	void setInvoiceStatus(InvoiceStatusType value);

	/**
	 * Returns the value of the '<em><b>Invoice Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Restrição: Tipos de Documento (FS-Fatura Simplificada, FT-Factura ou documento equivalente, ND-Nota de débito, NC-Nota de Crédito,VD-Venda a dinheiro e Factura/Recibo, TV-Talão de Venda,
	 *         TD-Talão de devolução,AA-Alienação Activos,DA-Devolução Activos, RP-Prémio ou Recibo Prémio, RE-Estorno ou Recibo de Estorno, CS-Imputação a Co-Seguradoras,
	 *         LD-Imputação a Co-Seguradora Líder, RA-Resseguro Aceite)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType
	 * @see #setInvoiceType(InvoiceTypeType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_InvoiceType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InvoiceType' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceTypeType getInvoiceType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getInvoiceType <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_JournalID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JournalID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJournalID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getJournalID <em>Journal ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_LineNumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLineNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(BigInteger value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_NetTotal()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetTotal' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getNetTotal();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getNetTotal <em>Net Total</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_NumberOfEntries()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NumberOfEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfEntries();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getNumberOfEntries <em>Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Entries</em>' attribute.
	 * @see #getNumberOfEntries()
	 * @generated
	 */
	void setNumberOfEntries(BigInteger value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_OpeningCreditBalance()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpeningCreditBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningCreditBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOpeningCreditBalance <em>Opening Credit Balance</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_OpeningDebitBalance()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OpeningDebitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningDebitBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOpeningDebitBalance <em>Opening Debit Balance</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_OrderDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrderDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getOrderDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Order References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order References</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order References</em>' containment reference.
	 * @see #setOrderReferences(OrderReferencesType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_OrderReferences()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrderReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderReferencesType getOrderReferences();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOrderReferences <em>Order References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order References</em>' containment reference.
	 * @see #getOrderReferences()
	 * @generated
	 */
	void setOrderReferences(OrderReferencesType value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_OriginatingON()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OriginatingON' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOriginatingON();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getOriginatingON <em>Originating ON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originating ON</em>' attribute.
	 * @see #getOriginatingON()
	 * @generated
	 */
	void setOriginatingON(String value);

	/**
	 * Returns the value of the '<em><b>Payment Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restrição: Meio de pagamento: NU - Numerário, CH - Cheque, CC - Cartão de Crédito, CD – Cartão de Débito, TB - Transferência Bancária, TR - Ticket Restaurante
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType
	 * @see #setPaymentMechanism(PaymentMechanismType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_PaymentMechanism()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PaymentMechanism' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentMechanismType getPaymentMechanism();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPaymentMechanism <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Period()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.PeriodType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Period' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPeriod();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPeriod <em>Period</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_PostalCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getPostalCode <em>Postal Code</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Product()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Product' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductType getProduct();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProduct <em>Product</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ProductCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductCode <em>Product Code</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ProductCompanyTaxID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductCompanyTaxID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductCompanyTaxID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductCompanyTaxID <em>Product Company Tax ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ProductDescription()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductDescription <em>Product Description</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ProductGroup()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductGroup();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductGroup <em>Product Group</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ProductID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTProductID" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductID <em>Product ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ProductNumberCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductNumberCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductNumberCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductNumberCode <em>Product Number Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Number Code</em>' attribute.
	 * @see #getProductNumberCode()
	 * @generated
	 */
	void setProductNumberCode(String value);

	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restrição: Tipo de produto: P - Produtos, S - Serviços, O - Outros, I - Impostos, taxas e encargos parafiscais
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType
	 * @see #setProductType(ProductTypeType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ProductType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductType' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductTypeType getProductType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductType <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ProductVersion()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductVersion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getProductVersion <em>Product Version</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Quantity()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFdecimalType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getQuantity <em>Quantity</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Reason()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReason <em>Reason</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_RecordID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax10Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RecordID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRecordID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getRecordID <em>Record ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Reference()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference.
	 * @see #setReferences(ReferencesType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_References()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='References' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferencesType getReferences();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getReferences <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' containment reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(ReferencesType value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Region()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Region' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getRegion <em>Region</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_SelfBillingIndicator()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SelfBillingIndicatorType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SelfBillingIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSelfBillingIndicator();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSelfBillingIndicator <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Billing Indicator</em>' attribute.
	 * @see #getSelfBillingIndicator()
	 * @generated
	 */
	void setSelfBillingIndicator(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Settlement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlement</em>' containment reference.
	 * @see #setSettlement(SettlementType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Settlement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Settlement' namespace='##targetNamespace'"
	 * @generated
	 */
	SettlementType getSettlement();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSettlement <em>Settlement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement</em>' containment reference.
	 * @see #getSettlement()
	 * @generated
	 */
	void setSettlement(SettlementType value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_SettlementAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SettlementAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSettlementAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSettlementAmount <em>Settlement Amount</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ShipFrom()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipFrom();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipFrom <em>Ship From</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ShipFromAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipFromAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getShipFromAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipFromAddress <em>Ship From Address</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ShipTo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipTo' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipTo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipTo <em>Ship To</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_ShipToAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShipToAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructure getShipToAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getShipToAddress <em>Ship To Address</em>}' containment reference.
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
	 * @see #setSoftwareCertificateNumber(String)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_SoftwareCertificateNumber()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SoftwareCertificateNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSoftwareCertificateNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSoftwareCertificateNumber <em>Software Certificate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Certificate Number</em>' attribute.
	 * @see #getSoftwareCertificateNumber()
	 * @generated
	 */
	void setSoftwareCertificateNumber(String value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_SourceDocumentID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SourceDocumentID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceDocumentID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceDocumentID <em>Source Document ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_SourceDocuments()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SourceDocuments' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceDocumentsType getSourceDocuments();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceDocuments <em>Source Documents</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_SourceID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSourceID <em>Source ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_StartDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTDateSpan" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StartDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getStartDate <em>Start Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_StreetName()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax50Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StreetName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStreetName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getStreetName <em>Street Name</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Supplier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Supplier' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplierType getSupplier();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplier <em>Supplier</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_SupplierID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax30Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupplierID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSupplierID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplierID <em>Supplier ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_SupplierTaxID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupplierTaxID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSupplierTaxID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSupplierTaxID <em>Supplier Tax ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_SystemEntryDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFdateTimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SystemEntryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSystemEntryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getSystemEntryDate <em>System Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Entry Date</em>' attribute.
	 * @see #getSystemEntryDate()
	 * @generated
	 */
	void setSystemEntryDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax</em>' containment reference.
	 * @see #setTax(TaxType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Tax()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Tax' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxType getTax();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTax <em>Tax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax</em>' containment reference.
	 * @see #getTax()
	 * @generated
	 */
	void setTax(TaxType value);

	/**
	 * Returns the value of the '<em><b>Tax Accounting Basis</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * C para Contabilidade, F para Facturação, I para Contabilidade-Facturação, P para Facturação Parcial, S para Autofacturação
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Accounting Basis</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType
	 * @see #setTaxAccountingBasis(TaxAccountingBasisType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxAccountingBasis()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxAccountingBasis' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxAccountingBasisType getTaxAccountingBasis();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxAccountingBasis <em>Tax Accounting Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Accounting Basis</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxAmount()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxAmount <em>Tax Amount</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxCode()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.TaxCodeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxCode <em>Tax Code</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxCountryRegion()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.TaxCountryRegionType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxCountryRegion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxCountryRegion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxCountryRegion <em>Tax Country Region</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxEntity()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxEntity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxEntity <em>Tax Entity</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxExemptionReason()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxExemptionReason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxExemptionReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxExemptionReason <em>Tax Exemption Reason</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxExpirationDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxExpirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTaxExpirationDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxExpirationDate <em>Tax Expiration Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxPayable()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxPayable' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxPayable();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPayable <em>Tax Payable</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxPercentage()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFdecimalType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxPercentage' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxPercentage();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPercentage <em>Tax Percentage</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxPointDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxPointDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTaxPointDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxPointDate <em>Tax Point Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxTable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxTable' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxTableType getTaxTable();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxTable <em>Tax Table</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxTableEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxTableEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxTableEntryType getTaxTableEntry();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxTableEntry <em>Tax Table Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Table Entry</em>' containment reference.
	 * @see #getTaxTableEntry()
	 * @generated
	 */
	void setTaxTableEntry(TaxTableEntryType value);

	/**
	 * Returns the value of the '<em><b>Tax Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType
	 * @see #setTaxType(TaxTypeType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxType' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxTypeType getTaxType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxType <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TaxVerificationDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxVerificationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTaxVerificationDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTaxVerificationDate <em>Tax Verification Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Telephone()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Telephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTelephone <em>Telephone</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TotalCredit()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TotalCredit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTotalCredit();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTotalCredit <em>Total Credit</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TotalDebit()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TotalDebit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTotalDebit();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTotalDebit <em>Total Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Debit</em>' attribute.
	 * @see #getTotalDebit()
	 * @generated
	 */
	void setTotalDebit(BigDecimal value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TransactionDate()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFdateType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransactionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTransactionDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionDate <em>Transaction Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TransactionID()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTTransactionID" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransactionID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransactionID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionID <em>Transaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction ID</em>' attribute.
	 * @see #getTransactionID()
	 * @generated
	 */
	void setTransactionID(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restrição: Tipificação dos movimentos contabilísticos - N - Normal, R - Regularizações do período de tributação, A - Apuramento de resultados, J - Movimentos de Ajustamento 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaction Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType
	 * @see #setTransactionType(TransactionTypeType)
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_TransactionType()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransactionType' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionTypeType getTransactionType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getTransactionType <em>Transaction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_UnitOfMeasure()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax20Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnitOfMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getUnitOfMeasure <em>Unit Of Measure</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_UnitPrice()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFmonetaryType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getUnitPrice();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getUnitPrice <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' attribute.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(BigDecimal value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#getDocumentRoot_Website()
	 * @model unique="false" dataType="oecd.standard.audit.file.tax.pt1_01_2.SAFPTtextTypeMandatoryMax60Car" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Website' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

} // DocumentRoot
