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
import oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType;
import oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType;
import oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType;
import oecd.standard.audit.file.tax.pt1_01_2.HeaderType;
import oecd.standard.audit.file.tax.pt1_01_2.InvoiceStatusType;
import oecd.standard.audit.file.tax.pt1_01_2.InvoiceType;
import oecd.standard.audit.file.tax.pt1_01_2.InvoiceTypeType;
import oecd.standard.audit.file.tax.pt1_01_2.JournalType;
import oecd.standard.audit.file.tax.pt1_01_2.LineType;
import oecd.standard.audit.file.tax.pt1_01_2.LineType1;
import oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType;
import oecd.standard.audit.file.tax.pt1_01_2.OrderReferencesType;
import oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType;
import oecd.standard.audit.file.tax.pt1_01_2.ProductType;
import oecd.standard.audit.file.tax.pt1_01_2.ProductTypeType;
import oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Factory;
import oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package;
import oecd.standard.audit.file.tax.pt1_01_2.ReferencesType;
import oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType;
import oecd.standard.audit.file.tax.pt1_01_2.SettlementType;
import oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure;
import oecd.standard.audit.file.tax.pt1_01_2.SourceDocumentsType;
import oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure;
import oecd.standard.audit.file.tax.pt1_01_2.SupplierType;
import oecd.standard.audit.file.tax.pt1_01_2.TaxAccountingBasisType;
import oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType;
import oecd.standard.audit.file.tax.pt1_01_2.TaxTableType;
import oecd.standard.audit.file.tax.pt1_01_2.TaxType;
import oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType;
import oecd.standard.audit.file.tax.pt1_01_2.TransactionType;
import oecd.standard.audit.file.tax.pt1_01_2.TransactionTypeType;

