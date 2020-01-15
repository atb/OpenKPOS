/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._401.PaymentMechanismType;
import oecd.standard.audit.file.tax.p.t1._0._401.PaymentMethod;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.PaymentMethodImpl#getPaymentMechanism <em>Payment Mechanism</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.PaymentMethodImpl#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.PaymentMethodImpl#getPaymentDate <em>Payment Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentMethodImpl extends EObjectImpl implements PaymentMethod {
	/**
	 * The default value of the '{@link #getPaymentMechanism() <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentMechanismType PAYMENT_MECHANISM_EDEFAULT = PaymentMechanismType.CC;

	/**
	 * The cached value of the '{@link #getPaymentMechanism() <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMechanism()
	 * @generated
	 * @ordered
	 */
	protected PaymentMechanismType paymentMechanism = PAYMENT_MECHANISM_EDEFAULT;

	/**
	 * This is true if the Payment Mechanism attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean paymentMechanismESet;

	/**
	 * The default value of the '{@link #getPaymentAmount() <em>Payment Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PAYMENT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentAmount() <em>Payment Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal paymentAmount = PAYMENT_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentDate() <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PAYMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentDate() <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar paymentDate = PAYMENT_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getPaymentMethod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMechanismType getPaymentMechanism() {
		return paymentMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentMechanism(PaymentMechanismType newPaymentMechanism) {
		PaymentMechanismType oldPaymentMechanism = paymentMechanism;
		paymentMechanism = newPaymentMechanism == null ? PAYMENT_MECHANISM_EDEFAULT : newPaymentMechanism;
		boolean oldPaymentMechanismESet = paymentMechanismESet;
		paymentMechanismESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PAYMENT_METHOD__PAYMENT_MECHANISM, oldPaymentMechanism, paymentMechanism, !oldPaymentMechanismESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPaymentMechanism() {
		PaymentMechanismType oldPaymentMechanism = paymentMechanism;
		boolean oldPaymentMechanismESet = paymentMechanismESet;
		paymentMechanism = PAYMENT_MECHANISM_EDEFAULT;
		paymentMechanismESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _401Package.PAYMENT_METHOD__PAYMENT_MECHANISM, oldPaymentMechanism, PAYMENT_MECHANISM_EDEFAULT, oldPaymentMechanismESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPaymentMechanism() {
		return paymentMechanismESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAmount(BigDecimal newPaymentAmount) {
		BigDecimal oldPaymentAmount = paymentAmount;
		paymentAmount = newPaymentAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PAYMENT_METHOD__PAYMENT_AMOUNT, oldPaymentAmount, paymentAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDate(XMLGregorianCalendar newPaymentDate) {
		XMLGregorianCalendar oldPaymentDate = paymentDate;
		paymentDate = newPaymentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PAYMENT_METHOD__PAYMENT_DATE, oldPaymentDate, paymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _401Package.PAYMENT_METHOD__PAYMENT_MECHANISM:
				return getPaymentMechanism();
			case _401Package.PAYMENT_METHOD__PAYMENT_AMOUNT:
				return getPaymentAmount();
			case _401Package.PAYMENT_METHOD__PAYMENT_DATE:
				return getPaymentDate();
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
			case _401Package.PAYMENT_METHOD__PAYMENT_MECHANISM:
				setPaymentMechanism((PaymentMechanismType)newValue);
				return;
			case _401Package.PAYMENT_METHOD__PAYMENT_AMOUNT:
				setPaymentAmount((BigDecimal)newValue);
				return;
			case _401Package.PAYMENT_METHOD__PAYMENT_DATE:
				setPaymentDate((XMLGregorianCalendar)newValue);
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
			case _401Package.PAYMENT_METHOD__PAYMENT_MECHANISM:
				unsetPaymentMechanism();
				return;
			case _401Package.PAYMENT_METHOD__PAYMENT_AMOUNT:
				setPaymentAmount(PAYMENT_AMOUNT_EDEFAULT);
				return;
			case _401Package.PAYMENT_METHOD__PAYMENT_DATE:
				setPaymentDate(PAYMENT_DATE_EDEFAULT);
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
			case _401Package.PAYMENT_METHOD__PAYMENT_MECHANISM:
				return isSetPaymentMechanism();
			case _401Package.PAYMENT_METHOD__PAYMENT_AMOUNT:
				return PAYMENT_AMOUNT_EDEFAULT == null ? paymentAmount != null : !PAYMENT_AMOUNT_EDEFAULT.equals(paymentAmount);
			case _401Package.PAYMENT_METHOD__PAYMENT_DATE:
				return PAYMENT_DATE_EDEFAULT == null ? paymentDate != null : !PAYMENT_DATE_EDEFAULT.equals(paymentDate);
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
		result.append(" (paymentMechanism: ");
		if (paymentMechanismESet) result.append(paymentMechanism); else result.append("<unset>");
		result.append(", paymentAmount: ");
		result.append(paymentAmount);
		result.append(", paymentDate: ");
		result.append(paymentDate);
		result.append(')');
		return result.toString();
	}

} //PaymentMethodImpl
