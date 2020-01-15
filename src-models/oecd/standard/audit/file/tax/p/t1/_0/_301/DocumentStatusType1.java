/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Status Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getPaymentStatusDate <em>Payment Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getSourcePayment <em>Source Payment</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType1()
 * @model extendedMetaData="name='DocumentStatus_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentStatusType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para normal, A para Anulado 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType
	 * @see #isSetPaymentStatus()
	 * @see #unsetPaymentStatus()
	 * @see #setPaymentStatus(PaymentStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType1_PaymentStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PaymentStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentStatusType getPaymentStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getPaymentStatus <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.PaymentStatusType
	 * @see #isSetPaymentStatus()
	 * @see #unsetPaymentStatus()
	 * @see #getPaymentStatus()
	 * @generated
	 */
	void setPaymentStatus(PaymentStatusType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getPaymentStatus <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPaymentStatus()
	 * @see #getPaymentStatus()
	 * @see #setPaymentStatus(PaymentStatusType)
	 * @generated
	 */
	void unsetPaymentStatus();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getPaymentStatus <em>Payment Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Payment Status</em>' attribute is set.
	 * @see #unsetPaymentStatus()
	 * @see #getPaymentStatus()
	 * @see #setPaymentStatus(PaymentStatusType)
	 * @generated
	 */
	boolean isSetPaymentStatus();

	/**
	 * Returns the value of the '<em><b>Payment Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Status Date</em>' attribute.
	 * @see #setPaymentStatusDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType1_PaymentStatusDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='PaymentStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getPaymentStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getPaymentStatusDate <em>Payment Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Status Date</em>' attribute.
	 * @see #getPaymentStatusDate()
	 * @generated
	 */
	void setPaymentStatusDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType1_Reason()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFPTtextTypeMandatoryMax50Car"
	 *        extendedMetaData="kind='element' name='Reason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source ID</em>' attribute.
	 * @see #setSourceID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType1_SourceID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Source Payment</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Payment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Payment</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment
	 * @see #isSetSourcePayment()
	 * @see #unsetSourcePayment()
	 * @see #setSourcePayment(SAFTPTSourcePayment)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType1_SourcePayment()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SourcePayment' namespace='##targetNamespace'"
	 * @generated
	 */
	SAFTPTSourcePayment getSourcePayment();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getSourcePayment <em>Source Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Payment</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourcePayment
	 * @see #isSetSourcePayment()
	 * @see #unsetSourcePayment()
	 * @see #getSourcePayment()
	 * @generated
	 */
	void setSourcePayment(SAFTPTSourcePayment value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getSourcePayment <em>Source Payment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourcePayment()
	 * @see #getSourcePayment()
	 * @see #setSourcePayment(SAFTPTSourcePayment)
	 * @generated
	 */
	void unsetSourcePayment();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType1#getSourcePayment <em>Source Payment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Payment</em>' attribute is set.
	 * @see #unsetSourcePayment()
	 * @see #getSourcePayment()
	 * @see #setSourcePayment(SAFTPTSourcePayment)
	 * @generated
	 */
	boolean isSetSourcePayment();

} // DocumentStatusType1
