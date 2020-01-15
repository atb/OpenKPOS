/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.util.Collection;

import oecd.standard.audit.file.tax.p.t1._0._401.AccountType;
import oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerAccountsType;
import oecd.standard.audit.file.tax.p.t1._0._401.TaxonomyReferenceType;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Ledger Accounts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.GeneralLedgerAccountsTypeImpl#getTaxonomyReference <em>Taxonomy Reference</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.GeneralLedgerAccountsTypeImpl#getAccount <em>Account</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralLedgerAccountsTypeImpl extends EObjectImpl implements GeneralLedgerAccountsType {
	/**
	 * The default value of the '{@link #getTaxonomyReference() <em>Taxonomy Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomyReference()
	 * @generated
	 * @ordered
	 */
	protected static final TaxonomyReferenceType TAXONOMY_REFERENCE_EDEFAULT = TaxonomyReferenceType.S;

	/**
	 * The cached value of the '{@link #getTaxonomyReference() <em>Taxonomy Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomyReference()
	 * @generated
	 * @ordered
	 */
	protected TaxonomyReferenceType taxonomyReference = TAXONOMY_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Taxonomy Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean taxonomyReferenceESet;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountType> account;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralLedgerAccountsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getGeneralLedgerAccountsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxonomyReferenceType getTaxonomyReference() {
		return taxonomyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxonomyReference(TaxonomyReferenceType newTaxonomyReference) {
		TaxonomyReferenceType oldTaxonomyReference = taxonomyReference;
		taxonomyReference = newTaxonomyReference == null ? TAXONOMY_REFERENCE_EDEFAULT : newTaxonomyReference;
		boolean oldTaxonomyReferenceESet = taxonomyReferenceESet;
		taxonomyReferenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__TAXONOMY_REFERENCE, oldTaxonomyReference, taxonomyReference, !oldTaxonomyReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTaxonomyReference() {
		TaxonomyReferenceType oldTaxonomyReference = taxonomyReference;
		boolean oldTaxonomyReferenceESet = taxonomyReferenceESet;
		taxonomyReference = TAXONOMY_REFERENCE_EDEFAULT;
		taxonomyReferenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__TAXONOMY_REFERENCE, oldTaxonomyReference, TAXONOMY_REFERENCE_EDEFAULT, oldTaxonomyReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTaxonomyReference() {
		return taxonomyReferenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccountType> getAccount() {
		if (account == null) {
			account = new EObjectContainmentEList<AccountType>(AccountType.class, this, _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__ACCOUNT);
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__ACCOUNT:
				return ((InternalEList<?>)getAccount()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__TAXONOMY_REFERENCE:
				return getTaxonomyReference();
			case _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__ACCOUNT:
				return getAccount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__TAXONOMY_REFERENCE:
				setTaxonomyReference((TaxonomyReferenceType)newValue);
				return;
			case _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__ACCOUNT:
				getAccount().clear();
				getAccount().addAll((Collection<? extends AccountType>)newValue);
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
			case _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__TAXONOMY_REFERENCE:
				unsetTaxonomyReference();
				return;
			case _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__ACCOUNT:
				getAccount().clear();
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
			case _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__TAXONOMY_REFERENCE:
				return isSetTaxonomyReference();
			case _401Package.GENERAL_LEDGER_ACCOUNTS_TYPE__ACCOUNT:
				return account != null && !account.isEmpty();
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
		result.append(" (taxonomyReference: ");
		if (taxonomyReferenceESet) result.append(taxonomyReference); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GeneralLedgerAccountsTypeImpl
