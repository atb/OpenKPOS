/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2.impl;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.pt1_01_2.PaymentMechanismType;
import oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package;
import oecd.standard.audit.file.tax.pt1_01_2.SettlementType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settlement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SettlementTypeImpl#getSettlementDiscount <em>Settlement Discount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SettlementTypeImpl#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SettlementTypeImpl#getSettlementDate <em>Settlement Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.SettlementTypeImpl#getPaymentMechanism <em>Payment Mechanism</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SettlementTypeImpl extends EObjectImpl implements SettlementType {
	/**
	 * The default value of the '{@link #getSettlementDiscount() <em>Settlement Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final String SETTLEMENT_DISCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSettlementDiscount() <em>Settlement Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementDiscount()
	 * @generated
	 * @ordered
	 */
	protected String settlementDiscount = SETTLEMENT_DISCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSettlementAmount() <em>Settlement Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SETTLEMENT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSettlementAmount() <em>Settlement Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal settlementAmount = SETTLEMENT_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSettlementDate() <em>Settlement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SETTLEMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSettlementDate() <em>Settlement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar settlementDate = SETTLEMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentMechanism() <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentMechanismType PAYMENT_MECHANISM_EDEFAULT = PaymentMechanismType.NU;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettlementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01_2Package.Literals.SETTLEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSettlementDiscount() {
		return settlementDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettlementDiscount(String newSettlementDiscount) {
		String oldSettlementDiscount = settlementDiscount;
		settlementDiscount = newSettlementDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_DISCOUNT, oldSettlementDiscount, settlementDiscount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSettlementAmount() {
		return settlementAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettlementAmount(BigDecimal newSettlementAmount) {
		BigDecimal oldSettlementAmount = settlementAmount;
		settlementAmount = newSettlementAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_AMOUNT, oldSettlementAmount, settlementAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getSettlementDate() {
		return settlementDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettlementDate(XMLGregorianCalendar newSettlementDate) {
		XMLGregorianCalendar oldSettlementDate = settlementDate;
		settlementDate = newSettlementDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_DATE, oldSettlementDate, settlementDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.SETTLEMENT_TYPE__PAYMENT_MECHANISM, oldPaymentMechanism, paymentMechanism, !oldPaymentMechanismESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Pt1_01_2Package.SETTLEMENT_TYPE__PAYMENT_MECHANISM, oldPaymentMechanism, PAYMENT_MECHANISM_EDEFAULT, oldPaymentMechanismESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_DISCOUNT:
				return getSettlementDiscount();
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_AMOUNT:
				return getSettlementAmount();
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_DATE:
				return getSettlementDate();
			case Pt1_01_2Package.SETTLEMENT_TYPE__PAYMENT_MECHANISM:
				return getPaymentMechanism();
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
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_DISCOUNT:
				setSettlementDiscount((String)newValue);
				return;
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_AMOUNT:
				setSettlementAmount((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_DATE:
				setSettlementDate((XMLGregorianCalendar)newValue);
				return;
			case Pt1_01_2Package.SETTLEMENT_TYPE__PAYMENT_MECHANISM:
				setPaymentMechanism((PaymentMechanismType)newValue);
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
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_DISCOUNT:
				setSettlementDiscount(SETTLEMENT_DISCOUNT_EDEFAULT);
				return;
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_AMOUNT:
				setSettlementAmount(SETTLEMENT_AMOUNT_EDEFAULT);
				return;
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_DATE:
				setSettlementDate(SETTLEMENT_DATE_EDEFAULT);
				return;
			case Pt1_01_2Package.SETTLEMENT_TYPE__PAYMENT_MECHANISM:
				unsetPaymentMechanism();
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
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_DISCOUNT:
				return SETTLEMENT_DISCOUNT_EDEFAULT == null ? settlementDiscount != null : !SETTLEMENT_DISCOUNT_EDEFAULT.equals(settlementDiscount);
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_AMOUNT:
				return SETTLEMENT_AMOUNT_EDEFAULT == null ? settlementAmount != null : !SETTLEMENT_AMOUNT_EDEFAULT.equals(settlementAmount);
			case Pt1_01_2Package.SETTLEMENT_TYPE__SETTLEMENT_DATE:
				return SETTLEMENT_DATE_EDEFAULT == null ? settlementDate != null : !SETTLEMENT_DATE_EDEFAULT.equals(settlementDate);
			case Pt1_01_2Package.SETTLEMENT_TYPE__PAYMENT_MECHANISM:
				return isSetPaymentMechanism();
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
		result.append(" (settlementDiscount: ");
		result.append(settlementDiscount);
		result.append(", settlementAmount: ");
		result.append(settlementAmount);
		result.append(", settlementDate: ");
		result.append(settlementDate);
		result.append(", paymentMechanism: ");
		if (paymentMechanismESet) result.append(paymentMechanism); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SettlementTypeImpl
