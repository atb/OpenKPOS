/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getAccountDescription <em>Account Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getOpeningDebitBalance <em>Opening Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getOpeningCreditBalance <em>Opening Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getClosingDebitBalance <em>Closing Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getClosingCreditBalance <em>Closing Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getGroupingCategory <em>Grouping Category</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getGroupingCode <em>Grouping Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getTaxonomyCode <em>Taxonomy Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getAccountType()
 * @model extendedMetaData="name='Account_._type' kind='elementOnly'"
 * @generated
 */
public interface AccountType extends EObject {
	/**
	 * Returns the value of the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account ID</em>' attribute.
	 * @see #setAccountID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getAccountType_AccountID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTGLAccountID" required="true"
	 *        extendedMetaData="kind='element' name='AccountID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #getAccountID()
	 * @generated
	 */
	void setAccountID(String value);

	/**
	 * Returns the value of the '<em><b>Account Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Description</em>' attribute.
	 * @see #setAccountDescription(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getAccountType_AccountDescription()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax100Car" required="true"
	 *        extendedMetaData="kind='element' name='AccountDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getAccountDescription <em>Account Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Description</em>' attribute.
	 * @see #getAccountDescription()
	 * @generated
	 */
	void setAccountDescription(String value);

	/**
	 * Returns the value of the '<em><b>Opening Debit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening Debit Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Debit Balance</em>' attribute.
	 * @see #setOpeningDebitBalance(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getAccountType_OpeningDebitBalance()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='OpeningDebitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningDebitBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getOpeningDebitBalance <em>Opening Debit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Debit Balance</em>' attribute.
	 * @see #getOpeningDebitBalance()
	 * @generated
	 */
	void setOpeningDebitBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Opening Credit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening Credit Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Credit Balance</em>' attribute.
	 * @see #setOpeningCreditBalance(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getAccountType_OpeningCreditBalance()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='OpeningCreditBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningCreditBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getOpeningCreditBalance <em>Opening Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Credit Balance</em>' attribute.
	 * @see #getOpeningCreditBalance()
	 * @generated
	 */
	void setOpeningCreditBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Closing Debit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closing Debit Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Debit Balance</em>' attribute.
	 * @see #setClosingDebitBalance(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getAccountType_ClosingDebitBalance()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='ClosingDebitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getClosingDebitBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getClosingDebitBalance <em>Closing Debit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Debit Balance</em>' attribute.
	 * @see #getClosingDebitBalance()
	 * @generated
	 */
	void setClosingDebitBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Closing Credit Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closing Credit Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closing Credit Balance</em>' attribute.
	 * @see #setClosingCreditBalance(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getAccountType_ClosingCreditBalance()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='ClosingCreditBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getClosingCreditBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getClosingCreditBalance <em>Closing Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Credit Balance</em>' attribute.
	 * @see #getClosingCreditBalance()
	 * @generated
	 */
	void setClosingCreditBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Grouping Category</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.GroupingCategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GR para conta de 1. grau da contabilidade geral, GA para conta agregadora ou integradora da contabilidade geral, GM para conta de movimento da contabilidade geral, AR para conta de 1. grau da contabilidade analitica, AA para conta agregadora ou integradora da contabilidade analitica, AM para conta de movimento da contabilidade analitica 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouping Category</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.GroupingCategoryType
	 * @see #isSetGroupingCategory()
	 * @see #unsetGroupingCategory()
	 * @see #setGroupingCategory(GroupingCategoryType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getAccountType_GroupingCategory()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='GroupingCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupingCategoryType getGroupingCategory();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getGroupingCategory <em>Grouping Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Category</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.GroupingCategoryType
	 * @see #isSetGroupingCategory()
	 * @see #unsetGroupingCategory()
	 * @see #getGroupingCategory()
	 * @generated
	 */
	void setGroupingCategory(GroupingCategoryType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getGroupingCategory <em>Grouping Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupingCategory()
	 * @see #getGroupingCategory()
	 * @see #setGroupingCategory(GroupingCategoryType)
	 * @generated
	 */
	void unsetGroupingCategory();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getGroupingCategory <em>Grouping Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grouping Category</em>' attribute is set.
	 * @see #unsetGroupingCategory()
	 * @see #getGroupingCategory()
	 * @see #setGroupingCategory(GroupingCategoryType)
	 * @generated
	 */
	boolean isSetGroupingCategory();

	/**
	 * Returns the value of the '<em><b>Grouping Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Code</em>' attribute.
	 * @see #setGroupingCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getAccountType_GroupingCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTGLAccountID"
	 *        extendedMetaData="kind='element' name='GroupingCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupingCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getGroupingCode <em>Grouping Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Code</em>' attribute.
	 * @see #getGroupingCode()
	 * @generated
	 */
	void setGroupingCode(String value);

	/**
	 * Returns the value of the '<em><b>Taxonomy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomy Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomy Code</em>' attribute.
	 * @see #setTaxonomyCode(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getAccountType_TaxonomyCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFTaxonomyCode"
	 *        extendedMetaData="kind='element' name='TaxonomyCode' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTaxonomyCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.AccountType#getTaxonomyCode <em>Taxonomy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxonomy Code</em>' attribute.
	 * @see #getTaxonomyCode()
	 * @generated
	 */
	void setTaxonomyCode(BigInteger value);

} // AccountType
