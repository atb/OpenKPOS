/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2.util;

import oecd.standard.audit.file.tax.pt1_01_2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package
 * @generated
 */
public class Pt1_01_2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Pt1_01_2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pt1_01_2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Pt1_01_2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pt1_01_2Switch<Adapter> modelSwitch =
		new Pt1_01_2Switch<Adapter>() {
			@Override
			public Adapter caseAddressStructure(AddressStructure object) {
				return createAddressStructureAdapter();
			}
			@Override
			public Adapter caseAddressStructurePT(AddressStructurePT object) {
				return createAddressStructurePTAdapter();
			}
			@Override
			public Adapter caseAuditFileType(AuditFileType object) {
				return createAuditFileTypeAdapter();
			}
			@Override
			public Adapter caseCreditNoteType(CreditNoteType object) {
				return createCreditNoteTypeAdapter();
			}
			@Override
			public Adapter caseCurrencyType(CurrencyType object) {
				return createCurrencyTypeAdapter();
			}
			@Override
			public Adapter caseCustomerType(CustomerType object) {
				return createCustomerTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDocumentTotalsType(DocumentTotalsType object) {
				return createDocumentTotalsTypeAdapter();
			}
			@Override
			public Adapter caseGeneralLedgerEntriesType(GeneralLedgerEntriesType object) {
				return createGeneralLedgerEntriesTypeAdapter();
			}
			@Override
			public Adapter caseGeneralLedgerType(GeneralLedgerType object) {
				return createGeneralLedgerTypeAdapter();
			}
			@Override
			public Adapter caseHeaderType(HeaderType object) {
				return createHeaderTypeAdapter();
			}
			@Override
			public Adapter caseInvoiceType(InvoiceType object) {
				return createInvoiceTypeAdapter();
			}
			@Override
			public Adapter caseJournalType(JournalType object) {
				return createJournalTypeAdapter();
			}
			@Override
			public Adapter caseLineType(LineType object) {
				return createLineTypeAdapter();
			}
			@Override
			public Adapter caseLineType1(LineType1 object) {
				return createLineType1Adapter();
			}
			@Override
			public Adapter caseMasterFilesType(MasterFilesType object) {
				return createMasterFilesTypeAdapter();
			}
			@Override
			public Adapter caseOrderReferencesType(OrderReferencesType object) {
				return createOrderReferencesTypeAdapter();
			}
			@Override
			public Adapter caseProductType(ProductType object) {
				return createProductTypeAdapter();
			}
			@Override
			public Adapter caseReferencesType(ReferencesType object) {
				return createReferencesTypeAdapter();
			}
			@Override
			public Adapter caseSalesInvoicesType(SalesInvoicesType object) {
				return createSalesInvoicesTypeAdapter();
			}
			@Override
			public Adapter caseSettlementType(SettlementType object) {
				return createSettlementTypeAdapter();
			}
			@Override
			public Adapter caseShippingPointStructure(ShippingPointStructure object) {
				return createShippingPointStructureAdapter();
			}
			@Override
			public Adapter caseSourceDocumentsType(SourceDocumentsType object) {
				return createSourceDocumentsTypeAdapter();
			}
			@Override
			public Adapter caseSupplierAddressStructure(SupplierAddressStructure object) {
				return createSupplierAddressStructureAdapter();
			}
			@Override
			public Adapter caseSupplierType(SupplierType object) {
				return createSupplierTypeAdapter();
			}
			@Override
			public Adapter caseTaxTableEntryType(TaxTableEntryType object) {
				return createTaxTableEntryTypeAdapter();
			}
			@Override
			public Adapter caseTaxTableType(TaxTableType object) {
				return createTaxTableTypeAdapter();
			}
			@Override
			public Adapter caseTaxType(TaxType object) {
				return createTaxTypeAdapter();
			}
			@Override
			public Adapter caseTransactionType(TransactionType object) {
				return createTransactionTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructure <em>Address Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructure
	 * @generated
	 */
	public Adapter createAddressStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT <em>Address Structure PT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AddressStructurePT
	 * @generated
	 */
	public Adapter createAddressStructurePTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.AuditFileType <em>Audit File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.AuditFileType
	 * @generated
	 */
	public Adapter createAuditFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.CreditNoteType <em>Credit Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CreditNoteType
	 * @generated
	 */
	public Adapter createCreditNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.CurrencyType <em>Currency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CurrencyType
	 * @generated
	 */
	public Adapter createCurrencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.CustomerType <em>Customer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.CustomerType
	 * @generated
	 */
	public Adapter createCustomerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType <em>Document Totals Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.DocumentTotalsType
	 * @generated
	 */
	public Adapter createDocumentTotalsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType <em>General Ledger Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerEntriesType
	 * @generated
	 */
	public Adapter createGeneralLedgerEntriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType <em>General Ledger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.GeneralLedgerType
	 * @generated
	 */
	public Adapter createGeneralLedgerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.HeaderType
	 * @generated
	 */
	public Adapter createHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.InvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.InvoiceType
	 * @generated
	 */
	public Adapter createInvoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.JournalType <em>Journal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.JournalType
	 * @generated
	 */
	public Adapter createJournalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType
	 * @generated
	 */
	public Adapter createLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.LineType1 <em>Line Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.LineType1
	 * @generated
	 */
	public Adapter createLineType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType <em>Master Files Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.MasterFilesType
	 * @generated
	 */
	public Adapter createMasterFilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.OrderReferencesType <em>Order References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.OrderReferencesType
	 * @generated
	 */
	public Adapter createOrderReferencesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ProductType
	 * @generated
	 */
	public Adapter createProductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.ReferencesType <em>References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ReferencesType
	 * @generated
	 */
	public Adapter createReferencesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType <em>Sales Invoices Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SalesInvoicesType
	 * @generated
	 */
	public Adapter createSalesInvoicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.SettlementType <em>Settlement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SettlementType
	 * @generated
	 */
	public Adapter createSettlementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure <em>Shipping Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.ShippingPointStructure
	 * @generated
	 */
	public Adapter createShippingPointStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.SourceDocumentsType <em>Source Documents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SourceDocumentsType
	 * @generated
	 */
	public Adapter createSourceDocumentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure <em>Supplier Address Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierAddressStructure
	 * @generated
	 */
	public Adapter createSupplierAddressStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.SupplierType <em>Supplier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.SupplierType
	 * @generated
	 */
	public Adapter createSupplierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType <em>Tax Table Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableEntryType
	 * @generated
	 */
	public Adapter createTaxTableEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxTableType <em>Tax Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxTableType
	 * @generated
	 */
	public Adapter createTaxTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.TaxType <em>Tax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TaxType
	 * @generated
	 */
	public Adapter createTaxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.pt1_01_2.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.pt1_01_2.TransactionType
	 * @generated
	 */
	public Adapter createTransactionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Pt1_01_2AdapterFactory
