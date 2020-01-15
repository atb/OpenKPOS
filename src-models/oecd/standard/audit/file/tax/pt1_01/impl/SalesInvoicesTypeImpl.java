/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;

import oecd.standard.audit.file.tax.pt1_01.InvoiceType;
import oecd.standard.audit.file.tax.pt1_01.Pt1_01Package;
import oecd.standard.audit.file.tax.pt1_01.SalesInvoicesType;

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
 * An implementation of the model object '<em><b>Sales Invoices Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.SalesInvoicesTypeImpl#getNumberOfEntries <em>Number Of Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.SalesInvoicesTypeImpl#getTotalDebit <em>Total Debit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.SalesInvoicesTypeImpl#getTotalCredit <em>Total Credit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.SalesInvoicesTypeImpl#getInvoice <em>Invoice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SalesInvoicesTypeImpl extends EObjectImpl implements SalesInvoicesType {
	/**
	 * The default value of the '{@link #getNumberOfEntries() <em>Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEntries()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_OF_ENTRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfEntries() <em>Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEntries()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberOfEntries = NUMBER_OF_ENTRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalDebit() <em>Total Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDebit()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_DEBIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalDebit() <em>Total Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDebit()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal totalDebit = TOTAL_DEBIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCredit() <em>Total Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredit()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_CREDIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalCredit() <em>Total Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredit()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal totalCredit = TOTAL_CREDIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvoice() <em>Invoice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoice()
	 * @generated
	 * @ordered
	 */
	protected EList<InvoiceType> invoice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesInvoicesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01Package.Literals.SALES_INVOICES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberOfEntries() {
		return numberOfEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfEntries(BigInteger newNumberOfEntries) {
		BigInteger oldNumberOfEntries = numberOfEntries;
		numberOfEntries = newNumberOfEntries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.SALES_INVOICES_TYPE__NUMBER_OF_ENTRIES, oldNumberOfEntries, numberOfEntries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTotalDebit() {
		return totalDebit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDebit(BigDecimal newTotalDebit) {
		BigDecimal oldTotalDebit = totalDebit;
		totalDebit = newTotalDebit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.SALES_INVOICES_TYPE__TOTAL_DEBIT, oldTotalDebit, totalDebit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTotalCredit() {
		return totalCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCredit(BigDecimal newTotalCredit) {
		BigDecimal oldTotalCredit = totalCredit;
		totalCredit = newTotalCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.SALES_INVOICES_TYPE__TOTAL_CREDIT, oldTotalCredit, totalCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvoiceType> getInvoice() {
		if (invoice == null) {
			invoice = new EObjectContainmentEList<InvoiceType>(InvoiceType.class, this, Pt1_01Package.SALES_INVOICES_TYPE__INVOICE);
		}
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pt1_01Package.SALES_INVOICES_TYPE__INVOICE:
				return ((InternalEList<?>)getInvoice()).basicRemove(otherEnd, msgs);
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
			case Pt1_01Package.SALES_INVOICES_TYPE__NUMBER_OF_ENTRIES:
				return getNumberOfEntries();
			case Pt1_01Package.SALES_INVOICES_TYPE__TOTAL_DEBIT:
				return getTotalDebit();
			case Pt1_01Package.SALES_INVOICES_TYPE__TOTAL_CREDIT:
				return getTotalCredit();
			case Pt1_01Package.SALES_INVOICES_TYPE__INVOICE:
				return getInvoice();
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
			case Pt1_01Package.SALES_INVOICES_TYPE__NUMBER_OF_ENTRIES:
				setNumberOfEntries((BigInteger)newValue);
				return;
			case Pt1_01Package.SALES_INVOICES_TYPE__TOTAL_DEBIT:
				setTotalDebit((BigDecimal)newValue);
				return;
			case Pt1_01Package.SALES_INVOICES_TYPE__TOTAL_CREDIT:
				setTotalCredit((BigDecimal)newValue);
				return;
			case Pt1_01Package.SALES_INVOICES_TYPE__INVOICE:
				getInvoice().clear();
				getInvoice().addAll((Collection<? extends InvoiceType>)newValue);
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
			case Pt1_01Package.SALES_INVOICES_TYPE__NUMBER_OF_ENTRIES:
				setNumberOfEntries(NUMBER_OF_ENTRIES_EDEFAULT);
				return;
			case Pt1_01Package.SALES_INVOICES_TYPE__TOTAL_DEBIT:
				setTotalDebit(TOTAL_DEBIT_EDEFAULT);
				return;
			case Pt1_01Package.SALES_INVOICES_TYPE__TOTAL_CREDIT:
				setTotalCredit(TOTAL_CREDIT_EDEFAULT);
				return;
			case Pt1_01Package.SALES_INVOICES_TYPE__INVOICE:
				getInvoice().clear();
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
			case Pt1_01Package.SALES_INVOICES_TYPE__NUMBER_OF_ENTRIES:
				return NUMBER_OF_ENTRIES_EDEFAULT == null ? numberOfEntries != null : !NUMBER_OF_ENTRIES_EDEFAULT.equals(numberOfEntries);
			case Pt1_01Package.SALES_INVOICES_TYPE__TOTAL_DEBIT:
				return TOTAL_DEBIT_EDEFAULT == null ? totalDebit != null : !TOTAL_DEBIT_EDEFAULT.equals(totalDebit);
			case Pt1_01Package.SALES_INVOICES_TYPE__TOTAL_CREDIT:
				return TOTAL_CREDIT_EDEFAULT == null ? totalCredit != null : !TOTAL_CREDIT_EDEFAULT.equals(totalCredit);
			case Pt1_01Package.SALES_INVOICES_TYPE__INVOICE:
				return invoice != null && !invoice.isEmpty();
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
		result.append(" (numberOfEntries: ");
		result.append(numberOfEntries);
		result.append(", totalDebit: ");
		result.append(totalDebit);
		result.append(", totalCredit: ");
		result.append(totalCredit);
		result.append(')');
		return result.toString();
	}

} //SalesInvoicesTypeImpl
