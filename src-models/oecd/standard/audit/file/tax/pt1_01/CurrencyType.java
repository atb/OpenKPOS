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
 * A representation of the model object '<em><b>Currency Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.CurrencyType#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.CurrencyType#getCurrencyCreditAmount <em>Currency Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.CurrencyType#getCurrencyDebitAmount <em>Currency Debit Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getCurrencyType()
 * @model extendedMetaData="name='Currency_._type' kind='elementOnly'"
 * @generated
 */
public interface CurrencyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Code</em>' attribute.
	 * @see #setCurrencyCode(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getCurrencyType_CurrencyCode()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.CurrencyCodeType"
	 *        extendedMetaData="kind='element' name='CurrencyCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCurrencyCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.CurrencyType#getCurrencyCode <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Code</em>' attribute.
	 * @see #getCurrencyCode()
	 * @generated
	 */
	void setCurrencyCode(String value);

	/**
	 * Returns the value of the '<em><b>Currency Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Credit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Credit Amount</em>' attribute.
	 * @see #setCurrencyCreditAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getCurrencyType_CurrencyCreditAmount()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFmonetaryType"
	 *        extendedMetaData="kind='element' name='CurrencyCreditAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCurrencyCreditAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.CurrencyType#getCurrencyCreditAmount <em>Currency Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Credit Amount</em>' attribute.
	 * @see #getCurrencyCreditAmount()
	 * @generated
	 */
	void setCurrencyCreditAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Debit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Debit Amount</em>' attribute.
	 * @see #setCurrencyDebitAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getCurrencyType_CurrencyDebitAmount()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFmonetaryType"
	 *        extendedMetaData="kind='element' name='CurrencyDebitAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCurrencyDebitAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.CurrencyType#getCurrencyDebitAmount <em>Currency Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Debit Amount</em>' attribute.
	 * @see #getCurrencyDebitAmount()
	 * @generated
	 */
	void setCurrencyDebitAmount(BigDecimal value);

} // CurrencyType
