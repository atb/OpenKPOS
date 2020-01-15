/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Status Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getInvoiceStatus <em>Invoice Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getInvoiceStatusDate <em>Invoice Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getSourceBilling <em>Source Billing</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentStatusType3()
 * @model extendedMetaData="name='DocumentStatus_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentStatusType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Invoice Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, S para Autofaturacao, A para Documento anulado, R para Documento de resumo doutros documentos criados noutras aplicacoes e gerado nesta aplicacao, F para Documento faturado 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.InvoiceStatusType
	 * @see #isSetInvoiceStatus()
	 * @see #unsetInvoiceStatus()
	 * @see #setInvoiceStatus(InvoiceStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentStatusType3_InvoiceStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceStatusType getInvoiceStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getInvoiceStatus <em>Invoice Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.InvoiceStatusType
	 * @see #isSetInvoiceStatus()
	 * @see #unsetInvoiceStatus()
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	void setInvoiceStatus(InvoiceStatusType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getInvoiceStatus <em>Invoice Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInvoiceStatus()
	 * @see #getInvoiceStatus()
	 * @see #setInvoiceStatus(InvoiceStatusType)
	 * @generated
	 */
	void unsetInvoiceStatus();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getInvoiceStatus <em>Invoice Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Invoice Status</em>' attribute is set.
	 * @see #unsetInvoiceStatus()
	 * @see #getInvoiceStatus()
	 * @see #setInvoiceStatus(InvoiceStatusType)
	 * @generated
	 */
	boolean isSetInvoiceStatus();

	/**
	 * Returns the value of the '<em><b>Invoice Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Status Date</em>' attribute.
	 * @see #setInvoiceStatusDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentStatusType3_InvoiceStatusDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getInvoiceStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getInvoiceStatusDate <em>Invoice Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Status Date</em>' attribute.
	 * @see #getInvoiceStatusDate()
	 * @generated
	 */
	void setInvoiceStatusDate(XMLGregorianCalendar value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentStatusType3_Reason()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax50Car"
	 *        extendedMetaData="kind='element' name='Reason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getReason <em>Reason</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentStatusType3_SourceID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Source Billing</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.SAFTPTSourceBilling}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Billing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Billing</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.SAFTPTSourceBilling
	 * @see #isSetSourceBilling()
	 * @see #unsetSourceBilling()
	 * @see #setSourceBilling(SAFTPTSourceBilling)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDocumentStatusType3_SourceBilling()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SourceBilling' namespace='##targetNamespace'"
	 * @generated
	 */
	SAFTPTSourceBilling getSourceBilling();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getSourceBilling <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Billing</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.SAFTPTSourceBilling
	 * @see #isSetSourceBilling()
	 * @see #unsetSourceBilling()
	 * @see #getSourceBilling()
	 * @generated
	 */
	void setSourceBilling(SAFTPTSourceBilling value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getSourceBilling <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceBilling()
	 * @see #getSourceBilling()
	 * @see #setSourceBilling(SAFTPTSourceBilling)
	 * @generated
	 */
	void unsetSourceBilling();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DocumentStatusType3#getSourceBilling <em>Source Billing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Billing</em>' attribute is set.
	 * @see #unsetSourceBilling()
	 * @see #getSourceBilling()
	 * @see #setSourceBilling(SAFTPTSourceBilling)
	 * @generated
	 */
	boolean isSetSourceBilling();

} // DocumentStatusType3
