/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._201.*;

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
public class _201FactoryImpl extends EFactoryImpl implements _201Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _201Factory init() {
		try {
			_201Factory the_201Factory = (_201Factory)EPackage.Registry.INSTANCE.getEFactory("urn:OECD:StandardAuditFile-Tax:PT_1.02_01"); 
			if (the_201Factory != null) {
				return the_201Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _201FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _201FactoryImpl() {
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
			case _201Package.ADDRESS_STRUCTURE: return createAddressStructure();
			case _201Package.ADDRESS_STRUCTURE_PT: return createAddressStructurePT();
			case _201Package.AUDIT_FILE_TYPE: return createAuditFileType();
			case _201Package.CURRENCY: return createCurrency();
			case _201Package.CUSTOMER_TYPE: return createCustomerType();
			case _201Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _201Package.DOCUMENT_STATUS_TYPE: return createDocumentStatusType();
			case _201Package.DOCUMENT_STATUS_TYPE1: return createDocumentStatusType1();
			case _201Package.DOCUMENT_STATUS_TYPE2: return createDocumentStatusType2();
			case _201Package.DOCUMENT_TOTALS_TYPE: return createDocumentTotalsType();
			case _201Package.DOCUMENT_TOTALS_TYPE1: return createDocumentTotalsType1();
			case _201Package.DOCUMENT_TOTALS_TYPE2: return createDocumentTotalsType2();
			case _201Package.GENERAL_LEDGER_ENTRIES_TYPE: return createGeneralLedgerEntriesType();
			case _201Package.GENERAL_LEDGER_TYPE: return createGeneralLedgerType();
			case _201Package.HEADER_TYPE: return createHeaderType();
			case _201Package.INVOICE_TYPE: return createInvoiceType();
			case _201Package.JOURNAL_TYPE: return createJournalType();
			case _201Package.LINE_TYPE: return createLineType();
			case _201Package.LINE_TYPE1: return createLineType1();
			case _201Package.LINE_TYPE2: return createLineType2();
			case _201Package.LINE_TYPE3: return createLineType3();
			case _201Package.MASTER_FILES_TYPE: return createMasterFilesType();
			case _201Package.MOVEMENT_OF_GOODS_TYPE: return createMovementOfGoodsType();
			case _201Package.MOVEMENT_TAX: return createMovementTax();
			case _201Package.ORDER_REFERENCES: return createOrderReferences();
			case _201Package.PAYMENT: return createPayment();
			case _201Package.PRODUCT_TYPE: return createProductType();
			case _201Package.REFERENCES: return createReferences();
			case _201Package.SALES_INVOICES_TYPE: return createSalesInvoicesType();
			case _201Package.SETTLEMENT: return createSettlement();
			case _201Package.SHIPPING_POINT_STRUCTURE: return createShippingPointStructure();
			case _201Package.SOURCE_DOCUMENTS_TYPE: return createSourceDocumentsType();
			case _201Package.STOCK_MOVEMENT_TYPE: return createStockMovementType();
			case _201Package.SUPPLIER_ADDRESS_STRUCTURE: return createSupplierAddressStructure();
			case _201Package.SUPPLIER_TYPE: return createSupplierType();
			case _201Package.TAX: return createTax();
			case _201Package.TAX_TABLE_ENTRY_TYPE: return createTaxTableEntryType();
			case _201Package.TAX_TABLE_TYPE: return createTaxTableType();
			case _201Package.TRANSACTION_TYPE: return createTransactionType();
			case _201Package.WITHHOLDING_TAX: return createWithholdingTax();
			case _201Package.WORK_DOCUMENT_TYPE: return createWorkDocumentType();
			case _201Package.WORKING_DOCUMENTS_TYPE: return createWorkingDocumentsType();
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
			case _201Package.GROUPING_CATEGORY_TYPE:
				return createGroupingCategoryTypeFromString(eDataType, initialValue);
			case _201Package.INVOICE_STATUS_TYPE:
				return createInvoiceStatusTypeFromString(eDataType, initialValue);
			case _201Package.INVOICE_TYPE_TYPE:
				return createInvoiceTypeTypeFromString(eDataType, initialValue);
			case _201Package.MOVEMENT_STATUS_TYPE:
				return createMovementStatusTypeFromString(eDataType, initialValue);
			case _201Package.MOVEMENT_TYPE_TYPE:
				return createMovementTypeTypeFromString(eDataType, initialValue);
			case _201Package.PAYMENT_MECHANISM_TYPE:
				return createPaymentMechanismTypeFromString(eDataType, initialValue);
			case _201Package.PRODUCT_TYPE_TYPE:
				return createProductTypeTypeFromString(eDataType, initialValue);
			case _201Package.SAFTPT_MOVEMENT_TAX_TYPE:
				return createSAFTPTMovementTaxTypeFromString(eDataType, initialValue);
			case _201Package.SOURCE_BILLING_TYPE:
				return createSourceBillingTypeFromString(eDataType, initialValue);
			case _201Package.TAX_ACCOUNTING_BASIS_TYPE:
				return createTaxAccountingBasisTypeFromString(eDataType, initialValue);
			case _201Package.TAX_TYPE_TYPE:
				return createTaxTypeTypeFromString(eDataType, initialValue);
			case _201Package.TRANSACTION_TYPE_TYPE:
				return createTransactionTypeTypeFromString(eDataType, initialValue);
			case _201Package.WITHHOLDING_TAX_TYPE_TYPE:
				return createWithholdingTaxTypeTypeFromString(eDataType, initialValue);
			case _201Package.WORK_STATUS_TYPE:
				return createWorkStatusTypeFromString(eDataType, initialValue);
			case _201Package.WORK_TYPE_TYPE:
				return createWorkTypeTypeFromString(eDataType, initialValue);
			case _201Package.ACCOUNT_ID_TYPE:
				return createAccountIDTypeFromString(eDataType, initialValue);
			case _201Package.AUDIT_FILE_VERSION_TYPE:
				return createAuditFileVersionTypeFromString(eDataType, initialValue);
			case _201Package.COMPANY_ID_TYPE:
				return createCompanyIDTypeFromString(eDataType, initialValue);
			case _201Package.COUNTRY_TYPE:
				return createCountryTypeFromString(eDataType, initialValue);
			case _201Package.CURRENCY_CODE_TYPE:
				return createCurrencyCodeTypeFromString(eDataType, initialValue);
			case _201Package.DOCUMENT_NUMBER_TYPE:
				return createDocumentNumberTypeFromString(eDataType, initialValue);
			case _201Package.EAC_CODE_TYPE:
				return createEACCodeTypeFromString(eDataType, initialValue);
			case _201Package.FISCAL_YEAR_TYPE:
				return createFiscalYearTypeFromString(eDataType, initialValue);
			case _201Package.GROUPING_CATEGORY_TYPE_OBJECT:
				return createGroupingCategoryTypeObjectFromString(eDataType, initialValue);
			case _201Package.INVOICE_NO_TYPE:
				return createInvoiceNoTypeFromString(eDataType, initialValue);
			case _201Package.INVOICE_STATUS_TYPE_OBJECT:
				return createInvoiceStatusTypeObjectFromString(eDataType, initialValue);
			case _201Package.INVOICE_TYPE_TYPE_OBJECT:
				return createInvoiceTypeTypeObjectFromString(eDataType, initialValue);
			case _201Package.MOVEMENT_STATUS_TYPE_OBJECT:
				return createMovementStatusTypeObjectFromString(eDataType, initialValue);
			case _201Package.MOVEMENT_TYPE_TYPE_OBJECT:
				return createMovementTypeTypeObjectFromString(eDataType, initialValue);
			case _201Package.PAYMENT_MECHANISM_TYPE_OBJECT:
				return createPaymentMechanismTypeObjectFromString(eDataType, initialValue);
			case _201Package.PERIOD_TYPE:
				return createPeriodTypeFromString(eDataType, initialValue);
			case _201Package.POSTAL_CODE_PT:
				return createPostalCodePTFromString(eDataType, initialValue);
			case _201Package.PRODUCT_TYPE_TYPE_OBJECT:
				return createProductTypeTypeObjectFromString(eDataType, initialValue);
			case _201Package.SA_FDATE_TIME_TYPE:
				return createSAFdateTimeTypeFromString(eDataType, initialValue);
			case _201Package.SA_FDATE_TYPE:
				return createSAFdateTypeFromString(eDataType, initialValue);
			case _201Package.SA_FDECIMAL_TYPE:
				return createSAFdecimalTypeFromString(eDataType, initialValue);
			case _201Package.SA_FMONETARY_TYPE:
				return createSAFmonetaryTypeFromString(eDataType, initialValue);
			case _201Package.SAFPT_ACCOUNTING_PERIOD:
				return createSAFPTAccountingPeriodFromString(eDataType, initialValue);
			case _201Package.SAFPT_DATE_SPAN:
				return createSAFPTDateSpanFromString(eDataType, initialValue);
			case _201Package.SAFPTGL_ACCOUNT_ID:
				return createSAFPTGLAccountIDFromString(eDataType, initialValue);
			case _201Package.SAFPT_JOURNAL_ID:
				return createSAFPTJournalIDFromString(eDataType, initialValue);
			case _201Package.SAFPT_PORTUGUESE_TAX_EXEMPTION:
				return createSAFPTPortugueseTaxExemptionFromString(eDataType, initialValue);
			case _201Package.SAFPT_PORTUGUESE_VAT_NUMBER:
				return createSAFPTPortugueseVatNumberFromString(eDataType, initialValue);
			case _201Package.SAFPT_PRODUCT_ID:
				return createSAFPTProductIDFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX100_CAR:
				return createSAFPTtextTypeMandatoryMax100CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR:
				return createSAFPTtextTypeMandatoryMax10CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX172_CAR:
				return createSAFPTtextTypeMandatoryMax172CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR:
				return createSAFPTtextTypeMandatoryMax200CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR:
				return createSAFPTtextTypeMandatoryMax20CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR:
				return createSAFPTtextTypeMandatoryMax255CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR:
				return createSAFPTtextTypeMandatoryMax30CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR:
				return createSAFPTtextTypeMandatoryMax3CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR:
				return createSAFPTtextTypeMandatoryMax40CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR:
				return createSAFPTtextTypeMandatoryMax50CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR:
				return createSAFPTtextTypeMandatoryMax60CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR:
				return createSAFPTtextTypeMandatoryMax70CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX90_CAR:
				return createSAFPTtextTypeMandatoryMax90CarFromString(eDataType, initialValue);
			case _201Package.SAFP_TTEXT_TYPE_MAX40_CAR:
				return createSAFPTtextTypeMax40CarFromString(eDataType, initialValue);
			case _201Package.SAFPT_TRANSACTION_ID:
				return createSAFPTTransactionIDFromString(eDataType, initialValue);
			case _201Package.SAFTPT_DOC_ARCHIVAL_NUMBER:
				return createSAFTPTDocArchivalNumberFromString(eDataType, initialValue);
			case _201Package.SAFTPT_MOVEMENT_TAX_CODE:
				return createSAFTPTMovementTaxCodeFromString(eDataType, initialValue);
			case _201Package.SAFTPT_MOVEMENT_TAX_TYPE_OBJECT:
				return createSAFTPTMovementTaxTypeObjectFromString(eDataType, initialValue);
			case _201Package.SELF_BILLING_INDICATOR_TYPE:
				return createSelfBillingIndicatorTypeFromString(eDataType, initialValue);
			case _201Package.SOURCE_BILLING_TYPE_OBJECT:
				return createSourceBillingTypeObjectFromString(eDataType, initialValue);
			case _201Package.SUPPLIER_COUNTRY:
				return createSupplierCountryFromString(eDataType, initialValue);
			case _201Package.TAX_ACCOUNTING_BASIS_TYPE_OBJECT:
				return createTaxAccountingBasisTypeObjectFromString(eDataType, initialValue);
			case _201Package.TAX_CODE_TYPE:
				return createTaxCodeTypeFromString(eDataType, initialValue);
			case _201Package.TAX_COUNTRY_REGION_TYPE:
				return createTaxCountryRegionTypeFromString(eDataType, initialValue);
			case _201Package.TAX_TYPE_TYPE_OBJECT:
				return createTaxTypeTypeObjectFromString(eDataType, initialValue);
			case _201Package.TRANSACTION_TYPE_TYPE_OBJECT:
				return createTransactionTypeTypeObjectFromString(eDataType, initialValue);
			case _201Package.WITHHOLDING_TAX_TYPE_TYPE_OBJECT:
				return createWithholdingTaxTypeTypeObjectFromString(eDataType, initialValue);
			case _201Package.WORK_STATUS_TYPE_OBJECT:
				return createWorkStatusTypeObjectFromString(eDataType, initialValue);
			case _201Package.WORK_TYPE_TYPE_OBJECT:
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
			case _201Package.GROUPING_CATEGORY_TYPE:
				return convertGroupingCategoryTypeToString(eDataType, instanceValue);
			case _201Package.INVOICE_STATUS_TYPE:
				return convertInvoiceStatusTypeToString(eDataType, instanceValue);
			case _201Package.INVOICE_TYPE_TYPE:
				return convertInvoiceTypeTypeToString(eDataType, instanceValue);
			case _201Package.MOVEMENT_STATUS_TYPE:
				return convertMovementStatusTypeToString(eDataType, instanceValue);
			case _201Package.MOVEMENT_TYPE_TYPE:
				return convertMovementTypeTypeToString(eDataType, instanceValue);
			case _201Package.PAYMENT_MECHANISM_TYPE:
				return convertPaymentMechanismTypeToString(eDataType, instanceValue);
			case _201Package.PRODUCT_TYPE_TYPE:
				return convertProductTypeTypeToString(eDataType, instanceValue);
			case _201Package.SAFTPT_MOVEMENT_TAX_TYPE:
				return convertSAFTPTMovementTaxTypeToString(eDataType, instanceValue);
			case _201Package.SOURCE_BILLING_TYPE:
				return convertSourceBillingTypeToString(eDataType, instanceValue);
			case _201Package.TAX_ACCOUNTING_BASIS_TYPE:
				return convertTaxAccountingBasisTypeToString(eDataType, instanceValue);
			case _201Package.TAX_TYPE_TYPE:
				return convertTaxTypeTypeToString(eDataType, instanceValue);
			case _201Package.TRANSACTION_TYPE_TYPE:
				return convertTransactionTypeTypeToString(eDataType, instanceValue);
			case _201Package.WITHHOLDING_TAX_TYPE_TYPE:
				return convertWithholdingTaxTypeTypeToString(eDataType, instanceValue);
			case _201Package.WORK_STATUS_TYPE:
				return convertWorkStatusTypeToString(eDataType, instanceValue);
			case _201Package.WORK_TYPE_TYPE:
				return convertWorkTypeTypeToString(eDataType, instanceValue);
			case _201Package.ACCOUNT_ID_TYPE:
				return convertAccountIDTypeToString(eDataType, instanceValue);
			case _201Package.AUDIT_FILE_VERSION_TYPE:
				return convertAuditFileVersionTypeToString(eDataType, instanceValue);
			case _201Package.COMPANY_ID_TYPE:
				return convertCompanyIDTypeToString(eDataType, instanceValue);
			case _201Package.COUNTRY_TYPE:
				return convertCountryTypeToString(eDataType, instanceValue);
			case _201Package.CURRENCY_CODE_TYPE:
				return convertCurrencyCodeTypeToString(eDataType, instanceValue);
			case _201Package.DOCUMENT_NUMBER_TYPE:
				return convertDocumentNumberTypeToString(eDataType, instanceValue);
			case _201Package.EAC_CODE_TYPE:
				return convertEACCodeTypeToString(eDataType, instanceValue);
			case _201Package.FISCAL_YEAR_TYPE:
				return convertFiscalYearTypeToString(eDataType, instanceValue);
			case _201Package.GROUPING_CATEGORY_TYPE_OBJECT:
				return convertGroupingCategoryTypeObjectToString(eDataType, instanceValue);
			case _201Package.INVOICE_NO_TYPE:
				return convertInvoiceNoTypeToString(eDataType, instanceValue);
			case _201Package.INVOICE_STATUS_TYPE_OBJECT:
				return convertInvoiceStatusTypeObjectToString(eDataType, instanceValue);
			case _201Package.INVOICE_TYPE_TYPE_OBJECT:
				return convertInvoiceTypeTypeObjectToString(eDataType, instanceValue);
			case _201Package.MOVEMENT_STATUS_TYPE_OBJECT:
				return convertMovementStatusTypeObjectToString(eDataType, instanceValue);
			case _201Package.MOVEMENT_TYPE_TYPE_OBJECT:
				return convertMovementTypeTypeObjectToString(eDataType, instanceValue);
			case _201Package.PAYMENT_MECHANISM_TYPE_OBJECT:
				return convertPaymentMechanismTypeObjectToString(eDataType, instanceValue);
			case _201Package.PERIOD_TYPE:
				return convertPeriodTypeToString(eDataType, instanceValue);
			case _201Package.POSTAL_CODE_PT:
				return convertPostalCodePTToString(eDataType, instanceValue);
			case _201Package.PRODUCT_TYPE_TYPE_OBJECT:
				return convertProductTypeTypeObjectToString(eDataType, instanceValue);
			case _201Package.SA_FDATE_TIME_TYPE:
				return convertSAFdateTimeTypeToString(eDataType, instanceValue);
			case _201Package.SA_FDATE_TYPE:
				return convertSAFdateTypeToString(eDataType, instanceValue);
			case _201Package.SA_FDECIMAL_TYPE:
				return convertSAFdecimalTypeToString(eDataType, instanceValue);
			case _201Package.SA_FMONETARY_TYPE:
				return convertSAFmonetaryTypeToString(eDataType, instanceValue);
			case _201Package.SAFPT_ACCOUNTING_PERIOD:
				return convertSAFPTAccountingPeriodToString(eDataType, instanceValue);
			case _201Package.SAFPT_DATE_SPAN:
				return convertSAFPTDateSpanToString(eDataType, instanceValue);
			case _201Package.SAFPTGL_ACCOUNT_ID:
				return convertSAFPTGLAccountIDToString(eDataType, instanceValue);
			case _201Package.SAFPT_JOURNAL_ID:
				return convertSAFPTJournalIDToString(eDataType, instanceValue);
			case _201Package.SAFPT_PORTUGUESE_TAX_EXEMPTION:
				return convertSAFPTPortugueseTaxExemptionToString(eDataType, instanceValue);
			case _201Package.SAFPT_PORTUGUESE_VAT_NUMBER:
				return convertSAFPTPortugueseVatNumberToString(eDataType, instanceValue);
			case _201Package.SAFPT_PRODUCT_ID:
				return convertSAFPTProductIDToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX100_CAR:
				return convertSAFPTtextTypeMandatoryMax100CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR:
				return convertSAFPTtextTypeMandatoryMax10CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX172_CAR:
				return convertSAFPTtextTypeMandatoryMax172CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR:
				return convertSAFPTtextTypeMandatoryMax200CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR:
				return convertSAFPTtextTypeMandatoryMax20CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR:
				return convertSAFPTtextTypeMandatoryMax255CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR:
				return convertSAFPTtextTypeMandatoryMax30CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR:
				return convertSAFPTtextTypeMandatoryMax3CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR:
				return convertSAFPTtextTypeMandatoryMax40CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR:
				return convertSAFPTtextTypeMandatoryMax50CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR:
				return convertSAFPTtextTypeMandatoryMax60CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR:
				return convertSAFPTtextTypeMandatoryMax70CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MANDATORY_MAX90_CAR:
				return convertSAFPTtextTypeMandatoryMax90CarToString(eDataType, instanceValue);
			case _201Package.SAFP_TTEXT_TYPE_MAX40_CAR:
				return convertSAFPTtextTypeMax40CarToString(eDataType, instanceValue);
			case _201Package.SAFPT_TRANSACTION_ID:
				return convertSAFPTTransactionIDToString(eDataType, instanceValue);
			case _201Package.SAFTPT_DOC_ARCHIVAL_NUMBER:
				return convertSAFTPTDocArchivalNumberToString(eDataType, instanceValue);
			case _201Package.SAFTPT_MOVEMENT_TAX_CODE:
				return convertSAFTPTMovementTaxCodeToString(eDataType, instanceValue);
			case _201Package.SAFTPT_MOVEMENT_TAX_TYPE_OBJECT:
				return convertSAFTPTMovementTaxTypeObjectToString(eDataType, instanceValue);
			case _201Package.SELF_BILLING_INDICATOR_TYPE:
				return convertSelfBillingIndicatorTypeToString(eDataType, instanceValue);
			case _201Package.SOURCE_BILLING_TYPE_OBJECT:
				return convertSourceBillingTypeObjectToString(eDataType, instanceValue);
			case _201Package.SUPPLIER_COUNTRY:
				return convertSupplierCountryToString(eDataType, instanceValue);
			case _201Package.TAX_ACCOUNTING_BASIS_TYPE_OBJECT:
				return convertTaxAccountingBasisTypeObjectToString(eDataType, instanceValue);
			case _201Package.TAX_CODE_TYPE:
				return convertTaxCodeTypeToString(eDataType, instanceValue);
			case _201Package.TAX_COUNTRY_REGION_TYPE:
				return convertTaxCountryRegionTypeToString(eDataType, instanceValue);
			case _201Package.TAX_TYPE_TYPE_OBJECT:
				return convertTaxTypeTypeObjectToString(eDataType, instanceValue);
			case _201Package.TRANSACTION_TYPE_TYPE_OBJECT:
				return convertTransactionTypeTypeObjectToString(eDataType, instanceValue);
			case _201Package.WITHHOLDING_TAX_TYPE_TYPE_OBJECT:
				return convertWithholdingTaxTypeTypeObjectToString(eDataType, instanceValue);
			case _201Package.WORK_STATUS_TYPE_OBJECT:
				return convertWorkStatusTypeObjectToString(eDataType, instanceValue);
			case _201Package.WORK_TYPE_TYPE_OBJECT:
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
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
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
	public ShippingPointStructure createShippingPointStructure() {
		ShippingPointStructureImpl shippingPointStructure = new ShippingPointStructureImpl();
		return shippingPointStructure;
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
	public SourceBillingType createSourceBillingTypeFromString(EDataType eDataType, String initialValue) {
		SourceBillingType result = SourceBillingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceBillingTypeToString(EDataType eDataType, Object instanceValue) {
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
		return createGroupingCategoryTypeFromString(_201Package.eINSTANCE.getGroupingCategoryType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupingCategoryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGroupingCategoryTypeToString(_201Package.eINSTANCE.getGroupingCategoryType(), instanceValue);
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
		return createInvoiceStatusTypeFromString(_201Package.eINSTANCE.getInvoiceStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInvoiceStatusTypeToString(_201Package.eINSTANCE.getInvoiceStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceTypeType createInvoiceTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInvoiceTypeTypeFromString(_201Package.eINSTANCE.getInvoiceTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInvoiceTypeTypeToString(_201Package.eINSTANCE.getInvoiceTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementStatusType createMovementStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMovementStatusTypeFromString(_201Package.eINSTANCE.getMovementStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMovementStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMovementStatusTypeToString(_201Package.eINSTANCE.getMovementStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementTypeType createMovementTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMovementTypeTypeFromString(_201Package.eINSTANCE.getMovementTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMovementTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMovementTypeTypeToString(_201Package.eINSTANCE.getMovementTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMechanismType createPaymentMechanismTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPaymentMechanismTypeFromString(_201Package.eINSTANCE.getPaymentMechanismType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentMechanismTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPaymentMechanismTypeToString(_201Package.eINSTANCE.getPaymentMechanismType(), instanceValue);
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
		return createProductTypeTypeFromString(_201Package.eINSTANCE.getProductTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProductTypeTypeToString(_201Package.eINSTANCE.getProductTypeType(), instanceValue);
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
		return createSAFTPTMovementTaxTypeFromString(_201Package.eINSTANCE.getSAFTPTMovementTaxType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFTPTMovementTaxTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSAFTPTMovementTaxTypeToString(_201Package.eINSTANCE.getSAFTPTMovementTaxType(), instanceValue);
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
	public SourceBillingType createSourceBillingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSourceBillingTypeFromString(_201Package.eINSTANCE.getSourceBillingType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceBillingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSourceBillingTypeToString(_201Package.eINSTANCE.getSourceBillingType(), instanceValue);
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
		return createTaxAccountingBasisTypeFromString(_201Package.eINSTANCE.getTaxAccountingBasisType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxAccountingBasisTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaxAccountingBasisTypeToString(_201Package.eINSTANCE.getTaxAccountingBasisType(), instanceValue);
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
	public TaxTypeType createTaxTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTaxTypeTypeFromString(_201Package.eINSTANCE.getTaxTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaxTypeTypeToString(_201Package.eINSTANCE.getTaxTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType createTransactionTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransactionTypeTypeFromString(_201Package.eINSTANCE.getTransactionTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransactionTypeTypeToString(_201Package.eINSTANCE.getTransactionTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithholdingTaxTypeType createWithholdingTaxTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWithholdingTaxTypeTypeFromString(_201Package.eINSTANCE.getWithholdingTaxTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWithholdingTaxTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWithholdingTaxTypeTypeToString(_201Package.eINSTANCE.getWithholdingTaxTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkStatusType createWorkStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWorkStatusTypeFromString(_201Package.eINSTANCE.getWorkStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWorkStatusTypeToString(_201Package.eINSTANCE.getWorkStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTypeType createWorkTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWorkTypeTypeFromString(_201Package.eINSTANCE.getWorkTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWorkTypeTypeToString(_201Package.eINSTANCE.getWorkTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _201Package get_201Package() {
		return (_201Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _201Package getPackage() {
		return _201Package.eINSTANCE;
	}

} //_201FactoryImpl
