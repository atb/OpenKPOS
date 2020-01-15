/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._301.AddressStructure;
import oecd.standard.audit.file.tax.p.t1._0._301.AddressStructurePT;
import oecd.standard.audit.file.tax.p.t1._0._301.AuditFileType;
import oecd.standard.audit.file.tax.p.t1._0._301.CustomerType;
import oecd.standard.audit.file.tax.p.t1._0._301.DocumentRoot;
import oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerEntriesType;
import oecd.standard.audit.file.tax.p.t1._0._301.GeneralLedgerType;
import oecd.standard.audit.file.tax.p.t1._0._301.GroupingCategoryType;
import oecd.standard.audit.file.tax.p.t1._0._301.HeaderType;
import oecd.standard.audit.file.tax.p.t1._0._301.InvoiceStatusType;
import oecd.standard.audit.file.tax.p.t1._0._301.InvoiceTypeType;
import oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType;
import oecd.standard.audit.file.tax.p.t1._0._301.MovementTypeType;
import oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType;
import oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType;
import oecd.standard.audit.file.tax.p.t1._0._301.ProductType;
import oecd.standard.audit.file.tax.p.t1._0._301.ProductTypeType;
import oecd.standard.audit.file.tax.p.t1._0._301.ShippingPointStructure;
import oecd.standard.audit.file.tax.p.t1._0._301.SourceDocumentsType;
import oecd.standard.audit.file.tax.p.t1._0._301.SupplierType;
import oecd.standard.audit.file.tax.p.t1._0._301.TaxAccountingBasisType;
import oecd.standard.audit.file.tax.p.t1._0._301.TaxTableEntryType;
import oecd.standard.audit.file.tax.p.t1._0._301.TaxTableType;
import oecd.standard.audit.file.tax.p.t1._0._301.TaxTypeType;
import oecd.standard.audit.file.tax.p.t1._0._301.TransactionTypeType;
import oecd.standard.audit.file.tax.p.t1._0._301.WithholdingTaxTypeType;
import oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType;
import oecd.standard.audit.file.tax.p.t1._0._301.WorkTypeType;
import oecd.standard.audit.file.tax.p.t1._0._301._301Package;

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
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getAccountDescription <em>Account Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getAddressDetail <em>Address Detail</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getATDocCodeID <em>AT Doc Code ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getAuditFile <em>Audit File</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getAuditFileVersion <em>Audit File Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getBillingAddress <em>Billing Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCashVATSchemeIndicator <em>Cash VAT Scheme Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCity <em>City</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getClosingCreditBalance <em>Closing Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getClosingDebitBalance <em>Closing Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCompanyAddress <em>Company Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCreditAmount <em>Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCurrencyAmount <em>Currency Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getCustomerTaxID <em>Customer Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getDebitAmount <em>Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getDeliveryID <em>Delivery ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getDocArchivalNumber <em>Doc Archival Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getDocumentNumber <em>Document Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getEACCode <em>EAC Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getFiscalYear <em>Fiscal Year</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getGeneralLedger <em>General Ledger</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getGeneralLedgerEntries <em>General Ledger Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getGLPostingDate <em>GL Posting Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getGrossTotal <em>Gross Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getGroupingCategory <em>Grouping Category</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getHeaderComment <em>Header Comment</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getInvoiceNo <em>Invoice No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getInvoiceStatus <em>Invoice Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getInvoiceStatusDate <em>Invoice Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getJournalID <em>Journal ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getLocationID <em>Location ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getMovementComments <em>Movement Comments</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getMovementDate <em>Movement Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getMovementEndTime <em>Movement End Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getMovementStartTime <em>Movement Start Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getMovementStatus <em>Movement Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getMovementStatusDate <em>Movement Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getMovementType <em>Movement Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getNetTotal <em>Net Total</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getNumberOfEntries <em>Number Of Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getNumberOfMovementLines <em>Number Of Movement Lines</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getOpeningCreditBalance <em>Opening Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getOpeningDebitBalance <em>Opening Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getOriginatingON <em>Originating ON</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getPaymentMechanism <em>Payment Mechanism</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getPaymentRefNo <em>Payment Ref No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getPaymentStatusDate <em>Payment Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getProductCompanyTaxID <em>Product Company Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getProductDescription <em>Product Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getProductGroup <em>Product Group</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getProductNumberCode <em>Product Number Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getSelfBillingIndicator <em>Self Billing Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getShipFrom <em>Ship From</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getShipFromAddress <em>Ship From Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getShipToAddress <em>Ship To Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getSoftwareCertificateNumber <em>Software Certificate Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getSourceDocumentID <em>Source Document ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getSourceDocuments <em>Source Documents</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getSupplierID <em>Supplier ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getSupplierTaxID <em>Supplier Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getSystemID <em>System ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxAccountingBasis <em>Tax Accounting Basis</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxCode <em>Tax Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxCountryRegion <em>Tax Country Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxEntity <em>Tax Entity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxExemptionReason <em>Tax Exemption Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxExpirationDate <em>Tax Expiration Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxPayable <em>Tax Payable</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxPointDate <em>Tax Point Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxTable <em>Tax Table</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxTableEntry <em>Tax Table Entry</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxType <em>Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTaxVerificationDate <em>Tax Verification Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getThirdPartiesBillingIndicator <em>Third Parties Billing Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTotalCredit <em>Total Credit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTotalDebit <em>Total Debit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTotalQuantityIssued <em>Total Quantity Issued</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getWarehouseID <em>Warehouse ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getWithholdingTaxType <em>Withholding Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getWorkDate <em>Work Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getWorkStatus <em>Work Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getWorkStatusDate <em>Work Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentRootImpl#getWorkType <em>Work Type</em>}</li>
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
	 * The default value of the '{@link #getATDocCodeID() <em>AT Doc Code ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATDocCodeID()
	 * @generated
	 * @ordered
	 */
	protected static final String AT_DOC_CODE_ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getCashVATSchemeIndicator() <em>Cash VAT Scheme Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashVATSchemeIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CASH_VAT_SCHEME_INDICATOR_EDEFAULT = null;

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
	 * The default value of the '{@link #getClosingCreditBalance() <em>Closing Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingCreditBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CLOSING_CREDIT_BALANCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getClosingDebitBalance() <em>Closing Debit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingDebitBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CLOSING_DEBIT_BALANCE_EDEFAULT = null;

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
	 * The default value of the '{@link #getCurrencyAmount() <em>Currency Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CURRENCY_AMOUNT_EDEFAULT = null;

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
	 * The default value of the '{@link #getDocumentNumber() <em>Document Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEACCode() <em>EAC Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEACCode()
	 * @generated
	 * @ordered
	 */
	protected static final String EAC_CODE_EDEFAULT = null;

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
	 * The default value of the '{@link #getExchangeRate() <em>Exchange Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeRate()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal EXCHANGE_RATE_EDEFAULT = null;

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
	 * The default value of the '{@link #getGroupingCategory() <em>Grouping Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingCategory()
	 * @generated
	 * @ordered
	 */
	protected static final GroupingCategoryType GROUPING_CATEGORY_EDEFAULT = GroupingCategoryType.GR;

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
	 * The default value of the '{@link #getInvoiceStatusDate() <em>Invoice Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar INVOICE_STATUS_DATE_EDEFAULT = null;

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
	 * The default value of the '{@link #getLocationID() <em>Location ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationID()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMovementComments() <em>Movement Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementComments()
	 * @generated
	 * @ordered
	 */
	protected static final String MOVEMENT_COMMENTS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMovementDate() <em>Movement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MOVEMENT_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMovementEndTime() <em>Movement End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MOVEMENT_END_TIME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMovementStartTime() <em>Movement Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MOVEMENT_START_TIME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMovementStatus() <em>Movement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementStatus()
	 * @generated
	 * @ordered
	 */
	protected static final MovementStatusType MOVEMENT_STATUS_EDEFAULT = MovementStatusType.N;

	/**
	 * The default value of the '{@link #getMovementStatusDate() <em>Movement Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MOVEMENT_STATUS_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMovementType() <em>Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementType()
	 * @generated
	 * @ordered
	 */
	protected static final MovementTypeType MOVEMENT_TYPE_EDEFAULT = MovementTypeType.GR;

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
	 * The default value of the '{@link #getNumberOfMovementLines() <em>Number Of Movement Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMovementLines()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_MOVEMENT_LINES_EDEFAULT = null;

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
	protected static final PaymentMechanismType PAYMENT_MECHANISM_EDEFAULT = PaymentMechanismType.CC;

	/**
	 * The default value of the '{@link #getPaymentRefNo() <em>Payment Ref No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentRefNo()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_REF_NO_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentStatusType PAYMENT_STATUS_EDEFAULT = PaymentStatusType.N;

	/**
	 * The default value of the '{@link #getPaymentStatusDate() <em>Payment Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PAYMENT_STATUS_DATE_EDEFAULT = null;

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
	protected static final BigInteger SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT = null;

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
	 * The default value of the '{@link #getSystemID() <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemID()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getThirdPartiesBillingIndicator() <em>Third Parties Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartiesBillingIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger THIRD_PARTIES_BILLING_INDICATOR_EDEFAULT = null;

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
	 * The default value of the '{@link #getTotalQuantityIssued() <em>Total Quantity Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalQuantityIssued()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_QUANTITY_ISSUED_EDEFAULT = null;

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
	 * The default value of the '{@link #getWarehouseID() <em>Warehouse ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarehouseID()
	 * @generated
	 * @ordered
	 */
	protected static final String WAREHOUSE_ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getWithholdingTaxType() <em>Withholding Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithholdingTaxType()
	 * @generated
	 * @ordered
	 */
	protected static final WithholdingTaxTypeType WITHHOLDING_TAX_TYPE_EDEFAULT = WithholdingTaxTypeType.IRS;

	/**
	 * The default value of the '{@link #getWorkDate() <em>Work Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar WORK_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWorkStatus() <em>Work Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkStatus()
	 * @generated
	 * @ordered
	 */
	protected static final WorkStatusType WORK_STATUS_EDEFAULT = WorkStatusType.N;

	/**
	 * The default value of the '{@link #getWorkStatusDate() <em>Work Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar WORK_STATUS_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWorkType() <em>Work Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkType()
	 * @generated
	 * @ordered
	 */
	protected static final WorkTypeType WORK_TYPE_EDEFAULT = WorkTypeType.DC;

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
		return _301Package.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _301Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _301Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _301Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountDescription() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_AccountDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountDescription(String newAccountDescription) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_AccountDescription(), newAccountDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_AccountID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountID(String newAccountID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_AccountID(), newAccountID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getAddress() {
		return (AddressStructure)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Address(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressStructure newAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_Address(), newAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(AddressStructure newAddress) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Address(), newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressDetail() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_AddressDetail(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressDetail(String newAddressDetail) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_AddressDetail(), newAddressDetail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getATDocCodeID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ATDocCodeID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATDocCodeID(String newATDocCodeID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ATDocCodeID(), newATDocCodeID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditFileType getAuditFile() {
		return (AuditFileType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_AuditFile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditFile(AuditFileType newAuditFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_AuditFile(), newAuditFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditFile(AuditFileType newAuditFile) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_AuditFile(), newAuditFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuditFileVersion() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_AuditFileVersion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditFileVersion(String newAuditFileVersion) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_AuditFileVersion(), newAuditFileVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getBillingAddress() {
		return (AddressStructure)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_BillingAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillingAddress(AddressStructure newBillingAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_BillingAddress(), newBillingAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingAddress(AddressStructure newBillingAddress) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_BillingAddress(), newBillingAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildingNumber() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_BuildingNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingNumber(String newBuildingNumber) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_BuildingNumber(), newBuildingNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessName() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_BusinessName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessName(String newBusinessName) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_BusinessName(), newBusinessName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCashVATSchemeIndicator() {
		return (BigInteger)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_CashVATSchemeIndicator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCashVATSchemeIndicator(BigInteger newCashVATSchemeIndicator) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_CashVATSchemeIndicator(), newCashVATSchemeIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_City(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_City(), newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getClosingCreditBalance() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ClosingCreditBalance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosingCreditBalance(BigDecimal newClosingCreditBalance) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ClosingCreditBalance(), newClosingCreditBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getClosingDebitBalance() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ClosingDebitBalance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosingDebitBalance(BigDecimal newClosingDebitBalance) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ClosingDebitBalance(), newClosingDebitBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructurePT getCompanyAddress() {
		return (AddressStructurePT)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_CompanyAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompanyAddress(AddressStructurePT newCompanyAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_CompanyAddress(), newCompanyAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyAddress(AddressStructurePT newCompanyAddress) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_CompanyAddress(), newCompanyAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_CompanyID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyID(String newCompanyID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_CompanyID(), newCompanyID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyName() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_CompanyName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyName(String newCompanyName) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_CompanyName(), newCompanyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContact() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Contact(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact(String newContact) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Contact(), newContact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Country(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Country(), newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCreditAmount() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_CreditAmount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditAmount(BigDecimal newCreditAmount) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_CreditAmount(), newCreditAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCurrencyAmount() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_CurrencyAmount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyAmount(BigDecimal newCurrencyAmount) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_CurrencyAmount(), newCurrencyAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrencyCode() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_CurrencyCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyCode(String newCurrencyCode) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_CurrencyCode(), newCurrencyCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerType getCustomer() {
		return (CustomerType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Customer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(CustomerType newCustomer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_Customer(), newCustomer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(CustomerType newCustomer) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Customer(), newCustomer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_CustomerID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerID(String newCustomerID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_CustomerID(), newCustomerID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerTaxID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_CustomerTaxID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerTaxID(String newCustomerTaxID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_CustomerTaxID(), newCustomerTaxID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateCreated() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_DateCreated(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCreated(XMLGregorianCalendar newDateCreated) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_DateCreated(), newDateCreated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDebitAmount() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_DebitAmount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebitAmount(BigDecimal newDebitAmount) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_DebitAmount(), newDebitAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDeliveryDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_DeliveryDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(XMLGregorianCalendar newDeliveryDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_DeliveryDate(), newDeliveryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeliveryID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_DeliveryID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryID(String newDeliveryID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_DeliveryID(), newDeliveryID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocArchivalNumber() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_DocArchivalNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocArchivalNumber(String newDocArchivalNumber) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_DocArchivalNumber(), newDocArchivalNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentNumber() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_DocumentNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentNumber(String newDocumentNumber) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_DocumentNumber(), newDocumentNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEACCode() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_EACCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEACCode(String newEACCode) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_EACCode(), newEACCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Email(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Email(), newEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEndDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_EndDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(XMLGregorianCalendar newEndDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_EndDate(), newEndDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getExchangeRate() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ExchangeRate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeRate(BigDecimal newExchangeRate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ExchangeRate(), newExchangeRate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFax() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Fax(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(String newFax) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Fax(), newFax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFiscalYear() {
		return (BigInteger)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_FiscalYear(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiscalYear(BigInteger newFiscalYear) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_FiscalYear(), newFiscalYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLedgerType getGeneralLedger() {
		return (GeneralLedgerType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_GeneralLedger(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralLedger(GeneralLedgerType newGeneralLedger, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_GeneralLedger(), newGeneralLedger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralLedger(GeneralLedgerType newGeneralLedger) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_GeneralLedger(), newGeneralLedger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLedgerEntriesType getGeneralLedgerEntries() {
		return (GeneralLedgerEntriesType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_GeneralLedgerEntries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralLedgerEntries(GeneralLedgerEntriesType newGeneralLedgerEntries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_GeneralLedgerEntries(), newGeneralLedgerEntries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralLedgerEntries(GeneralLedgerEntriesType newGeneralLedgerEntries) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_GeneralLedgerEntries(), newGeneralLedgerEntries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGLPostingDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_GLPostingDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGLPostingDate(XMLGregorianCalendar newGLPostingDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_GLPostingDate(), newGLPostingDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getGrossTotal() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_GrossTotal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrossTotal(BigDecimal newGrossTotal) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_GrossTotal(), newGrossTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingCategoryType getGroupingCategory() {
		return (GroupingCategoryType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_GroupingCategory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingCategory(GroupingCategoryType newGroupingCategory) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_GroupingCategory(), newGroupingCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHash() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Hash(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(String newHash) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Hash(), newHash);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHashControl() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_HashControl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashControl(String newHashControl) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_HashControl(), newHashControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType getHeader() {
		return (HeaderType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Header(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderType newHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_Header(), newHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HeaderType newHeader) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Header(), newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderComment() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_HeaderComment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderComment(String newHeaderComment) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_HeaderComment(), newHeaderComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getInvoiceDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_InvoiceDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceDate(XMLGregorianCalendar newInvoiceDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_InvoiceDate(), newInvoiceDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvoiceNo() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_InvoiceNo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceNo(String newInvoiceNo) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_InvoiceNo(), newInvoiceNo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceStatusType getInvoiceStatus() {
		return (InvoiceStatusType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_InvoiceStatus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceStatus(InvoiceStatusType newInvoiceStatus) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_InvoiceStatus(), newInvoiceStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getInvoiceStatusDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_InvoiceStatusDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceStatusDate(XMLGregorianCalendar newInvoiceStatusDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_InvoiceStatusDate(), newInvoiceStatusDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceTypeType getInvoiceType() {
		return (InvoiceTypeType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_InvoiceType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceType(InvoiceTypeType newInvoiceType) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_InvoiceType(), newInvoiceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJournalID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_JournalID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJournalID(String newJournalID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_JournalID(), newJournalID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLineNumber() {
		return (BigInteger)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_LineNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNumber(BigInteger newLineNumber) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_LineNumber(), newLineNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_LocationID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationID(String newLocationID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_LocationID(), newLocationID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMovementComments() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_MovementComments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementComments(String newMovementComments) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_MovementComments(), newMovementComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getMovementDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_MovementDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementDate(XMLGregorianCalendar newMovementDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_MovementDate(), newMovementDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getMovementEndTime() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_MovementEndTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementEndTime(XMLGregorianCalendar newMovementEndTime) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_MovementEndTime(), newMovementEndTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getMovementStartTime() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_MovementStartTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementStartTime(XMLGregorianCalendar newMovementStartTime) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_MovementStartTime(), newMovementStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementStatusType getMovementStatus() {
		return (MovementStatusType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_MovementStatus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementStatus(MovementStatusType newMovementStatus) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_MovementStatus(), newMovementStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getMovementStatusDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_MovementStatusDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementStatusDate(XMLGregorianCalendar newMovementStatusDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_MovementStatusDate(), newMovementStatusDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementTypeType getMovementType() {
		return (MovementTypeType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_MovementType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementType(MovementTypeType newMovementType) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_MovementType(), newMovementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getNetTotal() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_NetTotal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetTotal(BigDecimal newNetTotal) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_NetTotal(), newNetTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfEntries() {
		return (BigInteger)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_NumberOfEntries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfEntries(BigInteger newNumberOfEntries) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_NumberOfEntries(), newNumberOfEntries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfMovementLines() {
		return (BigInteger)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_NumberOfMovementLines(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfMovementLines(BigInteger newNumberOfMovementLines) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_NumberOfMovementLines(), newNumberOfMovementLines);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOpeningCreditBalance() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_OpeningCreditBalance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpeningCreditBalance(BigDecimal newOpeningCreditBalance) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_OpeningCreditBalance(), newOpeningCreditBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOpeningDebitBalance() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_OpeningDebitBalance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpeningDebitBalance(BigDecimal newOpeningDebitBalance) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_OpeningDebitBalance(), newOpeningDebitBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getOrderDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_OrderDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderDate(XMLGregorianCalendar newOrderDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_OrderDate(), newOrderDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginatingON() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_OriginatingON(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginatingON(String newOriginatingON) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_OriginatingON(), newOriginatingON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMechanismType getPaymentMechanism() {
		return (PaymentMechanismType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_PaymentMechanism(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentMechanism(PaymentMechanismType newPaymentMechanism) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_PaymentMechanism(), newPaymentMechanism);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentRefNo() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_PaymentRefNo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentRefNo(String newPaymentRefNo) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_PaymentRefNo(), newPaymentRefNo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentStatusType getPaymentStatus() {
		return (PaymentStatusType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_PaymentStatus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentStatus(PaymentStatusType newPaymentStatus) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_PaymentStatus(), newPaymentStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getPaymentStatusDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_PaymentStatusDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentStatusDate(XMLGregorianCalendar newPaymentStatusDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_PaymentStatusDate(), newPaymentStatusDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPeriod() {
		return (BigInteger)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Period(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(BigInteger newPeriod) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Period(), newPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_PostalCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_PostalCode(), newPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType getProduct() {
		return (ProductType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Product(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(ProductType newProduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_Product(), newProduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(ProductType newProduct) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Product(), newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductCode() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ProductCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductCode(String newProductCode) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ProductCode(), newProductCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductCompanyTaxID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ProductCompanyTaxID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductCompanyTaxID(String newProductCompanyTaxID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ProductCompanyTaxID(), newProductCompanyTaxID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductDescription() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ProductDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDescription(String newProductDescription) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ProductDescription(), newProductDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductGroup() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ProductGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductGroup(String newProductGroup) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ProductGroup(), newProductGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ProductID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductID(String newProductID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ProductID(), newProductID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductNumberCode() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ProductNumberCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductNumberCode(String newProductNumberCode) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ProductNumberCode(), newProductNumberCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTypeType getProductType() {
		return (ProductTypeType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ProductType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductType(ProductTypeType newProductType) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ProductType(), newProductType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductVersion() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ProductVersion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVersion(String newProductVersion) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ProductVersion(), newProductVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getQuantity() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Quantity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(BigDecimal newQuantity) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Quantity(), newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Reason(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Reason(), newReason);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecordID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_RecordID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordID(String newRecordID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_RecordID(), newRecordID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Reference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Reference(), newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Region(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Region(), newRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSelfBillingIndicator() {
		return (BigInteger)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_SelfBillingIndicator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfBillingIndicator(BigInteger newSelfBillingIndicator) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_SelfBillingIndicator(), newSelfBillingIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSettlementAmount() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_SettlementAmount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettlementAmount(BigDecimal newSettlementAmount) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_SettlementAmount(), newSettlementAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShippingPointStructure getShipFrom() {
		return (ShippingPointStructure)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ShipFrom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipFrom(ShippingPointStructure newShipFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_ShipFrom(), newShipFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipFrom(ShippingPointStructure newShipFrom) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ShipFrom(), newShipFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getShipFromAddress() {
		return (AddressStructure)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ShipFromAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipFromAddress(AddressStructure newShipFromAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_ShipFromAddress(), newShipFromAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipFromAddress(AddressStructure newShipFromAddress) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ShipFromAddress(), newShipFromAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShippingPointStructure getShipTo() {
		return (ShippingPointStructure)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ShipTo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipTo(ShippingPointStructure newShipTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_ShipTo(), newShipTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipTo(ShippingPointStructure newShipTo) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ShipTo(), newShipTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getShipToAddress() {
		return (AddressStructure)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ShipToAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipToAddress(AddressStructure newShipToAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_ShipToAddress(), newShipToAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipToAddress(AddressStructure newShipToAddress) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ShipToAddress(), newShipToAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSoftwareCertificateNumber() {
		return (BigInteger)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_SoftwareCertificateNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareCertificateNumber(BigInteger newSoftwareCertificateNumber) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_SoftwareCertificateNumber(), newSoftwareCertificateNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDocumentID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_SourceDocumentID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDocumentID(String newSourceDocumentID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_SourceDocumentID(), newSourceDocumentID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentsType getSourceDocuments() {
		return (SourceDocumentsType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_SourceDocuments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceDocuments(SourceDocumentsType newSourceDocuments, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_SourceDocuments(), newSourceDocuments, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDocuments(SourceDocumentsType newSourceDocuments) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_SourceDocuments(), newSourceDocuments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_SourceID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceID(String newSourceID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_SourceID(), newSourceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_StartDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(XMLGregorianCalendar newStartDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_StartDate(), newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreetName() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_StreetName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetName(String newStreetName) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_StreetName(), newStreetName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierType getSupplier() {
		return (SupplierType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Supplier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(SupplierType newSupplier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_Supplier(), newSupplier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(SupplierType newSupplier) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Supplier(), newSupplier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplierID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_SupplierID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierID(String newSupplierID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_SupplierID(), newSupplierID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplierTaxID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_SupplierTaxID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierTaxID(String newSupplierTaxID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_SupplierTaxID(), newSupplierTaxID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getSystemEntryDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_SystemEntryDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemEntryDate(XMLGregorianCalendar newSystemEntryDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_SystemEntryDate(), newSystemEntryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_SystemID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemID(String newSystemID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_SystemID(), newSystemID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxAccountingBasisType getTaxAccountingBasis() {
		return (TaxAccountingBasisType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxAccountingBasis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxAccountingBasis(TaxAccountingBasisType newTaxAccountingBasis) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxAccountingBasis(), newTaxAccountingBasis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxAmount() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxAmount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxAmount(BigDecimal newTaxAmount) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxAmount(), newTaxAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxCode() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxCode(String newTaxCode) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxCode(), newTaxCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxCountryRegion() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxCountryRegion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxCountryRegion(String newTaxCountryRegion) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxCountryRegion(), newTaxCountryRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxEntity() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxEntity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxEntity(String newTaxEntity) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxEntity(), newTaxEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxExemptionReason() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxExemptionReason(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxExemptionReason(String newTaxExemptionReason) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxExemptionReason(), newTaxExemptionReason);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTaxExpirationDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxExpirationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxExpirationDate(XMLGregorianCalendar newTaxExpirationDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxExpirationDate(), newTaxExpirationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxPayable() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxPayable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxPayable(BigDecimal newTaxPayable) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxPayable(), newTaxPayable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxPercentage() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxPercentage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxPercentage(BigDecimal newTaxPercentage) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxPercentage(), newTaxPercentage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTaxPointDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxPointDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxPointDate(XMLGregorianCalendar newTaxPointDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxPointDate(), newTaxPointDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTableType getTaxTable() {
		return (TaxTableType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxTable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaxTable(TaxTableType newTaxTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_TaxTable(), newTaxTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxTable(TaxTableType newTaxTable) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxTable(), newTaxTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTableEntryType getTaxTableEntry() {
		return (TaxTableEntryType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxTableEntry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaxTableEntry(TaxTableEntryType newTaxTableEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_301Package.eINSTANCE.getDocumentRoot_TaxTableEntry(), newTaxTableEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxTableEntry(TaxTableEntryType newTaxTableEntry) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxTableEntry(), newTaxTableEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTypeType getTaxType() {
		return (TaxTypeType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxType(TaxTypeType newTaxType) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxType(), newTaxType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTaxVerificationDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TaxVerificationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxVerificationDate(XMLGregorianCalendar newTaxVerificationDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TaxVerificationDate(), newTaxVerificationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelephone() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Telephone(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephone(String newTelephone) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Telephone(), newTelephone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getThirdPartiesBillingIndicator() {
		return (BigInteger)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_ThirdPartiesBillingIndicator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThirdPartiesBillingIndicator(BigInteger newThirdPartiesBillingIndicator) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_ThirdPartiesBillingIndicator(), newThirdPartiesBillingIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTotalCredit() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TotalCredit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCredit(BigDecimal newTotalCredit) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TotalCredit(), newTotalCredit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTotalDebit() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TotalDebit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDebit(BigDecimal newTotalDebit) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TotalDebit(), newTotalDebit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTotalQuantityIssued() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TotalQuantityIssued(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalQuantityIssued(BigDecimal newTotalQuantityIssued) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TotalQuantityIssued(), newTotalQuantityIssued);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTransactionDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TransactionDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionDate(XMLGregorianCalendar newTransactionDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TransactionDate(), newTransactionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TransactionID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionID(String newTransactionID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TransactionID(), newTransactionID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType getTransactionType() {
		return (TransactionTypeType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_TransactionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionType(TransactionTypeType newTransactionType) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_TransactionType(), newTransactionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitOfMeasure() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_UnitOfMeasure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitOfMeasure(String newUnitOfMeasure) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_UnitOfMeasure(), newUnitOfMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getUnitPrice() {
		return (BigDecimal)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_UnitPrice(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(BigDecimal newUnitPrice) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_UnitPrice(), newUnitPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWarehouseID() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_WarehouseID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarehouseID(String newWarehouseID) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_WarehouseID(), newWarehouseID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsite() {
		return (String)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_Website(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsite(String newWebsite) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_Website(), newWebsite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithholdingTaxTypeType getWithholdingTaxType() {
		return (WithholdingTaxTypeType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_WithholdingTaxType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithholdingTaxType(WithholdingTaxTypeType newWithholdingTaxType) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_WithholdingTaxType(), newWithholdingTaxType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getWorkDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_WorkDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkDate(XMLGregorianCalendar newWorkDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_WorkDate(), newWorkDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkStatusType getWorkStatus() {
		return (WorkStatusType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_WorkStatus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkStatus(WorkStatusType newWorkStatus) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_WorkStatus(), newWorkStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getWorkStatusDate() {
		return (XMLGregorianCalendar)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_WorkStatusDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkStatusDate(XMLGregorianCalendar newWorkStatusDate) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_WorkStatusDate(), newWorkStatusDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTypeType getWorkType() {
		return (WorkTypeType)getMixed().get(_301Package.eINSTANCE.getDocumentRoot_WorkType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkType(WorkTypeType newWorkType) {
		((FeatureMap.Internal)getMixed()).set(_301Package.eINSTANCE.getDocumentRoot_WorkType(), newWorkType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _301Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _301Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _301Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _301Package.DOCUMENT_ROOT__ADDRESS:
				return basicSetAddress(null, msgs);
			case _301Package.DOCUMENT_ROOT__AUDIT_FILE:
				return basicSetAuditFile(null, msgs);
			case _301Package.DOCUMENT_ROOT__BILLING_ADDRESS:
				return basicSetBillingAddress(null, msgs);
			case _301Package.DOCUMENT_ROOT__COMPANY_ADDRESS:
				return basicSetCompanyAddress(null, msgs);
			case _301Package.DOCUMENT_ROOT__CUSTOMER:
				return basicSetCustomer(null, msgs);
			case _301Package.DOCUMENT_ROOT__GENERAL_LEDGER:
				return basicSetGeneralLedger(null, msgs);
			case _301Package.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES:
				return basicSetGeneralLedgerEntries(null, msgs);
			case _301Package.DOCUMENT_ROOT__HEADER:
				return basicSetHeader(null, msgs);
			case _301Package.DOCUMENT_ROOT__PRODUCT:
				return basicSetProduct(null, msgs);
			case _301Package.DOCUMENT_ROOT__SHIP_FROM:
				return basicSetShipFrom(null, msgs);
			case _301Package.DOCUMENT_ROOT__SHIP_FROM_ADDRESS:
				return basicSetShipFromAddress(null, msgs);
			case _301Package.DOCUMENT_ROOT__SHIP_TO:
				return basicSetShipTo(null, msgs);
			case _301Package.DOCUMENT_ROOT__SHIP_TO_ADDRESS:
				return basicSetShipToAddress(null, msgs);
			case _301Package.DOCUMENT_ROOT__SOURCE_DOCUMENTS:
				return basicSetSourceDocuments(null, msgs);
			case _301Package.DOCUMENT_ROOT__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case _301Package.DOCUMENT_ROOT__TAX_TABLE:
				return basicSetTaxTable(null, msgs);
			case _301Package.DOCUMENT_ROOT__TAX_TABLE_ENTRY:
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
			case _301Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _301Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _301Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _301Package.DOCUMENT_ROOT__ACCOUNT_DESCRIPTION:
				return getAccountDescription();
			case _301Package.DOCUMENT_ROOT__ACCOUNT_ID:
				return getAccountID();
			case _301Package.DOCUMENT_ROOT__ADDRESS:
				return getAddress();
			case _301Package.DOCUMENT_ROOT__ADDRESS_DETAIL:
				return getAddressDetail();
			case _301Package.DOCUMENT_ROOT__AT_DOC_CODE_ID:
				return getATDocCodeID();
			case _301Package.DOCUMENT_ROOT__AUDIT_FILE:
				return getAuditFile();
			case _301Package.DOCUMENT_ROOT__AUDIT_FILE_VERSION:
				return getAuditFileVersion();
			case _301Package.DOCUMENT_ROOT__BILLING_ADDRESS:
				return getBillingAddress();
			case _301Package.DOCUMENT_ROOT__BUILDING_NUMBER:
				return getBuildingNumber();
			case _301Package.DOCUMENT_ROOT__BUSINESS_NAME:
				return getBusinessName();
			case _301Package.DOCUMENT_ROOT__CASH_VAT_SCHEME_INDICATOR:
				return getCashVATSchemeIndicator();
			case _301Package.DOCUMENT_ROOT__CITY:
				return getCity();
			case _301Package.DOCUMENT_ROOT__CLOSING_CREDIT_BALANCE:
				return getClosingCreditBalance();
			case _301Package.DOCUMENT_ROOT__CLOSING_DEBIT_BALANCE:
				return getClosingDebitBalance();
			case _301Package.DOCUMENT_ROOT__COMPANY_ADDRESS:
				return getCompanyAddress();
			case _301Package.DOCUMENT_ROOT__COMPANY_ID:
				return getCompanyID();
			case _301Package.DOCUMENT_ROOT__COMPANY_NAME:
				return getCompanyName();
			case _301Package.DOCUMENT_ROOT__CONTACT:
				return getContact();
			case _301Package.DOCUMENT_ROOT__COUNTRY:
				return getCountry();
			case _301Package.DOCUMENT_ROOT__CREDIT_AMOUNT:
				return getCreditAmount();
			case _301Package.DOCUMENT_ROOT__CURRENCY_AMOUNT:
				return getCurrencyAmount();
			case _301Package.DOCUMENT_ROOT__CURRENCY_CODE:
				return getCurrencyCode();
			case _301Package.DOCUMENT_ROOT__CUSTOMER:
				return getCustomer();
			case _301Package.DOCUMENT_ROOT__CUSTOMER_ID:
				return getCustomerID();
			case _301Package.DOCUMENT_ROOT__CUSTOMER_TAX_ID:
				return getCustomerTaxID();
			case _301Package.DOCUMENT_ROOT__DATE_CREATED:
				return getDateCreated();
			case _301Package.DOCUMENT_ROOT__DEBIT_AMOUNT:
				return getDebitAmount();
			case _301Package.DOCUMENT_ROOT__DELIVERY_DATE:
				return getDeliveryDate();
			case _301Package.DOCUMENT_ROOT__DELIVERY_ID:
				return getDeliveryID();
			case _301Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case _301Package.DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER:
				return getDocArchivalNumber();
			case _301Package.DOCUMENT_ROOT__DOCUMENT_NUMBER:
				return getDocumentNumber();
			case _301Package.DOCUMENT_ROOT__EAC_CODE:
				return getEACCode();
			case _301Package.DOCUMENT_ROOT__EMAIL:
				return getEmail();
			case _301Package.DOCUMENT_ROOT__END_DATE:
				return getEndDate();
			case _301Package.DOCUMENT_ROOT__EXCHANGE_RATE:
				return getExchangeRate();
			case _301Package.DOCUMENT_ROOT__FAX:
				return getFax();
			case _301Package.DOCUMENT_ROOT__FISCAL_YEAR:
				return getFiscalYear();
			case _301Package.DOCUMENT_ROOT__GENERAL_LEDGER:
				return getGeneralLedger();
			case _301Package.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES:
				return getGeneralLedgerEntries();
			case _301Package.DOCUMENT_ROOT__GL_POSTING_DATE:
				return getGLPostingDate();
			case _301Package.DOCUMENT_ROOT__GROSS_TOTAL:
				return getGrossTotal();
			case _301Package.DOCUMENT_ROOT__GROUPING_CATEGORY:
				return getGroupingCategory();
			case _301Package.DOCUMENT_ROOT__HASH:
				return getHash();
			case _301Package.DOCUMENT_ROOT__HASH_CONTROL:
				return getHashControl();
			case _301Package.DOCUMENT_ROOT__HEADER:
				return getHeader();
			case _301Package.DOCUMENT_ROOT__HEADER_COMMENT:
				return getHeaderComment();
			case _301Package.DOCUMENT_ROOT__INVOICE_DATE:
				return getInvoiceDate();
			case _301Package.DOCUMENT_ROOT__INVOICE_NO:
				return getInvoiceNo();
			case _301Package.DOCUMENT_ROOT__INVOICE_STATUS:
				return getInvoiceStatus();
			case _301Package.DOCUMENT_ROOT__INVOICE_STATUS_DATE:
				return getInvoiceStatusDate();
			case _301Package.DOCUMENT_ROOT__INVOICE_TYPE:
				return getInvoiceType();
			case _301Package.DOCUMENT_ROOT__JOURNAL_ID:
				return getJournalID();
			case _301Package.DOCUMENT_ROOT__LINE_NUMBER:
				return getLineNumber();
			case _301Package.DOCUMENT_ROOT__LOCATION_ID:
				return getLocationID();
			case _301Package.DOCUMENT_ROOT__MOVEMENT_COMMENTS:
				return getMovementComments();
			case _301Package.DOCUMENT_ROOT__MOVEMENT_DATE:
				return getMovementDate();
			case _301Package.DOCUMENT_ROOT__MOVEMENT_END_TIME:
				return getMovementEndTime();
			case _301Package.DOCUMENT_ROOT__MOVEMENT_START_TIME:
				return getMovementStartTime();
			case _301Package.DOCUMENT_ROOT__MOVEMENT_STATUS:
				return getMovementStatus();
			case _301Package.DOCUMENT_ROOT__MOVEMENT_STATUS_DATE:
				return getMovementStatusDate();
			case _301Package.DOCUMENT_ROOT__MOVEMENT_TYPE:
				return getMovementType();
			case _301Package.DOCUMENT_ROOT__NET_TOTAL:
				return getNetTotal();
			case _301Package.DOCUMENT_ROOT__NUMBER_OF_ENTRIES:
				return getNumberOfEntries();
			case _301Package.DOCUMENT_ROOT__NUMBER_OF_MOVEMENT_LINES:
				return getNumberOfMovementLines();
			case _301Package.DOCUMENT_ROOT__OPENING_CREDIT_BALANCE:
				return getOpeningCreditBalance();
			case _301Package.DOCUMENT_ROOT__OPENING_DEBIT_BALANCE:
				return getOpeningDebitBalance();
			case _301Package.DOCUMENT_ROOT__ORDER_DATE:
				return getOrderDate();
			case _301Package.DOCUMENT_ROOT__ORIGINATING_ON:
				return getOriginatingON();
			case _301Package.DOCUMENT_ROOT__PAYMENT_MECHANISM:
				return getPaymentMechanism();
			case _301Package.DOCUMENT_ROOT__PAYMENT_REF_NO:
				return getPaymentRefNo();
			case _301Package.DOCUMENT_ROOT__PAYMENT_STATUS:
				return getPaymentStatus();
			case _301Package.DOCUMENT_ROOT__PAYMENT_STATUS_DATE:
				return getPaymentStatusDate();
			case _301Package.DOCUMENT_ROOT__PERIOD:
				return getPeriod();
			case _301Package.DOCUMENT_ROOT__POSTAL_CODE:
				return getPostalCode();
			case _301Package.DOCUMENT_ROOT__PRODUCT:
				return getProduct();
			case _301Package.DOCUMENT_ROOT__PRODUCT_CODE:
				return getProductCode();
			case _301Package.DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID:
				return getProductCompanyTaxID();
			case _301Package.DOCUMENT_ROOT__PRODUCT_DESCRIPTION:
				return getProductDescription();
			case _301Package.DOCUMENT_ROOT__PRODUCT_GROUP:
				return getProductGroup();
			case _301Package.DOCUMENT_ROOT__PRODUCT_ID:
				return getProductID();
			case _301Package.DOCUMENT_ROOT__PRODUCT_NUMBER_CODE:
				return getProductNumberCode();
			case _301Package.DOCUMENT_ROOT__PRODUCT_TYPE:
				return getProductType();
			case _301Package.DOCUMENT_ROOT__PRODUCT_VERSION:
				return getProductVersion();
			case _301Package.DOCUMENT_ROOT__QUANTITY:
				return getQuantity();
			case _301Package.DOCUMENT_ROOT__REASON:
				return getReason();
			case _301Package.DOCUMENT_ROOT__RECORD_ID:
				return getRecordID();
			case _301Package.DOCUMENT_ROOT__REFERENCE:
				return getReference();
			case _301Package.DOCUMENT_ROOT__REGION:
				return getRegion();
			case _301Package.DOCUMENT_ROOT__SELF_BILLING_INDICATOR:
				return getSelfBillingIndicator();
			case _301Package.DOCUMENT_ROOT__SETTLEMENT_AMOUNT:
				return getSettlementAmount();
			case _301Package.DOCUMENT_ROOT__SHIP_FROM:
				return getShipFrom();
			case _301Package.DOCUMENT_ROOT__SHIP_FROM_ADDRESS:
				return getShipFromAddress();
			case _301Package.DOCUMENT_ROOT__SHIP_TO:
				return getShipTo();
			case _301Package.DOCUMENT_ROOT__SHIP_TO_ADDRESS:
				return getShipToAddress();
			case _301Package.DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER:
				return getSoftwareCertificateNumber();
			case _301Package.DOCUMENT_ROOT__SOURCE_DOCUMENT_ID:
				return getSourceDocumentID();
			case _301Package.DOCUMENT_ROOT__SOURCE_DOCUMENTS:
				return getSourceDocuments();
			case _301Package.DOCUMENT_ROOT__SOURCE_ID:
				return getSourceID();
			case _301Package.DOCUMENT_ROOT__START_DATE:
				return getStartDate();
			case _301Package.DOCUMENT_ROOT__STREET_NAME:
				return getStreetName();
			case _301Package.DOCUMENT_ROOT__SUPPLIER:
				return getSupplier();
			case _301Package.DOCUMENT_ROOT__SUPPLIER_ID:
				return getSupplierID();
			case _301Package.DOCUMENT_ROOT__SUPPLIER_TAX_ID:
				return getSupplierTaxID();
			case _301Package.DOCUMENT_ROOT__SYSTEM_ENTRY_DATE:
				return getSystemEntryDate();
			case _301Package.DOCUMENT_ROOT__SYSTEM_ID:
				return getSystemID();
			case _301Package.DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS:
				return getTaxAccountingBasis();
			case _301Package.DOCUMENT_ROOT__TAX_AMOUNT:
				return getTaxAmount();
			case _301Package.DOCUMENT_ROOT__TAX_CODE:
				return getTaxCode();
			case _301Package.DOCUMENT_ROOT__TAX_COUNTRY_REGION:
				return getTaxCountryRegion();
			case _301Package.DOCUMENT_ROOT__TAX_ENTITY:
				return getTaxEntity();
			case _301Package.DOCUMENT_ROOT__TAX_EXEMPTION_REASON:
				return getTaxExemptionReason();
			case _301Package.DOCUMENT_ROOT__TAX_EXPIRATION_DATE:
				return getTaxExpirationDate();
			case _301Package.DOCUMENT_ROOT__TAX_PAYABLE:
				return getTaxPayable();
			case _301Package.DOCUMENT_ROOT__TAX_PERCENTAGE:
				return getTaxPercentage();
			case _301Package.DOCUMENT_ROOT__TAX_POINT_DATE:
				return getTaxPointDate();
			case _301Package.DOCUMENT_ROOT__TAX_TABLE:
				return getTaxTable();
			case _301Package.DOCUMENT_ROOT__TAX_TABLE_ENTRY:
				return getTaxTableEntry();
			case _301Package.DOCUMENT_ROOT__TAX_TYPE:
				return getTaxType();
			case _301Package.DOCUMENT_ROOT__TAX_VERIFICATION_DATE:
				return getTaxVerificationDate();
			case _301Package.DOCUMENT_ROOT__TELEPHONE:
				return getTelephone();
			case _301Package.DOCUMENT_ROOT__THIRD_PARTIES_BILLING_INDICATOR:
				return getThirdPartiesBillingIndicator();
			case _301Package.DOCUMENT_ROOT__TOTAL_CREDIT:
				return getTotalCredit();
			case _301Package.DOCUMENT_ROOT__TOTAL_DEBIT:
				return getTotalDebit();
			case _301Package.DOCUMENT_ROOT__TOTAL_QUANTITY_ISSUED:
				return getTotalQuantityIssued();
			case _301Package.DOCUMENT_ROOT__TRANSACTION_DATE:
				return getTransactionDate();
			case _301Package.DOCUMENT_ROOT__TRANSACTION_ID:
				return getTransactionID();
			case _301Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				return getTransactionType();
			case _301Package.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case _301Package.DOCUMENT_ROOT__UNIT_PRICE:
				return getUnitPrice();
			case _301Package.DOCUMENT_ROOT__WAREHOUSE_ID:
				return getWarehouseID();
			case _301Package.DOCUMENT_ROOT__WEBSITE:
				return getWebsite();
			case _301Package.DOCUMENT_ROOT__WITHHOLDING_TAX_TYPE:
				return getWithholdingTaxType();
			case _301Package.DOCUMENT_ROOT__WORK_DATE:
				return getWorkDate();
			case _301Package.DOCUMENT_ROOT__WORK_STATUS:
				return getWorkStatus();
			case _301Package.DOCUMENT_ROOT__WORK_STATUS_DATE:
				return getWorkStatusDate();
			case _301Package.DOCUMENT_ROOT__WORK_TYPE:
				return getWorkType();
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
			case _301Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _301Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _301Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _301Package.DOCUMENT_ROOT__ACCOUNT_DESCRIPTION:
				setAccountDescription((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__ACCOUNT_ID:
				setAccountID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressStructure)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__ADDRESS_DETAIL:
				setAddressDetail((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__AT_DOC_CODE_ID:
				setATDocCodeID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__AUDIT_FILE:
				setAuditFile((AuditFileType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__AUDIT_FILE_VERSION:
				setAuditFileVersion((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__BILLING_ADDRESS:
				setBillingAddress((AddressStructure)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__BUILDING_NUMBER:
				setBuildingNumber((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__BUSINESS_NAME:
				setBusinessName((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__CASH_VAT_SCHEME_INDICATOR:
				setCashVATSchemeIndicator((BigInteger)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__CITY:
				setCity((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__CLOSING_CREDIT_BALANCE:
				setClosingCreditBalance((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__CLOSING_DEBIT_BALANCE:
				setClosingDebitBalance((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__COMPANY_ADDRESS:
				setCompanyAddress((AddressStructurePT)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__COMPANY_ID:
				setCompanyID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__COMPANY_NAME:
				setCompanyName((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__CONTACT:
				setContact((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__COUNTRY:
				setCountry((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__CREDIT_AMOUNT:
				setCreditAmount((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__CURRENCY_AMOUNT:
				setCurrencyAmount((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__CURRENCY_CODE:
				setCurrencyCode((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__CUSTOMER:
				setCustomer((CustomerType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__CUSTOMER_ID:
				setCustomerID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__CUSTOMER_TAX_ID:
				setCustomerTaxID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__DATE_CREATED:
				setDateCreated((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__DEBIT_AMOUNT:
				setDebitAmount((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__DELIVERY_DATE:
				setDeliveryDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__DELIVERY_ID:
				setDeliveryID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER:
				setDocArchivalNumber((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__DOCUMENT_NUMBER:
				setDocumentNumber((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__EAC_CODE:
				setEACCode((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__EMAIL:
				setEmail((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__END_DATE:
				setEndDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__EXCHANGE_RATE:
				setExchangeRate((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__FAX:
				setFax((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__FISCAL_YEAR:
				setFiscalYear((BigInteger)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__GENERAL_LEDGER:
				setGeneralLedger((GeneralLedgerType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES:
				setGeneralLedgerEntries((GeneralLedgerEntriesType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__GL_POSTING_DATE:
				setGLPostingDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__GROSS_TOTAL:
				setGrossTotal((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__GROUPING_CATEGORY:
				setGroupingCategory((GroupingCategoryType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__HASH:
				setHash((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__HASH_CONTROL:
				setHashControl((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__HEADER_COMMENT:
				setHeaderComment((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__INVOICE_DATE:
				setInvoiceDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__INVOICE_NO:
				setInvoiceNo((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__INVOICE_STATUS:
				setInvoiceStatus((InvoiceStatusType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__INVOICE_STATUS_DATE:
				setInvoiceStatusDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__INVOICE_TYPE:
				setInvoiceType((InvoiceTypeType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__JOURNAL_ID:
				setJournalID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__LINE_NUMBER:
				setLineNumber((BigInteger)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__LOCATION_ID:
				setLocationID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_COMMENTS:
				setMovementComments((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_DATE:
				setMovementDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_END_TIME:
				setMovementEndTime((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_START_TIME:
				setMovementStartTime((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_STATUS:
				setMovementStatus((MovementStatusType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_STATUS_DATE:
				setMovementStatusDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_TYPE:
				setMovementType((MovementTypeType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__NET_TOTAL:
				setNetTotal((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__NUMBER_OF_ENTRIES:
				setNumberOfEntries((BigInteger)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__NUMBER_OF_MOVEMENT_LINES:
				setNumberOfMovementLines((BigInteger)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__OPENING_CREDIT_BALANCE:
				setOpeningCreditBalance((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__OPENING_DEBIT_BALANCE:
				setOpeningDebitBalance((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__ORDER_DATE:
				setOrderDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__ORIGINATING_ON:
				setOriginatingON((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PAYMENT_MECHANISM:
				setPaymentMechanism((PaymentMechanismType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PAYMENT_REF_NO:
				setPaymentRefNo((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PAYMENT_STATUS:
				setPaymentStatus((PaymentStatusType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PAYMENT_STATUS_DATE:
				setPaymentStatusDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PERIOD:
				setPeriod((BigInteger)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT:
				setProduct((ProductType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_CODE:
				setProductCode((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID:
				setProductCompanyTaxID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_DESCRIPTION:
				setProductDescription((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_GROUP:
				setProductGroup((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_ID:
				setProductID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_NUMBER_CODE:
				setProductNumberCode((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_TYPE:
				setProductType((ProductTypeType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_VERSION:
				setProductVersion((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__REASON:
				setReason((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__RECORD_ID:
				setRecordID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__REFERENCE:
				setReference((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__REGION:
				setRegion((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SELF_BILLING_INDICATOR:
				setSelfBillingIndicator((BigInteger)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SETTLEMENT_AMOUNT:
				setSettlementAmount((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SHIP_FROM:
				setShipFrom((ShippingPointStructure)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SHIP_FROM_ADDRESS:
				setShipFromAddress((AddressStructure)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SHIP_TO:
				setShipTo((ShippingPointStructure)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SHIP_TO_ADDRESS:
				setShipToAddress((AddressStructure)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER:
				setSoftwareCertificateNumber((BigInteger)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SOURCE_DOCUMENT_ID:
				setSourceDocumentID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SOURCE_DOCUMENTS:
				setSourceDocuments((SourceDocumentsType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__START_DATE:
				setStartDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__STREET_NAME:
				setStreetName((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SUPPLIER:
				setSupplier((SupplierType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SUPPLIER_ID:
				setSupplierID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SUPPLIER_TAX_ID:
				setSupplierTaxID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SYSTEM_ENTRY_DATE:
				setSystemEntryDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__SYSTEM_ID:
				setSystemID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS:
				setTaxAccountingBasis((TaxAccountingBasisType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_AMOUNT:
				setTaxAmount((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_CODE:
				setTaxCode((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_COUNTRY_REGION:
				setTaxCountryRegion((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_ENTITY:
				setTaxEntity((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_EXEMPTION_REASON:
				setTaxExemptionReason((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_EXPIRATION_DATE:
				setTaxExpirationDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_PAYABLE:
				setTaxPayable((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_PERCENTAGE:
				setTaxPercentage((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_POINT_DATE:
				setTaxPointDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_TABLE:
				setTaxTable((TaxTableType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_TABLE_ENTRY:
				setTaxTableEntry((TaxTableEntryType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_TYPE:
				setTaxType((TaxTypeType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_VERIFICATION_DATE:
				setTaxVerificationDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TELEPHONE:
				setTelephone((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__THIRD_PARTIES_BILLING_INDICATOR:
				setThirdPartiesBillingIndicator((BigInteger)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TOTAL_CREDIT:
				setTotalCredit((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TOTAL_DEBIT:
				setTotalDebit((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TOTAL_QUANTITY_ISSUED:
				setTotalQuantityIssued((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TRANSACTION_DATE:
				setTransactionDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TRANSACTION_ID:
				setTransactionID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				setUnitOfMeasure((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__UNIT_PRICE:
				setUnitPrice((BigDecimal)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__WAREHOUSE_ID:
				setWarehouseID((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__WEBSITE:
				setWebsite((String)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__WITHHOLDING_TAX_TYPE:
				setWithholdingTaxType((WithholdingTaxTypeType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__WORK_DATE:
				setWorkDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__WORK_STATUS:
				setWorkStatus((WorkStatusType)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__WORK_STATUS_DATE:
				setWorkStatusDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_ROOT__WORK_TYPE:
				setWorkType((WorkTypeType)newValue);
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
			case _301Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _301Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _301Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _301Package.DOCUMENT_ROOT__ACCOUNT_DESCRIPTION:
				setAccountDescription(ACCOUNT_DESCRIPTION_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__ACCOUNT_ID:
				setAccountID(ACCOUNT_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressStructure)null);
				return;
			case _301Package.DOCUMENT_ROOT__ADDRESS_DETAIL:
				setAddressDetail(ADDRESS_DETAIL_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__AT_DOC_CODE_ID:
				setATDocCodeID(AT_DOC_CODE_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__AUDIT_FILE:
				setAuditFile((AuditFileType)null);
				return;
			case _301Package.DOCUMENT_ROOT__AUDIT_FILE_VERSION:
				setAuditFileVersion(AUDIT_FILE_VERSION_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__BILLING_ADDRESS:
				setBillingAddress((AddressStructure)null);
				return;
			case _301Package.DOCUMENT_ROOT__BUILDING_NUMBER:
				setBuildingNumber(BUILDING_NUMBER_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__BUSINESS_NAME:
				setBusinessName(BUSINESS_NAME_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__CASH_VAT_SCHEME_INDICATOR:
				setCashVATSchemeIndicator(CASH_VAT_SCHEME_INDICATOR_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__CLOSING_CREDIT_BALANCE:
				setClosingCreditBalance(CLOSING_CREDIT_BALANCE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__CLOSING_DEBIT_BALANCE:
				setClosingDebitBalance(CLOSING_DEBIT_BALANCE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__COMPANY_ADDRESS:
				setCompanyAddress((AddressStructurePT)null);
				return;
			case _301Package.DOCUMENT_ROOT__COMPANY_ID:
				setCompanyID(COMPANY_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__COMPANY_NAME:
				setCompanyName(COMPANY_NAME_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__CONTACT:
				setContact(CONTACT_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__CREDIT_AMOUNT:
				setCreditAmount(CREDIT_AMOUNT_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__CURRENCY_AMOUNT:
				setCurrencyAmount(CURRENCY_AMOUNT_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__CURRENCY_CODE:
				setCurrencyCode(CURRENCY_CODE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__CUSTOMER:
				setCustomer((CustomerType)null);
				return;
			case _301Package.DOCUMENT_ROOT__CUSTOMER_ID:
				setCustomerID(CUSTOMER_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__CUSTOMER_TAX_ID:
				setCustomerTaxID(CUSTOMER_TAX_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__DEBIT_AMOUNT:
				setDebitAmount(DEBIT_AMOUNT_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__DELIVERY_ID:
				setDeliveryID(DELIVERY_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER:
				setDocArchivalNumber(DOC_ARCHIVAL_NUMBER_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__DOCUMENT_NUMBER:
				setDocumentNumber(DOCUMENT_NUMBER_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__EAC_CODE:
				setEACCode(EAC_CODE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__EXCHANGE_RATE:
				setExchangeRate(EXCHANGE_RATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__FISCAL_YEAR:
				setFiscalYear(FISCAL_YEAR_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__GENERAL_LEDGER:
				setGeneralLedger((GeneralLedgerType)null);
				return;
			case _301Package.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES:
				setGeneralLedgerEntries((GeneralLedgerEntriesType)null);
				return;
			case _301Package.DOCUMENT_ROOT__GL_POSTING_DATE:
				setGLPostingDate(GL_POSTING_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__GROSS_TOTAL:
				setGrossTotal(GROSS_TOTAL_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__GROUPING_CATEGORY:
				setGroupingCategory(GROUPING_CATEGORY_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__HASH:
				setHash(HASH_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__HASH_CONTROL:
				setHashControl(HASH_CONTROL_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__HEADER:
				setHeader((HeaderType)null);
				return;
			case _301Package.DOCUMENT_ROOT__HEADER_COMMENT:
				setHeaderComment(HEADER_COMMENT_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__INVOICE_DATE:
				setInvoiceDate(INVOICE_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__INVOICE_NO:
				setInvoiceNo(INVOICE_NO_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__INVOICE_STATUS:
				setInvoiceStatus(INVOICE_STATUS_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__INVOICE_STATUS_DATE:
				setInvoiceStatusDate(INVOICE_STATUS_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__INVOICE_TYPE:
				setInvoiceType(INVOICE_TYPE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__JOURNAL_ID:
				setJournalID(JOURNAL_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__LOCATION_ID:
				setLocationID(LOCATION_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_COMMENTS:
				setMovementComments(MOVEMENT_COMMENTS_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_DATE:
				setMovementDate(MOVEMENT_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_END_TIME:
				setMovementEndTime(MOVEMENT_END_TIME_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_START_TIME:
				setMovementStartTime(MOVEMENT_START_TIME_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_STATUS:
				setMovementStatus(MOVEMENT_STATUS_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_STATUS_DATE:
				setMovementStatusDate(MOVEMENT_STATUS_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_TYPE:
				setMovementType(MOVEMENT_TYPE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__NET_TOTAL:
				setNetTotal(NET_TOTAL_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__NUMBER_OF_ENTRIES:
				setNumberOfEntries(NUMBER_OF_ENTRIES_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__NUMBER_OF_MOVEMENT_LINES:
				setNumberOfMovementLines(NUMBER_OF_MOVEMENT_LINES_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__OPENING_CREDIT_BALANCE:
				setOpeningCreditBalance(OPENING_CREDIT_BALANCE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__OPENING_DEBIT_BALANCE:
				setOpeningDebitBalance(OPENING_DEBIT_BALANCE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__ORDER_DATE:
				setOrderDate(ORDER_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__ORIGINATING_ON:
				setOriginatingON(ORIGINATING_ON_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PAYMENT_MECHANISM:
				setPaymentMechanism(PAYMENT_MECHANISM_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PAYMENT_REF_NO:
				setPaymentRefNo(PAYMENT_REF_NO_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PAYMENT_STATUS:
				setPaymentStatus(PAYMENT_STATUS_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PAYMENT_STATUS_DATE:
				setPaymentStatusDate(PAYMENT_STATUS_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT:
				setProduct((ProductType)null);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_CODE:
				setProductCode(PRODUCT_CODE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID:
				setProductCompanyTaxID(PRODUCT_COMPANY_TAX_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_DESCRIPTION:
				setProductDescription(PRODUCT_DESCRIPTION_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_GROUP:
				setProductGroup(PRODUCT_GROUP_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_ID:
				setProductID(PRODUCT_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_NUMBER_CODE:
				setProductNumberCode(PRODUCT_NUMBER_CODE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_TYPE:
				setProductType(PRODUCT_TYPE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__PRODUCT_VERSION:
				setProductVersion(PRODUCT_VERSION_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__RECORD_ID:
				setRecordID(RECORD_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__SELF_BILLING_INDICATOR:
				setSelfBillingIndicator(SELF_BILLING_INDICATOR_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__SETTLEMENT_AMOUNT:
				setSettlementAmount(SETTLEMENT_AMOUNT_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__SHIP_FROM:
				setShipFrom((ShippingPointStructure)null);
				return;
			case _301Package.DOCUMENT_ROOT__SHIP_FROM_ADDRESS:
				setShipFromAddress((AddressStructure)null);
				return;
			case _301Package.DOCUMENT_ROOT__SHIP_TO:
				setShipTo((ShippingPointStructure)null);
				return;
			case _301Package.DOCUMENT_ROOT__SHIP_TO_ADDRESS:
				setShipToAddress((AddressStructure)null);
				return;
			case _301Package.DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER:
				setSoftwareCertificateNumber(SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__SOURCE_DOCUMENT_ID:
				setSourceDocumentID(SOURCE_DOCUMENT_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__SOURCE_DOCUMENTS:
				setSourceDocuments((SourceDocumentsType)null);
				return;
			case _301Package.DOCUMENT_ROOT__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__STREET_NAME:
				setStreetName(STREET_NAME_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__SUPPLIER:
				setSupplier((SupplierType)null);
				return;
			case _301Package.DOCUMENT_ROOT__SUPPLIER_ID:
				setSupplierID(SUPPLIER_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__SUPPLIER_TAX_ID:
				setSupplierTaxID(SUPPLIER_TAX_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__SYSTEM_ENTRY_DATE:
				setSystemEntryDate(SYSTEM_ENTRY_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__SYSTEM_ID:
				setSystemID(SYSTEM_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS:
				setTaxAccountingBasis(TAX_ACCOUNTING_BASIS_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_AMOUNT:
				setTaxAmount(TAX_AMOUNT_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_CODE:
				setTaxCode(TAX_CODE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_COUNTRY_REGION:
				setTaxCountryRegion(TAX_COUNTRY_REGION_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_ENTITY:
				setTaxEntity(TAX_ENTITY_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_EXEMPTION_REASON:
				setTaxExemptionReason(TAX_EXEMPTION_REASON_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_EXPIRATION_DATE:
				setTaxExpirationDate(TAX_EXPIRATION_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_PAYABLE:
				setTaxPayable(TAX_PAYABLE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_PERCENTAGE:
				setTaxPercentage(TAX_PERCENTAGE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_POINT_DATE:
				setTaxPointDate(TAX_POINT_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_TABLE:
				setTaxTable((TaxTableType)null);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_TABLE_ENTRY:
				setTaxTableEntry((TaxTableEntryType)null);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_TYPE:
				setTaxType(TAX_TYPE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TAX_VERIFICATION_DATE:
				setTaxVerificationDate(TAX_VERIFICATION_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TELEPHONE:
				setTelephone(TELEPHONE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__THIRD_PARTIES_BILLING_INDICATOR:
				setThirdPartiesBillingIndicator(THIRD_PARTIES_BILLING_INDICATOR_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TOTAL_CREDIT:
				setTotalCredit(TOTAL_CREDIT_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TOTAL_DEBIT:
				setTotalDebit(TOTAL_DEBIT_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TOTAL_QUANTITY_ISSUED:
				setTotalQuantityIssued(TOTAL_QUANTITY_ISSUED_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TRANSACTION_ID:
				setTransactionID(TRANSACTION_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				setTransactionType(TRANSACTION_TYPE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				setUnitOfMeasure(UNIT_OF_MEASURE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__UNIT_PRICE:
				setUnitPrice(UNIT_PRICE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__WAREHOUSE_ID:
				setWarehouseID(WAREHOUSE_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__WITHHOLDING_TAX_TYPE:
				setWithholdingTaxType(WITHHOLDING_TAX_TYPE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__WORK_DATE:
				setWorkDate(WORK_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__WORK_STATUS:
				setWorkStatus(WORK_STATUS_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__WORK_STATUS_DATE:
				setWorkStatusDate(WORK_STATUS_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_ROOT__WORK_TYPE:
				setWorkType(WORK_TYPE_EDEFAULT);
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
			case _301Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _301Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _301Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _301Package.DOCUMENT_ROOT__ACCOUNT_DESCRIPTION:
				return ACCOUNT_DESCRIPTION_EDEFAULT == null ? getAccountDescription() != null : !ACCOUNT_DESCRIPTION_EDEFAULT.equals(getAccountDescription());
			case _301Package.DOCUMENT_ROOT__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? getAccountID() != null : !ACCOUNT_ID_EDEFAULT.equals(getAccountID());
			case _301Package.DOCUMENT_ROOT__ADDRESS:
				return getAddress() != null;
			case _301Package.DOCUMENT_ROOT__ADDRESS_DETAIL:
				return ADDRESS_DETAIL_EDEFAULT == null ? getAddressDetail() != null : !ADDRESS_DETAIL_EDEFAULT.equals(getAddressDetail());
			case _301Package.DOCUMENT_ROOT__AT_DOC_CODE_ID:
				return AT_DOC_CODE_ID_EDEFAULT == null ? getATDocCodeID() != null : !AT_DOC_CODE_ID_EDEFAULT.equals(getATDocCodeID());
			case _301Package.DOCUMENT_ROOT__AUDIT_FILE:
				return getAuditFile() != null;
			case _301Package.DOCUMENT_ROOT__AUDIT_FILE_VERSION:
				return AUDIT_FILE_VERSION_EDEFAULT == null ? getAuditFileVersion() != null : !AUDIT_FILE_VERSION_EDEFAULT.equals(getAuditFileVersion());
			case _301Package.DOCUMENT_ROOT__BILLING_ADDRESS:
				return getBillingAddress() != null;
			case _301Package.DOCUMENT_ROOT__BUILDING_NUMBER:
				return BUILDING_NUMBER_EDEFAULT == null ? getBuildingNumber() != null : !BUILDING_NUMBER_EDEFAULT.equals(getBuildingNumber());
			case _301Package.DOCUMENT_ROOT__BUSINESS_NAME:
				return BUSINESS_NAME_EDEFAULT == null ? getBusinessName() != null : !BUSINESS_NAME_EDEFAULT.equals(getBusinessName());
			case _301Package.DOCUMENT_ROOT__CASH_VAT_SCHEME_INDICATOR:
				return CASH_VAT_SCHEME_INDICATOR_EDEFAULT == null ? getCashVATSchemeIndicator() != null : !CASH_VAT_SCHEME_INDICATOR_EDEFAULT.equals(getCashVATSchemeIndicator());
			case _301Package.DOCUMENT_ROOT__CITY:
				return CITY_EDEFAULT == null ? getCity() != null : !CITY_EDEFAULT.equals(getCity());
			case _301Package.DOCUMENT_ROOT__CLOSING_CREDIT_BALANCE:
				return CLOSING_CREDIT_BALANCE_EDEFAULT == null ? getClosingCreditBalance() != null : !CLOSING_CREDIT_BALANCE_EDEFAULT.equals(getClosingCreditBalance());
			case _301Package.DOCUMENT_ROOT__CLOSING_DEBIT_BALANCE:
				return CLOSING_DEBIT_BALANCE_EDEFAULT == null ? getClosingDebitBalance() != null : !CLOSING_DEBIT_BALANCE_EDEFAULT.equals(getClosingDebitBalance());
			case _301Package.DOCUMENT_ROOT__COMPANY_ADDRESS:
				return getCompanyAddress() != null;
			case _301Package.DOCUMENT_ROOT__COMPANY_ID:
				return COMPANY_ID_EDEFAULT == null ? getCompanyID() != null : !COMPANY_ID_EDEFAULT.equals(getCompanyID());
			case _301Package.DOCUMENT_ROOT__COMPANY_NAME:
				return COMPANY_NAME_EDEFAULT == null ? getCompanyName() != null : !COMPANY_NAME_EDEFAULT.equals(getCompanyName());
			case _301Package.DOCUMENT_ROOT__CONTACT:
				return CONTACT_EDEFAULT == null ? getContact() != null : !CONTACT_EDEFAULT.equals(getContact());
			case _301Package.DOCUMENT_ROOT__COUNTRY:
				return COUNTRY_EDEFAULT == null ? getCountry() != null : !COUNTRY_EDEFAULT.equals(getCountry());
			case _301Package.DOCUMENT_ROOT__CREDIT_AMOUNT:
				return CREDIT_AMOUNT_EDEFAULT == null ? getCreditAmount() != null : !CREDIT_AMOUNT_EDEFAULT.equals(getCreditAmount());
			case _301Package.DOCUMENT_ROOT__CURRENCY_AMOUNT:
				return CURRENCY_AMOUNT_EDEFAULT == null ? getCurrencyAmount() != null : !CURRENCY_AMOUNT_EDEFAULT.equals(getCurrencyAmount());
			case _301Package.DOCUMENT_ROOT__CURRENCY_CODE:
				return CURRENCY_CODE_EDEFAULT == null ? getCurrencyCode() != null : !CURRENCY_CODE_EDEFAULT.equals(getCurrencyCode());
			case _301Package.DOCUMENT_ROOT__CUSTOMER:
				return getCustomer() != null;
			case _301Package.DOCUMENT_ROOT__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? getCustomerID() != null : !CUSTOMER_ID_EDEFAULT.equals(getCustomerID());
			case _301Package.DOCUMENT_ROOT__CUSTOMER_TAX_ID:
				return CUSTOMER_TAX_ID_EDEFAULT == null ? getCustomerTaxID() != null : !CUSTOMER_TAX_ID_EDEFAULT.equals(getCustomerTaxID());
			case _301Package.DOCUMENT_ROOT__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? getDateCreated() != null : !DATE_CREATED_EDEFAULT.equals(getDateCreated());
			case _301Package.DOCUMENT_ROOT__DEBIT_AMOUNT:
				return DEBIT_AMOUNT_EDEFAULT == null ? getDebitAmount() != null : !DEBIT_AMOUNT_EDEFAULT.equals(getDebitAmount());
			case _301Package.DOCUMENT_ROOT__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? getDeliveryDate() != null : !DELIVERY_DATE_EDEFAULT.equals(getDeliveryDate());
			case _301Package.DOCUMENT_ROOT__DELIVERY_ID:
				return DELIVERY_ID_EDEFAULT == null ? getDeliveryID() != null : !DELIVERY_ID_EDEFAULT.equals(getDeliveryID());
			case _301Package.DOCUMENT_ROOT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case _301Package.DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER:
				return DOC_ARCHIVAL_NUMBER_EDEFAULT == null ? getDocArchivalNumber() != null : !DOC_ARCHIVAL_NUMBER_EDEFAULT.equals(getDocArchivalNumber());
			case _301Package.DOCUMENT_ROOT__DOCUMENT_NUMBER:
				return DOCUMENT_NUMBER_EDEFAULT == null ? getDocumentNumber() != null : !DOCUMENT_NUMBER_EDEFAULT.equals(getDocumentNumber());
			case _301Package.DOCUMENT_ROOT__EAC_CODE:
				return EAC_CODE_EDEFAULT == null ? getEACCode() != null : !EAC_CODE_EDEFAULT.equals(getEACCode());
			case _301Package.DOCUMENT_ROOT__EMAIL:
				return EMAIL_EDEFAULT == null ? getEmail() != null : !EMAIL_EDEFAULT.equals(getEmail());
			case _301Package.DOCUMENT_ROOT__END_DATE:
				return END_DATE_EDEFAULT == null ? getEndDate() != null : !END_DATE_EDEFAULT.equals(getEndDate());
			case _301Package.DOCUMENT_ROOT__EXCHANGE_RATE:
				return EXCHANGE_RATE_EDEFAULT == null ? getExchangeRate() != null : !EXCHANGE_RATE_EDEFAULT.equals(getExchangeRate());
			case _301Package.DOCUMENT_ROOT__FAX:
				return FAX_EDEFAULT == null ? getFax() != null : !FAX_EDEFAULT.equals(getFax());
			case _301Package.DOCUMENT_ROOT__FISCAL_YEAR:
				return FISCAL_YEAR_EDEFAULT == null ? getFiscalYear() != null : !FISCAL_YEAR_EDEFAULT.equals(getFiscalYear());
			case _301Package.DOCUMENT_ROOT__GENERAL_LEDGER:
				return getGeneralLedger() != null;
			case _301Package.DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES:
				return getGeneralLedgerEntries() != null;
			case _301Package.DOCUMENT_ROOT__GL_POSTING_DATE:
				return GL_POSTING_DATE_EDEFAULT == null ? getGLPostingDate() != null : !GL_POSTING_DATE_EDEFAULT.equals(getGLPostingDate());
			case _301Package.DOCUMENT_ROOT__GROSS_TOTAL:
				return GROSS_TOTAL_EDEFAULT == null ? getGrossTotal() != null : !GROSS_TOTAL_EDEFAULT.equals(getGrossTotal());
			case _301Package.DOCUMENT_ROOT__GROUPING_CATEGORY:
				return getGroupingCategory() != GROUPING_CATEGORY_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__HASH:
				return HASH_EDEFAULT == null ? getHash() != null : !HASH_EDEFAULT.equals(getHash());
			case _301Package.DOCUMENT_ROOT__HASH_CONTROL:
				return HASH_CONTROL_EDEFAULT == null ? getHashControl() != null : !HASH_CONTROL_EDEFAULT.equals(getHashControl());
			case _301Package.DOCUMENT_ROOT__HEADER:
				return getHeader() != null;
			case _301Package.DOCUMENT_ROOT__HEADER_COMMENT:
				return HEADER_COMMENT_EDEFAULT == null ? getHeaderComment() != null : !HEADER_COMMENT_EDEFAULT.equals(getHeaderComment());
			case _301Package.DOCUMENT_ROOT__INVOICE_DATE:
				return INVOICE_DATE_EDEFAULT == null ? getInvoiceDate() != null : !INVOICE_DATE_EDEFAULT.equals(getInvoiceDate());
			case _301Package.DOCUMENT_ROOT__INVOICE_NO:
				return INVOICE_NO_EDEFAULT == null ? getInvoiceNo() != null : !INVOICE_NO_EDEFAULT.equals(getInvoiceNo());
			case _301Package.DOCUMENT_ROOT__INVOICE_STATUS:
				return getInvoiceStatus() != INVOICE_STATUS_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__INVOICE_STATUS_DATE:
				return INVOICE_STATUS_DATE_EDEFAULT == null ? getInvoiceStatusDate() != null : !INVOICE_STATUS_DATE_EDEFAULT.equals(getInvoiceStatusDate());
			case _301Package.DOCUMENT_ROOT__INVOICE_TYPE:
				return getInvoiceType() != INVOICE_TYPE_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__JOURNAL_ID:
				return JOURNAL_ID_EDEFAULT == null ? getJournalID() != null : !JOURNAL_ID_EDEFAULT.equals(getJournalID());
			case _301Package.DOCUMENT_ROOT__LINE_NUMBER:
				return LINE_NUMBER_EDEFAULT == null ? getLineNumber() != null : !LINE_NUMBER_EDEFAULT.equals(getLineNumber());
			case _301Package.DOCUMENT_ROOT__LOCATION_ID:
				return LOCATION_ID_EDEFAULT == null ? getLocationID() != null : !LOCATION_ID_EDEFAULT.equals(getLocationID());
			case _301Package.DOCUMENT_ROOT__MOVEMENT_COMMENTS:
				return MOVEMENT_COMMENTS_EDEFAULT == null ? getMovementComments() != null : !MOVEMENT_COMMENTS_EDEFAULT.equals(getMovementComments());
			case _301Package.DOCUMENT_ROOT__MOVEMENT_DATE:
				return MOVEMENT_DATE_EDEFAULT == null ? getMovementDate() != null : !MOVEMENT_DATE_EDEFAULT.equals(getMovementDate());
			case _301Package.DOCUMENT_ROOT__MOVEMENT_END_TIME:
				return MOVEMENT_END_TIME_EDEFAULT == null ? getMovementEndTime() != null : !MOVEMENT_END_TIME_EDEFAULT.equals(getMovementEndTime());
			case _301Package.DOCUMENT_ROOT__MOVEMENT_START_TIME:
				return MOVEMENT_START_TIME_EDEFAULT == null ? getMovementStartTime() != null : !MOVEMENT_START_TIME_EDEFAULT.equals(getMovementStartTime());
			case _301Package.DOCUMENT_ROOT__MOVEMENT_STATUS:
				return getMovementStatus() != MOVEMENT_STATUS_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__MOVEMENT_STATUS_DATE:
				return MOVEMENT_STATUS_DATE_EDEFAULT == null ? getMovementStatusDate() != null : !MOVEMENT_STATUS_DATE_EDEFAULT.equals(getMovementStatusDate());
			case _301Package.DOCUMENT_ROOT__MOVEMENT_TYPE:
				return getMovementType() != MOVEMENT_TYPE_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__NET_TOTAL:
				return NET_TOTAL_EDEFAULT == null ? getNetTotal() != null : !NET_TOTAL_EDEFAULT.equals(getNetTotal());
			case _301Package.DOCUMENT_ROOT__NUMBER_OF_ENTRIES:
				return NUMBER_OF_ENTRIES_EDEFAULT == null ? getNumberOfEntries() != null : !NUMBER_OF_ENTRIES_EDEFAULT.equals(getNumberOfEntries());
			case _301Package.DOCUMENT_ROOT__NUMBER_OF_MOVEMENT_LINES:
				return NUMBER_OF_MOVEMENT_LINES_EDEFAULT == null ? getNumberOfMovementLines() != null : !NUMBER_OF_MOVEMENT_LINES_EDEFAULT.equals(getNumberOfMovementLines());
			case _301Package.DOCUMENT_ROOT__OPENING_CREDIT_BALANCE:
				return OPENING_CREDIT_BALANCE_EDEFAULT == null ? getOpeningCreditBalance() != null : !OPENING_CREDIT_BALANCE_EDEFAULT.equals(getOpeningCreditBalance());
			case _301Package.DOCUMENT_ROOT__OPENING_DEBIT_BALANCE:
				return OPENING_DEBIT_BALANCE_EDEFAULT == null ? getOpeningDebitBalance() != null : !OPENING_DEBIT_BALANCE_EDEFAULT.equals(getOpeningDebitBalance());
			case _301Package.DOCUMENT_ROOT__ORDER_DATE:
				return ORDER_DATE_EDEFAULT == null ? getOrderDate() != null : !ORDER_DATE_EDEFAULT.equals(getOrderDate());
			case _301Package.DOCUMENT_ROOT__ORIGINATING_ON:
				return ORIGINATING_ON_EDEFAULT == null ? getOriginatingON() != null : !ORIGINATING_ON_EDEFAULT.equals(getOriginatingON());
			case _301Package.DOCUMENT_ROOT__PAYMENT_MECHANISM:
				return getPaymentMechanism() != PAYMENT_MECHANISM_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__PAYMENT_REF_NO:
				return PAYMENT_REF_NO_EDEFAULT == null ? getPaymentRefNo() != null : !PAYMENT_REF_NO_EDEFAULT.equals(getPaymentRefNo());
			case _301Package.DOCUMENT_ROOT__PAYMENT_STATUS:
				return getPaymentStatus() != PAYMENT_STATUS_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__PAYMENT_STATUS_DATE:
				return PAYMENT_STATUS_DATE_EDEFAULT == null ? getPaymentStatusDate() != null : !PAYMENT_STATUS_DATE_EDEFAULT.equals(getPaymentStatusDate());
			case _301Package.DOCUMENT_ROOT__PERIOD:
				return PERIOD_EDEFAULT == null ? getPeriod() != null : !PERIOD_EDEFAULT.equals(getPeriod());
			case _301Package.DOCUMENT_ROOT__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? getPostalCode() != null : !POSTAL_CODE_EDEFAULT.equals(getPostalCode());
			case _301Package.DOCUMENT_ROOT__PRODUCT:
				return getProduct() != null;
			case _301Package.DOCUMENT_ROOT__PRODUCT_CODE:
				return PRODUCT_CODE_EDEFAULT == null ? getProductCode() != null : !PRODUCT_CODE_EDEFAULT.equals(getProductCode());
			case _301Package.DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID:
				return PRODUCT_COMPANY_TAX_ID_EDEFAULT == null ? getProductCompanyTaxID() != null : !PRODUCT_COMPANY_TAX_ID_EDEFAULT.equals(getProductCompanyTaxID());
			case _301Package.DOCUMENT_ROOT__PRODUCT_DESCRIPTION:
				return PRODUCT_DESCRIPTION_EDEFAULT == null ? getProductDescription() != null : !PRODUCT_DESCRIPTION_EDEFAULT.equals(getProductDescription());
			case _301Package.DOCUMENT_ROOT__PRODUCT_GROUP:
				return PRODUCT_GROUP_EDEFAULT == null ? getProductGroup() != null : !PRODUCT_GROUP_EDEFAULT.equals(getProductGroup());
			case _301Package.DOCUMENT_ROOT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? getProductID() != null : !PRODUCT_ID_EDEFAULT.equals(getProductID());
			case _301Package.DOCUMENT_ROOT__PRODUCT_NUMBER_CODE:
				return PRODUCT_NUMBER_CODE_EDEFAULT == null ? getProductNumberCode() != null : !PRODUCT_NUMBER_CODE_EDEFAULT.equals(getProductNumberCode());
			case _301Package.DOCUMENT_ROOT__PRODUCT_TYPE:
				return getProductType() != PRODUCT_TYPE_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__PRODUCT_VERSION:
				return PRODUCT_VERSION_EDEFAULT == null ? getProductVersion() != null : !PRODUCT_VERSION_EDEFAULT.equals(getProductVersion());
			case _301Package.DOCUMENT_ROOT__QUANTITY:
				return QUANTITY_EDEFAULT == null ? getQuantity() != null : !QUANTITY_EDEFAULT.equals(getQuantity());
			case _301Package.DOCUMENT_ROOT__REASON:
				return REASON_EDEFAULT == null ? getReason() != null : !REASON_EDEFAULT.equals(getReason());
			case _301Package.DOCUMENT_ROOT__RECORD_ID:
				return RECORD_ID_EDEFAULT == null ? getRecordID() != null : !RECORD_ID_EDEFAULT.equals(getRecordID());
			case _301Package.DOCUMENT_ROOT__REFERENCE:
				return REFERENCE_EDEFAULT == null ? getReference() != null : !REFERENCE_EDEFAULT.equals(getReference());
			case _301Package.DOCUMENT_ROOT__REGION:
				return REGION_EDEFAULT == null ? getRegion() != null : !REGION_EDEFAULT.equals(getRegion());
			case _301Package.DOCUMENT_ROOT__SELF_BILLING_INDICATOR:
				return SELF_BILLING_INDICATOR_EDEFAULT == null ? getSelfBillingIndicator() != null : !SELF_BILLING_INDICATOR_EDEFAULT.equals(getSelfBillingIndicator());
			case _301Package.DOCUMENT_ROOT__SETTLEMENT_AMOUNT:
				return SETTLEMENT_AMOUNT_EDEFAULT == null ? getSettlementAmount() != null : !SETTLEMENT_AMOUNT_EDEFAULT.equals(getSettlementAmount());
			case _301Package.DOCUMENT_ROOT__SHIP_FROM:
				return getShipFrom() != null;
			case _301Package.DOCUMENT_ROOT__SHIP_FROM_ADDRESS:
				return getShipFromAddress() != null;
			case _301Package.DOCUMENT_ROOT__SHIP_TO:
				return getShipTo() != null;
			case _301Package.DOCUMENT_ROOT__SHIP_TO_ADDRESS:
				return getShipToAddress() != null;
			case _301Package.DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER:
				return SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT == null ? getSoftwareCertificateNumber() != null : !SOFTWARE_CERTIFICATE_NUMBER_EDEFAULT.equals(getSoftwareCertificateNumber());
			case _301Package.DOCUMENT_ROOT__SOURCE_DOCUMENT_ID:
				return SOURCE_DOCUMENT_ID_EDEFAULT == null ? getSourceDocumentID() != null : !SOURCE_DOCUMENT_ID_EDEFAULT.equals(getSourceDocumentID());
			case _301Package.DOCUMENT_ROOT__SOURCE_DOCUMENTS:
				return getSourceDocuments() != null;
			case _301Package.DOCUMENT_ROOT__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? getSourceID() != null : !SOURCE_ID_EDEFAULT.equals(getSourceID());
			case _301Package.DOCUMENT_ROOT__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case _301Package.DOCUMENT_ROOT__STREET_NAME:
				return STREET_NAME_EDEFAULT == null ? getStreetName() != null : !STREET_NAME_EDEFAULT.equals(getStreetName());
			case _301Package.DOCUMENT_ROOT__SUPPLIER:
				return getSupplier() != null;
			case _301Package.DOCUMENT_ROOT__SUPPLIER_ID:
				return SUPPLIER_ID_EDEFAULT == null ? getSupplierID() != null : !SUPPLIER_ID_EDEFAULT.equals(getSupplierID());
			case _301Package.DOCUMENT_ROOT__SUPPLIER_TAX_ID:
				return SUPPLIER_TAX_ID_EDEFAULT == null ? getSupplierTaxID() != null : !SUPPLIER_TAX_ID_EDEFAULT.equals(getSupplierTaxID());
			case _301Package.DOCUMENT_ROOT__SYSTEM_ENTRY_DATE:
				return SYSTEM_ENTRY_DATE_EDEFAULT == null ? getSystemEntryDate() != null : !SYSTEM_ENTRY_DATE_EDEFAULT.equals(getSystemEntryDate());
			case _301Package.DOCUMENT_ROOT__SYSTEM_ID:
				return SYSTEM_ID_EDEFAULT == null ? getSystemID() != null : !SYSTEM_ID_EDEFAULT.equals(getSystemID());
			case _301Package.DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS:
				return getTaxAccountingBasis() != TAX_ACCOUNTING_BASIS_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__TAX_AMOUNT:
				return TAX_AMOUNT_EDEFAULT == null ? getTaxAmount() != null : !TAX_AMOUNT_EDEFAULT.equals(getTaxAmount());
			case _301Package.DOCUMENT_ROOT__TAX_CODE:
				return TAX_CODE_EDEFAULT == null ? getTaxCode() != null : !TAX_CODE_EDEFAULT.equals(getTaxCode());
			case _301Package.DOCUMENT_ROOT__TAX_COUNTRY_REGION:
				return TAX_COUNTRY_REGION_EDEFAULT == null ? getTaxCountryRegion() != null : !TAX_COUNTRY_REGION_EDEFAULT.equals(getTaxCountryRegion());
			case _301Package.DOCUMENT_ROOT__TAX_ENTITY:
				return TAX_ENTITY_EDEFAULT == null ? getTaxEntity() != null : !TAX_ENTITY_EDEFAULT.equals(getTaxEntity());
			case _301Package.DOCUMENT_ROOT__TAX_EXEMPTION_REASON:
				return TAX_EXEMPTION_REASON_EDEFAULT == null ? getTaxExemptionReason() != null : !TAX_EXEMPTION_REASON_EDEFAULT.equals(getTaxExemptionReason());
			case _301Package.DOCUMENT_ROOT__TAX_EXPIRATION_DATE:
				return TAX_EXPIRATION_DATE_EDEFAULT == null ? getTaxExpirationDate() != null : !TAX_EXPIRATION_DATE_EDEFAULT.equals(getTaxExpirationDate());
			case _301Package.DOCUMENT_ROOT__TAX_PAYABLE:
				return TAX_PAYABLE_EDEFAULT == null ? getTaxPayable() != null : !TAX_PAYABLE_EDEFAULT.equals(getTaxPayable());
			case _301Package.DOCUMENT_ROOT__TAX_PERCENTAGE:
				return TAX_PERCENTAGE_EDEFAULT == null ? getTaxPercentage() != null : !TAX_PERCENTAGE_EDEFAULT.equals(getTaxPercentage());
			case _301Package.DOCUMENT_ROOT__TAX_POINT_DATE:
				return TAX_POINT_DATE_EDEFAULT == null ? getTaxPointDate() != null : !TAX_POINT_DATE_EDEFAULT.equals(getTaxPointDate());
			case _301Package.DOCUMENT_ROOT__TAX_TABLE:
				return getTaxTable() != null;
			case _301Package.DOCUMENT_ROOT__TAX_TABLE_ENTRY:
				return getTaxTableEntry() != null;
			case _301Package.DOCUMENT_ROOT__TAX_TYPE:
				return getTaxType() != TAX_TYPE_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__TAX_VERIFICATION_DATE:
				return TAX_VERIFICATION_DATE_EDEFAULT == null ? getTaxVerificationDate() != null : !TAX_VERIFICATION_DATE_EDEFAULT.equals(getTaxVerificationDate());
			case _301Package.DOCUMENT_ROOT__TELEPHONE:
				return TELEPHONE_EDEFAULT == null ? getTelephone() != null : !TELEPHONE_EDEFAULT.equals(getTelephone());
			case _301Package.DOCUMENT_ROOT__THIRD_PARTIES_BILLING_INDICATOR:
				return THIRD_PARTIES_BILLING_INDICATOR_EDEFAULT == null ? getThirdPartiesBillingIndicator() != null : !THIRD_PARTIES_BILLING_INDICATOR_EDEFAULT.equals(getThirdPartiesBillingIndicator());
			case _301Package.DOCUMENT_ROOT__TOTAL_CREDIT:
				return TOTAL_CREDIT_EDEFAULT == null ? getTotalCredit() != null : !TOTAL_CREDIT_EDEFAULT.equals(getTotalCredit());
			case _301Package.DOCUMENT_ROOT__TOTAL_DEBIT:
				return TOTAL_DEBIT_EDEFAULT == null ? getTotalDebit() != null : !TOTAL_DEBIT_EDEFAULT.equals(getTotalDebit());
			case _301Package.DOCUMENT_ROOT__TOTAL_QUANTITY_ISSUED:
				return TOTAL_QUANTITY_ISSUED_EDEFAULT == null ? getTotalQuantityIssued() != null : !TOTAL_QUANTITY_ISSUED_EDEFAULT.equals(getTotalQuantityIssued());
			case _301Package.DOCUMENT_ROOT__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? getTransactionDate() != null : !TRANSACTION_DATE_EDEFAULT.equals(getTransactionDate());
			case _301Package.DOCUMENT_ROOT__TRANSACTION_ID:
				return TRANSACTION_ID_EDEFAULT == null ? getTransactionID() != null : !TRANSACTION_ID_EDEFAULT.equals(getTransactionID());
			case _301Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				return getTransactionType() != TRANSACTION_TYPE_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				return UNIT_OF_MEASURE_EDEFAULT == null ? getUnitOfMeasure() != null : !UNIT_OF_MEASURE_EDEFAULT.equals(getUnitOfMeasure());
			case _301Package.DOCUMENT_ROOT__UNIT_PRICE:
				return UNIT_PRICE_EDEFAULT == null ? getUnitPrice() != null : !UNIT_PRICE_EDEFAULT.equals(getUnitPrice());
			case _301Package.DOCUMENT_ROOT__WAREHOUSE_ID:
				return WAREHOUSE_ID_EDEFAULT == null ? getWarehouseID() != null : !WAREHOUSE_ID_EDEFAULT.equals(getWarehouseID());
			case _301Package.DOCUMENT_ROOT__WEBSITE:
				return WEBSITE_EDEFAULT == null ? getWebsite() != null : !WEBSITE_EDEFAULT.equals(getWebsite());
			case _301Package.DOCUMENT_ROOT__WITHHOLDING_TAX_TYPE:
				return getWithholdingTaxType() != WITHHOLDING_TAX_TYPE_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__WORK_DATE:
				return WORK_DATE_EDEFAULT == null ? getWorkDate() != null : !WORK_DATE_EDEFAULT.equals(getWorkDate());
			case _301Package.DOCUMENT_ROOT__WORK_STATUS:
				return getWorkStatus() != WORK_STATUS_EDEFAULT;
			case _301Package.DOCUMENT_ROOT__WORK_STATUS_DATE:
				return WORK_STATUS_DATE_EDEFAULT == null ? getWorkStatusDate() != null : !WORK_STATUS_DATE_EDEFAULT.equals(getWorkStatusDate());
			case _301Package.DOCUMENT_ROOT__WORK_TYPE:
				return getWorkType() != WORK_TYPE_EDEFAULT;
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
