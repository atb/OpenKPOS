/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getOrderReferences <em>Order References</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getProductDescription <em>Product Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getProductSerialNumber <em>Product Serial Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getDebitAmount <em>Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getCreditAmount <em>Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getTax <em>Tax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getTaxExemptionReason <em>Tax Exemption Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getTaxExemptionCode <em>Tax Exemption Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getCustomsInformation <em>Customs Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1()
 * @model extendedMetaData="name='Line_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface LineType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_LineNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='LineNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLineNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Order References</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.OrderReferences}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order References</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_OrderReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrderReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrderReferences> getOrderReferences();

	/**
	 * Returns the value of the '<em><b>Product Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Code</em>' attribute.
	 * @see #setProductCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_ProductCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" required="true"
	 *        extendedMetaData="kind='element' name='ProductCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getProductCode <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Code</em>' attribute.
	 * @see #getProductCode()
	 * @generated
	 */
	void setProductCode(String value);

	/**
	 * Returns the value of the '<em><b>Product Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Description</em>' attribute.
	 * @see #setProductDescription(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_ProductDescription()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTProductDescription" required="true"
	 *        extendedMetaData="kind='element' name='ProductDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getProductDescription <em>Product Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Description</em>' attribute.
	 * @see #getProductDescription()
	 * @generated
	 */
	void setProductDescription(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_Quantity()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdecimalType" required="true"
	 *        extendedMetaData="kind='element' name='Quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit Of Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Of Measure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Of Measure</em>' attribute.
	 * @see #setUnitOfMeasure(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_UnitOfMeasure()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax20Car" required="true"
	 *        extendedMetaData="kind='element' name='UnitOfMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnitOfMeasure();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getUnitOfMeasure <em>Unit Of Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measure</em>' attribute.
	 * @see #getUnitOfMeasure()
	 * @generated
	 */
	void setUnitOfMeasure(String value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Price</em>' attribute.
	 * @see #setUnitPrice(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_UnitPrice()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='UnitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getUnitPrice();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getUnitPrice <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' attribute.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(BigDecimal value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_Description()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax200Car" required="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Serial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Serial Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Serial Number</em>' containment reference.
	 * @see #setProductSerialNumber(ProductSerialNumber)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_ProductSerialNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProductSerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductSerialNumber getProductSerialNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getProductSerialNumber <em>Product Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Serial Number</em>' containment reference.
	 * @see #getProductSerialNumber()
	 * @generated
	 */
	void setProductSerialNumber(ProductSerialNumber value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_DebitAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType"
	 *        extendedMetaData="kind='element' name='DebitAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDebitAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getDebitAmount <em>Debit Amount</em>}' attribute.
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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_CreditAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType"
	 *        extendedMetaData="kind='element' name='CreditAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCreditAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getCreditAmount <em>Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Amount</em>' attribute.
	 * @see #getCreditAmount()
	 * @generated
	 */
	void setCreditAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax</em>' containment reference.
	 * @see #setTax(MovementTax)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_Tax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Tax' namespace='##targetNamespace'"
	 * @generated
	 */
	MovementTax getTax();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getTax <em>Tax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax</em>' containment reference.
	 * @see #getTax()
	 * @generated
	 */
	void setTax(MovementTax value);

	/**
	 * Returns the value of the '<em><b>Tax Exemption Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Exemption Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Exemption Reason</em>' attribute.
	 * @see #setTaxExemptionReason(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_TaxExemptionReason()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTPortugueseTaxExemptionReason"
	 *        extendedMetaData="kind='element' name='TaxExemptionReason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxExemptionReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getTaxExemptionReason <em>Tax Exemption Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Exemption Reason</em>' attribute.
	 * @see #getTaxExemptionReason()
	 * @generated
	 */
	void setTaxExemptionReason(String value);

	/**
	 * Returns the value of the '<em><b>Tax Exemption Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Exemption Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Exemption Code</em>' attribute.
	 * @see #setTaxExemptionCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_TaxExemptionCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTPortugueseTaxExemptionCode"
	 *        extendedMetaData="kind='element' name='TaxExemptionCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxExemptionCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getTaxExemptionCode <em>Tax Exemption Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Exemption Code</em>' attribute.
	 * @see #getTaxExemptionCode()
	 * @generated
	 */
	void setTaxExemptionCode(String value);

	/**
	 * Returns the value of the '<em><b>Settlement Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlement Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlement Amount</em>' attribute.
	 * @see #setSettlementAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_SettlementAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType"
	 *        extendedMetaData="kind='element' name='SettlementAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSettlementAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getSettlementAmount <em>Settlement Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Amount</em>' attribute.
	 * @see #getSettlementAmount()
	 * @generated
	 */
	void setSettlementAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Customs Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customs Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customs Information</em>' containment reference.
	 * @see #setCustomsInformation(CustomsInformation)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getLineType1_CustomsInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomsInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomsInformation getCustomsInformation();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.LineType1#getCustomsInformation <em>Customs Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customs Information</em>' containment reference.
	 * @see #getCustomsInformation()
	 * @generated
	 */
	void setCustomsInformation(CustomsInformation value);

} // LineType1
