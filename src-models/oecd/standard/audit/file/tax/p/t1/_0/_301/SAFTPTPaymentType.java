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
 * A representation of the literals of the enumeration '<em><b>SAFTPT Payment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *         Restricao: RC para Recibo emitido no ambito do regime de IVA de Caixa (incluindo os relativos a adiantamentos desse regime), RG para Outros recibos emitidos
 *       
 * <!-- end-model-doc -->
 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getSAFTPTPaymentType()
 * @model extendedMetaData="name='SAFTPTPaymentType'"
 * @generated
 */
public enum SAFTPTPaymentType implements Enumerator {
	/**
	 * The '<em><b>RC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RC_VALUE
	 * @generated
	 * @ordered
	 */
	RC(0, "RC", "RC"),

	/**
	 * The '<em><b>RG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RG_VALUE
	 * @generated
	 * @ordered
	 */
	RG(1, "RG", "RG");

	/**
	 * The '<em><b>RC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RC_VALUE = 0;

	/**
	 * The '<em><b>RG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RG_VALUE = 1;

	/**
	 * An array of all the '<em><b>SAFTPT Payment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SAFTPTPaymentType[] VALUES_ARRAY =
		new SAFTPTPaymentType[] {
			RC,
			RG,
		};

	/**
	 * A public read-only list of all the '<em><b>SAFTPT Payment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SAFTPTPaymentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SAFTPT Payment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SAFTPTPaymentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SAFTPTPaymentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SAFTPT Payment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SAFTPTPaymentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SAFTPTPaymentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SAFTPT Payment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SAFTPTPaymentType get(int value) {
		switch (value) {
			case RC_VALUE: return RC;
			case RG_VALUE: return RG;
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
	private SAFTPTPaymentType(int value, String name, String literal) {
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
	
} //SAFTPTPaymentType
