/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.util.Collection;

import oecd.standard.audit.file.tax.p.t1._0._401.JournalType;
import oecd.standard.audit.file.tax.p.t1._0._401.TransactionType;
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
 * An implementation of the model object '<em><b>Journal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.JournalTypeImpl#getJournalID <em>Journal ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.JournalTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.JournalTypeImpl#getTransaction <em>Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JournalTypeImpl extends EObjectImpl implements JournalType {
	/**
	 * The default value of the '{@link #getJournalID() <em>Journal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalID()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJournalID() <em>Journal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJournalID()
	 * @generated
	 * @ordered
	 */
	protected String journalID = JOURNAL_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<TransactionType> transaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JournalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getJournalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJournalID() {
		return journalID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJournalID(String newJournalID) {
		String oldJournalID = journalID;
		journalID = newJournalID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.JOURNAL_TYPE__JOURNAL_ID, oldJournalID, journalID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.JOURNAL_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransactionType> getTransaction() {
		if (transaction == null) {
			transaction = new EObjectContainmentEList<TransactionType>(TransactionType.class, this, _401Package.JOURNAL_TYPE__TRANSACTION);
		}
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.JOURNAL_TYPE__TRANSACTION:
				return ((InternalEList<?>)getTransaction()).basicRemove(otherEnd, msgs);
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
			case _401Package.JOURNAL_TYPE__JOURNAL_ID:
				return getJournalID();
			case _401Package.JOURNAL_TYPE__DESCRIPTION:
				return getDescription();
			case _401Package.JOURNAL_TYPE__TRANSACTION:
				return getTransaction();
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
			case _401Package.JOURNAL_TYPE__JOURNAL_ID:
				setJournalID((String)newValue);
				return;
			case _401Package.JOURNAL_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _401Package.JOURNAL_TYPE__TRANSACTION:
				getTransaction().clear();
				getTransaction().addAll((Collection<? extends TransactionType>)newValue);
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
			case _401Package.JOURNAL_TYPE__JOURNAL_ID:
				setJournalID(JOURNAL_ID_EDEFAULT);
				return;
			case _401Package.JOURNAL_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _401Package.JOURNAL_TYPE__TRANSACTION:
				getTransaction().clear();
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
			case _401Package.JOURNAL_TYPE__JOURNAL_ID:
				return JOURNAL_ID_EDEFAULT == null ? journalID != null : !JOURNAL_ID_EDEFAULT.equals(journalID);
			case _401Package.JOURNAL_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _401Package.JOURNAL_TYPE__TRANSACTION:
				return transaction != null && !transaction.isEmpty();
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
		result.append(" (journalID: ");
		result.append(journalID);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //JournalTypeImpl
