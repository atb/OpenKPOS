/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductType <em>Product Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductGroup <em>Product Group</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductDescription <em>Product Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductNumberCode <em>Product Number Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getCustomsDetails <em>Customs Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getProductType()
 * @model extendedMetaData="name='Product_._type' kind='elementOnly'"
 * @generated
 */
public interface ProductType extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.ProductTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricao: P para Produtos, S para Servicos, O para Outros (Ex: portes debitados, adiantamentos recebidos ou alienacao de ativos), E para Impostos Especiais de Consumo (ex.:IABA, ISP, IT); I para impostos, taxas e encargos parafiscais exceto IVA e IS que deverao ser refletidos na tabela 2.5 Tabela de impostos (TaxTable)e Impostos Especiais de Consumo 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.ProductTypeType
	 * @see #isSetProductType()
	 * @see #unsetProductType()
	 * @see #setProductType(ProductTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getProductType_ProductType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ProductType' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductTypeType getProductType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductType <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.ProductTypeType
	 * @see #isSetProductType()
	 * @see #unsetProductType()
	 * @see #getProductType()
	 * @generated
	 */
	void setProductType(ProductTypeType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductType <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProductType()
	 * @see #getProductType()
	 * @see #setProductType(ProductTypeType)
	 * @generated
	 */
	void unsetProductType();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductType <em>Product Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Product Type</em>' attribute is set.
	 * @see #unsetProductType()
	 * @see #getProductType()
	 * @see #setProductType(ProductTypeType)
	 * @generated
	 */
	boolean isSetProductType();

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getProductType_ProductCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" required="true"
	 *        extendedMetaData="kind='element' name='ProductCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductCode <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Code</em>' attribute.
	 * @see #getProductCode()
	 * @generated
	 */
	void setProductCode(String value);

	/**
	 * Returns the value of the '<em><b>Product Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Group</em>' attribute.
	 * @see #setProductGroup(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getProductType_ProductGroup()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax50Car"
	 *        extendedMetaData="kind='element' name='ProductGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductGroup();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductGroup <em>Product Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Group</em>' attribute.
	 * @see #getProductGroup()
	 * @generated
	 */
	void setProductGroup(String value);

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
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getProductType_ProductDescription()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTProductDescription" required="true"
	 *        extendedMetaData="kind='element' name='ProductDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductDescription();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductDescription <em>Product Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Description</em>' attribute.
	 * @see #getProductDescription()
	 * @generated
	 */
	void setProductDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Number Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Number Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Number Code</em>' attribute.
	 * @see #setProductNumberCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getProductType_ProductNumberCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car" required="true"
	 *        extendedMetaData="kind='element' name='ProductNumberCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductNumberCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getProductNumberCode <em>Product Number Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Number Code</em>' attribute.
	 * @see #getProductNumberCode()
	 * @generated
	 */
	void setProductNumberCode(String value);

	/**
	 * Returns the value of the '<em><b>Customs Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customs Details</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customs Details</em>' containment reference.
	 * @see #setCustomsDetails(CustomsDetails)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getProductType_CustomsDetails()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomsDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomsDetails getCustomsDetails();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.ProductType#getCustomsDetails <em>Customs Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customs Details</em>' containment reference.
	 * @see #getCustomsDetails()
	 * @generated
	 */
	void setCustomsDetails(CustomsDetails value);

} // ProductType
