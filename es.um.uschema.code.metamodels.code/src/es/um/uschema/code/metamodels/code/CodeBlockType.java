/**
 */
package es.um.uschema.code.metamodels.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Block Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.um.uschema.code.metamodels.code.CodePackage#getCodeBlockType()
 * @model
 * @generated
 */
public enum CodeBlockType implements Enumerator
{
	/**
	 * The '<em><b>FUNCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION(0, "FUNCTION", "FUNCTION"),

	/**
	 * The '<em><b>CASE BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASE_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CASE_BLOCK(1, "CASE_BLOCK", "CASE_BLOCK"),

	/**
	 * The '<em><b>LOOP BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOP_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	LOOP_BLOCK(2, "LOOP_BLOCK", "LOOP_BLOCK"),

	/**
	 * The '<em><b>METHOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD(3, "METHOD", "METHOD"),

	/**
	 * The '<em><b>INLINE CODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INLINE_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	INLINE_CODE(4, "INLINE_CODE", "INLINE_CODE"),

	/**
	 * The '<em><b>LAMBDA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAMBDA_VALUE
	 * @generated
	 * @ordered
	 */
	LAMBDA(5, "LAMBDA", "LAMBDA"),

	/**
	 * The '<em><b>CONSTRUCTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRUCTOR(6, "CONSTRUCTOR", "CONSTRUCTOR");

	/**
	 * The '<em><b>FUNCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_VALUE = 0;

	/**
	 * The '<em><b>CASE BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASE BLOCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASE_BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASE_BLOCK_VALUE = 1;

	/**
	 * The '<em><b>LOOP BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOOP BLOCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOOP_BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOOP_BLOCK_VALUE = 2;

	/**
	 * The '<em><b>METHOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METHOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_VALUE = 3;

	/**
	 * The '<em><b>INLINE CODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INLINE CODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INLINE_CODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INLINE_CODE_VALUE = 4;

	/**
	 * The '<em><b>LAMBDA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LAMBDA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAMBDA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAMBDA_VALUE = 5;

	/**
	 * The '<em><b>CONSTRUCTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSTRUCTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTOR_VALUE = 6;

	/**
	 * An array of all the '<em><b>Block Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CodeBlockType[] VALUES_ARRAY =
		new CodeBlockType[] {
			FUNCTION,
			CASE_BLOCK,
			LOOP_BLOCK,
			METHOD,
			INLINE_CODE,
			LAMBDA,
			CONSTRUCTOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Block Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CodeBlockType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Block Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeBlockType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeBlockType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Block Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeBlockType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodeBlockType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Block Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CodeBlockType get(int value)
	{
		switch (value) {
			case FUNCTION_VALUE: return FUNCTION;
			case CASE_BLOCK_VALUE: return CASE_BLOCK;
			case LOOP_BLOCK_VALUE: return LOOP_BLOCK;
			case METHOD_VALUE: return METHOD;
			case INLINE_CODE_VALUE: return INLINE_CODE;
			case LAMBDA_VALUE: return LAMBDA;
			case CONSTRUCTOR_VALUE: return CONSTRUCTOR;
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
	private CodeBlockType(int value, String name, String literal)
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
	
} //CodeBlockType
