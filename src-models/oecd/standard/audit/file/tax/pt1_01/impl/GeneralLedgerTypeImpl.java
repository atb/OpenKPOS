/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01.impl;

import java.math.BigDecimal;

import oecd.standard.audit.file.tax.pt1_01.GeneralLedgerType;
import oecd.standard.audit.file.tax.pt1_01.Pt1_01Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Ledger Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.GeneralLedgerTypeImpl#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.GeneralLedgerTypeImpl#getAccountDescription <em>Account Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.GeneralLedgerTypeImpl#getOpeningDebitBalance <em>Opening Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.GeneralLedgerTypeImpl#getOpeningCreditBalance <em>Opening Credit Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralLedgerTypeImpl extends EObjectImpl implements GeneralLedgerType {
	/**
	 * The default value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected String accountID = ACCOUNT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountDescription() <em>Account Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountDescription() <em>Account Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountDescription()
	 * @generated
	 * @ordered
	 */
	protected String accountDescription = ACCOUNT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpeningDebitBalance() <em>Opening Debit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningDebitBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OPENING_DEBIT_BALANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpeningDebitBalance() <em>Opening Debit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningDebitBalance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal openingDebitBalance = OPENING_DEBIT_BALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpeningCreditBalance() <em>Opening Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningCreditBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OPENING_CREDIT_BALANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpeningCreditBalance() <em>Opening Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningCreditBalance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal openingCreditBalance = OPENING_CREDIT_BALANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralLedgerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01Package.Literals.GENERAL_LEDGER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountID() {
		return accountID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountID(String newAccountID) {
		String oldAccountID = accountID;
		accountID = newAccountID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.GENERAL_LEDGER_TYPE__ACCOUNT_ID, oldAccountID, accountID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountDescription() {
		return accountDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountDescription(String newAccountDescription) {
		String oldAccountDescription = accountDescription;
		accountDescription = newAccountDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.GENERAL_LEDGER_TYPE__ACCOUNT_DESCRIPTION, oldAccountDescription, accountDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOpeningDebitBalance() {
		return openingDebitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpeningDebitBalance(BigDecimal newOpeningDebitBalance) {
		BigDecimal oldOpeningDebitBalance = openingDebitBalance;
		openingDebitBalance = newOpeningDebitBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.GENERAL_LEDGER_TYPE__OPENING_DEBIT_BALANCE, oldOpeningDebitBalance, openingDebitBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOpeningCreditBalance() {
		return openingCreditBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpeningCreditBalance(BigDecimal newOpeningCreditBalance) {
		BigDecimal oldOpeningCreditBalance = openingCreditBalance;
		openingCreditBalance = newOpeningCreditBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.GENERAL_LEDGER_TYPE__OPENING_CREDIT_BALANCE, oldOpeningCreditBalance, openingCreditBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pt1_01Package.GENERAL_LEDGER_TYPE__ACCOUNT_ID:
				return getAccountID();
			case Pt1_01Package.GENERAL_LEDGER_TYPE__ACCOUNT_DESCRIPTION:
				return getAccountDescription();
			case Pt1_01Package.GENERAL_LEDGER_TYPE__OPENING_DEBIT_BALANCE:
				return getOpeningDebitBalance();
			case Pt1_01Package.GENERAL_LEDGER_TYPE__OPENING_CREDIT_BALANCE:
				return getOpeningCreditBalance();
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
			case Pt1_01Package.GENERAL_LEDGER_TYPE__ACCOUNT_ID:
				setAccountID((String)newValue);
				return;
			case Pt1_01Package.GENERAL_LEDGER_TYPE__ACCOUNT_DESCRIPTION:
				setAccountDescription((String)newValue);
				return;
			case Pt1_01Package.GENERAL_LEDGER_TYPE__OPENING_DEBIT_BALANCE:
				setOpeningDebitBalance((BigDecimal)newValue);
				return;
			case Pt1_01Package.GENERAL_LEDGER_TYPE__OPENING_CREDIT_BALANCE:
				setOpeningCreditBalance((BigDecimal)newValue);
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
			case Pt1_01Package.GENERAL_LEDGER_TYPE__ACCOUNT_ID:
				setAccountID(ACCOUNT_ID_EDEFAULT);
				return;
			case Pt1_01Package.GENERAL_LEDGER_TYPE__ACCOUNT_DESCRIPTION:
				setAccountDescription(ACCOUNT_DESCRIPTION_EDEFAULT);
				return;
			case Pt1_01Package.GENERAL_LEDGER_TYPE__OPENING_DEBIT_BALANCE:
				setOpeningDebitBalance(OPENING_DEBIT_BALANCE_EDEFAULT);
				return;
			case Pt1_01Package.GENERAL_LEDGER_TYPE__OPENING_CREDIT_BALANCE:
				setOpeningCreditBalance(OPENING_CREDIT_BALANCE_EDEFAULT);
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
			case Pt1_01Package.GENERAL_LEDGER_TYPE__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? accountID != null : !ACCOUNT_ID_EDEFAULT.equals(accountID);
			case Pt1_01Package.GENERAL_LEDGER_TYPE__ACCOUNT_DESCRIPTION:
				return ACCOUNT_DESCRIPTION_EDEFAULT == null ? accountDescription != null : !ACCOUNT_DESCRIPTION_EDEFAULT.equals(accountDescription);
			case Pt1_01Package.GENERAL_LEDGER_TYPE__OPENING_DEBIT_BALANCE:
				return OPENING_DEBIT_BALANCE_EDEFAULT == null ? openingDebitBalance != null : !OPENING_DEBIT_BALANCE_EDEFAULT.equals(openingDebitBalance);
			case Pt1_01Package.GENERAL_LEDGER_TYPE__OPENING_CREDIT_BALANCE:
				return OPENING_CREDIT_BALANCE_EDEFAULT == null ? openingCreditBalance != null : !OPENING_CREDIT_BALANCE_EDEFAULT.equals(openingCreditBalance);
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
		result.append(" (accountID: ");
		result.append(accountID);
		result.append(", accountDescription: ");
		result.append(accountDescription);
		result.append(", openingDebitBalance: ");
		result.append(openingDebitBalance);
		result.append(", openingCreditBalance: ");
		result.append(openingCreditBalance);
		result.append(')');
		return result.toString();
	}

} //GeneralLedgerTypeImpl
