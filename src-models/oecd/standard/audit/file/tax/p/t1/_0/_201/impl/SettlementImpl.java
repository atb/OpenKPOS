/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201.impl;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._201.Settlement;
import oecd.standard.audit.file.tax.p.t1._0._201._201Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settlement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.SettlementImpl#getSettlementDiscount <em>Settlement Discount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.SettlementImpl#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.SettlementImpl#getSettlementDate <em>Settlement Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.SettlementImpl#getPaymentTerms <em>Payment Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SettlementImpl extends EObjectImpl implements Settlement {
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
	 * The default value of the '{@link #getPaymentTerms() <em>Payment Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTerms()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_TERMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentTerms() <em>Payment Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTerms()
	 * @generated
	 * @ordered
	 */
	protected String paymentTerms = PAYMENT_TERMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettlementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _201Package.eINSTANCE.getSettlement();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.SETTLEMENT__SETTLEMENT_DISCOUNT, oldSettlementDiscount, settlementDiscount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.SETTLEMENT__SETTLEMENT_AMOUNT, oldSettlementAmount, settlementAmount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.SETTLEMENT__SETTLEMENT_DATE, oldSettlementDate, settlementDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentTerms() {
		return paymentTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentTerms(String newPaymentTerms) {
		String oldPaymentTerms = paymentTerms;
		paymentTerms = newPaymentTerms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.SETTLEMENT__PAYMENT_TERMS, oldPaymentTerms, paymentTerms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _201Package.SETTLEMENT__SETTLEMENT_DISCOUNT:
				return getSettlementDiscount();
			case _201Package.SETTLEMENT__SETTLEMENT_AMOUNT:
				return getSettlementAmount();
			case _201Package.SETTLEMENT__SETTLEMENT_DATE:
				return getSettlementDate();
			case _201Package.SETTLEMENT__PAYMENT_TERMS:
				return getPaymentTerms();
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
			case _201Package.SETTLEMENT__SETTLEMENT_DISCOUNT:
				setSettlementDiscount((String)newValue);
				return;
			case _201Package.SETTLEMENT__SETTLEMENT_AMOUNT:
				setSettlementAmount((BigDecimal)newValue);
				return;
			case _201Package.SETTLEMENT__SETTLEMENT_DATE:
				setSettlementDate((XMLGregorianCalendar)newValue);
				return;
			case _201Package.SETTLEMENT__PAYMENT_TERMS:
				setPaymentTerms((String)newValue);
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
			case _201Package.SETTLEMENT__SETTLEMENT_DISCOUNT:
				setSettlementDiscount(SETTLEMENT_DISCOUNT_EDEFAULT);
				return;
			case _201Package.SETTLEMENT__SETTLEMENT_AMOUNT:
				setSettlementAmount(SETTLEMENT_AMOUNT_EDEFAULT);
				return;
			case _201Package.SETTLEMENT__SETTLEMENT_DATE:
				setSettlementDate(SETTLEMENT_DATE_EDEFAULT);
				return;
			case _201Package.SETTLEMENT__PAYMENT_TERMS:
				setPaymentTerms(PAYMENT_TERMS_EDEFAULT);
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
			case _201Package.SETTLEMENT__SETTLEMENT_DISCOUNT:
				return SETTLEMENT_DISCOUNT_EDEFAULT == null ? settlementDiscount != null : !SETTLEMENT_DISCOUNT_EDEFAULT.equals(settlementDiscount);
			case _201Package.SETTLEMENT__SETTLEMENT_AMOUNT:
				return SETTLEMENT_AMOUNT_EDEFAULT == null ? settlementAmount != null : !SETTLEMENT_AMOUNT_EDEFAULT.equals(settlementAmount);
			case _201Package.SETTLEMENT__SETTLEMENT_DATE:
				return SETTLEMENT_DATE_EDEFAULT == null ? settlementDate != null : !SETTLEMENT_DATE_EDEFAULT.equals(settlementDate);
			case _201Package.SETTLEMENT__PAYMENT_TERMS:
				return PAYMENT_TERMS_EDEFAULT == null ? paymentTerms != null : !PAYMENT_TERMS_EDEFAULT.equals(paymentTerms);
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
		result.append(", paymentTerms: ");
		result.append(paymentTerms);
		result.append(')');
		return result.toString();
	}

} //SettlementImpl
