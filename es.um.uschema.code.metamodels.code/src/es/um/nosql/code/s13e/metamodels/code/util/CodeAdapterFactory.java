/**
 */
package es.um.nosql.code.s13e.metamodels.code.util;

import es.um.nosql.code.s13e.metamodels.code.Argument;
import es.um.nosql.code.s13e.metamodels.code.Assign;
import es.um.nosql.code.s13e.metamodels.code.Assignable;
import es.um.nosql.code.s13e.metamodels.code.Break;
import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.Case;
import es.um.nosql.code.s13e.metamodels.code.Catch;
import es.um.nosql.code.s13e.metamodels.code.Code;
import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeContainer;
import es.um.nosql.code.s13e.metamodels.code.CodeLocation;
import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.ConditionalExpression;
import es.um.nosql.code.s13e.metamodels.code.Constant;
import es.um.nosql.code.s13e.metamodels.code.Container;
import es.um.nosql.code.s13e.metamodels.code.DataContainer;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.Expression;
import es.um.nosql.code.s13e.metamodels.code.Finally;
import es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess;
import es.um.nosql.code.s13e.metamodels.code.Literal;
import es.um.nosql.code.s13e.metamodels.code.Loop;
import es.um.nosql.code.s13e.metamodels.code.LoopPart;
import es.um.nosql.code.s13e.metamodels.code.NewArray;
import es.um.nosql.code.s13e.metamodels.code.NewClass;
import es.um.nosql.code.s13e.metamodels.code.NewDataContainer;
import es.um.nosql.code.s13e.metamodels.code.Operation;
import es.um.nosql.code.s13e.metamodels.code.Parameter;
import es.um.nosql.code.s13e.metamodels.code.PrimitiveType;
import es.um.nosql.code.s13e.metamodels.code.Property;
import es.um.nosql.code.s13e.metamodels.code.PropertyAccess;
import es.um.nosql.code.s13e.metamodels.code.PropertyAssign;
import es.um.nosql.code.s13e.metamodels.code.Return;
import es.um.nosql.code.s13e.metamodels.code.Selection;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.This;
import es.um.nosql.code.s13e.metamodels.code.Throw;
import es.um.nosql.code.s13e.metamodels.code.Try;
import es.um.nosql.code.s13e.metamodels.code.Type;
import es.um.nosql.code.s13e.metamodels.code.UnaryExpression;
import es.um.nosql.code.s13e.metamodels.code.UnaryOperation;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.metamodels.code.VariableDeclaration;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage
 * @generated
 */
