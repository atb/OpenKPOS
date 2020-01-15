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
 * A representation of the model object '<em><b>Stock Movement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getDocumentNumber <em>Document Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getATCUD <em>ATCUD</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getDocumentStatus <em>Document Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getHash <em>Hash</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getHashControl <em>Hash Control</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getPeriod <em>Period</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementDate <em>Movement Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementType <em>Movement Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getSystemEntryDate <em>System Entry Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getTransactionID <em>Transaction ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getSupplierID <em>Supplier ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getEACCode <em>EAC Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementComments <em>Movement Comments</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getShipFrom <em>Ship From</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementEndTime <em>Movement End Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementStartTime <em>Movement Start Time</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getATDocCodeID <em>AT Doc Code ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getLine <em>Line</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getDocumentTotals <em>Document Totals</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType()
 * @model extendedMetaData="name='StockMovement_._type' kind='elementOnly'"
 * @generated
 */
public interface StockMovementType extends EObject {
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_DocumentNumber()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.DocumentNumberType" required="true"
	 *        extendedMetaData="kind='element' name='DocumentNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getDocumentNumber <em>Document Number</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_ATCUD()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax100Car" required="true"
	 *        extendedMetaData="kind='element' name='ATCUD' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATCUD();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getATCUD <em>ATCUD</em>}' attribute.
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
	 * @see #setDocumentStatus(DocumentStatusType1)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_DocumentStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentStatusType1 getDocumentStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getDocumentStatus <em>Document Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Status</em>' containment reference.
	 * @see #getDocumentStatus()
	 * @generated
	 */
	void setDocumentStatus(DocumentStatusType1 value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_Hash()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax172Car" required="true"
	 *        extendedMetaData="kind='element' name='Hash' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getHash <em>Hash</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_HashControl()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTHashControl" required="true"
	 *        extendedMetaData="kind='element' name='HashControl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHashControl();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getHashControl <em>Hash Control</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_Period()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.PeriodType"
	 *        extendedMetaData="kind='element' name='Period' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPeriod();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Movement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Date</em>' attribute.
	 * @see #setMovementDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_MovementDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateType" required="true"
	 *        extendedMetaData="kind='element' name='MovementDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementDate <em>Movement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Date</em>' attribute.
	 * @see #getMovementDate()
	 * @generated
	 */
	void setMovementDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Movement Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.MovementTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Restricao: Tipos de Documento (GR para Guia de remessa, GT para Guia de transporte incluindo as globais, GA para Guia de movimentacao de ativos fixos proprios, GC para Guia de consignacao, GD para Guia ou nota de devolucao
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Movement Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.MovementTypeType
	 * @see #isSetMovementType()
	 * @see #unsetMovementType()
	 * @see #setMovementType(MovementTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_MovementType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MovementType' namespace='##targetNamespace'"
	 * @generated
	 */
	MovementTypeType getMovementType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementType <em>Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.MovementTypeType
	 * @see #isSetMovementType()
	 * @see #unsetMovementType()
	 * @see #getMovementType()
	 * @generated
	 */
	void setMovementType(MovementTypeType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementType <em>Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMovementType()
	 * @see #getMovementType()
	 * @see #setMovementType(MovementTypeType)
	 * @generated
	 */
	void unsetMovementType();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementType <em>Movement Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Movement Type</em>' attribute is set.
	 * @see #unsetMovementType()
	 * @see #getMovementType()
	 * @see #setMovementType(MovementTypeType)
	 * @generated
	 */
	boolean isSetMovementType();

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_SystemEntryDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='SystemEntryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSystemEntryDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getSystemEntryDate <em>System Entry Date</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_TransactionID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTTransactionID"
	 *        extendedMetaData="kind='element' name='TransactionID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransactionID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getTransactionID <em>Transaction ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_CustomerID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car"
	 *        extendedMetaData="kind='element' name='CustomerID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomerID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getCustomerID <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer ID</em>' attribute.
	 * @see #getCustomerID()
	 * @generated
	 */
	void setCustomerID(String value);

	/**
	 * Returns the value of the '<em><b>Supplier ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier ID</em>' attribute.
	 * @see #setSupplierID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_SupplierID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car"
	 *        extendedMetaData="kind='element' name='SupplierID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSupplierID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getSupplierID <em>Supplier ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier ID</em>' attribute.
	 * @see #getSupplierID()
	 * @generated
	 */
	void setSupplierID(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_SourceID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getSourceID <em>Source ID</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_EACCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.EACCodeType"
	 *        extendedMetaData="kind='element' name='EACCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEACCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getEACCode <em>EAC Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAC Code</em>' attribute.
	 * @see #getEACCode()
	 * @generated
	 */
	void setEACCode(String value);

	/**
	 * Returns the value of the '<em><b>Movement Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Comments</em>' attribute.
	 * @see #setMovementComments(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_MovementComments()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car"
	 *        extendedMetaData="kind='element' name='MovementComments' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMovementComments();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementComments <em>Movement Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Comments</em>' attribute.
	 * @see #getMovementComments()
	 * @generated
	 */
	void setMovementComments(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_ShipTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShipTo' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipTo();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getShipTo <em>Ship To</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_ShipFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShipFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	ShippingPointStructure getShipFrom();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getShipFrom <em>Ship From</em>}' containment reference.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_MovementEndTime()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType"
	 *        extendedMetaData="kind='element' name='MovementEndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementEndTime();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementEndTime <em>Movement End Time</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_MovementStartTime()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='MovementStartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementStartTime();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getMovementStartTime <em>Movement Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Start Time</em>' attribute.
	 * @see #getMovementStartTime()
	 * @generated
	 */
	void setMovementStartTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>AT Doc Code ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AT Doc Code ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AT Doc Code ID</em>' attribute.
	 * @see #setATDocCodeID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_ATDocCodeID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax200Car"
	 *        extendedMetaData="kind='element' name='ATDocCodeID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATDocCodeID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getATDocCodeID <em>AT Doc Code ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AT Doc Code ID</em>' attribute.
	 * @see #getATDocCodeID()
	 * @generated
	 */
	void setATDocCodeID(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_Line()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Line' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LineType1> getLine();

	/**
	 * Returns the value of the '<em><b>Document Totals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Totals</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Totals</em>' containment reference.
	 * @see #setDocumentTotals(DocumentTotalsType2)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getStockMovementType_DocumentTotals()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentTotals' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentTotalsType2 getDocumentTotals();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.StockMovementType#getDocumentTotals <em>Document Totals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Totals</em>' containment reference.
	 * @see #getDocumentTotals()
	 * @generated
	 */
	void setDocumentTotals(DocumentTotalsType2 value);

} // StockMovementType
