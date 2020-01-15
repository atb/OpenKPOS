/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import oecd.standard.audit.file.tax.p.t1._0._401.AccountType;
import oecd.standard.audit.file.tax.p.t1._0._401.GroupingCategoryType;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.AccountTypeImpl#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.AccountTypeImpl#getAccountDescription <em>Account Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.AccountTypeImpl#getOpeningDebitBalance <em>Opening Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.AccountTypeImpl#getOpeningCreditBalance <em>Opening Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.AccountTypeImpl#getClosingDebitBalance <em>Closing Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.AccountTypeImpl#getClosingCreditBalance <em>Closing Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.AccountTypeImpl#getGroupingCategory <em>Grouping Category</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.AccountTypeImpl#getGroupingCode <em>Grouping Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.AccountTypeImpl#getTaxonomyCode <em>Taxonomy Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountTypeImpl extends EObjectImpl implements AccountType {
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
	 * The default value of the '{@link #getClosingDebitBalance() <em>Closing Debit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingDebitBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CLOSING_DEBIT_BALANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosingDebitBalance() <em>Closing Debit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingDebitBalance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal closingDebitBalance = CLOSING_DEBIT_BALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClosingCreditBalance() <em>Closing Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingCreditBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CLOSING_CREDIT_BALANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosingCreditBalance() <em>Closing Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingCreditBalance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal closingCreditBalance = CLOSING_CREDIT_BALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupingCategory() <em>Grouping Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingCategory()
	 * @generated
	 * @ordered
	 */
	protected static final GroupingCategoryType GROUPING_CATEGORY_EDEFAULT = GroupingCategoryType.GR;

	/**
	 * The cached value of the '{@link #getGroupingCategory() <em>Grouping Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingCategory()
	 * @generated
	 * @ordered
	 */
	protected GroupingCategoryType groupingCategory = GROUPING_CATEGORY_EDEFAULT;

	/**
	 * This is true if the Grouping Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupingCategoryESet;

	/**
	 * The default value of the '{@link #getGroupingCode() <em>Grouping Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUPING_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupingCode() <em>Grouping Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingCode()
	 * @generated
	 * @ordered
	 */
	protected String groupingCode = GROUPING_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxonomyCode() <em>Taxonomy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomyCode()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TAXONOMY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxonomyCode() <em>Taxonomy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomyCode()
	 * @generated
	 * @ordered
	 */
	protected BigInteger taxonomyCode = TAXONOMY_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getAccountType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.ACCOUNT_TYPE__ACCOUNT_ID, oldAccountID, accountID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.ACCOUNT_TYPE__ACCOUNT_DESCRIPTION, oldAccountDescription, accountDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.ACCOUNT_TYPE__OPENING_DEBIT_BALANCE, oldOpeningDebitBalance, openingDebitBalance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.ACCOUNT_TYPE__OPENING_CREDIT_BALANCE, oldOpeningCreditBalance, openingCreditBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getClosingDebitBalance() {
		return closingDebitBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosingDebitBalance(BigDecimal newClosingDebitBalance) {
		BigDecimal oldClosingDebitBalance = closingDebitBalance;
		closingDebitBalance = newClosingDebitBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.ACCOUNT_TYPE__CLOSING_DEBIT_BALANCE, oldClosingDebitBalance, closingDebitBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getClosingCreditBalance() {
		return closingCreditBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosingCreditBalance(BigDecimal newClosingCreditBalance) {
		BigDecimal oldClosingCreditBalance = closingCreditBalance;
		closingCreditBalance = newClosingCreditBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.ACCOUNT_TYPE__CLOSING_CREDIT_BALANCE, oldClosingCreditBalance, closingCreditBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingCategoryType getGroupingCategory() {
		return groupingCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingCategory(GroupingCategoryType newGroupingCategory) {
		GroupingCategoryType oldGroupingCategory = groupingCategory;
		groupingCategory = newGroupingCategory == null ? GROUPING_CATEGORY_EDEFAULT : newGroupingCategory;
		boolean oldGroupingCategoryESet = groupingCategoryESet;
		groupingCategoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.ACCOUNT_TYPE__GROUPING_CATEGORY, oldGroupingCategory, groupingCategory, !oldGroupingCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroupingCategory() {
		GroupingCategoryType oldGroupingCategory = groupingCategory;
		boolean oldGroupingCategoryESet = groupingCategoryESet;
		groupingCategory = GROUPING_CATEGORY_EDEFAULT;
		groupingCategoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _401Package.ACCOUNT_TYPE__GROUPING_CATEGORY, oldGroupingCategory, GROUPING_CATEGORY_EDEFAULT, oldGroupingCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroupingCategory() {
		return groupingCategoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupingCode() {
		return groupingCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingCode(String newGroupingCode) {
		String oldGroupingCode = groupingCode;
		groupingCode = newGroupingCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.ACCOUNT_TYPE__GROUPING_CODE, oldGroupingCode, groupingCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTaxonomyCode() {
		return taxonomyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxonomyCode(BigInteger newTaxonomyCode) {
		BigInteger oldTaxonomyCode = taxonomyCode;
		taxonomyCode = newTaxonomyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.ACCOUNT_TYPE__TAXONOMY_CODE, oldTaxonomyCode, taxonomyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _401Package.ACCOUNT_TYPE__ACCOUNT_ID:
				return getAccountID();
			case _401Package.ACCOUNT_TYPE__ACCOUNT_DESCRIPTION:
				return getAccountDescription();
			case _401Package.ACCOUNT_TYPE__OPENING_DEBIT_BALANCE:
				return getOpeningDebitBalance();
			case _401Package.ACCOUNT_TYPE__OPENING_CREDIT_BALANCE:
				return getOpeningCreditBalance();
			case _401Package.ACCOUNT_TYPE__CLOSING_DEBIT_BALANCE:
				return getClosingDebitBalance();
			case _401Package.ACCOUNT_TYPE__CLOSING_CREDIT_BALANCE:
				return getClosingCreditBalance();
			case _401Package.ACCOUNT_TYPE__GROUPING_CATEGORY:
				return getGroupingCategory();
			case _401Package.ACCOUNT_TYPE__GROUPING_CODE:
				return getGroupingCode();
			case _401Package.ACCOUNT_TYPE__TAXONOMY_CODE:
				return getTaxonomyCode();
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
			case _401Package.ACCOUNT_TYPE__ACCOUNT_ID:
				setAccountID((String)newValue);
				return;
			case _401Package.ACCOUNT_TYPE__ACCOUNT_DESCRIPTION:
				setAccountDescription((String)newValue);
				return;
			case _401Package.ACCOUNT_TYPE__OPENING_DEBIT_BALANCE:
				setOpeningDebitBalance((BigDecimal)newValue);
				return;
			case _401Package.ACCOUNT_TYPE__OPENING_CREDIT_BALANCE:
				setOpeningCreditBalance((BigDecimal)newValue);
				return;
			case _401Package.ACCOUNT_TYPE__CLOSING_DEBIT_BALANCE:
				setClosingDebitBalance((BigDecimal)newValue);
				return;
			case _401Package.ACCOUNT_TYPE__CLOSING_CREDIT_BALANCE:
				setClosingCreditBalance((BigDecimal)newValue);
				return;
			case _401Package.ACCOUNT_TYPE__GROUPING_CATEGORY:
				setGroupingCategory((GroupingCategoryType)newValue);
				return;
			case _401Package.ACCOUNT_TYPE__GROUPING_CODE:
				setGroupingCode((String)newValue);
				return;
			case _401Package.ACCOUNT_TYPE__TAXONOMY_CODE:
				setTaxonomyCode((BigInteger)newValue);
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
			case _401Package.ACCOUNT_TYPE__ACCOUNT_ID:
				setAccountID(ACCOUNT_ID_EDEFAULT);
				return;
			case _401Package.ACCOUNT_TYPE__ACCOUNT_DESCRIPTION:
				setAccountDescription(ACCOUNT_DESCRIPTION_EDEFAULT);
				return;
			case _401Package.ACCOUNT_TYPE__OPENING_DEBIT_BALANCE:
				setOpeningDebitBalance(OPENING_DEBIT_BALANCE_EDEFAULT);
				return;
			case _401Package.ACCOUNT_TYPE__OPENING_CREDIT_BALANCE:
				setOpeningCreditBalance(OPENING_CREDIT_BALANCE_EDEFAULT);
				return;
			case _401Package.ACCOUNT_TYPE__CLOSING_DEBIT_BALANCE:
				setClosingDebitBalance(CLOSING_DEBIT_BALANCE_EDEFAULT);
				return;
			case _401Package.ACCOUNT_TYPE__CLOSING_CREDIT_BALANCE:
				setClosingCreditBalance(CLOSING_CREDIT_BALANCE_EDEFAULT);
				return;
			case _401Package.ACCOUNT_TYPE__GROUPING_CATEGORY:
				unsetGroupingCategory();
				return;
			case _401Package.ACCOUNT_TYPE__GROUPING_CODE:
				setGroupingCode(GROUPING_CODE_EDEFAULT);
				return;
			case _401Package.ACCOUNT_TYPE__TAXONOMY_CODE:
				setTaxonomyCode(TAXONOMY_CODE_EDEFAULT);
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
			case _401Package.ACCOUNT_TYPE__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? accountID != null : !ACCOUNT_ID_EDEFAULT.equals(accountID);
			case _401Package.ACCOUNT_TYPE__ACCOUNT_DESCRIPTION:
				return ACCOUNT_DESCRIPTION_EDEFAULT == null ? accountDescription != null : !ACCOUNT_DESCRIPTION_EDEFAULT.equals(accountDescription);
			case _401Package.ACCOUNT_TYPE__OPENING_DEBIT_BALANCE:
				return OPENING_DEBIT_BALANCE_EDEFAULT == null ? openingDebitBalance != null : !OPENING_DEBIT_BALANCE_EDEFAULT.equals(openingDebitBalance);
			case _401Package.ACCOUNT_TYPE__OPENING_CREDIT_BALANCE:
				return OPENING_CREDIT_BALANCE_EDEFAULT == null ? openingCreditBalance != null : !OPENING_CREDIT_BALANCE_EDEFAULT.equals(openingCreditBalance);
			case _401Package.ACCOUNT_TYPE__CLOSING_DEBIT_BALANCE:
				return CLOSING_DEBIT_BALANCE_EDEFAULT == null ? closingDebitBalance != null : !CLOSING_DEBIT_BALANCE_EDEFAULT.equals(closingDebitBalance);
			case _401Package.ACCOUNT_TYPE__CLOSING_CREDIT_BALANCE:
				return CLOSING_CREDIT_BALANCE_EDEFAULT == null ? closingCreditBalance != null : !CLOSING_CREDIT_BALANCE_EDEFAULT.equals(closingCreditBalance);
			case _401Package.ACCOUNT_TYPE__GROUPING_CATEGORY:
				return isSetGroupingCategory();
			case _401Package.ACCOUNT_TYPE__GROUPING_CODE:
				return GROUPING_CODE_EDEFAULT == null ? groupingCode != null : !GROUPING_CODE_EDEFAULT.equals(groupingCode);
			case _401Package.ACCOUNT_TYPE__TAXONOMY_CODE:
				return TAXONOMY_CODE_EDEFAULT == null ? taxonomyCode != null : !TAXONOMY_CODE_EDEFAULT.equals(taxonomyCode);
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
		result.append(", closingDebitBalance: ");
		result.append(closingDebitBalance);
		result.append(", closingCreditBalance: ");
		result.append(closingCreditBalance);
		result.append(", groupingCategory: ");
		if (groupingCategoryESet) result.append(groupingCategory); else result.append("<unset>");
		result.append(", groupingCode: ");
		result.append(groupingCode);
		result.append(", taxonomyCode: ");
		result.append(taxonomyCode);
		result.append(')');
		return result.toString();
	}

} //AccountTypeImpl
