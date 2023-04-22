/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Container Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeContainerType()
 * @model
 * @generated
 */
public enum CodeContainerType implements Enumerator
{
	/**
	 * The '<em><b>CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS(0, "CLASS", "CLASS"),

	/**
	 * The '<em><b>FUNCTION COLLECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_COLLECTION(1, "FUNCTION_COLLECTION", "FUNCTION_COLLECTION"),

	/**
	 * The '<em><b>SCRIPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	SCRIPT(2, "SCRIPT", "SCRIPT");

	/**
	 * The '<em><b>CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_VALUE = 0;

	/**
	 * The '<em><b>FUNCTION COLLECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCTION COLLECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_COLLECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_COLLECTION_VALUE = 1;

	/**
	 * The '<em><b>SCRIPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCRIPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCRIPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCRIPT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Container Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CodeContainerType[] VALUES_ARRAY =
		new CodeContainerType[] {
			CLASS,
			FUNCTION_COLLECTION,
			SCRIPT,
		};

	/**
	 * A public read-only list of all the '<em><b>Container Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CodeContainerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Container Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeContainerType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeContainerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Container Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeContainerType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeContainerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Container Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeContainerType get(int value)
	{
		switch (value) {
			case CLASS_VALUE: return CLASS;
			case FUNCTION_COLLECTION_VALUE: return FUNCTION_COLLECTION;
			case SCRIPT_VALUE: return SCRIPT;
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
	private CodeContainerType(int value, String name, String literal)
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
	
} //CodeContainerType
