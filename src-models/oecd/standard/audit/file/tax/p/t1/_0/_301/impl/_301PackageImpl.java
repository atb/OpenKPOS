/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301.impl;

import java.io.IOException;

import java.net.URL;

import oecd.standard.audit.file.tax.p.t1._0._301._301Factory;
import oecd.standard.audit.file.tax.p.t1._0._301._301Package;

import oecd.standard.audit.file.tax.p.t1._0._301.util._301Validator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _301PackageImpl extends EPackageImpl implements _301Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "_301.ecore";

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
	private EClass currencyEClass = null;

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
	private EClass documentStatusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentStatusType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentStatusType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentStatusType3EClass = null;

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
	private EClass documentTotalsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentTotalsType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentTotalsType3EClass = null;

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
	private EClass lineType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineType4EClass = null;

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
	private EClass movementOfGoodsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movementTaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentTaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentTypeEClass = null;

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
	private EClass referencesEClass = null;

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
	private EClass settlementEClass = null;

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
	private EClass sourceDocumentIDTypeEClass = null;

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
	private EClass specialRegimesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockMovementTypeEClass = null;

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
	private EClass taxEClass = null;

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
	private EClass transactionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withholdingTaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workDocumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workingDocumentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groupingCategoryTypeEEnum = null;

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
	private EEnum movementStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum movementTypeTypeEEnum = null;

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
	private EEnum paymentStatusTypeEEnum = null;

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
	private EEnum saftptMovementTaxTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum saftptPaymentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum saftptSourceBillingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum saftptSourcePaymentEEnum = null;

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
	private EEnum withholdingTaxTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workTypeTypeEEnum = null;

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
	private EDataType cashVATSchemeIndicatorTypeEDataType = null;

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
	private EDataType documentNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eacCodeTypeEDataType = null;

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
	private EDataType groupingCategoryTypeObjectEDataType = null;

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
	private EDataType movementStatusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType movementTypeTypeObjectEDataType = null;

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
	private EDataType paymentRefNoTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType paymentStatusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType paymentTaxCodeEDataType = null;

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
	private EDataType safptJournalIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType safptPortugueseTaxExemptionEDataType = null;

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
	private EDataType safpTtextTypeMandatoryMax100CarEDataType = null;

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
	private EDataType safpTtextTypeMandatoryMax172CarEDataType = null;

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
	private EDataType safpTtextTypeMandatoryMax35CarEDataType = null;

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
	private EDataType safpTtextTypeMandatoryMax90CarEDataType = null;

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
	private EDataType saftptDocArchivalNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType saftptMovementTaxCodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType saftptMovementTaxTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType saftptPaymentTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType saftptSourceBillingObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType saftptSourcePaymentObjectEDataType = null;

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
	private EDataType taxTableEntryTaxCodeEDataType = null;

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
	private EDataType thirdPartiesBillingIndicatorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transactionTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType withholdingTaxTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType workStatusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType workTypeTypeObjectEDataType = null;

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _301PackageImpl() {
		super(eNS_URI, _301Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _301Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static _301Package init() {
		if (isInited) return (_301Package)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI);

		// Obtain or create and register package
		_301PackageImpl the_301Package = (_301PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _301PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _301PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		the_301Package.loadPackage();

		// Fix loaded packages
		the_301Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(the_301Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return _301Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		the_301Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_301Package.eNS_URI, the_301Package);
		return the_301Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressStructure() {
		if (addressStructureEClass == null) {
			addressStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(1);
		}
		return addressStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_BuildingNumber() {
        return (EAttribute)getAddressStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_StreetName() {
        return (EAttribute)getAddressStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_AddressDetail() {
        return (EAttribute)getAddressStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_City() {
        return (EAttribute)getAddressStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_PostalCode() {
        return (EAttribute)getAddressStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_Region() {
        return (EAttribute)getAddressStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructure_Country() {
        return (EAttribute)getAddressStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressStructurePT() {
		if (addressStructurePTEClass == null) {
			addressStructurePTEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(2);
		}
		return addressStructurePTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_BuildingNumber() {
        return (EAttribute)getAddressStructurePT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_StreetName() {
        return (EAttribute)getAddressStructurePT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_AddressDetail() {
        return (EAttribute)getAddressStructurePT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_City() {
        return (EAttribute)getAddressStructurePT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_PostalCode() {
        return (EAttribute)getAddressStructurePT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_Region() {
        return (EAttribute)getAddressStructurePT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressStructurePT_Country() {
        return (EAttribute)getAddressStructurePT().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditFileType() {
		if (auditFileTypeEClass == null) {
			auditFileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(3);
		}
		return auditFileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditFileType_Header() {
        return (EReference)getAuditFileType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditFileType_MasterFiles() {
        return (EReference)getAuditFileType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditFileType_GeneralLedgerEntries() {
        return (EReference)getAuditFileType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditFileType_SourceDocuments() {
        return (EReference)getAuditFileType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrency() {
		if (currencyEClass == null) {
			currencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(8);
		}
		return currencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrency_CurrencyCode() {
        return (EAttribute)getCurrency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrency_CurrencyAmount() {
        return (EAttribute)getCurrency().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrency_ExchangeRate() {
        return (EAttribute)getCurrency().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerType() {
		if (customerTypeEClass == null) {
			customerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(10);
		}
		return customerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_CustomerID() {
        return (EAttribute)getCustomerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_AccountID() {
        return (EAttribute)getCustomerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_CustomerTaxID() {
        return (EAttribute)getCustomerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_CompanyName() {
        return (EAttribute)getCustomerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_Contact() {
        return (EAttribute)getCustomerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerType_BillingAddress() {
        return (EReference)getCustomerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerType_ShipToAddress() {
        return (EReference)getCustomerType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_Telephone() {
        return (EAttribute)getCustomerType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_Fax() {
        return (EAttribute)getCustomerType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_Email() {
        return (EAttribute)getCustomerType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_Website() {
        return (EAttribute)getCustomerType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_SelfBillingIndicator() {
        return (EAttribute)getCustomerType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(12);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AccountDescription() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AccountID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Address() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AddressDetail() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ATDocCodeID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuditFile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AuditFileVersion() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BillingAddress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BuildingNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BusinessName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CashVATSchemeIndicator() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_City() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ClosingCreditBalance() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ClosingDebitBalance() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CompanyAddress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CompanyID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CompanyName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Contact() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Country() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CreditAmount() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CurrencyAmount() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CurrencyCode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Customer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CustomerID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CustomerTaxID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DateCreated() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DebitAmount() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DeliveryDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DeliveryID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Description() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DocArchivalNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DocumentNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EACCode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Email() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExchangeRate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Fax() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FiscalYear() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeneralLedger() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeneralLedgerEntries() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GLPostingDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GrossTotal() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GroupingCategory() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Hash() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HashControl() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Header() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HeaderComment() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InvoiceDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InvoiceNo() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InvoiceStatus() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InvoiceStatusDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InvoiceType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_JournalID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LineNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LocationID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MovementComments() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MovementDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MovementEndTime() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MovementStartTime() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MovementStatus() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MovementStatusDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MovementType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NetTotal() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NumberOfEntries() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NumberOfMovementLines() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OpeningCreditBalance() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OpeningDebitBalance() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OrderDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OriginatingON() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PaymentMechanism() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PaymentRefNo() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PaymentStatus() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PaymentStatusDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Period() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PostalCode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Product() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductCode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductCompanyTaxID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductDescription() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductGroup() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductNumberCode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProductVersion() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Quantity() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Reason() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RecordID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Reference() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Region() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SelfBillingIndicator() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SettlementAmount() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ShipFrom() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ShipFromAddress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ShipTo() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ShipToAddress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SoftwareCertificateNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SourceDocumentID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SourceDocuments() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SourceID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StreetName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Supplier() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SupplierID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SupplierTaxID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SystemEntryDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SystemID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxAccountingBasis() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxAmount() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxCode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxCountryRegion() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxEntity() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxExemptionReason() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxExpirationDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxPayable() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxPercentage() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxPointDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TaxTable() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TaxTableEntry() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TaxVerificationDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Telephone() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ThirdPartiesBillingIndicator() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TotalCredit() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TotalDebit() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TotalQuantityIssued() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransactionDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransactionID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransactionType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UnitOfMeasure() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UnitPrice() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WarehouseID() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Website() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WithholdingTaxType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WorkDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WorkStatus() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WorkStatusDate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WorkType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentStatusType() {
		if (documentStatusTypeEClass == null) {
			documentStatusTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(13);
		}
		return documentStatusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType_WorkStatus() {
        return (EAttribute)getDocumentStatusType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType_WorkStatusDate() {
        return (EAttribute)getDocumentStatusType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType_Reason() {
        return (EAttribute)getDocumentStatusType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType_SourceID() {
        return (EAttribute)getDocumentStatusType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType_SourceBilling() {
        return (EAttribute)getDocumentStatusType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentStatusType1() {
		if (documentStatusType1EClass == null) {
			documentStatusType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(14);
		}
		return documentStatusType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType1_PaymentStatus() {
        return (EAttribute)getDocumentStatusType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType1_PaymentStatusDate() {
        return (EAttribute)getDocumentStatusType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType1_Reason() {
        return (EAttribute)getDocumentStatusType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType1_SourceID() {
        return (EAttribute)getDocumentStatusType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType1_SourcePayment() {
        return (EAttribute)getDocumentStatusType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentStatusType2() {
		if (documentStatusType2EClass == null) {
			documentStatusType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(15);
		}
		return documentStatusType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType2_MovementStatus() {
        return (EAttribute)getDocumentStatusType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType2_MovementStatusDate() {
        return (EAttribute)getDocumentStatusType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType2_Reason() {
        return (EAttribute)getDocumentStatusType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType2_SourceID() {
        return (EAttribute)getDocumentStatusType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType2_SourceBilling() {
        return (EAttribute)getDocumentStatusType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentStatusType3() {
		if (documentStatusType3EClass == null) {
			documentStatusType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(16);
		}
		return documentStatusType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType3_InvoiceStatus() {
        return (EAttribute)getDocumentStatusType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType3_InvoiceStatusDate() {
        return (EAttribute)getDocumentStatusType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType3_Reason() {
        return (EAttribute)getDocumentStatusType3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType3_SourceID() {
        return (EAttribute)getDocumentStatusType3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatusType3_SourceBilling() {
        return (EAttribute)getDocumentStatusType3().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentTotalsType() {
		if (documentTotalsTypeEClass == null) {
			documentTotalsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(17);
		}
		return documentTotalsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType_TaxPayable() {
        return (EAttribute)getDocumentTotalsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType_NetTotal() {
        return (EAttribute)getDocumentTotalsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType_GrossTotal() {
        return (EAttribute)getDocumentTotalsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentTotalsType_Currency() {
        return (EReference)getDocumentTotalsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentTotalsType1() {
		if (documentTotalsType1EClass == null) {
			documentTotalsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(18);
		}
		return documentTotalsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType1_TaxPayable() {
        return (EAttribute)getDocumentTotalsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType1_NetTotal() {
        return (EAttribute)getDocumentTotalsType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType1_GrossTotal() {
        return (EAttribute)getDocumentTotalsType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentTotalsType1_Currency() {
        return (EReference)getDocumentTotalsType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentTotalsType2() {
		if (documentTotalsType2EClass == null) {
			documentTotalsType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(19);
		}
		return documentTotalsType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType2_TaxPayable() {
        return (EAttribute)getDocumentTotalsType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType2_NetTotal() {
        return (EAttribute)getDocumentTotalsType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType2_GrossTotal() {
        return (EAttribute)getDocumentTotalsType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentTotalsType2_Settlement() {
        return (EReference)getDocumentTotalsType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentTotalsType2_Currency() {
        return (EReference)getDocumentTotalsType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentTotalsType3() {
		if (documentTotalsType3EClass == null) {
			documentTotalsType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(20);
		}
		return documentTotalsType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType3_TaxPayable() {
        return (EAttribute)getDocumentTotalsType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType3_NetTotal() {
        return (EAttribute)getDocumentTotalsType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTotalsType3_GrossTotal() {
        return (EAttribute)getDocumentTotalsType3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentTotalsType3_Currency() {
        return (EReference)getDocumentTotalsType3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentTotalsType3_Settlement() {
        return (EReference)getDocumentTotalsType3().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentTotalsType3_Payment() {
        return (EReference)getDocumentTotalsType3().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralLedgerEntriesType() {
		if (generalLedgerEntriesTypeEClass == null) {
			generalLedgerEntriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(23);
		}
		return generalLedgerEntriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerEntriesType_NumberOfEntries() {
        return (EAttribute)getGeneralLedgerEntriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerEntriesType_TotalDebit() {
        return (EAttribute)getGeneralLedgerEntriesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerEntriesType_TotalCredit() {
        return (EAttribute)getGeneralLedgerEntriesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralLedgerEntriesType_Journal() {
        return (EReference)getGeneralLedgerEntriesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralLedgerType() {
		if (generalLedgerTypeEClass == null) {
			generalLedgerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(24);
		}
		return generalLedgerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_AccountID() {
        return (EAttribute)getGeneralLedgerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_AccountDescription() {
        return (EAttribute)getGeneralLedgerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_OpeningDebitBalance() {
        return (EAttribute)getGeneralLedgerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_OpeningCreditBalance() {
        return (EAttribute)getGeneralLedgerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_ClosingDebitBalance() {
        return (EAttribute)getGeneralLedgerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_ClosingCreditBalance() {
        return (EAttribute)getGeneralLedgerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_GroupingCategory() {
        return (EAttribute)getGeneralLedgerType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralLedgerType_GroupingCode() {
        return (EAttribute)getGeneralLedgerType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderType() {
		if (headerTypeEClass == null) {
			headerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(27);
		}
		return headerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_AuditFileVersion() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_CompanyID() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_TaxRegistrationNumber() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_TaxAccountingBasis() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_CompanyName() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_BusinessName() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderType_CompanyAddress() {
        return (EReference)getHeaderType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_FiscalYear() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_StartDate() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_EndDate() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_CurrencyCode() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_DateCreated() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_TaxEntity() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_ProductCompanyTaxID() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_SoftwareCertificateNumber() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_ProductID() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_ProductVersion() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_HeaderComment() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Telephone() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Fax() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Email() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Website() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoiceType() {
		if (invoiceTypeEClass == null) {
			invoiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(31);
		}
		return invoiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_InvoiceNo() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceType_DocumentStatus() {
        return (EReference)getInvoiceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_Hash() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_HashControl() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_Period() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_InvoiceDate() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_InvoiceType() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceType_SpecialRegimes() {
        return (EReference)getInvoiceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_SourceID() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_EACCode() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_SystemEntryDate() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_TransactionID() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_CustomerID() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceType_ShipTo() {
        return (EReference)getInvoiceType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceType_ShipFrom() {
        return (EReference)getInvoiceType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_MovementEndTime() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceType_MovementStartTime() {
        return (EAttribute)getInvoiceType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceType_Line() {
        return (EReference)getInvoiceType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceType_DocumentTotals() {
        return (EReference)getInvoiceType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceType_WithholdingTax() {
        return (EReference)getInvoiceType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJournalType() {
		if (journalTypeEClass == null) {
			journalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(34);
		}
		return journalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJournalType_JournalID() {
        return (EAttribute)getJournalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJournalType_Description() {
        return (EAttribute)getJournalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJournalType_Transaction() {
        return (EReference)getJournalType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineType() {
		if (lineTypeEClass == null) {
			lineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(35);
		}
		return lineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_LineNumber() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType_OrderReferences() {
        return (EReference)getLineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_ProductCode() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_ProductDescription() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Quantity() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_UnitOfMeasure() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_UnitPrice() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Description() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_DebitAmount() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_CreditAmount() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType_Tax() {
        return (EReference)getLineType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_TaxExemptionReason() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_SettlementAmount() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineType1() {
		if (lineType1EClass == null) {
			lineType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(36);
		}
		return lineType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_LineNumber() {
        return (EAttribute)getLineType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType1_SourceDocumentID() {
        return (EReference)getLineType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_SettlementAmount() {
        return (EAttribute)getLineType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_DebitAmount() {
        return (EAttribute)getLineType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_CreditAmount() {
        return (EAttribute)getLineType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType1_Tax() {
        return (EReference)getLineType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType1_TaxExemptionReason() {
        return (EAttribute)getLineType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineType2() {
		if (lineType2EClass == null) {
			lineType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(37);
		}
		return lineType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_LineNumber() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType2_OrderReferences() {
        return (EReference)getLineType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_ProductCode() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_ProductDescription() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_Quantity() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_UnitOfMeasure() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_UnitPrice() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_TaxPointDate() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType2_References() {
        return (EReference)getLineType2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_Description() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_DebitAmount() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_CreditAmount() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType2_Tax() {
        return (EReference)getLineType2().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_TaxExemptionReason() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType2_SettlementAmount() {
        return (EAttribute)getLineType2().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineType3() {
		if (lineType3EClass == null) {
			lineType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(38);
		}
		return lineType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_LineNumber() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType3_OrderReferences() {
        return (EReference)getLineType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_ProductCode() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_ProductDescription() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_Quantity() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_UnitOfMeasure() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_UnitPrice() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_TaxPointDate() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_Description() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_DebitAmount() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_CreditAmount() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType3_Tax() {
        return (EReference)getLineType3().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_TaxExemptionReason() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType3_SettlementAmount() {
        return (EAttribute)getLineType3().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineType4() {
		if (lineType4EClass == null) {
			lineType4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(39);
		}
		return lineType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType4_RecordID() {
        return (EAttribute)getLineType4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType4_AccountID() {
        return (EAttribute)getLineType4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType4_SourceDocumentID() {
        return (EAttribute)getLineType4().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType4_SystemEntryDate() {
        return (EAttribute)getLineType4().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType4_Description() {
        return (EAttribute)getLineType4().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType4_DebitAmount() {
        return (EAttribute)getLineType4().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType4_CreditAmount() {
        return (EAttribute)getLineType4().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterFilesType() {
		if (masterFilesTypeEClass == null) {
			masterFilesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(40);
		}
		return masterFilesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterFilesType_GeneralLedger() {
        return (EReference)getMasterFilesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterFilesType_Customer() {
        return (EReference)getMasterFilesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterFilesType_Supplier() {
        return (EReference)getMasterFilesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterFilesType_Product() {
        return (EReference)getMasterFilesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterFilesType_TaxTable() {
        return (EReference)getMasterFilesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMovementOfGoodsType() {
		if (movementOfGoodsTypeEClass == null) {
			movementOfGoodsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(41);
		}
		return movementOfGoodsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovementOfGoodsType_NumberOfMovementLines() {
        return (EAttribute)getMovementOfGoodsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovementOfGoodsType_TotalQuantityIssued() {
        return (EAttribute)getMovementOfGoodsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMovementOfGoodsType_StockMovement() {
        return (EReference)getMovementOfGoodsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMovementTax() {
		if (movementTaxEClass == null) {
			movementTaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(44);
		}
		return movementTaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovementTax_TaxType() {
        return (EAttribute)getMovementTax().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovementTax_TaxCountryRegion() {
        return (EAttribute)getMovementTax().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovementTax_TaxCode() {
        return (EAttribute)getMovementTax().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMovementTax_TaxPercentage() {
        return (EAttribute)getMovementTax().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderReferences() {
		if (orderReferencesEClass == null) {
			orderReferencesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(47);
		}
		return orderReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderReferences_OriginatingON() {
        return (EAttribute)getOrderReferences().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderReferences_OrderDate() {
        return (EAttribute)getOrderReferences().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentMethod() {
		if (paymentMethodEClass == null) {
			paymentMethodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(50);
		}
		return paymentMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentMethod_PaymentMechanism() {
        return (EAttribute)getPaymentMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentMethod_PaymentAmount() {
        return (EAttribute)getPaymentMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentMethod_PaymentDate() {
        return (EAttribute)getPaymentMethod().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentsType() {
		if (paymentsTypeEClass == null) {
			paymentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(54);
		}
		return paymentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentsType_NumberOfEntries() {
        return (EAttribute)getPaymentsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentsType_TotalDebit() {
        return (EAttribute)getPaymentsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentsType_TotalCredit() {
        return (EAttribute)getPaymentsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentsType_Payment() {
        return (EReference)getPaymentsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentTax() {
		if (paymentTaxEClass == null) {
			paymentTaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(55);
		}
		return paymentTaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentTax_TaxType() {
        return (EAttribute)getPaymentTax().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentTax_TaxCountryRegion() {
        return (EAttribute)getPaymentTax().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentTax_TaxCode() {
        return (EAttribute)getPaymentTax().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentTax_TaxPercentage() {
        return (EAttribute)getPaymentTax().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentTax_TaxAmount() {
        return (EAttribute)getPaymentTax().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentType() {
		if (paymentTypeEClass == null) {
			paymentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(57);
		}
		return paymentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentType_PaymentRefNo() {
        return (EAttribute)getPaymentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentType_Period() {
        return (EAttribute)getPaymentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentType_TransactionID() {
        return (EAttribute)getPaymentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentType_TransactionDate() {
        return (EAttribute)getPaymentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentType_PaymentType() {
        return (EAttribute)getPaymentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentType_Description() {
        return (EAttribute)getPaymentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentType_SystemID() {
        return (EAttribute)getPaymentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentType_DocumentStatus() {
        return (EReference)getPaymentType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentType_PaymentMethod() {
        return (EReference)getPaymentType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentType_SourceID() {
        return (EAttribute)getPaymentType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentType_SystemEntryDate() {
        return (EAttribute)getPaymentType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentType_CustomerID() {
        return (EAttribute)getPaymentType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentType_Line() {
        return (EReference)getPaymentType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentType_DocumentTotals() {
        return (EReference)getPaymentType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentType_WithholdingTax() {
        return (EReference)getPaymentType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductType() {
		if (productTypeEClass == null) {
			productTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(60);
		}
		return productTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_ProductType() {
        return (EAttribute)getProductType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_ProductCode() {
        return (EAttribute)getProductType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_ProductGroup() {
        return (EAttribute)getProductType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_ProductDescription() {
        return (EAttribute)getProductType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_ProductNumberCode() {
        return (EAttribute)getProductType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferences() {
		if (referencesEClass == null) {
			referencesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(63);
		}
		return referencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferences_Reference() {
        return (EAttribute)getReferences().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferences_Reason() {
        return (EAttribute)getReferences().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalesInvoicesType() {
		if (salesInvoicesTypeEClass == null) {
			salesInvoicesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(101);
		}
		return salesInvoicesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesInvoicesType_NumberOfEntries() {
        return (EAttribute)getSalesInvoicesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesInvoicesType_TotalDebit() {
        return (EAttribute)getSalesInvoicesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSalesInvoicesType_TotalCredit() {
        return (EAttribute)getSalesInvoicesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalesInvoicesType_Invoice() {
        return (EReference)getSalesInvoicesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettlement() {
		if (settlementEClass == null) {
			settlementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(103);
		}
		return settlementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettlement_SettlementDiscount() {
        return (EAttribute)getSettlement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettlement_SettlementAmount() {
        return (EAttribute)getSettlement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettlement_SettlementDate() {
        return (EAttribute)getSettlement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettlement_PaymentTerms() {
        return (EAttribute)getSettlement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettlementType() {
		if (settlementTypeEClass == null) {
			settlementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(104);
		}
		return settlementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettlementType_SettlementAmount() {
        return (EAttribute)getSettlementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShippingPointStructure() {
		if (shippingPointStructureEClass == null) {
			shippingPointStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(105);
		}
		return shippingPointStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShippingPointStructure_DeliveryID() {
        return (EAttribute)getShippingPointStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShippingPointStructure_DeliveryDate() {
        return (EAttribute)getShippingPointStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShippingPointStructure_Group() {
        return (EAttribute)getShippingPointStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShippingPointStructure_WarehouseID() {
        return (EAttribute)getShippingPointStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShippingPointStructure_LocationID() {
        return (EAttribute)getShippingPointStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShippingPointStructure_Address() {
        return (EReference)getShippingPointStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentIDType() {
		if (sourceDocumentIDTypeEClass == null) {
			sourceDocumentIDTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(106);
		}
		return sourceDocumentIDTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentIDType_OriginatingON() {
        return (EAttribute)getSourceDocumentIDType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentIDType_InvoiceDate() {
        return (EAttribute)getSourceDocumentIDType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentIDType_Description() {
        return (EAttribute)getSourceDocumentIDType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentsType() {
		if (sourceDocumentsTypeEClass == null) {
			sourceDocumentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(107);
		}
		return sourceDocumentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentsType_SalesInvoices() {
        return (EReference)getSourceDocumentsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentsType_MovementOfGoods() {
        return (EReference)getSourceDocumentsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentsType_WorkingDocuments() {
        return (EReference)getSourceDocumentsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceDocumentsType_Payments() {
        return (EReference)getSourceDocumentsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialRegimes() {
		if (specialRegimesEClass == null) {
			specialRegimesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(108);
		}
		return specialRegimesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialRegimes_SelfBillingIndicator() {
        return (EAttribute)getSpecialRegimes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialRegimes_CashVATSchemeIndicator() {
        return (EAttribute)getSpecialRegimes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialRegimes_ThirdPartiesBillingIndicator() {
        return (EAttribute)getSpecialRegimes().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockMovementType() {
		if (stockMovementTypeEClass == null) {
			stockMovementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(109);
		}
		return stockMovementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_DocumentNumber() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockMovementType_DocumentStatus() {
        return (EReference)getStockMovementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_Hash() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_HashControl() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_Period() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_MovementDate() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_MovementType() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_SystemEntryDate() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_TransactionID() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_CustomerID() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_SupplierID() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_SourceID() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_EACCode() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_MovementComments() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockMovementType_ShipTo() {
        return (EReference)getStockMovementType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockMovementType_ShipFrom() {
        return (EReference)getStockMovementType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_MovementEndTime() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_MovementStartTime() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockMovementType_ATDocCodeID() {
        return (EAttribute)getStockMovementType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockMovementType_Line() {
        return (EReference)getStockMovementType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStockMovementType_DocumentTotals() {
        return (EReference)getStockMovementType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplierAddressStructure() {
		if (supplierAddressStructureEClass == null) {
			supplierAddressStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(110);
		}
		return supplierAddressStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_BuildingNumber() {
        return (EAttribute)getSupplierAddressStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_StreetName() {
        return (EAttribute)getSupplierAddressStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_AddressDetail() {
        return (EAttribute)getSupplierAddressStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_City() {
        return (EAttribute)getSupplierAddressStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_PostalCode() {
        return (EAttribute)getSupplierAddressStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_Region() {
        return (EAttribute)getSupplierAddressStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierAddressStructure_Country() {
        return (EAttribute)getSupplierAddressStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplierType() {
		if (supplierTypeEClass == null) {
			supplierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(112);
		}
		return supplierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_SupplierID() {
        return (EAttribute)getSupplierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_AccountID() {
        return (EAttribute)getSupplierType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_SupplierTaxID() {
        return (EAttribute)getSupplierType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_CompanyName() {
        return (EAttribute)getSupplierType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_Contact() {
        return (EAttribute)getSupplierType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplierType_BillingAddress() {
        return (EReference)getSupplierType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplierType_ShipFromAddress() {
        return (EReference)getSupplierType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_Telephone() {
        return (EAttribute)getSupplierType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_Fax() {
        return (EAttribute)getSupplierType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_Email() {
        return (EAttribute)getSupplierType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_Website() {
        return (EAttribute)getSupplierType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierType_SelfBillingIndicator() {
        return (EAttribute)getSupplierType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTax() {
		if (taxEClass == null) {
			taxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(113);
		}
		return taxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTax_TaxType() {
        return (EAttribute)getTax().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTax_TaxCountryRegion() {
        return (EAttribute)getTax().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTax_TaxCode() {
        return (EAttribute)getTax().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTax_TaxPercentage() {
        return (EAttribute)getTax().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTax_TaxAmount() {
        return (EAttribute)getTax().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaxTableEntryType() {
		if (taxTableEntryTypeEClass == null) {
			taxTableEntryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(119);
		}
		return taxTableEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxType() {
        return (EAttribute)getTaxTableEntryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxCountryRegion() {
        return (EAttribute)getTaxTableEntryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxCode() {
        return (EAttribute)getTaxTableEntryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_Description() {
        return (EAttribute)getTaxTableEntryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxExpirationDate() {
        return (EAttribute)getTaxTableEntryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxPercentage() {
        return (EAttribute)getTaxTableEntryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxTableEntryType_TaxAmount() {
        return (EAttribute)getTaxTableEntryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaxTableType() {
		if (taxTableTypeEClass == null) {
			taxTableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(120);
		}
		return taxTableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaxTableType_TaxTableEntry() {
        return (EReference)getTaxTableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionType() {
		if (transactionTypeEClass == null) {
			transactionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(124);
		}
		return transactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_TransactionID() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_Period() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_TransactionDate() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_SourceID() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_Description() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_DocArchivalNumber() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_TransactionType() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_GLPostingDate() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_CustomerID() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_SupplierID() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionType_Line() {
        return (EReference)getTransactionType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWithholdingTax() {
		if (withholdingTaxEClass == null) {
			withholdingTaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(127);
		}
		return withholdingTaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithholdingTax_WithholdingTaxType() {
        return (EAttribute)getWithholdingTax().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithholdingTax_WithholdingTaxDescription() {
        return (EAttribute)getWithholdingTax().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithholdingTax_WithholdingTaxAmount() {
        return (EAttribute)getWithholdingTax().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkDocumentType() {
		if (workDocumentTypeEClass == null) {
			workDocumentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(130);
		}
		return workDocumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDocumentType_DocumentNumber() {
        return (EAttribute)getWorkDocumentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkDocumentType_DocumentStatus() {
        return (EReference)getWorkDocumentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDocumentType_Hash() {
        return (EAttribute)getWorkDocumentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDocumentType_HashControl() {
        return (EAttribute)getWorkDocumentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDocumentType_Period() {
        return (EAttribute)getWorkDocumentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDocumentType_WorkDate() {
        return (EAttribute)getWorkDocumentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDocumentType_WorkType() {
        return (EAttribute)getWorkDocumentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDocumentType_SourceID() {
        return (EAttribute)getWorkDocumentType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDocumentType_EACCode() {
        return (EAttribute)getWorkDocumentType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDocumentType_SystemEntryDate() {
        return (EAttribute)getWorkDocumentType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDocumentType_CustomerID() {
        return (EAttribute)getWorkDocumentType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkDocumentType_Line() {
        return (EReference)getWorkDocumentType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkDocumentType_DocumentTotals() {
        return (EReference)getWorkDocumentType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkingDocumentsType() {
		if (workingDocumentsTypeEClass == null) {
			workingDocumentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(131);
		}
		return workingDocumentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkingDocumentsType_NumberOfEntries() {
        return (EAttribute)getWorkingDocumentsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkingDocumentsType_TotalDebit() {
        return (EAttribute)getWorkingDocumentsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkingDocumentsType_TotalCredit() {
        return (EAttribute)getWorkingDocumentsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkingDocumentsType_WorkDocument() {
        return (EReference)getWorkingDocumentsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupingCategoryType() {
		if (groupingCategoryTypeEEnum == null) {
			groupingCategoryTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(25);
		}
		return groupingCategoryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvoiceStatusType() {
		if (invoiceStatusTypeEEnum == null) {
			invoiceStatusTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(29);
		}
		return invoiceStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvoiceTypeType() {
		if (invoiceTypeTypeEEnum == null) {
			invoiceTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(32);
		}
		return invoiceTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMovementStatusType() {
		if (movementStatusTypeEEnum == null) {
			movementStatusTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(42);
		}
		return movementStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMovementTypeType() {
		if (movementTypeTypeEEnum == null) {
			movementTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(45);
		}
		return movementTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentMechanismType() {
		if (paymentMechanismTypeEEnum == null) {
			paymentMechanismTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(48);
		}
		return paymentMechanismTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentStatusType() {
		if (paymentStatusTypeEEnum == null) {
			paymentStatusTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(52);
		}
		return paymentStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductTypeType() {
		if (productTypeTypeEEnum == null) {
			productTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(61);
		}
		return productTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSAFTPTMovementTaxType() {
		if (saftptMovementTaxTypeEEnum == null) {
			saftptMovementTaxTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(93);
		}
		return saftptMovementTaxTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSAFTPTPaymentType() {
		if (saftptPaymentTypeEEnum == null) {
			saftptPaymentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(95);
		}
		return saftptPaymentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSAFTPTSourceBilling() {
		if (saftptSourceBillingEEnum == null) {
			saftptSourceBillingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(97);
		}
		return saftptSourceBillingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSAFTPTSourcePayment() {
		if (saftptSourcePaymentEEnum == null) {
			saftptSourcePaymentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(99);
		}
		return saftptSourcePaymentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaxAccountingBasisType() {
		if (taxAccountingBasisTypeEEnum == null) {
			taxAccountingBasisTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(114);
		}
		return taxAccountingBasisTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaxTypeType() {
		if (taxTypeTypeEEnum == null) {
			taxTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(121);
		}
		return taxTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransactionTypeType() {
		if (transactionTypeTypeEEnum == null) {
			transactionTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(125);
		}
		return transactionTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWithholdingTaxTypeType() {
		if (withholdingTaxTypeTypeEEnum == null) {
			withholdingTaxTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(128);
		}
		return withholdingTaxTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkStatusType() {
		if (workStatusTypeEEnum == null) {
			workStatusTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(132);
		}
		return workStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkTypeType() {
		if (workTypeTypeEEnum == null) {
			workTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(134);
		}
		return workTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccountIDType() {
		if (accountIDTypeEDataType == null) {
			accountIDTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(0);
		}
		return accountIDTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuditFileVersionType() {
		if (auditFileVersionTypeEDataType == null) {
			auditFileVersionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(4);
		}
		return auditFileVersionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCashVATSchemeIndicatorType() {
		if (cashVATSchemeIndicatorTypeEDataType == null) {
			cashVATSchemeIndicatorTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(5);
		}
		return cashVATSchemeIndicatorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompanyIDType() {
		if (companyIDTypeEDataType == null) {
			companyIDTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(6);
		}
		return companyIDTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCountryType() {
		if (countryTypeEDataType == null) {
			countryTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(7);
		}
		return countryTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurrencyCodeType() {
		if (currencyCodeTypeEDataType == null) {
			currencyCodeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(9);
		}
		return currencyCodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDocumentNumberType() {
		if (documentNumberTypeEDataType == null) {
			documentNumberTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(11);
		}
		return documentNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEACCodeType() {
		if (eacCodeTypeEDataType == null) {
			eacCodeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(21);
		}
		return eacCodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFiscalYearType() {
		if (fiscalYearTypeEDataType == null) {
			fiscalYearTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(22);
		}
		return fiscalYearTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGroupingCategoryTypeObject() {
		if (groupingCategoryTypeObjectEDataType == null) {
			groupingCategoryTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(26);
		}
		return groupingCategoryTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvoiceNoType() {
		if (invoiceNoTypeEDataType == null) {
			invoiceNoTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(28);
		}
		return invoiceNoTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvoiceStatusTypeObject() {
		if (invoiceStatusTypeObjectEDataType == null) {
			invoiceStatusTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(30);
		}
		return invoiceStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvoiceTypeTypeObject() {
		if (invoiceTypeTypeObjectEDataType == null) {
			invoiceTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(33);
		}
		return invoiceTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMovementStatusTypeObject() {
		if (movementStatusTypeObjectEDataType == null) {
			movementStatusTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(43);
		}
		return movementStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMovementTypeTypeObject() {
		if (movementTypeTypeObjectEDataType == null) {
			movementTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(46);
		}
		return movementTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPaymentMechanismTypeObject() {
		if (paymentMechanismTypeObjectEDataType == null) {
			paymentMechanismTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(49);
		}
		return paymentMechanismTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPaymentRefNoType() {
		if (paymentRefNoTypeEDataType == null) {
			paymentRefNoTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(51);
		}
		return paymentRefNoTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPaymentStatusTypeObject() {
		if (paymentStatusTypeObjectEDataType == null) {
			paymentStatusTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(53);
		}
		return paymentStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPaymentTaxCode() {
		if (paymentTaxCodeEDataType == null) {
			paymentTaxCodeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(56);
		}
		return paymentTaxCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPeriodType() {
		if (periodTypeEDataType == null) {
			periodTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(58);
		}
		return periodTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPostalCodePT() {
		if (postalCodePTEDataType == null) {
			postalCodePTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(59);
		}
		return postalCodePTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProductTypeTypeObject() {
		if (productTypeTypeObjectEDataType == null) {
			productTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(62);
		}
		return productTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFdateTimeType() {
		if (saFdateTimeTypeEDataType == null) {
			saFdateTimeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(64);
		}
		return saFdateTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFdateType() {
		if (saFdateTypeEDataType == null) {
			saFdateTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(65);
		}
		return saFdateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFdecimalType() {
		if (saFdecimalTypeEDataType == null) {
			saFdecimalTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(66);
		}
		return saFdecimalTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFmonetaryType() {
		if (saFmonetaryTypeEDataType == null) {
			saFmonetaryTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(67);
		}
		return saFmonetaryTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTAccountingPeriod() {
		if (safptAccountingPeriodEDataType == null) {
			safptAccountingPeriodEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(68);
		}
		return safptAccountingPeriodEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTDateSpan() {
		if (safptDateSpanEDataType == null) {
			safptDateSpanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(69);
		}
		return safptDateSpanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTGLAccountID() {
		if (safptglAccountIDEDataType == null) {
			safptglAccountIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(70);
		}
		return safptglAccountIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTJournalID() {
		if (safptJournalIDEDataType == null) {
			safptJournalIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(71);
		}
		return safptJournalIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTPortugueseTaxExemption() {
		if (safptPortugueseTaxExemptionEDataType == null) {
			safptPortugueseTaxExemptionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(72);
		}
		return safptPortugueseTaxExemptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTPortugueseVatNumber() {
		if (safptPortugueseVatNumberEDataType == null) {
			safptPortugueseVatNumberEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(73);
		}
		return safptPortugueseVatNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTProductID() {
		if (safptProductIDEDataType == null) {
			safptProductIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(74);
		}
		return safptProductIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax100Car() {
		if (safpTtextTypeMandatoryMax100CarEDataType == null) {
			safpTtextTypeMandatoryMax100CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(75);
		}
		return safpTtextTypeMandatoryMax100CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax10Car() {
		if (safpTtextTypeMandatoryMax10CarEDataType == null) {
			safpTtextTypeMandatoryMax10CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(76);
		}
		return safpTtextTypeMandatoryMax10CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax172Car() {
		if (safpTtextTypeMandatoryMax172CarEDataType == null) {
			safpTtextTypeMandatoryMax172CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(77);
		}
		return safpTtextTypeMandatoryMax172CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax200Car() {
		if (safpTtextTypeMandatoryMax200CarEDataType == null) {
			safpTtextTypeMandatoryMax200CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(78);
		}
		return safpTtextTypeMandatoryMax200CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax20Car() {
		if (safpTtextTypeMandatoryMax20CarEDataType == null) {
			safpTtextTypeMandatoryMax20CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(79);
		}
		return safpTtextTypeMandatoryMax20CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax255Car() {
		if (safpTtextTypeMandatoryMax255CarEDataType == null) {
			safpTtextTypeMandatoryMax255CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(80);
		}
		return safpTtextTypeMandatoryMax255CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax30Car() {
		if (safpTtextTypeMandatoryMax30CarEDataType == null) {
			safpTtextTypeMandatoryMax30CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(81);
		}
		return safpTtextTypeMandatoryMax30CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax35Car() {
		if (safpTtextTypeMandatoryMax35CarEDataType == null) {
			safpTtextTypeMandatoryMax35CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(82);
		}
		return safpTtextTypeMandatoryMax35CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax3Car() {
		if (safpTtextTypeMandatoryMax3CarEDataType == null) {
			safpTtextTypeMandatoryMax3CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(83);
		}
		return safpTtextTypeMandatoryMax3CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax40Car() {
		if (safpTtextTypeMandatoryMax40CarEDataType == null) {
			safpTtextTypeMandatoryMax40CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(84);
		}
		return safpTtextTypeMandatoryMax40CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax50Car() {
		if (safpTtextTypeMandatoryMax50CarEDataType == null) {
			safpTtextTypeMandatoryMax50CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(85);
		}
		return safpTtextTypeMandatoryMax50CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax60Car() {
		if (safpTtextTypeMandatoryMax60CarEDataType == null) {
			safpTtextTypeMandatoryMax60CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(86);
		}
		return safpTtextTypeMandatoryMax60CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax70Car() {
		if (safpTtextTypeMandatoryMax70CarEDataType == null) {
			safpTtextTypeMandatoryMax70CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(87);
		}
		return safpTtextTypeMandatoryMax70CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMandatoryMax90Car() {
		if (safpTtextTypeMandatoryMax90CarEDataType == null) {
			safpTtextTypeMandatoryMax90CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(88);
		}
		return safpTtextTypeMandatoryMax90CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTtextTypeMax40Car() {
		if (safpTtextTypeMax40CarEDataType == null) {
			safpTtextTypeMax40CarEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(89);
		}
		return safpTtextTypeMax40CarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFPTTransactionID() {
		if (safptTransactionIDEDataType == null) {
			safptTransactionIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(90);
		}
		return safptTransactionIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFTPTDocArchivalNumber() {
		if (saftptDocArchivalNumberEDataType == null) {
			saftptDocArchivalNumberEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(91);
		}
		return saftptDocArchivalNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFTPTMovementTaxCode() {
		if (saftptMovementTaxCodeEDataType == null) {
			saftptMovementTaxCodeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(92);
		}
		return saftptMovementTaxCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFTPTMovementTaxTypeObject() {
		if (saftptMovementTaxTypeObjectEDataType == null) {
			saftptMovementTaxTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(94);
		}
		return saftptMovementTaxTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFTPTPaymentTypeObject() {
		if (saftptPaymentTypeObjectEDataType == null) {
			saftptPaymentTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(96);
		}
		return saftptPaymentTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFTPTSourceBillingObject() {
		if (saftptSourceBillingObjectEDataType == null) {
			saftptSourceBillingObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(98);
		}
		return saftptSourceBillingObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSAFTPTSourcePaymentObject() {
		if (saftptSourcePaymentObjectEDataType == null) {
			saftptSourcePaymentObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(100);
		}
		return saftptSourcePaymentObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSelfBillingIndicatorType() {
		if (selfBillingIndicatorTypeEDataType == null) {
			selfBillingIndicatorTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(102);
		}
		return selfBillingIndicatorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSupplierCountry() {
		if (supplierCountryEDataType == null) {
			supplierCountryEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(111);
		}
		return supplierCountryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaxAccountingBasisTypeObject() {
		if (taxAccountingBasisTypeObjectEDataType == null) {
			taxAccountingBasisTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(115);
		}
		return taxAccountingBasisTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaxCodeType() {
		if (taxCodeTypeEDataType == null) {
			taxCodeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(116);
		}
		return taxCodeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaxCountryRegionType() {
		if (taxCountryRegionTypeEDataType == null) {
			taxCountryRegionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(117);
		}
		return taxCountryRegionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaxTableEntryTaxCode() {
		if (taxTableEntryTaxCodeEDataType == null) {
			taxTableEntryTaxCodeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(118);
		}
		return taxTableEntryTaxCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaxTypeTypeObject() {
		if (taxTypeTypeObjectEDataType == null) {
			taxTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(122);
		}
		return taxTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getThirdPartiesBillingIndicatorType() {
		if (thirdPartiesBillingIndicatorTypeEDataType == null) {
			thirdPartiesBillingIndicatorTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(123);
		}
		return thirdPartiesBillingIndicatorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransactionTypeTypeObject() {
		if (transactionTypeTypeObjectEDataType == null) {
			transactionTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(126);
		}
		return transactionTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWithholdingTaxTypeTypeObject() {
		if (withholdingTaxTypeTypeObjectEDataType == null) {
			withholdingTaxTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(129);
		}
		return withholdingTaxTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWorkStatusTypeObject() {
		if (workStatusTypeObjectEDataType == null) {
			workStatusTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(133);
		}
		return workStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWorkTypeTypeObject() {
		if (workTypeTypeObjectEDataType == null) {
			workTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_301Package.eNS_URI).getEClassifiers().get(135);
		}
		return workTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _301Factory get_301Factory() {
		return (_301Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("oecd.standard.audit.file.tax.p.t1._0._301." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //_301PackageImpl
