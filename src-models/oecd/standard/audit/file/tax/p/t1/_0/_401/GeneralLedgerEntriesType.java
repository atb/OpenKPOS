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
 * A representation of the model object '<em><b>General Ledger Entries Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerEntriesType#getNumberOfEntries <em>Number Of Entries</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerEntriesType#getTotalDebit <em>Total Debit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerEntriesType#getTotalCredit <em>Total Credit</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerEntriesType#getJournal <em>Journal</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getGeneralLedgerEntriesType()
 * @model extendedMetaData="name='GeneralLedgerEntries_._type' kind='elementOnly'"
 * @generated
 */
public interface GeneralLedgerEntriesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Entries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Entries</em>' attribute.
	 * @see #setNumberOfEntries(BigInteger)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getGeneralLedgerEntriesType_NumberOfEntries()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='NumberOfEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberOfEntries();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerEntriesType#getNumberOfEntries <em>Number Of Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Entries</em>' attribute.
	 * @see #getNumberOfEntries()
	 * @generated
	 */
	void setNumberOfEntries(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Total Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Debit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Debit</em>' attribute.
	 * @see #setTotalDebit(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getGeneralLedgerEntriesType_TotalDebit()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='TotalDebit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTotalDebit();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerEntriesType#getTotalDebit <em>Total Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Debit</em>' attribute.
	 * @see #getTotalDebit()
	 * @generated
	 */
	void setTotalDebit(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Total Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Credit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Credit</em>' attribute.
	 * @see #setTotalCredit(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getGeneralLedgerEntriesType_TotalCredit()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType" required="true"
	 *        extendedMetaData="kind='element' name='TotalCredit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTotalCredit();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.GeneralLedgerEntriesType#getTotalCredit <em>Total Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Credit</em>' attribute.
	 * @see #getTotalCredit()
	 * @generated
	 */
	void setTotalCredit(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Journal</b></em>' containment reference list.
	 * The list contents are of type {@link oecd.standard.audit.file.tax.p.t1._0._401.JournalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Journal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journal</em>' containment reference list.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getGeneralLedgerEntriesType_Journal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Journal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<JournalType> getJournal();

} // GeneralLedgerEntriesType
