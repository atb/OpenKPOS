/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2.util;

import java.util.List;

import oecd.standard.audit.file.tax.pt1_01_2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package
 * @generated
 */
public class Pt1_01_2Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Pt1_01_2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pt1_01_2Switch() {
		if (modelPackage == null) {
			modelPackage = Pt1_01_2Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Pt1_01_2Package.ADDRESS_STRUCTURE: {
				AddressStructure addressStructure = (AddressStructure)theEObject;
				T result = caseAddressStructure(addressStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.ADDRESS_STRUCTURE_PT: {
				AddressStructurePT addressStructurePT = (AddressStructurePT)theEObject;
				T result = caseAddressStructurePT(addressStructurePT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.AUDIT_FILE_TYPE: {
				AuditFileType auditFileType = (AuditFileType)theEObject;
				T result = caseAuditFileType(auditFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.CREDIT_NOTE_TYPE: {
				CreditNoteType creditNoteType = (CreditNoteType)theEObject;
				T result = caseCreditNoteType(creditNoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.CURRENCY_TYPE: {
				CurrencyType currencyType = (CurrencyType)theEObject;
				T result = caseCurrencyType(currencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.CUSTOMER_TYPE: {
				CustomerType customerType = (CustomerType)theEObject;
				T result = caseCustomerType(customerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.DOCUMENT_TOTALS_TYPE: {
				DocumentTotalsType documentTotalsType = (DocumentTotalsType)theEObject;
				T result = caseDocumentTotalsType(documentTotalsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.GENERAL_LEDGER_ENTRIES_TYPE: {
				GeneralLedgerEntriesType generalLedgerEntriesType = (GeneralLedgerEntriesType)theEObject;
				T result = caseGeneralLedgerEntriesType(generalLedgerEntriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.GENERAL_LEDGER_TYPE: {
				GeneralLedgerType generalLedgerType = (GeneralLedgerType)theEObject;
				T result = caseGeneralLedgerType(generalLedgerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.HEADER_TYPE: {
				HeaderType headerType = (HeaderType)theEObject;
				T result = caseHeaderType(headerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.INVOICE_TYPE: {
				InvoiceType invoiceType = (InvoiceType)theEObject;
				T result = caseInvoiceType(invoiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.JOURNAL_TYPE: {
				JournalType journalType = (JournalType)theEObject;
				T result = caseJournalType(journalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.LINE_TYPE: {
				LineType lineType = (LineType)theEObject;
				T result = caseLineType(lineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.LINE_TYPE1: {
				LineType1 lineType1 = (LineType1)theEObject;
				T result = caseLineType1(lineType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.MASTER_FILES_TYPE: {
				MasterFilesType masterFilesType = (MasterFilesType)theEObject;
				T result = caseMasterFilesType(masterFilesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.ORDER_REFERENCES_TYPE: {
				OrderReferencesType orderReferencesType = (OrderReferencesType)theEObject;
				T result = caseOrderReferencesType(orderReferencesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.PRODUCT_TYPE: {
				ProductType productType = (ProductType)theEObject;
				T result = caseProductType(productType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.REFERENCES_TYPE: {
				ReferencesType referencesType = (ReferencesType)theEObject;
				T result = caseReferencesType(referencesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.SALES_INVOICES_TYPE: {
				SalesInvoicesType salesInvoicesType = (SalesInvoicesType)theEObject;
				T result = caseSalesInvoicesType(salesInvoicesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.SETTLEMENT_TYPE: {
				SettlementType settlementType = (SettlementType)theEObject;
				T result = caseSettlementType(settlementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.SHIPPING_POINT_STRUCTURE: {
				ShippingPointStructure shippingPointStructure = (ShippingPointStructure)theEObject;
				T result = caseShippingPointStructure(shippingPointStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.SOURCE_DOCUMENTS_TYPE: {
				SourceDocumentsType sourceDocumentsType = (SourceDocumentsType)theEObject;
				T result = caseSourceDocumentsType(sourceDocumentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.SUPPLIER_ADDRESS_STRUCTURE: {
				SupplierAddressStructure supplierAddressStructure = (SupplierAddressStructure)theEObject;
				T result = caseSupplierAddressStructure(supplierAddressStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.SUPPLIER_TYPE: {
				SupplierType supplierType = (SupplierType)theEObject;
				T result = caseSupplierType(supplierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.TAX_TABLE_ENTRY_TYPE: {
				TaxTableEntryType taxTableEntryType = (TaxTableEntryType)theEObject;
				T result = caseTaxTableEntryType(taxTableEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.TAX_TABLE_TYPE: {
				TaxTableType taxTableType = (TaxTableType)theEObject;
				T result = caseTaxTableType(taxTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.TAX_TYPE: {
				TaxType taxType = (TaxType)theEObject;
				T result = caseTaxType(taxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Pt1_01_2Package.TRANSACTION_TYPE: {
				TransactionType transactionType = (TransactionType)theEObject;
				T result = caseTransactionType(transactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressStructure(AddressStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Structure PT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Structure PT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressStructurePT(AddressStructurePT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audit File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audit File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuditFileType(AuditFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credit Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditNoteType(CreditNoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencyType(CurrencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerType(CustomerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Totals Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Totals Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentTotalsType(DocumentTotalsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Ledger Entries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Ledger Entries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralLedgerEntriesType(GeneralLedgerEntriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Ledger Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Ledger Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralLedgerType(GeneralLedgerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderType(HeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoiceType(InvoiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJournalType(JournalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineType(LineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineType1(LineType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Files Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Files Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterFilesType(MasterFilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order References Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order References Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderReferencesType(OrderReferencesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductType(ProductType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>References Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>References Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencesType(ReferencesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sales Invoices Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sales Invoices Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalesInvoicesType(SalesInvoicesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settlement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settlement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettlementType(SettlementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipping Point Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipping Point Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShippingPointStructure(ShippingPointStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Documents Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Documents Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentsType(SourceDocumentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplier Address Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplier Address Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplierAddressStructure(SupplierAddressStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplierType(SupplierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tax Table Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tax Table Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaxTableEntryType(TaxTableEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tax Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tax Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaxTableType(TaxTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tax Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tax Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaxType(TaxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionType(TransactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //Pt1_01_2Switch
