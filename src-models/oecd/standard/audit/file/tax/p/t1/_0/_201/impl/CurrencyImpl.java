/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201.impl;

import java.math.BigDecimal;

import oecd.standard.audit.file.tax.p.t1._0._201.Currency;
import oecd.standard.audit.file.tax.p.t1._0._201._201Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Currency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.CurrencyImpl#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.CurrencyImpl#getCurrencyAmount <em>Currency Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.impl.CurrencyImpl#getExchangeRate <em>Exchange Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrencyImpl extends EObjectImpl implements Currency {
	/**
	 * The default value of the '{@link #getCurrencyCode() <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyCode() <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected String currencyCode = CURRENCY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyAmount() <em>Currency Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CURRENCY_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyAmount() <em>Currency Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal currencyAmount = CURRENCY_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExchangeRate() <em>Exchange Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeRate()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal EXCHANGE_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExchangeRate() <em>Exchange Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeRate()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal exchangeRate = EXCHANGE_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _201Package.eINSTANCE.getCurrency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyCode(String newCurrencyCode) {
		String oldCurrencyCode = currencyCode;
		currencyCode = newCurrencyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.CURRENCY__CURRENCY_CODE, oldCurrencyCode, currencyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCurrencyAmount() {
		return currencyAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyAmount(BigDecimal newCurrencyAmount) {
		BigDecimal oldCurrencyAmount = currencyAmount;
		currencyAmount = newCurrencyAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.CURRENCY__CURRENCY_AMOUNT, oldCurrencyAmount, currencyAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeRate(BigDecimal newExchangeRate) {
		BigDecimal oldExchangeRate = exchangeRate;
		exchangeRate = newExchangeRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _201Package.CURRENCY__EXCHANGE_RATE, oldExchangeRate, exchangeRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _201Package.CURRENCY__CURRENCY_CODE:
				return getCurrencyCode();
			case _201Package.CURRENCY__CURRENCY_AMOUNT:
				return getCurrencyAmount();
			case _201Package.CURRENCY__EXCHANGE_RATE:
				return getExchangeRate();
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
			case _201Package.CURRENCY__CURRENCY_CODE:
				setCurrencyCode((String)newValue);
				return;
			case _201Package.CURRENCY__CURRENCY_AMOUNT:
				setCurrencyAmount((BigDecimal)newValue);
				return;
			case _201Package.CURRENCY__EXCHANGE_RATE:
				setExchangeRate((BigDecimal)newValue);
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
			case _201Package.CURRENCY__CURRENCY_CODE:
				setCurrencyCode(CURRENCY_CODE_EDEFAULT);
				return;
			case _201Package.CURRENCY__CURRENCY_AMOUNT:
				setCurrencyAmount(CURRENCY_AMOUNT_EDEFAULT);
				return;
			case _201Package.CURRENCY__EXCHANGE_RATE:
				setExchangeRate(EXCHANGE_RATE_EDEFAULT);
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
			case _201Package.CURRENCY__CURRENCY_CODE:
				return CURRENCY_CODE_EDEFAULT == null ? currencyCode != null : !CURRENCY_CODE_EDEFAULT.equals(currencyCode);
			case _201Package.CURRENCY__CURRENCY_AMOUNT:
				return CURRENCY_AMOUNT_EDEFAULT == null ? currencyAmount != null : !CURRENCY_AMOUNT_EDEFAULT.equals(currencyAmount);
			case _201Package.CURRENCY__EXCHANGE_RATE:
				return EXCHANGE_RATE_EDEFAULT == null ? exchangeRate != null : !EXCHANGE_RATE_EDEFAULT.equals(exchangeRate);
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
		result.append(" (currencyCode: ");
		result.append(currencyCode);
		result.append(", currencyAmount: ");
		result.append(currencyAmount);
		result.append(", exchangeRate: ");
		result.append(exchangeRate);
		result.append(')');
		return result.toString();
	}

} //CurrencyImpl
