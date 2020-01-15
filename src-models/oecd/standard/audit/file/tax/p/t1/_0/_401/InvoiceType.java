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
 * A representation of the model object '<em><b>Invoice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getInvoiceNo <em>Invoice No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getATCUD <em>ATCUD</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getSpecialRegimes <em>Special Regimes</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getEACCode <em>EAC Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getShipFrom <em>Ship From</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getMovementEndTime <em>Movement End Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getMovementStartTime <em>Movement Start Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getLine <em>Line</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getDocumentTotals <em>Document Totals</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getWithholdingTax <em>Withholding Tax</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType()
 * @model extendedMetaData="name='Invoice_._type' kind='elementOnly'"
 * @generated
 */
public interface InvoiceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Invoice No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice No</em>' attribute.
	 * @see #setInvoiceNo(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_InvoiceNo()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.InvoiceNoType" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceNo' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInvoiceNo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getInvoiceNo <em>Invoice No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice No</em>' attribute.
	 * @see #getInvoiceNo()
	 * @generated
	 */
	void setInvoiceNo(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_ATCUD()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax100Car" required="true"
	 *        extendedMetaData="kind='element' name='ATCUD' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATCUD();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getATCUD <em>ATCUD</em>}' attribute.
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
	 * @see #setDocumentStatus(DocumentStatusType3)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_DocumentStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentStatusType3 getDocumentStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getDocumentStatus <em>Document Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Status</em>' containment reference.
	 * @see #getDocumentStatus()
	 * @generated
	 */
	void setDocumentStatus(DocumentStatusType3 value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_Hash()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax172Car" required="true"
	 *        extendedMetaData="kind='element' name='Hash' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getHash <em>Hash</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_HashControl()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTHashControl" required="true"
	 *        extendedMetaData="kind='element' name='HashControl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHashControl();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getHashControl <em>Hash Control</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_Period()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.PeriodType"
	 *        extendedMetaData="kind='element' name='Period' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPeriod();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Date</em>' attribute.
	 * @see #setInvoiceDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_InvoiceDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getInvoiceDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getInvoiceDate <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Date</em>' attribute.
	 * @see #getInvoiceDate()
	 * @generated
	 */
	void setInvoiceDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Invoice Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Restricao:FT para Fatura, emitida nos termos do artigo 36. do Codigo do IVA, FS para Fatura simplificada, emitida nos termos do artigo 40. do Codigo do IVA, FR para Fatura-recibo, ND para Nota de debito, NC para Nota de credito, VD para Venda a dinheiro e factura/recibo (a), TV para Talao de venda (a), TD para Talao de devolucao (a), AA para Alienacao de ativos (a), DA para Devolucao de  ativos (a). Para o setor Segurador, ainda pode ser preenchido com: RP para Premio ou recibo de premio, RE para Estorno ou recibo de estorno, CS para Imputacao a co-seguradoras, LD para Imputacao a co-seguradora lider, RA para Resseguro aceite. (a) Para os dados ate 2012-12-31
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.InvoiceTypeType
	 * @see #isSetInvoiceType()
	 * @see #unsetInvoiceType()
	 * @see #setInvoiceType(InvoiceTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_InvoiceType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceType' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceTypeType getInvoiceType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getInvoiceType <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.InvoiceTypeType
	 * @see #isSetInvoiceType()
	 * @see #unsetInvoiceType()
	 * @see #getInvoiceType()
	 * @generated
	 */
	void setInvoiceType(InvoiceTypeType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getInvoiceType <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInvoiceType()
	 * @see #getInvoiceType()
	 * @see #setInvoiceType(InvoiceTypeType)
	 * @generated
	 */
	void unsetInvoiceType();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getInvoiceType <em>Invoice Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Invoice Type</em>' attribute is set.
	 * @see #unsetInvoiceType()
	 * @see #getInvoiceType()
	 * @see #setInvoiceType(InvoiceTypeType)
	 * @generated
	 */
	boolean isSetInvoiceType();

	/**
	 * Returns the value of the '<em><b>Special Regimes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Regimes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Regimes</em>' containment reference.
	 * @see #setSpecialRegimes(SpecialRegimes)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_SpecialRegimes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SpecialRegimes' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecialRegimes getSpecialRegimes();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getSpecialRegimes <em>Special Regimes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Regimes</em>' containment reference.
	 * @see #getSpecialRegimes()
	 * @generated
	 */
	void setSpecialRegimes(SpecialRegimes value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_SourceID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getSourceID <em>Source ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_EACCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.EACCodeType"
	 *        extendedMetaData="kind='element' name='EACCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEACCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getEACCode <em>EAC Code</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_SystemEntryDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='SystemEntryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSystemEntryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getSystemEntryDate <em>System Entry Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_TransactionID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTTransactionID"
	 *        extendedMetaData="kind='element' name='TransactionID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransactionID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getTransactionID <em>Transaction ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_CustomerID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='CustomerID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomerID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getCustomerID <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer ID</em>' attribute.
	 * @see #getCustomerID()
	 * @generated
	 */
	void setCustomerID(String value);

	/**
	 * Returns the value of the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship To</em>' containment reference.
	 * @see #setShipTo(ShippingPointStructure)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_ShipTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShipTo' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipTo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getShipTo <em>Ship To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship To</em>' containment reference.
	 * @see #getShipTo()
	 * @generated
	 */
	void setShipTo(ShippingPointStructure value);

	/**
	 * Returns the value of the '<em><b>Ship From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship From</em>' containment reference.
	 * @see #setShipFrom(ShippingPointStructure)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_ShipFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShipFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipFrom();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getShipFrom <em>Ship From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship From</em>' containment reference.
	 * @see #getShipFrom()
	 * @generated
	 */
	void setShipFrom(ShippingPointStructure value);

	/**
	 * Returns the value of the '<em><b>Movement End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement End Time</em>' attribute.
	 * @see #setMovementEndTime(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_MovementEndTime()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType"
	 *        extendedMetaData="kind='element' name='MovementEndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementEndTime();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getMovementEndTime <em>Movement End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement End Time</em>' attribute.
	 * @see #getMovementEndTime()
	 * @generated
	 */
	void setMovementEndTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Movement Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Start Time</em>' attribute.
	 * @see #setMovementStartTime(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_MovementStartTime()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType"
	 *        extendedMetaData="kind='element' name='MovementStartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementStartTime();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getMovementStartTime <em>Movement Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Start Time</em>' attribute.
	 * @see #getMovementStartTime()
	 * @generated
	 */
	void setMovementStartTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.LineType3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_Line()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Line' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LineType3> getLine();

	/**
	 * Returns the value of the '<em><b>Document Totals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Totals</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Totals</em>' containment reference.
	 * @see #setDocumentTotals(DocumentTotalsType3)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_DocumentTotals()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentTotals' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentTotalsType3 getDocumentTotals();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.InvoiceType#getDocumentTotals <em>Document Totals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Totals</em>' containment reference.
	 * @see #getDocumentTotals()
	 * @generated
	 */
	void setDocumentTotals(DocumentTotalsType3 value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getInvoiceType_WithholdingTax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WithholdingTax' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WithholdingTax> getWithholdingTax();

} // InvoiceType
