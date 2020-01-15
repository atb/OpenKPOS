/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getAuditFileVersion <em>Audit File Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getTaxRegistrationNumber <em>Tax Registration Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getTaxAccountingBasis <em>Tax Accounting Basis</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getCompanyAddress <em>Company Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getFiscalYear <em>Fiscal Year</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getEndDate <em>End Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getTaxEntity <em>Tax Entity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getProductCompanyTaxID <em>Product Company Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getSoftwareCertificateNumber <em>Software Certificate Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getProductID <em>Product ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getHeaderComment <em>Header Comment</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getFax <em>Fax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getEmail <em>Email</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getWebsite <em>Website</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType()
 * @model extendedMetaData="name='Header_._type' kind='elementOnly'"
 * @generated
 */
public interface HeaderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Audit File Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit File Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit File Version</em>' attribute.
	 * @see #setAuditFileVersion(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_AuditFileVersion()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.AuditFileVersionType" required="true"
	 *        extendedMetaData="kind='element' name='AuditFileVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuditFileVersion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getAuditFileVersion <em>Audit File Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit File Version</em>' attribute.
	 * @see #getAuditFileVersion()
	 * @generated
	 */
	void setAuditFileVersion(String value);

	/**
	 * Returns the value of the '<em><b>Company ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concatenacao da Conservatoria do Registo Comercial com o numero do registo comercial separados pelo caracter espaco. Nos casos em que nao existe o registo comercial, deve ser indicado o NIF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Company ID</em>' attribute.
	 * @see #setCompanyID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_CompanyID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.CompanyIDType" required="true"
	 *        extendedMetaData="kind='element' name='CompanyID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompanyID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getCompanyID <em>Company ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company ID</em>' attribute.
	 * @see #getCompanyID()
	 * @generated
	 */
	void setCompanyID(String value);

	/**
	 * Returns the value of the '<em><b>Tax Registration Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Registration Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Registration Number</em>' attribute.
	 * @see #setTaxRegistrationNumber(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_TaxRegistrationNumber()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTPortugueseVatNumber" required="true"
	 *        extendedMetaData="kind='element' name='TaxRegistrationNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTaxRegistrationNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getTaxRegistrationNumber <em>Tax Registration Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Registration Number</em>' attribute.
	 * @see #getTaxRegistrationNumber()
	 * @generated
	 */
	void setTaxRegistrationNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Tax Accounting Basis</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.TaxAccountingBasisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * C para Contabilidade, E para Faturacao emitida por terceiros, F para Faturacao, I para Contabilidade integrada com a faturacao, P para Faturacao parcial, R para Recibos (a), S para Autofaturacao, T para Documentos de transporte (a). (a) Deve ser indicado este tipo, se o programa apenas este emitir este tipo de documento. Caso contrario, devera ser utilizado o tipo C, F ou I 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax Accounting Basis</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxAccountingBasisType
	 * @see #isSetTaxAccountingBasis()
	 * @see #unsetTaxAccountingBasis()
	 * @see #setTaxAccountingBasis(TaxAccountingBasisType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_TaxAccountingBasis()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TaxAccountingBasis' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxAccountingBasisType getTaxAccountingBasis();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getTaxAccountingBasis <em>Tax Accounting Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Accounting Basis</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxAccountingBasisType
	 * @see #isSetTaxAccountingBasis()
	 * @see #unsetTaxAccountingBasis()
	 * @see #getTaxAccountingBasis()
	 * @generated
	 */
	void setTaxAccountingBasis(TaxAccountingBasisType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getTaxAccountingBasis <em>Tax Accounting Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTaxAccountingBasis()
	 * @see #getTaxAccountingBasis()
	 * @see #setTaxAccountingBasis(TaxAccountingBasisType)
	 * @generated
	 */
	void unsetTaxAccountingBasis();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getTaxAccountingBasis <em>Tax Accounting Basis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tax Accounting Basis</em>' attribute is set.
	 * @see #unsetTaxAccountingBasis()
	 * @see #getTaxAccountingBasis()
	 * @see #setTaxAccountingBasis(TaxAccountingBasisType)
	 * @generated
	 */
	boolean isSetTaxAccountingBasis();

	/**
	 * Returns the value of the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name</em>' attribute.
	 * @see #setCompanyName(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_CompanyName()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax100Car" required="true"
	 *        extendedMetaData="kind='element' name='CompanyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getCompanyName <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name</em>' attribute.
	 * @see #getCompanyName()
	 * @generated
	 */
	void setCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>Business Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Name</em>' attribute.
	 * @see #setBusinessName(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_BusinessName()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car"
	 *        extendedMetaData="kind='element' name='BusinessName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBusinessName();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getBusinessName <em>Business Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Name</em>' attribute.
	 * @see #getBusinessName()
	 * @generated
	 */
	void setBusinessName(String value);

	/**
	 * Returns the value of the '<em><b>Company Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Address</em>' containment reference.
	 * @see #setCompanyAddress(AddressStructurePT)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_CompanyAddress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CompanyAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressStructurePT getCompanyAddress();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getCompanyAddress <em>Company Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Address</em>' containment reference.
	 * @see #getCompanyAddress()
	 * @generated
	 */
	void setCompanyAddress(AddressStructurePT value);

	/**
	 * Returns the value of the '<em><b>Fiscal Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiscal Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiscal Year</em>' attribute.
	 * @see #setFiscalYear(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_FiscalYear()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.FiscalYearType" required="true"
	 *        extendedMetaData="kind='element' name='FiscalYear' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFiscalYear();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getFiscalYear <em>Fiscal Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiscal Year</em>' attribute.
	 * @see #getFiscalYear()
	 * @generated
	 */
	void setFiscalYear(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_StartDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTDateSpan" required="true"
	 *        extendedMetaData="kind='element' name='StartDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_EndDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTDateSpan" required="true"
	 *        extendedMetaData="kind='element' name='EndDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Currency Code</b></em>' attribute.
	 * The default value is <code>"EUR"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Code</em>' attribute.
	 * @see #isSetCurrencyCode()
	 * @see #unsetCurrencyCode()
	 * @see #setCurrencyCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_CurrencyCode()
	 * @model default="EUR" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CurrencyCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCurrencyCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getCurrencyCode <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Code</em>' attribute.
	 * @see #isSetCurrencyCode()
	 * @see #unsetCurrencyCode()
	 * @see #getCurrencyCode()
	 * @generated
	 */
	void setCurrencyCode(String value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getCurrencyCode <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrencyCode()
	 * @see #getCurrencyCode()
	 * @see #setCurrencyCode(String)
	 * @generated
	 */
	void unsetCurrencyCode();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getCurrencyCode <em>Currency Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Currency Code</em>' attribute is set.
	 * @see #unsetCurrencyCode()
	 * @see #getCurrencyCode()
	 * @see #setCurrencyCode(String)
	 * @generated
	 */
	boolean isSetCurrencyCode();

	/**
	 * Returns the value of the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Created</em>' attribute.
	 * @see #setDateCreated(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_DateCreated()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTDateSpan" required="true"
	 *        extendedMetaData="kind='element' name='DateCreated' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateCreated();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Tax Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Entity</em>' attribute.
	 * @see #setTaxEntity(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_TaxEntity()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax20Car" required="true"
	 *        extendedMetaData="kind='element' name='TaxEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxEntity();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getTaxEntity <em>Tax Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Entity</em>' attribute.
	 * @see #getTaxEntity()
	 * @generated
	 */
	void setTaxEntity(String value);

	/**
	 * Returns the value of the '<em><b>Product Company Tax ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Company Tax ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Company Tax ID</em>' attribute.
	 * @see #setProductCompanyTaxID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_ProductCompanyTaxID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax20Car" required="true"
	 *        extendedMetaData="kind='element' name='ProductCompanyTaxID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductCompanyTaxID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getProductCompanyTaxID <em>Product Company Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Company Tax ID</em>' attribute.
	 * @see #getProductCompanyTaxID()
	 * @generated
	 */
	void setProductCompanyTaxID(String value);

	/**
	 * Returns the value of the '<em><b>Software Certificate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Certificate Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Certificate Number</em>' attribute.
	 * @see #setSoftwareCertificateNumber(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_SoftwareCertificateNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='SoftwareCertificateNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSoftwareCertificateNumber();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getSoftwareCertificateNumber <em>Software Certificate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Certificate Number</em>' attribute.
	 * @see #getSoftwareCertificateNumber()
	 * @generated
	 */
	void setSoftwareCertificateNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product ID</em>' attribute.
	 * @see #setProductID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_ProductID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTProductID" required="true"
	 *        extendedMetaData="kind='element' name='ProductID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getProductID <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product ID</em>' attribute.
	 * @see #getProductID()
	 * @generated
	 */
	void setProductID(String value);

	/**
	 * Returns the value of the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Version</em>' attribute.
	 * @see #setProductVersion(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_ProductVersion()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='ProductVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductVersion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getProductVersion <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Version</em>' attribute.
	 * @see #getProductVersion()
	 * @generated
	 */
	void setProductVersion(String value);

	/**
	 * Returns the value of the '<em><b>Header Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Comment</em>' attribute.
	 * @see #setHeaderComment(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_HeaderComment()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax255Car"
	 *        extendedMetaData="kind='element' name='HeaderComment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHeaderComment();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getHeaderComment <em>Header Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Comment</em>' attribute.
	 * @see #getHeaderComment()
	 * @generated
	 */
	void setHeaderComment(String value);

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_Telephone()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax20Car"
	 *        extendedMetaData="kind='element' name='Telephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fax</em>' attribute.
	 * @see #setFax(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_Fax()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax20Car"
	 *        extendedMetaData="kind='element' name='Fax' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFax();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getFax <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fax</em>' attribute.
	 * @see #getFax()
	 * @generated
	 */
	void setFax(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_Email()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax254Car"
	 *        extendedMetaData="kind='element' name='Email' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Website</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getHeaderType_Website()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFPTtextTypeMandatoryMax60Car"
	 *        extendedMetaData="kind='element' name='Website' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.HeaderType#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

} // HeaderType
