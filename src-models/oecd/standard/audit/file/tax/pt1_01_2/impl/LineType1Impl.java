/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2.impl;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.pt1_01_2.LineType1;
import oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.LineType1Impl#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.LineType1Impl#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.LineType1Impl#getSourceDocumentID <em>Source Document ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.LineType1Impl#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.LineType1Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.LineType1Impl#getDebitAmount <em>Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.LineType1Impl#getCreditAmount <em>Credit Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineType1Impl extends EObjectImpl implements LineType1 {
	/**
	 * The default value of the '{@link #getRecordID() <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordID()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordID() <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordID()
	 * @generated
	 * @ordered
	 */
	protected String recordID = RECORD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected String accountID = ACCOUNT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceDocumentID() <em>Source Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocumentID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DOCUMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceDocumentID() <em>Source Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocumentID()
	 * @generated
	 * @ordered
	 */
	protected String sourceDocumentID = SOURCE_DOCUMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemEntryDate() <em>System Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemEntryDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SYSTEM_ENTRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemEntryDate() <em>System Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemEntryDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar systemEntryDate = SYSTEM_ENTRY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDebitAmount() <em>Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DEBIT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebitAmount() <em>Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal debitAmount = DEBIT_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreditAmount() <em>Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CREDIT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreditAmount() <em>Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal creditAmount = CREDIT_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01_2Package.Literals.LINE_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecordID() {
		return recordID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordID(String newRecordID) {
		String oldRecordID = recordID;
		recordID = newRecordID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.LINE_TYPE1__RECORD_ID, oldRecordID, recordID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountID() {
		return accountID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountID(String newAccountID) {
		String oldAccountID = accountID;
		accountID = newAccountID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.LINE_TYPE1__ACCOUNT_ID, oldAccountID, accountID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDocumentID() {
		return sourceDocumentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDocumentID(String newSourceDocumentID) {
		String oldSourceDocumentID = sourceDocumentID;
		sourceDocumentID = newSourceDocumentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.LINE_TYPE1__SOURCE_DOCUMENT_ID, oldSourceDocumentID, sourceDocumentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getSystemEntryDate() {
		return systemEntryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemEntryDate(XMLGregorianCalendar newSystemEntryDate) {
		XMLGregorianCalendar oldSystemEntryDate = systemEntryDate;
		systemEntryDate = newSystemEntryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.LINE_TYPE1__SYSTEM_ENTRY_DATE, oldSystemEntryDate, systemEntryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.LINE_TYPE1__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDebitAmount() {
		return debitAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebitAmount(BigDecimal newDebitAmount) {
		BigDecimal oldDebitAmount = debitAmount;
		debitAmount = newDebitAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.LINE_TYPE1__DEBIT_AMOUNT, oldDebitAmount, debitAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCreditAmount() {
		return creditAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditAmount(BigDecimal newCreditAmount) {
		BigDecimal oldCreditAmount = creditAmount;
		creditAmount = newCreditAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.LINE_TYPE1__CREDIT_AMOUNT, oldCreditAmount, creditAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pt1_01_2Package.LINE_TYPE1__RECORD_ID:
				return getRecordID();
			case Pt1_01_2Package.LINE_TYPE1__ACCOUNT_ID:
				return getAccountID();
			case Pt1_01_2Package.LINE_TYPE1__SOURCE_DOCUMENT_ID:
				return getSourceDocumentID();
			case Pt1_01_2Package.LINE_TYPE1__SYSTEM_ENTRY_DATE:
				return getSystemEntryDate();
			case Pt1_01_2Package.LINE_TYPE1__DESCRIPTION:
				return getDescription();
			case Pt1_01_2Package.LINE_TYPE1__DEBIT_AMOUNT:
				return getDebitAmount();
			case Pt1_01_2Package.LINE_TYPE1__CREDIT_AMOUNT:
				return getCreditAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Pt1_01_2Package.LINE_TYPE1__RECORD_ID:
				setRecordID((String)newValue);
				return;
			case Pt1_01_2Package.LINE_TYPE1__ACCOUNT_ID:
				setAccountID((String)newValue);
				return;
			case Pt1_01_2Package.LINE_TYPE1__SOURCE_DOCUMENT_ID:
				setSourceDocumentID((String)newValue);
				return;
			case Pt1_01_2Package.LINE_TYPE1__SYSTEM_ENTRY_DATE:
				setSystemEntryDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.LINE_TYPE1__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Pt1_01_2Package.LINE_TYPE1__DEBIT_AMOUNT:
				setDebitAmount((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.LINE_TYPE1__CREDIT_AMOUNT:
				setCreditAmount((BigDecimal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Pt1_01_2Package.LINE_TYPE1__RECORD_ID:
				setRecordID(RECORD_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.LINE_TYPE1__ACCOUNT_ID:
				setAccountID(ACCOUNT_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.LINE_TYPE1__SOURCE_DOCUMENT_ID:
				setSourceDocumentID(SOURCE_DOCUMENT_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.LINE_TYPE1__SYSTEM_ENTRY_DATE:
				setSystemEntryDate(SYSTEM_ENTRY_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.LINE_TYPE1__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Pt1_01_2Package.LINE_TYPE1__DEBIT_AMOUNT:
				setDebitAmount(DEBIT_AMOUNT_EDEFAULT);
				return;
			case Pt1_01_2Package.LINE_TYPE1__CREDIT_AMOUNT:
				setCreditAmount(CREDIT_AMOUNT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Pt1_01_2Package.LINE_TYPE1__RECORD_ID:
				return RECORD_ID_EDEFAULT == null ? recordID != null : !RECORD_ID_EDEFAULT.equals(recordID);
			case Pt1_01_2Package.LINE_TYPE1__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? accountID != null : !ACCOUNT_ID_EDEFAULT.equals(accountID);
			case Pt1_01_2Package.LINE_TYPE1__SOURCE_DOCUMENT_ID:
				return SOURCE_DOCUMENT_ID_EDEFAULT == null ? sourceDocumentID != null : !SOURCE_DOCUMENT_ID_EDEFAULT.equals(sourceDocumentID);
			case Pt1_01_2Package.LINE_TYPE1__SYSTEM_ENTRY_DATE:
				return SYSTEM_ENTRY_DATE_EDEFAULT == null ? systemEntryDate != null : !SYSTEM_ENTRY_DATE_EDEFAULT.equals(systemEntryDate);
			case Pt1_01_2Package.LINE_TYPE1__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Pt1_01_2Package.LINE_TYPE1__DEBIT_AMOUNT:
				return DEBIT_AMOUNT_EDEFAULT == null ? debitAmount != null : !DEBIT_AMOUNT_EDEFAULT.equals(debitAmount);
			case Pt1_01_2Package.LINE_TYPE1__CREDIT_AMOUNT:
				return CREDIT_AMOUNT_EDEFAULT == null ? creditAmount != null : !CREDIT_AMOUNT_EDEFAULT.equals(creditAmount);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (recordID: ");
		result.append(recordID);
		result.append(", accountID: ");
		result.append(accountID);
		result.append(", sourceDocumentID: ");
		result.append(sourceDocumentID);
		result.append(", systemEntryDate: ");
		result.append(systemEntryDate);
		result.append(", description: ");
		result.append(description);
		result.append(", debitAmount: ");
		result.append(debitAmount);
		result.append(", creditAmount: ");
		result.append(creditAmount);
		result.append(')');
		return result.toString();
	}

} //LineType1Impl
