/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1;
import oecd.standard.audit.file.tax.p.t1._0._201.MovementStatusType;
import oecd.standard.audit.file.tax.p.t1._0._201.SourceBillingType;
import oecd.standard.audit.file.tax.p.t1._0._201._201Package;

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
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.DocumentStatusType1Impl#getMovementStatus <em>Movement Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.DocumentStatusType1Impl#getMovementStatusDate <em>Movement Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.DocumentStatusType1Impl#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.DocumentStatusType1Impl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.DocumentStatusType1Impl#getSourceBilling <em>Source Billing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentStatusType1Impl extends EObjectImpl implements DocumentStatusType1 {
	/**
	 * The default value of the '{@link #getMovementStatus() <em>Movement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementStatus()
	 * @generated
	 * @ordered
	 */
	protected static final MovementStatusType MOVEMENT_STATUS_EDEFAULT = MovementStatusType.N;

	/**
	 * The cached value of the '{@link #getMovementStatus() <em>Movement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementStatus()
	 * @generated
	 * @ordered
	 */
	protected MovementStatusType movementStatus = MOVEMENT_STATUS_EDEFAULT;

	/**
	 * This is true if the Movement Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean movementStatusESet;

	/**
	 * The default value of the '{@link #getMovementStatusDate() <em>Movement Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MOVEMENT_STATUS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMovementStatusDate() <em>Movement Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovementStatusDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar movementStatusDate = MOVEMENT_STATUS_DATE_EDEFAULT;

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
		return _201Package.eINSTANCE.getDocumentStatusType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovementStatusType getMovementStatus() {
		return movementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementStatus(MovementStatusType newMovementStatus) {
		MovementStatusType oldMovementStatus = movementStatus;
		movementStatus = newMovementStatus == null ? MOVEMENT_STATUS_EDEFAULT : newMovementStatus;
		boolean oldMovementStatusESet = movementStatusESet;
		movementStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.DOCUMENT_STATUS_TYPE1__MOVEMENT_STATUS, oldMovementStatus, movementStatus, !oldMovementStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMovementStatus() {
		MovementStatusType oldMovementStatus = movementStatus;
		boolean oldMovementStatusESet = movementStatusESet;
		movementStatus = MOVEMENT_STATUS_EDEFAULT;
		movementStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _201Package.DOCUMENT_STATUS_TYPE1__MOVEMENT_STATUS, oldMovementStatus, MOVEMENT_STATUS_EDEFAULT, oldMovementStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMovementStatus() {
		return movementStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getMovementStatusDate() {
		return movementStatusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovementStatusDate(XMLGregorianCalendar newMovementStatusDate) {
		XMLGregorianCalendar oldMovementStatusDate = movementStatusDate;
		movementStatusDate = newMovementStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.DOCUMENT_STATUS_TYPE1__MOVEMENT_STATUS_DATE, oldMovementStatusDate, movementStatusDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.DOCUMENT_STATUS_TYPE1__REASON, oldReason, reason));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.DOCUMENT_STATUS_TYPE1__SOURCE_ID, oldSourceID, sourceID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.DOCUMENT_STATUS_TYPE1__SOURCE_BILLING, oldSourceBilling, sourceBilling, !oldSourceBillingESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, _201Package.DOCUMENT_STATUS_TYPE1__SOURCE_BILLING, oldSourceBilling, SOURCE_BILLING_EDEFAULT, oldSourceBillingESet));
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
			case _201Package.DOCUMENT_STATUS_TYPE1__MOVEMENT_STATUS:
				return getMovementStatus();
			case _201Package.DOCUMENT_STATUS_TYPE1__MOVEMENT_STATUS_DATE:
				return getMovementStatusDate();
			case _201Package.DOCUMENT_STATUS_TYPE1__REASON:
				return getReason();
			case _201Package.DOCUMENT_STATUS_TYPE1__SOURCE_ID:
				return getSourceID();
			case _201Package.DOCUMENT_STATUS_TYPE1__SOURCE_BILLING:
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
			case _201Package.DOCUMENT_STATUS_TYPE1__MOVEMENT_STATUS:
				setMovementStatus((MovementStatusType)newValue);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE1__MOVEMENT_STATUS_DATE:
				setMovementStatusDate((XMLGregorianCalendar)newValue);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE1__REASON:
				setReason((String)newValue);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE1__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE1__SOURCE_BILLING:
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
			case _201Package.DOCUMENT_STATUS_TYPE1__MOVEMENT_STATUS:
				unsetMovementStatus();
				return;
			case _201Package.DOCUMENT_STATUS_TYPE1__MOVEMENT_STATUS_DATE:
				setMovementStatusDate(MOVEMENT_STATUS_DATE_EDEFAULT);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE1__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE1__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case _201Package.DOCUMENT_STATUS_TYPE1__SOURCE_BILLING:
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
			case _201Package.DOCUMENT_STATUS_TYPE1__MOVEMENT_STATUS:
				return isSetMovementStatus();
			case _201Package.DOCUMENT_STATUS_TYPE1__MOVEMENT_STATUS_DATE:
				return MOVEMENT_STATUS_DATE_EDEFAULT == null ? movementStatusDate != null : !MOVEMENT_STATUS_DATE_EDEFAULT.equals(movementStatusDate);
			case _201Package.DOCUMENT_STATUS_TYPE1__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case _201Package.DOCUMENT_STATUS_TYPE1__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceID != null : !SOURCE_ID_EDEFAULT.equals(sourceID);
			case _201Package.DOCUMENT_STATUS_TYPE1__SOURCE_BILLING:
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
		result.append(" (movementStatus: ");
		if (movementStatusESet) result.append(movementStatus); else result.append("<unset>");
		result.append(", movementStatusDate: ");
		result.append(movementStatusDate);
		result.append(", reason: ");
		result.append(reason);
		result.append(", sourceID: ");
		result.append(sourceID);
		result.append(", sourceBilling: ");
		if (sourceBillingESet) result.append(sourceBilling); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentStatusType1Impl
