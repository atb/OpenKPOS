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
 * A representation of the model object '<em><b>Work Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getDocumentNumber <em>Document Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getATCUD <em>ATCUD</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getWorkDate <em>Work Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getWorkType <em>Work Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getEACCode <em>EAC Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getLine <em>Line</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getDocumentTotals <em>Document Totals</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType()
 * @model extendedMetaData="name='WorkDocument_._type' kind='elementOnly'"
 * @generated
 */
public interface WorkDocumentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Number</em>' attribute.
	 * @see #setDocumentNumber(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_DocumentNumber()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.DocumentNumberType" required="true"
	 *        extendedMetaData="kind='element' name='DocumentNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getDocumentNumber <em>Document Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Number</em>' attribute.
	 * @see #getDocumentNumber()
	 * @generated
	 */
	void setDocumentNumber(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_ATCUD()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax100Car" required="true"
	 *        extendedMetaData="kind='element' name='ATCUD' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATCUD();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getATCUD <em>ATCUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATCUD</em>' attribute.
	 * @see #getATCUD()
	 * @generated
	 */
	void setATCUD(String value);

	/**
	 * Returns the value of the '<em><b>Document Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Status</em>' containment reference.
	 * @see #setDocumentStatus(DocumentStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_DocumentStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentStatusType getDocumentStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getDocumentStatus <em>Document Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Status</em>' containment reference.
	 * @see #getDocumentStatus()
	 * @generated
	 */
	void setDocumentStatus(DocumentStatusType value);

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see #setHash(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_Hash()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax172Car" required="true"
	 *        extendedMetaData="kind='element' name='Hash' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(String value);

	/**
	 * Returns the value of the '<em><b>Hash Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash Control</em>' attribute.
	 * @see #setHashControl(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_HashControl()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTHashControl" required="true"
	 *        extendedMetaData="kind='element' name='HashControl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHashControl();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getHashControl <em>Hash Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Control</em>' attribute.
	 * @see #getHashControl()
	 * @generated
	 */
	void setHashControl(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_Period()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.PeriodType"
	 *        extendedMetaData="kind='element' name='Period' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPeriod();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Work Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Date</em>' attribute.
	 * @see #setWorkDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_WorkDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" required="true"
	 *        extendedMetaData="kind='element' name='WorkDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getWorkDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getWorkDate <em>Work Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Date</em>' attribute.
	 * @see #getWorkDate()
	 * @generated
	 */
	void setWorkDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Work Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.WorkTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Restricao: DC para documentos emitidos ate 2017-06-30, CM para consulta de mesa, CC para credito de consignacao, FC para fatura de consignacao nos termos do art.38 do CIVA, FO para folha de obra, NE para nota de encomenda, OU para outros documentos suscetiveis de apresentacao ao cliente para conferencia de mercadorias ou de prestacao de servicos que nao se encontrem aqui devidamente identificados (ou seus equivalentes), OR para orcamento, PF para fatura pro-forma. Para o setor Segurador quando para os tipos de documentos a seguir identificados tambem deva existir na tabela 4.1 - Documentos comerciais a clientes (SalesInvoices) a correspondente fatura ou documento rectificativo de fatura, ainda pode ser preenchido com RP para premio ou recibo de premio, RE para estorno ou recibo de estorno, CS para imputacao a co-seguradoras, LD para imputacao a co-seguradora lider, RA para resseguro aceite.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.WorkTypeType
	 * @see #isSetWorkType()
	 * @see #unsetWorkType()
	 * @see #setWorkType(WorkTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_WorkType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='WorkType' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkTypeType getWorkType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getWorkType <em>Work Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.WorkTypeType
	 * @see #isSetWorkType()
	 * @see #unsetWorkType()
	 * @see #getWorkType()
	 * @generated
	 */
	void setWorkType(WorkTypeType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getWorkType <em>Work Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkType()
	 * @see #getWorkType()
	 * @see #setWorkType(WorkTypeType)
	 * @generated
	 */
	void unsetWorkType();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getWorkType <em>Work Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Type</em>' attribute is set.
	 * @see #unsetWorkType()
	 * @see #getWorkType()
	 * @see #setWorkType(WorkTypeType)
	 * @generated
	 */
	boolean isSetWorkType();

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_SourceID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

	/**
	 * Returns the value of the '<em><b>EAC Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAC Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAC Code</em>' attribute.
	 * @see #setEACCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_EACCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.EACCodeType"
	 *        extendedMetaData="kind='element' name='EACCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEACCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getEACCode <em>EAC Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAC Code</em>' attribute.
	 * @see #getEACCode()
	 * @generated
	 */
	void setEACCode(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_SystemEntryDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='SystemEntryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSystemEntryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getSystemEntryDate <em>System Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Entry Date</em>' attribute.
	 * @see #getSystemEntryDate()
	 * @generated
	 */
	void setSystemEntryDate(XMLGregorianCalendar value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_TransactionID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTTransactionID"
	 *        extendedMetaData="kind='element' name='TransactionID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransactionID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getTransactionID <em>Transaction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction ID</em>' attribute.
	 * @see #getTransactionID()
	 * @generated
	 */
	void setTransactionID(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_CustomerID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='CustomerID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomerID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getCustomerID <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer ID</em>' attribute.
	 * @see #getCustomerID()
	 * @generated
	 */
	void setCustomerID(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.LineType2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_Line()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Line' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LineType2> getLine();

	/**
	 * Returns the value of the '<em><b>Document Totals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Totals</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Totals</em>' containment reference.
	 * @see #setDocumentTotals(DocumentTotalsType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getWorkDocumentType_DocumentTotals()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentTotals' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentTotalsType getDocumentTotals();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.WorkDocumentType#getDocumentTotals <em>Document Totals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Totals</em>' containment reference.
	 * @see #getDocumentTotals()
	 * @generated
	 */
	void setDocumentTotals(DocumentTotalsType value);

} // WorkDocumentType
