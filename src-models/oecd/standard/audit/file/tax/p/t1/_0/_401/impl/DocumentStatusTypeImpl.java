/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType;
import oecd.standard.audit.file.tax.p.t1._0._401.SAFTPTSourceBilling;
import oecd.standard.audit.file.tax.p.t1._0._401.WorkStatusType;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Status Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.DocumentStatusTypeImpl#getWorkStatus <em>Work Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.DocumentStatusTypeImpl#getWorkStatusDate <em>Work Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.DocumentStatusTypeImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.DocumentStatusTypeImpl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.DocumentStatusTypeImpl#getSourceBilling <em>Source Billing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentStatusTypeImpl extends EObjectImpl implements DocumentStatusType {
	/**
	 * The default value of the '{@link #getWorkStatus() <em>Work Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkStatus()
	 * @generated
	 * @ordered
	 */
	protected static final WorkStatusType WORK_STATUS_EDEFAULT = WorkStatusType.N;

	/**
	 * The cached value of the '{@link #getWorkStatus() <em>Work Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkStatus()
	 * @generated
	 * @ordered
	 */
	protected WorkStatusType workStatus = WORK_STATUS_EDEFAULT;

	/**
	 * This is true if the Work Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workStatusESet;

	/**
	 * The default value of the '{@link #getWorkStatusDate() <em>Work Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar WORK_STATUS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkStatusDate() <em>Work Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkStatusDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar workStatusDate = WORK_STATUS_DATE_EDEFAULT;

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
	protected static final SAFTPTSourceBilling SOURCE_BILLING_EDEFAULT = SAFTPTSourceBilling.P;

	/**
	 * The cached value of the '{@link #getSourceBilling() <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceBilling()
	 * @generated
	 * @ordered
	 */
	protected SAFTPTSourceBilling sourceBilling = SOURCE_BILLING_EDEFAULT;

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
	protected DocumentStatusTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getDocumentStatusType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkStatusType getWorkStatus() {
		return workStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkStatus(WorkStatusType newWorkStatus) {
		WorkStatusType oldWorkStatus = workStatus;
		workStatus = newWorkStatus == null ? WORK_STATUS_EDEFAULT : newWorkStatus;
		boolean oldWorkStatusESet = workStatusESet;
		workStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_STATUS_TYPE__WORK_STATUS, oldWorkStatus, workStatus, !oldWorkStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkStatus() {
		WorkStatusType oldWorkStatus = workStatus;
		boolean oldWorkStatusESet = workStatusESet;
		workStatus = WORK_STATUS_EDEFAULT;
		workStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _401Package.DOCUMENT_STATUS_TYPE__WORK_STATUS, oldWorkStatus, WORK_STATUS_EDEFAULT, oldWorkStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkStatus() {
		return workStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getWorkStatusDate() {
		return workStatusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkStatusDate(XMLGregorianCalendar newWorkStatusDate) {
		XMLGregorianCalendar oldWorkStatusDate = workStatusDate;
		workStatusDate = newWorkStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_STATUS_TYPE__WORK_STATUS_DATE, oldWorkStatusDate, workStatusDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_STATUS_TYPE__REASON, oldReason, reason));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_STATUS_TYPE__SOURCE_ID, oldSourceID, sourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAFTPTSourceBilling getSourceBilling() {
		return sourceBilling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceBilling(SAFTPTSourceBilling newSourceBilling) {
		SAFTPTSourceBilling oldSourceBilling = sourceBilling;
		sourceBilling = newSourceBilling == null ? SOURCE_BILLING_EDEFAULT : newSourceBilling;
		boolean oldSourceBillingESet = sourceBillingESet;
		sourceBillingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.DOCUMENT_STATUS_TYPE__SOURCE_BILLING, oldSourceBilling, sourceBilling, !oldSourceBillingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSourceBilling() {
		SAFTPTSourceBilling oldSourceBilling = sourceBilling;
		boolean oldSourceBillingESet = sourceBillingESet;
		sourceBilling = SOURCE_BILLING_EDEFAULT;
		sourceBillingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _401Package.DOCUMENT_STATUS_TYPE__SOURCE_BILLING, oldSourceBilling, SOURCE_BILLING_EDEFAULT, oldSourceBillingESet));
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
			case _401Package.DOCUMENT_STATUS_TYPE__WORK_STATUS:
				return getWorkStatus();
			case _401Package.DOCUMENT_STATUS_TYPE__WORK_STATUS_DATE:
				return getWorkStatusDate();
			case _401Package.DOCUMENT_STATUS_TYPE__REASON:
				return getReason();
			case _401Package.DOCUMENT_STATUS_TYPE__SOURCE_ID:
				return getSourceID();
			case _401Package.DOCUMENT_STATUS_TYPE__SOURCE_BILLING:
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
			case _401Package.DOCUMENT_STATUS_TYPE__WORK_STATUS:
				setWorkStatus((WorkStatusType)newValue);
				return;
			case _401Package.DOCUMENT_STATUS_TYPE__WORK_STATUS_DATE:
				setWorkStatusDate((XMLGregorianCalendar)newValue);
				return;
			case _401Package.DOCUMENT_STATUS_TYPE__REASON:
				setReason((String)newValue);
				return;
			case _401Package.DOCUMENT_STATUS_TYPE__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case _401Package.DOCUMENT_STATUS_TYPE__SOURCE_BILLING:
				setSourceBilling((SAFTPTSourceBilling)newValue);
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
			case _401Package.DOCUMENT_STATUS_TYPE__WORK_STATUS:
				unsetWorkStatus();
				return;
			case _401Package.DOCUMENT_STATUS_TYPE__WORK_STATUS_DATE:
				setWorkStatusDate(WORK_STATUS_DATE_EDEFAULT);
				return;
			case _401Package.DOCUMENT_STATUS_TYPE__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case _401Package.DOCUMENT_STATUS_TYPE__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case _401Package.DOCUMENT_STATUS_TYPE__SOURCE_BILLING:
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
			case _401Package.DOCUMENT_STATUS_TYPE__WORK_STATUS:
				return isSetWorkStatus();
			case _401Package.DOCUMENT_STATUS_TYPE__WORK_STATUS_DATE:
				return WORK_STATUS_DATE_EDEFAULT == null ? workStatusDate != null : !WORK_STATUS_DATE_EDEFAULT.equals(workStatusDate);
			case _401Package.DOCUMENT_STATUS_TYPE__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case _401Package.DOCUMENT_STATUS_TYPE__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceID != null : !SOURCE_ID_EDEFAULT.equals(sourceID);
			case _401Package.DOCUMENT_STATUS_TYPE__SOURCE_BILLING:
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
		result.append(" (workStatus: ");
		if (workStatusESet) result.append(workStatus); else result.append("<unset>");
		result.append(", workStatusDate: ");
		result.append(workStatusDate);
		result.append(", reason: ");
		result.append(reason);
		result.append(", sourceID: ");
		result.append(sourceID);
		result.append(", sourceBilling: ");
		if (sourceBillingESet) result.append(sourceBilling); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentStatusTypeImpl
