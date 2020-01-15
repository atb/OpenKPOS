/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.pt1_01.*;

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
 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package
 * @generated
 */
public class Pt1_01Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Pt1_01Validator INSTANCE = new Pt1_01Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "oecd.standard.audit.file.tax.pt1_01";

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
	public Pt1_01Validator() {
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
	  return Pt1_01Package.eINSTANCE;
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
			case Pt1_01Package.ADDRESS_STRUCTURE:
				return validateAddressStructure((AddressStructure)value, diagnostics, context);
			case Pt1_01Package.ADDRESS_STRUCTURE_PT:
				return validateAddressStructurePT((AddressStructurePT)value, diagnostics, context);
			case Pt1_01Package.AUDIT_FILE_TYPE:
				return validateAuditFileType((AuditFileType)value, diagnostics, context);
			case Pt1_01Package.CREDIT_NOTE_TYPE:
				return validateCreditNoteType((CreditNoteType)value, diagnostics, context);
			case Pt1_01Package.CURRENCY_TYPE:
				return validateCurrencyType((CurrencyType)value, diagnostics, context);
			case Pt1_01Package.CUSTOMER_TYPE:
				return validateCustomerType((CustomerType)value, diagnostics, context);
			case Pt1_01Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Pt1_01Package.DOCUMENT_TOTALS_TYPE:
				return validateDocumentTotalsType((DocumentTotalsType)value, diagnostics, context);
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE:
				return validateGeneralLedgerEntriesType((GeneralLedgerEntriesType)value, diagnostics, context);
			case Pt1_01Package.GENERAL_LEDGER_TYPE:
				return validateGeneralLedgerType((GeneralLedgerType)value, diagnostics, context);
			case Pt1_01Package.HEADER_TYPE:
				return validateHeaderType((HeaderType)value, diagnostics, context);
			case Pt1_01Package.INVOICE_TYPE:
				return validateInvoiceType((InvoiceType)value, diagnostics, context);
			case Pt1_01Package.JOURNAL_TYPE:
				return validateJournalType((JournalType)value, diagnostics, context);
			case Pt1_01Package.LINE_TYPE:
				return validateLineType((LineType)value, diagnostics, context);
			case Pt1_01Package.LINE_TYPE1:
				return validateLineType1((LineType1)value, diagnostics, context);
			case Pt1_01Package.MASTER_FILES_TYPE:
				return validateMasterFilesType((MasterFilesType)value, diagnostics, context);
			case Pt1_01Package.ORDER_REFERENCES_TYPE:
				return validateOrderReferencesType((OrderReferencesType)value, diagnostics, context);
			case Pt1_01Package.PRODUCT_TYPE:
				return validateProductType((ProductType)value, diagnostics, context);
			case Pt1_01Package.REFERENCES_TYPE:
				return validateReferencesType((ReferencesType)value, diagnostics, context);
			case Pt1_01Package.SALES_INVOICES_TYPE:
				return validateSalesInvoicesType((SalesInvoicesType)value, diagnostics, context);
			case Pt1_01Package.SETTLEMENT_TYPE:
				return validateSettlementType((SettlementType)value, diagnostics, context);
			case Pt1_01Package.SHIPPING_POINT_STRUCTURE:
				return validateShippingPointStructure((ShippingPointStructure)value, diagnostics, context);
			case Pt1_01Package.SOURCE_DOCUMENTS_TYPE:
				return validateSourceDocumentsType((SourceDocumentsType)value, diagnostics, context);
			case Pt1_01Package.SUPPLIER_ADDRESS_STRUCTURE:
				return validateSupplierAddressStructure((SupplierAddressStructure)value, diagnostics, context);
			case Pt1_01Package.SUPPLIER_TYPE:
				return validateSupplierType((SupplierType)value, diagnostics, context);
			case Pt1_01Package.TAX_TABLE_ENTRY_TYPE:
				return validateTaxTableEntryType((TaxTableEntryType)value, diagnostics, context);
			case Pt1_01Package.TAX_TABLE_TYPE:
				return validateTaxTableType((TaxTableType)value, diagnostics, context);
			case Pt1_01Package.TAX_TYPE:
				return validateTaxType((TaxType)value, diagnostics, context);
			case Pt1_01Package.TRANSACTION_TYPE:
				return validateTransactionType((TransactionType)value, diagnostics, context);
			case Pt1_01Package.INVOICE_STATUS_TYPE:
				return validateInvoiceStatusType((InvoiceStatusType)value, diagnostics, context);
			case Pt1_01Package.INVOICE_TYPE_TYPE:
				return validateInvoiceTypeType((InvoiceTypeType)value, diagnostics, context);
			case Pt1_01Package.PAYMENT_MECHANISM_TYPE:
				return validatePaymentMechanismType((PaymentMechanismType)value, diagnostics, context);
			case Pt1_01Package.PRODUCT_TYPE_TYPE:
				return validateProductTypeType((ProductTypeType)value, diagnostics, context);
			case Pt1_01Package.TAX_ACCOUNTING_BASIS_TYPE:
				return validateTaxAccountingBasisType((TaxAccountingBasisType)value, diagnostics, context);
			case Pt1_01Package.TAX_TYPE_TYPE:
				return validateTaxTypeType((TaxTypeType)value, diagnostics, context);
			case Pt1_01Package.TRANSACTION_TYPE_TYPE:
				return validateTransactionTypeType((TransactionTypeType)value, diagnostics, context);
			case Pt1_01Package.ACCOUNT_ID_TYPE:
				return validateAccountIDType((String)value, diagnostics, context);
			case Pt1_01Package.AUDIT_FILE_VERSION_TYPE:
				return validateAuditFileVersionType((String)value, diagnostics, context);
			case Pt1_01Package.COMPANY_ID_TYPE:
				return validateCompanyIDType((String)value, diagnostics, context);
			case Pt1_01Package.COUNTRY_TYPE:
				return validateCountryType((String)value, diagnostics, context);
			case Pt1_01Package.CURRENCY_CODE_TYPE:
				return validateCurrencyCodeType((String)value, diagnostics, context);
			case Pt1_01Package.FISCAL_YEAR_TYPE:
				return validateFiscalYearType((BigInteger)value, diagnostics, context);
			case Pt1_01Package.INVOICE_NO_TYPE:
				return validateInvoiceNoType((String)value, diagnostics, context);
			case Pt1_01Package.INVOICE_STATUS_TYPE_OBJECT:
				return validateInvoiceStatusTypeObject((InvoiceStatusType)value, diagnostics, context);
			case Pt1_01Package.INVOICE_TYPE_TYPE_OBJECT:
				return validateInvoiceTypeTypeObject((InvoiceTypeType)value, diagnostics, context);
			case Pt1_01Package.PAYMENT_MECHANISM_TYPE_OBJECT:
				return validatePaymentMechanismTypeObject((PaymentMechanismType)value, diagnostics, context);
			case Pt1_01Package.PERIOD_TYPE:
				return validatePeriodType((BigInteger)value, diagnostics, context);
			case Pt1_01Package.POSTAL_CODE_PT:
				return validatePostalCodePT((String)value, diagnostics, context);
			case Pt1_01Package.PRODUCT_TYPE_TYPE_OBJECT:
				return validateProductTypeTypeObject((ProductTypeType)value, diagnostics, context);
			case Pt1_01Package.SA_FDATE_TIME_TYPE:
				return validateSAFdateTimeType((XMLGregorianCalendar)value, diagnostics, context);
			case Pt1_01Package.SA_FDATE_TYPE:
				return validateSAFdateType((XMLGregorianCalendar)value, diagnostics, context);
			case Pt1_01Package.SA_FDECIMAL_TYPE:
				return validateSAFdecimalType((BigDecimal)value, diagnostics, context);
			case Pt1_01Package.SA_FMONETARY_TYPE:
				return validateSAFmonetaryType((BigDecimal)value, diagnostics, context);
			case Pt1_01Package.SAFPT_ACCOUNTING_PERIOD:
				return validateSAFPTAccountingPeriod((BigInteger)value, diagnostics, context);
			case Pt1_01Package.SAFPT_CURRENCY_CODE:
				return validateSAFPTCurrencyCode((String)value, diagnostics, context);
			case Pt1_01Package.SAFPT_DATE_SPAN:
				return validateSAFPTDateSpan((XMLGregorianCalendar)value, diagnostics, context);
			case Pt1_01Package.SAFPTGL_ACCOUNT_ID:
				return validateSAFPTGLAccountID((String)value, diagnostics, context);
			case Pt1_01Package.SAFPT_PORTUGUESE_VAT_NUMBER:
				return validateSAFPTPortugueseVatNumber((BigInteger)value, diagnostics, context);
			case Pt1_01Package.SAFPT_PRODUCT_ID:
				return validateSAFPTProductID((String)value, diagnostics, context);
			case Pt1_01Package.SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR:
				return validateSAFPTtextTypeMandatoryMax10Car((String)value, diagnostics, context);
			case Pt1_01Package.SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR:
				return validateSAFPTtextTypeMandatoryMax200Car((String)value, diagnostics, context);
			case Pt1_01Package.SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR:
				return validateSAFPTtextTypeMandatoryMax20Car((String)value, diagnostics, context);
			case Pt1_01Package.SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR:
				return validateSAFPTtextTypeMandatoryMax255Car((String)value, diagnostics, context);
			case Pt1_01Package.SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR:
				return validateSAFPTtextTypeMandatoryMax30Car((String)value, diagnostics, context);
			case Pt1_01Package.SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR:
				return validateSAFPTtextTypeMandatoryMax3Car((String)value, diagnostics, context);
			case Pt1_01Package.SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR:
				return validateSAFPTtextTypeMandatoryMax40Car((String)value, diagnostics, context);
			case Pt1_01Package.SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR:
				return validateSAFPTtextTypeMandatoryMax50Car((String)value, diagnostics, context);
			case Pt1_01Package.SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR:
				return validateSAFPTtextTypeMandatoryMax60Car((String)value, diagnostics, context);
			case Pt1_01Package.SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR:
				return validateSAFPTtextTypeMandatoryMax70Car((String)value, diagnostics, context);
			case Pt1_01Package.SAFP_TTEXT_TYPE_MAX40_CAR:
				return validateSAFPTtextTypeMax40Car((String)value, diagnostics, context);
			case Pt1_01Package.SAFPT_TRANSACTION_ID:
				return validateSAFPTTransactionID((String)value, diagnostics, context);
			case Pt1_01Package.SELF_BILLING_INDICATOR_TYPE:
				return validateSelfBillingIndicatorType((BigInteger)value, diagnostics, context);
			case Pt1_01Package.SUPPLIER_COUNTRY:
				return validateSupplierCountry((String)value, diagnostics, context);
			case Pt1_01Package.TAX_ACCOUNTING_BASIS_TYPE_OBJECT:
				return validateTaxAccountingBasisTypeObject((TaxAccountingBasisType)value, diagnostics, context);
			case Pt1_01Package.TAX_CODE_TYPE:
				return validateTaxCodeType((String)value, diagnostics, context);
			case Pt1_01Package.TAX_COUNTRY_REGION_TYPE:
				return validateTaxCountryRegionType((String)value, diagnostics, context);
			case Pt1_01Package.TAX_TYPE_TYPE_OBJECT:
				return validateTaxTypeTypeObject((TaxTypeType)value, diagnostics, context);
			case Pt1_01Package.TRANSACTION_TYPE_TYPE_OBJECT:
				return validateTransactionTypeTypeObject((TransactionTypeType)value, diagnostics, context);
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
	public boolean validateCreditNoteType(CreditNoteType creditNoteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creditNoteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyType(CurrencyType currencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currencyType, diagnostics, context);
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
	public boolean validateDocumentTotalsType(DocumentTotalsType documentTotalsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentTotalsType, diagnostics, context);
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
	public boolean validateMasterFilesType(MasterFilesType masterFilesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(masterFilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderReferencesType(OrderReferencesType orderReferencesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderReferencesType, diagnostics, context);
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
	public boolean validateReferencesType(ReferencesType referencesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencesType, diagnostics, context);
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
	public boolean validateSourceDocumentsType(SourceDocumentsType sourceDocumentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceDocumentsType, diagnostics, context);
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
	public boolean validateTaxType(TaxType taxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taxType, diagnostics, context);
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
	public boolean validatePaymentMechanismType(PaymentMechanismType paymentMechanismType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
				XMLTypeUtil.createPatternMatcher("(([1-8][0-9a-zA-Z]*)|Desconhecido)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Account ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccountIDType_Pattern(String accountIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.ACCOUNT_ID_TYPE, accountIDType, ACCOUNT_ID_TYPE__PATTERN__VALUES, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.ACCOUNT_ID_TYPE, accountIDType, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.ACCOUNT_ID_TYPE, accountIDType, length, 30, diagnostics, context);
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
				XMLTypeUtil.createPatternMatcher("1.01_01")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Audit File Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditFileVersionType_Pattern(String auditFileVersionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.AUDIT_FILE_VERSION_TYPE, auditFileVersionType, AUDIT_FILE_VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
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
				XMLTypeUtil.createPatternMatcher("([0-9])+|([a-zA-Z0-9\'/\']+ [0-9]+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Company ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyIDType_Pattern(String companyIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.COMPANY_ID_TYPE, companyIDType, COMPANY_ID_TYPE__PATTERN__VALUES, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.COMPANY_ID_TYPE, companyIDType, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.COMPANY_ID_TYPE, companyIDType, length, 50, diagnostics, context);
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
				XMLTypeUtil.createPatternMatcher("AF|AX|AL|DZ|AS|AD|AO|AI|AQ|AG|AR|AM|AW|AU|AT|AZ|BS|BH|BD|BB|BY|BE|BZ|BJ|BM|BT|BO|BA|BW|BV|BR|IO|BN|BG|BF|BI|KH|CM|CA|CV|KY|CF|TD|CL|CN|CX|CC|CO|KM|CG|CD|CK|CR|CI|HR|CU|CY|CZ|DK|DJ|DM|DO|EC|EG|SV|GQ|ER|EE|ET|FK|FO|FJ|FI|FR|GF|PF|TF|GA|GM|GE|DE|GH|GI|GR|GL|GD|GP|GU|GT|GG|GN|GW|GY|HT|HM|VA|HN|HK|HU|IS|IN|ID|IR|IQ|IE|IM|IL|IT|JM|JP|JE|JO|KZ|KE|KI|KP|KR|KW|KG|LA|LV|LB|LS|LR|LY|LI|LT|LU|MO|MK|MG|MW|MY|MV|ML|MT|MH|MQ|MR|MU|YT|MX|FM|MD|MC|MN|ME|MS|MA|MZ|MM|NA|NR|NP|NL|AN|NC|NZ|NI|NE|NG|NU|NF|MP|NO|OM|PK|PW|PS|PA|PG|PY|PE|PH|PN|PL|PT|PR|QA|RE|RO|RU|RW|BL|SH|KN|LC|MF|PM|VC|WS|SM|ST|SA|SN|RS|SC|SL|SG|SK|SI|SB|SO|ZA|GS|ES|LK|SD|SR|SJ|SZ|SE|CH|SY|TW|TJ|TZ|TH|TL|TG|TK|TO|TT|TN|TR|TM|TC|TV|UG|UA|AE|GB|US|UM|UY|UZ|VU|VE|VN|VG|VI|WF|EH|YE|ZM|ZW|Desconhecido|")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Country Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountryType_Pattern(String countryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.COUNTRY_TYPE, countryType, COUNTRY_TYPE__PATTERN__VALUES, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.COUNTRY_TYPE, countryType, length, 2, diagnostics, context);
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
				XMLTypeUtil.createPatternMatcher("ADP|AED|AFA|ALL|AMD|ANG|AON|AOR|ARS|ATS|AUD|AWG|AZM|AZN|BAM|BBD|BDT|BEF|BGL|BGN|BHD|BIF|BMD|BND|BRL|BSD|BTN|BWP|BYR|BZD|CAD|CDF|CHF|CLF|CLP|CNY|COP|CRC|CUP|CVE|CYP|CZK|DEM|DJF|DKK|DOP|DZD|ECS|ECV|EEK|EGP|ERN|ESP|ETB|EUR|FIM|FJD|FKP|FRF|GBP|GEL|GHC|GIP|GMD|GNF|GRD|GTQ|GWP|GYD|HKD|HNL|HRK|HTG|HUF|IDR|IEP|ILS|INR|IQD|IRR|ISK|ITL|JMD|JOD|JPY|KES|KGS|KHR|KMF|KPW|KRW|KWD|KYD|KZT|LAK|LBP|LKR|LRD|LSL|LTL|LUF|LVL|LYD|MAD|MDL|MGF|MKD|MMK|MNT|MOP|MRO|MTL|MUR|MVR|MWK|MXN|MXV|MYR|MZM|MZN|NAD|NGN|NIO|NLG|NOK|NPR|NZD|OMR|PAB|PEN|PGK|PHP|PKR|PLN|PTE|PYG|QAR|ROL|RUB|RUR|RWF|SAR|SBD|SCR|SDD|SEK|SGD|SHP|SIT|SKK|SLL|SOS|SRG|STD|SVC|SYP|SZL|THB|TJR|TJS|TMM|TND|TOP|TPE|TRY|TTD|TWD|TZS|UAH|UGX|USD|USN|USS|UYU|UZS|VEB|VND|VUV|WST|XAF|XAG|XAU|XBA|XBB|XBC|XBD|XCD|XDR|XFO|XFU|XOF|XPD|XPF|XPT|XTS|XXX|YER|YUM|ZAL|ZAR|ZMK|ZRN|ZWD|")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Currency Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyCodeType_Pattern(String currencyCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.CURRENCY_CODE_TYPE, currencyCodeType, CURRENCY_CODE_TYPE__PATTERN__VALUES, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.CURRENCY_CODE_TYPE, currencyCodeType, length, 3, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.CURRENCY_CODE_TYPE, currencyCodeType, length, 3, diagnostics, context);
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
			reportMinViolation(Pt1_01Package.Literals.FISCAL_YEAR_TYPE, fiscalYearType, FISCAL_YEAR_TYPE__MIN__VALUE, true, diagnostics, context);
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
			reportMaxViolation(Pt1_01Package.Literals.FISCAL_YEAR_TYPE, fiscalYearType, FISCAL_YEAR_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
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
				XMLTypeUtil.createPatternMatcher("([a-zA-Z0-9./_-])+ ([a-zA-Z0-9]*/[0-9]+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Invoice No Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvoiceNoType_Pattern(String invoiceNoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.INVOICE_NO_TYPE, invoiceNoType, INVOICE_NO_TYPE__PATTERN__VALUES, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.INVOICE_NO_TYPE, invoiceNoType, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.INVOICE_NO_TYPE, invoiceNoType, length, 60, diagnostics, context);
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
	public boolean validatePaymentMechanismTypeObject(PaymentMechanismType paymentMechanismTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
			reportMinViolation(Pt1_01Package.Literals.PERIOD_TYPE, periodType, PERIOD_TYPE__MIN__VALUE, true, diagnostics, context);
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
			reportMaxViolation(Pt1_01Package.Literals.PERIOD_TYPE, periodType, PERIOD_TYPE__MAX__VALUE, true, diagnostics, context);
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
		return validatePattern(Pt1_01Package.Literals.POSTAL_CODE_PT, postalCodePT, POSTAL_CODE_PT__PATTERN__VALUES, diagnostics, context);
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
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFmonetaryType(BigDecimal saFmonetaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
			reportMinViolation(Pt1_01Package.Literals.SAFPT_ACCOUNTING_PERIOD, safptAccountingPeriod, SAFPT_ACCOUNTING_PERIOD__MIN__VALUE, true, diagnostics, context);
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
			reportMaxViolation(Pt1_01Package.Literals.SAFPT_ACCOUNTING_PERIOD, safptAccountingPeriod, SAFPT_ACCOUNTING_PERIOD__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTCurrencyCode(String safptCurrencyCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSAFPTCurrencyCode_Pattern(safptCurrencyCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTCurrencyCode_Pattern
	 */
	public static final  PatternMatcher [][] SAFPT_CURRENCY_CODE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("EUR")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SAFPT Currency Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTCurrencyCode_Pattern(String safptCurrencyCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.SAFPT_CURRENCY_CODE, safptCurrencyCode, SAFPT_CURRENCY_CODE__PATTERN__VALUES, diagnostics, context);
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
	public static final XMLGregorianCalendar SAFPT_DATE_SPAN__MIN__VALUE = (XMLGregorianCalendar)Pt1_01Factory.eINSTANCE.createFromString(Pt1_01Package.eINSTANCE.getSAFPTDateSpan(), "2000-01-01");

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
			reportMinViolation(Pt1_01Package.Literals.SAFPT_DATE_SPAN, safptDateSpan, SAFPT_DATE_SPAN__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSAFPTDateSpan_Max
	 */
	public static final XMLGregorianCalendar SAFPT_DATE_SPAN__MAX__VALUE = (XMLGregorianCalendar)Pt1_01Factory.eINSTANCE.createFromString(Pt1_01Package.eINSTANCE.getSAFPTDateSpan(), "9999-12-31");

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
			reportMaxViolation(Pt1_01Package.Literals.SAFPT_DATE_SPAN, safptDateSpan, SAFPT_DATE_SPAN__MAX__VALUE, true, diagnostics, context);
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
				XMLTypeUtil.createPatternMatcher("(([1-8][0-9a-zA-Z]*))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SAFPTGL Account ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTGLAccountID_Pattern(String safptglAccountID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.SAFPTGL_ACCOUNT_ID, safptglAccountID, SAFPTGL_ACCOUNT_ID__PATTERN__VALUES, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFPTGL_ACCOUNT_ID, safptglAccountID, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFPTGL_ACCOUNT_ID, safptglAccountID, length, 30, diagnostics, context);
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
			reportMinViolation(Pt1_01Package.Literals.SAFPT_PORTUGUESE_VAT_NUMBER, safptPortugueseVatNumber, SAFPT_PORTUGUESE_VAT_NUMBER__MIN__VALUE, true, diagnostics, context);
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
			reportMaxViolation(Pt1_01Package.Literals.SAFPT_PORTUGUESE_VAT_NUMBER, safptPortugueseVatNumber, SAFPT_PORTUGUESE_VAT_NUMBER__MAX__VALUE, true, diagnostics, context);
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
				XMLTypeUtil.createPatternMatcher("\\w+(\\s\\w+)*/\\w+(\\s\\w+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SAFPT Product ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTProductID_Pattern(String safptProductID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.SAFPT_PRODUCT_ID, safptProductID, SAFPT_PRODUCT_ID__PATTERN__VALUES, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFPT_PRODUCT_ID, safptProductID, length, 3, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFPT_PRODUCT_ID, safptProductID, length, 255, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR, safpTtextTypeMandatoryMax10Car, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR, safpTtextTypeMandatoryMax10Car, length, 10, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR, safpTtextTypeMandatoryMax200Car, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR, safpTtextTypeMandatoryMax200Car, length, 200, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR, safpTtextTypeMandatoryMax20Car, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR, safpTtextTypeMandatoryMax20Car, length, 20, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR, safpTtextTypeMandatoryMax255Car, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR, safpTtextTypeMandatoryMax255Car, length, 255, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR, safpTtextTypeMandatoryMax30Car, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR, safpTtextTypeMandatoryMax30Car, length, 30, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR, safpTtextTypeMandatoryMax3Car, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR, safpTtextTypeMandatoryMax3Car, length, 3, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR, safpTtextTypeMandatoryMax40Car, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR, safpTtextTypeMandatoryMax40Car, length, 40, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR, safpTtextTypeMandatoryMax50Car, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR, safpTtextTypeMandatoryMax50Car, length, 50, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR, safpTtextTypeMandatoryMax60Car, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR, safpTtextTypeMandatoryMax60Car, length, 60, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR, safpTtextTypeMandatoryMax70Car, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR, safpTtextTypeMandatoryMax70Car, length, 70, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MAX40_CAR, safpTtextTypeMax40Car, length, 0, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFP_TTEXT_TYPE_MAX40_CAR, safpTtextTypeMax40Car, length, 40, diagnostics, context);
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
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]{3}-[01][0-9]-[0-3][0-9] \\w{1,30} \\w{1,20}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>SAFPT Transaction ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSAFPTTransactionID_Pattern(String safptTransactionID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.SAFPT_TRANSACTION_ID, safptTransactionID, SAFPT_TRANSACTION_ID__PATTERN__VALUES, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SAFPT_TRANSACTION_ID, safptTransactionID, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SAFPT_TRANSACTION_ID, safptTransactionID, length, 70, diagnostics, context);
		return result;
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
			reportMinViolation(Pt1_01Package.Literals.SELF_BILLING_INDICATOR_TYPE, selfBillingIndicatorType, SELF_BILLING_INDICATOR_TYPE__MIN__VALUE, true, diagnostics, context);
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
			reportMaxViolation(Pt1_01Package.Literals.SELF_BILLING_INDICATOR_TYPE, selfBillingIndicatorType, SELF_BILLING_INDICATOR_TYPE__MAX__VALUE, true, diagnostics, context);
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
				XMLTypeUtil.createPatternMatcher("AF|AX|AL|DZ|AS|AD|AO|AI|AQ|AG|AR|AM|AW|AU|AT|AZ|BS|BH|BD|BB|BY|BE|BZ|BJ|BM|BT|BO|BA|BW|BV|BR|IO|BN|BG|BF|BI|KH|CM|CA|CV|KY|CF|TD|CL|CN|CX|CC|CO|KM|CG|CD|CK|CR|CI|HR|CU|CY|CZ|DK|DJ|DM|DO|EC|EG|SV|GQ|ER|EE|ET|FK|FO|FJ|FI|FR|GF|PF|TF|GA|GM|GE|DE|GH|GI|GR|GL|GD|GP|GU|GT|GG|GN|GW|GY|HT|HM|VA|HN|HK|HU|IS|IN|ID|IR|IQ|IE|IM|IL|IT|JM|JP|JE|JO|KZ|KE|KI|KP|KR|KW|KG|LA|LV|LB|LS|LR|LY|LI|LT|LU|MO|MK|MG|MW|MY|MV|ML|MT|MH|MQ|MR|MU|YT|MX|FM|MD|MC|MN|ME|MS|MA|MZ|MM|NA|NR|NP|NL|AN|NC|NZ|NI|NE|NG|NU|NF|MP|NO|OM|PK|PW|PS|PA|PG|PY|PE|PH|PN|PL|PT|PR|QA|RE|RO|RU|RW|BL|SH|KN|LC|MF|PM|VC|WS|SM|ST|SA|SN|RS|SC|SL|SG|SK|SI|SB|SO|ZA|GS|ES|LK|SD|SR|SJ|SZ|SE|CH|SY|TW|TJ|TZ|TH|TL|TG|TK|TO|TT|TN|TR|TM|TC|TV|UG|UA|AE|GB|US|UM|UY|UZ|VU|VE|VN|VG|VI|WF|EH|YE|ZM|ZW|")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Supplier Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplierCountry_Pattern(String supplierCountry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.SUPPLIER_COUNTRY, supplierCountry, SUPPLIER_COUNTRY__PATTERN__VALUES, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.SUPPLIER_COUNTRY, supplierCountry, length, 2, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.SUPPLIER_COUNTRY, supplierCountry, length, 2, diagnostics, context);
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
				XMLTypeUtil.createPatternMatcher("RED|INT|NOR|ISE|OUT|([0-9.])*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Tax Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxCodeType_Pattern(String taxCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.TAX_CODE_TYPE, taxCodeType, TAX_CODE_TYPE__PATTERN__VALUES, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.TAX_CODE_TYPE, taxCodeType, length, 1, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.TAX_CODE_TYPE, taxCodeType, length, 10, diagnostics, context);
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
				XMLTypeUtil.createPatternMatcher("AF|AX|AL|DZ|AS|AD|AO|AI|AQ|AG|AR|AM|AW|AU|AT|AZ|BS|BH|BD|BB|BY|BE|BZ|BJ|BM|BT|BO|BA|BW|BV|BR|IO|BN|BG|BF|BI|KH|CM|CA|CV|KY|CF|TD|CL|CN|CX|CC|CO|KM|CG|CD|CK|CR|CI|HR|CU|CY|CZ|DK|DJ|DM|DO|EC|EG|SV|GQ|ER|EE|ET|FK|FO|FJ|FI|FR|GF|PF|TF|GA|GM|GE|DE|GH|GI|GR|GL|GD|GP|GU|GT|GG|GN|GW|GY|HT|HM|VA|HN|HK|HU|IS|IN|ID|IR|IQ|IE|IM|IL|IT|JM|JP|JE|JO|KZ|KE|KI|KP|KR|KW|KG|LA|LV|LB|LS|LR|LY|LI|LT|LU|MO|MK|MG|MW|MY|MV|ML|MT|MH|MQ|MR|MU|YT|MX|FM|MD|MC|MN|ME|MS|MA|MZ|MM|NA|NR|NP|NL|AN|NC|NZ|NI|NE|NG|NU|NF|MP|NO|OM|PK|PW|PS|PA|PG|PY|PE|PH|PN|PL|PT|PR|QA|RE|RO|RU|RW|BL|SH|KN|LC|MF|PM|VC|WS|SM|ST|SA|SN|RS|SC|SL|SG|SK|SI|SB|SO|ZA|GS|ES|LK|SD|SR|SJ|SZ|SE|CH|SY|TW|TJ|TZ|TH|TL|TG|TK|TO|TT|TN|TR|TM|TC|TV|UG|UA|AE|GB|US|UM|UY|UZ|VU|VE|VN|VG|VI|WF|EH|YE|ZM|ZW|PT-AC|PT-MA")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Tax Country Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaxCountryRegionType_Pattern(String taxCountryRegionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Pt1_01Package.Literals.TAX_COUNTRY_REGION_TYPE, taxCountryRegionType, TAX_COUNTRY_REGION_TYPE__PATTERN__VALUES, diagnostics, context);
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
			reportMinLengthViolation(Pt1_01Package.Literals.TAX_COUNTRY_REGION_TYPE, taxCountryRegionType, length, 2, diagnostics, context);
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
			reportMaxLengthViolation(Pt1_01Package.Literals.TAX_COUNTRY_REGION_TYPE, taxCountryRegionType, length, 5, diagnostics, context);
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
	public boolean validateTransactionTypeTypeObject(TransactionTypeType transactionTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //Pt1_01Validator
