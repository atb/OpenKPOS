/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01;

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
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceNo <em>Invoice No</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceStatus <em>Invoice Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getSelfBillingIndicator <em>Self Billing Indicator</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getShipFrom <em>Ship From</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getLine <em>Line</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getDocumentTotals <em>Document Totals</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType()
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_InvoiceNo()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.InvoiceNoType" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceNo' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInvoiceNo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceNo <em>Invoice No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice No</em>' attribute.
	 * @see #getInvoiceNo()
	 * @generated
	 */
	void setInvoiceNo(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.pt1_01.InvoiceStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, A para Anulado, F para Facturado, S para autofacturação
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01.InvoiceStatusType
	 * @see #isSetInvoiceStatus()
	 * @see #unsetInvoiceStatus()
	 * @see #setInvoiceStatus(InvoiceStatusType)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_InvoiceStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceStatusType getInvoiceStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceStatus <em>Invoice Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01.InvoiceStatusType
	 * @see #isSetInvoiceStatus()
	 * @see #unsetInvoiceStatus()
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	void setInvoiceStatus(InvoiceStatusType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceStatus <em>Invoice Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInvoiceStatus()
	 * @see #getInvoiceStatus()
	 * @see #setInvoiceStatus(InvoiceStatusType)
	 * @generated
	 */
	void unsetInvoiceStatus();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceStatus <em>Invoice Status</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see #setHash(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_Hash()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax200Car" required="true"
	 *        extendedMetaData="kind='element' name='Hash' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getHash <em>Hash</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_HashControl()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax40Car"
	 *        extendedMetaData="kind='element' name='HashControl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHashControl();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getHashControl <em>Hash Control</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_Period()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.PeriodType"
	 *        extendedMetaData="kind='element' name='Period' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPeriod();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getPeriod <em>Period</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_InvoiceDate()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFdateType" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getInvoiceDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceDate <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Date</em>' attribute.
	 * @see #getInvoiceDate()
	 * @generated
	 */
	void setInvoiceDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Invoice Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.pt1_01.InvoiceTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Restrição: Tipos de Documento (FT-Factura ou documento equivalente, ND-Nota de débito, NC-Nota de Crédito,VD-Venda a dinheiro e Factura/Recibo, TV-Talão de Venda,
	 *         TD-Talão de devolução,AA-Alienação Activos,DA-Devolução Activos, RP-Prémio ou Recibo Prémio, RE-Estorno ou Recibo de Estorno, CS-Imputação a Co-Seguradoras,
	 *         LD-Imputação a Co-Seguradora Líder, RA-Resseguro Aceite)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01.InvoiceTypeType
	 * @see #isSetInvoiceType()
	 * @see #unsetInvoiceType()
	 * @see #setInvoiceType(InvoiceTypeType)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_InvoiceType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceType' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceTypeType getInvoiceType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceType <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.pt1_01.InvoiceTypeType
	 * @see #isSetInvoiceType()
	 * @see #unsetInvoiceType()
	 * @see #getInvoiceType()
	 * @generated
	 */
	void setInvoiceType(InvoiceTypeType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceType <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInvoiceType()
	 * @see #getInvoiceType()
	 * @see #setInvoiceType(InvoiceTypeType)
	 * @generated
	 */
	void unsetInvoiceType();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getInvoiceType <em>Invoice Type</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Self Billing Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Billing Indicator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Billing Indicator</em>' attribute.
	 * @see #setSelfBillingIndicator(BigInteger)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_SelfBillingIndicator()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SelfBillingIndicatorType" required="true"
	 *        extendedMetaData="kind='element' name='SelfBillingIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSelfBillingIndicator();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getSelfBillingIndicator <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Billing Indicator</em>' attribute.
	 * @see #getSelfBillingIndicator()
	 * @generated
	 */
	void setSelfBillingIndicator(BigInteger value);

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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_SystemEntryDate()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='SystemEntryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSystemEntryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getSystemEntryDate <em>System Entry Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_TransactionID()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTTransactionID"
	 *        extendedMetaData="kind='element' name='TransactionID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransactionID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getTransactionID <em>Transaction ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_CustomerID()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='CustomerID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomerID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getCustomerID <em>Customer ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_ShipTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShipTo' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipTo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getShipTo <em>Ship To</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_ShipFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShipFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipFrom();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getShipFrom <em>Ship From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship From</em>' containment reference.
	 * @see #getShipFrom()
	 * @generated
	 */
	void setShipFrom(ShippingPointStructure value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.pt1_01.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_Line()
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
	 * @see #setDocumentTotals(DocumentTotalsType)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getInvoiceType_DocumentTotals()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentTotals' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentTotalsType getDocumentTotals();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.InvoiceType#getDocumentTotals <em>Document Totals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Totals</em>' containment reference.
	 * @see #getDocumentTotals()
	 * @generated
	 */
	void setDocumentTotals(DocumentTotalsType value);

} // InvoiceType