import oecd.standard.audit.file.tax.pt1_01_2.util.Pt1_01_2Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pt1_01_2PackageImpl extends EPackageImpl implements Pt1_01_2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressStructurePTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditFileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditNoteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentTotalsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalLedgerEntriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalLedgerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invoiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterFilesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderReferencesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesInvoicesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settlementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shippingPointStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierAddressStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taxTableEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taxTableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum invoiceStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum invoiceTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentMechanismTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taxAccountingBasisTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taxTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accountIDTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType auditFileVersionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType companyIDTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countryTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currencyCodeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fiscalYearTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invoiceNoTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invoiceStatusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invoiceTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType paymentMechanismTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType periodTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType postalCodePTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType productTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType saFdateTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType saFdateTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType saFdecimalTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType saFmonetaryTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safptAccountingPeriodEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safptCurrencyCodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safptDateSpanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safptglAccountIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safptPortugueseVatNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safptProductIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safpTtextTypeMandatoryMax10CarEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safpTtextTypeMandatoryMax200CarEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safpTtextTypeMandatoryMax20CarEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safpTtextTypeMandatoryMax255CarEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safpTtextTypeMandatoryMax30CarEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safpTtextTypeMandatoryMax3CarEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safpTtextTypeMandatoryMax40CarEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safpTtextTypeMandatoryMax50CarEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safpTtextTypeMandatoryMax60CarEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safpTtextTypeMandatoryMax70CarEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safpTtextTypeMax40CarEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safptTransactionIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType selfBillingIndicatorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType supplierCountryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taxAccountingBasisTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taxCodeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taxCountryRegionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taxTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transactionTypeTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Pt1_01_2PackageImpl() {
		super(eNS_URI, Pt1_01_2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Pt1_01_2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Pt1_01_2Package init() {
		if (isInited) return (Pt1_01_2Package)EPackage.Registry.INSTANCE.getEPackage(Pt1_01_2Package.eNS_URI);

		// Obtain or create and register package
		Pt1_01_2PackageImpl thePt1_01_2Package = (Pt1_01_2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Pt1_01_2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Pt1_01_2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePt1_01_2Package.createPackageContents();

		// Initialize created meta-data
		thePt1_01_2Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePt1_01_2Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Pt1_01_2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePt1_01_2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Pt1_01_2Package.eNS_URI, thePt1_01_2Package);
		return thePt1_01_2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressStructure() {
		return addressStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_BuildingNumber() {
		return (EAttribute)addressStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_StreetName() {
		return (EAttribute)addressStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_AddressDetail() {
		return (EAttribute)addressStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_City() {
		return (EAttribute)addressStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_PostalCode() {
		return (EAttribute)addressStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_Region() {
		return (EAttribute)addressStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_Country() {
		return (EAttribute)addressStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressStructurePT() {
		return addressStructurePTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_BuildingNumber() {
		return (EAttribute)addressStructurePTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_StreetName() {
		return (EAttribute)addressStructurePTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_AddressDetail() {
		return (EAttribute)addressStructurePTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_City() {
		return (EAttribute)addressStructurePTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_PostalCode() {
		return (EAttribute)addressStructurePTEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_Region() {
		return (EAttribute)addressStructurePTEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_Country() {
		return (EAttribute)addressStructurePTEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditFileType() {
		return auditFileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditFileType_Header() {
		return (EReference)auditFileTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditFileType_MasterFiles() {
		return (EReference)auditFileTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditFileType_GeneralLedgerEntries() {
		return (EReference)auditFileTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditFileType_SourceDocuments() {
		return (EReference)auditFileTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreditNoteType() {
		return creditNoteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditNoteType_Reference() {
		return (EAttribute)creditNoteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditNoteType_Reason() {
		return (EAttribute)creditNoteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencyType() {
		return currencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyType_CurrencyCode() {
		return (EAttribute)currencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyType_CurrencyCreditAmount() {
		return (EAttribute)currencyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyType_CurrencyDebitAmount() {
		return (EAttribute)currencyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerType() {
		return customerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_CustomerID() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_AccountID() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_CustomerTaxID() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_CompanyName() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_Contact() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerType_BillingAddress() {
		return (EReference)customerTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerType_ShipToAddress() {
		return (EReference)customerTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_Telephone() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_Fax() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_Email() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_Website() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_SelfBillingIndicator() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AccountDescription() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AccountID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Address() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AddressDetail() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuditFile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AuditFileVersion() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BillingAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BuildingNumber() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BusinessName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_City() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompanyAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CompanyID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CompanyName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Contact() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Country() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CreditAmount() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreditNote() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Currency() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CurrencyCode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CurrencyCreditAmount() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CurrencyDebitAmount() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Customer() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CustomerID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CustomerTaxID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DateCreated() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DebitAmount() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DeliveryDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DeliveryID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Description() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DocArchivalNumber() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Email() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Fax() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FiscalYear() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeneralLedger() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeneralLedgerEntries() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GLPostingDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GrossTotal() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Hash() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HashControl() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Header() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HeaderComment() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InvoiceDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InvoiceNo() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InvoiceStatus() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InvoiceType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_JournalID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LineNumber() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NetTotal() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NumberOfEntries() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OpeningCreditBalance() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OpeningDebitBalance() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OrderDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrderReferences() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OriginatingON() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PaymentMechanism() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Period() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PostalCode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Product() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductCode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductCompanyTaxID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductDescription() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductGroup() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductNumberCode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductVersion() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Quantity() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Reason() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RecordID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Reference() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_References() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Region() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SelfBillingIndicator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Settlement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SettlementAmount() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ShipFrom() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ShipFromAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ShipTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ShipToAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SoftwareCertificateNumber() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SourceDocumentID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SourceDocuments() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SourceID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StreetName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Supplier() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SupplierID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SupplierTaxID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SystemEntryDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tax() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxAccountingBasis() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxAmount() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxCode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxCountryRegion() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxEntity() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxExemptionReason() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxExpirationDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxPayable() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxPercentage() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxPointDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TaxTable() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TaxTableEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxVerificationDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Telephone() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TotalCredit() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TotalDebit() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransactionDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransactionID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransactionType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UnitOfMeasure() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UnitPrice() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Website() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentTotalsType() {
		return documentTotalsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType_TaxPayable() {
		return (EAttribute)documentTotalsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType_NetTotal() {
		return (EAttribute)documentTotalsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType_GrossTotal() {
		return (EAttribute)documentTotalsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentTotalsType_Currency() {
		return (EReference)documentTotalsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentTotalsType_Settlement() {
		return (EReference)documentTotalsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralLedgerEntriesType() {
		return generalLedgerEntriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerEntriesType_NumberOfEntries() {
		return (EAttribute)generalLedgerEntriesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerEntriesType_TotalDebit() {
		return (EAttribute)generalLedgerEntriesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerEntriesType_TotalCredit() {
		return (EAttribute)generalLedgerEntriesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralLedgerEntriesType_Journal() {
		return (EReference)generalLedgerEntriesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralLedgerType() {
		return generalLedgerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_AccountID() {
		return (EAttribute)generalLedgerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_AccountDescription() {
		return (EAttribute)generalLedgerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_OpeningDebitBalance() {
		return (EAttribute)generalLedgerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_OpeningCreditBalance() {
		return (EAttribute)generalLedgerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderType() {
		return headerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_AuditFileVersion() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_CompanyID() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_TaxRegistrationNumber() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_TaxAccountingBasis() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_CompanyName() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_BusinessName() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderType_CompanyAddress() {
		return (EReference)headerTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_FiscalYear() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_StartDate() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_EndDate() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_CurrencyCode() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_DateCreated() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_TaxEntity() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_ProductCompanyTaxID() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_SoftwareCertificateNumber() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_ProductID() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_ProductVersion() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_HeaderComment() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Telephone() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Fax() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Email() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Website() {
		return (EAttribute)headerTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoiceType() {
		return invoiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_InvoiceNo() {
		return (EAttribute)invoiceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_InvoiceStatus() {
		return (EAttribute)invoiceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_Hash() {
		return (EAttribute)invoiceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_HashControl() {
		return (EAttribute)invoiceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_Period() {
		return (EAttribute)invoiceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_InvoiceDate() {
		return (EAttribute)invoiceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_InvoiceType() {
		return (EAttribute)invoiceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_SelfBillingIndicator() {
		return (EAttribute)invoiceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_SystemEntryDate() {
		return (EAttribute)invoiceTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_TransactionID() {
		return (EAttribute)invoiceTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_CustomerID() {
		return (EAttribute)invoiceTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceType_ShipTo() {
		return (EReference)invoiceTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceType_ShipFrom() {
		return (EReference)invoiceTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceType_Line() {
		return (EReference)invoiceTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceType_DocumentTotals() {
		return (EReference)invoiceTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJournalType() {
		return journalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJournalType_JournalID() {
		return (EAttribute)journalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJournalType_Description() {
		return (EAttribute)journalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJournalType_Transaction() {
		return (EReference)journalTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineType() {
		return lineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_LineNumber() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType_OrderReferences() {
		return (EReference)lineTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_ProductCode() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_ProductDescription() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Quantity() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_UnitOfMeasure() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_UnitPrice() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_TaxPointDate() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType_References() {
		return (EReference)lineTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Description() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_DebitAmount() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_CreditAmount() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType_Tax() {
		return (EReference)lineTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_TaxExemptionReason() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_SettlementAmount() {
		return (EAttribute)lineTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineType1() {
		return lineType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_RecordID() {
		return (EAttribute)lineType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_AccountID() {
		return (EAttribute)lineType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_SourceDocumentID() {
		return (EAttribute)lineType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_SystemEntryDate() {
		return (EAttribute)lineType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_Description() {
		return (EAttribute)lineType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_DebitAmount() {
		return (EAttribute)lineType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_CreditAmount() {
		return (EAttribute)lineType1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterFilesType() {
		return masterFilesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterFilesType_Group() {
		return (EAttribute)masterFilesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterFilesType_GeneralLedger() {
		return (EReference)masterFilesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterFilesType_Customer() {
		return (EReference)masterFilesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterFilesType_Supplier() {
		return (EReference)masterFilesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterFilesType_Product() {
		return (EReference)masterFilesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterFilesType_TaxTable() {
		return (EReference)masterFilesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderReferencesType() {
		return orderReferencesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderReferencesType_OriginatingON() {
		return (EAttribute)orderReferencesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderReferencesType_OrderDate() {
		return (EAttribute)orderReferencesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductType() {
		return productTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_ProductType() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_ProductCode() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_ProductGroup() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_ProductDescription() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_ProductNumberCode() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencesType() {
		return referencesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesType_CreditNote() {
		return (EReference)referencesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalesInvoicesType() {
		return salesInvoicesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesInvoicesType_NumberOfEntries() {
		return (EAttribute)salesInvoicesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesInvoicesType_TotalDebit() {
		return (EAttribute)salesInvoicesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesInvoicesType_TotalCredit() {
		return (EAttribute)salesInvoicesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesInvoicesType_Invoice() {
		return (EReference)salesInvoicesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettlementType() {
		return settlementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettlementType_SettlementDiscount() {
		return (EAttribute)settlementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettlementType_SettlementAmount() {
		return (EAttribute)settlementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettlementType_SettlementDate() {
		return (EAttribute)settlementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettlementType_PaymentMechanism() {
		return (EAttribute)settlementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShippingPointStructure() {
		return shippingPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShippingPointStructure_DeliveryID() {
		return (EAttribute)shippingPointStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShippingPointStructure_DeliveryDate() {
		return (EAttribute)shippingPointStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShippingPointStructure_Address() {
		return (EReference)shippingPointStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentsType() {
		return sourceDocumentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentsType_SalesInvoices() {
		return (EReference)sourceDocumentsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplierAddressStructure() {
		return supplierAddressStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_BuildingNumber() {
		return (EAttribute)supplierAddressStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_StreetName() {
		return (EAttribute)supplierAddressStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_AddressDetail() {
		return (EAttribute)supplierAddressStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_City() {
		return (EAttribute)supplierAddressStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_PostalCode() {
		return (EAttribute)supplierAddressStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_Region() {
		return (EAttribute)supplierAddressStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_Country() {
		return (EAttribute)supplierAddressStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplierType() {
		return supplierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_SupplierID() {
		return (EAttribute)supplierTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_AccountID() {
		return (EAttribute)supplierTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_SupplierTaxID() {
		return (EAttribute)supplierTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_CompanyName() {
		return (EAttribute)supplierTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_Contact() {
		return (EAttribute)supplierTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplierType_BillingAddress() {
		return (EReference)supplierTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplierType_ShipFromAddress() {
		return (EReference)supplierTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_Telephone() {
		return (EAttribute)supplierTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_Fax() {
		return (EAttribute)supplierTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_Email() {
		return (EAttribute)supplierTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_Website() {
		return (EAttribute)supplierTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_SelfBillingIndicator() {
		return (EAttribute)supplierTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaxTableEntryType() {
		return taxTableEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxType() {
		return (EAttribute)taxTableEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxCountryRegion() {
		return (EAttribute)taxTableEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxCode() {
		return (EAttribute)taxTableEntryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_Description() {
		return (EAttribute)taxTableEntryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxExpirationDate() {
		return (EAttribute)taxTableEntryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxPercentage() {
		return (EAttribute)taxTableEntryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxAmount() {
		return (EAttribute)taxTableEntryTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaxTableType() {
		return taxTableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaxTableType_TaxTableEntry() {
		return (EReference)taxTableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaxType() {
		return taxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxType_TaxType() {
		return (EAttribute)taxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxType_TaxCountryRegion() {
		return (EAttribute)taxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxType_TaxCode() {
		return (EAttribute)taxTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxType_TaxPercentage() {
		return (EAttribute)taxTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxType_TaxAmount() {
		return (EAttribute)taxTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionType() {
		return transactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_TransactionID() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_Period() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_TransactionDate() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_SourceID() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_Description() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_DocArchivalNumber() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_TransactionType() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_GLPostingDate() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_CustomerID() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_SupplierID() {
		return (EAttribute)transactionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionType_Line() {
		return (EReference)transactionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvoiceStatusType() {
		return invoiceStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvoiceTypeType() {
		return invoiceTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentMechanismType() {
		return paymentMechanismTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductTypeType() {
		return productTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaxAccountingBasisType() {
		return taxAccountingBasisTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaxTypeType() {
		return taxTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransactionTypeType() {
		return transactionTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccountIDType() {
		return accountIDTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuditFileVersionType() {
		return auditFileVersionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompanyIDType() {
		return companyIDTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCountryType() {
		return countryTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurrencyCodeType() {
		return currencyCodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFiscalYearType() {
		return fiscalYearTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvoiceNoType() {
		return invoiceNoTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvoiceStatusTypeObject() {
		return invoiceStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvoiceTypeTypeObject() {
		return invoiceTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPaymentMechanismTypeObject() {
		return paymentMechanismTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPeriodType() {
		return periodTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPostalCodePT() {
		return postalCodePTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProductTypeTypeObject() {
		return productTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFdateTimeType() {
		return saFdateTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFdateType() {
		return saFdateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFdecimalType() {
		return saFdecimalTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFmonetaryType() {
		return saFmonetaryTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTAccountingPeriod() {
		return safptAccountingPeriodEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTCurrencyCode() {
		return safptCurrencyCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTDateSpan() {
		return safptDateSpanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTGLAccountID() {
		return safptglAccountIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTPortugueseVatNumber() {
		return safptPortugueseVatNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTProductID() {
		return safptProductIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax10Car() {
		return safpTtextTypeMandatoryMax10CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax200Car() {
		return safpTtextTypeMandatoryMax200CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax20Car() {
		return safpTtextTypeMandatoryMax20CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax255Car() {
		return safpTtextTypeMandatoryMax255CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax30Car() {
		return safpTtextTypeMandatoryMax30CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax3Car() {
		return safpTtextTypeMandatoryMax3CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax40Car() {
		return safpTtextTypeMandatoryMax40CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax50Car() {
		return safpTtextTypeMandatoryMax50CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax60Car() {
		return safpTtextTypeMandatoryMax60CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax70Car() {
		return safpTtextTypeMandatoryMax70CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMax40Car() {
		return safpTtextTypeMax40CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTTransactionID() {
		return safptTransactionIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSelfBillingIndicatorType() {
		return selfBillingIndicatorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSupplierCountry() {
		return supplierCountryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaxAccountingBasisTypeObject() {
		return taxAccountingBasisTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaxCodeType() {
		return taxCodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaxCountryRegionType() {
		return taxCountryRegionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaxTypeTypeObject() {
		return taxTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransactionTypeTypeObject() {
		return transactionTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pt1_01_2Factory getPt1_01_2Factory() {
		return (Pt1_01_2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addressStructureEClass = createEClass(ADDRESS_STRUCTURE);
		createEAttribute(addressStructureEClass, ADDRESS_STRUCTURE__BUILDING_NUMBER);
		createEAttribute(addressStructureEClass, ADDRESS_STRUCTURE__STREET_NAME);
		createEAttribute(addressStructureEClass, ADDRESS_STRUCTURE__ADDRESS_DETAIL);
		createEAttribute(addressStructureEClass, ADDRESS_STRUCTURE__CITY);
		createEAttribute(addressStructureEClass, ADDRESS_STRUCTURE__POSTAL_CODE);
		createEAttribute(addressStructureEClass, ADDRESS_STRUCTURE__REGION);
		createEAttribute(addressStructureEClass, ADDRESS_STRUCTURE__COUNTRY);

		addressStructurePTEClass = createEClass(ADDRESS_STRUCTURE_PT);
		createEAttribute(addressStructurePTEClass, ADDRESS_STRUCTURE_PT__BUILDING_NUMBER);
		createEAttribute(addressStructurePTEClass, ADDRESS_STRUCTURE_PT__STREET_NAME);
		createEAttribute(addressStructurePTEClass, ADDRESS_STRUCTURE_PT__ADDRESS_DETAIL);
		createEAttribute(addressStructurePTEClass, ADDRESS_STRUCTURE_PT__CITY);
		createEAttribute(addressStructurePTEClass, ADDRESS_STRUCTURE_PT__POSTAL_CODE);
		createEAttribute(addressStructurePTEClass, ADDRESS_STRUCTURE_PT__REGION);
		createEAttribute(addressStructurePTEClass, ADDRESS_STRUCTURE_PT__COUNTRY);

		auditFileTypeEClass = createEClass(AUDIT_FILE_TYPE);
		createEReference(auditFileTypeEClass, AUDIT_FILE_TYPE__HEADER);
		createEReference(auditFileTypeEClass, AUDIT_FILE_TYPE__MASTER_FILES);
		createEReference(auditFileTypeEClass, AUDIT_FILE_TYPE__GENERAL_LEDGER_ENTRIES);
		createEReference(auditFileTypeEClass, AUDIT_FILE_TYPE__SOURCE_DOCUMENTS);

		creditNoteTypeEClass = createEClass(CREDIT_NOTE_TYPE);
		createEAttribute(creditNoteTypeEClass, CREDIT_NOTE_TYPE__REFERENCE);
		createEAttribute(creditNoteTypeEClass, CREDIT_NOTE_TYPE__REASON);

		currencyTypeEClass = createEClass(CURRENCY_TYPE);
		createEAttribute(currencyTypeEClass, CURRENCY_TYPE__CURRENCY_CODE);
		createEAttribute(currencyTypeEClass, CURRENCY_TYPE__CURRENCY_CREDIT_AMOUNT);
		createEAttribute(currencyTypeEClass, CURRENCY_TYPE__CURRENCY_DEBIT_AMOUNT);

		customerTypeEClass = createEClass(CUSTOMER_TYPE);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__CUSTOMER_ID);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__ACCOUNT_ID);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__CUSTOMER_TAX_ID);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__COMPANY_NAME);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__CONTACT);
		createEReference(customerTypeEClass, CUSTOMER_TYPE__BILLING_ADDRESS);
		createEReference(customerTypeEClass, CUSTOMER_TYPE__SHIP_TO_ADDRESS);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__TELEPHONE);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__FAX);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__EMAIL);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__WEBSITE);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__SELF_BILLING_INDICATOR);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACCOUNT_DESCRIPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACCOUNT_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADDRESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ADDRESS_DETAIL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUDIT_FILE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUDIT_FILE_VERSION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BILLING_ADDRESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BUILDING_NUMBER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BUSINESS_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPANY_ADDRESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COMPANY_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COMPANY_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONTACT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COUNTRY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CREDIT_AMOUNT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CREDIT_NOTE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CURRENCY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CURRENCY_CODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CURRENCY_CREDIT_AMOUNT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CURRENCY_DEBIT_AMOUNT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CUSTOMER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CUSTOMER_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CUSTOMER_TAX_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATE_CREATED);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DEBIT_AMOUNT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DELIVERY_DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DELIVERY_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DOC_ARCHIVAL_NUMBER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EMAIL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__END_DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FAX);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FISCAL_YEAR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERAL_LEDGER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERAL_LEDGER_ENTRIES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GL_POSTING_DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GROSS_TOTAL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HASH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HASH_CONTROL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HEADER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HEADER_COMMENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INVOICE_DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INVOICE_NO);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INVOICE_STATUS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INVOICE_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__JOURNAL_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LINE_NUMBER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NET_TOTAL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NUMBER_OF_ENTRIES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__OPENING_CREDIT_BALANCE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__OPENING_DEBIT_BALANCE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORDER_DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORDER_REFERENCES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORIGINATING_ON);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PAYMENT_MECHANISM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PERIOD);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__POSTAL_CODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PRODUCT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRODUCT_CODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRODUCT_COMPANY_TAX_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRODUCT_DESCRIPTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRODUCT_GROUP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRODUCT_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRODUCT_NUMBER_CODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRODUCT_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRODUCT_VERSION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__QUANTITY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REASON);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RECORD_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REGION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SELF_BILLING_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SETTLEMENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SETTLEMENT_AMOUNT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHIP_FROM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHIP_FROM_ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHIP_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHIP_TO_ADDRESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SOFTWARE_CERTIFICATE_NUMBER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SOURCE_DOCUMENT_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOURCE_DOCUMENTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SOURCE_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__START_DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STREET_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUPPLIER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SUPPLIER_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SUPPLIER_TAX_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SYSTEM_ENTRY_DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TAX);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_ACCOUNTING_BASIS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_AMOUNT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_CODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_COUNTRY_REGION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_ENTITY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_EXEMPTION_REASON);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_EXPIRATION_DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_PAYABLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_PERCENTAGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_POINT_DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TAX_TABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TAX_TABLE_ENTRY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TAX_VERIFICATION_DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TELEPHONE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TOTAL_CREDIT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TOTAL_DEBIT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSACTION_DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSACTION_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSACTION_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__UNIT_OF_MEASURE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__UNIT_PRICE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WEBSITE);

		documentTotalsTypeEClass = createEClass(DOCUMENT_TOTALS_TYPE);
		createEAttribute(documentTotalsTypeEClass, DOCUMENT_TOTALS_TYPE__TAX_PAYABLE);
		createEAttribute(documentTotalsTypeEClass, DOCUMENT_TOTALS_TYPE__NET_TOTAL);
		createEAttribute(documentTotalsTypeEClass, DOCUMENT_TOTALS_TYPE__GROSS_TOTAL);
		createEReference(documentTotalsTypeEClass, DOCUMENT_TOTALS_TYPE__CURRENCY);
		createEReference(documentTotalsTypeEClass, DOCUMENT_TOTALS_TYPE__SETTLEMENT);

		generalLedgerEntriesTypeEClass = createEClass(GENERAL_LEDGER_ENTRIES_TYPE);
		createEAttribute(generalLedgerEntriesTypeEClass, GENERAL_LEDGER_ENTRIES_TYPE__NUMBER_OF_ENTRIES);
		createEAttribute(generalLedgerEntriesTypeEClass, GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_DEBIT);
		createEAttribute(generalLedgerEntriesTypeEClass, GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_CREDIT);
		createEReference(generalLedgerEntriesTypeEClass, GENERAL_LEDGER_ENTRIES_TYPE__JOURNAL);

		generalLedgerTypeEClass = createEClass(GENERAL_LEDGER_TYPE);
		createEAttribute(generalLedgerTypeEClass, GENERAL_LEDGER_TYPE__ACCOUNT_ID);
		createEAttribute(generalLedgerTypeEClass, GENERAL_LEDGER_TYPE__ACCOUNT_DESCRIPTION);
		createEAttribute(generalLedgerTypeEClass, GENERAL_LEDGER_TYPE__OPENING_DEBIT_BALANCE);
		createEAttribute(generalLedgerTypeEClass, GENERAL_LEDGER_TYPE__OPENING_CREDIT_BALANCE);

		headerTypeEClass = createEClass(HEADER_TYPE);
		createEAttribute(headerTypeEClass, HEADER_TYPE__AUDIT_FILE_VERSION);
		createEAttribute(headerTypeEClass, HEADER_TYPE__COMPANY_ID);
		createEAttribute(headerTypeEClass, HEADER_TYPE__TAX_REGISTRATION_NUMBER);
		createEAttribute(headerTypeEClass, HEADER_TYPE__TAX_ACCOUNTING_BASIS);
		createEAttribute(headerTypeEClass, HEADER_TYPE__COMPANY_NAME);
		createEAttribute(headerTypeEClass, HEADER_TYPE__BUSINESS_NAME);
		createEReference(headerTypeEClass, HEADER_TYPE__COMPANY_ADDRESS);
		createEAttribute(headerTypeEClass, HEADER_TYPE__FISCAL_YEAR);
		createEAttribute(headerTypeEClass, HEADER_TYPE__START_DATE);
		createEAttribute(headerTypeEClass, HEADER_TYPE__END_DATE);
		createEAttribute(headerTypeEClass, HEADER_TYPE__CURRENCY_CODE);
		createEAttribute(headerTypeEClass, HEADER_TYPE__DATE_CREATED);
		createEAttribute(headerTypeEClass, HEADER_TYPE__TAX_ENTITY);
		createEAttribute(headerTypeEClass, HEADER_TYPE__PRODUCT_COMPANY_TAX_ID);
		createEAttribute(headerTypeEClass, HEADER_TYPE__SOFTWARE_CERTIFICATE_NUMBER);
		createEAttribute(headerTypeEClass, HEADER_TYPE__PRODUCT_ID);
		createEAttribute(headerTypeEClass, HEADER_TYPE__PRODUCT_VERSION);
		createEAttribute(headerTypeEClass, HEADER_TYPE__HEADER_COMMENT);
		createEAttribute(headerTypeEClass, HEADER_TYPE__TELEPHONE);
		createEAttribute(headerTypeEClass, HEADER_TYPE__FAX);
		createEAttribute(headerTypeEClass, HEADER_TYPE__EMAIL);
		createEAttribute(headerTypeEClass, HEADER_TYPE__WEBSITE);

		invoiceTypeEClass = createEClass(INVOICE_TYPE);
		createEAttribute(invoiceTypeEClass, INVOICE_TYPE__INVOICE_NO);
		createEAttribute(invoiceTypeEClass, INVOICE_TYPE__INVOICE_STATUS);
		createEAttribute(invoiceTypeEClass, INVOICE_TYPE__HASH);
		createEAttribute(invoiceTypeEClass, INVOICE_TYPE__HASH_CONTROL);
		createEAttribute(invoiceTypeEClass, INVOICE_TYPE__PERIOD);
		createEAttribute(invoiceTypeEClass, INVOICE_TYPE__INVOICE_DATE);
		createEAttribute(invoiceTypeEClass, INVOICE_TYPE__INVOICE_TYPE);
		createEAttribute(invoiceTypeEClass, INVOICE_TYPE__SELF_BILLING_INDICATOR);
		createEAttribute(invoiceTypeEClass, INVOICE_TYPE__SYSTEM_ENTRY_DATE);
		createEAttribute(invoiceTypeEClass, INVOICE_TYPE__TRANSACTION_ID);
		createEAttribute(invoiceTypeEClass, INVOICE_TYPE__CUSTOMER_ID);
		createEReference(invoiceTypeEClass, INVOICE_TYPE__SHIP_TO);
		createEReference(invoiceTypeEClass, INVOICE_TYPE__SHIP_FROM);
		createEReference(invoiceTypeEClass, INVOICE_TYPE__LINE);
		createEReference(invoiceTypeEClass, INVOICE_TYPE__DOCUMENT_TOTALS);

		journalTypeEClass = createEClass(JOURNAL_TYPE);
		createEAttribute(journalTypeEClass, JOURNAL_TYPE__JOURNAL_ID);
		createEAttribute(journalTypeEClass, JOURNAL_TYPE__DESCRIPTION);
		createEReference(journalTypeEClass, JOURNAL_TYPE__TRANSACTION);

		lineTypeEClass = createEClass(LINE_TYPE);
		createEAttribute(lineTypeEClass, LINE_TYPE__LINE_NUMBER);
		createEReference(lineTypeEClass, LINE_TYPE__ORDER_REFERENCES);
		createEAttribute(lineTypeEClass, LINE_TYPE__PRODUCT_CODE);
		createEAttribute(lineTypeEClass, LINE_TYPE__PRODUCT_DESCRIPTION);
		createEAttribute(lineTypeEClass, LINE_TYPE__QUANTITY);
		createEAttribute(lineTypeEClass, LINE_TYPE__UNIT_OF_MEASURE);
		createEAttribute(lineTypeEClass, LINE_TYPE__UNIT_PRICE);
		createEAttribute(lineTypeEClass, LINE_TYPE__TAX_POINT_DATE);
		createEReference(lineTypeEClass, LINE_TYPE__REFERENCES);
		createEAttribute(lineTypeEClass, LINE_TYPE__DESCRIPTION);
		createEAttribute(lineTypeEClass, LINE_TYPE__DEBIT_AMOUNT);
		createEAttribute(lineTypeEClass, LINE_TYPE__CREDIT_AMOUNT);
		createEReference(lineTypeEClass, LINE_TYPE__TAX);
		createEAttribute(lineTypeEClass, LINE_TYPE__TAX_EXEMPTION_REASON);
		createEAttribute(lineTypeEClass, LINE_TYPE__SETTLEMENT_AMOUNT);

		lineType1EClass = createEClass(LINE_TYPE1);
		createEAttribute(lineType1EClass, LINE_TYPE1__RECORD_ID);
		createEAttribute(lineType1EClass, LINE_TYPE1__ACCOUNT_ID);
		createEAttribute(lineType1EClass, LINE_TYPE1__SOURCE_DOCUMENT_ID);
		createEAttribute(lineType1EClass, LINE_TYPE1__SYSTEM_ENTRY_DATE);
		createEAttribute(lineType1EClass, LINE_TYPE1__DESCRIPTION);
		createEAttribute(lineType1EClass, LINE_TYPE1__DEBIT_AMOUNT);
		createEAttribute(lineType1EClass, LINE_TYPE1__CREDIT_AMOUNT);

		masterFilesTypeEClass = createEClass(MASTER_FILES_TYPE);
		createEAttribute(masterFilesTypeEClass, MASTER_FILES_TYPE__GROUP);
		createEReference(masterFilesTypeEClass, MASTER_FILES_TYPE__GENERAL_LEDGER);
		createEReference(masterFilesTypeEClass, MASTER_FILES_TYPE__CUSTOMER);
		createEReference(masterFilesTypeEClass, MASTER_FILES_TYPE__SUPPLIER);
		createEReference(masterFilesTypeEClass, MASTER_FILES_TYPE__PRODUCT);
		createEReference(masterFilesTypeEClass, MASTER_FILES_TYPE__TAX_TABLE);

		orderReferencesTypeEClass = createEClass(ORDER_REFERENCES_TYPE);
		createEAttribute(orderReferencesTypeEClass, ORDER_REFERENCES_TYPE__ORIGINATING_ON);
		createEAttribute(orderReferencesTypeEClass, ORDER_REFERENCES_TYPE__ORDER_DATE);

		productTypeEClass = createEClass(PRODUCT_TYPE);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__PRODUCT_TYPE);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__PRODUCT_CODE);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__PRODUCT_GROUP);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__PRODUCT_DESCRIPTION);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__PRODUCT_NUMBER_CODE);

		referencesTypeEClass = createEClass(REFERENCES_TYPE);
		createEReference(referencesTypeEClass, REFERENCES_TYPE__CREDIT_NOTE);

		salesInvoicesTypeEClass = createEClass(SALES_INVOICES_TYPE);
		createEAttribute(salesInvoicesTypeEClass, SALES_INVOICES_TYPE__NUMBER_OF_ENTRIES);
		createEAttribute(salesInvoicesTypeEClass, SALES_INVOICES_TYPE__TOTAL_DEBIT);
		createEAttribute(salesInvoicesTypeEClass, SALES_INVOICES_TYPE__TOTAL_CREDIT);
		createEReference(salesInvoicesTypeEClass, SALES_INVOICES_TYPE__INVOICE);

		settlementTypeEClass = createEClass(SETTLEMENT_TYPE);
		createEAttribute(settlementTypeEClass, SETTLEMENT_TYPE__SETTLEMENT_DISCOUNT);
		createEAttribute(settlementTypeEClass, SETTLEMENT_TYPE__SETTLEMENT_AMOUNT);
		createEAttribute(settlementTypeEClass, SETTLEMENT_TYPE__SETTLEMENT_DATE);
		createEAttribute(settlementTypeEClass, SETTLEMENT_TYPE__PAYMENT_MECHANISM);

		shippingPointStructureEClass = createEClass(SHIPPING_POINT_STRUCTURE);
		createEAttribute(shippingPointStructureEClass, SHIPPING_POINT_STRUCTURE__DELIVERY_ID);
		createEAttribute(shippingPointStructureEClass, SHIPPING_POINT_STRUCTURE__DELIVERY_DATE);
		createEReference(shippingPointStructureEClass, SHIPPING_POINT_STRUCTURE__ADDRESS);

		sourceDocumentsTypeEClass = createEClass(SOURCE_DOCUMENTS_TYPE);
		createEReference(sourceDocumentsTypeEClass, SOURCE_DOCUMENTS_TYPE__SALES_INVOICES);

		supplierAddressStructureEClass = createEClass(SUPPLIER_ADDRESS_STRUCTURE);
		createEAttribute(supplierAddressStructureEClass, SUPPLIER_ADDRESS_STRUCTURE__BUILDING_NUMBER);
		createEAttribute(supplierAddressStructureEClass, SUPPLIER_ADDRESS_STRUCTURE__STREET_NAME);
		createEAttribute(supplierAddressStructureEClass, SUPPLIER_ADDRESS_STRUCTURE__ADDRESS_DETAIL);
		createEAttribute(supplierAddressStructureEClass, SUPPLIER_ADDRESS_STRUCTURE__CITY);
		createEAttribute(supplierAddressStructureEClass, SUPPLIER_ADDRESS_STRUCTURE__POSTAL_CODE);
		createEAttribute(supplierAddressStructureEClass, SUPPLIER_ADDRESS_STRUCTURE__REGION);
		createEAttribute(supplierAddressStructureEClass, SUPPLIER_ADDRESS_STRUCTURE__COUNTRY);

		supplierTypeEClass = createEClass(SUPPLIER_TYPE);
		createEAttribute(supplierTypeEClass, SUPPLIER_TYPE__SUPPLIER_ID);
		createEAttribute(supplierTypeEClass, SUPPLIER_TYPE__ACCOUNT_ID);
		createEAttribute(supplierTypeEClass, SUPPLIER_TYPE__SUPPLIER_TAX_ID);
		createEAttribute(supplierTypeEClass, SUPPLIER_TYPE__COMPANY_NAME);
		createEAttribute(supplierTypeEClass, SUPPLIER_TYPE__CONTACT);
		createEReference(supplierTypeEClass, SUPPLIER_TYPE__BILLING_ADDRESS);
		createEReference(supplierTypeEClass, SUPPLIER_TYPE__SHIP_FROM_ADDRESS);
		createEAttribute(supplierTypeEClass, SUPPLIER_TYPE__TELEPHONE);
		createEAttribute(supplierTypeEClass, SUPPLIER_TYPE__FAX);
		createEAttribute(supplierTypeEClass, SUPPLIER_TYPE__EMAIL);
		createEAttribute(supplierTypeEClass, SUPPLIER_TYPE__WEBSITE);
		createEAttribute(supplierTypeEClass, SUPPLIER_TYPE__SELF_BILLING_INDICATOR);

		taxTableEntryTypeEClass = createEClass(TAX_TABLE_ENTRY_TYPE);
		createEAttribute(taxTableEntryTypeEClass, TAX_TABLE_ENTRY_TYPE__TAX_TYPE);
		createEAttribute(taxTableEntryTypeEClass, TAX_TABLE_ENTRY_TYPE__TAX_COUNTRY_REGION);
		createEAttribute(taxTableEntryTypeEClass, TAX_TABLE_ENTRY_TYPE__TAX_CODE);
		createEAttribute(taxTableEntryTypeEClass, TAX_TABLE_ENTRY_TYPE__DESCRIPTION);
		createEAttribute(taxTableEntryTypeEClass, TAX_TABLE_ENTRY_TYPE__TAX_EXPIRATION_DATE);
		createEAttribute(taxTableEntryTypeEClass, TAX_TABLE_ENTRY_TYPE__TAX_PERCENTAGE);
		createEAttribute(taxTableEntryTypeEClass, TAX_TABLE_ENTRY_TYPE__TAX_AMOUNT);

		taxTableTypeEClass = createEClass(TAX_TABLE_TYPE);
		createEReference(taxTableTypeEClass, TAX_TABLE_TYPE__TAX_TABLE_ENTRY);

		taxTypeEClass = createEClass(TAX_TYPE);
		createEAttribute(taxTypeEClass, TAX_TYPE__TAX_TYPE);
		createEAttribute(taxTypeEClass, TAX_TYPE__TAX_COUNTRY_REGION);
		createEAttribute(taxTypeEClass, TAX_TYPE__TAX_CODE);
		createEAttribute(taxTypeEClass, TAX_TYPE__TAX_PERCENTAGE);
		createEAttribute(taxTypeEClass, TAX_TYPE__TAX_AMOUNT);

		transactionTypeEClass = createEClass(TRANSACTION_TYPE);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__TRANSACTION_ID);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__PERIOD);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__TRANSACTION_DATE);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__SOURCE_ID);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__DESCRIPTION);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__DOC_ARCHIVAL_NUMBER);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__TRANSACTION_TYPE);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__GL_POSTING_DATE);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__CUSTOMER_ID);
		createEAttribute(transactionTypeEClass, TRANSACTION_TYPE__SUPPLIER_ID);
		createEReference(transactionTypeEClass, TRANSACTION_TYPE__LINE);

		// Create enums
		invoiceStatusTypeEEnum = createEEnum(INVOICE_STATUS_TYPE);
		invoiceTypeTypeEEnum = createEEnum(INVOICE_TYPE_TYPE);
		paymentMechanismTypeEEnum = createEEnum(PAYMENT_MECHANISM_TYPE);
		productTypeTypeEEnum = createEEnum(PRODUCT_TYPE_TYPE);
		taxAccountingBasisTypeEEnum = createEEnum(TAX_ACCOUNTING_BASIS_TYPE);
		taxTypeTypeEEnum = createEEnum(TAX_TYPE_TYPE);
		transactionTypeTypeEEnum = createEEnum(TRANSACTION_TYPE_TYPE);

		// Create data types
		accountIDTypeEDataType = createEDataType(ACCOUNT_ID_TYPE);
		auditFileVersionTypeEDataType = createEDataType(AUDIT_FILE_VERSION_TYPE);
		companyIDTypeEDataType = createEDataType(COMPANY_ID_TYPE);
		countryTypeEDataType = createEDataType(COUNTRY_TYPE);
		currencyCodeTypeEDataType = createEDataType(CURRENCY_CODE_TYPE);
		fiscalYearTypeEDataType = createEDataType(FISCAL_YEAR_TYPE);
		invoiceNoTypeEDataType = createEDataType(INVOICE_NO_TYPE);
		invoiceStatusTypeObjectEDataType = createEDataType(INVOICE_STATUS_TYPE_OBJECT);
		invoiceTypeTypeObjectEDataType = createEDataType(INVOICE_TYPE_TYPE_OBJECT);
		paymentMechanismTypeObjectEDataType = createEDataType(PAYMENT_MECHANISM_TYPE_OBJECT);
		periodTypeEDataType = createEDataType(PERIOD_TYPE);
		postalCodePTEDataType = createEDataType(POSTAL_CODE_PT);
		productTypeTypeObjectEDataType = createEDataType(PRODUCT_TYPE_TYPE_OBJECT);
		saFdateTimeTypeEDataType = createEDataType(SA_FDATE_TIME_TYPE);
		saFdateTypeEDataType = createEDataType(SA_FDATE_TYPE);
		saFdecimalTypeEDataType = createEDataType(SA_FDECIMAL_TYPE);
		saFmonetaryTypeEDataType = createEDataType(SA_FMONETARY_TYPE);
		safptAccountingPeriodEDataType = createEDataType(SAFPT_ACCOUNTING_PERIOD);
		safptCurrencyCodeEDataType = createEDataType(SAFPT_CURRENCY_CODE);
		safptDateSpanEDataType = createEDataType(SAFPT_DATE_SPAN);
		safptglAccountIDEDataType = createEDataType(SAFPTGL_ACCOUNT_ID);
		safptPortugueseVatNumberEDataType = createEDataType(SAFPT_PORTUGUESE_VAT_NUMBER);
		safptProductIDEDataType = createEDataType(SAFPT_PRODUCT_ID);
		safpTtextTypeMandatoryMax10CarEDataType = createEDataType(SAFP_TTEXT_TYPE_MANDATORY_MAX10_CAR);
		safpTtextTypeMandatoryMax200CarEDataType = createEDataType(SAFP_TTEXT_TYPE_MANDATORY_MAX200_CAR);
		safpTtextTypeMandatoryMax20CarEDataType = createEDataType(SAFP_TTEXT_TYPE_MANDATORY_MAX20_CAR);
		safpTtextTypeMandatoryMax255CarEDataType = createEDataType(SAFP_TTEXT_TYPE_MANDATORY_MAX255_CAR);
		safpTtextTypeMandatoryMax30CarEDataType = createEDataType(SAFP_TTEXT_TYPE_MANDATORY_MAX30_CAR);
		safpTtextTypeMandatoryMax3CarEDataType = createEDataType(SAFP_TTEXT_TYPE_MANDATORY_MAX3_CAR);
		safpTtextTypeMandatoryMax40CarEDataType = createEDataType(SAFP_TTEXT_TYPE_MANDATORY_MAX40_CAR);
		safpTtextTypeMandatoryMax50CarEDataType = createEDataType(SAFP_TTEXT_TYPE_MANDATORY_MAX50_CAR);
		safpTtextTypeMandatoryMax60CarEDataType = createEDataType(SAFP_TTEXT_TYPE_MANDATORY_MAX60_CAR);
		safpTtextTypeMandatoryMax70CarEDataType = createEDataType(SAFP_TTEXT_TYPE_MANDATORY_MAX70_CAR);
		safpTtextTypeMax40CarEDataType = createEDataType(SAFP_TTEXT_TYPE_MAX40_CAR);
		safptTransactionIDEDataType = createEDataType(SAFPT_TRANSACTION_ID);
		selfBillingIndicatorTypeEDataType = createEDataType(SELF_BILLING_INDICATOR_TYPE);
		supplierCountryEDataType = createEDataType(SUPPLIER_COUNTRY);
		taxAccountingBasisTypeObjectEDataType = createEDataType(TAX_ACCOUNTING_BASIS_TYPE_OBJECT);
		taxCodeTypeEDataType = createEDataType(TAX_CODE_TYPE);
		taxCountryRegionTypeEDataType = createEDataType(TAX_COUNTRY_REGION_TYPE);
		taxTypeTypeObjectEDataType = createEDataType(TAX_TYPE_TYPE_OBJECT);
		transactionTypeTypeObjectEDataType = createEDataType(TRANSACTION_TYPE_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(addressStructureEClass, AddressStructure.class, "AddressStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressStructure_BuildingNumber(), this.getSAFPTtextTypeMandatoryMax10Car(), "buildingNumber", null, 0, 1, AddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructure_StreetName(), this.getSAFPTtextTypeMandatoryMax50Car(), "streetName", null, 0, 1, AddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructure_AddressDetail(), this.getSAFPTtextTypeMandatoryMax60Car(), "addressDetail", null, 1, 1, AddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructure_City(), this.getSAFPTtextTypeMandatoryMax50Car(), "city", null, 1, 1, AddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructure_PostalCode(), this.getSAFPTtextTypeMandatoryMax20Car(), "postalCode", null, 1, 1, AddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructure_Region(), this.getSAFPTtextTypeMandatoryMax50Car(), "region", null, 0, 1, AddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructure_Country(), this.getCountryType(), "country", null, 1, 1, AddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressStructurePTEClass, AddressStructurePT.class, "AddressStructurePT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressStructurePT_BuildingNumber(), this.getSAFPTtextTypeMandatoryMax10Car(), "buildingNumber", null, 0, 1, AddressStructurePT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructurePT_StreetName(), this.getSAFPTtextTypeMandatoryMax50Car(), "streetName", null, 0, 1, AddressStructurePT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructurePT_AddressDetail(), this.getSAFPTtextTypeMandatoryMax60Car(), "addressDetail", null, 1, 1, AddressStructurePT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructurePT_City(), this.getSAFPTtextTypeMandatoryMax50Car(), "city", null, 1, 1, AddressStructurePT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructurePT_PostalCode(), this.getPostalCodePT(), "postalCode", null, 1, 1, AddressStructurePT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructurePT_Region(), this.getSAFPTtextTypeMandatoryMax50Car(), "region", null, 0, 1, AddressStructurePT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressStructurePT_Country(), this.getCountryType(), "country", null, 1, 1, AddressStructurePT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditFileTypeEClass, AuditFileType.class, "AuditFileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuditFileType_Header(), this.getHeaderType(), null, "header", null, 1, 1, AuditFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditFileType_MasterFiles(), this.getMasterFilesType(), null, "masterFiles", null, 1, 1, AuditFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditFileType_GeneralLedgerEntries(), this.getGeneralLedgerEntriesType(), null, "generalLedgerEntries", null, 0, 1, AuditFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuditFileType_SourceDocuments(), this.getSourceDocumentsType(), null, "sourceDocuments", null, 0, 1, AuditFileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creditNoteTypeEClass, CreditNoteType.class, "CreditNoteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreditNoteType_Reference(), this.getSAFPTtextTypeMandatoryMax60Car(), "reference", null, 0, 1, CreditNoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditNoteType_Reason(), this.getSAFPTtextTypeMandatoryMax50Car(), "reason", null, 0, 1, CreditNoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencyTypeEClass, CurrencyType.class, "CurrencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrencyType_CurrencyCode(), this.getCurrencyCodeType(), "currencyCode", null, 0, 1, CurrencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyType_CurrencyCreditAmount(), this.getSAFmonetaryType(), "currencyCreditAmount", null, 0, 1, CurrencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyType_CurrencyDebitAmount(), this.getSAFmonetaryType(), "currencyDebitAmount", null, 0, 1, CurrencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerTypeEClass, CustomerType.class, "CustomerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerType_CustomerID(), this.getSAFPTtextTypeMandatoryMax30Car(), "customerID", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerType_AccountID(), this.getAccountIDType(), "accountID", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerType_CustomerTaxID(), this.getSAFPTtextTypeMandatoryMax20Car(), "customerTaxID", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerType_CompanyName(), this.getSAFPTtextTypeMandatoryMax60Car(), "companyName", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerType_Contact(), this.getSAFPTtextTypeMandatoryMax50Car(), "contact", null, 0, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerType_BillingAddress(), this.getAddressStructure(), null, "billingAddress", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerType_ShipToAddress(), this.getAddressStructure(), null, "shipToAddress", null, 0, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerType_Telephone(), this.getSAFPTtextTypeMandatoryMax20Car(), "telephone", null, 0, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerType_Fax(), this.getSAFPTtextTypeMandatoryMax20Car(), "fax", null, 0, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerType_Email(), this.getSAFPTtextTypeMandatoryMax60Car(), "email", null, 0, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerType_Website(), this.getSAFPTtextTypeMandatoryMax60Car(), "website", null, 0, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerType_SelfBillingIndicator(), this.getSelfBillingIndicatorType(), "selfBillingIndicator", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AccountDescription(), this.getSAFPTtextTypeMandatoryMax60Car(), "accountDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AccountID(), this.getAccountIDType(), "accountID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Address(), this.getAddressStructure(), null, "address", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AddressDetail(), this.getSAFPTtextTypeMandatoryMax60Car(), "addressDetail", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AuditFile(), this.getAuditFileType(), null, "auditFile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AuditFileVersion(), this.getAuditFileVersionType(), "auditFileVersion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BillingAddress(), this.getAddressStructure(), null, "billingAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BuildingNumber(), this.getSAFPTtextTypeMandatoryMax10Car(), "buildingNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BusinessName(), this.getSAFPTtextTypeMandatoryMax60Car(), "businessName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_City(), this.getSAFPTtextTypeMandatoryMax50Car(), "city", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CompanyAddress(), this.getAddressStructurePT(), null, "companyAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CompanyID(), this.getCompanyIDType(), "companyID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CompanyName(), this.getSAFPTtextTypeMandatoryMax60Car(), "companyName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Contact(), this.getSAFPTtextTypeMandatoryMax50Car(), "contact", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Country(), this.getCountryType(), "country", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CreditAmount(), this.getSAFmonetaryType(), "creditAmount", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CreditNote(), this.getCreditNoteType(), null, "creditNote", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Currency(), this.getCurrencyType(), null, "currency", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CurrencyCode(), this.getCurrencyCodeType(), "currencyCode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CurrencyCreditAmount(), this.getSAFmonetaryType(), "currencyCreditAmount", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CurrencyDebitAmount(), this.getSAFmonetaryType(), "currencyDebitAmount", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Customer(), this.getCustomerType(), null, "customer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CustomerID(), this.getSAFPTtextTypeMandatoryMax30Car(), "customerID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CustomerTaxID(), this.getSAFPTtextTypeMandatoryMax20Car(), "customerTaxID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DateCreated(), this.getSAFPTDateSpan(), "dateCreated", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DebitAmount(), this.getSAFmonetaryType(), "debitAmount", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DeliveryDate(), this.getSAFdateType(), "deliveryDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DeliveryID(), this.getSAFPTtextTypeMandatoryMax30Car(), "deliveryID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Description(), this.getSAFPTtextTypeMandatoryMax60Car(), "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DocArchivalNumber(), this.getSAFPTtextTypeMandatoryMax20Car(), "docArchivalNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Email(), this.getSAFPTtextTypeMandatoryMax60Car(), "email", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EndDate(), this.getSAFPTDateSpan(), "endDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Fax(), this.getSAFPTtextTypeMandatoryMax20Car(), "fax", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FiscalYear(), this.getFiscalYearType(), "fiscalYear", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GeneralLedger(), this.getGeneralLedgerType(), null, "generalLedger", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GeneralLedgerEntries(), this.getGeneralLedgerEntriesType(), null, "generalLedgerEntries", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_GLPostingDate(), this.getSAFdateTimeType(), "gLPostingDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_GrossTotal(), this.getSAFmonetaryType(), "grossTotal", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Hash(), this.getSAFPTtextTypeMandatoryMax200Car(), "hash", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HashControl(), this.getSAFPTtextTypeMandatoryMax40Car(), "hashControl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Header(), this.getHeaderType(), null, "header", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HeaderComment(), this.getSAFPTtextTypeMandatoryMax255Car(), "headerComment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_InvoiceDate(), this.getSAFdateType(), "invoiceDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_InvoiceNo(), this.getInvoiceNoType(), "invoiceNo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_InvoiceStatus(), this.getInvoiceStatusType(), "invoiceStatus", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_InvoiceType(), this.getInvoiceTypeType(), "invoiceType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_JournalID(), this.getSAFPTtextTypeMandatoryMax30Car(), "journalID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LineNumber(), theXMLTypePackage.getInteger(), "lineNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_NetTotal(), this.getSAFmonetaryType(), "netTotal", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_NumberOfEntries(), theXMLTypePackage.getInteger(), "numberOfEntries", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OpeningCreditBalance(), this.getSAFmonetaryType(), "openingCreditBalance", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OpeningDebitBalance(), this.getSAFmonetaryType(), "openingDebitBalance", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OrderDate(), this.getSAFdateType(), "orderDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OrderReferences(), this.getOrderReferencesType(), null, "orderReferences", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OriginatingON(), this.getSAFPTtextTypeMandatoryMax30Car(), "originatingON", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PaymentMechanism(), this.getPaymentMechanismType(), "paymentMechanism", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Period(), this.getPeriodType(), "period", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PostalCode(), this.getSAFPTtextTypeMandatoryMax20Car(), "postalCode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Product(), this.getProductType(), null, "product", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProductCode(), this.getSAFPTtextTypeMandatoryMax30Car(), "productCode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProductCompanyTaxID(), this.getSAFPTtextTypeMandatoryMax20Car(), "productCompanyTaxID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProductDescription(), this.getSAFPTtextTypeMandatoryMax60Car(), "productDescription", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProductGroup(), this.getSAFPTtextTypeMandatoryMax50Car(), "productGroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProductID(), this.getSAFPTProductID(), "productID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProductNumberCode(), this.getSAFPTtextTypeMandatoryMax50Car(), "productNumberCode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProductType(), this.getProductTypeType(), "productType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProductVersion(), this.getSAFPTtextTypeMandatoryMax30Car(), "productVersion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Quantity(), this.getSAFdecimalType(), "quantity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Reason(), this.getSAFPTtextTypeMandatoryMax50Car(), "reason", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RecordID(), this.getSAFPTtextTypeMandatoryMax10Car(), "recordID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Reference(), this.getSAFPTtextTypeMandatoryMax60Car(), "reference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_References(), this.getReferencesType(), null, "references", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Region(), this.getSAFPTtextTypeMandatoryMax50Car(), "region", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SelfBillingIndicator(), this.getSelfBillingIndicatorType(), "selfBillingIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Settlement(), this.getSettlementType(), null, "settlement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SettlementAmount(), this.getSAFmonetaryType(), "settlementAmount", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ShipFrom(), this.getShippingPointStructure(), null, "shipFrom", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ShipFromAddress(), this.getAddressStructure(), null, "shipFromAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ShipTo(), this.getShippingPointStructure(), null, "shipTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ShipToAddress(), this.getAddressStructure(), null, "shipToAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SoftwareCertificateNumber(), this.getSAFPTtextTypeMandatoryMax20Car(), "softwareCertificateNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SourceDocumentID(), this.getSAFPTtextTypeMandatoryMax30Car(), "sourceDocumentID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SourceDocuments(), this.getSourceDocumentsType(), null, "sourceDocuments", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SourceID(), this.getSAFPTtextTypeMandatoryMax30Car(), "sourceID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StartDate(), this.getSAFPTDateSpan(), "startDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StreetName(), this.getSAFPTtextTypeMandatoryMax50Car(), "streetName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Supplier(), this.getSupplierType(), null, "supplier", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SupplierID(), this.getSAFPTtextTypeMandatoryMax30Car(), "supplierID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SupplierTaxID(), this.getSAFPTtextTypeMandatoryMax20Car(), "supplierTaxID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SystemEntryDate(), this.getSAFdateTimeType(), "systemEntryDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tax(), this.getTaxType(), null, "tax", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxAccountingBasis(), this.getTaxAccountingBasisType(), "taxAccountingBasis", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxAmount(), this.getSAFmonetaryType(), "taxAmount", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxCode(), this.getTaxCodeType(), "taxCode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxCountryRegion(), this.getTaxCountryRegionType(), "taxCountryRegion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxEntity(), this.getSAFPTtextTypeMandatoryMax20Car(), "taxEntity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxExemptionReason(), this.getSAFPTtextTypeMandatoryMax60Car(), "taxExemptionReason", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxExpirationDate(), this.getSAFdateType(), "taxExpirationDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxPayable(), this.getSAFmonetaryType(), "taxPayable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxPercentage(), this.getSAFdecimalType(), "taxPercentage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxPointDate(), this.getSAFdateType(), "taxPointDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TaxTable(), this.getTaxTableType(), null, "taxTable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TaxTableEntry(), this.getTaxTableEntryType(), null, "taxTableEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxType(), this.getTaxTypeType(), "taxType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TaxVerificationDate(), this.getSAFdateType(), "taxVerificationDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Telephone(), this.getSAFPTtextTypeMandatoryMax20Car(), "telephone", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TotalCredit(), this.getSAFmonetaryType(), "totalCredit", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TotalDebit(), this.getSAFmonetaryType(), "totalDebit", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransactionDate(), this.getSAFdateType(), "transactionDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransactionID(), this.getSAFPTTransactionID(), "transactionID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransactionType(), this.getTransactionTypeType(), "transactionType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UnitOfMeasure(), this.getSAFPTtextTypeMandatoryMax20Car(), "unitOfMeasure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UnitPrice(), this.getSAFmonetaryType(), "unitPrice", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Website(), this.getSAFPTtextTypeMandatoryMax60Car(), "website", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentTotalsTypeEClass, DocumentTotalsType.class, "DocumentTotalsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentTotalsType_TaxPayable(), this.getSAFmonetaryType(), "taxPayable", null, 1, 1, DocumentTotalsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentTotalsType_NetTotal(), this.getSAFmonetaryType(), "netTotal", null, 1, 1, DocumentTotalsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentTotalsType_GrossTotal(), this.getSAFmonetaryType(), "grossTotal", null, 1, 1, DocumentTotalsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentTotalsType_Currency(), this.getCurrencyType(), null, "currency", null, 0, 1, DocumentTotalsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentTotalsType_Settlement(), this.getSettlementType(), null, "settlement", null, 0, 1, DocumentTotalsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalLedgerEntriesTypeEClass, GeneralLedgerEntriesType.class, "GeneralLedgerEntriesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralLedgerEntriesType_NumberOfEntries(), theXMLTypePackage.getInteger(), "numberOfEntries", null, 1, 1, GeneralLedgerEntriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralLedgerEntriesType_TotalDebit(), this.getSAFmonetaryType(), "totalDebit", null, 1, 1, GeneralLedgerEntriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralLedgerEntriesType_TotalCredit(), this.getSAFmonetaryType(), "totalCredit", null, 1, 1, GeneralLedgerEntriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralLedgerEntriesType_Journal(), this.getJournalType(), null, "journal", null, 0, -1, GeneralLedgerEntriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalLedgerTypeEClass, GeneralLedgerType.class, "GeneralLedgerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralLedgerType_AccountID(), this.getSAFPTGLAccountID(), "accountID", null, 1, 1, GeneralLedgerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralLedgerType_AccountDescription(), this.getSAFPTtextTypeMandatoryMax60Car(), "accountDescription", null, 1, 1, GeneralLedgerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralLedgerType_OpeningDebitBalance(), this.getSAFmonetaryType(), "openingDebitBalance", null, 1, 1, GeneralLedgerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralLedgerType_OpeningCreditBalance(), this.getSAFmonetaryType(), "openingCreditBalance", null, 1, 1, GeneralLedgerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerTypeEClass, HeaderType.class, "HeaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeaderType_AuditFileVersion(), this.getAuditFileVersionType(), "auditFileVersion", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_CompanyID(), this.getCompanyIDType(), "companyID", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_TaxRegistrationNumber(), this.getSAFPTPortugueseVatNumber(), "taxRegistrationNumber", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_TaxAccountingBasis(), this.getTaxAccountingBasisType(), "taxAccountingBasis", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_CompanyName(), this.getSAFPTtextTypeMandatoryMax60Car(), "companyName", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_BusinessName(), this.getSAFPTtextTypeMandatoryMax60Car(), "businessName", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderType_CompanyAddress(), this.getAddressStructurePT(), null, "companyAddress", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_FiscalYear(), this.getFiscalYearType(), "fiscalYear", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_StartDate(), this.getSAFPTDateSpan(), "startDate", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_EndDate(), this.getSAFPTDateSpan(), "endDate", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_CurrencyCode(), this.getSAFPTCurrencyCode(), "currencyCode", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_DateCreated(), this.getSAFPTDateSpan(), "dateCreated", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_TaxEntity(), this.getSAFPTtextTypeMandatoryMax20Car(), "taxEntity", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_ProductCompanyTaxID(), this.getSAFPTtextTypeMandatoryMax20Car(), "productCompanyTaxID", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_SoftwareCertificateNumber(), this.getSAFPTtextTypeMandatoryMax20Car(), "softwareCertificateNumber", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_ProductID(), this.getSAFPTProductID(), "productID", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_ProductVersion(), this.getSAFPTtextTypeMandatoryMax30Car(), "productVersion", null, 1, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_HeaderComment(), this.getSAFPTtextTypeMandatoryMax255Car(), "headerComment", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_Telephone(), this.getSAFPTtextTypeMandatoryMax20Car(), "telephone", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_Fax(), this.getSAFPTtextTypeMandatoryMax20Car(), "fax", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_Email(), this.getSAFPTtextTypeMandatoryMax60Car(), "email", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderType_Website(), this.getSAFPTtextTypeMandatoryMax60Car(), "website", null, 0, 1, HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invoiceTypeEClass, InvoiceType.class, "InvoiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvoiceType_InvoiceNo(), this.getInvoiceNoType(), "invoiceNo", null, 1, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoiceType_InvoiceStatus(), this.getInvoiceStatusType(), "invoiceStatus", null, 1, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoiceType_Hash(), this.getSAFPTtextTypeMandatoryMax200Car(), "hash", null, 1, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoiceType_HashControl(), this.getSAFPTtextTypeMandatoryMax40Car(), "hashControl", null, 0, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoiceType_Period(), this.getPeriodType(), "period", null, 0, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoiceType_InvoiceDate(), this.getSAFdateType(), "invoiceDate", null, 1, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoiceType_InvoiceType(), this.getInvoiceTypeType(), "invoiceType", null, 1, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoiceType_SelfBillingIndicator(), this.getSelfBillingIndicatorType(), "selfBillingIndicator", null, 1, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoiceType_SystemEntryDate(), this.getSAFdateTimeType(), "systemEntryDate", null, 1, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoiceType_TransactionID(), this.getSAFPTTransactionID(), "transactionID", null, 0, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoiceType_CustomerID(), this.getSAFPTtextTypeMandatoryMax30Car(), "customerID", null, 1, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoiceType_ShipTo(), this.getShippingPointStructure(), null, "shipTo", null, 0, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoiceType_ShipFrom(), this.getShippingPointStructure(), null, "shipFrom", null, 0, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoiceType_Line(), this.getLineType(), null, "line", null, 1, -1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoiceType_DocumentTotals(), this.getDocumentTotalsType(), null, "documentTotals", null, 1, 1, InvoiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journalTypeEClass, JournalType.class, "JournalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJournalType_JournalID(), this.getSAFPTtextTypeMandatoryMax30Car(), "journalID", null, 1, 1, JournalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJournalType_Description(), this.getSAFPTtextTypeMandatoryMax60Car(), "description", null, 1, 1, JournalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJournalType_Transaction(), this.getTransactionType(), null, "transaction", null, 0, -1, JournalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineTypeEClass, LineType.class, "LineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineType_LineNumber(), theXMLTypePackage.getInteger(), "lineNumber", null, 1, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineType_OrderReferences(), this.getOrderReferencesType(), null, "orderReferences", null, 0, -1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType_ProductCode(), this.getSAFPTtextTypeMandatoryMax30Car(), "productCode", null, 1, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType_ProductDescription(), this.getSAFPTtextTypeMandatoryMax60Car(), "productDescription", null, 1, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType_Quantity(), this.getSAFdecimalType(), "quantity", null, 1, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType_UnitOfMeasure(), this.getSAFPTtextTypeMandatoryMax20Car(), "unitOfMeasure", null, 1, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType_UnitPrice(), this.getSAFmonetaryType(), "unitPrice", null, 1, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType_TaxPointDate(), this.getSAFdateType(), "taxPointDate", null, 1, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineType_References(), this.getReferencesType(), null, "references", null, 0, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType_Description(), this.getSAFPTtextTypeMandatoryMax60Car(), "description", null, 1, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType_DebitAmount(), this.getSAFmonetaryType(), "debitAmount", null, 0, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType_CreditAmount(), this.getSAFmonetaryType(), "creditAmount", null, 0, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineType_Tax(), this.getTaxType(), null, "tax", null, 0, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType_TaxExemptionReason(), this.getSAFPTtextTypeMandatoryMax60Car(), "taxExemptionReason", null, 0, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType_SettlementAmount(), this.getSAFmonetaryType(), "settlementAmount", null, 0, 1, LineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineType1EClass, LineType1.class, "LineType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineType1_RecordID(), this.getSAFPTtextTypeMandatoryMax10Car(), "recordID", null, 1, 1, LineType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType1_AccountID(), this.getSAFPTGLAccountID(), "accountID", null, 1, 1, LineType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType1_SourceDocumentID(), this.getSAFPTtextTypeMandatoryMax30Car(), "sourceDocumentID", null, 0, 1, LineType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType1_SystemEntryDate(), this.getSAFdateTimeType(), "systemEntryDate", null, 1, 1, LineType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType1_Description(), this.getSAFPTtextTypeMandatoryMax60Car(), "description", null, 1, 1, LineType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType1_DebitAmount(), this.getSAFmonetaryType(), "debitAmount", null, 0, 1, LineType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineType1_CreditAmount(), this.getSAFmonetaryType(), "creditAmount", null, 0, 1, LineType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(masterFilesTypeEClass, MasterFilesType.class, "MasterFilesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMasterFilesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, MasterFilesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterFilesType_GeneralLedger(), this.getGeneralLedgerType(), null, "generalLedger", null, 0, -1, MasterFilesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMasterFilesType_Customer(), this.getCustomerType(), null, "customer", null, 0, -1, MasterFilesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMasterFilesType_Supplier(), this.getSupplierType(), null, "supplier", null, 0, -1, MasterFilesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMasterFilesType_Product(), this.getProductType(), null, "product", null, 0, -1, MasterFilesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMasterFilesType_TaxTable(), this.getTaxTableType(), null, "taxTable", null, 0, -1, MasterFilesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(orderReferencesTypeEClass, OrderReferencesType.class, "OrderReferencesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderReferencesType_OriginatingON(), this.getSAFPTtextTypeMandatoryMax30Car(), "originatingON", null, 0, 1, OrderReferencesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderReferencesType_OrderDate(), this.getSAFdateType(), "orderDate", null, 0, 1, OrderReferencesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productTypeEClass, ProductType.class, "ProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductType_ProductType(), this.getProductTypeType(), "productType", null, 1, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_ProductCode(), this.getSAFPTtextTypeMandatoryMax30Car(), "productCode", null, 1, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_ProductGroup(), this.getSAFPTtextTypeMandatoryMax50Car(), "productGroup", null, 0, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_ProductDescription(), this.getSAFPTtextTypeMandatoryMax60Car(), "productDescription", null, 1, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_ProductNumberCode(), this.getSAFPTtextTypeMandatoryMax50Car(), "productNumberCode", null, 1, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencesTypeEClass, ReferencesType.class, "ReferencesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencesType_CreditNote(), this.getCreditNoteType(), null, "creditNote", null, 0, 1, ReferencesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesInvoicesTypeEClass, SalesInvoicesType.class, "SalesInvoicesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesInvoicesType_NumberOfEntries(), theXMLTypePackage.getInteger(), "numberOfEntries", null, 1, 1, SalesInvoicesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesInvoicesType_TotalDebit(), this.getSAFmonetaryType(), "totalDebit", null, 1, 1, SalesInvoicesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesInvoicesType_TotalCredit(), this.getSAFmonetaryType(), "totalCredit", null, 1, 1, SalesInvoicesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSalesInvoicesType_Invoice(), this.getInvoiceType(), null, "invoice", null, 1, -1, SalesInvoicesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settlementTypeEClass, SettlementType.class, "SettlementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSettlementType_SettlementDiscount(), this.getSAFPTtextTypeMandatoryMax30Car(), "settlementDiscount", null, 0, 1, SettlementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettlementType_SettlementAmount(), this.getSAFmonetaryType(), "settlementAmount", null, 0, 1, SettlementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettlementType_SettlementDate(), this.getSAFdateType(), "settlementDate", null, 0, 1, SettlementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettlementType_PaymentMechanism(), this.getPaymentMechanismType(), "paymentMechanism", null, 0, 1, SettlementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shippingPointStructureEClass, ShippingPointStructure.class, "ShippingPointStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShippingPointStructure_DeliveryID(), this.getSAFPTtextTypeMandatoryMax30Car(), "deliveryID", null, 0, 1, ShippingPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShippingPointStructure_DeliveryDate(), this.getSAFdateType(), "deliveryDate", null, 0, 1, ShippingPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShippingPointStructure_Address(), this.getAddressStructure(), null, "address", null, 0, 1, ShippingPointStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceDocumentsTypeEClass, SourceDocumentsType.class, "SourceDocumentsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceDocumentsType_SalesInvoices(), this.getSalesInvoicesType(), null, "salesInvoices", null, 0, 1, SourceDocumentsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplierAddressStructureEClass, SupplierAddressStructure.class, "SupplierAddressStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupplierAddressStructure_BuildingNumber(), this.getSAFPTtextTypeMandatoryMax10Car(), "buildingNumber", null, 0, 1, SupplierAddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierAddressStructure_StreetName(), this.getSAFPTtextTypeMandatoryMax50Car(), "streetName", null, 0, 1, SupplierAddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierAddressStructure_AddressDetail(), this.getSAFPTtextTypeMandatoryMax60Car(), "addressDetail", null, 1, 1, SupplierAddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierAddressStructure_City(), this.getSAFPTtextTypeMandatoryMax50Car(), "city", null, 1, 1, SupplierAddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierAddressStructure_PostalCode(), this.getSAFPTtextTypeMandatoryMax20Car(), "postalCode", null, 1, 1, SupplierAddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierAddressStructure_Region(), this.getSAFPTtextTypeMandatoryMax50Car(), "region", null, 0, 1, SupplierAddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierAddressStructure_Country(), this.getSupplierCountry(), "country", null, 1, 1, SupplierAddressStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplierTypeEClass, SupplierType.class, "SupplierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupplierType_SupplierID(), this.getSAFPTtextTypeMandatoryMax30Car(), "supplierID", null, 1, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierType_AccountID(), this.getAccountIDType(), "accountID", null, 1, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierType_SupplierTaxID(), this.getSAFPTtextTypeMandatoryMax20Car(), "supplierTaxID", null, 1, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierType_CompanyName(), this.getSAFPTtextTypeMandatoryMax60Car(), "companyName", null, 1, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierType_Contact(), this.getSAFPTtextTypeMandatoryMax50Car(), "contact", null, 0, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupplierType_BillingAddress(), this.getSupplierAddressStructure(), null, "billingAddress", null, 1, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupplierType_ShipFromAddress(), this.getSupplierAddressStructure(), null, "shipFromAddress", null, 0, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierType_Telephone(), this.getSAFPTtextTypeMandatoryMax20Car(), "telephone", null, 0, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierType_Fax(), this.getSAFPTtextTypeMandatoryMax20Car(), "fax", null, 0, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierType_Email(), this.getSAFPTtextTypeMandatoryMax60Car(), "email", null, 0, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierType_Website(), this.getSAFPTtextTypeMandatoryMax60Car(), "website", null, 0, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierType_SelfBillingIndicator(), this.getSelfBillingIndicatorType(), "selfBillingIndicator", null, 1, 1, SupplierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taxTableEntryTypeEClass, TaxTableEntryType.class, "TaxTableEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaxTableEntryType_TaxType(), this.getTaxTypeType(), "taxType", null, 1, 1, TaxTableEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxTableEntryType_TaxCountryRegion(), this.getTaxCountryRegionType(), "taxCountryRegion", null, 1, 1, TaxTableEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxTableEntryType_TaxCode(), this.getTaxCodeType(), "taxCode", null, 1, 1, TaxTableEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxTableEntryType_Description(), this.getSAFPTtextTypeMandatoryMax255Car(), "description", null, 1, 1, TaxTableEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxTableEntryType_TaxExpirationDate(), this.getSAFdateType(), "taxExpirationDate", null, 0, 1, TaxTableEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxTableEntryType_TaxPercentage(), this.getSAFdecimalType(), "taxPercentage", null, 0, 1, TaxTableEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxTableEntryType_TaxAmount(), this.getSAFmonetaryType(), "taxAmount", null, 0, 1, TaxTableEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taxTableTypeEClass, TaxTableType.class, "TaxTableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaxTableType_TaxTableEntry(), this.getTaxTableEntryType(), null, "taxTableEntry", null, 1, -1, TaxTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taxTypeEClass, TaxType.class, "TaxType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaxType_TaxType(), this.getTaxTypeType(), "taxType", null, 1, 1, TaxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxType_TaxCountryRegion(), this.getTaxCountryRegionType(), "taxCountryRegion", null, 1, 1, TaxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxType_TaxCode(), this.getTaxCodeType(), "taxCode", null, 1, 1, TaxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxType_TaxPercentage(), this.getSAFdecimalType(), "taxPercentage", null, 0, 1, TaxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxType_TaxAmount(), this.getSAFmonetaryType(), "taxAmount", null, 0, 1, TaxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionTypeEClass, TransactionType.class, "TransactionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransactionType_TransactionID(), this.getSAFPTTransactionID(), "transactionID", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_Period(), this.getSAFPTAccountingPeriod(), "period", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_TransactionDate(), this.getSAFdateType(), "transactionDate", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_SourceID(), this.getSAFPTtextTypeMandatoryMax30Car(), "sourceID", null, 0, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_Description(), this.getSAFPTtextTypeMandatoryMax60Car(), "description", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_DocArchivalNumber(), this.getSAFPTtextTypeMandatoryMax20Car(), "docArchivalNumber", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_TransactionType(), this.getTransactionTypeType(), "transactionType", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_GLPostingDate(), this.getSAFdateTimeType(), "gLPostingDate", null, 1, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_CustomerID(), this.getSAFPTtextTypeMandatoryMax30Car(), "customerID", null, 0, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionType_SupplierID(), this.getSAFPTtextTypeMandatoryMax30Car(), "supplierID", null, 0, 1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionType_Line(), this.getLineType1(), null, "line", null, 1, -1, TransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(invoiceStatusTypeEEnum, InvoiceStatusType.class, "InvoiceStatusType");
		addEEnumLiteral(invoiceStatusTypeEEnum, InvoiceStatusType.N);
		addEEnumLiteral(invoiceStatusTypeEEnum, InvoiceStatusType.S);
		addEEnumLiteral(invoiceStatusTypeEEnum, InvoiceStatusType.A);
		addEEnumLiteral(invoiceStatusTypeEEnum, InvoiceStatusType.F);

		initEEnum(invoiceTypeTypeEEnum, InvoiceTypeType.class, "InvoiceTypeType");
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.FT);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.FS);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.ND);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.NC);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.VD);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.TV);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.TD);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.AA);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.DA);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.RP);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.RE);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.CS);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.LD);
		addEEnumLiteral(invoiceTypeTypeEEnum, InvoiceTypeType.RA);

		initEEnum(paymentMechanismTypeEEnum, PaymentMechanismType.class, "PaymentMechanismType");
		addEEnumLiteral(paymentMechanismTypeEEnum, PaymentMechanismType.NU);
		addEEnumLiteral(paymentMechanismTypeEEnum, PaymentMechanismType.CH);
		addEEnumLiteral(paymentMechanismTypeEEnum, PaymentMechanismType.CD);
		addEEnumLiteral(paymentMechanismTypeEEnum, PaymentMechanismType.CC);
		addEEnumLiteral(paymentMechanismTypeEEnum, PaymentMechanismType.TB);
		addEEnumLiteral(paymentMechanismTypeEEnum, PaymentMechanismType.TR);

		initEEnum(productTypeTypeEEnum, ProductTypeType.class, "ProductTypeType");
		addEEnumLiteral(productTypeTypeEEnum, ProductTypeType.P);
		addEEnumLiteral(productTypeTypeEEnum, ProductTypeType.S);
		addEEnumLiteral(productTypeTypeEEnum, ProductTypeType.O);
		addEEnumLiteral(productTypeTypeEEnum, ProductTypeType.I);

		initEEnum(taxAccountingBasisTypeEEnum, TaxAccountingBasisType.class, "TaxAccountingBasisType");
		addEEnumLiteral(taxAccountingBasisTypeEEnum, TaxAccountingBasisType.C);
		addEEnumLiteral(taxAccountingBasisTypeEEnum, TaxAccountingBasisType.F);
		addEEnumLiteral(taxAccountingBasisTypeEEnum, TaxAccountingBasisType.I);
		addEEnumLiteral(taxAccountingBasisTypeEEnum, TaxAccountingBasisType.S);
		addEEnumLiteral(taxAccountingBasisTypeEEnum, TaxAccountingBasisType.P);

		initEEnum(taxTypeTypeEEnum, TaxTypeType.class, "TaxTypeType");
		addEEnumLiteral(taxTypeTypeEEnum, TaxTypeType.IVA);
		addEEnumLiteral(taxTypeTypeEEnum, TaxTypeType.IS);

		initEEnum(transactionTypeTypeEEnum, TransactionTypeType.class, "TransactionTypeType");
		addEEnumLiteral(transactionTypeTypeEEnum, TransactionTypeType.N);
		addEEnumLiteral(transactionTypeTypeEEnum, TransactionTypeType.R);
		addEEnumLiteral(transactionTypeTypeEEnum, TransactionTypeType.A);
		addEEnumLiteral(transactionTypeTypeEEnum, TransactionTypeType.J);

		// Initialize data types
		initEDataType(accountIDTypeEDataType, String.class, "AccountIDType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(auditFileVersionTypeEDataType, String.class, "AuditFileVersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(companyIDTypeEDataType, String.class, "CompanyIDType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(countryTypeEDataType, String.class, "CountryType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(currencyCodeTypeEDataType, String.class, "CurrencyCodeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fiscalYearTypeEDataType, BigInteger.class, "FiscalYearType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invoiceNoTypeEDataType, String.class, "InvoiceNoType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invoiceStatusTypeObjectEDataType, InvoiceStatusType.class, "InvoiceStatusTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invoiceTypeTypeObjectEDataType, InvoiceTypeType.class, "InvoiceTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(paymentMechanismTypeObjectEDataType, PaymentMechanismType.class, "PaymentMechanismTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(periodTypeEDataType, BigInteger.class, "PeriodType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(postalCodePTEDataType, String.class, "PostalCodePT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(productTypeTypeObjectEDataType, ProductTypeType.class, "ProductTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(saFdateTimeTypeEDataType, XMLGregorianCalendar.class, "SAFdateTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(saFdateTypeEDataType, XMLGregorianCalendar.class, "SAFdateType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(saFdecimalTypeEDataType, BigDecimal.class, "SAFdecimalType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(saFmonetaryTypeEDataType, BigDecimal.class, "SAFmonetaryType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safptAccountingPeriodEDataType, BigInteger.class, "SAFPTAccountingPeriod", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safptCurrencyCodeEDataType, String.class, "SAFPTCurrencyCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safptDateSpanEDataType, XMLGregorianCalendar.class, "SAFPTDateSpan", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safptglAccountIDEDataType, String.class, "SAFPTGLAccountID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safptPortugueseVatNumberEDataType, BigInteger.class, "SAFPTPortugueseVatNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safptProductIDEDataType, String.class, "SAFPTProductID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safpTtextTypeMandatoryMax10CarEDataType, String.class, "SAFPTtextTypeMandatoryMax10Car", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safpTtextTypeMandatoryMax200CarEDataType, String.class, "SAFPTtextTypeMandatoryMax200Car", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safpTtextTypeMandatoryMax20CarEDataType, String.class, "SAFPTtextTypeMandatoryMax20Car", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safpTtextTypeMandatoryMax255CarEDataType, String.class, "SAFPTtextTypeMandatoryMax255Car", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safpTtextTypeMandatoryMax30CarEDataType, String.class, "SAFPTtextTypeMandatoryMax30Car", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safpTtextTypeMandatoryMax3CarEDataType, String.class, "SAFPTtextTypeMandatoryMax3Car", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safpTtextTypeMandatoryMax40CarEDataType, String.class, "SAFPTtextTypeMandatoryMax40Car", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safpTtextTypeMandatoryMax50CarEDataType, String.class, "SAFPTtextTypeMandatoryMax50Car", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safpTtextTypeMandatoryMax60CarEDataType, String.class, "SAFPTtextTypeMandatoryMax60Car", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safpTtextTypeMandatoryMax70CarEDataType, String.class, "SAFPTtextTypeMandatoryMax70Car", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safpTtextTypeMax40CarEDataType, String.class, "SAFPTtextTypeMax40Car", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(safptTransactionIDEDataType, String.class, "SAFPTTransactionID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(selfBillingIndicatorTypeEDataType, BigInteger.class, "SelfBillingIndicatorType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(supplierCountryEDataType, String.class, "SupplierCountry", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(taxAccountingBasisTypeObjectEDataType, TaxAccountingBasisType.class, "TaxAccountingBasisTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(taxCodeTypeEDataType, String.class, "TaxCodeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(taxCountryRegionTypeEDataType, String.class, "TaxCountryRegionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(taxTypeTypeObjectEDataType, TaxTypeType.class, "TaxTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transactionTypeTypeObjectEDataType, TransactionTypeType.class, "TransactionTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (accountIDTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "AccountID_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "30",
			 "pattern", "(([1-8][0-9a-zA-Z]*)|Desconhecido)"
		   });		
		addAnnotation
		  (addressStructureEClass, 
		   source, 
		   new String[] {
			 "name", "AddressStructure",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddressStructure_BuildingNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BuildingNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructure_StreetName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StreetName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructure_AddressDetail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddressDetail",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructure_City(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "City",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructure_PostalCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PostalCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructure_Region(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Region",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructure_Country(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (addressStructurePTEClass, 
		   source, 
		   new String[] {
			 "name", "AddressStructurePT",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddressStructurePT_BuildingNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BuildingNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructurePT_StreetName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StreetName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructurePT_AddressDetail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddressDetail",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructurePT_City(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "City",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructurePT_PostalCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PostalCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructurePT_Region(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Region",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressStructurePT_Country(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (auditFileTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AuditFile_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuditFileType_Header(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Header",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuditFileType_MasterFiles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MasterFiles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuditFileType_GeneralLedgerEntries(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GeneralLedgerEntries",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuditFileType_SourceDocuments(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceDocuments",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (auditFileVersionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "AuditFileVersion_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "1.01_01"
		   });		
		addAnnotation
		  (companyIDTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "CompanyID_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "50",
			 "pattern", "([0-9])+|([a-zA-Z0-9\'/\']+%20[0-9]+)"
		   });		
		addAnnotation
		  (countryTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Country_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "2",
			 "pattern", "AF|AX|AL|DZ|AS|AD|AO|AI|AQ|AG|AR|AM|AW|AU|AT|AZ|BS|BH|BD|BB|BY|BE|BZ|BJ|BM|BT|BO|BA|BW|BV|BR|IO|BN|BG|BF|BI|KH|CM|CA|CV|KY|CF|TD|CL|CN|CX|CC|CO|KM|CG|CD|CK|CR|CI|HR|CU|CY|CZ|DK|DJ|DM|DO|EC|EG|SV|GQ|ER|EE|ET|FK|FO|FJ|FI|FR|GF|PF|TF|GA|GM|GE|DE|GH|GI|GR|GL|GD|GP|GU|GT|GG|GN|GW|GY|HT|HM|VA|HN|HK|HU|IS|IN|ID|IR|IQ|IE|IM|IL|IT|JM|JP|JE|JO|KZ|KE|KI|KP|KR|KW|KG|LA|LV|LB|LS|LR|LY|LI|LT|LU|MO|MK|MG|MW|MY|MV|ML|MT|MH|MQ|MR|MU|YT|MX|FM|MD|MC|MN|ME|MS|MA|MZ|MM|NA|NR|NP|NL|AN|NC|NZ|NI|NE|NG|NU|NF|MP|NO|OM|PK|PW|PS|PA|PG|PY|PE|PH|PN|PL|PT|PR|QA|RE|RO|RU|RW|BL|SH|KN|LC|MF|PM|VC|WS|SM|ST|SA|SN|RS|SC|SL|SG|SK|SI|SB|SO|ZA|GS|ES|LK|SD|SR|SJ|SZ|SE|CH|SY|TW|TJ|TZ|TH|TL|TG|TK|TO|TT|TN|TR|TM|TC|TV|UG|UA|AE|GB|US|UM|UY|UZ|VU|VE|VN|VG|VI|WF|EH|YE|ZM|ZW|Desconhecido|"
		   });		
		addAnnotation
		  (creditNoteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CreditNote_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCreditNoteType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCreditNoteType_Reason(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reason",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (currencyCodeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "CurrencyCode_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "length", "3",
			 "pattern", "ADP|AED|AFA|ALL|AMD|ANG|AON|AOR|ARS|ATS|AUD|AWG|AZM|AZN|BAM|BBD|BDT|BEF|BGL|BGN|BHD|BIF|BMD|BND|BRL|BSD|BTN|BWP|BYR|BZD|CAD|CDF|CHF|CLF|CLP|CNY|COP|CRC|CUP|CVE|CYP|CZK|DEM|DJF|DKK|DOP|DZD|ECS|ECV|EEK|EGP|ERN|ESP|ETB|EUR|FIM|FJD|FKP|FRF|GBP|GEL|GHC|GIP|GMD|GNF|GRD|GTQ|GWP|GYD|HKD|HNL|HRK|HTG|HUF|IDR|IEP|ILS|INR|IQD|IRR|ISK|ITL|JMD|JOD|JPY|KES|KGS|KHR|KMF|KPW|KRW|KWD|KYD|KZT|LAK|LBP|LKR|LRD|LSL|LTL|LUF|LVL|LYD|MAD|MDL|MGF|MKD|MMK|MNT|MOP|MRO|MTL|MUR|MVR|MWK|MXN|MXV|MYR|MZM|MZN|NAD|NGN|NIO|NLG|NOK|NPR|NZD|OMR|PAB|PEN|PGK|PHP|PKR|PLN|PTE|PYG|QAR|ROL|RUB|RUR|RWF|SAR|SBD|SCR|SDD|SEK|SGD|SHP|SIT|SKK|SLL|SOS|SRG|STD|SVC|SYP|SZL|THB|TJR|TJS|TMM|TND|TOP|TPE|TRY|TTD|TWD|TZS|UAH|UGX|USD|USN|USS|UYU|UZS|VEB|VND|VUV|WST|XAF|XAG|XAU|XBA|XBB|XBC|XBD|XCD|XDR|XFO|XFU|XOF|XPD|XPF|XPT|XTS|XXX|YER|YUM|ZAL|ZAR|ZMK|ZRN|ZWD|"
		   });		
		addAnnotation
		  (currencyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Currency_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCurrencyType_CurrencyCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CurrencyCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyType_CurrencyCreditAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CurrencyCreditAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyType_CurrencyDebitAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CurrencyDebitAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (customerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Customer_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCustomerType_CustomerID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CustomerID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustomerType_AccountID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AccountID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustomerType_CustomerTaxID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CustomerTaxID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustomerType_CompanyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompanyName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustomerType_Contact(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Contact",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustomerType_BillingAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BillingAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustomerType_ShipToAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ShipToAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustomerType_Telephone(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Telephone",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustomerType_Fax(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fax",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustomerType_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Email",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustomerType_Website(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Website",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCustomerType_SelfBillingIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SelfBillingIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_AccountDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AccountDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AccountID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AccountID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AddressDetail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddressDetail",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AuditFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditFile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AuditFileVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditFileVersion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BillingAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BillingAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BuildingNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BuildingNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BusinessName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_City(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "City",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CompanyAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompanyAddress",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_CompanyID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompanyID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CompanyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompanyName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Contact(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Contact",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Country(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CreditAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CreditAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CreditNote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CreditNote",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Currency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Currency",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CurrencyCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CurrencyCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CurrencyCreditAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CurrencyCreditAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CurrencyDebitAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CurrencyDebitAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Customer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Customer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CustomerID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CustomerID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CustomerTaxID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CustomerTaxID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DateCreated(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DateCreated",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DebitAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DebitAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DeliveryDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DeliveryDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DeliveryID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DeliveryID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DocArchivalNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DocArchivalNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Email",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EndDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EndDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Fax(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fax",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FiscalYear(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FiscalYear",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GeneralLedger(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GeneralLedger",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GeneralLedgerEntries(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GeneralLedgerEntries",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GLPostingDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GLPostingDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GrossTotal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GrossTotal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Hash(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Hash",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HashControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HashControl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Header(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Header",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HeaderComment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HeaderComment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_InvoiceDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InvoiceDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_InvoiceNo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InvoiceNo",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_InvoiceStatus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InvoiceStatus",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_InvoiceType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InvoiceType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_JournalID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "JournalID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LineNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LineNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NetTotal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NetTotal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NumberOfEntries(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NumberOfEntries",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OpeningCreditBalance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OpeningCreditBalance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OpeningDebitBalance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OpeningDebitBalance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OrderDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrderDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OrderReferences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrderReferences",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OriginatingON(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginatingON",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_PaymentMechanism(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PaymentMechanism",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Period(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Period",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PostalCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PostalCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Product(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Product",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProductCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProductCompanyTaxID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductCompanyTaxID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProductDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProductGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductGroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProductID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProductNumberCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductNumberCode",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ProductType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProductVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductVersion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Quantity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Reason(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reason",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RecordID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RecordID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_References(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "References",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Region(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Region",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SelfBillingIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SelfBillingIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Settlement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Settlement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SettlementAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SettlementAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ShipFrom(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ShipFrom",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ShipFromAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ShipFromAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ShipTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ShipTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ShipToAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ShipToAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SoftwareCertificateNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SoftwareCertificateNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SourceDocumentID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceDocumentID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SourceDocuments(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceDocuments",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SourceID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StartDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StartDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StreetName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StreetName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Supplier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Supplier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SupplierID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SupplierID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SupplierTaxID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SupplierTaxID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SystemEntryDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SystemEntryDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Tax(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Tax",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TaxAccountingBasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxAccountingBasis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxCountryRegion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxCountryRegion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxEntity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxEntity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxExemptionReason(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxExemptionReason",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxExpirationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxExpirationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxPayable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxPayable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxPercentage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxPercentage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxPointDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxPointDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxTable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxTableEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxTableEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaxVerificationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxVerificationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Telephone(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Telephone",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TotalCredit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TotalCredit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TotalDebit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TotalDebit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransactionDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransactionDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransactionID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransactionID",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TransactionType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransactionType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UnitOfMeasure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UnitOfMeasure",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UnitPrice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UnitPrice",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Website(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Website",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentTotalsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DocumentTotals_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocumentTotalsType_TaxPayable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxPayable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentTotalsType_NetTotal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NetTotal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentTotalsType_GrossTotal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GrossTotal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentTotalsType_Currency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Currency",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentTotalsType_Settlement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Settlement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (fiscalYearTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "FiscalYear_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "2000",
			 "maxInclusive", "9999"
		   });		
		addAnnotation
		  (generalLedgerEntriesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GeneralLedgerEntries_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGeneralLedgerEntriesType_NumberOfEntries(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NumberOfEntries",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeneralLedgerEntriesType_TotalDebit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TotalDebit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeneralLedgerEntriesType_TotalCredit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TotalCredit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeneralLedgerEntriesType_Journal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Journal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (generalLedgerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GeneralLedger_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGeneralLedgerType_AccountID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AccountID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeneralLedgerType_AccountDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AccountDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeneralLedgerType_OpeningDebitBalance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OpeningDebitBalance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeneralLedgerType_OpeningCreditBalance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OpeningCreditBalance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (headerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Header_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHeaderType_AuditFileVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuditFileVersion",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getHeaderType_CompanyID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompanyID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_TaxRegistrationNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxRegistrationNumber",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getHeaderType_TaxAccountingBasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxAccountingBasis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_CompanyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompanyName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_BusinessName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_CompanyAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompanyAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_FiscalYear(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FiscalYear",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_StartDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StartDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_EndDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EndDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_CurrencyCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CurrencyCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_DateCreated(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DateCreated",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_TaxEntity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxEntity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_ProductCompanyTaxID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductCompanyTaxID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_SoftwareCertificateNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SoftwareCertificateNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_ProductID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_ProductVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductVersion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_HeaderComment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HeaderComment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_Telephone(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Telephone",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_Fax(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fax",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Email",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHeaderType_Website(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Website",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (invoiceNoTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "InvoiceNo_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "60",
			 "pattern", "([a-zA-Z0-9./_-])+%20([a-zA-Z0-9]*/[0-9]+)"
		   });		
		addAnnotation
		  (invoiceStatusTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "InvoiceStatus_._type"
		   });		
		addAnnotation
		  (invoiceStatusTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "InvoiceStatus_._type:Object",
			 "baseType", "InvoiceStatus_._type"
		   });		
		addAnnotation
		  (invoiceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Invoice_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInvoiceType_InvoiceNo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InvoiceNo",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getInvoiceType_InvoiceStatus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InvoiceStatus",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_Hash(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Hash",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_HashControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HashControl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_Period(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Period",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_InvoiceDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InvoiceDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getInvoiceType_InvoiceType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InvoiceType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_SelfBillingIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SelfBillingIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_SystemEntryDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SystemEntryDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_TransactionID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransactionID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_CustomerID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CustomerID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_ShipTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ShipTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_ShipFrom(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ShipFrom",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_Line(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Line",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInvoiceType_DocumentTotals(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DocumentTotals",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (invoiceTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "InvoiceType_._type"
		   });		
		addAnnotation
		  (invoiceTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "InvoiceType_._type:Object",
			 "baseType", "InvoiceType_._type"
		   });		
		addAnnotation
		  (journalTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Journal_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getJournalType_JournalID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "JournalID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getJournalType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getJournalType_Transaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transaction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (lineTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Line_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLineType_LineNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LineNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_OrderReferences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrderReferences",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_ProductCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_ProductDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Quantity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_UnitOfMeasure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UnitOfMeasure",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_UnitPrice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UnitPrice",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_TaxPointDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxPointDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_References(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "References",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_DebitAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DebitAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_CreditAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CreditAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_Tax(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Tax",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_TaxExemptionReason(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxExemptionReason",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType_SettlementAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SettlementAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (lineType1EClass, 
		   source, 
		   new String[] {
			 "name", "Line_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLineType1_RecordID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RecordID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType1_AccountID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AccountID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType1_SourceDocumentID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceDocumentID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType1_SystemEntryDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SystemEntryDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType1_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType1_DebitAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DebitAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineType1_CreditAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CreditAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (masterFilesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MasterFiles_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMasterFilesType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getMasterFilesType_GeneralLedger(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GeneralLedger",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getMasterFilesType_Customer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Customer",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getMasterFilesType_Supplier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Supplier",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getMasterFilesType_Product(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Product",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getMasterFilesType_TaxTable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxTable",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (orderReferencesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrderReferences_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOrderReferencesType_OriginatingON(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginatingON",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrderReferencesType_OrderDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrderDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (paymentMechanismTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "PaymentMechanism_._type"
		   });		
		addAnnotation
		  (paymentMechanismTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PaymentMechanism_._type:Object",
			 "baseType", "PaymentMechanism_._type"
		   });		
		addAnnotation
		  (periodTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Period_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "1",
			 "maxInclusive", "12"
		   });		
		addAnnotation
		  (postalCodePTEDataType, 
		   source, 
		   new String[] {
			 "name", "PostalCodePT",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "([0-9]{4}-[0-9]{3})"
		   });		
		addAnnotation
		  (productTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Product_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getProductType_ProductType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProductType_ProductCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProductType_ProductGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductGroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProductType_ProductDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProductType_ProductNumberCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductNumberCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (productTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ProductType_._type"
		   });		
		addAnnotation
		  (productTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ProductType_._type:Object",
			 "baseType", "ProductType_._type"
		   });		
		addAnnotation
		  (referencesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "References_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReferencesType_CreditNote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CreditNote",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (saFdateTimeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFdateTimeType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });		
		addAnnotation
		  (saFdateTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFdateType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#date"
		   });		
		addAnnotation
		  (saFdecimalTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFdecimalType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal"
		   });		
		addAnnotation
		  (saFmonetaryTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFmonetaryType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal"
		   });		
		addAnnotation
		  (safptAccountingPeriodEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTAccountingPeriod",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "1",
			 "maxInclusive", "16"
		   });		
		addAnnotation
		  (safptCurrencyCodeEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTCurrencyCode",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "EUR"
		   });		
		addAnnotation
		  (safptDateSpanEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTDateSpan",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#date",
			 "minInclusive", "2000-01-01",
			 "maxInclusive", "9999-12-31"
		   });		
		addAnnotation
		  (safptglAccountIDEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTGLAccountID",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "30",
			 "pattern", "(([1-8][0-9a-zA-Z]*))"
		   });		
		addAnnotation
		  (safptPortugueseVatNumberEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTPortugueseVatNumber",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "100000000",
			 "maxInclusive", "999999999"
		   });		
		addAnnotation
		  (safptProductIDEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTProductID",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "3",
			 "maxLength", "255",
			 "pattern", "\\w+(\\s\\w+)*/\\w+(\\s\\w+)*"
		   });		
		addAnnotation
		  (safpTtextTypeMandatoryMax10CarEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTtextTypeMandatoryMax10Car",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "10"
		   });		
		addAnnotation
		  (safpTtextTypeMandatoryMax200CarEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTtextTypeMandatoryMax200Car",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "200"
		   });		
		addAnnotation
		  (safpTtextTypeMandatoryMax20CarEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTtextTypeMandatoryMax20Car",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "20"
		   });		
		addAnnotation
		  (safpTtextTypeMandatoryMax255CarEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTtextTypeMandatoryMax255Car",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "255"
		   });		
		addAnnotation
		  (safpTtextTypeMandatoryMax30CarEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTtextTypeMandatoryMax30Car",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "30"
		   });		
		addAnnotation
		  (safpTtextTypeMandatoryMax3CarEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTtextTypeMandatoryMax3Car",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "3"
		   });		
		addAnnotation
		  (safpTtextTypeMandatoryMax40CarEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTtextTypeMandatoryMax40Car",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "40"
		   });		
		addAnnotation
		  (safpTtextTypeMandatoryMax50CarEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTtextTypeMandatoryMax50Car",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "50"
		   });		
		addAnnotation
		  (safpTtextTypeMandatoryMax60CarEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTtextTypeMandatoryMax60Car",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "60"
		   });		
		addAnnotation
		  (safpTtextTypeMandatoryMax70CarEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTtextTypeMandatoryMax70Car",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "70"
		   });		
		addAnnotation
		  (safpTtextTypeMax40CarEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTtextTypeMax40Car",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "0",
			 "maxLength", "40"
		   });		
		addAnnotation
		  (safptTransactionIDEDataType, 
		   source, 
		   new String[] {
			 "name", "SAFPTTransactionID",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "70",
			 "pattern", "[1-9][0-9]{3}-[01][0-9]-[0-3][0-9]%20\\w{1,30}%20\\w{1,20}"
		   });		
		addAnnotation
		  (salesInvoicesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SalesInvoices_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSalesInvoicesType_NumberOfEntries(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NumberOfEntries",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSalesInvoicesType_TotalDebit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TotalDebit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSalesInvoicesType_TotalCredit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TotalCredit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSalesInvoicesType_Invoice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Invoice",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (selfBillingIndicatorTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "SelfBillingIndicator_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "0",
			 "maxInclusive", "1"
		   });		
		addAnnotation
		  (settlementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Settlement_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSettlementType_SettlementDiscount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SettlementDiscount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettlementType_SettlementAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SettlementAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettlementType_SettlementDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SettlementDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getSettlementType_PaymentMechanism(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PaymentMechanism",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (shippingPointStructureEClass, 
		   source, 
		   new String[] {
			 "name", "ShippingPointStructure",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getShippingPointStructure_DeliveryID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DeliveryID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShippingPointStructure_DeliveryDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DeliveryDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShippingPointStructure_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (sourceDocumentsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SourceDocuments_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSourceDocumentsType_SalesInvoices(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SalesInvoices",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (supplierAddressStructureEClass, 
		   source, 
		   new String[] {
			 "name", "SupplierAddressStructure",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSupplierAddressStructure_BuildingNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BuildingNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierAddressStructure_StreetName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StreetName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierAddressStructure_AddressDetail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddressDetail",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierAddressStructure_City(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "City",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierAddressStructure_PostalCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PostalCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierAddressStructure_Region(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Region",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierAddressStructure_Country(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (supplierCountryEDataType, 
		   source, 
		   new String[] {
			 "name", "SupplierCountry",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "length", "2",
			 "pattern", "AF|AX|AL|DZ|AS|AD|AO|AI|AQ|AG|AR|AM|AW|AU|AT|AZ|BS|BH|BD|BB|BY|BE|BZ|BJ|BM|BT|BO|BA|BW|BV|BR|IO|BN|BG|BF|BI|KH|CM|CA|CV|KY|CF|TD|CL|CN|CX|CC|CO|KM|CG|CD|CK|CR|CI|HR|CU|CY|CZ|DK|DJ|DM|DO|EC|EG|SV|GQ|ER|EE|ET|FK|FO|FJ|FI|FR|GF|PF|TF|GA|GM|GE|DE|GH|GI|GR|GL|GD|GP|GU|GT|GG|GN|GW|GY|HT|HM|VA|HN|HK|HU|IS|IN|ID|IR|IQ|IE|IM|IL|IT|JM|JP|JE|JO|KZ|KE|KI|KP|KR|KW|KG|LA|LV|LB|LS|LR|LY|LI|LT|LU|MO|MK|MG|MW|MY|MV|ML|MT|MH|MQ|MR|MU|YT|MX|FM|MD|MC|MN|ME|MS|MA|MZ|MM|NA|NR|NP|NL|AN|NC|NZ|NI|NE|NG|NU|NF|MP|NO|OM|PK|PW|PS|PA|PG|PY|PE|PH|PN|PL|PT|PR|QA|RE|RO|RU|RW|BL|SH|KN|LC|MF|PM|VC|WS|SM|ST|SA|SN|RS|SC|SL|SG|SK|SI|SB|SO|ZA|GS|ES|LK|SD|SR|SJ|SZ|SE|CH|SY|TW|TJ|TZ|TH|TL|TG|TK|TO|TT|TN|TR|TM|TC|TV|UG|UA|AE|GB|US|UM|UY|UZ|VU|VE|VN|VG|VI|WF|EH|YE|ZM|ZW|"
		   });		
		addAnnotation
		  (supplierTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Supplier_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSupplierType_SupplierID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SupplierID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierType_AccountID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AccountID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierType_SupplierTaxID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SupplierTaxID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierType_CompanyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompanyName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierType_Contact(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Contact",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierType_BillingAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BillingAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierType_ShipFromAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ShipFromAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierType_Telephone(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Telephone",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierType_Fax(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fax",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierType_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Email",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierType_Website(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Website",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSupplierType_SelfBillingIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SelfBillingIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (taxAccountingBasisTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TaxAccountingBasis_._type"
		   });		
		addAnnotation
		  (taxAccountingBasisTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TaxAccountingBasis_._type:Object",
			 "baseType", "TaxAccountingBasis_._type"
		   });		
		addAnnotation
		  (taxCodeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "TaxCode_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1",
			 "maxLength", "10",
			 "pattern", "RED|INT|NOR|ISE|OUT|([0-9.])*"
		   });		
		addAnnotation
		  (taxCountryRegionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "TaxCountryRegion_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "2",
			 "maxLength", "5",
			 "pattern", "AF|AX|AL|DZ|AS|AD|AO|AI|AQ|AG|AR|AM|AW|AU|AT|AZ|BS|BH|BD|BB|BY|BE|BZ|BJ|BM|BT|BO|BA|BW|BV|BR|IO|BN|BG|BF|BI|KH|CM|CA|CV|KY|CF|TD|CL|CN|CX|CC|CO|KM|CG|CD|CK|CR|CI|HR|CU|CY|CZ|DK|DJ|DM|DO|EC|EG|SV|GQ|ER|EE|ET|FK|FO|FJ|FI|FR|GF|PF|TF|GA|GM|GE|DE|GH|GI|GR|GL|GD|GP|GU|GT|GG|GN|GW|GY|HT|HM|VA|HN|HK|HU|IS|IN|ID|IR|IQ|IE|IM|IL|IT|JM|JP|JE|JO|KZ|KE|KI|KP|KR|KW|KG|LA|LV|LB|LS|LR|LY|LI|LT|LU|MO|MK|MG|MW|MY|MV|ML|MT|MH|MQ|MR|MU|YT|MX|FM|MD|MC|MN|ME|MS|MA|MZ|MM|NA|NR|NP|NL|AN|NC|NZ|NI|NE|NG|NU|NF|MP|NO|OM|PK|PW|PS|PA|PG|PY|PE|PH|PN|PL|PT|PR|QA|RE|RO|RU|RW|BL|SH|KN|LC|MF|PM|VC|WS|SM|ST|SA|SN|RS|SC|SL|SG|SK|SI|SB|SO|ZA|GS|ES|LK|SD|SR|SJ|SZ|SE|CH|SY|TW|TJ|TZ|TH|TL|TG|TK|TO|TT|TN|TR|TM|TC|TV|UG|UA|AE|GB|US|UM|UY|UZ|VU|VE|VN|VG|VI|WF|EH|YE|ZM|ZW|PT-AC|PT-MA"
		   });		
		addAnnotation
		  (taxTableEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TaxTableEntry_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTaxTableEntryType_TaxType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTaxTableEntryType_TaxCountryRegion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxCountryRegion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTaxTableEntryType_TaxCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTaxTableEntryType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTaxTableEntryType_TaxExpirationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxExpirationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTaxTableEntryType_TaxPercentage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxPercentage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTaxTableEntryType_TaxAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (taxTableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TaxTable_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTaxTableType_TaxTableEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxTableEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (taxTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Tax_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTaxType_TaxType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTaxType_TaxCountryRegion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxCountryRegion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTaxType_TaxCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTaxType_TaxPercentage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxPercentage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTaxType_TaxAmount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TaxAmount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (taxTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TaxType_._type"
		   });		
		addAnnotation
		  (taxTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TaxType_._type:Object",
			 "baseType", "TaxType_._type"
		   });		
		addAnnotation
		  (transactionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Transaction_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransactionType_TransactionID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransactionID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionType_Period(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Period",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionType_TransactionDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransactionDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionType_SourceID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SourceID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionType_DocArchivalNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DocArchivalNumber",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getTransactionType_TransactionType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransactionType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionType_GLPostingDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GLPostingDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionType_CustomerID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CustomerID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionType_SupplierID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SupplierID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionType_Line(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Line",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (transactionTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TransactionType_._type"
		   });		
		addAnnotation
		  (transactionTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TransactionType_._type:Object",
			 "baseType", "TransactionType_._type"
		   });
	}

} //Pt1_01_2PackageImpl
