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

import oecd.standard.audit.file.tax.pt1_01.GeneralLedgerEntriesType;
import oecd.standard.audit.file.tax.pt1_01.JournalType;
import oecd.standard.audit.file.tax.pt1_01.Pt1_01Package;

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
 * An implementation of the model object '<em><b>General Ledger Entries Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.GeneralLedgerEntriesTypeImpl#getNumberOfEntries <em>Number Of Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.GeneralLedgerEntriesTypeImpl#getTotalDebit <em>Total Debit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.GeneralLedgerEntriesTypeImpl#getTotalCredit <em>Total Credit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.GeneralLedgerEntriesTypeImpl#getJournal <em>Journal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralLedgerEntriesTypeImpl extends EObjectImpl implements GeneralLedgerEntriesType {
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
	 * The cached value of the '{@link #getJournal() <em>Journal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournal()
	 * @generated
	 * @ordered
	 */
	protected EList<JournalType> journal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralLedgerEntriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01Package.Literals.GENERAL_LEDGER_ENTRIES_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__NUMBER_OF_ENTRIES, oldNumberOfEntries, numberOfEntries));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_DEBIT, oldTotalDebit, totalDebit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_CREDIT, oldTotalCredit, totalCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JournalType> getJournal() {
		if (journal == null) {
			journal = new EObjectContainmentEList<JournalType>(JournalType.class, this, Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__JOURNAL);
		}
		return journal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__JOURNAL:
				return ((InternalEList<?>)getJournal()).basicRemove(otherEnd, msgs);
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
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__NUMBER_OF_ENTRIES:
				return getNumberOfEntries();
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_DEBIT:
				return getTotalDebit();
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_CREDIT:
				return getTotalCredit();
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__JOURNAL:
				return getJournal();
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
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__NUMBER_OF_ENTRIES:
				setNumberOfEntries((BigInteger)newValue);
				return;
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_DEBIT:
				setTotalDebit((BigDecimal)newValue);
				return;
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_CREDIT:
				setTotalCredit((BigDecimal)newValue);
				return;
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__JOURNAL:
				getJournal().clear();
				getJournal().addAll((Collection<? extends JournalType>)newValue);
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
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__NUMBER_OF_ENTRIES:
				setNumberOfEntries(NUMBER_OF_ENTRIES_EDEFAULT);
				return;
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_DEBIT:
				setTotalDebit(TOTAL_DEBIT_EDEFAULT);
				return;
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_CREDIT:
				setTotalCredit(TOTAL_CREDIT_EDEFAULT);
				return;
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__JOURNAL:
				getJournal().clear();
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
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__NUMBER_OF_ENTRIES:
				return NUMBER_OF_ENTRIES_EDEFAULT == null ? numberOfEntries != null : !NUMBER_OF_ENTRIES_EDEFAULT.equals(numberOfEntries);
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_DEBIT:
				return TOTAL_DEBIT_EDEFAULT == null ? totalDebit != null : !TOTAL_DEBIT_EDEFAULT.equals(totalDebit);
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__TOTAL_CREDIT:
				return TOTAL_CREDIT_EDEFAULT == null ? totalCredit != null : !TOTAL_CREDIT_EDEFAULT.equals(totalCredit);
			case Pt1_01Package.GENERAL_LEDGER_ENTRIES_TYPE__JOURNAL:
				return journal != null && !journal.isEmpty();
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

} //GeneralLedgerEntriesTypeImpl
