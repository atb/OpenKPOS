/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Ledger Accounts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerAccountsType#getTaxonomyReference <em>Taxonomy Reference</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerAccountsType#getAccount <em>Account</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getGeneralLedgerAccountsType()
 * @model extendedMetaData="name='GeneralLedgerAccounts_._type' kind='elementOnly'"
 * @generated
 */
public interface GeneralLedgerAccountsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Taxonomy Reference</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.TaxonomyReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * S para SNC base (Taxonomia S), M para SNC microentidades (Taxonomia M), N para Normas Internacionais de Contabilidade (Taxonomia S), O para outros referenciais contabilisticos cuja taxonomia nao se encontra codificada
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taxonomy Reference</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxonomyReferenceType
	 * @see #isSetTaxonomyReference()
	 * @see #unsetTaxonomyReference()
	 * @see #setTaxonomyReference(TaxonomyReferenceType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getGeneralLedgerAccountsType_TaxonomyReference()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TaxonomyReference' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxonomyReferenceType getTaxonomyReference();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerAccountsType#getTaxonomyReference <em>Taxonomy Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxonomy Reference</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxonomyReferenceType
	 * @see #isSetTaxonomyReference()
	 * @see #unsetTaxonomyReference()
	 * @see #getTaxonomyReference()
	 * @generated
	 */
	void setTaxonomyReference(TaxonomyReferenceType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerAccountsType#getTaxonomyReference <em>Taxonomy Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTaxonomyReference()
	 * @see #getTaxonomyReference()
	 * @see #setTaxonomyReference(TaxonomyReferenceType)
	 * @generated
	 */
	void unsetTaxonomyReference();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerAccountsType#getTaxonomyReference <em>Taxonomy Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Taxonomy Reference</em>' attribute is set.
	 * @see #unsetTaxonomyReference()
	 * @see #getTaxonomyReference()
	 * @see #setTaxonomyReference(TaxonomyReferenceType)
	 * @generated
	 */
	boolean isSetTaxonomyReference();

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getGeneralLedgerAccountsType_Account()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Account' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccountType> getAccount();

} // GeneralLedgerAccountsType
