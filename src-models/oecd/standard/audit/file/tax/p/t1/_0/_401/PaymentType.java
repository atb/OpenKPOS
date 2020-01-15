/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getPaymentRefNo <em>Payment Ref No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getATCUD <em>ATCUD</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getPaymentType <em>Payment Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getSystemID <em>System ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getLine <em>Line</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getDocumentTotals <em>Document Totals</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getWithholdingTax <em>Withholding Tax</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType()
 * @model extendedMetaData="name='Payment_._type' kind='elementOnly'"
 * @generated
 */
public interface PaymentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Ref No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Ref No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Ref No</em>' attribute.
	 * @see #setPaymentRefNo(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_PaymentRefNo()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.PaymentRefNoType" required="true"
	 *        extendedMetaData="kind='element' name='PaymentRefNo' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPaymentRefNo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getPaymentRefNo <em>Payment Ref No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Ref No</em>' attribute.
	 * @see #getPaymentRefNo()
	 * @generated
	 */
	void setPaymentRefNo(String value);

	/**
	 * Returns the value of the '<em><b>ATCUD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATCUD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATCUD</em>' attribute.
	 * @see #setATCUD(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_ATCUD()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax100Car" required="true"
	 *        extendedMetaData="kind='element' name='ATCUD' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATCUD();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getATCUD <em>ATCUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATCUD</em>' attribute.
	 * @see #getATCUD()
	 * @generated
	 */
	void setATCUD(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_Period()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.PeriodType"
	 *        extendedMetaData="kind='element' name='Period' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPeriod();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Transaction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction ID</em>' attribute.
	 * @see #setTransactionID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_TransactionID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTTransactionID"
	 *        extendedMetaData="kind='element' name='TransactionID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransactionID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getTransactionID <em>Transaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction ID</em>' attribute.
	 * @see #getTransactionID()
	 * @generated
	 */
	void setTransactionID(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date</em>' attribute.
	 * @see #setTransactionDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_TransactionDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" required="true"
	 *        extendedMetaData="kind='element' name='TransactionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTransactionDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getTransactionDate <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date</em>' attribute.
	 * @see #getTransactionDate()
	 * @generated
	 */
	void setTransactionDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Payment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.SAFTPTPaymentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.SAFTPTPaymentType
	 * @see #isSetPaymentType()
	 * @see #unsetPaymentType()
	 * @see #setPaymentType(SAFTPTPaymentType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_PaymentType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PaymentType' namespace='##targetNamespace'"
	 * @generated
	 */
	SAFTPTPaymentType getPaymentType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getPaymentType <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.SAFTPTPaymentType
	 * @see #isSetPaymentType()
	 * @see #unsetPaymentType()
	 * @see #getPaymentType()
	 * @generated
	 */
	void setPaymentType(SAFTPTPaymentType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getPaymentType <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPaymentType()
	 * @see #getPaymentType()
	 * @see #setPaymentType(SAFTPTPaymentType)
	 * @generated
	 */
	void unsetPaymentType();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getPaymentType <em>Payment Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Payment Type</em>' attribute is set.
	 * @see #unsetPaymentType()
	 * @see #getPaymentType()
	 * @see #setPaymentType(SAFTPTPaymentType)
	 * @generated
	 */
	boolean isSetPaymentType();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_Description()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax200Car"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>System ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System ID</em>' attribute.
	 * @see #setSystemID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_SystemID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car"
	 *        extendedMetaData="kind='element' name='SystemID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getSystemID <em>System ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System ID</em>' attribute.
	 * @see #getSystemID()
	 * @generated
	 */
	void setSystemID(String value);

	/**
	 * Returns the value of the '<em><b>Document Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Status</em>' containment reference.
	 * @see #setDocumentStatus(DocumentStatusType2)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_DocumentStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentStatusType2 getDocumentStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getDocumentStatus <em>Document Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Status</em>' containment reference.
	 * @see #getDocumentStatus()
	 * @generated
	 */
	void setDocumentStatus(DocumentStatusType2 value);

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_PaymentMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PaymentMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PaymentMethod> getPaymentMethod();

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_SourceID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

	/**
	 * Returns the value of the '<em><b>System Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Entry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Entry Date</em>' attribute.
	 * @see #setSystemEntryDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_SystemEntryDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='SystemEntryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSystemEntryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getSystemEntryDate <em>System Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Entry Date</em>' attribute.
	 * @see #getSystemEntryDate()
	 * @generated
	 */
	void setSystemEntryDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer ID</em>' attribute.
	 * @see #setCustomerID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_CustomerID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='CustomerID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomerID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getCustomerID <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer ID</em>' attribute.
	 * @see #getCustomerID()
	 * @generated
	 */
	void setCustomerID(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_Line()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Line' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LineType> getLine();

	/**
	 * Returns the value of the '<em><b>Document Totals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Totals</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Totals</em>' containment reference.
	 * @see #setDocumentTotals(DocumentTotalsType1)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_DocumentTotals()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentTotals' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentTotalsType1 getDocumentTotals();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.PaymentType#getDocumentTotals <em>Document Totals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Totals</em>' containment reference.
	 * @see #getDocumentTotals()
	 * @generated
	 */
	void setDocumentTotals(DocumentTotalsType1 value);

	/**
	 * Returns the value of the '<em><b>Withholding Tax</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.WithholdingTax}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Withholding Tax</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Withholding Tax</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getPaymentType_WithholdingTax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WithholdingTax' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WithholdingTax> getWithholdingTax();

} // PaymentType
