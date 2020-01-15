/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Ledger Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getAccountDescription <em>Account Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getOpeningDebitBalance <em>Opening Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getOpeningCreditBalance <em>Opening Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getClosingDebitBalance <em>Closing Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getClosingCreditBalance <em>Closing Credit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getGroupingCategory <em>Grouping Category</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getGroupingCode <em>Grouping Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getGeneralLedgerType()
 * @model extendedMetaData="name='GeneralLedger_._type' kind='elementOnly'"
 * @generated
 */
public interface GeneralLedgerType extends EObject {
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getGeneralLedgerType_AccountID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTGLAccountID" required="true"
	 *        extendedMetaData="kind='element' name='AccountID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getAccountID <em>Account ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getGeneralLedgerType_AccountDescription()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax60Car" required="true"
	 *        extendedMetaData="kind='element' name='AccountDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getAccountDescription <em>Account Description</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getGeneralLedgerType_OpeningDebitBalance()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='OpeningDebitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningDebitBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getOpeningDebitBalance <em>Opening Debit Balance</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getGeneralLedgerType_OpeningCreditBalance()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='OpeningCreditBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningCreditBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getOpeningCreditBalance <em>Opening Credit Balance</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getGeneralLedgerType_ClosingDebitBalance()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='ClosingDebitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getClosingDebitBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getClosingDebitBalance <em>Closing Debit Balance</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getGeneralLedgerType_ClosingCreditBalance()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='ClosingCreditBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getClosingCreditBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getClosingCreditBalance <em>Closing Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Credit Balance</em>' attribute.
	 * @see #getClosingCreditBalance()
	 * @generated
	 */
	void setClosingCreditBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Grouping Category</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.GroupingCategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GR para conta de 1¼ grau da contabilidade geral, GA para conta agregadora ou integradora da contabilidade geral, GM para conta de movimento da contabilidade geral, AR para conta de 1¼ grau da contabilidade anal’tica, AA para conta agregadora ou integradora da contabilidade anal’tica, AM para conta de movimento da contabilidade anal’tica 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grouping Category</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.GroupingCategoryType
	 * @see #isSetGroupingCategory()
	 * @see #unsetGroupingCategory()
	 * @see #setGroupingCategory(GroupingCategoryType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getGeneralLedgerType_GroupingCategory()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='GroupingCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupingCategoryType getGroupingCategory();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getGroupingCategory <em>Grouping Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Category</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.GroupingCategoryType
	 * @see #isSetGroupingCategory()
	 * @see #unsetGroupingCategory()
	 * @see #getGroupingCategory()
	 * @generated
	 */
	void setGroupingCategory(GroupingCategoryType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getGroupingCategory <em>Grouping Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupingCategory()
	 * @see #getGroupingCategory()
	 * @see #setGroupingCategory(GroupingCategoryType)
	 * @generated
	 */
	void unsetGroupingCategory();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getGroupingCategory <em>Grouping Category</em>}' attribute is set.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getGeneralLedgerType_GroupingCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTGLAccountID"
	 *        extendedMetaData="kind='element' name='GroupingCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupingCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.GeneralLedgerType#getGroupingCode <em>Grouping Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Code</em>' attribute.
	 * @see #getGroupingCode()
	 * @generated
	 */
	void setGroupingCode(String value);

} // GeneralLedgerType
