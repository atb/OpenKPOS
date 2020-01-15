/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201.util;

import java.util.List;

import oecd.standard.audit.file.tax.p.t1._0._201.*;

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
 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package
 * @generated
 */
public class _201Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _201Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _201Switch() {
		if (modelPackage == null) {
			modelPackage = _201Package.eINSTANCE;
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
			case _201Package.ADDRESS_STRUCTURE: {
				AddressStructure addressStructure = (AddressStructure)theEObject;
				T result = caseAddressStructure(addressStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.ADDRESS_STRUCTURE_PT: {
				AddressStructurePT addressStructurePT = (AddressStructurePT)theEObject;
				T result = caseAddressStructurePT(addressStructurePT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.AUDIT_FILE_TYPE: {
				AuditFileType auditFileType = (AuditFileType)theEObject;
				T result = caseAuditFileType(auditFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.CURRENCY: {
				Currency currency = (Currency)theEObject;
				T result = caseCurrency(currency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.CUSTOMER_TYPE: {
				CustomerType customerType = (CustomerType)theEObject;
				T result = caseCustomerType(customerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.DOCUMENT_STATUS_TYPE: {
				DocumentStatusType documentStatusType = (DocumentStatusType)theEObject;
				T result = caseDocumentStatusType(documentStatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.DOCUMENT_STATUS_TYPE1: {
				DocumentStatusType1 documentStatusType1 = (DocumentStatusType1)theEObject;
				T result = caseDocumentStatusType1(documentStatusType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.DOCUMENT_STATUS_TYPE2: {
				DocumentStatusType2 documentStatusType2 = (DocumentStatusType2)theEObject;
				T result = caseDocumentStatusType2(documentStatusType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.DOCUMENT_TOTALS_TYPE: {
				DocumentTotalsType documentTotalsType = (DocumentTotalsType)theEObject;
				T result = caseDocumentTotalsType(documentTotalsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.DOCUMENT_TOTALS_TYPE1: {
				DocumentTotalsType1 documentTotalsType1 = (DocumentTotalsType1)theEObject;
				T result = caseDocumentTotalsType1(documentTotalsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.DOCUMENT_TOTALS_TYPE2: {
				DocumentTotalsType2 documentTotalsType2 = (DocumentTotalsType2)theEObject;
				T result = caseDocumentTotalsType2(documentTotalsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.GENERAL_LEDGER_ENTRIES_TYPE: {
				GeneralLedgerEntriesType generalLedgerEntriesType = (GeneralLedgerEntriesType)theEObject;
				T result = caseGeneralLedgerEntriesType(generalLedgerEntriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.GENERAL_LEDGER_TYPE: {
				GeneralLedgerType generalLedgerType = (GeneralLedgerType)theEObject;
				T result = caseGeneralLedgerType(generalLedgerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.HEADER_TYPE: {
				HeaderType headerType = (HeaderType)theEObject;
				T result = caseHeaderType(headerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.INVOICE_TYPE: {
				InvoiceType invoiceType = (InvoiceType)theEObject;
				T result = caseInvoiceType(invoiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.JOURNAL_TYPE: {
				JournalType journalType = (JournalType)theEObject;
				T result = caseJournalType(journalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.LINE_TYPE: {
				LineType lineType = (LineType)theEObject;
				T result = caseLineType(lineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.LINE_TYPE1: {
				LineType1 lineType1 = (LineType1)theEObject;
				T result = caseLineType1(lineType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.LINE_TYPE2: {
				LineType2 lineType2 = (LineType2)theEObject;
				T result = caseLineType2(lineType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.LINE_TYPE3: {
				LineType3 lineType3 = (LineType3)theEObject;
				T result = caseLineType3(lineType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.MASTER_FILES_TYPE: {
				MasterFilesType masterFilesType = (MasterFilesType)theEObject;
				T result = caseMasterFilesType(masterFilesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.MOVEMENT_OF_GOODS_TYPE: {
				MovementOfGoodsType movementOfGoodsType = (MovementOfGoodsType)theEObject;
				T result = caseMovementOfGoodsType(movementOfGoodsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.MOVEMENT_TAX: {
				MovementTax movementTax = (MovementTax)theEObject;
				T result = caseMovementTax(movementTax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.ORDER_REFERENCES: {
				OrderReferences orderReferences = (OrderReferences)theEObject;
				T result = caseOrderReferences(orderReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.PAYMENT: {
				Payment payment = (Payment)theEObject;
				T result = casePayment(payment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.PRODUCT_TYPE: {
				ProductType productType = (ProductType)theEObject;
				T result = caseProductType(productType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.REFERENCES: {
				References references = (References)theEObject;
				T result = caseReferences(references);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.SALES_INVOICES_TYPE: {
				SalesInvoicesType salesInvoicesType = (SalesInvoicesType)theEObject;
				T result = caseSalesInvoicesType(salesInvoicesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.SETTLEMENT: {
				Settlement settlement = (Settlement)theEObject;
				T result = caseSettlement(settlement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.SHIPPING_POINT_STRUCTURE: {
				ShippingPointStructure shippingPointStructure = (ShippingPointStructure)theEObject;
				T result = caseShippingPointStructure(shippingPointStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.SOURCE_DOCUMENTS_TYPE: {
				SourceDocumentsType sourceDocumentsType = (SourceDocumentsType)theEObject;
				T result = caseSourceDocumentsType(sourceDocumentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.STOCK_MOVEMENT_TYPE: {
				StockMovementType stockMovementType = (StockMovementType)theEObject;
				T result = caseStockMovementType(stockMovementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.SUPPLIER_ADDRESS_STRUCTURE: {
				SupplierAddressStructure supplierAddressStructure = (SupplierAddressStructure)theEObject;
				T result = caseSupplierAddressStructure(supplierAddressStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.SUPPLIER_TYPE: {
				SupplierType supplierType = (SupplierType)theEObject;
				T result = caseSupplierType(supplierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.TAX: {
				Tax tax = (Tax)theEObject;
				T result = caseTax(tax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.TAX_TABLE_ENTRY_TYPE: {
				TaxTableEntryType taxTableEntryType = (TaxTableEntryType)theEObject;
				T result = caseTaxTableEntryType(taxTableEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.TAX_TABLE_TYPE: {
				TaxTableType taxTableType = (TaxTableType)theEObject;
				T result = caseTaxTableType(taxTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.TRANSACTION_TYPE: {
				TransactionType transactionType = (TransactionType)theEObject;
				T result = caseTransactionType(transactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.WITHHOLDING_TAX: {
				WithholdingTax withholdingTax = (WithholdingTax)theEObject;
				T result = caseWithholdingTax(withholdingTax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.WORK_DOCUMENT_TYPE: {
				WorkDocumentType workDocumentType = (WorkDocumentType)theEObject;
				T result = caseWorkDocumentType(workDocumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _201Package.WORKING_DOCUMENTS_TYPE: {
				WorkingDocumentsType workingDocumentsType = (WorkingDocumentsType)theEObject;
				T result = caseWorkingDocumentsType(workingDocumentsType);
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
	 * Returns the result of interpreting the object as an instance of '<em>Currency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrency(Currency object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Document Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentStatusType(DocumentStatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Status Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Status Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentStatusType1(DocumentStatusType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Status Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Status Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentStatusType2(DocumentStatusType2 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Document Totals Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Totals Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentTotalsType1(DocumentTotalsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Totals Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Totals Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentTotalsType2(DocumentTotalsType2 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Line Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineType2(LineType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineType3(LineType3 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Movement Of Goods Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movement Of Goods Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovementOfGoodsType(MovementOfGoodsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movement Tax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movement Tax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovementTax(MovementTax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order References</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order References</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderReferences(OrderReferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayment(Payment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>References</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>References</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferences(References object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Settlement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settlement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettlement(Settlement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Stock Movement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock Movement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStockMovementType(StockMovementType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Tax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTax(Tax object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Withholding Tax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Withholding Tax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithholdingTax(WithholdingTax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkDocumentType(WorkDocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Working Documents Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Working Documents Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkingDocumentsType(WorkingDocumentsType object) {
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

} //_201Switch
