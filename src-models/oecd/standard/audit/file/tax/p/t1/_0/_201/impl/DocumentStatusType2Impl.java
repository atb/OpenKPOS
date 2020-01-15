/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType2;
import oecd.standard.audit.file.tax.p.t1._0._201.InvoiceStatusType;
import oecd.standard.audit.file.tax.p.t1._0._201.SourceBillingType;
import oecd.standard.audit.file.tax.p.t1._0._201._201Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Status Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.DocumentStatusType2Impl#getInvoiceStatus <em>Invoice Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.DocumentStatusType2Impl#getInvoiceStatusDate <em>Invoice Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.DocumentStatusType2Impl#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.DocumentStatusType2Impl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.DocumentStatusType2Impl#getSourceBilling <em>Source Billing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentStatusType2Impl extends EObjectImpl implements DocumentStatusType2 {
	/**
	 * The default value of the '{@link #getInvoiceStatus() <em>Invoice Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceStatus()
	 * @generated
	 * @ordered
	 */
	protected static final InvoiceStatusType INVOICE_STATUS_EDEFAULT = InvoiceStatusType.N;

	/**
	 * The cached value of the '{@link #getInvoiceStatus() <em>Invoice Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceStatus()
	 * @generated
	 * @ordered
	 */
	protected InvoiceStatusType invoiceStatus = INVOICE_STATUS_EDEFAULT;

	/**
	 * This is true if the Invoice Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean invoiceStatusESet;

	/**
	 * The default value of the '{@link #getInvoiceStatusDate() <em>Invoice Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar INVOICE_STATUS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceStatusDate() <em>Invoice Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceStatusDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar invoiceStatusDate = INVOICE_STATUS_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceID() <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceID() <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceID()
	 * @generated
	 * @ordered
	 */
	protected String sourceID = SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceBilling() <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceBilling()
	 * @generated
	 * @ordered
	 */
	protected static final SourceBillingType SOURCE_BILLING_EDEFAULT = SourceBillingType.P;

	/**
	 * The cached value of the '{@link #getSourceBilling() <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceBilling()
	 * @generated
	 * @ordered
	 */
	protected SourceBillingType sourceBilling = SOURCE_BILLING_EDEFAULT;

	/**
	 * This is true if the Source Billing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceBillingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentStatusType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _201Package.eINSTANCE.getDocumentStatusType2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceStatusType getInvoiceStatus() {
		return invoiceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceStatus(InvoiceStatusType newInvoiceStatus) {
		InvoiceStatusType oldInvoiceStatus = invoiceStatus;
		invoiceStatus = newInvoiceStatus == null ? INVOICE_STATUS_EDEFAULT : newInvoiceStatus;
		boolean oldInvoiceStatusESet = invoiceStatusESet;
		invoiceStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.DOCUMENT_STATUS_TYPE2__INVOICE_STATUS, oldInvoiceStatus, invoiceStatus, !oldInvoiceStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInvoiceStatus() {
		InvoiceStatusType oldInvoiceStatus = invoiceStatus;
		boolean oldInvoiceStatusESet = invoiceStatusESet;
		invoiceStatus = INVOICE_STATUS_EDEFAULT;
		invoiceStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _201Package.DOCUMENT_STATUS_TYPE2__INVOICE_STATUS, oldInvoiceStatus, INVOICE_STATUS_EDEFAULT, oldInvoiceStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInvoiceStatus() {
		return invoiceStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getInvoiceStatusDate() {
		return invoiceStatusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceStatusDate(XMLGregorianCalendar newInvoiceStatusDate) {
		XMLGregorianCalendar oldInvoiceStatusDate = invoiceStatusDate;
		invoiceStatusDate = newInvoiceStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.DOCUMENT_STATUS_TYPE2__INVOICE_STATUS_DATE, oldInvoiceStatusDate, invoiceStatusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.DOCUMENT_STATUS_TYPE2__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceID() {
		return sourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceID(String newSourceID) {
		String oldSourceID = sourceID;
		sourceID = newSourceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.DOCUMENT_STATUS_TYPE2__SOURCE_ID, oldSourceID, sourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceBillingType getSourceBilling() {
		return sourceBilling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceBilling(SourceBillingType newSourceBilling) {
		SourceBillingType oldSourceBilling = sourceBilling;
		sourceBilling = newSourceBilling == null ? SOURCE_BILLING_EDEFAULT : newSourceBilling;
		boolean oldSourceBillingESet = sourceBillingESet;
		sourceBillingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.DOCUMENT_STATUS_TYPE2__SOURCE_BILLING, oldSourceBilling, sourceBilling, !oldSourceBillingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSourceBilling() {
		SourceBillingType oldSourceBilling = sourceBilling;
		boolean oldSourceBillingESet = sourceBillingESet;
		sourceBilling = SOURCE_BILLING_EDEFAULT;
		sourceBillingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _201Package.DOCUMENT_STATUS_TYPE2__SOURCE_BILLING, oldSourceBilling, SOURCE_BILLING_EDEFAULT, oldSourceBillingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourceBilling() {
		return sourceBillingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _201Package.DOCUMENT_STATUS_TYPE2__INVOICE_STATUS:
				return getInvoiceStatus();
			case _201Package.DOCUMENT_STATUS_TYPE2__INVOICE_STATUS_DATE:
				return getInvoiceStatusDate();
			case _201Package.DOCUMENT_STATUS_TYPE2__REASON:
				return getReason();
			case _201Package.DOCUMENT_STATUS_TYPE2__SOURCE_ID:
				return getSourceID();
			case _201Package.DOCUMENT_STATUS_TYPE2__SOURCE_BILLING:
				return getSourceBilling();
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
			case _201Package.DOCUMENT_STATUS_TYPE2__INVOICE_STATUS:
				setInvoiceStatus((InvoiceStatusType)newValue);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE2__INVOICE_STATUS_DATE:
				setInvoiceStatusDate((XMLGregorianCalendar)newValue);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE2__REASON:
				setReason((String)newValue);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE2__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE2__SOURCE_BILLING:
				setSourceBilling((SourceBillingType)newValue);
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
			case _201Package.DOCUMENT_STATUS_TYPE2__INVOICE_STATUS:
				unsetInvoiceStatus();
				return;
			case _201Package.DOCUMENT_STATUS_TYPE2__INVOICE_STATUS_DATE:
				setInvoiceStatusDate(INVOICE_STATUS_DATE_EDEFAULT);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE2__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE2__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE2__SOURCE_BILLING:
				unsetSourceBilling();
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
			case _201Package.DOCUMENT_STATUS_TYPE2__INVOICE_STATUS:
				return isSetInvoiceStatus();
			case _201Package.DOCUMENT_STATUS_TYPE2__INVOICE_STATUS_DATE:
				return INVOICE_STATUS_DATE_EDEFAULT == null ? invoiceStatusDate != null : !INVOICE_STATUS_DATE_EDEFAULT.equals(invoiceStatusDate);
			case _201Package.DOCUMENT_STATUS_TYPE2__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case _201Package.DOCUMENT_STATUS_TYPE2__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceID != null : !SOURCE_ID_EDEFAULT.equals(sourceID);
			case _201Package.DOCUMENT_STATUS_TYPE2__SOURCE_BILLING:
				return isSetSourceBilling();
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
		result.append(" (invoiceStatus: ");
		if (invoiceStatusESet) result.append(invoiceStatus); else result.append("<unset>");
		result.append(", invoiceStatusDate: ");
		result.append(invoiceStatusDate);
		result.append(", reason: ");
		result.append(reason);
		result.append(", sourceID: ");
		result.append(sourceID);
		result.append(", sourceBilling: ");
		if (sourceBillingESet) result.append(sourceBilling); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentStatusType2Impl
