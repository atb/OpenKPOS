/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._201;

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
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getMovementStatus <em>Movement Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getMovementStatusDate <em>Movement Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getSourceBilling <em>Source Billing</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentStatusType1()
 * @model extendedMetaData="name='DocumentStatus_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentStatusType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Movement Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.MovementStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, T por conta de terceiros, A para Anulado, R para documento de resumo doutros documentos criados noutras aplicações e gerado nesta aplicação. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Movement Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.MovementStatusType
	 * @see #isSetMovementStatus()
	 * @see #unsetMovementStatus()
	 * @see #setMovementStatus(MovementStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentStatusType1_MovementStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MovementStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	MovementStatusType getMovementStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getMovementStatus <em>Movement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.MovementStatusType
	 * @see #isSetMovementStatus()
	 * @see #unsetMovementStatus()
	 * @see #getMovementStatus()
	 * @generated
	 */
	void setMovementStatus(MovementStatusType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getMovementStatus <em>Movement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMovementStatus()
	 * @see #getMovementStatus()
	 * @see #setMovementStatus(MovementStatusType)
	 * @generated
	 */
	void unsetMovementStatus();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getMovementStatus <em>Movement Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Movement Status</em>' attribute is set.
	 * @see #unsetMovementStatus()
	 * @see #getMovementStatus()
	 * @see #setMovementStatus(MovementStatusType)
	 * @generated
	 */
	boolean isSetMovementStatus();

	/**
	 * Returns the value of the '<em><b>Movement Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Status Date</em>' attribute.
	 * @see #setMovementStatusDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentStatusType1_MovementStatusDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='MovementStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getMovementStatusDate <em>Movement Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Status Date</em>' attribute.
	 * @see #getMovementStatusDate()
	 * @generated
	 */
	void setMovementStatusDate(XMLGregorianCalendar value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentStatusType1_Reason()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax50Car"
	 *        extendedMetaData="kind='element' name='Reason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getReason <em>Reason</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentStatusType1_SourceID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Source Billing</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._201.SourceBillingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * P para documento produzido na aplicação, I para documento integrado e produzido noutra aplicação, M para documento proveniente de recuperação de emissão manual 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Billing</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.SourceBillingType
	 * @see #isSetSourceBilling()
	 * @see #unsetSourceBilling()
	 * @see #setSourceBilling(SourceBillingType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getDocumentStatusType1_SourceBilling()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SourceBilling' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceBillingType getSourceBilling();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getSourceBilling <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Billing</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._201.SourceBillingType
	 * @see #isSetSourceBilling()
	 * @see #unsetSourceBilling()
	 * @see #getSourceBilling()
	 * @generated
	 */
	void setSourceBilling(SourceBillingType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getSourceBilling <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceBilling()
	 * @see #getSourceBilling()
	 * @see #setSourceBilling(SourceBillingType)
	 * @generated
	 */
	void unsetSourceBilling();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.DocumentStatusType1#getSourceBilling <em>Source Billing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Billing</em>' attribute is set.
	 * @see #unsetSourceBilling()
	 * @see #getSourceBilling()
	 * @see #setSourceBilling(SourceBillingType)
	 * @generated
	 */
	boolean isSetSourceBilling();

} // DocumentStatusType1
