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

import oecd.standard.audit.file.tax.p.t1._0._301.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _301FactoryImpl extends EFactoryImpl implements _301Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _301Factory init() {
		try {
			_301Factory the_301Factory = (_301Factory)EPackage.Registry.INSTANCE.getEFactory("urn:OECD:StandardAuditFile-Tax:PT_1.03_01"); 
			if (the_301Factory != null) {
				return the_301Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _301FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _301FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _301Package.ADDRESS_STRUCTURE: return createAddressStructure();
			case _301Package.ADDRESS_STRUCTURE_PT: return createAddressStructurePT();
			case _301Package.AUDIT_FILE_TYPE: return createAuditFileType();
			case _301Package.CURRENCY: return createCurrency();
			case _301Package.CUSTOMER_TYPE: return createCustomerType();
			case _301Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _301Package.DOCUMENT_STATUS_TYPE: return createDocumentStatusType();
			case _301Package.DOCUMENT_STATUS_TYPE1: return createDocumentStatusType1();
			case _301Package.DOCUMENT_STATUS_TYPE2: return createDocumentStatusType2();
			case _301Package.DOCUMENT_STATUS_TYPE3: return createDocumentStatusType3();
			case _301Package.DOCUMENT_TOTALS_TYPE: return createDocumentTotalsType();
			case _301Package.DOCUMENT_TOTALS_TYPE1: return createDocumentTotalsType1();
			case _301Package.DOCUMENT_TOTALS_TYPE2: return createDocumentTotalsType2();
			case _301Package.DOCUMENT_TOTALS_TYPE3: return createDocumentTotalsType3();
			case _301Package.GENERAL_LEDGER_ENTRIES_TYPE: return createGeneralLedgerEntriesType();
			case _301Package.GENERAL_LEDGER_TYPE: return createGeneralLedgerType();
			case _301Package.HEADER_TYPE: return createHeaderType();
			case _301Package.INVOICE_TYPE: return createInvoiceType();
			case _301Package.JOURNAL_TYPE: return createJournalType();
			case _301Package.LINE_TYPE: return createLineType();
			case _301Package.LINE_TYPE1: return createLineType1();
			case _301Package.LINE_TYPE2: return createLineType2();
			case _301Package.LINE_TYPE3: return createLineType3();
			case _301Package.LINE_TYPE4: return createLineType4();
			case _301Package.MASTER_FILES_TYPE: return createMasterFilesType();
			case _301Package.MOVEMENT_OF_GOODS_TYPE: return createMovementOfGoodsType();
			case _301Package.MOVEMENT_TAX: return createMovementTax();
			case _301Package.ORDER_REFERENCES: return createOrderReferences();
			case _301Package.PAYMENT_METHOD: return createPaymentMethod();
			case _301Package.PAYMENTS_TYPE: return createPaymentsType();
			case _301Package.PAYMENT_TAX: return createPaymentTax();
			case _301Package.PAYMENT_TYPE: return createPaymentType();
			case _301Package.PRODUCT_TYPE: return createProductType();
			case _301Package.REFERENCES: return createReferences();
			case _301Package.SALES_INVOICES_TYPE: return createSalesInvoicesType();
			case _301Package.SETTLEMENT: return createSettlement();
			case _301Package.SETTLEMENT_TYPE: return createSettlementType();
			case _301Package.SHIPPING_POINT_STRUCTURE: return createShippingPointStructure();
			case _301Package.SOURCE_DOCUMENT_ID_TYPE: return createSourceDocumentIDType();
			case _301Package.SOURCE_DOCUMENTS_TYPE: return createSourceDocumentsType();
			case _301Package.SPECIAL_REGIMES: return createSpecialRegimes();
			case _301Package.STOCK_MOVEMENT_TYPE: return createStockMovementType();
			case _301Package.SUPPLIER_ADDRESS_STRUCTURE: return createSupplierAddressStructure();
			case _301Package.SUPPLIER_TYPE: return createSupplierType();
			case _301Package.TAX: return createTax();
			case _301Package.TAX_TABLE_ENTRY_TYPE: return createTaxTableEntryType();
			case _301Package.TAX_TABLE_TYPE: return createTaxTableType();
			case _301Package.TRANSACTION_TYPE: return createTransactionType();
			case _301Package.WITHHOLDING_TAX: return createWithholdingTax();
			case _301Package.WORK_DOCUMENT_TYPE: return createWorkDocumentType();
			case _301Package.WORKING_DOCUMENTS_TYPE: return createWorkingDocumentsType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case _301Package.GROUPING_CATEGORY_TYPE:
				return createGroupingCategoryTypeFromString(eDataType, initialValue);
			case _301Package.INVOICE_STATUS_TYPE:
				return createInvoiceStatusTypeFromString(eDataType, initialValue);
			case _301Package.INVOICE_TYPE_TYPE:
				return createInvoiceTypeTypeFromString(eDataType, initialValue);
			case _301Package.MOVEMENT_STATUS_TYPE:
				return createMovementStatusTypeFromString(eDataType, initialValue);
			case _301Package.MOVEMENT_TYPE_TYPE:
				return createMovementTypeTypeFromString(eDataType, initialValue);
			case _301Package.PAYMENT_MECHANISM_TYPE:
				return createPaymentMechanismTypeFromString(eDataType, initialValue);
			case _301Package.PAYMENT_STATUS_TYPE:
				return createPaymentStatusTypeFromString(eDataType, initialValue);
			case _301Package.PRODUCT_TYPE_TYPE:
				return createProductTypeTypeFromString(eDataType, initialValue);
			case _301Package.SAFTPT_MOVEMENT_TAX_TYPE:
				return createSAFTPTMovementTaxTypeFromString(eDataType, initialValue);
			case _301Package.SAFTPT_PAYMENT_TYPE:
				return createSAFTPTPaymentTypeFromString(eDataType, initialValue);
			case _301Package.SAFTPT_SOURCE_BILLING:
				return createSAFTPTSourceBillingFromString(eDataType, initialValue);
			case _301Package.SAFTPT_SOURCE_PAYMENT:
				return createSAFTPTSourcePaymentFromString(eDataType, initialValue);
			case _301Package.TAX_ACCOUNTING_BASIS_TYPE:
				return createTaxAccountingBasisTypeFromString(eDataType, initialValue);
			case _301Package.TAX_TYPE_TYPE:
				return createTaxTypeTypeFromString(eDataType, initialValue);
			case _301Package.TRANSACTION_TYPE_TYPE:
				return createTransactionTypeTypeFromString(eDataType, initialValue);
			case _301Package.WITHHOLDING_TAX_TYPE_TYPE:
				return createWithholdingTaxTypeTypeFromString(eDataType, initialValue);
			case _301Package.WORK_STATUS_TYPE:
				return createWorkStatusTypeFromString(eDataType, initialValue);
			case _301Package.WORK_TYPE_TYPE:
				return createWorkTypeTypeFromString(eDataType, initialValue);
			case _301Package.ACCOUNT_ID_TYPE:
				return createAccountIDTypeFromString(eDataType, initialValue);
			case _301Package.AUDIT_FILE_VERSION_TYPE:
				return createAuditFileVersionTypeFromString(eDataType, initialValue);
			case _301Package.CASH_VAT_SCHEME_INDICATOR_TYPE:
				return createCashVATSchemeIndicatorTypeFromString(eDataType, initialValue);
			case _301Package.COMPANY_ID_TYPE:
				return createCompanyIDTypeFromString(eDataType, initialValue);
			case _301Package.COUNTRY_TYPE:
				return createCountryTypeFromString(eDataType, initialValue);
			case _301Package.CURRENCY_CODE_TYPE:
				return createCurrencyCodeTypeFromString(eDataType, initialValue);
			case _301Package.DOCUMENT_NUMBER_TYPE:
				return createDocumentNumberTypeFromString(eDataType, initialValue);
			case _301Package.EAC_CODE_TYPE:
				return createEACCodeTypeFromString(eDataType, initialValue);
			case _301Package.FISCAL_YEAR_TYPE:
				return createFiscalYearTypeFromString(eDataType, initialValue);
			case _301Package.GROUPING_CATEGORY_TYPE_OBJECT:
				return createGroupingCategoryTypeObjectFromString(eDataType, initialValue);
			case _301Package.INVOICE_NO_TYPE:
				return createInvoiceNoTypeFromString(eDataType, initialValue);
			case _301Package.INVOICE_STATUS_TYPE_OBJECT:
				return createInvoiceStatusTypeObjectFromString(eDataType, initialValue);
			case _301Package.INVOICE_TYPE_TYPE_OBJECT:
				return createInvoiceTypeTypeObjectFromString(eDataType, initialValue);
			case _301Package.MOVEMENT_STATUS_TYPE_OBJECT:
				return createMovementStatusTypeObjectFromString(eDataType, initialValue);
			case _301Package.MOVEMENT_TYPE_TYPE_OBJECT:
				return createMovementTypeTypeObjectFromString(eDataType, initialValue);
			case _301Package.PAYMENT_MECHANISM_TYPE_OBJECT:
				return createPaymentMechanismTypeObjectFromString(eDataType, initialValue);
			case _301Package.PAYMENT_REF_NO_TYPE:
				return createPaymentRefNoTypeFromString(eDataType, initialValue);
			case _301Package.PAYMENT_STATUS_TYPE_OBJECT:
				return createPaymentStatusTypeObjectFromString(eDataType, initialValue);
			case _301Package.PAYMENT_TAX_CODE:
				return createPaymentTaxCodeFromString(eDataType, initialValue);
			case _301Package.PERIOD_TYPE:
				return createPeriodTypeFromString(eDataType, initialValue);
			case _301Package.POSTAL_CODE_PT:
				return createPostalCodePTFromString(eDataType, initialValue);
			case _301Package.PRODUCT_TYPE_TYPE_OBJECT:
				return createProductTypeTypeObjectFromString(eDataType, initialValue);
			case _301Package.SA_FDATE_TIME_TYPE:
				return createSAFdateTimeTypeFromString(eDataType, initialValue);
			case _301Package.SA_FDATE_TYPE:
				return createSAFdateTypeFromString(eDataType, initialValue);
			case _301Package.SA_FDECIMAL_TYPE:
				return createSAFdecimalTypeFromString(eDataType, initialValue);
			case _301Package.SA_FMONETARY_TYPE:
				return createSAFmonetaryTypeFromString(eDataType, initialValue);
			case _301Package.SAFPT_ACCOUNTING_PERIOD:
				return createSAFPTAccountingPeriodFromString(eDataType, initialValue);
			case _301Package.SAFPT_DATE_SPAN:
				return createSAFPTDateSpanFromString(eDataType, initialValue);
			case _301Package.SAFPTGL_ACCOUNT_ID:
				return createSAFPTGLAccountIDFromString(eDataType, initialValue);
			case _301Package.SAFPT_JOURNAL_ID:
				return createSAFPTJournalIDFromString(eDataType, initialValue);
			case _301Package.SAFPT_PORTUGUESE_TAX_EXEMPTION:
				return createSAFPTPortugueseTaxExemptionFromString(eDataType, initialValue);
			case _301Package.SAFPT_PORTUGUESE_VAT_NUMBER:
				return createSAFPTPortugueseVatNumberFromString(eDataType, initialValue);
			case _301Package.SAFPT_PRODUCT_ID:
				return createSAFPTProductIDFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX100_CAR:
				return createSAFPTtextTypeMandatoryMax100CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR:
				return createSAFPTtextTypeMandatoryMax10CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX172_CAR:
				return createSAFPTtextTypeMandatoryMax172CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR:
				return createSAFPTtextTypeMandatoryMax200CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR:
				return createSAFPTtextTypeMandatoryMax20CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR:
				return createSAFPTtextTypeMandatoryMax255CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR:
				return createSAFPTtextTypeMandatoryMax30CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX35_CAR:
				return createSAFPTtextTypeMandatoryMax35CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR:
				return createSAFPTtextTypeMandatoryMax3CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR:
				return createSAFPTtextTypeMandatoryMax40CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR:
				return createSAFPTtextTypeMandatoryMax50CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR:
				return createSAFPTtextTypeMandatoryMax60CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR:
				return createSAFPTtextTypeMandatoryMax70CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX90_CAR:
				return createSAFPTtextTypeMandatoryMax90CarFromString(eDataType, initialValue);
			case _301Package.SAFP_TTEXT_TYPE_MAX40_CAR:
				return createSAFPTtextTypeMax40CarFromString(eDataType, initialValue);
			case _301Package.SAFPT_TRANSACTION_ID:
				return createSAFPTTransactionIDFromString(eDataType, initialValue);
			case _301Package.SAFTPT_DOC_ARCHIVAL_NUMBER:
				return createSAFTPTDocArchivalNumberFromString(eDataType, initialValue);
			case _301Package.SAFTPT_MOVEMENT_TAX_CODE:
				return createSAFTPTMovementTaxCodeFromString(eDataType, initialValue);
			case _301Package.SAFTPT_MOVEMENT_TAX_TYPE_OBJECT:
				return createSAFTPTMovementTaxTypeObjectFromString(eDataType, initialValue);
			case _301Package.SAFTPT_PAYMENT_TYPE_OBJECT:
				return createSAFTPTPaymentTypeObjectFromString(eDataType, initialValue);
			case _301Package.SAFTPT_SOURCE_BILLING_OBJECT:
				return createSAFTPTSourceBillingObjectFromString(eDataType, initialValue);
			case _301Package.SAFTPT_SOURCE_PAYMENT_OBJECT:
				return createSAFTPTSourcePaymentObjectFromString(eDataType, initialValue);
			case _301Package.SELF_BILLING_INDICATOR_TYPE:
				return createSelfBillingIndicatorTypeFromString(eDataType, initialValue);
			case _301Package.SUPPLIER_COUNTRY:
				return createSupplierCountryFromString(eDataType, initialValue);
			case _301Package.TAX_ACCOUNTING_BASIS_TYPE_OBJECT:
				return createTaxAccountingBasisTypeObjectFromString(eDataType, initialValue);
			case _301Package.TAX_CODE_TYPE:
				return createTaxCodeTypeFromString(eDataType, initialValue);
			case _301Package.TAX_COUNTRY_REGION_TYPE:
				return createTaxCountryRegionTypeFromString(eDataType, initialValue);
			case _301Package.TAX_TABLE_ENTRY_TAX_CODE:
				return createTaxTableEntryTaxCodeFromString(eDataType, initialValue);
			case _301Package.TAX_TYPE_TYPE_OBJECT:
				return createTaxTypeTypeObjectFromString(eDataType, initialValue);
			case _301Package.THIRD_PARTIES_BILLING_INDICATOR_TYPE:
				return createThirdPartiesBillingIndicatorTypeFromString(eDataType, initialValue);
			case _301Package.TRANSACTION_TYPE_TYPE_OBJECT:
				return createTransactionTypeTypeObjectFromString(eDataType, initialValue);
			case _301Package.WITHHOLDING_TAX_TYPE_TYPE_OBJECT:
				return createWithholdingTaxTypeTypeObjectFromString(eDataType, initialValue);
			case _301Package.WORK_STATUS_TYPE_OBJECT:
				return createWorkStatusTypeObjectFromString(eDataType, initialValue);
			case _301Package.WORK_TYPE_TYPE_OBJECT:
				return createWorkTypeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case _301Package.GROUPING_CATEGORY_TYPE:
				return convertGroupingCategoryTypeToString(eDataType, instanceValue);
			case _301Package.INVOICE_STATUS_TYPE:
				return convertInvoiceStatusTypeToString(eDataType, instanceValue);
			case _301Package.INVOICE_TYPE_TYPE:
				return convertInvoiceTypeTypeToString(eDataType, instanceValue);
			case _301Package.MOVEMENT_STATUS_TYPE:
				return convertMovementStatusTypeToString(eDataType, instanceValue);
			case _301Package.MOVEMENT_TYPE_TYPE:
				return convertMovementTypeTypeToString(eDataType, instanceValue);
			case _301Package.PAYMENT_MECHANISM_TYPE:
				return convertPaymentMechanismTypeToString(eDataType, instanceValue);
			case _301Package.PAYMENT_STATUS_TYPE:
				return convertPaymentStatusTypeToString(eDataType, instanceValue);
			case _301Package.PRODUCT_TYPE_TYPE:
				return convertProductTypeTypeToString(eDataType, instanceValue);
			case _301Package.SAFTPT_MOVEMENT_TAX_TYPE:
				return convertSAFTPTMovementTaxTypeToString(eDataType, instanceValue);
			case _301Package.SAFTPT_PAYMENT_TYPE:
				return convertSAFTPTPaymentTypeToString(eDataType, instanceValue);
			case _301Package.SAFTPT_SOURCE_BILLING:
				return convertSAFTPTSourceBillingToString(eDataType, instanceValue);
			case _301Package.SAFTPT_SOURCE_PAYMENT:
				return convertSAFTPTSourcePaymentToString(eDataType, instanceValue);
			case _301Package.TAX_ACCOUNTING_BASIS_TYPE:
				return convertTaxAccountingBasisTypeToString(eDataType, instanceValue);
			case _301Package.TAX_TYPE_TYPE:
				return convertTaxTypeTypeToString(eDataType, instanceValue);
			case _301Package.TRANSACTION_TYPE_TYPE:
				return convertTransactionTypeTypeToString(eDataType, instanceValue);
			case _301Package.WITHHOLDING_TAX_TYPE_TYPE:
				return convertWithholdingTaxTypeTypeToString(eDataType, instanceValue);
			case _301Package.WORK_STATUS_TYPE:
				return convertWorkStatusTypeToString(eDataType, instanceValue);
			case _301Package.WORK_TYPE_TYPE:
				return convertWorkTypeTypeToString(eDataType, instanceValue);
			case _301Package.ACCOUNT_ID_TYPE:
				return convertAccountIDTypeToString(eDataType, instanceValue);
			case _301Package.AUDIT_FILE_VERSION_TYPE:
				return convertAuditFileVersionTypeToString(eDataType, instanceValue);
			case _301Package.CASH_VAT_SCHEME_INDICATOR_TYPE:
				return convertCashVATSchemeIndicatorTypeToString(eDataType, instanceValue);
			case _301Package.COMPANY_ID_TYPE:
				return convertCompanyIDTypeToString(eDataType, instanceValue);
			case _301Package.COUNTRY_TYPE:
				return convertCountryTypeToString(eDataType, instanceValue);
			case _301Package.CURRENCY_CODE_TYPE:
				return convertCurrencyCodeTypeToString(eDataType, instanceValue);
			case _301Package.DOCUMENT_NUMBER_TYPE:
				return convertDocumentNumberTypeToString(eDataType, instanceValue);
			case _301Package.EAC_CODE_TYPE:
				return convertEACCodeTypeToString(eDataType, instanceValue);
			case _301Package.FISCAL_YEAR_TYPE:
				return convertFiscalYearTypeToString(eDataType, instanceValue);
			case _301Package.GROUPING_CATEGORY_TYPE_OBJECT:
				return convertGroupingCategoryTypeObjectToString(eDataType, instanceValue);
			case _301Package.INVOICE_NO_TYPE:
				return convertInvoiceNoTypeToString(eDataType, instanceValue);
			case _301Package.INVOICE_STATUS_TYPE_OBJECT:
				return convertInvoiceStatusTypeObjectToString(eDataType, instanceValue);
			case _301Package.INVOICE_TYPE_TYPE_OBJECT:
				return convertInvoiceTypeTypeObjectToString(eDataType, instanceValue);
			case _301Package.MOVEMENT_STATUS_TYPE_OBJECT:
				return convertMovementStatusTypeObjectToString(eDataType, instanceValue);
			case _301Package.MOVEMENT_TYPE_TYPE_OBJECT:
				return convertMovementTypeTypeObjectToString(eDataType, instanceValue);
			case _301Package.PAYMENT_MECHANISM_TYPE_OBJECT:
				return convertPaymentMechanismTypeObjectToString(eDataType, instanceValue);
			case _301Package.PAYMENT_REF_NO_TYPE:
				return convertPaymentRefNoTypeToString(eDataType, instanceValue);
			case _301Package.PAYMENT_STATUS_TYPE_OBJECT:
				return convertPaymentStatusTypeObjectToString(eDataType, instanceValue);
			case _301Package.PAYMENT_TAX_CODE:
				return convertPaymentTaxCodeToString(eDataType, instanceValue);
			case _301Package.PERIOD_TYPE:
				return convertPeriodTypeToString(eDataType, instanceValue);
			case _301Package.POSTAL_CODE_PT:
				return convertPostalCodePTToString(eDataType, instanceValue);
			case _301Package.PRODUCT_TYPE_TYPE_OBJECT:
				return convertProductTypeTypeObjectToString(eDataType, instanceValue);
			case _301Package.SA_FDATE_TIME_TYPE:
				return convertSAFdateTimeTypeToString(eDataType, instanceValue);
			case _301Package.SA_FDATE_TYPE:
				return convertSAFdateTypeToString(eDataType, instanceValue);
			case _301Package.SA_FDECIMAL_TYPE:
				return convertSAFdecimalTypeToString(eDataType, instanceValue);
			case _301Package.SA_FMONETARY_TYPE:
				return convertSAFmonetaryTypeToString(eDataType, instanceValue);
			case _301Package.SAFPT_ACCOUNTING_PERIOD:
				return convertSAFPTAccountingPeriodToString(eDataType, instanceValue);
			case _301Package.SAFPT_DATE_SPAN:
				return convertSAFPTDateSpanToString(eDataType, instanceValue);
			case _301Package.SAFPTGL_ACCOUNT_ID:
				return convertSAFPTGLAccountIDToString(eDataType, instanceValue);
			case _301Package.SAFPT_JOURNAL_ID:
				return convertSAFPTJournalIDToString(eDataType, instanceValue);
			case _301Package.SAFPT_PORTUGUESE_TAX_EXEMPTION:
				return convertSAFPTPortugueseTaxExemptionToString(eDataType, instanceValue);
			case _301Package.SAFPT_PORTUGUESE_VAT_NUMBER:
				return convertSAFPTPortugueseVatNumberToString(eDataType, instanceValue);
			case _301Package.SAFPT_PRODUCT_ID:
				return convertSAFPTProductIDToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX100_CAR:
				return convertSAFPTtextTypeMandatoryMax100CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR:
				return convertSAFPTtextTypeMandatoryMax10CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX172_CAR:
				return convertSAFPTtextTypeMandatoryMax172CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR:
				return convertSAFPTtextTypeMandatoryMax200CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR:
				return convertSAFPTtextTypeMandatoryMax20CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR:
				return convertSAFPTtextTypeMandatoryMax255CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR:
				return convertSAFPTtextTypeMandatoryMax30CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX35_CAR:
				return convertSAFPTtextTypeMandatoryMax35CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR:
				return convertSAFPTtextTypeMandatoryMax3CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR:
				return convertSAFPTtextTypeMandatoryMax40CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR:
				return convertSAFPTtextTypeMandatoryMax50CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR:
				return convertSAFPTtextTypeMandatoryMax60CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR:
				return convertSAFPTtextTypeMandatoryMax70CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MANDATORY_MAX90_CAR:
				return convertSAFPTtextTypeMandatoryMax90CarToString(eDataType, instanceValue);
			case _301Package.SAFP_TTEXT_TYPE_MAX40_CAR:
				return convertSAFPTtextTypeMax40CarToString(eDataType, instanceValue);
			case _301Package.SAFPT_TRANSACTION_ID:
				return convertSAFPTTransactionIDToString(eDataType, instanceValue);
			case _301Package.SAFTPT_DOC_ARCHIVAL_NUMBER:
				return convertSAFTPTDocArchivalNumberToString(eDataType, instanceValue);
			case _301Package.SAFTPT_MOVEMENT_TAX_CODE:
				return convertSAFTPTMovementTaxCodeToString(eDataType, instanceValue);
			case _301Package.SAFTPT_MOVEMENT_TAX_TYPE_OBJECT:
				return convertSAFTPTMovementTaxTypeObjectToString(eDataType, instanceValue);
			case _301Package.SAFTPT_PAYMENT_TYPE_OBJECT:
				return convertSAFTPTPaymentTypeObjectToString(eDataType, instanceValue);
			case _301Package.SAFTPT_SOURCE_BILLING_OBJECT:
				return convertSAFTPTSourceBillingObjectToString(eDataType, instanceValue);
			case _301Package.SAFTPT_SOURCE_PAYMENT_OBJECT:
				return convertSAFTPTSourcePaymentObjectToString(eDataType, instanceValue);
			case _301Package.SELF_BILLING_INDICATOR_TYPE:
				return convertSelfBillingIndicatorTypeToString(eDataType, instanceValue);
			case _301Package.SUPPLIER_COUNTRY:
				return convertSupplierCountryToString(eDataType, instanceValue);
			case _301Package.TAX_ACCOUNTING_BASIS_TYPE_OBJECT:
				return convertTaxAccountingBasisTypeObjectToString(eDataType, instanceValue);
			case _301Package.TAX_CODE_TYPE:
				return convertTaxCodeTypeToString(eDataType, instanceValue);
			case _301Package.TAX_COUNTRY_REGION_TYPE:
				return convertTaxCountryRegionTypeToString(eDataType, instanceValue);
			case _301Package.TAX_TABLE_ENTRY_TAX_CODE:
				return convertTaxTableEntryTaxCodeToString(eDataType, instanceValue);
			case _301Package.TAX_TYPE_TYPE_OBJECT:
				return convertTaxTypeTypeObjectToString(eDataType, instanceValue);
			case _301Package.THIRD_PARTIES_BILLING_INDICATOR_TYPE:
				return convertThirdPartiesBillingIndicatorTypeToString(eDataType, instanceValue);
			case _301Package.TRANSACTION_TYPE_TYPE_OBJECT:
				return convertTransactionTypeTypeObjectToString(eDataType, instanceValue);
			case _301Package.WITHHOLDING_TAX_TYPE_TYPE_OBJECT:
				return convertWithholdingTaxTypeTypeObjectToString(eDataType, instanceValue);
			case _301Package.WORK_STATUS_TYPE_OBJECT:
				return convertWorkStatusTypeObjectToString(eDataType, instanceValue);
			case _301Package.WORK_TYPE_TYPE_OBJECT:
				return convertWorkTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure createAddressStructure() {
		AddressStructureImpl addressStructure = new AddressStructureImpl();
		return addressStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructurePT createAddressStructurePT() {
		AddressStructurePTImpl addressStructurePT = new AddressStructurePTImpl();
		return addressStructurePT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditFileType createAuditFileType() {
		AuditFileTypeImpl auditFileType = new AuditFileTypeImpl();
		return auditFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency createCurrency() {
		CurrencyImpl currency = new CurrencyImpl();
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerType createCustomerType() {
		CustomerTypeImpl customerType = new CustomerTypeImpl();
		return customerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatusType createDocumentStatusType() {
		DocumentStatusTypeImpl documentStatusType = new DocumentStatusTypeImpl();
		return documentStatusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatusType1 createDocumentStatusType1() {
		DocumentStatusType1Impl documentStatusType1 = new DocumentStatusType1Impl();
		return documentStatusType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatusType2 createDocumentStatusType2() {
		DocumentStatusType2Impl documentStatusType2 = new DocumentStatusType2Impl();
		return documentStatusType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatusType3 createDocumentStatusType3() {
		DocumentStatusType3Impl documentStatusType3 = new DocumentStatusType3Impl();
		return documentStatusType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTotalsType createDocumentTotalsType() {
		DocumentTotalsTypeImpl documentTotalsType = new DocumentTotalsTypeImpl();
		return documentTotalsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTotalsType1 createDocumentTotalsType1() {
		DocumentTotalsType1Impl documentTotalsType1 = new DocumentTotalsType1Impl();
		return documentTotalsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTotalsType2 createDocumentTotalsType2() {
		DocumentTotalsType2Impl documentTotalsType2 = new DocumentTotalsType2Impl();
		return documentTotalsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTotalsType3 createDocumentTotalsType3() {
		DocumentTotalsType3Impl documentTotalsType3 = new DocumentTotalsType3Impl();
		return documentTotalsType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLedgerEntriesType createGeneralLedgerEntriesType() {
		GeneralLedgerEntriesTypeImpl generalLedgerEntriesType = new GeneralLedgerEntriesTypeImpl();
		return generalLedgerEntriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLedgerType createGeneralLedgerType() {
		GeneralLedgerTypeImpl generalLedgerType = new GeneralLedgerTypeImpl();
		return generalLedgerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType createHeaderType() {
		HeaderTypeImpl headerType = new HeaderTypeImpl();
		return headerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceType createInvoiceType() {
		InvoiceTypeImpl invoiceType = new InvoiceTypeImpl();
		return invoiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JournalType createJournalType() {
		JournalTypeImpl journalType = new JournalTypeImpl();
		return journalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType createLineType() {
		LineTypeImpl lineType = new LineTypeImpl();
		return lineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType1 createLineType1() {
		LineType1Impl lineType1 = new LineType1Impl();
		return lineType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType2 createLineType2() {
		LineType2Impl lineType2 = new LineType2Impl();
		return lineType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType3 createLineType3() {
		LineType3Impl lineType3 = new LineType3Impl();
		return lineType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType4 createLineType4() {
		LineType4Impl lineType4 = new LineType4Impl();
		return lineType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterFilesType createMasterFilesType() {
		MasterFilesTypeImpl masterFilesType = new MasterFilesTypeImpl();
		return masterFilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementOfGoodsType createMovementOfGoodsType() {
		MovementOfGoodsTypeImpl movementOfGoodsType = new MovementOfGoodsTypeImpl();
		return movementOfGoodsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementTax createMovementTax() {
		MovementTaxImpl movementTax = new MovementTaxImpl();
		return movementTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderReferences createOrderReferences() {
		OrderReferencesImpl orderReferences = new OrderReferencesImpl();
		return orderReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod createPaymentMethod() {
		PaymentMethodImpl paymentMethod = new PaymentMethodImpl();
		return paymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentsType createPaymentsType() {
		PaymentsTypeImpl paymentsType = new PaymentsTypeImpl();
		return paymentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentTax createPaymentTax() {
		PaymentTaxImpl paymentTax = new PaymentTaxImpl();
		return paymentTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentType createPaymentType() {
		PaymentTypeImpl paymentType = new PaymentTypeImpl();
		return paymentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType createProductType() {
		ProductTypeImpl productType = new ProductTypeImpl();
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public References createReferences() {
		ReferencesImpl references = new ReferencesImpl();
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesInvoicesType createSalesInvoicesType() {
		SalesInvoicesTypeImpl salesInvoicesType = new SalesInvoicesTypeImpl();
		return salesInvoicesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settlement createSettlement() {
		SettlementImpl settlement = new SettlementImpl();
		return settlement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettlementType createSettlementType() {
		SettlementTypeImpl settlementType = new SettlementTypeImpl();
		return settlementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShippingPointStructure createShippingPointStructure() {
		ShippingPointStructureImpl shippingPointStructure = new ShippingPointStructureImpl();
		return shippingPointStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentIDType createSourceDocumentIDType() {
		SourceDocumentIDTypeImpl sourceDocumentIDType = new SourceDocumentIDTypeImpl();
		return sourceDocumentIDType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDocumentsType createSourceDocumentsType() {
		SourceDocumentsTypeImpl sourceDocumentsType = new SourceDocumentsTypeImpl();
		return sourceDocumentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialRegimes createSpecialRegimes() {
		SpecialRegimesImpl specialRegimes = new SpecialRegimesImpl();
		return specialRegimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StockMovementType createStockMovementType() {
		StockMovementTypeImpl stockMovementType = new StockMovementTypeImpl();
		return stockMovementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierAddressStructure createSupplierAddressStructure() {
		SupplierAddressStructureImpl supplierAddressStructure = new SupplierAddressStructureImpl();
		return supplierAddressStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierType createSupplierType() {
		SupplierTypeImpl supplierType = new SupplierTypeImpl();
		return supplierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tax createTax() {
		TaxImpl tax = new TaxImpl();
		return tax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTableEntryType createTaxTableEntryType() {
		TaxTableEntryTypeImpl taxTableEntryType = new TaxTableEntryTypeImpl();
		return taxTableEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTableType createTaxTableType() {
		TaxTableTypeImpl taxTableType = new TaxTableTypeImpl();
		return taxTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionType createTransactionType() {
		TransactionTypeImpl transactionType = new TransactionTypeImpl();
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithholdingTax createWithholdingTax() {
		WithholdingTaxImpl withholdingTax = new WithholdingTaxImpl();
		return withholdingTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDocumentType createWorkDocumentType() {
		WorkDocumentTypeImpl workDocumentType = new WorkDocumentTypeImpl();
		return workDocumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingDocumentsType createWorkingDocumentsType() {
		WorkingDocumentsTypeImpl workingDocumentsType = new WorkingDocumentsTypeImpl();
		return workingDocumentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingCategoryType createGroupingCategoryTypeFromString(EDataType eDataType, String initialValue) {
		GroupingCategoryType result = GroupingCategoryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupingCategoryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceStatusType createInvoiceStatusTypeFromString(EDataType eDataType, String initialValue) {
		InvoiceStatusType result = InvoiceStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceTypeType createInvoiceTypeTypeFromString(EDataType eDataType, String initialValue) {
		InvoiceTypeType result = InvoiceTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementStatusType createMovementStatusTypeFromString(EDataType eDataType, String initialValue) {
		MovementStatusType result = MovementStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMovementStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementTypeType createMovementTypeTypeFromString(EDataType eDataType, String initialValue) {
		MovementTypeType result = MovementTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMovementTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMechanismType createPaymentMechanismTypeFromString(EDataType eDataType, String initialValue) {
		PaymentMechanismType result = PaymentMechanismType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentMechanismTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentStatusType createPaymentStatusTypeFromString(EDataType eDataType, String initialValue) {
		PaymentStatusType result = PaymentStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTypeType createProductTypeTypeFromString(EDataType eDataType, String initialValue) {
		ProductTypeType result = ProductTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTMovementTaxType createSAFTPTMovementTaxTypeFromString(EDataType eDataType, String initialValue) {
		SAFTPTMovementTaxType result = SAFTPTMovementTaxType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFTPTMovementTaxTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTPaymentType createSAFTPTPaymentTypeFromString(EDataType eDataType, String initialValue) {
		SAFTPTPaymentType result = SAFTPTPaymentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFTPTPaymentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTSourceBilling createSAFTPTSourceBillingFromString(EDataType eDataType, String initialValue) {
		SAFTPTSourceBilling result = SAFTPTSourceBilling.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFTPTSourceBillingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTSourcePayment createSAFTPTSourcePaymentFromString(EDataType eDataType, String initialValue) {
		SAFTPTSourcePayment result = SAFTPTSourcePayment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFTPTSourcePaymentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxAccountingBasisType createTaxAccountingBasisTypeFromString(EDataType eDataType, String initialValue) {
		TaxAccountingBasisType result = TaxAccountingBasisType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxAccountingBasisTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTypeType createTaxTypeTypeFromString(EDataType eDataType, String initialValue) {
		TaxTypeType result = TaxTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType createTransactionTypeTypeFromString(EDataType eDataType, String initialValue) {
		TransactionTypeType result = TransactionTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithholdingTaxTypeType createWithholdingTaxTypeTypeFromString(EDataType eDataType, String initialValue) {
		WithholdingTaxTypeType result = WithholdingTaxTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWithholdingTaxTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkStatusType createWorkStatusTypeFromString(EDataType eDataType, String initialValue) {
		WorkStatusType result = WorkStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTypeType createWorkTypeTypeFromString(EDataType eDataType, String initialValue) {
		WorkTypeType result = WorkTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAccountIDTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountIDTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAuditFileVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuditFileVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createCashVATSchemeIndicatorTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCashVATSchemeIndicatorTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCompanyIDTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompanyIDTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCountryTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountryTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCurrencyCodeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrencyCodeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDocumentNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEACCodeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEACCodeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createFiscalYearTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFiscalYearTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingCategoryType createGroupingCategoryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGroupingCategoryTypeFromString(_301Package.eINSTANCE.getGroupingCategoryType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupingCategoryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupingCategoryTypeToString(_301Package.eINSTANCE.getGroupingCategoryType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInvoiceNoTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceNoTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceStatusType createInvoiceStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInvoiceStatusTypeFromString(_301Package.eINSTANCE.getInvoiceStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInvoiceStatusTypeToString(_301Package.eINSTANCE.getInvoiceStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceTypeType createInvoiceTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInvoiceTypeTypeFromString(_301Package.eINSTANCE.getInvoiceTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInvoiceTypeTypeToString(_301Package.eINSTANCE.getInvoiceTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementStatusType createMovementStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMovementStatusTypeFromString(_301Package.eINSTANCE.getMovementStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMovementStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMovementStatusTypeToString(_301Package.eINSTANCE.getMovementStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementTypeType createMovementTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMovementTypeTypeFromString(_301Package.eINSTANCE.getMovementTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMovementTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMovementTypeTypeToString(_301Package.eINSTANCE.getMovementTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMechanismType createPaymentMechanismTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPaymentMechanismTypeFromString(_301Package.eINSTANCE.getPaymentMechanismType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentMechanismTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPaymentMechanismTypeToString(_301Package.eINSTANCE.getPaymentMechanismType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPaymentRefNoTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentRefNoTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentStatusType createPaymentStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPaymentStatusTypeFromString(_301Package.eINSTANCE.getPaymentStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPaymentStatusTypeToString(_301Package.eINSTANCE.getPaymentStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPaymentTaxCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentTaxCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPeriodTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeriodTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPostalCodePTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostalCodePTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductTypeType createProductTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProductTypeTypeFromString(_301Package.eINSTANCE.getProductTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProductTypeTypeToString(_301Package.eINSTANCE.getProductTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createSAFdateTimeTypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFdateTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createSAFdateTypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFdateTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSAFdecimalTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFdecimalTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createSAFmonetaryTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFmonetaryTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSAFPTAccountingPeriodFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTAccountingPeriodToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createSAFPTDateSpanFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTDateSpanToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTGLAccountIDFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTGLAccountIDToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTJournalIDFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTJournalIDToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTPortugueseTaxExemptionFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTPortugueseTaxExemptionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSAFPTPortugueseVatNumberFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTPortugueseVatNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTProductIDFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTProductIDToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax100CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax100CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax10CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax10CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax172CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax172CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax200CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax200CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax20CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax20CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax255CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax255CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax30CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax30CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax35CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax35CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax3CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax3CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax40CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax40CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax50CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax50CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax60CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax60CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax70CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax70CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMandatoryMax90CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMandatoryMax90CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTtextTypeMax40CarFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTtextTypeMax40CarToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFPTTransactionIDFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTTransactionIDToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFTPTDocArchivalNumberFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFTPTDocArchivalNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSAFTPTMovementTaxCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFTPTMovementTaxCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTMovementTaxType createSAFTPTMovementTaxTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSAFTPTMovementTaxTypeFromString(_301Package.eINSTANCE.getSAFTPTMovementTaxType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFTPTMovementTaxTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSAFTPTMovementTaxTypeToString(_301Package.eINSTANCE.getSAFTPTMovementTaxType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTPaymentType createSAFTPTPaymentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSAFTPTPaymentTypeFromString(_301Package.eINSTANCE.getSAFTPTPaymentType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFTPTPaymentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSAFTPTPaymentTypeToString(_301Package.eINSTANCE.getSAFTPTPaymentType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTSourceBilling createSAFTPTSourceBillingObjectFromString(EDataType eDataType, String initialValue) {
		return createSAFTPTSourceBillingFromString(_301Package.eINSTANCE.getSAFTPTSourceBilling(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFTPTSourceBillingObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSAFTPTSourceBillingToString(_301Package.eINSTANCE.getSAFTPTSourceBilling(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTSourcePayment createSAFTPTSourcePaymentObjectFromString(EDataType eDataType, String initialValue) {
		return createSAFTPTSourcePaymentFromString(_301Package.eINSTANCE.getSAFTPTSourcePayment(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFTPTSourcePaymentObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSAFTPTSourcePaymentToString(_301Package.eINSTANCE.getSAFTPTSourcePayment(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSelfBillingIndicatorTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelfBillingIndicatorTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSupplierCountryFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSupplierCountryToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxAccountingBasisType createTaxAccountingBasisTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTaxAccountingBasisTypeFromString(_301Package.eINSTANCE.getTaxAccountingBasisType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxAccountingBasisTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaxAccountingBasisTypeToString(_301Package.eINSTANCE.getTaxAccountingBasisType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTaxCodeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxCodeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTaxCountryRegionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxCountryRegionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTaxTableEntryTaxCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxTableEntryTaxCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTypeType createTaxTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTaxTypeTypeFromString(_301Package.eINSTANCE.getTaxTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaxTypeTypeToString(_301Package.eINSTANCE.getTaxTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createThirdPartiesBillingIndicatorTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThirdPartiesBillingIndicatorTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType createTransactionTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransactionTypeTypeFromString(_301Package.eINSTANCE.getTransactionTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransactionTypeTypeToString(_301Package.eINSTANCE.getTransactionTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithholdingTaxTypeType createWithholdingTaxTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWithholdingTaxTypeTypeFromString(_301Package.eINSTANCE.getWithholdingTaxTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWithholdingTaxTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWithholdingTaxTypeTypeToString(_301Package.eINSTANCE.getWithholdingTaxTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkStatusType createWorkStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWorkStatusTypeFromString(_301Package.eINSTANCE.getWorkStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWorkStatusTypeToString(_301Package.eINSTANCE.getWorkStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTypeType createWorkTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWorkTypeTypeFromString(_301Package.eINSTANCE.getWorkTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWorkTypeTypeToString(_301Package.eINSTANCE.getWorkTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _301Package get_301Package() {
		return (_301Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _301Package getPackage() {
		return _301Package.eINSTANCE;
	}

} //_301FactoryImpl
