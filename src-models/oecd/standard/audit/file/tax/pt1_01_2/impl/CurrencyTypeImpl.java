/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2.impl;

import java.math.BigDecimal;

import oecd.standard.audit.file.tax.pt1_01_2.CurrencyType;
import oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Currency Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CurrencyTypeImpl#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CurrencyTypeImpl#getCurrencyCreditAmount <em>Currency Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CurrencyTypeImpl#getCurrencyDebitAmount <em>Currency Debit Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrencyTypeImpl extends EObjectImpl implements CurrencyType {
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
	 * The default value of the '{@link #getCurrencyCreditAmount() <em>Currency Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CURRENCY_CREDIT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyCreditAmount() <em>Currency Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal currencyCreditAmount = CURRENCY_CREDIT_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyDebitAmount() <em>Currency Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CURRENCY_DEBIT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyDebitAmount() <em>Currency Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal currencyDebitAmount = CURRENCY_DEBIT_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrencyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01_2Package.Literals.CURRENCY_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_CODE, oldCurrencyCode, currencyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCurrencyCreditAmount() {
		return currencyCreditAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyCreditAmount(BigDecimal newCurrencyCreditAmount) {
		BigDecimal oldCurrencyCreditAmount = currencyCreditAmount;
		currencyCreditAmount = newCurrencyCreditAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_CREDIT_AMOUNT, oldCurrencyCreditAmount, currencyCreditAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCurrencyDebitAmount() {
		return currencyDebitAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyDebitAmount(BigDecimal newCurrencyDebitAmount) {
		BigDecimal oldCurrencyDebitAmount = currencyDebitAmount;
		currencyDebitAmount = newCurrencyDebitAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_DEBIT_AMOUNT, oldCurrencyDebitAmount, currencyDebitAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_CODE:
				return getCurrencyCode();
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_CREDIT_AMOUNT:
				return getCurrencyCreditAmount();
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_DEBIT_AMOUNT:
				return getCurrencyDebitAmount();
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
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_CODE:
				setCurrencyCode((String)newValue);
				return;
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_CREDIT_AMOUNT:
				setCurrencyCreditAmount((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_DEBIT_AMOUNT:
				setCurrencyDebitAmount((BigDecimal)newValue);
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
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_CODE:
				setCurrencyCode(CURRENCY_CODE_EDEFAULT);
				return;
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_CREDIT_AMOUNT:
				setCurrencyCreditAmount(CURRENCY_CREDIT_AMOUNT_EDEFAULT);
				return;
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_DEBIT_AMOUNT:
				setCurrencyDebitAmount(CURRENCY_DEBIT_AMOUNT_EDEFAULT);
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
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_CODE:
				return CURRENCY_CODE_EDEFAULT == null ? currencyCode != null : !CURRENCY_CODE_EDEFAULT.equals(currencyCode);
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_CREDIT_AMOUNT:
				return CURRENCY_CREDIT_AMOUNT_EDEFAULT == null ? currencyCreditAmount != null : !CURRENCY_CREDIT_AMOUNT_EDEFAULT.equals(currencyCreditAmount);
			case Pt1_01_2Package.CURRENCY_TYPE__CURRENCY_DEBIT_AMOUNT:
				return CURRENCY_DEBIT_AMOUNT_EDEFAULT == null ? currencyDebitAmount != null : !CURRENCY_DEBIT_AMOUNT_EDEFAULT.equals(currencyDebitAmount);
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
		result.append(", currencyCreditAmount: ");
		result.append(currencyCreditAmount);
		result.append(", currencyDebitAmount: ");
		result.append(currencyDebitAmount);
		result.append(')');
		return result.toString();
	}

} //CurrencyTypeImpl
