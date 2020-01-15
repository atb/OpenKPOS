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
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.Payment#getPaymentMechanism <em>Payment Mechanism</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.Payment#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.Payment#getPaymentDate <em>Payment Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getPayment()
 * @model extendedMetaData="name='Payment' kind='elementOnly'"
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.PaymentMechanismType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *          Restrição: Meio de pagamento (CC para Cartão de Crédito, CD para Cartão de Débito, CH para Cheque, CS para Compensação de saldos em conta corrente, LC para Letra comercial, MB para Multibanco, NU para Numerário, PR para Permuta, TB para Transferência Bancária, TR para Ticket Restaurante)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.PaymentMechanismType
	 * @see #isSetPaymentMechanism()
	 * @see #unsetPaymentMechanism()
	 * @see #setPaymentMechanism(PaymentMechanismType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getPayment_PaymentMechanism()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PaymentMechanism' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentMechanismType getPaymentMechanism();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.Payment#getPaymentMechanism <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.PaymentMechanismType
	 * @see #isSetPaymentMechanism()
	 * @see #unsetPaymentMechanism()
	 * @see #getPaymentMechanism()
	 * @generated
	 */
	void setPaymentMechanism(PaymentMechanismType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.Payment#getPaymentMechanism <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPaymentMechanism()
	 * @see #getPaymentMechanism()
	 * @see #setPaymentMechanism(PaymentMechanismType)
	 * @generated
	 */
	void unsetPaymentMechanism();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.Payment#getPaymentMechanism <em>Payment Mechanism</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Payment Mechanism</em>' attribute is set.
	 * @see #unsetPaymentMechanism()
	 * @see #getPaymentMechanism()
	 * @see #setPaymentMechanism(PaymentMechanismType)
	 * @generated
	 */
	boolean isSetPaymentMechanism();

	/**
	 * Returns the value of the '<em><b>Payment Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Amount</em>' attribute.
	 * @see #setPaymentAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getPayment_PaymentAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='PaymentAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getPaymentAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.Payment#getPaymentAmount <em>Payment Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Amount</em>' attribute.
	 * @see #getPaymentAmount()
	 * @generated
	 */
	void setPaymentAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Date</em>' attribute.
	 * @see #setPaymentDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getPayment_PaymentDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateType" required="true"
	 *        extendedMetaData="kind='element' name='PaymentDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getPaymentDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.Payment#getPaymentDate <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' attribute.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(XMLGregorianCalendar value);

} // Payment
