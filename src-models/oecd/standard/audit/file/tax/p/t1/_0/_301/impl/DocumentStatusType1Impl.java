/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1;
import oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType;
import oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment;
import oecd.standard.audit.file.tax.p.t1._0._301._301Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Status Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusType1Impl#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusType1Impl#getPaymentStatusDate <em>Payment Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusType1Impl#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusType1Impl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.DocumentStatusType1Impl#getSourcePayment <em>Source Payment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentStatusType1Impl extends EObjectImpl implements DocumentStatusType1 {
	/**
	 * The default value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentStatusType PAYMENT_STATUS_EDEFAULT = PaymentStatusType.N;

	/**
	 * The cached value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected PaymentStatusType paymentStatus = PAYMENT_STATUS_EDEFAULT;

	/**
	 * This is true if the Payment Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean paymentStatusESet;

	/**
	 * The default value of the '{@link #getPaymentStatusDate() <em>Payment Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PAYMENT_STATUS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentStatusDate() <em>Payment Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatusDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar paymentStatusDate = PAYMENT_STATUS_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getSourcePayment() <em>Source Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePayment()
	 * @generated
	 * @ordered
	 */
	protected static final SAFTPTSourcePayment SOURCE_PAYMENT_EDEFAULT = SAFTPTSourcePayment.P;

	/**
	 * The cached value of the '{@link #getSourcePayment() <em>Source Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePayment()
	 * @generated
	 * @ordered
	 */
	protected SAFTPTSourcePayment sourcePayment = SOURCE_PAYMENT_EDEFAULT;

	/**
	 * This is true if the Source Payment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourcePaymentESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentStatusType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _301Package.eINSTANCE.getDocumentStatusType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentStatusType getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentStatus(PaymentStatusType newPaymentStatus) {
		PaymentStatusType oldPaymentStatus = paymentStatus;
		paymentStatus = newPaymentStatus == null ? PAYMENT_STATUS_EDEFAULT : newPaymentStatus;
		boolean oldPaymentStatusESet = paymentStatusESet;
		paymentStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS, oldPaymentStatus, paymentStatus, !oldPaymentStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPaymentStatus() {
		PaymentStatusType oldPaymentStatus = paymentStatus;
		boolean oldPaymentStatusESet = paymentStatusESet;
		paymentStatus = PAYMENT_STATUS_EDEFAULT;
		paymentStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _301Package.DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS, oldPaymentStatus, PAYMENT_STATUS_EDEFAULT, oldPaymentStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPaymentStatus() {
		return paymentStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getPaymentStatusDate() {
		return paymentStatusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentStatusDate(XMLGregorianCalendar newPaymentStatusDate) {
		XMLGregorianCalendar oldPaymentStatusDate = paymentStatusDate;
		paymentStatusDate = newPaymentStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS_DATE, oldPaymentStatusDate, paymentStatusDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.DOCUMENT_STATUS_TYPE1__REASON, oldReason, reason));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.DOCUMENT_STATUS_TYPE1__SOURCE_ID, oldSourceID, sourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTSourcePayment getSourcePayment() {
		return sourcePayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePayment(SAFTPTSourcePayment newSourcePayment) {
		SAFTPTSourcePayment oldSourcePayment = sourcePayment;
		sourcePayment = newSourcePayment == null ? SOURCE_PAYMENT_EDEFAULT : newSourcePayment;
		boolean oldSourcePaymentESet = sourcePaymentESet;
		sourcePaymentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.DOCUMENT_STATUS_TYPE1__SOURCE_PAYMENT, oldSourcePayment, sourcePayment, !oldSourcePaymentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSourcePayment() {
		SAFTPTSourcePayment oldSourcePayment = sourcePayment;
		boolean oldSourcePaymentESet = sourcePaymentESet;
		sourcePayment = SOURCE_PAYMENT_EDEFAULT;
		sourcePaymentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _301Package.DOCUMENT_STATUS_TYPE1__SOURCE_PAYMENT, oldSourcePayment, SOURCE_PAYMENT_EDEFAULT, oldSourcePaymentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourcePayment() {
		return sourcePaymentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _301Package.DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS:
				return getPaymentStatus();
			case _301Package.DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS_DATE:
				return getPaymentStatusDate();
			case _301Package.DOCUMENT_STATUS_TYPE1__REASON:
				return getReason();
			case _301Package.DOCUMENT_STATUS_TYPE1__SOURCE_ID:
				return getSourceID();
			case _301Package.DOCUMENT_STATUS_TYPE1__SOURCE_PAYMENT:
				return getSourcePayment();
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
			case _301Package.DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS:
				setPaymentStatus((PaymentStatusType)newValue);
				return;
			case _301Package.DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS_DATE:
				setPaymentStatusDate((XMLGregorianCalendar)newValue);
				return;
			case _301Package.DOCUMENT_STATUS_TYPE1__REASON:
				setReason((String)newValue);
				return;
			case _301Package.DOCUMENT_STATUS_TYPE1__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case _301Package.DOCUMENT_STATUS_TYPE1__SOURCE_PAYMENT:
				setSourcePayment((SAFTPTSourcePayment)newValue);
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
			case _301Package.DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS:
				unsetPaymentStatus();
				return;
			case _301Package.DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS_DATE:
				setPaymentStatusDate(PAYMENT_STATUS_DATE_EDEFAULT);
				return;
			case _301Package.DOCUMENT_STATUS_TYPE1__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case _301Package.DOCUMENT_STATUS_TYPE1__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case _301Package.DOCUMENT_STATUS_TYPE1__SOURCE_PAYMENT:
				unsetSourcePayment();
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
			case _301Package.DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS:
				return isSetPaymentStatus();
			case _301Package.DOCUMENT_STATUS_TYPE1__PAYMENT_STATUS_DATE:
				return PAYMENT_STATUS_DATE_EDEFAULT == null ? paymentStatusDate != null : !PAYMENT_STATUS_DATE_EDEFAULT.equals(paymentStatusDate);
			case _301Package.DOCUMENT_STATUS_TYPE1__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case _301Package.DOCUMENT_STATUS_TYPE1__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceID != null : !SOURCE_ID_EDEFAULT.equals(sourceID);
			case _301Package.DOCUMENT_STATUS_TYPE1__SOURCE_PAYMENT:
				return isSetSourcePayment();
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
		result.append(" (paymentStatus: ");
		if (paymentStatusESet) result.append(paymentStatus); else result.append("<unset>");
		result.append(", paymentStatusDate: ");
		result.append(paymentStatusDate);
		result.append(", reason: ");
		result.append(reason);
		result.append(", sourceID: ");
		result.append(sourceID);
		result.append(", sourcePayment: ");
		if (sourcePaymentESet) result.append(sourcePayment); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentStatusType1Impl
