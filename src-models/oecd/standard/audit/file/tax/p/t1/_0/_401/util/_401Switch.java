/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.util;

import java.util.List;

import oecd.standard.audit.file.tax.p.t1._0._401.*;

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
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package
 * @generated
 */
public class _401Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _401Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _401Switch() {
		if (modelPackage == null) {
			modelPackage = _401Package.eINSTANCE;
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
			case _401Package.ACCOUNT_TYPE: {
				AccountType accountType = (AccountType)theEObject;
				T result = caseAccountType(accountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.ADDRESS_STRUCTURE: {
				AddressStructure addressStructure = (AddressStructure)theEObject;
				T result = caseAddressStructure(addressStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.ADDRESS_STRUCTURE_PT: {
				AddressStructurePT addressStructurePT = (AddressStructurePT)theEObject;
				T result = caseAddressStructurePT(addressStructurePT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.AUDIT_FILE_TYPE: {
				AuditFileType auditFileType = (AuditFileType)theEObject;
				T result = caseAuditFileType(auditFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.CREDIT_LINE_TYPE: {
				CreditLineType creditLineType = (CreditLineType)theEObject;
				T result = caseCreditLineType(creditLineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.CURRENCY: {
				Currency currency = (Currency)theEObject;
				T result = caseCurrency(currency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.CUSTOMER_TYPE: {
				CustomerType customerType = (CustomerType)theEObject;
				T result = caseCustomerType(customerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.CUSTOMS_DETAILS: {
				CustomsDetails customsDetails = (CustomsDetails)theEObject;
				T result = caseCustomsDetails(customsDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.CUSTOMS_INFORMATION: {
				CustomsInformation customsInformation = (CustomsInformation)theEObject;
				T result = caseCustomsInformation(customsInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.DEBIT_LINE_TYPE: {
				DebitLineType debitLineType = (DebitLineType)theEObject;
				T result = caseDebitLineType(debitLineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.DOCUMENT_STATUS_TYPE: {
				DocumentStatusType documentStatusType = (DocumentStatusType)theEObject;
				T result = caseDocumentStatusType(documentStatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.DOCUMENT_STATUS_TYPE1: {
				DocumentStatusType1 documentStatusType1 = (DocumentStatusType1)theEObject;
				T result = caseDocumentStatusType1(documentStatusType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.DOCUMENT_STATUS_TYPE2: {
				DocumentStatusType2 documentStatusType2 = (DocumentStatusType2)theEObject;
				T result = caseDocumentStatusType2(documentStatusType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.DOCUMENT_STATUS_TYPE3: {
				DocumentStatusType3 documentStatusType3 = (DocumentStatusType3)theEObject;
				T result = caseDocumentStatusType3(documentStatusType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.DOCUMENT_TOTALS_TYPE: {
				DocumentTotalsType documentTotalsType = (DocumentTotalsType)theEObject;
				T result = caseDocumentTotalsType(documentTotalsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.DOCUMENT_TOTALS_TYPE1: {
				DocumentTotalsType1 documentTotalsType1 = (DocumentTotalsType1)theEObject;
				T result = caseDocumentTotalsType1(documentTotalsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.DOCUMENT_TOTALS_TYPE2: {
				DocumentTotalsType2 documentTotalsType2 = (DocumentTotalsType2)theEObject;
				T result = caseDocumentTotalsType2(documentTotalsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.DOCUMENT_TOTALS_TYPE3: {
				DocumentTotalsType3 documentTotalsType3 = (DocumentTotalsType3)theEObject;
				T result = caseDocumentTotalsType3(documentTotalsType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE: {
				GeneralLedgerAccountsType generalLedgerAccountsType = (GeneralLedgerAccountsType)theEObject;
				T result = caseGeneralLedgerAccountsType(generalLedgerAccountsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.GENERAL_LEDGER_ENTRIES_TYPE: {
				GeneralLedgerEntriesType generalLedgerEntriesType = (GeneralLedgerEntriesType)theEObject;
				T result = caseGeneralLedgerEntriesType(generalLedgerEntriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.HEADER_TYPE: {
				HeaderType headerType = (HeaderType)theEObject;
				T result = caseHeaderType(headerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.INVOICE_TYPE: {
				InvoiceType invoiceType = (InvoiceType)theEObject;
				T result = caseInvoiceType(invoiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.JOURNAL_TYPE: {
				JournalType journalType = (JournalType)theEObject;
				T result = caseJournalType(journalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.LINES_TYPE: {
				LinesType linesType = (LinesType)theEObject;
				T result = caseLinesType(linesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.LINE_TYPE: {
				LineType lineType = (LineType)theEObject;
				T result = caseLineType(lineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.LINE_TYPE1: {
				LineType1 lineType1 = (LineType1)theEObject;
				T result = caseLineType1(lineType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.LINE_TYPE2: {
				LineType2 lineType2 = (LineType2)theEObject;
				T result = caseLineType2(lineType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.LINE_TYPE3: {
				LineType3 lineType3 = (LineType3)theEObject;
				T result = caseLineType3(lineType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.MASTER_FILES_TYPE: {
				MasterFilesType masterFilesType = (MasterFilesType)theEObject;
				T result = caseMasterFilesType(masterFilesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.MOVEMENT_OF_GOODS_TYPE: {
				MovementOfGoodsType movementOfGoodsType = (MovementOfGoodsType)theEObject;
				T result = caseMovementOfGoodsType(movementOfGoodsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.MOVEMENT_TAX: {
				MovementTax movementTax = (MovementTax)theEObject;
				T result = caseMovementTax(movementTax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.ORDER_REFERENCES: {
				OrderReferences orderReferences = (OrderReferences)theEObject;
				T result = caseOrderReferences(orderReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.PAYMENT_METHOD: {
				PaymentMethod paymentMethod = (PaymentMethod)theEObject;
				T result = casePaymentMethod(paymentMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.PAYMENTS_TYPE: {
				PaymentsType paymentsType = (PaymentsType)theEObject;
				T result = casePaymentsType(paymentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.PAYMENT_TAX: {
				PaymentTax paymentTax = (PaymentTax)theEObject;
				T result = casePaymentTax(paymentTax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.PAYMENT_TYPE: {
				PaymentType paymentType = (PaymentType)theEObject;
				T result = casePaymentType(paymentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.PRODUCT_SERIAL_NUMBER: {
				ProductSerialNumber productSerialNumber = (ProductSerialNumber)theEObject;
				T result = caseProductSerialNumber(productSerialNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.PRODUCT_TYPE: {
				ProductType productType = (ProductType)theEObject;
				T result = caseProductType(productType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.REFERENCES: {
				References references = (References)theEObject;
				T result = caseReferences(references);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.SALES_INVOICES_TYPE: {
				SalesInvoicesType salesInvoicesType = (SalesInvoicesType)theEObject;
				T result = caseSalesInvoicesType(salesInvoicesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.SETTLEMENT: {
				Settlement settlement = (Settlement)theEObject;
				T result = caseSettlement(settlement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.SETTLEMENT_TYPE: {
				SettlementType settlementType = (SettlementType)theEObject;
				T result = caseSettlementType(settlementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.SHIPPING_POINT_STRUCTURE: {
				ShippingPointStructure shippingPointStructure = (ShippingPointStructure)theEObject;
				T result = caseShippingPointStructure(shippingPointStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.SOURCE_DOCUMENT_ID_TYPE: {
				SourceDocumentIDType sourceDocumentIDType = (SourceDocumentIDType)theEObject;
				T result = caseSourceDocumentIDType(sourceDocumentIDType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.SOURCE_DOCUMENTS_TYPE: {
				SourceDocumentsType sourceDocumentsType = (SourceDocumentsType)theEObject;
				T result = caseSourceDocumentsType(sourceDocumentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.SPECIAL_REGIMES: {
				SpecialRegimes specialRegimes = (SpecialRegimes)theEObject;
				T result = caseSpecialRegimes(specialRegimes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.STOCK_MOVEMENT_TYPE: {
				StockMovementType stockMovementType = (StockMovementType)theEObject;
				T result = caseStockMovementType(stockMovementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.SUPPLIER_ADDRESS_STRUCTURE: {
				SupplierAddressStructure supplierAddressStructure = (SupplierAddressStructure)theEObject;
				T result = caseSupplierAddressStructure(supplierAddressStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.SUPPLIER_TYPE: {
				SupplierType supplierType = (SupplierType)theEObject;
				T result = caseSupplierType(supplierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.TAX: {
				Tax tax = (Tax)theEObject;
				T result = caseTax(tax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.TAX_TABLE_ENTRY_TYPE: {
				TaxTableEntryType taxTableEntryType = (TaxTableEntryType)theEObject;
				T result = caseTaxTableEntryType(taxTableEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.TAX_TABLE_TYPE: {
				TaxTableType taxTableType = (TaxTableType)theEObject;
				T result = caseTaxTableType(taxTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.TRANSACTION_TYPE: {
				TransactionType transactionType = (TransactionType)theEObject;
				T result = caseTransactionType(transactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.WITHHOLDING_TAX: {
				WithholdingTax withholdingTax = (WithholdingTax)theEObject;
				T result = caseWithholdingTax(withholdingTax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.WORK_DOCUMENT_TYPE: {
				WorkDocumentType workDocumentType = (WorkDocumentType)theEObject;
				T result = caseWorkDocumentType(workDocumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _401Package.WORKING_DOCUMENTS_TYPE: {
				WorkingDocumentsType workingDocumentsType = (WorkingDocumentsType)theEObject;
				T result = caseWorkingDocumentsType(workingDocumentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountType(AccountType object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Credit Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditLineType(CreditLineType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Customs Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customs Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomsDetails(CustomsDetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customs Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customs Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomsInformation(CustomsInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Debit Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Debit Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDebitLineType(DebitLineType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Document Status Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Status Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentStatusType3(DocumentStatusType3 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Document Totals Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Totals Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentTotalsType3(DocumentTotalsType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Ledger Accounts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Ledger Accounts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralLedgerAccountsType(GeneralLedgerAccountsType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Lines Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lines Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinesType(LinesType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Payment Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentMethod(PaymentMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentsType(PaymentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Tax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Tax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentTax(PaymentTax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentType(PaymentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Serial Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Serial Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSerialNumber(ProductSerialNumber object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Source Document ID Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Document ID Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDocumentIDType(SourceDocumentIDType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Special Regimes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Regimes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialRegimes(SpecialRegimes object) {
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

} //_401Switch
