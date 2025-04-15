/**
 */
package es.um.uschema.code.metamodels.codeGraph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Edge Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getEdgeType()
 * @model
 * @generated
 */
public enum EdgeType implements Enumerator {
	/**
	 * The '<em><b>CALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALL_VALUE
	 * @generated
	 * @ordered
	 */
	CALL(0, "CALL", "CALL"),

	/**
	 * The '<em><b>LOOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOP_VALUE
	 * @generated
	 * @ordered
	 */
	LOOP(1, "LOOP", "LOOP"),

	/**
	 * The '<em><b>SELECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SELECTION(2, "SELECTION", "SELECTION"),

	/**
	 * The '<em><b>TRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRY_VALUE
	 * @generated
	 * @ordered
	 */
	TRY(3, "TRY", "TRY"),

	/**
	 * The '<em><b>CATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATCH_VALUE
	 * @generated
	 * @ordered
	 */
	CATCH(4, "CATCH", "CATCH"),

	/**
	 * The '<em><b>JUMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUMP_VALUE
	 * @generated
	 * @ordered
	 */
	JUMP(5, "JUMP", "JUMP"),

	/**
	 * The '<em><b>RETURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN_VALUE
	 * @generated
	 * @ordered
	 */
	RETURN(6, "RETURN", "RETURN"),

	/**
	 * The '<em><b>NEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT(7, "NEXT", "NEXT"),

	/**
	 * The '<em><b>EXPRESSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXPRESSION(8, "EXPRESSION", "EXPRESSION"),

	/**
	 * The '<em><b>FINALLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINALLY_VALUE
	 * @generated
	 * @ordered
	 */
	FINALLY(9, "FINALLY", "FINALLY"),

	/**
	 * The '<em><b>ELSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELSE_VALUE
	 * @generated
	 * @ordered
	 */
	ELSE(10, "ELSE", "ELSE"),

	/**
	 * The '<em><b>ARGUMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARGUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ARGUMENT(11, "ARGUMENT", "ARGUMENT"),

	/**
	 * The '<em><b>PARAMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER(12, "PARAMETER", "PARAMETER");

	/**
	 * The '<em><b>CALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CALL_VALUE = 0;

	/**
	 * The '<em><b>LOOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOOP_VALUE = 1;

	/**
	 * The '<em><b>SELECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECTION_VALUE = 2;

	/**
	 * The '<em><b>TRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRY_VALUE = 3;

	/**
	 * The '<em><b>CATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CATCH_VALUE = 4;

	/**
	 * The '<em><b>JUMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JUMP_VALUE = 5;

	/**
	 * The '<em><b>RETURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETURN_VALUE = 6;

	/**
	 * The '<em><b>NEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_VALUE = 7;

	/**
	 * The '<em><b>EXPRESSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPRESSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESSION_VALUE = 8;

	/**
	 * The '<em><b>FINALLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINALLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINALLY_VALUE = 9;

	/**
	 * The '<em><b>ELSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELSE_VALUE = 10;

	/**
	 * The '<em><b>ARGUMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARGUMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT_VALUE = 11;

	/**
	 * The '<em><b>PARAMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_VALUE = 12;

	/**
	 * An array of all the '<em><b>Edge Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EdgeType[] VALUES_ARRAY =
		new EdgeType[] {
			CALL,
			LOOP,
			SELECTION,
			TRY,
			CATCH,
			JUMP,
			RETURN,
			NEXT,
			EXPRESSION,
			FINALLY,
			ELSE,
			ARGUMENT,
			PARAMETER,
		};

	/**
	 * A public read-only list of all the '<em><b>Edge Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EdgeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Edge Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EdgeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EdgeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Edge Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EdgeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EdgeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Edge Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EdgeType get(int value) {
		switch (value) {
			case CALL_VALUE: return CALL;
			case LOOP_VALUE: return LOOP;
			case SELECTION_VALUE: return SELECTION;
			case TRY_VALUE: return TRY;
			case CATCH_VALUE: return CATCH;
			case JUMP_VALUE: return JUMP;
			case RETURN_VALUE: return RETURN;
			case NEXT_VALUE: return NEXT;
			case EXPRESSION_VALUE: return EXPRESSION;
			case FINALLY_VALUE: return FINALLY;
			case ELSE_VALUE: return ELSE;
			case ARGUMENT_VALUE: return ARGUMENT;
			case PARAMETER_VALUE: return PARAMETER;
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
	private EdgeType(int value, String name, String literal) {
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
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //EdgeType
