/**
 */
package es.um.nosql.code.s13e.metamodels.codeGraph.util;

import es.um.nosql.code.s13e.metamodels.codeGraph.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphPackage
 * @generated
 */
public class CodeGraphAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodeGraphPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeGraphAdapterFactory()
	{
		if (modelPackage == null) {
			modelPackage = CodeGraphPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeGraphSwitch<Adapter> modelSwitch =
		new CodeGraphSwitch<Adapter>() {
			@Override
			public Adapter caseCallableBlockSubGraph(CallableBlockSubGraph object) {
				return createCallableBlockSubGraphAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseCodeGraph(CodeGraph object) {
				return createCodeGraphAdapter();
			}
			@Override
			public Adapter caseEdgeCall(EdgeCall object) {
				return createEdgeCallAdapter();
			}
			@Override
			public Adapter caseGraphPart(GraphPart object) {
				return createGraphPartAdapter();
			}
			@Override
			public Adapter caseExpressionEdge(ExpressionEdge object) {
				return createExpressionEdgeAdapter();
			}
			@Override
			public Adapter caseCodeSubGraph(CodeSubGraph object) {
				return createCodeSubGraphAdapter();
			}
			@Override
			public Adapter caseCodeBlockSubGraph(CodeBlockSubGraph object) {
				return createCodeBlockSubGraphAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.codeGraph.CallableBlockSubGraph <em>Callable Block Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.codeGraph.CallableBlockSubGraph
	 * @generated
	 */
	public Adapter createCallableBlockSubGraphAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.codeGraph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.codeGraph.Node
	 * @generated
	 */
	public Adapter createNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.codeGraph.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.codeGraph.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraph <em>Code Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraph
	 * @generated
	 */
	public Adapter createCodeGraphAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.codeGraph.EdgeCall <em>Edge Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.codeGraph.EdgeCall
	 * @generated
	 */
	public Adapter createEdgeCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.codeGraph.GraphPart <em>Graph Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.codeGraph.GraphPart
	 * @generated
	 */
	public Adapter createGraphPartAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.codeGraph.ExpressionEdge <em>Expression Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.codeGraph.ExpressionEdge
	 * @generated
	 */
	public Adapter createExpressionEdgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.codeGraph.CodeSubGraph <em>Code Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.codeGraph.CodeSubGraph
	 * @generated
	 */
	public Adapter createCodeSubGraphAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.codeGraph.CodeBlockSubGraph <em>Code Block Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.codeGraph.CodeBlockSubGraph
	 * @generated
	 */
	public Adapter createCodeBlockSubGraphAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //CodeGraphAdapterFactory
