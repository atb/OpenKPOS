/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._401.CustomsInformation;
import oecd.standard.audit.file.tax.p.t1._0._401.LineType3;
import oecd.standard.audit.file.tax.p.t1._0._401.OrderReferences;
import oecd.standard.audit.file.tax.p.t1._0._401.ProductSerialNumber;
import oecd.standard.audit.file.tax.p.t1._0._401.References;
import oecd.standard.audit.file.tax.p.t1._0._401.Tax;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getOrderReferences <em>Order References</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getProductCode <em>Product Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getProductDescription <em>Product Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getTaxBase <em>Tax Base</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getTaxPointDate <em>Tax Point Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getReferences <em>References</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getProductSerialNumber <em>Product Serial Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getDebitAmount <em>Debit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getCreditAmount <em>Credit Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getTax <em>Tax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getTaxExemptionReason <em>Tax Exemption Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getTaxExemptionCode <em>Tax Exemption Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getSettlementAmount <em>Settlement Amount</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.LineType3Impl#getCustomsInformation <em>Customs Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineType3Impl extends EObjectImpl implements LineType3 {
	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LINE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderReferences() <em>Order References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderReferences> orderReferences;

	/**
	 * The default value of the '{@link #getProductCode() <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCode() <em>Product Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCode()
	 * @generated
	 * @ordered
	 */
	protected String productCode = PRODUCT_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductDescription() <em>Product Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductDescription() <em>Product Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDescription()
	 * @generated
	 * @ordered
	 */
	protected String productDescription = PRODUCT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_OF_MEASURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected String unitOfMeasure = UNIT_OF_MEASURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNIT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal unitPrice = UNIT_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxBase() <em>Tax Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxBase()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxBase() <em>Tax Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxBase()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal taxBase = TAX_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxPointDate() <em>Tax Point Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPointDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TAX_POINT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxPointDate() <em>Tax Point Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPointDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar taxPointDate = TAX_POINT_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<References> references;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductSerialNumber() <em>Product Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected ProductSerialNumber productSerialNumber;

	/**
	 * The default value of the '{@link #getDebitAmount() <em>Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DEBIT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebitAmount() <em>Debit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebitAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal debitAmount = DEBIT_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreditAmount() <em>Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CREDIT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreditAmount() <em>Credit Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal creditAmount = CREDIT_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTax() <em>Tax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax()
	 * @generated
	 * @ordered
	 */
	protected Tax tax;

	/**
	 * The default value of the '{@link #getTaxExemptionReason() <em>Tax Exemption Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExemptionReason()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_EXEMPTION_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxExemptionReason() <em>Tax Exemption Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExemptionReason()
	 * @generated
	 * @ordered
	 */
	protected String taxExemptionReason = TAX_EXEMPTION_REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxExemptionCode() <em>Tax Exemption Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExemptionCode()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_EXEMPTION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxExemptionCode() <em>Tax Exemption Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExemptionCode()
	 * @generated
	 * @ordered
	 */
	protected String taxExemptionCode = TAX_EXEMPTION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSettlementAmount() <em>Settlement Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SETTLEMENT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSettlementAmount() <em>Settlement Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal settlementAmount = SETTLEMENT_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomsInformation() <em>Customs Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomsInformation()
	 * @generated
	 * @ordered
	 */
	protected CustomsInformation customsInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getLineType3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNumber(BigInteger newLineNumber) {
		BigInteger oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__LINE_NUMBER, oldLineNumber, lineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderReferences> getOrderReferences() {
		if (orderReferences == null) {
			orderReferences = new EObjectContainmentEList<OrderReferences>(OrderReferences.class, this, _401Package.LINE_TYPE3__ORDER_REFERENCES);
		}
		return orderReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductCode(String newProductCode) {
		String oldProductCode = productCode;
		productCode = newProductCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__PRODUCT_CODE, oldProductCode, productCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDescription(String newProductDescription) {
		String oldProductDescription = productDescription;
		productDescription = newProductDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__PRODUCT_DESCRIPTION, oldProductDescription, productDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(BigDecimal newQuantity) {
		BigDecimal oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitOfMeasure(String newUnitOfMeasure) {
		String oldUnitOfMeasure = unitOfMeasure;
		unitOfMeasure = newUnitOfMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__UNIT_OF_MEASURE, oldUnitOfMeasure, unitOfMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(BigDecimal newUnitPrice) {
		BigDecimal oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__UNIT_PRICE, oldUnitPrice, unitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxBase() {
		return taxBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxBase(BigDecimal newTaxBase) {
		BigDecimal oldTaxBase = taxBase;
		taxBase = newTaxBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__TAX_BASE, oldTaxBase, taxBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTaxPointDate() {
		return taxPointDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxPointDate(XMLGregorianCalendar newTaxPointDate) {
		XMLGregorianCalendar oldTaxPointDate = taxPointDate;
		taxPointDate = newTaxPointDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__TAX_POINT_DATE, oldTaxPointDate, taxPointDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<References> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<References>(References.class, this, _401Package.LINE_TYPE3__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSerialNumber getProductSerialNumber() {
		return productSerialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductSerialNumber(ProductSerialNumber newProductSerialNumber, NotificationChain msgs) {
		ProductSerialNumber oldProductSerialNumber = productSerialNumber;
		productSerialNumber = newProductSerialNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__PRODUCT_SERIAL_NUMBER, oldProductSerialNumber, newProductSerialNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductSerialNumber(ProductSerialNumber newProductSerialNumber) {
		if (newProductSerialNumber != productSerialNumber) {
			NotificationChain msgs = null;
			if (productSerialNumber != null)
				msgs = ((InternalEObject)productSerialNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.LINE_TYPE3__PRODUCT_SERIAL_NUMBER, null, msgs);
			if (newProductSerialNumber != null)
				msgs = ((InternalEObject)newProductSerialNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.LINE_TYPE3__PRODUCT_SERIAL_NUMBER, null, msgs);
			msgs = basicSetProductSerialNumber(newProductSerialNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__PRODUCT_SERIAL_NUMBER, newProductSerialNumber, newProductSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDebitAmount() {
		return debitAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebitAmount(BigDecimal newDebitAmount) {
		BigDecimal oldDebitAmount = debitAmount;
		debitAmount = newDebitAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__DEBIT_AMOUNT, oldDebitAmount, debitAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCreditAmount() {
		return creditAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditAmount(BigDecimal newCreditAmount) {
		BigDecimal oldCreditAmount = creditAmount;
		creditAmount = newCreditAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__CREDIT_AMOUNT, oldCreditAmount, creditAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tax getTax() {
		return tax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTax(Tax newTax, NotificationChain msgs) {
		Tax oldTax = tax;
		tax = newTax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__TAX, oldTax, newTax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTax(Tax newTax) {
		if (newTax != tax) {
			NotificationChain msgs = null;
			if (tax != null)
				msgs = ((InternalEObject)tax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.LINE_TYPE3__TAX, null, msgs);
			if (newTax != null)
				msgs = ((InternalEObject)newTax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.LINE_TYPE3__TAX, null, msgs);
			msgs = basicSetTax(newTax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__TAX, newTax, newTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxExemptionReason() {
		return taxExemptionReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxExemptionReason(String newTaxExemptionReason) {
		String oldTaxExemptionReason = taxExemptionReason;
		taxExemptionReason = newTaxExemptionReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__TAX_EXEMPTION_REASON, oldTaxExemptionReason, taxExemptionReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxExemptionCode() {
		return taxExemptionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxExemptionCode(String newTaxExemptionCode) {
		String oldTaxExemptionCode = taxExemptionCode;
		taxExemptionCode = newTaxExemptionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__TAX_EXEMPTION_CODE, oldTaxExemptionCode, taxExemptionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSettlementAmount() {
		return settlementAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettlementAmount(BigDecimal newSettlementAmount) {
		BigDecimal oldSettlementAmount = settlementAmount;
		settlementAmount = newSettlementAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__SETTLEMENT_AMOUNT, oldSettlementAmount, settlementAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomsInformation getCustomsInformation() {
		return customsInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomsInformation(CustomsInformation newCustomsInformation, NotificationChain msgs) {
		CustomsInformation oldCustomsInformation = customsInformation;
		customsInformation = newCustomsInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__CUSTOMS_INFORMATION, oldCustomsInformation, newCustomsInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomsInformation(CustomsInformation newCustomsInformation) {
		if (newCustomsInformation != customsInformation) {
			NotificationChain msgs = null;
			if (customsInformation != null)
				msgs = ((InternalEObject)customsInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.LINE_TYPE3__CUSTOMS_INFORMATION, null, msgs);
			if (newCustomsInformation != null)
				msgs = ((InternalEObject)newCustomsInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.LINE_TYPE3__CUSTOMS_INFORMATION, null, msgs);
			msgs = basicSetCustomsInformation(newCustomsInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.LINE_TYPE3__CUSTOMS_INFORMATION, newCustomsInformation, newCustomsInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.LINE_TYPE3__ORDER_REFERENCES:
				return ((InternalEList<?>)getOrderReferences()).basicRemove(otherEnd, msgs);
			case _401Package.LINE_TYPE3__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case _401Package.LINE_TYPE3__PRODUCT_SERIAL_NUMBER:
				return basicSetProductSerialNumber(null, msgs);
			case _401Package.LINE_TYPE3__TAX:
				return basicSetTax(null, msgs);
			case _401Package.LINE_TYPE3__CUSTOMS_INFORMATION:
				return basicSetCustomsInformation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _401Package.LINE_TYPE3__LINE_NUMBER:
				return getLineNumber();
			case _401Package.LINE_TYPE3__ORDER_REFERENCES:
				return getOrderReferences();
			case _401Package.LINE_TYPE3__PRODUCT_CODE:
				return getProductCode();
			case _401Package.LINE_TYPE3__PRODUCT_DESCRIPTION:
				return getProductDescription();
			case _401Package.LINE_TYPE3__QUANTITY:
				return getQuantity();
			case _401Package.LINE_TYPE3__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case _401Package.LINE_TYPE3__UNIT_PRICE:
				return getUnitPrice();
			case _401Package.LINE_TYPE3__TAX_BASE:
				return getTaxBase();
			case _401Package.LINE_TYPE3__TAX_POINT_DATE:
				return getTaxPointDate();
			case _401Package.LINE_TYPE3__REFERENCES:
				return getReferences();
			case _401Package.LINE_TYPE3__DESCRIPTION:
				return getDescription();
			case _401Package.LINE_TYPE3__PRODUCT_SERIAL_NUMBER:
				return getProductSerialNumber();
			case _401Package.LINE_TYPE3__DEBIT_AMOUNT:
				return getDebitAmount();
			case _401Package.LINE_TYPE3__CREDIT_AMOUNT:
				return getCreditAmount();
			case _401Package.LINE_TYPE3__TAX:
				return getTax();
			case _401Package.LINE_TYPE3__TAX_EXEMPTION_REASON:
				return getTaxExemptionReason();
			case _401Package.LINE_TYPE3__TAX_EXEMPTION_CODE:
				return getTaxExemptionCode();
			case _401Package.LINE_TYPE3__SETTLEMENT_AMOUNT:
				return getSettlementAmount();
			case _401Package.LINE_TYPE3__CUSTOMS_INFORMATION:
				return getCustomsInformation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _401Package.LINE_TYPE3__LINE_NUMBER:
				setLineNumber((BigInteger)newValue);
				return;
			case _401Package.LINE_TYPE3__ORDER_REFERENCES:
				getOrderReferences().clear();
				getOrderReferences().addAll((Collection<? extends OrderReferences>)newValue);
				return;
			case _401Package.LINE_TYPE3__PRODUCT_CODE:
				setProductCode((String)newValue);
				return;
			case _401Package.LINE_TYPE3__PRODUCT_DESCRIPTION:
				setProductDescription((String)newValue);
				return;
			case _401Package.LINE_TYPE3__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case _401Package.LINE_TYPE3__UNIT_OF_MEASURE:
				setUnitOfMeasure((String)newValue);
				return;
			case _401Package.LINE_TYPE3__UNIT_PRICE:
				setUnitPrice((BigDecimal)newValue);
				return;
			case _401Package.LINE_TYPE3__TAX_BASE:
				setTaxBase((BigDecimal)newValue);
				return;
			case _401Package.LINE_TYPE3__TAX_POINT_DATE:
				setTaxPointDate((XMLGregorianCalendar)newValue);
				return;
			case _401Package.LINE_TYPE3__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends References>)newValue);
				return;
			case _401Package.LINE_TYPE3__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _401Package.LINE_TYPE3__PRODUCT_SERIAL_NUMBER:
				setProductSerialNumber((ProductSerialNumber)newValue);
				return;
			case _401Package.LINE_TYPE3__DEBIT_AMOUNT:
				setDebitAmount((BigDecimal)newValue);
				return;
			case _401Package.LINE_TYPE3__CREDIT_AMOUNT:
				setCreditAmount((BigDecimal)newValue);
				return;
			case _401Package.LINE_TYPE3__TAX:
				setTax((Tax)newValue);
				return;
			case _401Package.LINE_TYPE3__TAX_EXEMPTION_REASON:
				setTaxExemptionReason((String)newValue);
				return;
			case _401Package.LINE_TYPE3__TAX_EXEMPTION_CODE:
				setTaxExemptionCode((String)newValue);
				return;
			case _401Package.LINE_TYPE3__SETTLEMENT_AMOUNT:
				setSettlementAmount((BigDecimal)newValue);
				return;
			case _401Package.LINE_TYPE3__CUSTOMS_INFORMATION:
				setCustomsInformation((CustomsInformation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _401Package.LINE_TYPE3__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__ORDER_REFERENCES:
				getOrderReferences().clear();
				return;
			case _401Package.LINE_TYPE3__PRODUCT_CODE:
				setProductCode(PRODUCT_CODE_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__PRODUCT_DESCRIPTION:
				setProductDescription(PRODUCT_DESCRIPTION_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__UNIT_OF_MEASURE:
				setUnitOfMeasure(UNIT_OF_MEASURE_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__UNIT_PRICE:
				setUnitPrice(UNIT_PRICE_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__TAX_BASE:
				setTaxBase(TAX_BASE_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__TAX_POINT_DATE:
				setTaxPointDate(TAX_POINT_DATE_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__REFERENCES:
				getReferences().clear();
				return;
			case _401Package.LINE_TYPE3__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__PRODUCT_SERIAL_NUMBER:
				setProductSerialNumber((ProductSerialNumber)null);
				return;
			case _401Package.LINE_TYPE3__DEBIT_AMOUNT:
				setDebitAmount(DEBIT_AMOUNT_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__CREDIT_AMOUNT:
				setCreditAmount(CREDIT_AMOUNT_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__TAX:
				setTax((Tax)null);
				return;
			case _401Package.LINE_TYPE3__TAX_EXEMPTION_REASON:
				setTaxExemptionReason(TAX_EXEMPTION_REASON_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__TAX_EXEMPTION_CODE:
				setTaxExemptionCode(TAX_EXEMPTION_CODE_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__SETTLEMENT_AMOUNT:
				setSettlementAmount(SETTLEMENT_AMOUNT_EDEFAULT);
				return;
			case _401Package.LINE_TYPE3__CUSTOMS_INFORMATION:
				setCustomsInformation((CustomsInformation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _401Package.LINE_TYPE3__LINE_NUMBER:
				return LINE_NUMBER_EDEFAULT == null ? lineNumber != null : !LINE_NUMBER_EDEFAULT.equals(lineNumber);
			case _401Package.LINE_TYPE3__ORDER_REFERENCES:
				return orderReferences != null && !orderReferences.isEmpty();
			case _401Package.LINE_TYPE3__PRODUCT_CODE:
				return PRODUCT_CODE_EDEFAULT == null ? productCode != null : !PRODUCT_CODE_EDEFAULT.equals(productCode);
			case _401Package.LINE_TYPE3__PRODUCT_DESCRIPTION:
				return PRODUCT_DESCRIPTION_EDEFAULT == null ? productDescription != null : !PRODUCT_DESCRIPTION_EDEFAULT.equals(productDescription);
			case _401Package.LINE_TYPE3__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case _401Package.LINE_TYPE3__UNIT_OF_MEASURE:
				return UNIT_OF_MEASURE_EDEFAULT == null ? unitOfMeasure != null : !UNIT_OF_MEASURE_EDEFAULT.equals(unitOfMeasure);
			case _401Package.LINE_TYPE3__UNIT_PRICE:
				return UNIT_PRICE_EDEFAULT == null ? unitPrice != null : !UNIT_PRICE_EDEFAULT.equals(unitPrice);
			case _401Package.LINE_TYPE3__TAX_BASE:
				return TAX_BASE_EDEFAULT == null ? taxBase != null : !TAX_BASE_EDEFAULT.equals(taxBase);
			case _401Package.LINE_TYPE3__TAX_POINT_DATE:
				return TAX_POINT_DATE_EDEFAULT == null ? taxPointDate != null : !TAX_POINT_DATE_EDEFAULT.equals(taxPointDate);
			case _401Package.LINE_TYPE3__REFERENCES:
				return references != null && !references.isEmpty();
			case _401Package.LINE_TYPE3__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _401Package.LINE_TYPE3__PRODUCT_SERIAL_NUMBER:
				return productSerialNumber != null;
			case _401Package.LINE_TYPE3__DEBIT_AMOUNT:
				return DEBIT_AMOUNT_EDEFAULT == null ? debitAmount != null : !DEBIT_AMOUNT_EDEFAULT.equals(debitAmount);
			case _401Package.LINE_TYPE3__CREDIT_AMOUNT:
				return CREDIT_AMOUNT_EDEFAULT == null ? creditAmount != null : !CREDIT_AMOUNT_EDEFAULT.equals(creditAmount);
			case _401Package.LINE_TYPE3__TAX:
				return tax != null;
			case _401Package.LINE_TYPE3__TAX_EXEMPTION_REASON:
				return TAX_EXEMPTION_REASON_EDEFAULT == null ? taxExemptionReason != null : !TAX_EXEMPTION_REASON_EDEFAULT.equals(taxExemptionReason);
			case _401Package.LINE_TYPE3__TAX_EXEMPTION_CODE:
				return TAX_EXEMPTION_CODE_EDEFAULT == null ? taxExemptionCode != null : !TAX_EXEMPTION_CODE_EDEFAULT.equals(taxExemptionCode);
			case _401Package.LINE_TYPE3__SETTLEMENT_AMOUNT:
				return SETTLEMENT_AMOUNT_EDEFAULT == null ? settlementAmount != null : !SETTLEMENT_AMOUNT_EDEFAULT.equals(settlementAmount);
			case _401Package.LINE_TYPE3__CUSTOMS_INFORMATION:
				return customsInformation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lineNumber: ");
		result.append(lineNumber);
		result.append(", productCode: ");
		result.append(productCode);
		result.append(", productDescription: ");
		result.append(productDescription);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", unitOfMeasure: ");
		result.append(unitOfMeasure);
		result.append(", unitPrice: ");
		result.append(unitPrice);
		result.append(", taxBase: ");
		result.append(taxBase);
		result.append(", taxPointDate: ");
		result.append(taxPointDate);
		result.append(", description: ");
		result.append(description);
		result.append(", debitAmount: ");
		result.append(debitAmount);
		result.append(", creditAmount: ");
		result.append(creditAmount);
		result.append(", taxExemptionReason: ");
		result.append(taxExemptionReason);
		result.append(", taxExemptionCode: ");
		result.append(taxExemptionCode);
		result.append(", settlementAmount: ");
		result.append(settlementAmount);
		result.append(')');
		return result.toString();
	}

} //LineType3Impl
