/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2.impl;

import java.math.BigInteger;

import oecd.standard.audit.file.tax.pt1_01_2.AddressStructure;
import oecd.standard.audit.file.tax.pt1_01_2.CustomerType;
import oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getCustomerTaxID <em>Customer Tax ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getBillingAddress <em>Billing Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getShipToAddress <em>Ship To Address</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.CustomerTypeImpl#getSelfBillingIndicator <em>Self Billing Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerTypeImpl extends EObjectImpl implements CustomerType {
	/**
	 * The default value of the '{@link #getCustomerID() <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerID() <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected String customerID = CUSTOMER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected String accountID = ACCOUNT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerTaxID() <em>Customer Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerTaxID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_TAX_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerTaxID() <em>Customer Tax ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerTaxID()
	 * @generated
	 * @ordered
	 */
	protected String customerTaxID = CUSTOMER_TAX_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected String companyName = COMPANY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected String contact = CONTACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBillingAddress() <em>Billing Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressStructure billingAddress;

	/**
	 * The cached value of the '{@link #getShipToAddress() <em>Ship To Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipToAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressStructure shipToAddress;

	/**
	 * The default value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected String telephone = TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final String FAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected String fax = FAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected String website = WEBSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelfBillingIndicator() <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfBillingIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SELF_BILLING_INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelfBillingIndicator() <em>Self Billing Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfBillingIndicator()
	 * @generated
	 * @ordered
	 */
	protected BigInteger selfBillingIndicator = SELF_BILLING_INDICATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01_2Package.Literals.CUSTOMER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerID(String newCustomerID) {
		String oldCustomerID = customerID;
		customerID = newCustomerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__CUSTOMER_ID, oldCustomerID, customerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountID() {
		return accountID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountID(String newAccountID) {
		String oldAccountID = accountID;
		accountID = newAccountID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__ACCOUNT_ID, oldAccountID, accountID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerTaxID() {
		return customerTaxID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerTaxID(String newCustomerTaxID) {
		String oldCustomerTaxID = customerTaxID;
		customerTaxID = newCustomerTaxID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__CUSTOMER_TAX_ID, oldCustomerTaxID, customerTaxID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyName(String newCompanyName) {
		String oldCompanyName = companyName;
		companyName = newCompanyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__COMPANY_NAME, oldCompanyName, companyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact(String newContact) {
		String oldContact = contact;
		contact = newContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__CONTACT, oldContact, contact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getBillingAddress() {
		return billingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillingAddress(AddressStructure newBillingAddress, NotificationChain msgs) {
		AddressStructure oldBillingAddress = billingAddress;
		billingAddress = newBillingAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__BILLING_ADDRESS, oldBillingAddress, newBillingAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingAddress(AddressStructure newBillingAddress) {
		if (newBillingAddress != billingAddress) {
			NotificationChain msgs = null;
			if (billingAddress != null)
				msgs = ((InternalEObject)billingAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pt1_01_2Package.CUSTOMER_TYPE__BILLING_ADDRESS, null, msgs);
			if (newBillingAddress != null)
				msgs = ((InternalEObject)newBillingAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pt1_01_2Package.CUSTOMER_TYPE__BILLING_ADDRESS, null, msgs);
			msgs = basicSetBillingAddress(newBillingAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__BILLING_ADDRESS, newBillingAddress, newBillingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getShipToAddress() {
		return shipToAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipToAddress(AddressStructure newShipToAddress, NotificationChain msgs) {
		AddressStructure oldShipToAddress = shipToAddress;
		shipToAddress = newShipToAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__SHIP_TO_ADDRESS, oldShipToAddress, newShipToAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipToAddress(AddressStructure newShipToAddress) {
		if (newShipToAddress != shipToAddress) {
			NotificationChain msgs = null;
			if (shipToAddress != null)
				msgs = ((InternalEObject)shipToAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Pt1_01_2Package.CUSTOMER_TYPE__SHIP_TO_ADDRESS, null, msgs);
			if (newShipToAddress != null)
				msgs = ((InternalEObject)newShipToAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Pt1_01_2Package.CUSTOMER_TYPE__SHIP_TO_ADDRESS, null, msgs);
			msgs = basicSetShipToAddress(newShipToAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__SHIP_TO_ADDRESS, newShipToAddress, newShipToAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephone(String newTelephone) {
		String oldTelephone = telephone;
		telephone = newTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__TELEPHONE, oldTelephone, telephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(String newFax) {
		String oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsite(String newWebsite) {
		String oldWebsite = website;
		website = newWebsite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__WEBSITE, oldWebsite, website));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSelfBillingIndicator() {
		return selfBillingIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfBillingIndicator(BigInteger newSelfBillingIndicator) {
		BigInteger oldSelfBillingIndicator = selfBillingIndicator;
		selfBillingIndicator = newSelfBillingIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.CUSTOMER_TYPE__SELF_BILLING_INDICATOR, oldSelfBillingIndicator, selfBillingIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pt1_01_2Package.CUSTOMER_TYPE__BILLING_ADDRESS:
				return basicSetBillingAddress(null, msgs);
			case Pt1_01_2Package.CUSTOMER_TYPE__SHIP_TO_ADDRESS:
				return basicSetShipToAddress(null, msgs);
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
			case Pt1_01_2Package.CUSTOMER_TYPE__CUSTOMER_ID:
				return getCustomerID();
			case Pt1_01_2Package.CUSTOMER_TYPE__ACCOUNT_ID:
				return getAccountID();
			case Pt1_01_2Package.CUSTOMER_TYPE__CUSTOMER_TAX_ID:
				return getCustomerTaxID();
			case Pt1_01_2Package.CUSTOMER_TYPE__COMPANY_NAME:
				return getCompanyName();
			case Pt1_01_2Package.CUSTOMER_TYPE__CONTACT:
				return getContact();
			case Pt1_01_2Package.CUSTOMER_TYPE__BILLING_ADDRESS:
				return getBillingAddress();
			case Pt1_01_2Package.CUSTOMER_TYPE__SHIP_TO_ADDRESS:
				return getShipToAddress();
			case Pt1_01_2Package.CUSTOMER_TYPE__TELEPHONE:
				return getTelephone();
			case Pt1_01_2Package.CUSTOMER_TYPE__FAX:
				return getFax();
			case Pt1_01_2Package.CUSTOMER_TYPE__EMAIL:
				return getEmail();
			case Pt1_01_2Package.CUSTOMER_TYPE__WEBSITE:
				return getWebsite();
			case Pt1_01_2Package.CUSTOMER_TYPE__SELF_BILLING_INDICATOR:
				return getSelfBillingIndicator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Pt1_01_2Package.CUSTOMER_TYPE__CUSTOMER_ID:
				setCustomerID((String)newValue);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__ACCOUNT_ID:
				setAccountID((String)newValue);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__CUSTOMER_TAX_ID:
				setCustomerTaxID((String)newValue);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__COMPANY_NAME:
				setCompanyName((String)newValue);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__CONTACT:
				setContact((String)newValue);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__BILLING_ADDRESS:
				setBillingAddress((AddressStructure)newValue);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__SHIP_TO_ADDRESS:
				setShipToAddress((AddressStructure)newValue);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__TELEPHONE:
				setTelephone((String)newValue);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__FAX:
				setFax((String)newValue);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__EMAIL:
				setEmail((String)newValue);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__WEBSITE:
				setWebsite((String)newValue);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__SELF_BILLING_INDICATOR:
				setSelfBillingIndicator((BigInteger)newValue);
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
			case Pt1_01_2Package.CUSTOMER_TYPE__CUSTOMER_ID:
				setCustomerID(CUSTOMER_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__ACCOUNT_ID:
				setAccountID(ACCOUNT_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__CUSTOMER_TAX_ID:
				setCustomerTaxID(CUSTOMER_TAX_ID_EDEFAULT);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__COMPANY_NAME:
				setCompanyName(COMPANY_NAME_EDEFAULT);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__CONTACT:
				setContact(CONTACT_EDEFAULT);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__BILLING_ADDRESS:
				setBillingAddress((AddressStructure)null);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__SHIP_TO_ADDRESS:
				setShipToAddress((AddressStructure)null);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__TELEPHONE:
				setTelephone(TELEPHONE_EDEFAULT);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case Pt1_01_2Package.CUSTOMER_TYPE__SELF_BILLING_INDICATOR:
				setSelfBillingIndicator(SELF_BILLING_INDICATOR_EDEFAULT);
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
			case Pt1_01_2Package.CUSTOMER_TYPE__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? customerID != null : !CUSTOMER_ID_EDEFAULT.equals(customerID);
			case Pt1_01_2Package.CUSTOMER_TYPE__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? accountID != null : !ACCOUNT_ID_EDEFAULT.equals(accountID);
			case Pt1_01_2Package.CUSTOMER_TYPE__CUSTOMER_TAX_ID:
				return CUSTOMER_TAX_ID_EDEFAULT == null ? customerTaxID != null : !CUSTOMER_TAX_ID_EDEFAULT.equals(customerTaxID);
			case Pt1_01_2Package.CUSTOMER_TYPE__COMPANY_NAME:
				return COMPANY_NAME_EDEFAULT == null ? companyName != null : !COMPANY_NAME_EDEFAULT.equals(companyName);
			case Pt1_01_2Package.CUSTOMER_TYPE__CONTACT:
				return CONTACT_EDEFAULT == null ? contact != null : !CONTACT_EDEFAULT.equals(contact);
			case Pt1_01_2Package.CUSTOMER_TYPE__BILLING_ADDRESS:
				return billingAddress != null;
			case Pt1_01_2Package.CUSTOMER_TYPE__SHIP_TO_ADDRESS:
				return shipToAddress != null;
			case Pt1_01_2Package.CUSTOMER_TYPE__TELEPHONE:
				return TELEPHONE_EDEFAULT == null ? telephone != null : !TELEPHONE_EDEFAULT.equals(telephone);
			case Pt1_01_2Package.CUSTOMER_TYPE__FAX:
				return FAX_EDEFAULT == null ? fax != null : !FAX_EDEFAULT.equals(fax);
			case Pt1_01_2Package.CUSTOMER_TYPE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case Pt1_01_2Package.CUSTOMER_TYPE__WEBSITE:
				return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
			case Pt1_01_2Package.CUSTOMER_TYPE__SELF_BILLING_INDICATOR:
				return SELF_BILLING_INDICATOR_EDEFAULT == null ? selfBillingIndicator != null : !SELF_BILLING_INDICATOR_EDEFAULT.equals(selfBillingIndicator);
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
		result.append(" (customerID: ");
		result.append(customerID);
		result.append(", accountID: ");
		result.append(accountID);
		result.append(", customerTaxID: ");
		result.append(customerTaxID);
		result.append(", companyName: ");
		result.append(companyName);
		result.append(", contact: ");
		result.append(contact);
		result.append(", telephone: ");
		result.append(telephone);
		result.append(", fax: ");
		result.append(fax);
		result.append(", email: ");
		result.append(email);
		result.append(", website: ");
		result.append(website);
		result.append(", selfBillingIndicator: ");
		result.append(selfBillingIndicator);
		result.append(')');
		return result.toString();
	}

} //CustomerTypeImpl
