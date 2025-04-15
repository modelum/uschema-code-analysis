/**
 */
package es.um.nosql.code.s13e.metamodels.code.impl;

import es.um.nosql.code.s13e.metamodels.code.Argument;
import es.um.nosql.code.s13e.metamodels.code.Assign;
import es.um.nosql.code.s13e.metamodels.code.Break;
import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.Case;
import es.um.nosql.code.s13e.metamodels.code.CaseType;
import es.um.nosql.code.s13e.metamodels.code.Catch;
import es.um.nosql.code.s13e.metamodels.code.Code;
import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeBlockType;
import es.um.nosql.code.s13e.metamodels.code.CodeContainer;
import es.um.nosql.code.s13e.metamodels.code.CodeContainerType;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.CodeLocation;
import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.code.Constant;
import es.um.nosql.code.s13e.metamodels.code.ContainerType;
import es.um.nosql.code.s13e.metamodels.code.DataContainer;
import es.um.nosql.code.s13e.metamodels.code.Expression;
import es.um.nosql.code.s13e.metamodels.code.ExpressionType;
import es.um.nosql.code.s13e.metamodels.code.Finally;
import es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess;
import es.um.nosql.code.s13e.metamodels.code.Literal;
import es.um.nosql.code.s13e.metamodels.code.Loop;
import es.um.nosql.code.s13e.metamodels.code.LoopPart;
import es.um.nosql.code.s13e.metamodels.code.LoopPartType;
import es.um.nosql.code.s13e.metamodels.code.LoopType;
import es.um.nosql.code.s13e.metamodels.code.NewArray;
import es.um.nosql.code.s13e.metamodels.code.NewClass;
import es.um.nosql.code.s13e.metamodels.code.NewDataContainer;
import es.um.nosql.code.s13e.metamodels.code.Operation;
import es.um.nosql.code.s13e.metamodels.code.OperationType;
import es.um.nosql.code.s13e.metamodels.code.Parameter;
import es.um.nosql.code.s13e.metamodels.code.PrimitiveType;
import es.um.nosql.code.s13e.metamodels.code.Property;
import es.um.nosql.code.s13e.metamodels.code.PropertyAccess;
import es.um.nosql.code.s13e.metamodels.code.PropertyAssign;
import es.um.nosql.code.s13e.metamodels.code.Return;
import es.um.nosql.code.s13e.metamodels.code.Selection;
import es.um.nosql.code.s13e.metamodels.code.SelectionType;
import es.um.nosql.code.s13e.metamodels.code.This;
import es.um.nosql.code.s13e.metamodels.code.Throw;
import es.um.nosql.code.s13e.metamodels.code.Try;
import es.um.nosql.code.s13e.metamodels.code.UnaryExpression;
import es.um.nosql.code.s13e.metamodels.code.UnaryOperation;
import es.um.nosql.code.s13e.metamodels.code.UnaryOperationType;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.metamodels.code.VariableDeclaration;

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
public class CodeFactoryImpl extends EFactoryImpl implements CodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeFactory init() {
		try {
			CodeFactory theCodeFactory = (CodeFactory)EPackage.Registry.INSTANCE.getEFactory(CodePackage.eNS_URI);
			if (theCodeFactory != null) {
				return theCodeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFactoryImpl() {
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
			case CodePackage.CODE: return createCode();
			case CodePackage.CONTAINER: return createContainer();
			case CodePackage.CODE_CONTAINER: return createCodeContainer();
			case CodePackage.PROPERTY: return createProperty();
			case CodePackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case CodePackage.EXPRESSION: return createExpression();
			case CodePackage.OPERATION: return createOperation();
			case CodePackage.LOOP: return createLoop();
			case CodePackage.SELECTION: return createSelection();
			case CodePackage.CODE_BLOCK: return createCodeBlock();
			case CodePackage.CASE: return createCase();
			case CodePackage.VARIABLE: return createVariable();
			case CodePackage.LOOP_PART: return createLoopPart();
			case CodePackage.PARAMETER: return createParameter();
			case CodePackage.DATA_CONTAINER: return createDataContainer();
			case CodePackage.CALLABLE_BLOCK: return createCallableBlock();
			case CodePackage.EXCEPTION: return createException();
			case CodePackage.RETURN: return createReturn();
			case CodePackage.THROW: return createThrow();
			case CodePackage.NEW_DATA_CONTAINER: return createNewDataContainer();
			case CodePackage.ASSIGN: return createAssign();
			case CodePackage.CONSTANT: return createConstant();
			case CodePackage.INDEX_BASED_ACCESS: return createIndexBasedAccess();
			case CodePackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case CodePackage.LITERAL: return createLiteral();
			case CodePackage.UNARY_OPERATION: return createUnaryOperation();
			case CodePackage.VARIABLE_ACCESS: return createVariableAccess();
			case CodePackage.TRY: return createTry();
			case CodePackage.CATCH: return createCatch();
			case CodePackage.CALL: return createCall();
			case CodePackage.ARGUMENT: return createArgument();
			case CodePackage.PROPERTY_ACCESS: return createPropertyAccess();
			case CodePackage.PROPERTY_ASSIGN: return createPropertyAssign();
			case CodePackage.BREAK: return createBreak();
			case CodePackage.NEW_ARRAY: return createNewArray();
			case CodePackage.NEW_CLASS: return createNewClass();
			case CodePackage.THIS: return createThis();
			case CodePackage.UNARY_EXPRESSION: return createUnaryExpression();
			case CodePackage.FINALLY: return createFinally();
			case CodePackage.CODE_LOCATION: return createCodeLocation();
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
			case CodePackage.OPERATION_TYPE:
				return createOperationTypeFromString(eDataType, initialValue);
			case CodePackage.LOOP_TYPE:
				return createLoopTypeFromString(eDataType, initialValue);
			case CodePackage.CONTAINER_TYPE:
				return createContainerTypeFromString(eDataType, initialValue);
			case CodePackage.CODE_CONTAINER_TYPE:
				return createCodeContainerTypeFromString(eDataType, initialValue);
			case CodePackage.EXPRESSION_TYPE:
				return createExpressionTypeFromString(eDataType, initialValue);
			case CodePackage.CASE_TYPE:
				return createCaseTypeFromString(eDataType, initialValue);
			case CodePackage.SELECTION_TYPE:
				return createSelectionTypeFromString(eDataType, initialValue);
			case CodePackage.CODE_BLOCK_TYPE:
				return createCodeBlockTypeFromString(eDataType, initialValue);
			case CodePackage.LOOP_PART_TYPE:
				return createLoopPartTypeFromString(eDataType, initialValue);
			case CodePackage.UNARY_OPERATION_TYPE:
				return createUnaryOperationTypeFromString(eDataType, initialValue);
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
			case CodePackage.OPERATION_TYPE:
				return convertOperationTypeToString(eDataType, instanceValue);
			case CodePackage.LOOP_TYPE:
				return convertLoopTypeToString(eDataType, instanceValue);
			case CodePackage.CONTAINER_TYPE:
				return convertContainerTypeToString(eDataType, instanceValue);
			case CodePackage.CODE_CONTAINER_TYPE:
				return convertCodeContainerTypeToString(eDataType, instanceValue);
			case CodePackage.EXPRESSION_TYPE:
				return convertExpressionTypeToString(eDataType, instanceValue);
			case CodePackage.CASE_TYPE:
				return convertCaseTypeToString(eDataType, instanceValue);
			case CodePackage.SELECTION_TYPE:
				return convertSelectionTypeToString(eDataType, instanceValue);
			case CodePackage.CODE_BLOCK_TYPE:
				return convertCodeBlockTypeToString(eDataType, instanceValue);
			case CodePackage.LOOP_PART_TYPE:
				return convertLoopPartTypeToString(eDataType, instanceValue);
			case CodePackage.UNARY_OPERATION_TYPE:
				return convertUnaryOperationTypeToString(eDataType, instanceValue);
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
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public es.um.nosql.code.s13e.metamodels.code.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeContainer createCodeContainer() {
		CodeContainerImpl codeContainer = new CodeContainerImpl();
		return codeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBlock createCodeBlock() {
		CodeBlockImpl codeBlock = new CodeBlockImpl();
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoopPart createLoopPart() {
		LoopPartImpl loopPart = new LoopPartImpl();
		return loopPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataContainer createDataContainer() {
		DataContainerImpl dataContainer = new DataContainerImpl();
		return dataContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallableBlock createCallableBlock() {
		CallableBlockImpl callableBlock = new CallableBlockImpl();
		return callableBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public es.um.nosql.code.s13e.metamodels.code.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Throw createThrow() {
		ThrowImpl throw_ = new ThrowImpl();
		return throw_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewDataContainer createNewDataContainer() {
		NewDataContainerImpl newDataContainer = new NewDataContainerImpl();
		return newDataContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexBasedAccess createIndexBasedAccess() {
		IndexBasedAccessImpl indexBasedAccess = new IndexBasedAccessImpl();
		return indexBasedAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryOperation createUnaryOperation() {
		UnaryOperationImpl unaryOperation = new UnaryOperationImpl();
		return unaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableAccess createVariableAccess() {
		VariableAccessImpl variableAccess = new VariableAccessImpl();
		return variableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Try createTry() {
		TryImpl try_ = new TryImpl();
		return try_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catch createCatch() {
		CatchImpl catch_ = new CatchImpl();
		return catch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyAccess createPropertyAccess() {
		PropertyAccessImpl propertyAccess = new PropertyAccessImpl();
		return propertyAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyAssign createPropertyAssign() {
		PropertyAssignImpl propertyAssign = new PropertyAssignImpl();
		return propertyAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Break createBreak() {
		BreakImpl break_ = new BreakImpl();
		return break_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewArray createNewArray() {
		NewArrayImpl newArray = new NewArrayImpl();
		return newArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewClass createNewClass() {
		NewClassImpl newClass = new NewClassImpl();
		return newClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public This createThis() {
		ThisImpl this_ = new ThisImpl();
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Finally createFinally() {
		FinallyImpl finally_ = new FinallyImpl();
		return finally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeLocation createCodeLocation() {
		CodeLocationImpl codeLocation = new CodeLocationImpl();
		return codeLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
		OperationType result = OperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopType createLoopTypeFromString(EDataType eDataType, String initialValue) {
		LoopType result = LoopType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoopTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerType createContainerTypeFromString(EDataType eDataType, String initialValue) {
		ContainerType result = ContainerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeContainerType createCodeContainerTypeFromString(EDataType eDataType, String initialValue) {
		CodeContainerType result = CodeContainerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeContainerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType createExpressionTypeFromString(EDataType eDataType, String initialValue) {
		ExpressionType result = ExpressionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseType createCaseTypeFromString(EDataType eDataType, String initialValue) {
		CaseType result = CaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionType createSelectionTypeFromString(EDataType eDataType, String initialValue) {
		SelectionType result = SelectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlockType createCodeBlockTypeFromString(EDataType eDataType, String initialValue) {
		CodeBlockType result = CodeBlockType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeBlockTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopPartType createLoopPartTypeFromString(EDataType eDataType, String initialValue) {
		LoopPartType result = LoopPartType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoopPartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperationType createUnaryOperationTypeFromString(EDataType eDataType, String initialValue) {
		UnaryOperationType result = UnaryOperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodePackage getCodePackage() {
		return (CodePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodePackage getPackage() {
		return CodePackage.eINSTANCE;
	}

} //CodeFactoryImpl
