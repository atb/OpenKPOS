/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301.impl;

import java.math.BigInteger;

import oecd.standard.audit.file.tax.p.t1._0._301.SpecialRegimes;
import oecd.standard.audit.file.tax.p.t1._0._301._301Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Special Regimes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.SpecialRegimesImpl#getSelfBillingIndicator <em>Self Billing Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.SpecialRegimesImpl#getCashVATSchemeIndicator <em>Cash VAT Scheme Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.impl.SpecialRegimesImpl#getThirdPartiesBillingIndicator <em>Third Parties Billing Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecialRegimesImpl extends EObjectImpl implements SpecialRegimes {
	/**
	 * The default value of the '{@link #getSelfBillingIndicator() <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfBillingIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SELF_BILLING_INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelfBillingIndicator() <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfBillingIndicator()
	 * @generated
	 * @ordered
	 */
	protected BigInteger selfBillingIndicator = SELF_BILLING_INDICATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCashVATSchemeIndicator() <em>Cash VAT Scheme Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashVATSchemeIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CASH_VAT_SCHEME_INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCashVATSchemeIndicator() <em>Cash VAT Scheme Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashVATSchemeIndicator()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cashVATSchemeIndicator = CASH_VAT_SCHEME_INDICATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getThirdPartiesBillingIndicator() <em>Third Parties Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartiesBillingIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger THIRD_PARTIES_BILLING_INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThirdPartiesBillingIndicator() <em>Third Parties Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartiesBillingIndicator()
	 * @generated
	 * @ordered
	 */
	protected BigInteger thirdPartiesBillingIndicator = THIRD_PARTIES_BILLING_INDICATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialRegimesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _301Package.eINSTANCE.getSpecialRegimes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSelfBillingIndicator() {
		return selfBillingIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfBillingIndicator(BigInteger newSelfBillingIndicator) {
		BigInteger oldSelfBillingIndicator = selfBillingIndicator;
		selfBillingIndicator = newSelfBillingIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.SPECIAL_REGIMES__SELF_BILLING_INDICATOR, oldSelfBillingIndicator, selfBillingIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCashVATSchemeIndicator() {
		return cashVATSchemeIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCashVATSchemeIndicator(BigInteger newCashVATSchemeIndicator) {
		BigInteger oldCashVATSchemeIndicator = cashVATSchemeIndicator;
		cashVATSchemeIndicator = newCashVATSchemeIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.SPECIAL_REGIMES__CASH_VAT_SCHEME_INDICATOR, oldCashVATSchemeIndicator, cashVATSchemeIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getThirdPartiesBillingIndicator() {
		return thirdPartiesBillingIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThirdPartiesBillingIndicator(BigInteger newThirdPartiesBillingIndicator) {
		BigInteger oldThirdPartiesBillingIndicator = thirdPartiesBillingIndicator;
		thirdPartiesBillingIndicator = newThirdPartiesBillingIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _301Package.SPECIAL_REGIMES__THIRD_PARTIES_BILLING_INDICATOR, oldThirdPartiesBillingIndicator, thirdPartiesBillingIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _301Package.SPECIAL_REGIMES__SELF_BILLING_INDICATOR:
				return getSelfBillingIndicator();
			case _301Package.SPECIAL_REGIMES__CASH_VAT_SCHEME_INDICATOR:
				return getCashVATSchemeIndicator();
			case _301Package.SPECIAL_REGIMES__THIRD_PARTIES_BILLING_INDICATOR:
				return getThirdPartiesBillingIndicator();
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
			case _301Package.SPECIAL_REGIMES__SELF_BILLING_INDICATOR:
				setSelfBillingIndicator((BigInteger)newValue);
				return;
			case _301Package.SPECIAL_REGIMES__CASH_VAT_SCHEME_INDICATOR:
				setCashVATSchemeIndicator((BigInteger)newValue);
				return;
			case _301Package.SPECIAL_REGIMES__THIRD_PARTIES_BILLING_INDICATOR:
				setThirdPartiesBillingIndicator((BigInteger)newValue);
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
			case _301Package.SPECIAL_REGIMES__SELF_BILLING_INDICATOR:
				setSelfBillingIndicator(SELF_BILLING_INDICATOR_EDEFAULT);
				return;
			case _301Package.SPECIAL_REGIMES__CASH_VAT_SCHEME_INDICATOR:
				setCashVATSchemeIndicator(CASH_VAT_SCHEME_INDICATOR_EDEFAULT);
				return;
			case _301Package.SPECIAL_REGIMES__THIRD_PARTIES_BILLING_INDICATOR:
				setThirdPartiesBillingIndicator(THIRD_PARTIES_BILLING_INDICATOR_EDEFAULT);
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
			case _301Package.SPECIAL_REGIMES__SELF_BILLING_INDICATOR:
				return SELF_BILLING_INDICATOR_EDEFAULT == null ? selfBillingIndicator != null : !SELF_BILLING_INDICATOR_EDEFAULT.equals(selfBillingIndicator);
			case _301Package.SPECIAL_REGIMES__CASH_VAT_SCHEME_INDICATOR:
				return CASH_VAT_SCHEME_INDICATOR_EDEFAULT == null ? cashVATSchemeIndicator != null : !CASH_VAT_SCHEME_INDICATOR_EDEFAULT.equals(cashVATSchemeIndicator);
			case _301Package.SPECIAL_REGIMES__THIRD_PARTIES_BILLING_INDICATOR:
				return THIRD_PARTIES_BILLING_INDICATOR_EDEFAULT == null ? thirdPartiesBillingIndicator != null : !THIRD_PARTIES_BILLING_INDICATOR_EDEFAULT.equals(thirdPartiesBillingIndicator);
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
		result.append(" (selfBillingIndicator: ");
		result.append(selfBillingIndicator);
		result.append(", cashVATSchemeIndicator: ");
		result.append(cashVATSchemeIndicator);
		result.append(", thirdPartiesBillingIndicator: ");
		result.append(thirdPartiesBillingIndicator);
		result.append(')');
		return result.toString();
	}

} //SpecialRegimesImpl
