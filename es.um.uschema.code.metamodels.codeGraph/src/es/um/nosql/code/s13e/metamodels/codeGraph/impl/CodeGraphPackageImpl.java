/**
 */
package es.um.nosql.code.s13e.metamodels.codeGraph.impl;

import es.um.nosql.code.s13e.metamodels.code.CodePackage;

import es.um.nosql.code.s13e.metamodels.codeGraph.CallableBlockSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeBlockSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphFactory;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphPackage;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.Edge;
import es.um.nosql.code.s13e.metamodels.codeGraph.EdgeCall;
import es.um.nosql.code.s13e.metamodels.codeGraph.EdgeType;
import es.um.nosql.code.s13e.metamodels.codeGraph.ExpressionEdge;
import es.um.nosql.code.s13e.metamodels.codeGraph.GraphPart;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.metamodels.codeGraph.NodeType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeGraphPackageImpl extends EPackageImpl implements CodeGraphPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableBlockSubGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSubGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeBlockSubGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum edgeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodeGraphPackageImpl()
	{
		super(eNS_URI, CodeGraphFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CodeGraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodeGraphPackage init()
	{
		if (isInited) return (CodeGraphPackage)EPackage.Registry.INSTANCE.getEPackage(CodeGraphPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCodeGraphPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CodeGraphPackageImpl theCodeGraphPackage = registeredCodeGraphPackage instanceof CodeGraphPackageImpl ? (CodeGraphPackageImpl)registeredCodeGraphPackage : new CodeGraphPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CodePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCodeGraphPackage.createPackageContents();

		// Initialize created meta-data
		theCodeGraphPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodeGraphPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodeGraphPackage.eNS_URI, theCodeGraphPackage);
		return theCodeGraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallableBlockSubGraph()
	{
		return callableBlockSubGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallableBlockSubGraph_CallableBlock()
	{
		return (EReference)callableBlockSubGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode()
	{
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_OutgoingEdges()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Statement()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_NodeType()
	{
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_IncomingEdges()
	{
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdge()
	{
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdge_Type()
	{
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Target()
	{
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Source()
	{
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeGraph()
	{
		return codeGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeGraph_Code()
	{
		return (EReference)codeGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeGraph_SubGrahps()
	{
		return (EReference)codeGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdgeCall()
	{
		return edgeCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdgeCall_Call()
	{
		return (EReference)edgeCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphPart()
	{
		return graphPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphPart_Variables()
	{
		return (EReference)graphPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionEdge()
	{
		return expressionEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressionEdge_Expression()
	{
		return (EReference)expressionEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeSubGraph()
	{
		return codeSubGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeSubGraph_Nodes()
	{
		return (EReference)codeSubGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeBlockSubGraph()
	{
		return codeBlockSubGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeBlockSubGraph_CodeBlock()
	{
		return (EReference)codeBlockSubGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEdgeType()
	{
		return edgeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNodeType()
	{
		return nodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGraphFactory getCodeGraphFactory()
	{
		return (CodeGraphFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		callableBlockSubGraphEClass = createEClass(CALLABLE_BLOCK_SUB_GRAPH);
		createEReference(callableBlockSubGraphEClass, CALLABLE_BLOCK_SUB_GRAPH__CALLABLE_BLOCK);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__OUTGOING_EDGES);
		createEReference(nodeEClass, NODE__STATEMENT);
		createEAttribute(nodeEClass, NODE__NODE_TYPE);
		createEReference(nodeEClass, NODE__INCOMING_EDGES);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__TYPE);
		createEReference(edgeEClass, EDGE__TARGET);
		createEReference(edgeEClass, EDGE__SOURCE);

		codeGraphEClass = createEClass(CODE_GRAPH);
		createEReference(codeGraphEClass, CODE_GRAPH__CODE);
		createEReference(codeGraphEClass, CODE_GRAPH__SUB_GRAHPS);

		edgeCallEClass = createEClass(EDGE_CALL);
		createEReference(edgeCallEClass, EDGE_CALL__CALL);

		graphPartEClass = createEClass(GRAPH_PART);
		createEReference(graphPartEClass, GRAPH_PART__VARIABLES);

		expressionEdgeEClass = createEClass(EXPRESSION_EDGE);
		createEReference(expressionEdgeEClass, EXPRESSION_EDGE__EXPRESSION);

		codeSubGraphEClass = createEClass(CODE_SUB_GRAPH);
		createEReference(codeSubGraphEClass, CODE_SUB_GRAPH__NODES);

		codeBlockSubGraphEClass = createEClass(CODE_BLOCK_SUB_GRAPH);
		createEReference(codeBlockSubGraphEClass, CODE_BLOCK_SUB_GRAPH__CODE_BLOCK);

		// Create enums
		edgeTypeEEnum = createEEnum(EDGE_TYPE);
		nodeTypeEEnum = createEEnum(NODE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callableBlockSubGraphEClass.getESuperTypes().add(this.getCodeSubGraph());
		nodeEClass.getESuperTypes().add(this.getGraphPart());
		edgeEClass.getESuperTypes().add(this.getGraphPart());
		edgeCallEClass.getESuperTypes().add(this.getEdge());
		expressionEdgeEClass.getESuperTypes().add(this.getEdge());
		codeBlockSubGraphEClass.getESuperTypes().add(this.getCodeSubGraph());

		// Initialize classes, features, and operations; add parameters
		initEClass(callableBlockSubGraphEClass, CallableBlockSubGraph.class, "CallableBlockSubGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallableBlockSubGraph_CallableBlock(), theCodePackage.getCallableBlock(), null, "callableBlock", null, 0, 1, CallableBlockSubGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_OutgoingEdges(), this.getEdge(), null, "outgoingEdges", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Statement(), theCodePackage.getStatement(), null, "statement", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_NodeType(), this.getNodeType(), "nodeType", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_IncomingEdges(), this.getEdge(), null, "incomingEdges", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Type(), this.getEdgeType(), "type", "NEXT", 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Target(), this.getNode(), null, "target", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Source(), this.getNode(), null, "source", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeGraphEClass, CodeGraph.class, "CodeGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeGraph_Code(), theCodePackage.getCode(), null, "code", null, 0, 1, CodeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeGraph_SubGrahps(), this.getCodeSubGraph(), null, "subGrahps", null, 0, -1, CodeGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeCallEClass, EdgeCall.class, "EdgeCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeCall_Call(), this.getCallableBlockSubGraph(), null, "call", null, 0, 1, EdgeCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphPartEClass, GraphPart.class, "GraphPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphPart_Variables(), theCodePackage.getVariable(), null, "variables", null, 0, -1, GraphPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEdgeEClass, ExpressionEdge.class, "ExpressionEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionEdge_Expression(), theCodePackage.getExpression(), null, "expression", null, 0, 1, ExpressionEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeSubGraphEClass, CodeSubGraph.class, "CodeSubGraph", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeSubGraph_Nodes(), this.getNode(), null, "nodes", null, 0, -1, CodeSubGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeBlockSubGraphEClass, CodeBlockSubGraph.class, "CodeBlockSubGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeBlockSubGraph_CodeBlock(), theCodePackage.getCodeBlock(), null, "codeBlock", null, 0, 1, CodeBlockSubGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(edgeTypeEEnum, EdgeType.class, "EdgeType");
		addEEnumLiteral(edgeTypeEEnum, EdgeType.CALL);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.LOOP);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.SELECTION);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.TRY);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.CATCH);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.JUMP);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.RETURN);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.NEXT);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.EXPRESSION);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.FINALLY);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.ELSE);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.ARGUMENT);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.PARAMETER);

		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.START_NODE);
		addEEnumLiteral(nodeTypeEEnum, NodeType.END_NODE);
		addEEnumLiteral(nodeTypeEEnum, NodeType.STATEMENT_NODE);
		addEEnumLiteral(nodeTypeEEnum, NodeType.CONTROL_NODE);
		addEEnumLiteral(nodeTypeEEnum, NodeType.PARAMETER);
		addEEnumLiteral(nodeTypeEEnum, NodeType.ARGUMENT);

		// Create resource
		createResource(eNS_URI);
	}

} //CodeGraphPackageImpl
