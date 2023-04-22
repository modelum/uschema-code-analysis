/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Loop Part Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getLoopPartType()
 * @model
 * @generated
 */
public enum LoopPartType implements Enumerator
{
	/**
	 * The '<em><b>CONDITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITION(0, "CONDITION", "CONDITION"),

	/**
	 * The '<em><b>INITIALIZATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALIZATION(1, "INITIALIZATION", "INITIALIZATION"),

	/**
	 * The '<em><b>UPDATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATER_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATER(2, "UPDATER", "UPDATER");

	/**
	 * The '<em><b>CONDITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONDITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_VALUE = 0;

	/**
	 * The '<em><b>INITIALIZATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INITIALIZATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALIZATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INITIALIZATION_VALUE = 1;

	/**
	 * The '<em><b>UPDATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPDATER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPDATER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Loop Part Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LoopPartType[] VALUES_ARRAY =
		new LoopPartType[] {
			CONDITION,
			INITIALIZATION,
			UPDATER,
		};

	/**
	 * A public read-only list of all the '<em><b>Loop Part Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LoopPartType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Loop Part Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoopPartType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoopPartType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Loop Part Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoopPartType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoopPartType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Loop Part Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LoopPartType get(int value)
	{
		switch (value) {
			case CONDITION_VALUE: return CONDITION;
			case INITIALIZATION_VALUE: return INITIALIZATION;
			case UPDATER_VALUE: return UPDATER;
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
	private LoopPartType(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //LoopPartType
