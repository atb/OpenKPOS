/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SAFTPT Movement Tax Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getSAFTPTMovementTaxType()
 * @model extendedMetaData="name='SAFTPTMovementTaxType'"
 * @generated
 */
public enum SAFTPTMovementTaxType implements Enumerator {
	/**
	 * The '<em><b>IVA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVA_VALUE
	 * @generated
	 * @ordered
	 */
	IVA(0, "IVA", "IVA"),

	/**
	 * The '<em><b>NS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NS_VALUE
	 * @generated
	 * @ordered
	 */
	NS(1, "NS", "NS");

	/**
	 * The '<em><b>IVA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IVA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IVA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IVA_VALUE = 0;

	/**
	 * The '<em><b>NS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NS_VALUE = 1;

	/**
	 * An array of all the '<em><b>SAFTPT Movement Tax Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SAFTPTMovementTaxType[] VALUES_ARRAY =
		new SAFTPTMovementTaxType[] {
			IVA,
			NS,
		};

	/**
	 * A public read-only list of all the '<em><b>SAFTPT Movement Tax Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SAFTPTMovementTaxType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SAFTPT Movement Tax Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SAFTPTMovementTaxType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SAFTPTMovementTaxType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SAFTPT Movement Tax Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SAFTPTMovementTaxType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SAFTPTMovementTaxType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SAFTPT Movement Tax Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SAFTPTMovementTaxType get(int value) {
		switch (value) {
			case IVA_VALUE: return IVA;
			case NS_VALUE: return NS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SAFTPTMovementTaxType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SAFTPTMovementTaxType
