/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._301.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package
 * @generated
 */
public class _301Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final _301Validator INSTANCE = new _301Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "oecd.standard.audit.file.tax.p.t1._0._301";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _301Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return _301Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case _301Package.ADDRESS_STRUCTURE:
				return validateAddressStructure((AddressStructure)value, diagnostics, context);
			case _301Package.ADDRESS_STRUCTURE_PT:
				return validateAddressStructurePT((AddressStructurePT)value, diagnostics, context);
			case _301Package.AUDIT_FILE_TYPE:
				return validateAuditFileType((AuditFileType)value, diagnostics, context);
			case _301Package.CURRENCY:
				return validateCurrency((Currency)value, diagnostics, context);
			case _301Package.CUSTOMER_TYPE:
				return validateCustomerType((CustomerType)value, diagnostics, context);
			case _301Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case _301Package.DOCUMENT_STATUS_TYPE:
				return validateDocumentStatusType((DocumentStatusType)value, diagnostics, context);
			case _301Package.DOCUMENT_STATUS_TYPE1:
				return validateDocumentStatusType1((DocumentStatusType1)value, diagnostics, context);
			case _301Package.DOCUMENT_STATUS_TYPE2:
				return validateDocumentStatusType2((DocumentStatusType2)value, diagnostics, context);
			case _301Package.DOCUMENT_STATUS_TYPE3:
				return validateDocumentStatusType3((DocumentStatusType3)value, diagnostics, context);
			case _301Package.DOCUMENT_TOTALS_TYPE:
				return validateDocumentTotalsType((DocumentTotalsType)value, diagnostics, context);
			case _301Package.DOCUMENT_TOTALS_TYPE1:
				return validateDocumentTotalsType1((DocumentTotalsType1)value, diagnostics, context);
			case _301Package.DOCUMENT_TOTALS_TYPE2:
				return validateDocumentTotalsType2((DocumentTotalsType2)value, diagnostics, context);
			case _301Package.DOCUMENT_TOTALS_TYPE3:
				return validateDocumentTotalsType3((DocumentTotalsType3)value, diagnostics, context);
			case _301Package.GENERAL_LEDGER_ENTRIES_TYPE:
				return validateGeneralLedgerEntriesType((GeneralLedgerEntriesType)value, diagnostics, context);
			case _301Package.GENERAL_LEDGER_TYPE:
				return validateGeneralLedgerType((GeneralLedgerType)value, diagnostics, context);
			case _301Package.HEADER_TYPE:
				return validateHeaderType((HeaderType)value, diagnostics, context);
			case _301Package.INVOICE_TYPE:
				return validateInvoiceType((InvoiceType)value, diagnostics, context);
			case _301Package.JOURNAL_TYPE:
				return validateJournalType((JournalType)value, diagnostics, context);
			case _301Package.LINE_TYPE:
				return validateLineType((LineType)value, diagnostics, context);
			case _301Package.LINE_TYPE1:
				return validateLineType1((LineType1)value, diagnostics, context);
			case _301Package.LINE_TYPE2:
				return validateLineType2((LineType2)value, diagnostics, context);
			case _301Package.LINE_TYPE3:
				return validateLineType3((LineType3)value, diagnostics, context);
			case _301Package.LINE_TYPE4:
				return validateLineType4((LineType4)value, diagnostics, context);
			case _301Package.MASTER_FILES_TYPE:
				return validateMasterFilesType((MasterFilesType)value, diagnostics, context);
			case _301Package.MOVEMENT_OF_GOODS_TYPE:
				return validateMovementOfGoodsType((MovementOfGoodsType)value, diagnostics, context);
			case _301Package.MOVEMENT_TAX:
				return validateMovementTax((MovementTax)value, diagnostics, context);
			case _301Package.ORDER_REFERENCES:
				return validateOrderReferences((OrderReferences)value, diagnostics, context);
			case _301Package.PAYMENT_METHOD:
				return validatePaymentMethod((PaymentMethod)value, diagnostics, context);
			case _301Package.PAYMENTS_TYPE:
				return validatePaymentsType((PaymentsType)value, diagnostics, context);
			case _301Package.PAYMENT_TAX:
				return validatePaymentTax((PaymentTax)value, diagnostics, context);
			case _301Package.PAYMENT_TYPE:
				return validatePaymentType((PaymentType)value, diagnostics, context);
			case _301Package.PRODUCT_TYPE:
				return validateProductType((ProductType)value, diagnostics, context);
			case _301Package.REFERENCES:
				return validateReferences((References)value, diagnostics, context);
			case _301Package.SALES_INVOICES_TYPE:
				return validateSalesInvoicesType((SalesInvoicesType)value, diagnostics, context);
			case _301Package.SETTLEMENT:
				return validateSettlement((Settlement)value, diagnostics, context);
			case _301Package.SETTLEMENT_TYPE:
				return validateSettlementType((SettlementType)value, diagnostics, context);
			case _301Package.SHIPPING_POINT_STRUCTURE:
				return validateShippingPointStructure((ShippingPointStructure)value, diagnostics, context);
			case _301Package.SOURCE_DOCUMENT_ID_TYPE:
				return validateSourceDocumentIDType((SourceDocumentIDType)value, diagnostics, context);
			case _301Package.SOURCE_DOCUMENTS_TYPE:
				return validateSourceDocumentsType((SourceDocumentsType)value, diagnostics, context);
			case _301Package.SPECIAL_REGIMES:
				return validateSpecialRegimes((SpecialRegimes)value, diagnostics, context);
			case _301Package.STOCK_MOVEMENT_TYPE:
				return validateStockMovementType((StockMovementType)value, diagnostics, context);
			case _301Package.SUPPLIER_ADDRESS_STRUCTURE:
				return validateSupplierAddressStructure((SupplierAddressStructure)value, diagnostics, context);
			case _301Package.SUPPLIER_TYPE:
				return validateSupplierType((SupplierType)value, diagnostics, context);
			case _301Package.TAX:
				return validateTax((Tax)value, diagnostics, context);
			case _301Package.TAX_TABLE_ENTRY_TYPE:
				return validateTaxTableEntryType((TaxTableEntryType)value, diagnostics, context);
			case _301Package.TAX_TABLE_TYPE:
				return validateTaxTableType((TaxTableType)value, diagnostics, context);
			case _301Package.TRANSACTION_TYPE:
				return validateTransactionType((TransactionType)value, diagnostics, context);
			case _301Package.WITHHOLDING_TAX:
				return validateWithholdingTax((WithholdingTax)value, diagnostics, context);
			case _301Package.WORK_DOCUMENT_TYPE:
				return validateWorkDocumentType((WorkDocumentType)value, diagnostics, context);
			case _301Package.WORKING_DOCUMENTS_TYPE:
				return validateWorkingDocumentsType((WorkingDocumentsType)value, diagnostics, context);
			case _301Package.GROUPING_CATEGORY_TYPE:
				return validateGroupingCategoryType((GroupingCategoryType)value, diagnostics, context);
			case _301Package.INVOICE_STATUS_TYPE:
				return validateInvoiceStatusType((InvoiceStatusType)value, diagnostics, context);
			case _301Package.INVOICE_TYPE_TYPE:
				return validateInvoiceTypeType((InvoiceTypeType)value, diagnostics, context);
			case _301Package.MOVEMENT_STATUS_TYPE:
				return validateMovementStatusType((MovementStatusType)value, diagnostics, context);
			case _301Package.MOVEMENT_TYPE_TYPE:
				return validateMovementTypeType((MovementTypeType)value, diagnostics, context);
			case _301Package.PAYMENT_MECHANISM_TYPE:
				return validatePaymentMechanismType((PaymentMechanismType)value, diagnostics, context);
			case _301Package.PAYMENT_STATUS_TYPE:
				return validatePaymentStatusType((PaymentStatusType)value, diagnostics, context);
			case _301Package.PRODUCT_TYPE_TYPE:
				return validateProductTypeType((ProductTypeType)value, diagnostics, context);
			case _301Package.SAFTPT_MOVEMENT_TAX_TYPE:
				return validateSAFTPTMovementTaxType((SAFTPTMovementTaxType)value, diagnostics, context);
			case _301Package.SAFTPT_PAYMENT_TYPE:
				return validateSAFTPTPaymentType((SAFTPTPaymentType)value, diagnostics, context);
			case _301Package.SAFTPT_SOURCE_BILLING:
				return validateSAFTPTSourceBilling((SAFTPTSourceBilling)value, diagnostics, context);
			case _301Package.SAFTPT_SOURCE_PAYMENT:
				return validateSAFTPTSourcePayment((SAFTPTSourcePayment)value, diagnostics, context);
			case _301Package.TAX_ACCOUNTING_BASIS_TYPE:
				return validateTaxAccountingBasisType((TaxAccountingBasisType)value, diagnostics, context);
			case _301Package.TAX_TYPE_TYPE:
				return validateTaxTypeType((TaxTypeType)value, diagnostics, context);
			case _301Package.TRANSACTION_TYPE_TYPE:
				return validateTransactionTypeType((TransactionTypeType)value, diagnostics, context);
			case _301Package.WITHHOLDING_TAX_TYPE_TYPE:
				return validateWithholdingTaxTypeType((WithholdingTaxTypeType)value, diagnostics, context);
			case _301Package.WORK_STATUS_TYPE:
				return validateWorkStatusType((WorkStatusType)value, diagnostics, context);
			case _301Package.WORK_TYPE_TYPE:
				return validateWorkTypeType((WorkTypeType)value, diagnostics, context);
			case _301Package.ACCOUNT_ID_TYPE:
				return validateAccountIDType((String)value, diagnostics, context);
			case _301Package.AUDIT_FILE_VERSION_TYPE:
				return validateAuditFileVersionType((String)value, diagnostics, context);
			case _301Package.CASH_VAT_SCHEME_INDICATOR_TYPE:
				return validateCashVATSchemeIndicatorType((BigInteger)value, diagnostics, context);
			case _301Package.COMPANY_ID_TYPE:
				return validateCompanyIDType((String)value, diagnostics, context);
			case _301Package.COUNTRY_TYPE:
				return validateCountryType((String)value, diagnostics, context);
			case _301Package.CURRENCY_CODE_TYPE:
				return validateCurrencyCodeType((String)value, diagnostics, context);
			case _301Package.DOCUMENT_NUMBER_TYPE:
				return validateDocumentNumberType((String)value, diagnostics, context);
			case _301Package.EAC_CODE_TYPE:
				return validateEACCodeType((String)value, diagnostics, context);
			case _301Package.FISCAL_YEAR_TYPE:
				return validateFiscalYearType((BigInteger)value, diagnostics, context);
			case _301Package.GROUPING_CATEGORY_TYPE_OBJECT:
				return validateGroupingCategoryTypeObject((GroupingCategoryType)value, diagnostics, context);
			case _301Package.INVOICE_NO_TYPE:
				return validateInvoiceNoType((String)value, diagnostics, context);
			case _301Package.INVOICE_STATUS_TYPE_OBJECT:
				return validateInvoiceStatusTypeObject((InvoiceStatusType)value, diagnostics, context);
			case _301Package.INVOICE_TYPE_TYPE_OBJECT:
				return validateInvoiceTypeTypeObject((InvoiceTypeType)value, diagnostics, context);
			case _301Package.MOVEMENT_STATUS_TYPE_OBJECT:
				return validateMovementStatusTypeObject((MovementStatusType)value, diagnostics, context);
			case _301Package.MOVEMENT_TYPE_TYPE_OBJECT:
				return validateMovementTypeTypeObject((MovementTypeType)value, diagnostics, context);
			case _301Package.PAYMENT_MECHANISM_TYPE_OBJECT:
				return validatePaymentMechanismTypeObject((PaymentMechanismType)value, diagnostics, context);
			case _301Package.PAYMENT_REF_NO_TYPE:
				return validatePaymentRefNoType((String)value, diagnostics, context);
			case _301Package.PAYMENT_STATUS_TYPE_OBJECT:
				return validatePaymentStatusTypeObject((PaymentStatusType)value, diagnostics, context);
			case _301Package.PAYMENT_TAX_CODE:
				return validatePaymentTaxCode((String)value, diagnostics, context);
			case _301Package.PERIOD_TYPE:
				return validatePeriodType((BigInteger)value, diagnostics, context);
			case _301Package.POSTAL_CODE_PT:
				return validatePostalCodePT((String)value, diagnostics, context);
			case _301Package.PRODUCT_TYPE_TYPE_OBJECT:
				return validateProductTypeTypeObject((ProductTypeType)value, diagnostics, context);
			case _301Package.SA_FDATE_TIME_TYPE:
				return validateSAFdateTimeType((XMLGregorianCalendar)value, diagnostics, context);
			case _301Package.SA_FDATE_TYPE:
				return validateSAFdateType((XMLGregorianCalendar)value, diagnostics, context);
			case _301Package.SA_FDECIMAL_TYPE:
				return validateSAFdecimalType((BigDecimal)value, diagnostics, context);
			case _301Package.SA_FMONETARY_TYPE:
				return validateSAFmonetaryType((BigDecimal)value, diagnostics, context);
			case _301Package.SAFPT_ACCOUNTING_PERIOD:
				return validateSAFPTAccountingPeriod((BigInteger)value, diagnostics, context);
			case _301Package.SAFPT_DATE_SPAN:
				return validateSAFPTDateSpan((XMLGregorianCalendar)value, diagnostics, context);
			case _301Package.SAFPTGL_ACCOUNT_ID:
				return validateSAFPTGLAccountID((String)value, diagnostics, context);
			case _301Package.SAFPT_JOURNAL_ID:
				return validateSAFPTJournalID((String)value, diagnostics, context);
			case _301Package.SAFPT_PORTUGUESE_TAX_EXEMPTION:
				return validateSAFPTPortugueseTaxExemption((String)value, diagnostics, context);
			case _301Package.SAFPT_PORTUGUESE_VAT_NUMBER:
				return validateSAFPTPortugueseVatNumber((BigInteger)value, diagnostics, context);
			case _301Package.SAFPT_PRODUCT_ID:
				return validateSAFPTProductID((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX100_CAR:
				return validateSAFPTtextTypeMandatoryMax100Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR:
				return validateSAFPTtextTypeMandatoryMax10Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX172_CAR:
				return validateSAFPTtextTypeMandatoryMax172Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR:
				return validateSAFPTtextTypeMandatoryMax200Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR:
				return validateSAFPTtextTypeMandatoryMax20Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR:
				return validateSAFPTtextTypeMandatoryMax255Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR:
				return validateSAFPTtextTypeMandatoryMax30Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX35_CAR:
				return validateSAFPTtextTypeMandatoryMax35Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR:
				return validateSAFPTtextTypeMandatoryMax3Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR:
				return validateSAFPTtextTypeMandatoryMax40Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR:
				return validateSAFPTtextTypeMandatoryMax50Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR:
				return validateSAFPTtextTypeMandatoryMax60Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR:
				return validateSAFPTtextTypeMandatoryMax70Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX90_CAR:
				return validateSAFPTtextTypeMandatoryMax90Car((String)value, diagnostics, context);
			case _301Package.SAFP_TTEXT_TYPE_MAX40_CAR:
				return validateSAFPTtextTypeMax40Car((String)value, diagnostics, context);
			case _301Package.SAFPT_TRANSACTION_ID:
				return validateSAFPTTransactionID((String)value, diagnostics, context);
			case _301Package.SAFTPT_DOC_ARCHIVAL_NUMBER:
				return validateSAFTPTDocArchivalNumber((String)value, diagnostics, context);
			case _301Package.SAFTPT_MOVEMENT_TAX_CODE:
				return validateSAFTPTMovementTaxCode((String)value, diagnostics, context);
			case _301Package.SAFTPT_MOVEMENT_TAX_TYPE_OBJECT:
				return validateSAFTPTMovementTaxTypeObject((SAFTPTMovementTaxType)value, diagnostics, context);
			case _301Package.SAFTPT_PAYMENT_TYPE_OBJECT:
				return validateSAFTPTPaymentTypeObject((SAFTPTPaymentType)value, diagnostics, context);
			case _301Package.SAFTPT_SOURCE_BILLING_OBJECT:
				return validateSAFTPTSourceBillingObject((SAFTPTSourceBilling)value, diagnostics, context);
			case _301Package.SAFTPT_SOURCE_PAYMENT_OBJECT:
				return validateSAFTPTSourcePaymentObject((SAFTPTSourcePayment)value, diagnostics, context);
			case _301Package.SELF_BILLING_INDICATOR_TYPE:
				return validateSelfBillingIndicatorType((BigInteger)value, diagnostics, context);
			case _301Package.SUPPLIER_COUNTRY:
				return validateSupplierCountry((String)value, diagnostics, context);
			case _301Package.TAX_ACCOUNTING_BASIS_TYPE_OBJECT:
				return validateTaxAccountingBasisTypeObject((TaxAccountingBasisType)value, diagnostics, context);
			case _301Package.TAX_CODE_TYPE:
				return validateTaxCodeType((String)value, diagnostics, context);
			case _301Package.TAX_COUNTRY_REGION_TYPE:
				return validateTaxCountryRegionType((String)value, diagnostics, context);
			case _301Package.TAX_TABLE_ENTRY_TAX_CODE:
				return validateTaxTableEntryTaxCode((String)value, diagnostics, context);
			case _301Package.TAX_TYPE_TYPE_OBJECT:
				return validateTaxTypeTypeObject((TaxTypeType)value, diagnostics, context);
			case _301Package.THIRD_PARTIES_BILLING_INDICATOR_TYPE:
				return validateThirdPartiesBillingIndicatorType((BigInteger)value, diagnostics, context);
			case _301Package.TRANSACTION_TYPE_TYPE_OBJECT:
				return validateTransactionTypeTypeObject((TransactionTypeType)value, diagnostics, context);
			case _301Package.WITHHOLDING_TAX_TYPE_TYPE_OBJECT:
				return validateWithholdingTaxTypeTypeObject((WithholdingTaxTypeType)value, diagnostics, context);
			case _301Package.WORK_STATUS_TYPE_OBJECT:
				return validateWorkStatusTypeObject((WorkStatusType)value, diagnostics, context);
			case _301Package.WORK_TYPE_TYPE_OBJECT:
				return validateWorkTypeTypeObject((WorkTypeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressStructure(AddressStructure addressStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressStructurePT(AddressStructurePT addressStructurePT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressStructurePT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditFileType(AuditFileType auditFileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditFileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrency(Currency currency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerType(CustomerType customerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentStatusType(DocumentStatusType documentStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentStatusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentStatusType1(DocumentStatusType1 documentStatusType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentStatusType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentStatusType2(DocumentStatusType2 documentStatusType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentStatusType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentStatusType3(DocumentStatusType3 documentStatusType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentStatusType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentTotalsType(DocumentTotalsType documentTotalsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentTotalsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentTotalsType1(DocumentTotalsType1 documentTotalsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentTotalsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentTotalsType2(DocumentTotalsType2 documentTotalsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentTotalsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentTotalsType3(DocumentTotalsType3 documentTotalsType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentTotalsType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralLedgerEntriesType(GeneralLedgerEntriesType generalLedgerEntriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalLedgerEntriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralLedgerType(GeneralLedgerType generalLedgerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalLedgerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeaderType(HeaderType headerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceType(InvoiceType invoiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invoiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJournalType(JournalType journalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(journalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineType(LineType lineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineType1(LineType1 lineType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineType2(LineType2 lineType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineType3(LineType3 lineType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineType4(LineType4 lineType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterFilesType(MasterFilesType masterFilesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(masterFilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovementOfGoodsType(MovementOfGoodsType movementOfGoodsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(movementOfGoodsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovementTax(MovementTax movementTax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(movementTax, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderReferences(OrderReferences orderReferences, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderReferences, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentMethod(PaymentMethod paymentMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentsType(PaymentsType paymentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentTax(PaymentTax paymentTax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentTax, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentType(PaymentType paymentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paymentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductType(ProductType productType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferences(References references, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(references, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalesInvoicesType(SalesInvoicesType salesInvoicesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(salesInvoicesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettlement(Settlement settlement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(settlement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettlementType(SettlementType settlementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(settlementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShippingPointStructure(ShippingPointStructure shippingPointStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shippingPointStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentIDType(SourceDocumentIDType sourceDocumentIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceDocumentIDType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDocumentsType(SourceDocumentsType sourceDocumentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceDocumentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialRegimes(SpecialRegimes specialRegimes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialRegimes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStockMovementType(StockMovementType stockMovementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stockMovementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplierAddressStructure(SupplierAddressStructure supplierAddressStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplierAddressStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplierType(SupplierType supplierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supplierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTax(Tax tax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tax, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxTableEntryType(TaxTableEntryType taxTableEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taxTableEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxTableType(TaxTableType taxTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taxTableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionType(TransactionType transactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWithholdingTax(WithholdingTax withholdingTax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(withholdingTax, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDocumentType(WorkDocumentType workDocumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workDocumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkingDocumentsType(WorkingDocumentsType workingDocumentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workingDocumentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupingCategoryType(GroupingCategoryType groupingCategoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceStatusType(InvoiceStatusType invoiceStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceTypeType(InvoiceTypeType invoiceTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovementStatusType(MovementStatusType movementStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovementTypeType(MovementTypeType movementTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentMechanismType(PaymentMechanismType paymentMechanismType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentStatusType(PaymentStatusType paymentStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductTypeType(ProductTypeType productTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTMovementTaxType(SAFTPTMovementTaxType saftptMovementTaxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTPaymentType(SAFTPTPaymentType saftptPaymentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTSourceBilling(SAFTPTSourceBilling saftptSourceBilling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTSourcePayment(SAFTPTSourcePayment saftptSourcePayment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxAccountingBasisType(TaxAccountingBasisType taxAccountingBasisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxTypeType(TaxTypeType taxTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionTypeType(TransactionTypeType transactionTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWithholdingTaxTypeType(WithholdingTaxTypeType withholdingTaxTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkStatusType(WorkStatusType workStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkTypeType(WorkTypeType workTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountIDType(String accountIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAccountIDType_Pattern(accountIDType, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountIDType_MinLength(accountIDType, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccountIDType_MaxLength(accountIDType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAccountIDType_Pattern
	 */
	public static final  PatternMatcher [][] ACCOUNT_ID_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(([0-9a-zA-Z\\-/._+*]*)|Desconhecido)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Account ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountIDType_Pattern(String accountIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getAccountIDType(), accountIDType, ACCOUNT_ID_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Account ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountIDType_MinLength(String accountIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = accountIDType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getAccountIDType(), accountIDType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Account ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountIDType_MaxLength(String accountIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = accountIDType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getAccountIDType(), accountIDType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditFileVersionType(String auditFileVersionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAuditFileVersionType_Pattern(auditFileVersionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAuditFileVersionType_Pattern
	 */
	public static final  PatternMatcher [][] AUDIT_FILE_VERSION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("1.03_01")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Audit File Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditFileVersionType_Pattern(String auditFileVersionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getAuditFileVersionType(), auditFileVersionType, AUDIT_FILE_VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCashVATSchemeIndicatorType(BigInteger cashVATSchemeIndicatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCashVATSchemeIndicatorType_Min(cashVATSchemeIndicatorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCashVATSchemeIndicatorType_Max(cashVATSchemeIndicatorType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCashVATSchemeIndicatorType_Min
	 */
	public static final BigInteger CASH_VAT_SCHEME_INDICATOR_TYPE__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Cash VAT Scheme Indicator Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCashVATSchemeIndicatorType_Min(BigInteger cashVATSchemeIndicatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = cashVATSchemeIndicatorType.compareTo(CASH_VAT_SCHEME_INDICATOR_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_301Package.eINSTANCE.getCashVATSchemeIndicatorType(), cashVATSchemeIndicatorType, CASH_VAT_SCHEME_INDICATOR_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCashVATSchemeIndicatorType_Max
	 */
	public static final BigInteger CASH_VAT_SCHEME_INDICATOR_TYPE__MAX__VALUE = new BigInteger("1");

	/**
	 * Validates the Max constraint of '<em>Cash VAT Scheme Indicator Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCashVATSchemeIndicatorType_Max(BigInteger cashVATSchemeIndicatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = cashVATSchemeIndicatorType.compareTo(CASH_VAT_SCHEME_INDICATOR_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_301Package.eINSTANCE.getCashVATSchemeIndicatorType(), cashVATSchemeIndicatorType, CASH_VAT_SCHEME_INDICATOR_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyIDType(String companyIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCompanyIDType_Pattern(companyIDType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompanyIDType_MinLength(companyIDType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompanyIDType_MaxLength(companyIDType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCompanyIDType_Pattern
	 */
	public static final  PatternMatcher [][] COMPANY_ID_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{9})+|([a-zA-Z0-9\\-/_\u00e3\u00c3\u00f5\u00d5\u00e9\u00c9\u00ea\u00ca\u00e0\u00c0\u00e1\u00c1\u00f3\u00d3\u00e7\u00c7\u00ed\u00cd\u00fa\u00da\u00ba\u00aa& ]+ [0-9/]+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Company ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyIDType_Pattern(String companyIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getCompanyIDType(), companyIDType, COMPANY_ID_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Company ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyIDType_MinLength(String companyIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = companyIDType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getCompanyIDType(), companyIDType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Company ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyIDType_MaxLength(String companyIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = companyIDType.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getCompanyIDType(), companyIDType, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountryType(String countryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCountryType_Pattern(countryType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountryType_MinLength(countryType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCountryType_Pattern
	 */
	public static final  PatternMatcher [][] COUNTRY_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("AD|AE|AF|AG|AI|AL|AM|AO|AQ|AR|AS|AT|AU|AW|AX|AZ|BA|BB|BD|BE|BF|BG|BH|BI|BJ|BL|BM|BN|BO|BQ|BR|BS|BT|BV|BW|BY|BZ|CA|CC|CD|CF|CG|CH|CI|CK|CL|CM|CN|CO|CR|CU|CV|CW|CX|CY|CZ|DE|DJ|DK|DM|DO|DZ|EC|EE|EG|EH|ER|ES|ET|FI|FJ|FK|FM|FO|FR|GA|GB|GD|GE|GF|GG|GH|GI|GL|GM|GN|GP|GQ|GR|GS|GT|GU|GW|GY|HK|HM|HN|HR|HT|HU|ID|IE|IL|IM|IN|IO|IQ|IR|IS|IT|JE|JM|JO|JP|KE|KG|KH|KI|KM|KN|KP|KR|KW|KY|KZ|LA|LB|LC|LI|LK|LR|LS|LT|LU|LV|LY|MA|MC|MD|ME|MF|MG|MH|MK|ML|MM|MN|MO|MP|MQ|MR|MS|MT|MU|MV|MW|MX|MY|MZ|NA|NC|NE|NF|NG|NI|NL|NO|NP|NR|NU|NZ|OM|PA|PE|PF|PG|PH|PK|PL|PM|PN|PR|PS|PT|PW|PY|QA|RE|RO|RS|RU|RW|SA|SB|SC|SD|SE|SG|SH|SI|SJ|SK|SL|SM|SN|SO|SR|SS|ST|SV|SX|SY|SZ|TC|TD|TF|TG|TH|TJ|TK|TL|TM|TN|TO|TR|TT|TV|TW|TZ|UA|UG|UM|US|UY|UZ|VA|VC|VE|VG|VI|VN|VU|WF|WS|XK|YE|YT|ZA|ZM|ZW|Desconhecido|")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Country Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountryType_Pattern(String countryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getCountryType(), countryType, COUNTRY_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Country Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountryType_MinLength(String countryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = countryType.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getCountryType(), countryType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyCodeType(String currencyCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCurrencyCodeType_Pattern(currencyCodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurrencyCodeType_MinLength(currencyCodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurrencyCodeType_MaxLength(currencyCodeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCurrencyCodeType_Pattern
	 */
	public static final  PatternMatcher [][] CURRENCY_CODE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("AED|AFN|ALL|AMD|ANG|AOA|ARS|AUD|AWG|AZN|BAM|BBD|BDT|BGN|BHD|BIF|BMD|BND|BOB|BOV|BRL|BSD|BTN|BWP|BYR|BZD|CAD|CDF|CHE|CHF|CHW|CLF|CLP|CNY|COP|COU|CRC|CUC|CUP|CVE|CZK|DJF|DKK|DOP|DZD|EGP|ERN|ETB|FJD|FKP|GBP|GEL|GHS|GIP|GMD|GNF|GTQ|GYD|HKD|HNL|HRK|HTG|HUF|IDR|ILS|INR|IQD|IRR|ISK|JMD|JOD|JPY|KES|KGS|KHR|KMF|KPW|KRW|KWD|KYD|KZT|LAK|LBP|LKR|LRD|LSL|LTL|LVL|LYD|MAD|MDL|MGA|MKD|MMK|MNT|MOP|MRO|MUR|MVR|MWK|MXN|MXV|MYR|MZN|NAD|NGN|NIO|NOK|NPR|NZD|OMR|PAB|PEN|PGK|PHP|PKR|PLN|PYG|QAR|RON|RSD|RUB|RWF|SAR|SBD|SCR|SDG|SEK|SGD|SHP|SLL|SOS|SRD|SSP|STD|SVC|SYP|SZL|THB|TJS|TMT|TND|TOP|TRY|TTD|TWD|TZS|UAH|UGX|USD|USN|USS|UYI|UYU|UZS|VEF|VND|VUV|WST|XAF|XAG|XAU|XBA|XBB|XBC|XBD|XCD|XDR|XFU|XOF|XPD|XPF|XPT|XSU|XUA|YER|ZAR|ZMW|ZWL|EEK|SKK|TMM|ZMK|ZWD|ZWR|")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Currency Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyCodeType_Pattern(String currencyCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getCurrencyCodeType(), currencyCodeType, CURRENCY_CODE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Currency Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyCodeType_MinLength(String currencyCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = currencyCodeType.length();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getCurrencyCodeType(), currencyCodeType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Currency Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyCodeType_MaxLength(String currencyCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = currencyCodeType.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getCurrencyCodeType(), currencyCodeType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentNumberType(String documentNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDocumentNumberType_Pattern(documentNumberType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDocumentNumberType_MinLength(documentNumberType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDocumentNumberType_MaxLength(documentNumberType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDocumentNumberType_Pattern
	 */
	public static final  PatternMatcher [][] DOCUMENT_NUMBER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^ ]+ [^/^ ]+/[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Document Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentNumberType_Pattern(String documentNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getDocumentNumberType(), documentNumberType, DOCUMENT_NUMBER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Document Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentNumberType_MinLength(String documentNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = documentNumberType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getDocumentNumberType(), documentNumberType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Document Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentNumberType_MaxLength(String documentNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = documentNumberType.length();
		boolean result = length <= 60;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getDocumentNumberType(), documentNumberType, length, 60, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEACCodeType(String eacCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEACCodeType_Pattern(eacCodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEACCodeType_MinLength(eacCodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEACCodeType_MaxLength(eacCodeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEACCodeType_Pattern
	 */
	public static final  PatternMatcher [][] EAC_CODE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(([0-9]*))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>EAC Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEACCodeType_Pattern(String eacCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getEACCodeType(), eacCodeType, EAC_CODE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>EAC Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEACCodeType_MinLength(String eacCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = eacCodeType.length();
		boolean result = length >= 5;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getEACCodeType(), eacCodeType, length, 5, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>EAC Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEACCodeType_MaxLength(String eacCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = eacCodeType.length();
		boolean result = length <= 5;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getEACCodeType(), eacCodeType, length, 5, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiscalYearType(BigInteger fiscalYearType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFiscalYearType_Min(fiscalYearType, diagnostics, context);
		if (result || diagnostics != null) result &= validateFiscalYearType_Max(fiscalYearType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFiscalYearType_Min
	 */
	public static final BigInteger FISCAL_YEAR_TYPE__MIN__VALUE = new BigInteger("2000");

	/**
	 * Validates the Min constraint of '<em>Fiscal Year Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiscalYearType_Min(BigInteger fiscalYearType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = fiscalYearType.compareTo(FISCAL_YEAR_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_301Package.eINSTANCE.getFiscalYearType(), fiscalYearType, FISCAL_YEAR_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFiscalYearType_Max
	 */
	public static final BigInteger FISCAL_YEAR_TYPE__MAX__VALUE = new BigInteger("9999");

	/**
	 * Validates the Max constraint of '<em>Fiscal Year Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFiscalYearType_Max(BigInteger fiscalYearType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = fiscalYearType.compareTo(FISCAL_YEAR_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_301Package.eINSTANCE.getFiscalYearType(), fiscalYearType, FISCAL_YEAR_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupingCategoryTypeObject(GroupingCategoryType groupingCategoryTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceNoType(String invoiceNoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInvoiceNoType_Pattern(invoiceNoType, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvoiceNoType_MinLength(invoiceNoType, diagnostics, context);
		if (result || diagnostics != null) result &= validateInvoiceNoType_MaxLength(invoiceNoType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateInvoiceNoType_Pattern
	 */
	public static final  PatternMatcher [][] INVOICE_NO_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^ ]+ [^/^ ]+/[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Invoice No Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceNoType_Pattern(String invoiceNoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getInvoiceNoType(), invoiceNoType, INVOICE_NO_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Invoice No Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceNoType_MinLength(String invoiceNoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = invoiceNoType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getInvoiceNoType(), invoiceNoType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Invoice No Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceNoType_MaxLength(String invoiceNoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = invoiceNoType.length();
		boolean result = length <= 60;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getInvoiceNoType(), invoiceNoType, length, 60, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceStatusTypeObject(InvoiceStatusType invoiceStatusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceTypeTypeObject(InvoiceTypeType invoiceTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovementStatusTypeObject(MovementStatusType movementStatusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovementTypeTypeObject(MovementTypeType movementTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentMechanismTypeObject(PaymentMechanismType paymentMechanismTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentRefNoType(String paymentRefNoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePaymentRefNoType_Pattern(paymentRefNoType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePaymentRefNoType_MinLength(paymentRefNoType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePaymentRefNoType_MaxLength(paymentRefNoType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePaymentRefNoType_Pattern
	 */
	public static final  PatternMatcher [][] PAYMENT_REF_NO_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^ ]+ [^/^ ]+/[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Payment Ref No Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentRefNoType_Pattern(String paymentRefNoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getPaymentRefNoType(), paymentRefNoType, PAYMENT_REF_NO_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Payment Ref No Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentRefNoType_MinLength(String paymentRefNoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = paymentRefNoType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getPaymentRefNoType(), paymentRefNoType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Payment Ref No Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentRefNoType_MaxLength(String paymentRefNoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = paymentRefNoType.length();
		boolean result = length <= 60;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getPaymentRefNoType(), paymentRefNoType, length, 60, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentStatusTypeObject(PaymentStatusType paymentStatusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentTaxCode(String paymentTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePaymentTaxCode_Pattern(paymentTaxCode, diagnostics, context);
		if (result || diagnostics != null) result &= validatePaymentTaxCode_MinLength(paymentTaxCode, diagnostics, context);
		if (result || diagnostics != null) result &= validatePaymentTaxCode_MaxLength(paymentTaxCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePaymentTaxCode_Pattern
	 */
	public static final  PatternMatcher [][] PAYMENT_TAX_CODE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("RED|INT|NOR|ISE|OUT|([0-9.])*|NA")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Payment Tax Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentTaxCode_Pattern(String paymentTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getPaymentTaxCode(), paymentTaxCode, PAYMENT_TAX_CODE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Payment Tax Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentTaxCode_MinLength(String paymentTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = paymentTaxCode.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getPaymentTaxCode(), paymentTaxCode, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Payment Tax Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentTaxCode_MaxLength(String paymentTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = paymentTaxCode.length();
		boolean result = length <= 10;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getPaymentTaxCode(), paymentTaxCode, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodType(BigInteger periodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePeriodType_Min(periodType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePeriodType_Max(periodType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePeriodType_Min
	 */
	public static final BigInteger PERIOD_TYPE__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodType_Min(BigInteger periodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = periodType.compareTo(PERIOD_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_301Package.eINSTANCE.getPeriodType(), periodType, PERIOD_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePeriodType_Max
	 */
	public static final BigInteger PERIOD_TYPE__MAX__VALUE = new BigInteger("12");

	/**
	 * Validates the Max constraint of '<em>Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriodType_Max(BigInteger periodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = periodType.compareTo(PERIOD_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_301Package.eINSTANCE.getPeriodType(), periodType, PERIOD_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalCodePT(String postalCodePT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePostalCodePT_Pattern(postalCodePT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePostalCodePT_Pattern
	 */
	public static final  PatternMatcher [][] POSTAL_CODE_PT__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]{4}-[0-9]{3})")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Postal Code PT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalCodePT_Pattern(String postalCodePT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getPostalCodePT(), postalCodePT, POSTAL_CODE_PT__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductTypeTypeObject(ProductTypeType productTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFdateTimeType(XMLGregorianCalendar saFdateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFdateType(XMLGregorianCalendar saFdateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFdecimalType(BigDecimal saFdecimalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFdecimalType_Min(saFdecimalType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFdecimalType_Min
	 */
	public static final BigDecimal SA_FDECIMAL_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>SA Fdecimal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFdecimalType_Min(BigDecimal saFdecimalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = saFdecimalType.compareTo(SA_FDECIMAL_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_301Package.eINSTANCE.getSAFdecimalType(), saFdecimalType, SA_FDECIMAL_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFmonetaryType(BigDecimal saFmonetaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFmonetaryType_Min(saFmonetaryType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFmonetaryType_Min
	 */
	public static final BigDecimal SA_FMONETARY_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>SA Fmonetary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFmonetaryType_Min(BigDecimal saFmonetaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = saFmonetaryType.compareTo(SA_FMONETARY_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_301Package.eINSTANCE.getSAFmonetaryType(), saFmonetaryType, SA_FMONETARY_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTAccountingPeriod(BigInteger safptAccountingPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTAccountingPeriod_Min(safptAccountingPeriod, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTAccountingPeriod_Max(safptAccountingPeriod, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTAccountingPeriod_Min
	 */
	public static final BigInteger SAFPT_ACCOUNTING_PERIOD__MIN__VALUE = new BigInteger("1");

	/**
	 * Validates the Min constraint of '<em>SAFPT Accounting Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTAccountingPeriod_Min(BigInteger safptAccountingPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = safptAccountingPeriod.compareTo(SAFPT_ACCOUNTING_PERIOD__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_301Package.eINSTANCE.getSAFPTAccountingPeriod(), safptAccountingPeriod, SAFPT_ACCOUNTING_PERIOD__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTAccountingPeriod_Max
	 */
	public static final BigInteger SAFPT_ACCOUNTING_PERIOD__MAX__VALUE = new BigInteger("16");

	/**
	 * Validates the Max constraint of '<em>SAFPT Accounting Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTAccountingPeriod_Max(BigInteger safptAccountingPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = safptAccountingPeriod.compareTo(SAFPT_ACCOUNTING_PERIOD__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_301Package.eINSTANCE.getSAFPTAccountingPeriod(), safptAccountingPeriod, SAFPT_ACCOUNTING_PERIOD__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTDateSpan(XMLGregorianCalendar safptDateSpan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTDateSpan_Min(safptDateSpan, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTDateSpan_Max(safptDateSpan, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTDateSpan_Min
	 */
	public static final XMLGregorianCalendar SAFPT_DATE_SPAN__MIN__VALUE = (XMLGregorianCalendar)_301Factory.eINSTANCE.createFromString(_301Package.eINSTANCE.getSAFPTDateSpan(), "2000-01-01");

	/**
	 * Validates the Min constraint of '<em>SAFPT Date Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTDateSpan_Min(XMLGregorianCalendar safptDateSpan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int comparison = XMLTypeUtil.compareCalendar(safptDateSpan, SAFPT_DATE_SPAN__MIN__VALUE);
		boolean result = comparison == 0 || comparison == 1;
		if (!result && diagnostics != null)
			reportMinViolation(_301Package.eINSTANCE.getSAFPTDateSpan(), safptDateSpan, SAFPT_DATE_SPAN__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTDateSpan_Max
	 */
	public static final XMLGregorianCalendar SAFPT_DATE_SPAN__MAX__VALUE = (XMLGregorianCalendar)_301Factory.eINSTANCE.createFromString(_301Package.eINSTANCE.getSAFPTDateSpan(), "9999-12-31");

	/**
	 * Validates the Max constraint of '<em>SAFPT Date Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTDateSpan_Max(XMLGregorianCalendar safptDateSpan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int comparison = XMLTypeUtil.compareCalendar(safptDateSpan, SAFPT_DATE_SPAN__MAX__VALUE);
		boolean result = comparison == 0 || comparison == -1;
		if (!result && diagnostics != null)
			reportMaxViolation(_301Package.eINSTANCE.getSAFPTDateSpan(), safptDateSpan, SAFPT_DATE_SPAN__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTGLAccountID(String safptglAccountID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTGLAccountID_Pattern(safptglAccountID, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTGLAccountID_MinLength(safptglAccountID, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTGLAccountID_MaxLength(safptglAccountID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTGLAccountID_Pattern
	 */
	public static final  PatternMatcher [][] SAFPTGL_ACCOUNT_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(([0-9a-zA-Z\\-/._+*]*))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SAFPTGL Account ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTGLAccountID_Pattern(String safptglAccountID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getSAFPTGLAccountID(), safptglAccountID, SAFPTGL_ACCOUNT_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFPTGL Account ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTGLAccountID_MinLength(String safptglAccountID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safptglAccountID.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTGLAccountID(), safptglAccountID, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFPTGL Account ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTGLAccountID_MaxLength(String safptglAccountID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safptglAccountID.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTGLAccountID(), safptglAccountID, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTJournalID(String safptJournalID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTJournalID_Pattern(safptJournalID, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTJournalID_MinLength(safptJournalID, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTJournalID_MaxLength(safptJournalID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTJournalID_Pattern
	 */
	public static final  PatternMatcher [][] SAFPT_JOURNAL_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^ ]{1,30}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SAFPT Journal ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTJournalID_Pattern(String safptJournalID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getSAFPTJournalID(), safptJournalID, SAFPT_JOURNAL_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFPT Journal ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTJournalID_MinLength(String safptJournalID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safptJournalID.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTJournalID(), safptJournalID, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFPT Journal ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTJournalID_MaxLength(String safptJournalID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safptJournalID.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTJournalID(), safptJournalID, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTPortugueseTaxExemption(String safptPortugueseTaxExemption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTPortugueseTaxExemption_MinLength(safptPortugueseTaxExemption, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTPortugueseTaxExemption_MaxLength(safptPortugueseTaxExemption, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFPT Portuguese Tax Exemption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTPortugueseTaxExemption_MinLength(String safptPortugueseTaxExemption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safptPortugueseTaxExemption.length();
		boolean result = length >= 6;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTPortugueseTaxExemption(), safptPortugueseTaxExemption, length, 6, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFPT Portuguese Tax Exemption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTPortugueseTaxExemption_MaxLength(String safptPortugueseTaxExemption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safptPortugueseTaxExemption.length();
		boolean result = length <= 60;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTPortugueseTaxExemption(), safptPortugueseTaxExemption, length, 60, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTPortugueseVatNumber(BigInteger safptPortugueseVatNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTPortugueseVatNumber_Min(safptPortugueseVatNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTPortugueseVatNumber_Max(safptPortugueseVatNumber, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTPortugueseVatNumber_Min
	 */
	public static final BigInteger SAFPT_PORTUGUESE_VAT_NUMBER__MIN__VALUE = new BigInteger("100000000");

	/**
	 * Validates the Min constraint of '<em>SAFPT Portuguese Vat Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTPortugueseVatNumber_Min(BigInteger safptPortugueseVatNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = safptPortugueseVatNumber.compareTo(SAFPT_PORTUGUESE_VAT_NUMBER__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_301Package.eINSTANCE.getSAFPTPortugueseVatNumber(), safptPortugueseVatNumber, SAFPT_PORTUGUESE_VAT_NUMBER__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTPortugueseVatNumber_Max
	 */
	public static final BigInteger SAFPT_PORTUGUESE_VAT_NUMBER__MAX__VALUE = new BigInteger("999999999");

	/**
	 * Validates the Max constraint of '<em>SAFPT Portuguese Vat Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTPortugueseVatNumber_Max(BigInteger safptPortugueseVatNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = safptPortugueseVatNumber.compareTo(SAFPT_PORTUGUESE_VAT_NUMBER__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_301Package.eINSTANCE.getSAFPTPortugueseVatNumber(), safptPortugueseVatNumber, SAFPT_PORTUGUESE_VAT_NUMBER__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTProductID(String safptProductID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTProductID_Pattern(safptProductID, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTProductID_MinLength(safptProductID, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTProductID_MaxLength(safptProductID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTProductID_Pattern
	 */
	public static final  PatternMatcher [][] SAFPT_PRODUCT_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^/]+/[^/]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SAFPT Product ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTProductID_Pattern(String safptProductID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getSAFPTProductID(), safptProductID, SAFPT_PRODUCT_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFPT Product ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTProductID_MinLength(String safptProductID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safptProductID.length();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTProductID(), safptProductID, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFPT Product ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTProductID_MaxLength(String safptProductID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safptProductID.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTProductID(), safptProductID, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax100Car(String safpTtextTypeMandatoryMax100Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax100Car_MinLength(safpTtextTypeMandatoryMax100Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax100Car_MaxLength(safpTtextTypeMandatoryMax100Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max100 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax100Car_MinLength(String safpTtextTypeMandatoryMax100Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax100Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax100Car(), safpTtextTypeMandatoryMax100Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max100 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax100Car_MaxLength(String safpTtextTypeMandatoryMax100Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax100Car.length();
		boolean result = length <= 100;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax100Car(), safpTtextTypeMandatoryMax100Car, length, 100, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax10Car(String safpTtextTypeMandatoryMax10Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax10Car_MinLength(safpTtextTypeMandatoryMax10Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax10Car_MaxLength(safpTtextTypeMandatoryMax10Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max10 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax10Car_MinLength(String safpTtextTypeMandatoryMax10Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax10Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax10Car(), safpTtextTypeMandatoryMax10Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max10 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax10Car_MaxLength(String safpTtextTypeMandatoryMax10Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax10Car.length();
		boolean result = length <= 10;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax10Car(), safpTtextTypeMandatoryMax10Car, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax172Car(String safpTtextTypeMandatoryMax172Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax172Car_MinLength(safpTtextTypeMandatoryMax172Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax172Car_MaxLength(safpTtextTypeMandatoryMax172Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max172 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax172Car_MinLength(String safpTtextTypeMandatoryMax172Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax172Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax172Car(), safpTtextTypeMandatoryMax172Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max172 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax172Car_MaxLength(String safpTtextTypeMandatoryMax172Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax172Car.length();
		boolean result = length <= 172;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax172Car(), safpTtextTypeMandatoryMax172Car, length, 172, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax200Car(String safpTtextTypeMandatoryMax200Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax200Car_MinLength(safpTtextTypeMandatoryMax200Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax200Car_MaxLength(safpTtextTypeMandatoryMax200Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max200 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax200Car_MinLength(String safpTtextTypeMandatoryMax200Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax200Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax200Car(), safpTtextTypeMandatoryMax200Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max200 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax200Car_MaxLength(String safpTtextTypeMandatoryMax200Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax200Car.length();
		boolean result = length <= 200;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax200Car(), safpTtextTypeMandatoryMax200Car, length, 200, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax20Car(String safpTtextTypeMandatoryMax20Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax20Car_MinLength(safpTtextTypeMandatoryMax20Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax20Car_MaxLength(safpTtextTypeMandatoryMax20Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max20 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax20Car_MinLength(String safpTtextTypeMandatoryMax20Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax20Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax20Car(), safpTtextTypeMandatoryMax20Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max20 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax20Car_MaxLength(String safpTtextTypeMandatoryMax20Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax20Car.length();
		boolean result = length <= 20;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax20Car(), safpTtextTypeMandatoryMax20Car, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax255Car(String safpTtextTypeMandatoryMax255Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax255Car_MinLength(safpTtextTypeMandatoryMax255Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax255Car_MaxLength(safpTtextTypeMandatoryMax255Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max255 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax255Car_MinLength(String safpTtextTypeMandatoryMax255Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax255Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax255Car(), safpTtextTypeMandatoryMax255Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max255 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax255Car_MaxLength(String safpTtextTypeMandatoryMax255Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax255Car.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax255Car(), safpTtextTypeMandatoryMax255Car, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax30Car(String safpTtextTypeMandatoryMax30Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax30Car_MinLength(safpTtextTypeMandatoryMax30Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax30Car_MaxLength(safpTtextTypeMandatoryMax30Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max30 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax30Car_MinLength(String safpTtextTypeMandatoryMax30Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax30Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax30Car(), safpTtextTypeMandatoryMax30Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max30 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax30Car_MaxLength(String safpTtextTypeMandatoryMax30Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax30Car.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax30Car(), safpTtextTypeMandatoryMax30Car, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax35Car(String safpTtextTypeMandatoryMax35Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax35Car_MinLength(safpTtextTypeMandatoryMax35Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax35Car_MaxLength(safpTtextTypeMandatoryMax35Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max35 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax35Car_MinLength(String safpTtextTypeMandatoryMax35Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax35Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax35Car(), safpTtextTypeMandatoryMax35Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max35 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax35Car_MaxLength(String safpTtextTypeMandatoryMax35Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax35Car.length();
		boolean result = length <= 35;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax35Car(), safpTtextTypeMandatoryMax35Car, length, 35, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax3Car(String safpTtextTypeMandatoryMax3Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax3Car_MinLength(safpTtextTypeMandatoryMax3Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax3Car_MaxLength(safpTtextTypeMandatoryMax3Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max3 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax3Car_MinLength(String safpTtextTypeMandatoryMax3Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax3Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax3Car(), safpTtextTypeMandatoryMax3Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max3 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax3Car_MaxLength(String safpTtextTypeMandatoryMax3Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax3Car.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax3Car(), safpTtextTypeMandatoryMax3Car, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax40Car(String safpTtextTypeMandatoryMax40Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax40Car_MinLength(safpTtextTypeMandatoryMax40Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax40Car_MaxLength(safpTtextTypeMandatoryMax40Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max40 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax40Car_MinLength(String safpTtextTypeMandatoryMax40Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax40Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax40Car(), safpTtextTypeMandatoryMax40Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max40 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax40Car_MaxLength(String safpTtextTypeMandatoryMax40Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax40Car.length();
		boolean result = length <= 40;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax40Car(), safpTtextTypeMandatoryMax40Car, length, 40, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax50Car(String safpTtextTypeMandatoryMax50Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax50Car_MinLength(safpTtextTypeMandatoryMax50Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax50Car_MaxLength(safpTtextTypeMandatoryMax50Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max50 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax50Car_MinLength(String safpTtextTypeMandatoryMax50Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax50Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax50Car(), safpTtextTypeMandatoryMax50Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max50 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax50Car_MaxLength(String safpTtextTypeMandatoryMax50Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax50Car.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax50Car(), safpTtextTypeMandatoryMax50Car, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax60Car(String safpTtextTypeMandatoryMax60Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax60Car_MinLength(safpTtextTypeMandatoryMax60Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax60Car_MaxLength(safpTtextTypeMandatoryMax60Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max60 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax60Car_MinLength(String safpTtextTypeMandatoryMax60Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax60Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax60Car(), safpTtextTypeMandatoryMax60Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max60 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax60Car_MaxLength(String safpTtextTypeMandatoryMax60Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax60Car.length();
		boolean result = length <= 60;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax60Car(), safpTtextTypeMandatoryMax60Car, length, 60, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax70Car(String safpTtextTypeMandatoryMax70Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax70Car_MinLength(safpTtextTypeMandatoryMax70Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax70Car_MaxLength(safpTtextTypeMandatoryMax70Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max70 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax70Car_MinLength(String safpTtextTypeMandatoryMax70Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax70Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax70Car(), safpTtextTypeMandatoryMax70Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max70 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax70Car_MaxLength(String safpTtextTypeMandatoryMax70Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax70Car.length();
		boolean result = length <= 70;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax70Car(), safpTtextTypeMandatoryMax70Car, length, 70, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax90Car(String safpTtextTypeMandatoryMax90Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMandatoryMax90Car_MinLength(safpTtextTypeMandatoryMax90Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMandatoryMax90Car_MaxLength(safpTtextTypeMandatoryMax90Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Mandatory Max90 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax90Car_MinLength(String safpTtextTypeMandatoryMax90Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax90Car.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax90Car(), safpTtextTypeMandatoryMax90Car, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Mandatory Max90 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMandatoryMax90Car_MaxLength(String safpTtextTypeMandatoryMax90Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMandatoryMax90Car.length();
		boolean result = length <= 90;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMandatoryMax90Car(), safpTtextTypeMandatoryMax90Car, length, 90, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMax40Car(String safpTtextTypeMax40Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTtextTypeMax40Car_MinLength(safpTtextTypeMax40Car, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTtextTypeMax40Car_MaxLength(safpTtextTypeMax40Car, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFP Ttext Type Max40 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMax40Car_MinLength(String safpTtextTypeMax40Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMax40Car.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMax40Car(), safpTtextTypeMax40Car, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFP Ttext Type Max40 Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTtextTypeMax40Car_MaxLength(String safpTtextTypeMax40Car, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safpTtextTypeMax40Car.length();
		boolean result = length <= 40;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTtextTypeMax40Car(), safpTtextTypeMax40Car, length, 40, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTTransactionID(String safptTransactionID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTTransactionID_Pattern(safptTransactionID, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTTransactionID_MinLength(safptTransactionID, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFPTTransactionID_MaxLength(safptTransactionID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTTransactionID_Pattern
	 */
	public static final  PatternMatcher [][] SAFPT_TRANSACTION_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{3}-[01][0-9]-[0-3][0-9] [^ ]{1,30} [^ ]{1,20}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SAFPT Transaction ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTTransactionID_Pattern(String safptTransactionID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getSAFPTTransactionID(), safptTransactionID, SAFPT_TRANSACTION_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFPT Transaction ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTTransactionID_MinLength(String safptTransactionID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safptTransactionID.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFPTTransactionID(), safptTransactionID, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFPT Transaction ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTTransactionID_MaxLength(String safptTransactionID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safptTransactionID.length();
		boolean result = length <= 70;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFPTTransactionID(), safptTransactionID, length, 70, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTDocArchivalNumber(String saftptDocArchivalNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFTPTDocArchivalNumber_Pattern(saftptDocArchivalNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFTPTDocArchivalNumber_MinLength(saftptDocArchivalNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFTPTDocArchivalNumber_MaxLength(saftptDocArchivalNumber, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFTPTDocArchivalNumber_Pattern
	 */
	public static final  PatternMatcher [][] SAFTPT_DOC_ARCHIVAL_NUMBER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^ ]{1,20}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SAFTPT Doc Archival Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTDocArchivalNumber_Pattern(String saftptDocArchivalNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getSAFTPTDocArchivalNumber(), saftptDocArchivalNumber, SAFTPT_DOC_ARCHIVAL_NUMBER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFTPT Doc Archival Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTDocArchivalNumber_MinLength(String saftptDocArchivalNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = saftptDocArchivalNumber.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFTPTDocArchivalNumber(), saftptDocArchivalNumber, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFTPT Doc Archival Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTDocArchivalNumber_MaxLength(String saftptDocArchivalNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = saftptDocArchivalNumber.length();
		boolean result = length <= 20;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFTPTDocArchivalNumber(), saftptDocArchivalNumber, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTMovementTaxCode(String saftptMovementTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFTPTMovementTaxCode_Pattern(saftptMovementTaxCode, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFTPTMovementTaxCode_MinLength(saftptMovementTaxCode, diagnostics, context);
		if (result || diagnostics != null) result &= validateSAFTPTMovementTaxCode_MaxLength(saftptMovementTaxCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFTPTMovementTaxCode_Pattern
	 */
	public static final  PatternMatcher [][] SAFTPT_MOVEMENT_TAX_CODE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("RED|INT|NOR|ISE|OUT|NS")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SAFTPT Movement Tax Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTMovementTaxCode_Pattern(String saftptMovementTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getSAFTPTMovementTaxCode(), saftptMovementTaxCode, SAFTPT_MOVEMENT_TAX_CODE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>SAFTPT Movement Tax Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTMovementTaxCode_MinLength(String saftptMovementTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = saftptMovementTaxCode.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSAFTPTMovementTaxCode(), saftptMovementTaxCode, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>SAFTPT Movement Tax Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTMovementTaxCode_MaxLength(String saftptMovementTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = saftptMovementTaxCode.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSAFTPTMovementTaxCode(), saftptMovementTaxCode, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTMovementTaxTypeObject(SAFTPTMovementTaxType saftptMovementTaxTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTPaymentTypeObject(SAFTPTPaymentType saftptPaymentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTSourceBillingObject(SAFTPTSourceBilling saftptSourceBillingObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFTPTSourcePaymentObject(SAFTPTSourcePayment saftptSourcePaymentObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfBillingIndicatorType(BigInteger selfBillingIndicatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSelfBillingIndicatorType_Min(selfBillingIndicatorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelfBillingIndicatorType_Max(selfBillingIndicatorType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSelfBillingIndicatorType_Min
	 */
	public static final BigInteger SELF_BILLING_INDICATOR_TYPE__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Self Billing Indicator Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfBillingIndicatorType_Min(BigInteger selfBillingIndicatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = selfBillingIndicatorType.compareTo(SELF_BILLING_INDICATOR_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_301Package.eINSTANCE.getSelfBillingIndicatorType(), selfBillingIndicatorType, SELF_BILLING_INDICATOR_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSelfBillingIndicatorType_Max
	 */
	public static final BigInteger SELF_BILLING_INDICATOR_TYPE__MAX__VALUE = new BigInteger("1");

	/**
	 * Validates the Max constraint of '<em>Self Billing Indicator Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfBillingIndicatorType_Max(BigInteger selfBillingIndicatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = selfBillingIndicatorType.compareTo(SELF_BILLING_INDICATOR_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_301Package.eINSTANCE.getSelfBillingIndicatorType(), selfBillingIndicatorType, SELF_BILLING_INDICATOR_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplierCountry(String supplierCountry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSupplierCountry_Pattern(supplierCountry, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplierCountry_MinLength(supplierCountry, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplierCountry_MaxLength(supplierCountry, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSupplierCountry_Pattern
	 */
	public static final  PatternMatcher [][] SUPPLIER_COUNTRY__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("AD|AE|AF|AG|AI|AL|AM|AO|AQ|AR|AS|AT|AU|AW|AX|AZ|BA|BB|BD|BE|BF|BG|BH|BI|BJ|BL|BM|BN|BO|BQ|BR|BS|BT|BV|BW|BY|BZ|CA|CC|CD|CF|CG|CH|CI|CK|CL|CM|CN|CO|CR|CU|CV|CW|CX|CY|CZ|DE|DJ|DK|DM|DO|DZ|EC|EE|EG|EH|ER|ES|ET|FI|FJ|FK|FM|FO|FR|GA|GB|GD|GE|GF|GG|GH|GI|GL|GM|GN|GP|GQ|GR|GS|GT|GU|GW|GY|HK|HM|HN|HR|HT|HU|ID|IE|IL|IM|IN|IO|IQ|IR|IS|IT|JE|JM|JO|JP|KE|KG|KH|KI|KM|KN|KP|KR|KW|KY|KZ|LA|LB|LC|LI|LK|LR|LS|LT|LU|LV|LY|MA|MC|MD|ME|MF|MG|MH|MK|ML|MM|MN|MO|MP|MQ|MR|MS|MT|MU|MV|MW|MX|MY|MZ|NA|NC|NE|NF|NG|NI|NL|NO|NP|NR|NU|NZ|OM|PA|PE|PF|PG|PH|PK|PL|PM|PN|PR|PS|PT|PW|PY|QA|RE|RO|RS|RU|RW|SA|SB|SC|SD|SE|SG|SH|SI|SJ|SK|SL|SM|SN|SO|SR|SS|ST|SV|SX|SY|SZ|TC|TD|TF|TG|TH|TJ|TK|TL|TM|TN|TO|TR|TT|TV|TW|TZ|UA|UG|UM|US|UY|UZ|VA|VC|VE|VG|VI|VN|VU|WF|WS|XK|YE|YT|ZA|ZM|ZW|")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Supplier Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplierCountry_Pattern(String supplierCountry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getSupplierCountry(), supplierCountry, SUPPLIER_COUNTRY__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Supplier Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplierCountry_MinLength(String supplierCountry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = supplierCountry.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getSupplierCountry(), supplierCountry, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Supplier Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplierCountry_MaxLength(String supplierCountry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = supplierCountry.length();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getSupplierCountry(), supplierCountry, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxAccountingBasisTypeObject(TaxAccountingBasisType taxAccountingBasisTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxCodeType(String taxCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTaxCodeType_Pattern(taxCodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaxCodeType_MinLength(taxCodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaxCodeType_MaxLength(taxCodeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTaxCodeType_Pattern
	 */
	public static final  PatternMatcher [][] TAX_CODE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("RED|INT|NOR|ISE|OUT|([0-9.])*|NS")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Tax Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxCodeType_Pattern(String taxCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getTaxCodeType(), taxCodeType, TAX_CODE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Tax Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxCodeType_MinLength(String taxCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = taxCodeType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getTaxCodeType(), taxCodeType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Tax Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxCodeType_MaxLength(String taxCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = taxCodeType.length();
		boolean result = length <= 10;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getTaxCodeType(), taxCodeType, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxCountryRegionType(String taxCountryRegionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTaxCountryRegionType_Pattern(taxCountryRegionType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaxCountryRegionType_MinLength(taxCountryRegionType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaxCountryRegionType_MaxLength(taxCountryRegionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTaxCountryRegionType_Pattern
	 */
	public static final  PatternMatcher [][] TAX_COUNTRY_REGION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("AD|AE|AF|AG|AI|AL|AM|AO|AQ|AR|AS|AT|AU|AW|AX|AZ|BA|BB|BD|BE|BF|BG|BH|BI|BJ|BL|BM|BN|BO|BQ|BR|BS|BT|BV|BW|BY|BZ|CA|CC|CD|CF|CG|CH|CI|CK|CL|CM|CN|CO|CR|CU|CV|CW|CX|CY|CZ|DE|DJ|DK|DM|DO|DZ|EC|EE|EG|EH|ER|ES|ET|FI|FJ|FK|FM|FO|FR|GA|GB|GD|GE|GF|GG|GH|GI|GL|GM|GN|GP|GQ|GR|GS|GT|GU|GW|GY|HK|HM|HN|HR|HT|HU|ID|IE|IL|IM|IN|IO|IQ|IR|IS|IT|JE|JM|JO|JP|KE|KG|KH|KI|KM|KN|KP|KR|KW|KY|KZ|LA|LB|LC|LI|LK|LR|LS|LT|LU|LV|LY|MA|MC|MD|ME|MF|MG|MH|MK|ML|MM|MN|MO|MP|MQ|MR|MS|MT|MU|MV|MW|MX|MY|MZ|NA|NC|NE|NF|NG|NI|NL|NO|NP|NR|NU|NZ|OM|PA|PE|PF|PG|PH|PK|PL|PM|PN|PR|PS|PT|PW|PY|QA|RE|RO|RS|RU|RW|SA|SB|SC|SD|SE|SG|SH|SI|SJ|SK|SL|SM|SN|SO|SR|SS|ST|SV|SX|SY|SZ|TC|TD|TF|TG|TH|TJ|TK|TL|TM|TN|TO|TR|TT|TV|TW|TZ|UA|UG|UM|US|UY|UZ|VA|VC|VE|VG|VI|VN|VU|WF|WS|XK|YE|YT|ZA|ZM|ZW|PT-AC|PT-MA")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Tax Country Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxCountryRegionType_Pattern(String taxCountryRegionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getTaxCountryRegionType(), taxCountryRegionType, TAX_COUNTRY_REGION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Tax Country Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxCountryRegionType_MinLength(String taxCountryRegionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = taxCountryRegionType.length();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getTaxCountryRegionType(), taxCountryRegionType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Tax Country Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxCountryRegionType_MaxLength(String taxCountryRegionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = taxCountryRegionType.length();
		boolean result = length <= 5;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getTaxCountryRegionType(), taxCountryRegionType, length, 5, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxTableEntryTaxCode(String taxTableEntryTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTaxTableEntryTaxCode_Pattern(taxTableEntryTaxCode, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaxTableEntryTaxCode_MinLength(taxTableEntryTaxCode, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaxTableEntryTaxCode_MaxLength(taxTableEntryTaxCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTaxTableEntryTaxCode_Pattern
	 */
	public static final  PatternMatcher [][] TAX_TABLE_ENTRY_TAX_CODE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("RED|INT|NOR|ISE|OUT|([0-9.])*|NS|NA")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Tax Table Entry Tax Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxTableEntryTaxCode_Pattern(String taxTableEntryTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_301Package.eINSTANCE.getTaxTableEntryTaxCode(), taxTableEntryTaxCode, TAX_TABLE_ENTRY_TAX_CODE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Tax Table Entry Tax Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxTableEntryTaxCode_MinLength(String taxTableEntryTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = taxTableEntryTaxCode.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_301Package.eINSTANCE.getTaxTableEntryTaxCode(), taxTableEntryTaxCode, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Tax Table Entry Tax Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxTableEntryTaxCode_MaxLength(String taxTableEntryTaxCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = taxTableEntryTaxCode.length();
		boolean result = length <= 10;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(_301Package.eINSTANCE.getTaxTableEntryTaxCode(), taxTableEntryTaxCode, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxTypeTypeObject(TaxTypeType taxTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThirdPartiesBillingIndicatorType(BigInteger thirdPartiesBillingIndicatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateThirdPartiesBillingIndicatorType_Min(thirdPartiesBillingIndicatorType, diagnostics, context);
		if (result || diagnostics != null) result &= validateThirdPartiesBillingIndicatorType_Max(thirdPartiesBillingIndicatorType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateThirdPartiesBillingIndicatorType_Min
	 */
	public static final BigInteger THIRD_PARTIES_BILLING_INDICATOR_TYPE__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Third Parties Billing Indicator Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThirdPartiesBillingIndicatorType_Min(BigInteger thirdPartiesBillingIndicatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = thirdPartiesBillingIndicatorType.compareTo(THIRD_PARTIES_BILLING_INDICATOR_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(_301Package.eINSTANCE.getThirdPartiesBillingIndicatorType(), thirdPartiesBillingIndicatorType, THIRD_PARTIES_BILLING_INDICATOR_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateThirdPartiesBillingIndicatorType_Max
	 */
	public static final BigInteger THIRD_PARTIES_BILLING_INDICATOR_TYPE__MAX__VALUE = new BigInteger("1");

	/**
	 * Validates the Max constraint of '<em>Third Parties Billing Indicator Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThirdPartiesBillingIndicatorType_Max(BigInteger thirdPartiesBillingIndicatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = thirdPartiesBillingIndicatorType.compareTo(THIRD_PARTIES_BILLING_INDICATOR_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(_301Package.eINSTANCE.getThirdPartiesBillingIndicatorType(), thirdPartiesBillingIndicatorType, THIRD_PARTIES_BILLING_INDICATOR_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionTypeTypeObject(TransactionTypeType transactionTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWithholdingTaxTypeTypeObject(WithholdingTaxTypeType withholdingTaxTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkStatusTypeObject(WorkStatusType workStatusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkTypeTypeObject(WorkTypeType workTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //_301Validator
