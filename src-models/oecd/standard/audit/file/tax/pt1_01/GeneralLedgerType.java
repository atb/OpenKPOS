/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01;

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
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.GeneralLedgerType#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.GeneralLedgerType#getAccountDescription <em>Account Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.GeneralLedgerType#getOpeningDebitBalance <em>Opening Debit Balance</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.GeneralLedgerType#getOpeningCreditBalance <em>Opening Credit Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getGeneralLedgerType()
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getGeneralLedgerType_AccountID()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTGLAccountID" required="true"
	 *        extendedMetaData="kind='element' name='AccountID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.GeneralLedgerType#getAccountID <em>Account ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getGeneralLedgerType_AccountDescription()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax60Car" required="true"
	 *        extendedMetaData="kind='element' name='AccountDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.GeneralLedgerType#getAccountDescription <em>Account Description</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getGeneralLedgerType_OpeningDebitBalance()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='OpeningDebitBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningDebitBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.GeneralLedgerType#getOpeningDebitBalance <em>Opening Debit Balance</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getGeneralLedgerType_OpeningCreditBalance()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='OpeningCreditBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOpeningCreditBalance();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.GeneralLedgerType#getOpeningCreditBalance <em>Opening Credit Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Credit Balance</em>' attribute.
	 * @see #getOpeningCreditBalance()
	 * @generated
	 */
	void setOpeningCreditBalance(BigDecimal value);

} // GeneralLedgerType
