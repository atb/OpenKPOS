/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settlement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.Settlement#getSettlementDiscount <em>Settlement Discount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.Settlement#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.Settlement#getSettlementDate <em>Settlement Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.Settlement#getPaymentTerms <em>Payment Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSettlement()
 * @model extendedMetaData="name='Settlement' kind='elementOnly'"
 * @generated
 */
public interface Settlement extends EObject {
	/**
	 * Returns the value of the '<em><b>Settlement Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlement Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlement Discount</em>' attribute.
	 * @see #setSettlementDiscount(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSettlement_SettlementDiscount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car"
	 *        extendedMetaData="kind='element' name='SettlementDiscount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSettlementDiscount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.Settlement#getSettlementDiscount <em>Settlement Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Discount</em>' attribute.
	 * @see #getSettlementDiscount()
	 * @generated
	 */
	void setSettlementDiscount(String value);

	/**
	 * Returns the value of the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlement Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlement Amount</em>' attribute.
	 * @see #setSettlementAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSettlement_SettlementAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType"
	 *        extendedMetaData="kind='element' name='SettlementAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSettlementAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.Settlement#getSettlementAmount <em>Settlement Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Amount</em>' attribute.
	 * @see #getSettlementAmount()
	 * @generated
	 */
	void setSettlementAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Settlement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlement Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlement Date</em>' attribute.
	 * @see #setSettlementDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSettlement_SettlementDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateType"
	 *        extendedMetaData="kind='element' name='SettlementDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSettlementDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.Settlement#getSettlementDate <em>Settlement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Date</em>' attribute.
	 * @see #getSettlementDate()
	 * @generated
	 */
	void setSettlementDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Payment Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Terms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Terms</em>' attribute.
	 * @see #setPaymentTerms(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getSettlement_PaymentTerms()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax100Car"
	 *        extendedMetaData="kind='element' name='PaymentTerms' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPaymentTerms();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.Settlement#getPaymentTerms <em>Payment Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Terms</em>' attribute.
	 * @see #getPaymentTerms()
	 * @generated
	 */
	void setPaymentTerms(String value);

} // Settlement
