/**
 */
package es.um.uschema.code.metamodels.codeGraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphFactory
 * @model kind="package"
 * @generated
 */
public interface CodeGraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codeGraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.um.uschema.code.metamodels/codeGraph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codeGraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeGraphPackage eINSTANCE = es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.CodeSubGraphImpl <em>Code Sub Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeSubGraphImpl
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getCodeSubGraph()
	 * @generated
	 */
	int CODE_SUB_GRAPH = 7;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SUB_GRAPH__NODES = 0;

	/**
	 * The number of structural features of the '<em>Code Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SUB_GRAPH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Code Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SUB_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.CallableBlockSubGraphImpl <em>Callable Block Sub Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CallableBlockSubGraphImpl
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getCallableBlockSubGraph()
	 * @generated
	 */
	int CALLABLE_BLOCK_SUB_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK_SUB_GRAPH__NODES = CODE_SUB_GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Callable Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK_SUB_GRAPH__CALLABLE_BLOCK = CODE_SUB_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Callable Block Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK_SUB_GRAPH_FEATURE_COUNT = CODE_SUB_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Callable Block Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK_SUB_GRAPH_OPERATION_COUNT = CODE_SUB_GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.GraphPartImpl <em>Graph Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.GraphPartImpl
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getGraphPart()
	 * @generated
	 */
	int GRAPH_PART = 5;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_PART__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Graph Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_PART_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Graph Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.NodeImpl
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VARIABLES = GRAPH_PART__VARIABLES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING_EDGES = GRAPH_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STATEMENT = GRAPH_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_TYPE = GRAPH_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING_EDGES = GRAPH_PART_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = GRAPH_PART_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = GRAPH_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.EdgeImpl
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__VARIABLES = GRAPH_PART__VARIABLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TYPE = GRAPH_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = GRAPH_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = GRAPH_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = GRAPH_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = GRAPH_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphImpl <em>Code Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphImpl
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getCodeGraph()
	 * @generated
	 */
	int CODE_GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GRAPH__CODE = 0;

	/**
	 * The feature id for the '<em><b>Sub Grahps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GRAPH__SUB_GRAHPS = 1;

	/**
	 * The number of structural features of the '<em>Code Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Code Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.EdgeCallImpl <em>Edge Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.EdgeCallImpl
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getEdgeCall()
	 * @generated
	 */
	int EDGE_CALL = 4;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_CALL__VARIABLES = EDGE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_CALL__TYPE = EDGE__TYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_CALL__TARGET = EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_CALL__SOURCE = EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_CALL__CALL = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_CALL_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edge Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_CALL_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.ExpressionEdgeImpl <em>Expression Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.ExpressionEdgeImpl
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getExpressionEdge()
	 * @generated
	 */
	int EXPRESSION_EDGE = 6;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EDGE__VARIABLES = EDGE__VARIABLES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EDGE__TYPE = EDGE__TYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EDGE__TARGET = EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EDGE__SOURCE = EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EDGE__EXPRESSION = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EDGE_OPERATION_COUNT = EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.CodeBlockSubGraphImpl <em>Code Block Sub Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeBlockSubGraphImpl
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getCodeBlockSubGraph()
	 * @generated
	 */
	int CODE_BLOCK_SUB_GRAPH = 8;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_SUB_GRAPH__NODES = CODE_SUB_GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Code Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_SUB_GRAPH__CODE_BLOCK = CODE_SUB_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Block Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_SUB_GRAPH_FEATURE_COUNT = CODE_SUB_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Block Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_SUB_GRAPH_OPERATION_COUNT = CODE_SUB_GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.codeGraph.EdgeType <em>Edge Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.codeGraph.EdgeType
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getEdgeType()
	 * @generated
	 */
	int EDGE_TYPE = 9;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.codeGraph.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.codeGraph.NodeType
	 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.codeGraph.CallableBlockSubGraph <em>Callable Block Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Block Sub Graph</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.CallableBlockSubGraph
	 * @generated
	 */
	EClass getCallableBlockSubGraph();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.codeGraph.CallableBlockSubGraph#getCallableBlock <em>Callable Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callable Block</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.CallableBlockSubGraph#getCallableBlock()
	 * @see #getCallableBlockSubGraph()
	 * @generated
	 */
	EReference getCallableBlockSubGraph_CallableBlock();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.codeGraph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.codeGraph.Node#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Edges</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.Node#getOutgoingEdges()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutgoingEdges();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.codeGraph.Node#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.Node#getStatement()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Statement();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.codeGraph.Node#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.Node#getNodeType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_NodeType();

	/**
	 * Returns the meta object for the reference list '{@link es.um.uschema.code.metamodels.codeGraph.Node#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Edges</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.Node#getIncomingEdges()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_IncomingEdges();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.codeGraph.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.codeGraph.Edge#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.Edge#getType()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Type();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.codeGraph.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.codeGraph.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.codeGraph.CodeGraph <em>Code Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Graph</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraph
	 * @generated
	 */
	EClass getCodeGraph();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.codeGraph.CodeGraph#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraph#getCode()
	 * @see #getCodeGraph()
	 * @generated
	 */
	EReference getCodeGraph_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.codeGraph.CodeGraph#getSubGrahps <em>Sub Grahps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Grahps</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraph#getSubGrahps()
	 * @see #getCodeGraph()
	 * @generated
	 */
	EReference getCodeGraph_SubGrahps();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.codeGraph.EdgeCall <em>Edge Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Call</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.EdgeCall
	 * @generated
	 */
	EClass getEdgeCall();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.codeGraph.EdgeCall#getCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Call</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.EdgeCall#getCall()
	 * @see #getEdgeCall()
	 * @generated
	 */
	EReference getEdgeCall_Call();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.codeGraph.GraphPart <em>Graph Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Part</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.GraphPart
	 * @generated
	 */
	EClass getGraphPart();

	/**
	 * Returns the meta object for the reference list '{@link es.um.uschema.code.metamodels.codeGraph.GraphPart#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.GraphPart#getVariables()
	 * @see #getGraphPart()
	 * @generated
	 */
	EReference getGraphPart_Variables();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.codeGraph.ExpressionEdge <em>Expression Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Edge</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.ExpressionEdge
	 * @generated
	 */
	EClass getExpressionEdge();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.codeGraph.ExpressionEdge#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.ExpressionEdge#getExpression()
	 * @see #getExpressionEdge()
	 * @generated
	 */
	EReference getExpressionEdge_Expression();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.codeGraph.CodeSubGraph <em>Code Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Sub Graph</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeSubGraph
	 * @generated
	 */
	EClass getCodeSubGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.codeGraph.CodeSubGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeSubGraph#getNodes()
	 * @see #getCodeSubGraph()
	 * @generated
	 */
	EReference getCodeSubGraph_Nodes();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.codeGraph.CodeBlockSubGraph <em>Code Block Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block Sub Graph</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeBlockSubGraph
	 * @generated
	 */
	EClass getCodeBlockSubGraph();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.codeGraph.CodeBlockSubGraph#getCodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code Block</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeBlockSubGraph#getCodeBlock()
	 * @see #getCodeBlockSubGraph()
	 * @generated
	 */
	EReference getCodeBlockSubGraph_CodeBlock();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.codeGraph.EdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge Type</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.EdgeType
	 * @generated
	 */
	EEnum getEdgeType();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.codeGraph.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see es.um.uschema.code.metamodels.codeGraph.NodeType
	 * @generated
	 */
	EEnum getNodeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeGraphFactory getCodeGraphFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.CallableBlockSubGraphImpl <em>Callable Block Sub Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CallableBlockSubGraphImpl
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getCallableBlockSubGraph()
		 * @generated
		 */
		EClass CALLABLE_BLOCK_SUB_GRAPH = eINSTANCE.getCallableBlockSubGraph();

		/**
		 * The meta object literal for the '<em><b>Callable Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_BLOCK_SUB_GRAPH__CALLABLE_BLOCK = eINSTANCE.getCallableBlockSubGraph_CallableBlock();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.NodeImpl
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING_EDGES = eINSTANCE.getNode_OutgoingEdges();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__STATEMENT = eINSTANCE.getNode_Statement();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE_TYPE = eINSTANCE.getNode_NodeType();

		/**
		 * The meta object literal for the '<em><b>Incoming Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING_EDGES = eINSTANCE.getNode_IncomingEdges();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.EdgeImpl
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__TYPE = eINSTANCE.getEdge_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphImpl <em>Code Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphImpl
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getCodeGraph()
		 * @generated
		 */
		EClass CODE_GRAPH = eINSTANCE.getCodeGraph();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_GRAPH__CODE = eINSTANCE.getCodeGraph_Code();

		/**
		 * The meta object literal for the '<em><b>Sub Grahps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_GRAPH__SUB_GRAHPS = eINSTANCE.getCodeGraph_SubGrahps();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.EdgeCallImpl <em>Edge Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.EdgeCallImpl
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getEdgeCall()
		 * @generated
		 */
		EClass EDGE_CALL = eINSTANCE.getEdgeCall();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_CALL__CALL = eINSTANCE.getEdgeCall_Call();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.GraphPartImpl <em>Graph Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.GraphPartImpl
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getGraphPart()
		 * @generated
		 */
		EClass GRAPH_PART = eINSTANCE.getGraphPart();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_PART__VARIABLES = eINSTANCE.getGraphPart_Variables();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.ExpressionEdgeImpl <em>Expression Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.ExpressionEdgeImpl
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getExpressionEdge()
		 * @generated
		 */
		EClass EXPRESSION_EDGE = eINSTANCE.getExpressionEdge();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_EDGE__EXPRESSION = eINSTANCE.getExpressionEdge_Expression();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.CodeSubGraphImpl <em>Code Sub Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeSubGraphImpl
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getCodeSubGraph()
		 * @generated
		 */
		EClass CODE_SUB_GRAPH = eINSTANCE.getCodeSubGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_SUB_GRAPH__NODES = eINSTANCE.getCodeSubGraph_Nodes();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.codeGraph.impl.CodeBlockSubGraphImpl <em>Code Block Sub Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeBlockSubGraphImpl
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getCodeBlockSubGraph()
		 * @generated
		 */
		EClass CODE_BLOCK_SUB_GRAPH = eINSTANCE.getCodeBlockSubGraph();

		/**
		 * The meta object literal for the '<em><b>Code Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK_SUB_GRAPH__CODE_BLOCK = eINSTANCE.getCodeBlockSubGraph_CodeBlock();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.codeGraph.EdgeType <em>Edge Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.codeGraph.EdgeType
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getEdgeType()
		 * @generated
		 */
		EEnum EDGE_TYPE = eINSTANCE.getEdgeType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.codeGraph.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.codeGraph.NodeType
		 * @see es.um.uschema.code.metamodels.codeGraph.impl.CodeGraphPackageImpl#getNodeType()
		 * @generated
		 */
		EEnum NODE_TYPE = eINSTANCE.getNodeType();

	}

} //CodeGraphPackage
