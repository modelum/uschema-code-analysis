/**
 */
package es.um.uschema.code.metamodels.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unary Operation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.um.uschema.code.metamodels.code.CodePackage#getUnaryOperationType()
 * @model
 * @generated
 */
public enum UnaryOperationType implements Enumerator
{
	/**
	 * The '<em><b>PRE PLUSPLUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_PLUSPLUS_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_PLUSPLUS(0, "PRE_PLUSPLUS", "PRE_PLUSPLUS"),

	/**
	 * The '<em><b>PRE MINUSMINUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_MINUSMINUS_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_MINUSMINUS(1, "PRE_MINUSMINUS", "PRE_MINUSMINUS"),

	/**
	 * The '<em><b>POST PLUSPLUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_PLUSPLUS_VALUE
	 * @generated
	 * @ordered
	 */
	POST_PLUSPLUS(2, "POST_PLUSPLUS", "POST_PLUSPLUS"),

	/**
	 * The '<em><b>POST MINUSMINUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_MINUSMINUS_VALUE
	 * @generated
	 * @ordered
	 */
	POST_MINUSMINUS(3, "POST_MINUSMINUS", "POST_MINUSMINUS");

	/**
	 * The '<em><b>PRE PLUSPLUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRE PLUSPLUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_PLUSPLUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRE_PLUSPLUS_VALUE = 0;

	/**
	 * The '<em><b>PRE MINUSMINUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRE MINUSMINUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_MINUSMINUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRE_MINUSMINUS_VALUE = 1;

	/**
	 * The '<em><b>POST PLUSPLUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POST PLUSPLUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_PLUSPLUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POST_PLUSPLUS_VALUE = 2;

	/**
	 * The '<em><b>POST MINUSMINUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POST MINUSMINUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_MINUSMINUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POST_MINUSMINUS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Unary Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnaryOperationType[] VALUES_ARRAY =
		new UnaryOperationType[] {
			PRE_PLUSPLUS,
			PRE_MINUSMINUS,
			POST_PLUSPLUS,
			POST_MINUSMINUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Unary Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnaryOperationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unary Operation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryOperationType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnaryOperationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unary Operation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryOperationType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnaryOperationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unary Operation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnaryOperationType get(int value)
	{
		switch (value) {
			case PRE_PLUSPLUS_VALUE: return PRE_PLUSPLUS;
			case PRE_MINUSMINUS_VALUE: return PRE_MINUSMINUS;
			case POST_PLUSPLUS_VALUE: return POST_PLUSPLUS;
			case POST_MINUSMINUS_VALUE: return POST_MINUSMINUS;
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
	private UnaryOperationType(int value, String name, String literal)
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
	
} //UnaryOperationType
