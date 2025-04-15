/**
 */
package es.um.uschema.code.metamodels.codeGraph.impl;

import es.um.uschema.code.metamodels.codeGraph.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeGraphFactoryImpl extends EFactoryImpl implements CodeGraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeGraphFactory init() {
		try {
			CodeGraphFactory theCodeGraphFactory = (CodeGraphFactory)EPackage.Registry.INSTANCE.getEFactory(CodeGraphPackage.eNS_URI);
			if (theCodeGraphFactory != null) {
				return theCodeGraphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeGraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeGraphFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CodeGraphPackage.CALLABLE_BLOCK_SUB_GRAPH: return createCallableBlockSubGraph();
			case CodeGraphPackage.NODE: return createNode();
			case CodeGraphPackage.EDGE: return createEdge();
			case CodeGraphPackage.CODE_GRAPH: return createCodeGraph();
			case CodeGraphPackage.EDGE_CALL: return createEdgeCall();
			case CodeGraphPackage.EXPRESSION_EDGE: return createExpressionEdge();
			case CodeGraphPackage.CODE_BLOCK_SUB_GRAPH: return createCodeBlockSubGraph();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CodeGraphPackage.EDGE_TYPE:
				return createEdgeTypeFromString(eDataType, initialValue);
			case CodeGraphPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CodeGraphPackage.EDGE_TYPE:
				return convertEdgeTypeToString(eDataType, instanceValue);
			case CodeGraphPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallableBlockSubGraph createCallableBlockSubGraph() {
		CallableBlockSubGraphImpl callableBlockSubGraph = new CallableBlockSubGraphImpl();
		return callableBlockSubGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGraph createCodeGraph() {
		CodeGraphImpl codeGraph = new CodeGraphImpl();
		return codeGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdgeCall createEdgeCall() {
		EdgeCallImpl edgeCall = new EdgeCallImpl();
		return edgeCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionEdge createExpressionEdge() {
		ExpressionEdgeImpl expressionEdge = new ExpressionEdgeImpl();
		return expressionEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBlockSubGraph createCodeBlockSubGraph() {
		CodeBlockSubGraphImpl codeBlockSubGraph = new CodeBlockSubGraphImpl();
		return codeBlockSubGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeType createEdgeTypeFromString(EDataType eDataType, String initialValue) {
		EdgeType result = EdgeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue) {
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGraphPackage getCodeGraphPackage() {
		return (CodeGraphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodeGraphPackage getPackage() {
		return CodeGraphPackage.eINSTANCE;
	}

} //CodeGraphFactoryImpl
