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

import oecd.standard.audit.file.tax.p.t1._0._401.PaymentType;
import oecd.standard.audit.file.tax.p.t1._0._401.PaymentsType;
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
 * An implementation of the model object '<em><b>Payments Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.PaymentsTypeImpl#getNumberOfEntries <em>Number Of Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.PaymentsTypeImpl#getTotalDebit <em>Total Debit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.PaymentsTypeImpl#getTotalCredit <em>Total Credit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.PaymentsTypeImpl#getPayment <em>Payment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentsTypeImpl extends EObjectImpl implements PaymentsType {
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
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected EList<PaymentType> payment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getPaymentsType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PAYMENTS_TYPE__NUMBER_OF_ENTRIES, oldNumberOfEntries, numberOfEntries));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PAYMENTS_TYPE__TOTAL_DEBIT, oldTotalDebit, totalDebit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.PAYMENTS_TYPE__TOTAL_CREDIT, oldTotalCredit, totalCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PaymentType> getPayment() {
		if (payment == null) {
			payment = new EObjectContainmentEList<PaymentType>(PaymentType.class, this, _401Package.PAYMENTS_TYPE__PAYMENT);
		}
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.PAYMENTS_TYPE__PAYMENT:
				return ((InternalEList<?>)getPayment()).basicRemove(otherEnd, msgs);
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
			case _401Package.PAYMENTS_TYPE__NUMBER_OF_ENTRIES:
				return getNumberOfEntries();
			case _401Package.PAYMENTS_TYPE__TOTAL_DEBIT:
				return getTotalDebit();
			case _401Package.PAYMENTS_TYPE__TOTAL_CREDIT:
				return getTotalCredit();
			case _401Package.PAYMENTS_TYPE__PAYMENT:
				return getPayment();
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
			case _401Package.PAYMENTS_TYPE__NUMBER_OF_ENTRIES:
				setNumberOfEntries((BigInteger)newValue);
				return;
			case _401Package.PAYMENTS_TYPE__TOTAL_DEBIT:
				setTotalDebit((BigDecimal)newValue);
				return;
			case _401Package.PAYMENTS_TYPE__TOTAL_CREDIT:
				setTotalCredit((BigDecimal)newValue);
				return;
			case _401Package.PAYMENTS_TYPE__PAYMENT:
				getPayment().clear();
				getPayment().addAll((Collection<? extends PaymentType>)newValue);
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
			case _401Package.PAYMENTS_TYPE__NUMBER_OF_ENTRIES:
				setNumberOfEntries(NUMBER_OF_ENTRIES_EDEFAULT);
				return;
			case _401Package.PAYMENTS_TYPE__TOTAL_DEBIT:
				setTotalDebit(TOTAL_DEBIT_EDEFAULT);
				return;
			case _401Package.PAYMENTS_TYPE__TOTAL_CREDIT:
				setTotalCredit(TOTAL_CREDIT_EDEFAULT);
				return;
			case _401Package.PAYMENTS_TYPE__PAYMENT:
				getPayment().clear();
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
			case _401Package.PAYMENTS_TYPE__NUMBER_OF_ENTRIES:
				return NUMBER_OF_ENTRIES_EDEFAULT == null ? numberOfEntries != null : !NUMBER_OF_ENTRIES_EDEFAULT.equals(numberOfEntries);
			case _401Package.PAYMENTS_TYPE__TOTAL_DEBIT:
				return TOTAL_DEBIT_EDEFAULT == null ? totalDebit != null : !TOTAL_DEBIT_EDEFAULT.equals(totalDebit);
			case _401Package.PAYMENTS_TYPE__TOTAL_CREDIT:
				return TOTAL_CREDIT_EDEFAULT == null ? totalCredit != null : !TOTAL_CREDIT_EDEFAULT.equals(totalCredit);
			case _401Package.PAYMENTS_TYPE__PAYMENT:
				return payment != null && !payment.isEmpty();
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

} //PaymentsTypeImpl
