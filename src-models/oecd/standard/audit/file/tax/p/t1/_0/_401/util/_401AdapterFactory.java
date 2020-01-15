/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.util;

import oecd.standard.audit.file.tax.p.t1._0._401.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package
 * @generated
 */
public class _401AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _401Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _401AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _401Package.eINSTANCE;
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
	protected _401Switch<Adapter> modelSwitch =
		new _401Switch<Adapter>() {
			@Override
			public Adapter caseAccountType(AccountType object) {
				return createAccountTypeAdapter();
			}
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
			public Adapter caseCreditLineType(CreditLineType object) {
				return createCreditLineTypeAdapter();
			}
			@Override
			public Adapter caseCurrency(Currency object) {
				return createCurrencyAdapter();
			}
			@Override
			public Adapter caseCustomerType(CustomerType object) {
				return createCustomerTypeAdapter();
			}
			@Override
			public Adapter caseCustomsDetails(CustomsDetails object) {
				return createCustomsDetailsAdapter();
			}
			@Override
			public Adapter caseCustomsInformation(CustomsInformation object) {
				return createCustomsInformationAdapter();
			}
			@Override
			public Adapter caseDebitLineType(DebitLineType object) {
				return createDebitLineTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDocumentStatusType(DocumentStatusType object) {
				return createDocumentStatusTypeAdapter();
			}
			@Override
			public Adapter caseDocumentStatusType1(DocumentStatusType1 object) {
				return createDocumentStatusType1Adapter();
			}
			@Override
			public Adapter caseDocumentStatusType2(DocumentStatusType2 object) {
				return createDocumentStatusType2Adapter();
			}
			@Override
			public Adapter caseDocumentStatusType3(DocumentStatusType3 object) {
				return createDocumentStatusType3Adapter();
			}
			@Override
			public Adapter caseDocumentTotalsType(DocumentTotalsType object) {
				return createDocumentTotalsTypeAdapter();
			}
			@Override
			public Adapter caseDocumentTotalsType1(DocumentTotalsType1 object) {
				return createDocumentTotalsType1Adapter();
			}
			@Override
			public Adapter caseDocumentTotalsType2(DocumentTotalsType2 object) {
				return createDocumentTotalsType2Adapter();
			}
			@Override
			public Adapter caseDocumentTotalsType3(DocumentTotalsType3 object) {
				return createDocumentTotalsType3Adapter();
			}
			@Override
			public Adapter caseGeneralLedgerAccountsType(GeneralLedgerAccountsType object) {
				return createGeneralLedgerAccountsTypeAdapter();
			}
			@Override
			public Adapter caseGeneralLedgerEntriesType(GeneralLedgerEntriesType object) {
				return createGeneralLedgerEntriesTypeAdapter();
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
			public Adapter caseLinesType(LinesType object) {
				return createLinesTypeAdapter();
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
			public Adapter caseLineType2(LineType2 object) {
				return createLineType2Adapter();
			}
			@Override
			public Adapter caseLineType3(LineType3 object) {
				return createLineType3Adapter();
			}
			@Override
			public Adapter caseMasterFilesType(MasterFilesType object) {
				return createMasterFilesTypeAdapter();
			}
			@Override
			public Adapter caseMovementOfGoodsType(MovementOfGoodsType object) {
				return createMovementOfGoodsTypeAdapter();
			}
			@Override
			public Adapter caseMovementTax(MovementTax object) {
				return createMovementTaxAdapter();
			}
			@Override
			public Adapter caseOrderReferences(OrderReferences object) {
				return createOrderReferencesAdapter();
			}
			@Override
			public Adapter casePaymentMethod(PaymentMethod object) {
				return createPaymentMethodAdapter();
			}
			@Override
			public Adapter casePaymentsType(PaymentsType object) {
				return createPaymentsTypeAdapter();
			}
			@Override
			public Adapter casePaymentTax(PaymentTax object) {
				return createPaymentTaxAdapter();
			}
			@Override
			public Adapter casePaymentType(PaymentType object) {
				return createPaymentTypeAdapter();
			}
			@Override
			public Adapter caseProductSerialNumber(ProductSerialNumber object) {
				return createProductSerialNumberAdapter();
			}
			@Override
			public Adapter caseProductType(ProductType object) {
				return createProductTypeAdapter();
			}
			@Override
			public Adapter caseReferences(References object) {
				return createReferencesAdapter();
			}
			@Override
			public Adapter caseSalesInvoicesType(SalesInvoicesType object) {
				return createSalesInvoicesTypeAdapter();
			}
			@Override
			public Adapter caseSettlement(Settlement object) {
				return createSettlementAdapter();
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
			public Adapter caseSourceDocumentIDType(SourceDocumentIDType object) {
				return createSourceDocumentIDTypeAdapter();
			}
			@Override
			public Adapter caseSourceDocumentsType(SourceDocumentsType object) {
				return createSourceDocumentsTypeAdapter();
			}
			@Override
			public Adapter caseSpecialRegimes(SpecialRegimes object) {
				return createSpecialRegimesAdapter();
			}
			@Override
			public Adapter caseStockMovementType(StockMovementType object) {
				return createStockMovementTypeAdapter();
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
			public Adapter caseTax(Tax object) {
				return createTaxAdapter();
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
			public Adapter caseTransactionType(TransactionType object) {
				return createTransactionTypeAdapter();
			}
			@Override
			public Adapter caseWithholdingTax(WithholdingTax object) {
				return createWithholdingTaxAdapter();
			}
			@Override
			public Adapter caseWorkDocumentType(WorkDocumentType object) {
				return createWorkDocumentTypeAdapter();
			}
			@Override
			public Adapter caseWorkingDocumentsType(WorkingDocumentsType object) {
				return createWorkingDocumentsTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.AccountType
	 * @generated
	 */
	public Adapter createAccountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.AddressStructure <em>Address Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.AddressStructure
	 * @generated
	 */
	public Adapter createAddressStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.AddressStructurePT <em>Address Structure PT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.AddressStructurePT
	 * @generated
	 */
	public Adapter createAddressStructurePTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.AuditFileType <em>Audit File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.AuditFileType
	 * @generated
	 */
	public Adapter createAuditFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.CreditLineType <em>Credit Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.CreditLineType
	 * @generated
	 */
	public Adapter createCreditLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.Currency
	 * @generated
	 */
	public Adapter createCurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.CustomerType <em>Customer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.CustomerType
	 * @generated
	 */
	public Adapter createCustomerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.CustomsDetails <em>Customs Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.CustomsDetails
	 * @generated
	 */
	public Adapter createCustomsDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.CustomsInformation <em>Customs Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.CustomsInformation
	 * @generated
	 */
	public Adapter createCustomsInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType <em>Debit Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType
	 * @generated
	 */
	public Adapter createDebitLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType <em>Document Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType
	 * @generated
	 */
	public Adapter createDocumentStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType1 <em>Document Status Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType1
	 * @generated
	 */
	public Adapter createDocumentStatusType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType2 <em>Document Status Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType2
	 * @generated
	 */
	public Adapter createDocumentStatusType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3 <em>Document Status Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3
	 * @generated
	 */
	public Adapter createDocumentStatusType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentTotalsType <em>Document Totals Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.DocumentTotalsType
	 * @generated
	 */
	public Adapter createDocumentTotalsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentTotalsType1 <em>Document Totals Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.DocumentTotalsType1
	 * @generated
	 */
	public Adapter createDocumentTotalsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentTotalsType2 <em>Document Totals Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.DocumentTotalsType2
	 * @generated
	 */
	public Adapter createDocumentTotalsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentTotalsType3 <em>Document Totals Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.DocumentTotalsType3
	 * @generated
	 */
	public Adapter createDocumentTotalsType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerAccountsType <em>General Ledger Accounts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerAccountsType
	 * @generated
	 */
	public Adapter createGeneralLedgerAccountsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerEntriesType <em>General Ledger Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerEntriesType
	 * @generated
	 */
	public Adapter createGeneralLedgerEntriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.HeaderType
	 * @generated
	 */
	public Adapter createHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType
	 * @generated
	 */
	public Adapter createInvoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.JournalType <em>Journal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.JournalType
	 * @generated
	 */
	public Adapter createJournalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.LinesType <em>Lines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.LinesType
	 * @generated
	 */
	public Adapter createLinesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.LineType
	 * @generated
	 */
	public Adapter createLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1 <em>Line Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.LineType1
	 * @generated
	 */
	public Adapter createLineType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType2 <em>Line Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.LineType2
	 * @generated
	 */
	public Adapter createLineType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType3 <em>Line Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.LineType3
	 * @generated
	 */
	public Adapter createLineType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.MasterFilesType <em>Master Files Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.MasterFilesType
	 * @generated
	 */
	public Adapter createMasterFilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.MovementOfGoodsType <em>Movement Of Goods Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.MovementOfGoodsType
	 * @generated
	 */
	public Adapter createMovementOfGoodsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.MovementTax <em>Movement Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.MovementTax
	 * @generated
	 */
	public Adapter createMovementTaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.OrderReferences <em>Order References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.OrderReferences
	 * @generated
	 */
	public Adapter createOrderReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.PaymentMethod
	 * @generated
	 */
	public Adapter createPaymentMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentsType <em>Payments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.PaymentsType
	 * @generated
	 */
	public Adapter createPaymentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentTax <em>Payment Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.PaymentTax
	 * @generated
	 */
	public Adapter createPaymentTaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.PaymentType
	 * @generated
	 */
	public Adapter createPaymentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductSerialNumber <em>Product Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.ProductSerialNumber
	 * @generated
	 */
	public Adapter createProductSerialNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.ProductType
	 * @generated
	 */
	public Adapter createProductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.References <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.References
	 * @generated
	 */
	public Adapter createReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.SalesInvoicesType <em>Sales Invoices Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.SalesInvoicesType
	 * @generated
	 */
	public Adapter createSalesInvoicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.Settlement <em>Settlement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.Settlement
	 * @generated
	 */
	public Adapter createSettlementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.SettlementType <em>Settlement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.SettlementType
	 * @generated
	 */
	public Adapter createSettlementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.ShippingPointStructure <em>Shipping Point Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.ShippingPointStructure
	 * @generated
	 */
	public Adapter createShippingPointStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentIDType <em>Source Document ID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentIDType
	 * @generated
	 */
	public Adapter createSourceDocumentIDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentsType <em>Source Documents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.SourceDocumentsType
	 * @generated
	 */
	public Adapter createSourceDocumentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.SpecialRegimes <em>Special Regimes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.SpecialRegimes
	 * @generated
	 */
	public Adapter createSpecialRegimesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType <em>Stock Movement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType
	 * @generated
	 */
	public Adapter createStockMovementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.SupplierAddressStructure <em>Supplier Address Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.SupplierAddressStructure
	 * @generated
	 */
	public Adapter createSupplierAddressStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.SupplierType <em>Supplier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.SupplierType
	 * @generated
	 */
	public Adapter createSupplierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax <em>Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.Tax
	 * @generated
	 */
	public Adapter createTaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.TaxTableEntryType <em>Tax Table Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxTableEntryType
	 * @generated
	 */
	public Adapter createTaxTableEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.TaxTableType <em>Tax Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxTableType
	 * @generated
	 */
	public Adapter createTaxTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TransactionType
	 * @generated
	 */
	public Adapter createTransactionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.WithholdingTax <em>Withholding Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.WithholdingTax
	 * @generated
	 */
	public Adapter createWithholdingTaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType <em>Work Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType
	 * @generated
	 */
	public Adapter createWorkDocumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkingDocumentsType <em>Working Documents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.WorkingDocumentsType
	 * @generated
	 */
	public Adapter createWorkingDocumentsTypeAdapter() {
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

} //_401AdapterFactory
