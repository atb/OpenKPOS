/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Currency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.Currency#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.Currency#getCurrencyAmount <em>Currency Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.Currency#getExchangeRate <em>Exchange Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getCurrency()
 * @model extendedMetaData="name='Currency' kind='elementOnly'"
 * @generated
 */
public interface Currency extends EObject {
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getCurrency_CurrencyCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.CurrencyCodeType" required="true"
	 *        extendedMetaData="kind='element' name='CurrencyCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCurrencyCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.Currency#getCurrencyCode <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Code</em>' attribute.
	 * @see #getCurrencyCode()
	 * @generated
	 */
	void setCurrencyCode(String value);

	/**
	 * Returns the value of the '<em><b>Currency Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Amount</em>' attribute.
	 * @see #setCurrencyAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getCurrency_CurrencyAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='CurrencyAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCurrencyAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.Currency#getCurrencyAmount <em>Currency Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Amount</em>' attribute.
	 * @see #getCurrencyAmount()
	 * @generated
	 */
	void setCurrencyAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Exchange Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Rate</em>' attribute.
	 * @see #setExchangeRate(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getCurrency_ExchangeRate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFdecimalType"
	 *        extendedMetaData="kind='element' name='ExchangeRate' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getExchangeRate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.Currency#getExchangeRate <em>Exchange Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Rate</em>' attribute.
	 * @see #getExchangeRate()
	 * @generated
	 */
	void setExchangeRate(BigDecimal value);

} // Currency
