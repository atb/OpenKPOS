/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentMechanism <em>Payment Mechanism</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentDate <em>Payment Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getPaymentMethod()
 * @model extendedMetaData="name='PaymentMethod' kind='elementOnly'"
 * @generated
 */
public interface PaymentMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *          Restricao:CC para Cartao credito, CD para Cartao debito, CH para Cheque bancario, CO para Cheque ou cartao oferta, CS para Compensacao de saldos em conta corrente, DE para Dinheiro eletronico, por exemplo em cartoes de fidelidade ou de pontos, LC para Letra comercial, MB para Referencias de pagamento para Multibanco, NU para Numerario, OU para Outros meios aqui nao assinalados, PR para Permuta de bens, TB para Transferencia bancaria ou debito direto autorizado, TR para Ticket restaurante
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType
	 * @see #isSetPaymentMechanism()
	 * @see #unsetPaymentMechanism()
	 * @see #setPaymentMechanism(PaymentMechanismType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getPaymentMethod_PaymentMechanism()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PaymentMechanism' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentMechanismType getPaymentMechanism();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentMechanism <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Mechanism</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentMechanismType
	 * @see #isSetPaymentMechanism()
	 * @see #unsetPaymentMechanism()
	 * @see #getPaymentMechanism()
	 * @generated
	 */
	void setPaymentMechanism(PaymentMechanismType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentMechanism <em>Payment Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPaymentMechanism()
	 * @see #getPaymentMechanism()
	 * @see #setPaymentMechanism(PaymentMechanismType)
	 * @generated
	 */
	void unsetPaymentMechanism();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentMechanism <em>Payment Mechanism</em>}' attribute is set.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getPaymentMethod_PaymentAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='PaymentAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getPaymentAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentAmount <em>Payment Amount</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getPaymentMethod_PaymentDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFdateType" required="true"
	 *        extendedMetaData="kind='element' name='PaymentDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getPaymentDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentMethod#getPaymentDate <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' attribute.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(XMLGregorianCalendar value);

} // PaymentMethod
