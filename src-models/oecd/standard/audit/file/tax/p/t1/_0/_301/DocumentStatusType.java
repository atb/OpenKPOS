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
 * A representation of the model object '<em><b>Document Status Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getWorkStatus <em>Work Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getWorkStatusDate <em>Work Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getSourceBilling <em>Source Billing</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType()
 * @model extendedMetaData="name='DocumentStatus_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentStatusType extends EObject {
	/**
	 * Returns the value of the '<em><b>Work Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, A para Anulado, F para faturado (quando para este documento tambem existe na tabela 4.1. o correspondente do tipo fatura ou fatura simplificada) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType
	 * @see #isSetWorkStatus()
	 * @see #unsetWorkStatus()
	 * @see #setWorkStatus(WorkStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType_WorkStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='WorkStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkStatusType getWorkStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getWorkStatus <em>Work Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.WorkStatusType
	 * @see #isSetWorkStatus()
	 * @see #unsetWorkStatus()
	 * @see #getWorkStatus()
	 * @generated
	 */
	void setWorkStatus(WorkStatusType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getWorkStatus <em>Work Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkStatus()
	 * @see #getWorkStatus()
	 * @see #setWorkStatus(WorkStatusType)
	 * @generated
	 */
	void unsetWorkStatus();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getWorkStatus <em>Work Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Status</em>' attribute is set.
	 * @see #unsetWorkStatus()
	 * @see #getWorkStatus()
	 * @see #setWorkStatus(WorkStatusType)
	 * @generated
	 */
	boolean isSetWorkStatus();

	/**
	 * Returns the value of the '<em><b>Work Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Status Date</em>' attribute.
	 * @see #setWorkStatusDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType_WorkStatusDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='WorkStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getWorkStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getWorkStatusDate <em>Work Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Status Date</em>' attribute.
	 * @see #getWorkStatusDate()
	 * @generated
	 */
	void setWorkStatusDate(XMLGregorianCalendar value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType_Reason()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFPTtextTypeMandatoryMax50Car"
	 *        extendedMetaData="kind='element' name='Reason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getReason <em>Reason</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType_SourceID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Source Billing</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Billing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Billing</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling
	 * @see #isSetSourceBilling()
	 * @see #unsetSourceBilling()
	 * @see #setSourceBilling(SAFTPTSourceBilling)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType_SourceBilling()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SourceBilling' namespace='##targetNamespace'"
	 * @generated
	 */
	SAFTPTSourceBilling getSourceBilling();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getSourceBilling <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Billing</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling
	 * @see #isSetSourceBilling()
	 * @see #unsetSourceBilling()
	 * @see #getSourceBilling()
	 * @generated
	 */
	void setSourceBilling(SAFTPTSourceBilling value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getSourceBilling <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceBilling()
	 * @see #getSourceBilling()
	 * @see #setSourceBilling(SAFTPTSourceBilling)
	 * @generated
	 */
	void unsetSourceBilling();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType#getSourceBilling <em>Source Billing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Billing</em>' attribute is set.
	 * @see #unsetSourceBilling()
	 * @see #getSourceBilling()
	 * @see #setSourceBilling(SAFTPTSourceBilling)
	 * @generated
	 */
	boolean isSetSourceBilling();

} // DocumentStatusType
