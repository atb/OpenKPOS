/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Debit Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getSourceDocumentID <em>Source Document ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getDebitAmount <em>Debit Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDebitLineType()
 * @model extendedMetaData="name='DebitLine_._type' kind='elementOnly'"
 * @generated
 */
public interface DebitLineType extends EObject {
	/**
	 * Returns the value of the '<em><b>Record ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record ID</em>' attribute.
	 * @see #setRecordID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDebitLineType_RecordID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='RecordID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRecordID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getRecordID <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record ID</em>' attribute.
	 * @see #getRecordID()
	 * @generated
	 */
	void setRecordID(String value);

	/**
	 * Returns the value of the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account ID</em>' attribute.
	 * @see #setAccountID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDebitLineType_AccountID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTGLAccountID" required="true"
	 *        extendedMetaData="kind='element' name='AccountID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #getAccountID()
	 * @generated
	 */
	void setAccountID(String value);

	/**
	 * Returns the value of the '<em><b>Source Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Document ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Document ID</em>' attribute.
	 * @see #setSourceDocumentID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDebitLineType_SourceDocumentID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car"
	 *        extendedMetaData="kind='element' name='SourceDocumentID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceDocumentID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getSourceDocumentID <em>Source Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Document ID</em>' attribute.
	 * @see #getSourceDocumentID()
	 * @generated
	 */
	void setSourceDocumentID(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDebitLineType_SystemEntryDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='SystemEntryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSystemEntryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getSystemEntryDate <em>System Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Entry Date</em>' attribute.
	 * @see #getSystemEntryDate()
	 * @generated
	 */
	void setSystemEntryDate(XMLGregorianCalendar value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDebitLineType_Description()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax200Car" required="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit Amount</em>' attribute.
	 * @see #setDebitAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getDebitLineType_DebitAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='DebitAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDebitAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.DebitLineType#getDebitAmount <em>Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit Amount</em>' attribute.
	 * @see #getDebitAmount()
	 * @generated
	 */
	void setDebitAmount(BigDecimal value);

} // DebitLineType
