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
 * A representation of the model object '<em><b>Line Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getSourceDocumentID <em>Source Document ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getDebitAmount <em>Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getCreditAmount <em>Credit Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getLineType3()
 * @model extendedMetaData="name='Line_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface LineType3 extends EObject {
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getLineType3_RecordID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='RecordID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRecordID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getRecordID <em>Record ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getLineType3_AccountID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTGLAccountID" required="true"
	 *        extendedMetaData="kind='element' name='AccountID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getAccountID <em>Account ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getLineType3_SourceDocumentID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax30Car"
	 *        extendedMetaData="kind='element' name='SourceDocumentID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceDocumentID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getSourceDocumentID <em>Source Document ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getLineType3_SystemEntryDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='SystemEntryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSystemEntryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getSystemEntryDate <em>System Entry Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getLineType3_Description()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFPTtextTypeMandatoryMax200Car" required="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getDescription <em>Description</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getLineType3_DebitAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType"
	 *        extendedMetaData="kind='element' name='DebitAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDebitAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getDebitAmount <em>Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit Amount</em>' attribute.
	 * @see #getDebitAmount()
	 * @generated
	 */
	void setDebitAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Credit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Amount</em>' attribute.
	 * @see #setCreditAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._201._201Package#getLineType3_CreditAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._201.SAFmonetaryType"
	 *        extendedMetaData="kind='element' name='CreditAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCreditAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._201.LineType3#getCreditAmount <em>Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Amount</em>' attribute.
	 * @see #getCreditAmount()
	 * @generated
	 */
	void setCreditAmount(BigDecimal value);

} // LineType3
