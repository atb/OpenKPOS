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

import oecd.standard.audit.file.tax.pt1_01_2.*;

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
public class Pt1_01_2FactoryImpl extends EFactoryImpl implements Pt1_01_2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Pt1_01_2Factory init() {
		try {
			Pt1_01_2Factory thePt1_01_2Factory = (Pt1_01_2Factory)EPackage.Registry.INSTANCE.getEFactory("urn:OECD:StandardAuditFile-Tax:PT_1.01_01"); 
			if (thePt1_01_2Factory != null) {
				return thePt1_01_2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Pt1_01_2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pt1_01_2FactoryImpl() {
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
			case Pt1_01_2Package.ADDRESS_STRUCTURE: return createAddressStructure();
			case Pt1_01_2Package.ADDRESS_STRUCTURE_PT: return createAddressStructurePT();
			case Pt1_01_2Package.AUDIT_FILE_TYPE: return createAuditFileType();
			case Pt1_01_2Package.CREDIT_NOTE_TYPE: return createCreditNoteType();
			case Pt1_01_2Package.CURRENCY_TYPE: return createCurrencyType();
			case Pt1_01_2Package.CUSTOMER_TYPE: return createCustomerType();
			case Pt1_01_2Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Pt1_01_2Package.DOCUMENT_TOTALS_TYPE: return createDocumentTotalsType();
			case Pt1_01_2Package.GENERAL_LEDGER_ENTRIES_TYPE: return createGeneralLedgerEntriesType();
			case Pt1_01_2Package.GENERAL_LEDGER_TYPE: return createGeneralLedgerType();
			case Pt1_01_2Package.HEADER_TYPE: return createHeaderType();
			case Pt1_01_2Package.INVOICE_TYPE: return createInvoiceType();
			case Pt1_01_2Package.JOURNAL_TYPE: return createJournalType();
			case Pt1_01_2Package.LINE_TYPE: return createLineType();
			case Pt1_01_2Package.LINE_TYPE1: return createLineType1();
			case Pt1_01_2Package.MASTER_FILES_TYPE: return createMasterFilesType();
			case Pt1_01_2Package.ORDER_REFERENCES_TYPE: return createOrderReferencesType();
			case Pt1_01_2Package.PRODUCT_TYPE: return createProductType();
			case Pt1_01_2Package.REFERENCES_TYPE: return createReferencesType();
			case Pt1_01_2Package.SALES_INVOICES_TYPE: return createSalesInvoicesType();
			case Pt1_01_2Package.SETTLEMENT_TYPE: return createSettlementType();
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE: return createShippingPointStructure();
			case Pt1_01_2Package.SOURCE_DOCUMENTS_TYPE: return createSourceDocumentsType();
			case Pt1_01_2Package.SUPPLIER_ADDRESS_STRUCTURE: return createSupplierAddressStructure();
			case Pt1_01_2Package.SUPPLIER_TYPE: return createSupplierType();
			case Pt1_01_2Package.TAX_TABLE_ENTRY_TYPE: return createTaxTableEntryType();
			case Pt1_01_2Package.TAX_TABLE_TYPE: return createTaxTableType();
			case Pt1_01_2Package.TAX_TYPE: return createTaxType();
			case Pt1_01_2Package.TRANSACTION_TYPE: return createTransactionType();
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
			case Pt1_01_2Package.INVOICE_STATUS_TYPE:
				return createInvoiceStatusTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.INVOICE_TYPE_TYPE:
				return createInvoiceTypeTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.PAYMENT_MECHANISM_TYPE:
				return createPaymentMechanismTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.PRODUCT_TYPE_TYPE:
				return createProductTypeTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.TAX_ACCOUNTING_BASIS_TYPE:
				return createTaxAccountingBasisTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.TAX_TYPE_TYPE:
				return createTaxTypeTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.TRANSACTION_TYPE_TYPE:
				return createTransactionTypeTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.ACCOUNT_ID_TYPE:
				return createAccountIDTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.AUDIT_FILE_VERSION_TYPE:
				return createAuditFileVersionTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.COMPANY_ID_TYPE:
				return createCompanyIDTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.COUNTRY_TYPE:
				return createCountryTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.CURRENCY_CODE_TYPE:
				return createCurrencyCodeTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.FISCAL_YEAR_TYPE:
				return createFiscalYearTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.INVOICE_NO_TYPE:
				return createInvoiceNoTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.INVOICE_STATUS_TYPE_OBJECT:
				return createInvoiceStatusTypeObjectFromString(eDataType, initialValue);
			case Pt1_01_2Package.INVOICE_TYPE_TYPE_OBJECT:
				return createInvoiceTypeTypeObjectFromString(eDataType, initialValue);
			case Pt1_01_2Package.PAYMENT_MECHANISM_TYPE_OBJECT:
				return createPaymentMechanismTypeObjectFromString(eDataType, initialValue);
			case Pt1_01_2Package.PERIOD_TYPE:
				return createPeriodTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.POSTAL_CODE_PT:
				return createPostalCodePTFromString(eDataType, initialValue);
			case Pt1_01_2Package.PRODUCT_TYPE_TYPE_OBJECT:
				return createProductTypeTypeObjectFromString(eDataType, initialValue);
			case Pt1_01_2Package.SA_FDATE_TIME_TYPE:
				return createSAFdateTimeTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.SA_FDATE_TYPE:
				return createSAFdateTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.SA_FDECIMAL_TYPE:
				return createSAFdecimalTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.SA_FMONETARY_TYPE:
				return createSAFmonetaryTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFPT_ACCOUNTING_PERIOD:
				return createSAFPTAccountingPeriodFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFPT_CURRENCY_CODE:
				return createSAFPTCurrencyCodeFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFPT_DATE_SPAN:
				return createSAFPTDateSpanFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFPTGL_ACCOUNT_ID:
				return createSAFPTGLAccountIDFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFPT_PORTUGUESE_VAT_NUMBER:
				return createSAFPTPortugueseVatNumberFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFPT_PRODUCT_ID:
				return createSAFPTProductIDFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR:
				return createSAFPTtextTypeMandatoryMax10CarFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR:
				return createSAFPTtextTypeMandatoryMax200CarFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR:
				return createSAFPTtextTypeMandatoryMax20CarFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR:
				return createSAFPTtextTypeMandatoryMax255CarFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR:
				return createSAFPTtextTypeMandatoryMax30CarFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR:
				return createSAFPTtextTypeMandatoryMax3CarFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR:
				return createSAFPTtextTypeMandatoryMax40CarFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR:
				return createSAFPTtextTypeMandatoryMax50CarFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR:
				return createSAFPTtextTypeMandatoryMax60CarFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR:
				return createSAFPTtextTypeMandatoryMax70CarFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MAX40_CAR:
				return createSAFPTtextTypeMax40CarFromString(eDataType, initialValue);
			case Pt1_01_2Package.SAFPT_TRANSACTION_ID:
				return createSAFPTTransactionIDFromString(eDataType, initialValue);
			case Pt1_01_2Package.SELF_BILLING_INDICATOR_TYPE:
				return createSelfBillingIndicatorTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.SUPPLIER_COUNTRY:
				return createSupplierCountryFromString(eDataType, initialValue);
			case Pt1_01_2Package.TAX_ACCOUNTING_BASIS_TYPE_OBJECT:
				return createTaxAccountingBasisTypeObjectFromString(eDataType, initialValue);
			case Pt1_01_2Package.TAX_CODE_TYPE:
				return createTaxCodeTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.TAX_COUNTRY_REGION_TYPE:
				return createTaxCountryRegionTypeFromString(eDataType, initialValue);
			case Pt1_01_2Package.TAX_TYPE_TYPE_OBJECT:
				return createTaxTypeTypeObjectFromString(eDataType, initialValue);
			case Pt1_01_2Package.TRANSACTION_TYPE_TYPE_OBJECT:
				return createTransactionTypeTypeObjectFromString(eDataType, initialValue);
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
			case Pt1_01_2Package.INVOICE_STATUS_TYPE:
				return convertInvoiceStatusTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.INVOICE_TYPE_TYPE:
				return convertInvoiceTypeTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.PAYMENT_MECHANISM_TYPE:
				return convertPaymentMechanismTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.PRODUCT_TYPE_TYPE:
				return convertProductTypeTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.TAX_ACCOUNTING_BASIS_TYPE:
				return convertTaxAccountingBasisTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.TAX_TYPE_TYPE:
				return convertTaxTypeTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.TRANSACTION_TYPE_TYPE:
				return convertTransactionTypeTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.ACCOUNT_ID_TYPE:
				return convertAccountIDTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.AUDIT_FILE_VERSION_TYPE:
				return convertAuditFileVersionTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.COMPANY_ID_TYPE:
				return convertCompanyIDTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.COUNTRY_TYPE:
				return convertCountryTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.CURRENCY_CODE_TYPE:
				return convertCurrencyCodeTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.FISCAL_YEAR_TYPE:
				return convertFiscalYearTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.INVOICE_NO_TYPE:
				return convertInvoiceNoTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.INVOICE_STATUS_TYPE_OBJECT:
				return convertInvoiceStatusTypeObjectToString(eDataType, instanceValue);
			case Pt1_01_2Package.INVOICE_TYPE_TYPE_OBJECT:
				return convertInvoiceTypeTypeObjectToString(eDataType, instanceValue);
			case Pt1_01_2Package.PAYMENT_MECHANISM_TYPE_OBJECT:
				return convertPaymentMechanismTypeObjectToString(eDataType, instanceValue);
			case Pt1_01_2Package.PERIOD_TYPE:
				return convertPeriodTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.POSTAL_CODE_PT:
				return convertPostalCodePTToString(eDataType, instanceValue);
			case Pt1_01_2Package.PRODUCT_TYPE_TYPE_OBJECT:
				return convertProductTypeTypeObjectToString(eDataType, instanceValue);
			case Pt1_01_2Package.SA_FDATE_TIME_TYPE:
				return convertSAFdateTimeTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.SA_FDATE_TYPE:
				return convertSAFdateTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.SA_FDECIMAL_TYPE:
				return convertSAFdecimalTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.SA_FMONETARY_TYPE:
				return convertSAFmonetaryTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFPT_ACCOUNTING_PERIOD:
				return convertSAFPTAccountingPeriodToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFPT_CURRENCY_CODE:
				return convertSAFPTCurrencyCodeToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFPT_DATE_SPAN:
				return convertSAFPTDateSpanToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFPTGL_ACCOUNT_ID:
				return convertSAFPTGLAccountIDToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFPT_PORTUGUESE_VAT_NUMBER:
				return convertSAFPTPortugueseVatNumberToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFPT_PRODUCT_ID:
				return convertSAFPTProductIDToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR:
				return convertSAFPTtextTypeMandatoryMax10CarToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR:
				return convertSAFPTtextTypeMandatoryMax200CarToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR:
				return convertSAFPTtextTypeMandatoryMax20CarToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR:
				return convertSAFPTtextTypeMandatoryMax255CarToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR:
				return convertSAFPTtextTypeMandatoryMax30CarToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR:
				return convertSAFPTtextTypeMandatoryMax3CarToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR:
				return convertSAFPTtextTypeMandatoryMax40CarToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR:
				return convertSAFPTtextTypeMandatoryMax50CarToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR:
				return convertSAFPTtextTypeMandatoryMax60CarToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR:
				return convertSAFPTtextTypeMandatoryMax70CarToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFP_TTEXT_TYPE_MAX40_CAR:
				return convertSAFPTtextTypeMax40CarToString(eDataType, instanceValue);
			case Pt1_01_2Package.SAFPT_TRANSACTION_ID:
				return convertSAFPTTransactionIDToString(eDataType, instanceValue);
			case Pt1_01_2Package.SELF_BILLING_INDICATOR_TYPE:
				return convertSelfBillingIndicatorTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.SUPPLIER_COUNTRY:
				return convertSupplierCountryToString(eDataType, instanceValue);
			case Pt1_01_2Package.TAX_ACCOUNTING_BASIS_TYPE_OBJECT:
				return convertTaxAccountingBasisTypeObjectToString(eDataType, instanceValue);
			case Pt1_01_2Package.TAX_CODE_TYPE:
				return convertTaxCodeTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.TAX_COUNTRY_REGION_TYPE:
				return convertTaxCountryRegionTypeToString(eDataType, instanceValue);
			case Pt1_01_2Package.TAX_TYPE_TYPE_OBJECT:
				return convertTaxTypeTypeObjectToString(eDataType, instanceValue);
			case Pt1_01_2Package.TRANSACTION_TYPE_TYPE_OBJECT:
				return convertTransactionTypeTypeObjectToString(eDataType, instanceValue);
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
	public CreditNoteType createCreditNoteType() {
		CreditNoteTypeImpl creditNoteType = new CreditNoteTypeImpl();
		return creditNoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyType createCurrencyType() {
		CurrencyTypeImpl currencyType = new CurrencyTypeImpl();
		return currencyType;
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
	public DocumentTotalsType createDocumentTotalsType() {
		DocumentTotalsTypeImpl documentTotalsType = new DocumentTotalsTypeImpl();
		return documentTotalsType;
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
	public MasterFilesType createMasterFilesType() {
		MasterFilesTypeImpl masterFilesType = new MasterFilesTypeImpl();
		return masterFilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderReferencesType createOrderReferencesType() {
		OrderReferencesTypeImpl orderReferencesType = new OrderReferencesTypeImpl();
		return orderReferencesType;
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
	public ReferencesType createReferencesType() {
		ReferencesTypeImpl referencesType = new ReferencesTypeImpl();
		return referencesType;
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
	public SourceDocumentsType createSourceDocumentsType() {
		SourceDocumentsTypeImpl sourceDocumentsType = new SourceDocumentsTypeImpl();
		return sourceDocumentsType;
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
	public TaxType createTaxType() {
		TaxTypeImpl taxType = new TaxTypeImpl();
		return taxType;
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
		return createInvoiceStatusTypeFromString(Pt1_01_2Package.Literals.INVOICE_STATUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInvoiceStatusTypeToString(Pt1_01_2Package.Literals.INVOICE_STATUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceTypeType createInvoiceTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInvoiceTypeTypeFromString(Pt1_01_2Package.Literals.INVOICE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInvoiceTypeTypeToString(Pt1_01_2Package.Literals.INVOICE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMechanismType createPaymentMechanismTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPaymentMechanismTypeFromString(Pt1_01_2Package.Literals.PAYMENT_MECHANISM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentMechanismTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPaymentMechanismTypeToString(Pt1_01_2Package.Literals.PAYMENT_MECHANISM_TYPE, instanceValue);
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
		return createProductTypeTypeFromString(Pt1_01_2Package.Literals.PRODUCT_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProductTypeTypeToString(Pt1_01_2Package.Literals.PRODUCT_TYPE_TYPE, instanceValue);
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
	public String createSAFPTCurrencyCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAFPTCurrencyCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
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
		return createTaxAccountingBasisTypeFromString(Pt1_01_2Package.Literals.TAX_ACCOUNTING_BASIS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxAccountingBasisTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaxAccountingBasisTypeToString(Pt1_01_2Package.Literals.TAX_ACCOUNTING_BASIS_TYPE, instanceValue);
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
		return createTaxTypeTypeFromString(Pt1_01_2Package.Literals.TAX_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaxTypeTypeToString(Pt1_01_2Package.Literals.TAX_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType createTransactionTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransactionTypeTypeFromString(Pt1_01_2Package.Literals.TRANSACTION_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransactionTypeTypeToString(Pt1_01_2Package.Literals.TRANSACTION_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pt1_01_2Package getPt1_01_2Package() {
		return (Pt1_01_2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Pt1_01_2Package getPackage() {
		return Pt1_01_2Package.eINSTANCE;
	}

} //Pt1_01_2FactoryImpl
