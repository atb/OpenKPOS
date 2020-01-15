/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settlement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.SettlementType#getSettlementDiscount <em>Settlement Discount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.SettlementType#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.SettlementType#getSettlementDate <em>Settlement Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.SettlementType#getPaymentMechanism <em>Payment Mechanism</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getSettlementType()
 * @model extendedMetaData="name='Settlement_._type' kind='elementOnly'"
 * @generated
 */
public interface SettlementType extends EObject {
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getSettlementType_SettlementDiscount()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax30Car"
	 *        extendedMetaData="kind='element' name='SettlementDiscount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSettlementDiscount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.SettlementType#getSettlementDiscount <em>Settlement Discount</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getSettlementType_SettlementAmount()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFmonetaryType"
	 *        extendedMetaData="kind='element' name='SettlementAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSettlementAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.SettlementType#getSettlementAmount <em>Settlement Amount</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getSettlementType_SettlementDate()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFdateType"
	 *        extendedMetaData="kind='element' name='SettlementDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSettlementDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.SettlementType#getSettlementDate <em>Settlement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Date</em>' attribute.
	 * @see #getSettlementDate()
	 * @generated
	 */
	void setSettlementDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Payment Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.pt1_01.PaymentMechanismType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restrição: Meio de pagamento: NU - Numerário, CH - Cheque, CC - Cartão de Crédito, CD – Cartão de Débito, TB - Transferência Bancária, TR - Ticket Restaurante
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01.PaymentMechanismType
	 * @see #isSetPaymentMechanism()
	 * @see #unsetPaymentMechanism()
	 * @see #setPaymentMechanism(PaymentMechanismType)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getSettlementType_PaymentMechanism()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PaymentMechanism' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentMechanismType getPaymentMechanism();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.SettlementType#getPaymentMechanism <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01.PaymentMechanismType
	 * @see #isSetPaymentMechanism()
	 * @see #unsetPaymentMechanism()
	 * @see #getPaymentMechanism()
	 * @generated
	 */
	void setPaymentMechanism(PaymentMechanismType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.SettlementType#getPaymentMechanism <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPaymentMechanism()
	 * @see #getPaymentMechanism()
	 * @see #setPaymentMechanism(PaymentMechanismType)
	 * @generated
	 */
	void unsetPaymentMechanism();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.pt1_01.SettlementType#getPaymentMechanism <em>Payment Mechanism</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Payment Mechanism</em>' attribute is set.
	 * @see #unsetPaymentMechanism()
	 * @see #getPaymentMechanism()
	 * @see #setPaymentMechanism(PaymentMechanismType)
	 * @generated
	 */
	boolean isSetPaymentMechanism();

} // SettlementType