public class CodeAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CodePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeAdapterFactory()
	{
		if (modelPackage == null) {
			modelPackage = CodePackage.eINSTANCE;
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
	protected CodeSwitch<Adapter> modelSwitch =
		new CodeSwitch<Adapter>() {
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseCodeContainer(CodeContainer object) {
				return createCodeContainerAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseLoop(Loop object) {
				return createLoopAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseCodeBlock(CodeBlock object) {
				return createCodeBlockAdapter();
			}
			@Override
			public Adapter caseCase(Case object) {
				return createCaseAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseLoopPart(LoopPart object) {
				return createLoopPartAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseDataContainer(DataContainer object) {
				return createDataContainerAdapter();
			}
			@Override
			public Adapter caseDataProducer(DataProducer object) {
				return createDataProducerAdapter();
			}
			@Override
			public Adapter caseCallableBlock(CallableBlock object) {
				return createCallableBlockAdapter();
			}
			@Override
			public Adapter caseException(es.um.nosql.code.s13e.metamodels.code.Exception object) {
				return createExceptionAdapter();
			}
			@Override
			public Adapter caseReturn(Return object) {
				return createReturnAdapter();
			}
			@Override
			public Adapter caseThrow(Throw object) {
				return createThrowAdapter();
			}
			@Override
			public Adapter caseNewDataContainer(NewDataContainer object) {
				return createNewDataContainerAdapter();
			}
			@Override
			public Adapter caseAssign(Assign object) {
				return createAssignAdapter();
			}
			@Override
			public Adapter caseAssignable(Assignable object) {
				return createAssignableAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseIndexBasedAccess(IndexBasedAccess object) {
				return createIndexBasedAccessAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseUnaryOperation(UnaryOperation object) {
				return createUnaryOperationAdapter();
			}
			@Override
			public Adapter caseVariableAccess(VariableAccess object) {
				return createVariableAccessAdapter();
			}
			@Override
			public Adapter caseConditionalExpression(ConditionalExpression object) {
				return createConditionalExpressionAdapter();
			}
			@Override
			public Adapter caseTry(Try object) {
				return createTryAdapter();
			}
			@Override
			public Adapter caseCatch(Catch object) {
				return createCatchAdapter();
			}
			@Override
			public Adapter caseCall(Call object) {
				return createCallAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter casePropertyAccess(PropertyAccess object) {
				return createPropertyAccessAdapter();
			}
			@Override
			public Adapter casePropertyAssign(PropertyAssign object) {
				return createPropertyAssignAdapter();
			}
			@Override
			public Adapter caseBreak(Break object) {
				return createBreakAdapter();
			}
			@Override
			public Adapter caseNewArray(NewArray object) {
				return createNewArrayAdapter();
			}
			@Override
			public Adapter caseNewClass(NewClass object) {
				return createNewClassAdapter();
			}
			@Override
			public Adapter caseThis(This object) {
				return createThisAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseFinally(Finally object) {
				return createFinallyAdapter();
			}
			@Override
			public Adapter caseCodeLocation(CodeLocation object) {
				return createCodeLocationAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Code
	 * @generated
	 */
	public Adapter createCodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Container
	 * @generated
	 */
	public Adapter createContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.CodeContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodeContainer
	 * @generated
	 */
	public Adapter createCodeContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Type
	 * @generated
	 */
	public Adapter createTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.CodeBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodeBlock
	 * @generated
	 */
	public Adapter createCodeBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Case
	 * @generated
	 */
	public Adapter createCaseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.LoopPart <em>Loop Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.LoopPart
	 * @generated
	 */
	public Adapter createLoopPartAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.DataContainer <em>Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.DataContainer
	 * @generated
	 */
	public Adapter createDataContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.DataProducer <em>Data Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.DataProducer
	 * @generated
	 */
	public Adapter createDataProducerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.CallableBlock <em>Callable Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.CallableBlock
	 * @generated
	 */
	public Adapter createCallableBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Return
	 * @generated
	 */
	public Adapter createReturnAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Throw <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Throw
	 * @generated
	 */
	public Adapter createThrowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.NewDataContainer <em>New Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.NewDataContainer
	 * @generated
	 */
	public Adapter createNewDataContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Assign
	 * @generated
	 */
	public Adapter createAssignAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Assignable <em>Assignable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Assignable
	 * @generated
	 */
	public Adapter createAssignableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess <em>Index Based Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess
	 * @generated
	 */
	public Adapter createIndexBasedAccessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.UnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.UnaryOperation
	 * @generated
	 */
	public Adapter createUnaryOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.VariableAccess <em>Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.VariableAccess
	 * @generated
	 */
	public Adapter createVariableAccessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.ConditionalExpression
	 * @generated
	 */
	public Adapter createConditionalExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Try <em>Try</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Try
	 * @generated
	 */
	public Adapter createTryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Catch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Catch
	 * @generated
	 */
	public Adapter createCatchAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Call
	 * @generated
	 */
	public Adapter createCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.PropertyAccess <em>Property Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.PropertyAccess
	 * @generated
	 */
	public Adapter createPropertyAccessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.PropertyAssign <em>Property Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.PropertyAssign
	 * @generated
	 */
	public Adapter createPropertyAssignAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Break
	 * @generated
	 */
	public Adapter createBreakAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.NewArray <em>New Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.NewArray
	 * @generated
	 */
	public Adapter createNewArrayAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.NewClass <em>New Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.NewClass
	 * @generated
	 */
	public Adapter createNewClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.This <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.This
	 * @generated
	 */
	public Adapter createThisAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.Finally <em>Finally</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.Finally
	 * @generated
	 */
	public Adapter createFinallyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.um.nosql.code.s13e.metamodels.code.CodeLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.um.nosql.code.s13e.metamodels.code.CodeLocation
	 * @generated
	 */
	public Adapter createCodeLocationAdapter()
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

} //CodeAdapterFactory
