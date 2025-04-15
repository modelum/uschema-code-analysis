/**
 */
package es.um.uschema.code.metamodels.codeGraph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getNodeType()
 * @model
 * @generated
 */
public enum NodeType implements Enumerator {
	/**
	 * The '<em><b>Start Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	START_NODE(0, "StartNode", "StartNode"),

	/**
	 * The '<em><b>End Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	END_NODE(1, "EndNode", "EndNode"),

	/**
	 * The '<em><b>Statement Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATEMENT_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	STATEMENT_NODE(2, "StatementNode", "StatementNode"),

	/**
	 * The '<em><b>Control Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL_NODE(3, "ControlNode", "ControlNode"),

	/**
	 * The '<em><b>Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER(4, "Parameter", "Parameter"),

	/**
	 * The '<em><b>Argument</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARGUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ARGUMENT(5, "Argument", "Argument");

	/**
	 * The '<em><b>Start Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_NODE
	 * @model name="StartNode"
	 * @generated
	 * @ordered
	 */
	public static final int START_NODE_VALUE = 0;

	/**
	 * The '<em><b>End Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_NODE
	 * @model name="EndNode"
	 * @generated
	 * @ordered
	 */
	public static final int END_NODE_VALUE = 1;

	/**
	 * The '<em><b>Statement Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATEMENT_NODE
	 * @model name="StatementNode"
	 * @generated
	 * @ordered
	 */
	public static final int STATEMENT_NODE_VALUE = 2;

	/**
	 * The '<em><b>Control Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_NODE
	 * @model name="ControlNode"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_NODE_VALUE = 3;

	/**
	 * The '<em><b>Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER
	 * @model name="Parameter"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_VALUE = 4;

	/**
	 * The '<em><b>Argument</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARGUMENT
	 * @model name="Argument"
	 * @generated
	 * @ordered
	 */
	public static final int ARGUMENT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Node Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NodeType[] VALUES_ARRAY =
		new NodeType[] {
			START_NODE,
			END_NODE,
			STATEMENT_NODE,
			CONTROL_NODE,
			PARAMETER,
			ARGUMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Node Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NodeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeType get(int value) {
		switch (value) {
			case START_NODE_VALUE: return START_NODE;
			case END_NODE_VALUE: return END_NODE;
			case STATEMENT_NODE_VALUE: return STATEMENT_NODE;
			case CONTROL_NODE_VALUE: return CONTROL_NODE;
			case PARAMETER_VALUE: return PARAMETER;
			case ARGUMENT_VALUE: return ARGUMENT;
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
	private NodeType(int value, String name, String literal) {
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
	
} //NodeType
