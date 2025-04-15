/**
 */
package es.um.uschema.code.metamodels.code;

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
 * @see es.um.uschema.code.metamodels.code.CodeFactory
 * @model kind="package"
 * @generated
 */
public interface CodePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "code";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.um.uschema.code.metamodels/code";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "code";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodePackage eINSTANCE = es.um.uschema.code.metamodels.code.impl.CodePackageImpl.init();

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.CodeImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCode()
	 * @generated
	 */
	int CODE = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__TYPES = 2;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__EXCEPTION = 3;

	/**
	 * The feature id for the '<em><b>Global Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__GLOBAL_VARIABLE = 4;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.ContainerImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Code Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CODE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Sub Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SUB_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = 3;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.TypeImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.CodeContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.CodeContainerImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCodeContainer()
	 * @generated
	 */
	int CODE_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONTAINER__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONTAINER__NAME = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONTAINER__CODE_BLOCK = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONTAINER__DATA_CONTAINER = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONTAINER__VARIABLE = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONTAINER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONTAINER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.StatementImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__END = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.AssignableImpl <em>Assignable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.AssignableImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getAssignable()
	 * @generated
	 */
	int ASSIGNABLE = 24;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE__END = STATEMENT__END;

	/**
	 * The number of structural features of the '<em>Assignable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assignable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.PropertyImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__START = ASSIGNABLE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__END = ASSIGNABLE__END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = ASSIGNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = ASSIGNABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INITIALIZATION = ASSIGNABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATA_CONTAINER = ASSIGNABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = ASSIGNABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = ASSIGNABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.PrimitiveTypeImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.ExpressionImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CONDITIONAL_EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.OperationImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DATA_PRODUCERS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.LoopImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 9;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__TYPE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CODE_BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loop Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP_PART = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.SelectionImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 10;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__TYPE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__CASE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.CodeBlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.CodeBlockImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 11;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__STATEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Code Block Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CODE_BLOCK_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__RETURN_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.CaseImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCase()
	 * @generated
	 */
	int CASE = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Code Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CODE_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CONDITIONAL_EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.DataProducerImpl <em>Data Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.DataProducerImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getDataProducer()
	 * @generated
	 */
	int DATA_PRODUCER = 17;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCER__START = ASSIGNABLE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCER__END = ASSIGNABLE__END;

	/**
	 * The number of structural features of the '<em>Data Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCER_FEATURE_COUNT = ASSIGNABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCER_OPERATION_COUNT = ASSIGNABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.VariableImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 13;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__START = DATA_PRODUCER__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__END = DATA_PRODUCER__END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = DATA_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = DATA_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = DATA_PRODUCER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = DATA_PRODUCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.LoopPartImpl <em>Loop Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.LoopPartImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getLoopPart()
	 * @generated
	 */
	int LOOP_PART = 14;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_PART__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_PART__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Loop Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Loop Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.ParameterImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__START = VARIABLE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__END = VARIABLE__END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Callable Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CALLABLE_BLOCK = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.DataContainerImpl <em>Data Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.DataContainerImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getDataContainer()
	 * @generated
	 */
	int DATA_CONTAINER = 16;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__START = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__END = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__NAME = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__TYPE = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__INITIALIZATION = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__DATA_CONTAINER = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__PROPERTIES = TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER__PARENT = TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Data Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Data Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.CallableBlockImpl <em>Callable Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.CallableBlockImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCallableBlock()
	 * @generated
	 */
	int CALLABLE_BLOCK = 18;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK__STATEMENTS = CODE_BLOCK__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Code Block Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK__CODE_BLOCK_TYPE = CODE_BLOCK__CODE_BLOCK_TYPE;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK__VARIABLES = CODE_BLOCK__VARIABLES;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK__RETURN_TYPE = CODE_BLOCK__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK__START = CODE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK__END = CODE_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK__NAME = CODE_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK__TYPE = CODE_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK__PARAMETERS = CODE_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK__FUNCTION_NAME = CODE_BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Callable Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK_FEATURE_COUNT = CODE_BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Callable Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_BLOCK_OPERATION_COUNT = CODE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.ExceptionImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 19;

	/**
	 * The feature id for the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__EXCEPTION_NAME = 0;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.ReturnImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 20;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Data Producers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__DATA_PRODUCERS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.ThrowImpl <em>Throw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.ThrowImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getThrow()
	 * @generated
	 */
	int THROW = 21;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__EXCEPTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__DATA_PRODUCER = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Throw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Throw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.NewDataContainerImpl <em>New Data Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.NewDataContainerImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getNewDataContainer()
	 * @generated
	 */
	int NEW_DATA_CONTAINER = 22;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_CONTAINER__START = DATA_PRODUCER__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_CONTAINER__END = DATA_PRODUCER__END;

	/**
	 * The feature id for the '<em><b>Data Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_CONTAINER__DATA_CONTAINER = DATA_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Data Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_CONTAINER_FEATURE_COUNT = DATA_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>New Data Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_CONTAINER_OPERATION_COUNT = DATA_PRODUCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.AssignImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 23;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__OUTPUTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__VARIABLE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__INPUTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__TYPE = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__NAME = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.ConstantImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 25;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__START = VARIABLE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__END = VARIABLE__END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = VARIABLE__TYPE;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.IndexBasedAccessImpl <em>Index Based Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.IndexBasedAccessImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getIndexBasedAccess()
	 * @generated
	 */
	int INDEX_BASED_ACCESS = 26;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_BASED_ACCESS__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_BASED_ACCESS__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_BASED_ACCESS__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_BASED_ACCESS__INDEX = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_BASED_ACCESS__DATA_PRODUCER = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Index Based Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_BASED_ACCESS_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Index Based Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_BASED_ACCESS_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.VariableDeclarationImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 27;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__INITIALIZATION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__KIND = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.LiteralImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 28;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__START = DATA_PRODUCER__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__END = DATA_PRODUCER__END;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LITERAL = DATA_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__TYPE = DATA_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = DATA_PRODUCER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = DATA_PRODUCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.UnaryOperationImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getUnaryOperation()
	 * @generated
	 */
	int UNARY_OPERATION = 29;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__TYPE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__VARIABLE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.VariableAccessImpl <em>Variable Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.VariableAccessImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getVariableAccess()
	 * @generated
	 */
	int VARIABLE_ACCESS = 30;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS__NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESS_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.ConditionalExpressionImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 31;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.TryImpl <em>Try</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.TryImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getTry()
	 * @generated
	 */
	int TRY = 32;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Catchs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY__CATCHS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY__CODE_BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Finally</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY__FINALLY = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Try</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Try</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.CatchImpl <em>Catch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.CatchImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCatch()
	 * @generated
	 */
	int CATCH = 33;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__EXCEPTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__CODE_BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__DATA_PRODUCER = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.CallImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCall()
	 * @generated
	 */
	int CALL = 34;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Callable Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__CALLABLE_BLOCK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ARGUMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__NAME = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__DATA_PRODUCER = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.ArgumentImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 35;

	/**
	 * The feature id for the '<em><b>Data Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__DATA_PRODUCER = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.PropertyAccessImpl <em>Property Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.PropertyAccessImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getPropertyAccess()
	 * @generated
	 */
	int PROPERTY_ACCESS = 36;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS__START = DATA_PRODUCER__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS__END = DATA_PRODUCER__END;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS__PROPERTY = DATA_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS__NAME = DATA_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS__NEXT_ACCESS = DATA_PRODUCER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS__DATA_PRODUCER = DATA_PRODUCER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS_FEATURE_COUNT = DATA_PRODUCER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Property Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS_OPERATION_COUNT = DATA_PRODUCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.PropertyAssignImpl <em>Property Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.PropertyAssignImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getPropertyAssign()
	 * @generated
	 */
	int PROPERTY_ASSIGN = 37;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__START = ASSIGN__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__END = ASSIGN__END;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__OUTPUTS = ASSIGN__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__VARIABLE = ASSIGN__VARIABLE;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__INPUTS = ASSIGN__INPUTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__TYPE = ASSIGN__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__NAME = ASSIGN__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN__PROPERTY = ASSIGN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN_FEATURE_COUNT = ASSIGN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSIGN_OPERATION_COUNT = ASSIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.BreakImpl <em>Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.BreakImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getBreak()
	 * @generated
	 */
	int BREAK = 38;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__END = STATEMENT__END;

	/**
	 * The number of structural features of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.NewArrayImpl <em>New Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.NewArrayImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getNewArray()
	 * @generated
	 */
	int NEW_ARRAY = 39;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ARRAY__START = DATA_PRODUCER__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ARRAY__END = DATA_PRODUCER__END;

	/**
	 * The feature id for the '<em><b>Data Producer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ARRAY__DATA_PRODUCER = DATA_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ARRAY_FEATURE_COUNT = DATA_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>New Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ARRAY_OPERATION_COUNT = DATA_PRODUCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.NewClassImpl <em>New Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.NewClassImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getNewClass()
	 * @generated
	 */
	int NEW_CLASS = 40;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS__START = DATA_PRODUCER__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS__END = DATA_PRODUCER__END;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS__ARGUMENTS = DATA_PRODUCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS__CODE_CONTAINER = DATA_PRODUCER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Callable Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS__CALLABLE_BLOCK = DATA_PRODUCER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>New Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS_FEATURE_COUNT = DATA_PRODUCER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>New Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS_OPERATION_COUNT = DATA_PRODUCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.ThisImpl <em>This</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.ThisImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getThis()
	 * @generated
	 */
	int THIS = 41;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS__END = STATEMENT__END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS__TYPE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS__DATA_CONTAINER = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>This</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>This</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.UnaryExpressionImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 42;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__START = EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__END = EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__CONDITIONAL_EXPRESSION = EXPRESSION__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__DATA_PRODUCER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.FinallyImpl <em>Finally</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.FinallyImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getFinally()
	 * @generated
	 */
	int FINALLY = 43;

	/**
	 * The feature id for the '<em><b>Code Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY__CODE_BLOCK = 0;

	/**
	 * The number of structural features of the '<em>Finally</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Finally</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.impl.CodeLocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.impl.CodeLocationImpl
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCodeLocation()
	 * @generated
	 */
	int CODE_LOCATION = 44;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LOCATION__LINE = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LOCATION__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.OperationType
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 45;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.LoopType <em>Loop Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.LoopType
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getLoopType()
	 * @generated
	 */
	int LOOP_TYPE = 46;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.ContainerType <em>Container Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.ContainerType
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getContainerType()
	 * @generated
	 */
	int CONTAINER_TYPE = 47;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.CodeContainerType <em>Container Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.CodeContainerType
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCodeContainerType()
	 * @generated
	 */
	int CODE_CONTAINER_TYPE = 48;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.ExpressionType <em>Expression Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.ExpressionType
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 49;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.CaseType <em>Case Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.CaseType
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCaseType()
	 * @generated
	 */
	int CASE_TYPE = 50;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.SelectionType <em>Selection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.SelectionType
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getSelectionType()
	 * @generated
	 */
	int SELECTION_TYPE = 51;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.CodeBlockType <em>Block Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.CodeBlockType
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCodeBlockType()
	 * @generated
	 */
	int CODE_BLOCK_TYPE = 52;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.LoopPartType <em>Loop Part Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.LoopPartType
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getLoopPartType()
	 * @generated
	 */
	int LOOP_PART_TYPE = 53;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.code.UnaryOperationType <em>Unary Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.code.UnaryOperationType
	 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getUnaryOperationType()
	 * @generated
	 */
	int UNARY_OPERATION_TYPE = 54;


	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see es.um.uschema.code.metamodels.code.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Code#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see es.um.uschema.code.metamodels.code.Code#getLanguage()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Code#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.Code#getContainer()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Code#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see es.um.uschema.code.metamodels.code.Code#getTypes()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Code#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception</em>'.
	 * @see es.um.uschema.code.metamodels.code.Code#getException()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_Exception();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Code#getGlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variable</em>'.
	 * @see es.um.uschema.code.metamodels.code.Code#getGlobalVariable()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_GlobalVariable();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Container#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.Container#getType()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Container#getCodeContainer <em>Code Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.Container#getCodeContainer()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_CodeContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Container#getSubContainer <em>Sub Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.Container#getSubContainer()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_SubContainer();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.code.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.CodeContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeContainer
	 * @generated
	 */
	EClass getCodeContainer();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.CodeContainer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeContainer#getType()
	 * @see #getCodeContainer()
	 * @generated
	 */
	EAttribute getCodeContainer_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.CodeContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeContainer#getName()
	 * @see #getCodeContainer()
	 * @generated
	 */
	EAttribute getCodeContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.CodeContainer#getCodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Block</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeContainer#getCodeBlock()
	 * @see #getCodeContainer()
	 * @generated
	 */
	EReference getCodeContainer_CodeBlock();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.CodeContainer#getDataContainer <em>Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeContainer#getDataContainer()
	 * @see #getCodeContainer()
	 * @generated
	 */
	EReference getCodeContainer_DataContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.CodeContainer#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeContainer#getVariable()
	 * @see #getCodeContainer()
	 * @generated
	 */
	EReference getCodeContainer_Variable();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see es.um.uschema.code.metamodels.code.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Property#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization</em>'.
	 * @see es.um.uschema.code.metamodels.code.Property#getInitialization()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Initialization();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.Property#getDataContainer <em>Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.Property#getDataContainer()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_DataContainer();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.PrimitiveType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.PrimitiveType#getType()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Type();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see es.um.uschema.code.metamodels.code.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Statement#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see es.um.uschema.code.metamodels.code.Statement#getStart()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Start();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Statement#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see es.um.uschema.code.metamodels.code.Statement#getEnd()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_End();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see es.um.uschema.code.metamodels.code.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Expression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.Expression#getType()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Expression#getConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Expression</em>'.
	 * @see es.um.uschema.code.metamodels.code.Expression#getConditionalExpression()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ConditionalExpression();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see es.um.uschema.code.metamodels.code.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Operation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.Operation#getType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Operation#getDataProducers <em>Data Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Producers</em>'.
	 * @see es.um.uschema.code.metamodels.code.Operation#getDataProducers()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_DataProducers();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see es.um.uschema.code.metamodels.code.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Loop#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.Loop#getType()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Type();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Loop#getCodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Block</em>'.
	 * @see es.um.uschema.code.metamodels.code.Loop#getCodeBlock()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_CodeBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Loop#getLoopPart <em>Loop Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Part</em>'.
	 * @see es.um.uschema.code.metamodels.code.Loop#getLoopPart()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_LoopPart();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see es.um.uschema.code.metamodels.code.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Selection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.Selection#getType()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Selection#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case</em>'.
	 * @see es.um.uschema.code.metamodels.code.Selection#getCase()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Case();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.CodeBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.CodeBlock#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeBlock#getStatements()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_Statements();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.CodeBlock#getCodeBlockType <em>Code Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Block Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeBlock#getCodeBlockType()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EAttribute getCodeBlock_CodeBlockType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.CodeBlock#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeBlock#getVariables()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_Variables();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.CodeBlock#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeBlock#getReturnType()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_ReturnType();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see es.um.uschema.code.metamodels.code.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Case#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.Case#getType()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Type();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Case#getCodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Block</em>'.
	 * @see es.um.uschema.code.metamodels.code.Case#getCodeBlock()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_CodeBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Case#getConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Expression</em>'.
	 * @see es.um.uschema.code.metamodels.code.Case#getConditionalExpression()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_ConditionalExpression();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see es.um.uschema.code.metamodels.code.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.code.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.LoopPart <em>Loop Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Part</em>'.
	 * @see es.um.uschema.code.metamodels.code.LoopPart
	 * @generated
	 */
	EClass getLoopPart();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.LoopPart#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see es.um.uschema.code.metamodels.code.LoopPart#getStatement()
	 * @see #getLoopPart()
	 * @generated
	 */
	EReference getLoopPart_Statement();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.LoopPart#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.LoopPart#getType()
	 * @see #getLoopPart()
	 * @generated
	 */
	EAttribute getLoopPart_Type();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see es.um.uschema.code.metamodels.code.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.Parameter#getCallableBlock <em>Callable Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callable Block</em>'.
	 * @see es.um.uschema.code.metamodels.code.Parameter#getCallableBlock()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_CallableBlock();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.DataContainer <em>Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.DataContainer
	 * @generated
	 */
	EClass getDataContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.DataContainer#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see es.um.uschema.code.metamodels.code.DataContainer#getProperties()
	 * @see #getDataContainer()
	 * @generated
	 */
	EReference getDataContainer_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.DataContainer#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent</em>'.
	 * @see es.um.uschema.code.metamodels.code.DataContainer#getParent()
	 * @see #getDataContainer()
	 * @generated
	 */
	EReference getDataContainer_Parent();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.DataProducer <em>Data Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Producer</em>'.
	 * @see es.um.uschema.code.metamodels.code.DataProducer
	 * @generated
	 */
	EClass getDataProducer();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.CallableBlock <em>Callable Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Block</em>'.
	 * @see es.um.uschema.code.metamodels.code.CallableBlock
	 * @generated
	 */
	EClass getCallableBlock();

	/**
	 * Returns the meta object for the reference list '{@link es.um.uschema.code.metamodels.code.CallableBlock#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see es.um.uschema.code.metamodels.code.CallableBlock#getParameters()
	 * @see #getCallableBlock()
	 * @generated
	 */
	EReference getCallableBlock_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.CallableBlock#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see es.um.uschema.code.metamodels.code.CallableBlock#getFunctionName()
	 * @see #getCallableBlock()
	 * @generated
	 */
	EAttribute getCallableBlock_FunctionName();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see es.um.uschema.code.metamodels.code.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Exception#getExceptionName <em>Exception Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Name</em>'.
	 * @see es.um.uschema.code.metamodels.code.Exception#getExceptionName()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_ExceptionName();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see es.um.uschema.code.metamodels.code.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Return#getDataProducers <em>Data Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Producers</em>'.
	 * @see es.um.uschema.code.metamodels.code.Return#getDataProducers()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_DataProducers();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Throw <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw</em>'.
	 * @see es.um.uschema.code.metamodels.code.Throw
	 * @generated
	 */
	EClass getThrow();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.Throw#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception</em>'.
	 * @see es.um.uschema.code.metamodels.code.Throw#getException()
	 * @see #getThrow()
	 * @generated
	 */
	EReference getThrow_Exception();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Throw#getDataProducer <em>Data Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Producer</em>'.
	 * @see es.um.uschema.code.metamodels.code.Throw#getDataProducer()
	 * @see #getThrow()
	 * @generated
	 */
	EReference getThrow_DataProducer();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.NewDataContainer <em>New Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Data Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.NewDataContainer
	 * @generated
	 */
	EClass getNewDataContainer();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.NewDataContainer#getDataContainer <em>Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.NewDataContainer#getDataContainer()
	 * @see #getNewDataContainer()
	 * @generated
	 */
	EReference getNewDataContainer_DataContainer();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see es.um.uschema.code.metamodels.code.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Assign#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see es.um.uschema.code.metamodels.code.Assign#getOutputs()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Outputs();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.Assign#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see es.um.uschema.code.metamodels.code.Assign#getVariable()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Assign#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see es.um.uschema.code.metamodels.code.Assign#getInputs()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Inputs();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Assign#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.Assign#getType()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Assign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.code.Assign#getName()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Name();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Assignable <em>Assignable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignable</em>'.
	 * @see es.um.uschema.code.metamodels.code.Assignable
	 * @generated
	 */
	EClass getAssignable();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see es.um.uschema.code.metamodels.code.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.IndexBasedAccess <em>Index Based Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Based Access</em>'.
	 * @see es.um.uschema.code.metamodels.code.IndexBasedAccess
	 * @generated
	 */
	EClass getIndexBasedAccess();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.IndexBasedAccess#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see es.um.uschema.code.metamodels.code.IndexBasedAccess#getVariable()
	 * @see #getIndexBasedAccess()
	 * @generated
	 */
	EReference getIndexBasedAccess_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.IndexBasedAccess#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see es.um.uschema.code.metamodels.code.IndexBasedAccess#getIndex()
	 * @see #getIndexBasedAccess()
	 * @generated
	 */
	EReference getIndexBasedAccess_Index();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.IndexBasedAccess#getDataProducer <em>Data Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Producer</em>'.
	 * @see es.um.uschema.code.metamodels.code.IndexBasedAccess#getDataProducer()
	 * @see #getIndexBasedAccess()
	 * @generated
	 */
	EReference getIndexBasedAccess_DataProducer();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see es.um.uschema.code.metamodels.code.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.VariableDeclaration#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see es.um.uschema.code.metamodels.code.VariableDeclaration#getVariable()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.VariableDeclaration#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialization</em>'.
	 * @see es.um.uschema.code.metamodels.code.VariableDeclaration#getInitialization()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Initialization();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.VariableDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.code.VariableDeclaration#getName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.VariableDeclaration#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see es.um.uschema.code.metamodels.code.VariableDeclaration#getKind()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Kind();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see es.um.uschema.code.metamodels.code.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Literal#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see es.um.uschema.code.metamodels.code.Literal#getLiteral()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Literal();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.Literal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.Literal#getType()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_Type();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.UnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operation</em>'.
	 * @see es.um.uschema.code.metamodels.code.UnaryOperation
	 * @generated
	 */
	EClass getUnaryOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.UnaryOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.UnaryOperation#getType()
	 * @see #getUnaryOperation()
	 * @generated
	 */
	EAttribute getUnaryOperation_Type();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.UnaryOperation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see es.um.uschema.code.metamodels.code.UnaryOperation#getVariable()
	 * @see #getUnaryOperation()
	 * @generated
	 */
	EReference getUnaryOperation_Variable();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.VariableAccess <em>Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Access</em>'.
	 * @see es.um.uschema.code.metamodels.code.VariableAccess
	 * @generated
	 */
	EClass getVariableAccess();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.VariableAccess#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see es.um.uschema.code.metamodels.code.VariableAccess#getVariable()
	 * @see #getVariableAccess()
	 * @generated
	 */
	EReference getVariableAccess_Variable();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.VariableAccess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.code.VariableAccess#getName()
	 * @see #getVariableAccess()
	 * @generated
	 */
	EAttribute getVariableAccess_Name();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see es.um.uschema.code.metamodels.code.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Try <em>Try</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try</em>'.
	 * @see es.um.uschema.code.metamodels.code.Try
	 * @generated
	 */
	EClass getTry();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Try#getCatchs <em>Catchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catchs</em>'.
	 * @see es.um.uschema.code.metamodels.code.Try#getCatchs()
	 * @see #getTry()
	 * @generated
	 */
	EReference getTry_Catchs();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Try#getCodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Block</em>'.
	 * @see es.um.uschema.code.metamodels.code.Try#getCodeBlock()
	 * @see #getTry()
	 * @generated
	 */
	EReference getTry_CodeBlock();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Try#getFinally <em>Finally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finally</em>'.
	 * @see es.um.uschema.code.metamodels.code.Try#getFinally()
	 * @see #getTry()
	 * @generated
	 */
	EReference getTry_Finally();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Catch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch</em>'.
	 * @see es.um.uschema.code.metamodels.code.Catch
	 * @generated
	 */
	EClass getCatch();

	/**
	 * Returns the meta object for the reference list '{@link es.um.uschema.code.metamodels.code.Catch#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exception</em>'.
	 * @see es.um.uschema.code.metamodels.code.Catch#getException()
	 * @see #getCatch()
	 * @generated
	 */
	EReference getCatch_Exception();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Catch#getCodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Block</em>'.
	 * @see es.um.uschema.code.metamodels.code.Catch#getCodeBlock()
	 * @see #getCatch()
	 * @generated
	 */
	EReference getCatch_CodeBlock();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Catch#getDataProducer <em>Data Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Producer</em>'.
	 * @see es.um.uschema.code.metamodels.code.Catch#getDataProducer()
	 * @see #getCatch()
	 * @generated
	 */
	EReference getCatch_DataProducer();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see es.um.uschema.code.metamodels.code.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.Call#getCallableBlock <em>Callable Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callable Block</em>'.
	 * @see es.um.uschema.code.metamodels.code.Call#getCallableBlock()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_CallableBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.Call#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see es.um.uschema.code.metamodels.code.Call#getArguments()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Call#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.code.Call#getName()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Call#getDataProducer <em>Data Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Producer</em>'.
	 * @see es.um.uschema.code.metamodels.code.Call#getDataProducer()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_DataProducer();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see es.um.uschema.code.metamodels.code.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Argument#getDataProducer <em>Data Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Producer</em>'.
	 * @see es.um.uschema.code.metamodels.code.Argument#getDataProducer()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_DataProducer();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.Argument#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see es.um.uschema.code.metamodels.code.Argument#getParameter()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.code.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.PropertyAccess <em>Property Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Access</em>'.
	 * @see es.um.uschema.code.metamodels.code.PropertyAccess
	 * @generated
	 */
	EClass getPropertyAccess();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.PropertyAccess#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see es.um.uschema.code.metamodels.code.PropertyAccess#getProperty()
	 * @see #getPropertyAccess()
	 * @generated
	 */
	EReference getPropertyAccess_Property();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.PropertyAccess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.code.PropertyAccess#getName()
	 * @see #getPropertyAccess()
	 * @generated
	 */
	EAttribute getPropertyAccess_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.PropertyAccess#getNextAccess <em>Next Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Access</em>'.
	 * @see es.um.uschema.code.metamodels.code.PropertyAccess#getNextAccess()
	 * @see #getPropertyAccess()
	 * @generated
	 */
	EReference getPropertyAccess_NextAccess();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.PropertyAccess#getDataProducer <em>Data Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Producer</em>'.
	 * @see es.um.uschema.code.metamodels.code.PropertyAccess#getDataProducer()
	 * @see #getPropertyAccess()
	 * @generated
	 */
	EReference getPropertyAccess_DataProducer();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.PropertyAssign <em>Property Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Assign</em>'.
	 * @see es.um.uschema.code.metamodels.code.PropertyAssign
	 * @generated
	 */
	EClass getPropertyAssign();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.PropertyAssign#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see es.um.uschema.code.metamodels.code.PropertyAssign#getProperty()
	 * @see #getPropertyAssign()
	 * @generated
	 */
	EReference getPropertyAssign_Property();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break</em>'.
	 * @see es.um.uschema.code.metamodels.code.Break
	 * @generated
	 */
	EClass getBreak();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.NewArray <em>New Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Array</em>'.
	 * @see es.um.uschema.code.metamodels.code.NewArray
	 * @generated
	 */
	EClass getNewArray();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.NewArray#getDataProducer <em>Data Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Producer</em>'.
	 * @see es.um.uschema.code.metamodels.code.NewArray#getDataProducer()
	 * @see #getNewArray()
	 * @generated
	 */
	EReference getNewArray_DataProducer();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.NewClass <em>New Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Class</em>'.
	 * @see es.um.uschema.code.metamodels.code.NewClass
	 * @generated
	 */
	EClass getNewClass();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.code.NewClass#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see es.um.uschema.code.metamodels.code.NewClass#getArguments()
	 * @see #getNewClass()
	 * @generated
	 */
	EReference getNewClass_Arguments();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.NewClass#getCodeContainer <em>Code Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.NewClass#getCodeContainer()
	 * @see #getNewClass()
	 * @generated
	 */
	EReference getNewClass_CodeContainer();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.NewClass#getCallableBlock <em>Callable Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callable Block</em>'.
	 * @see es.um.uschema.code.metamodels.code.NewClass#getCallableBlock()
	 * @see #getNewClass()
	 * @generated
	 */
	EReference getNewClass_CallableBlock();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.This <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This</em>'.
	 * @see es.um.uschema.code.metamodels.code.This
	 * @generated
	 */
	EClass getThis();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.code.This#getDataContainer <em>Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Container</em>'.
	 * @see es.um.uschema.code.metamodels.code.This#getDataContainer()
	 * @see #getThis()
	 * @generated
	 */
	EReference getThis_DataContainer();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see es.um.uschema.code.metamodels.code.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see es.um.uschema.code.metamodels.code.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.UnaryExpression#getDataProducer <em>Data Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Producer</em>'.
	 * @see es.um.uschema.code.metamodels.code.UnaryExpression#getDataProducer()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_DataProducer();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.Finally <em>Finally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finally</em>'.
	 * @see es.um.uschema.code.metamodels.code.Finally
	 * @generated
	 */
	EClass getFinally();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.code.Finally#getCodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Block</em>'.
	 * @see es.um.uschema.code.metamodels.code.Finally#getCodeBlock()
	 * @see #getFinally()
	 * @generated
	 */
	EReference getFinally_CodeBlock();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.code.CodeLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeLocation
	 * @generated
	 */
	EClass getCodeLocation();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.CodeLocation#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeLocation#getLine()
	 * @see #getCodeLocation()
	 * @generated
	 */
	EAttribute getCodeLocation_Line();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.code.CodeLocation#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeLocation#getColumn()
	 * @see #getCodeLocation()
	 * @generated
	 */
	EAttribute getCodeLocation_Column();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.code.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.code.LoopType <em>Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loop Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.LoopType
	 * @generated
	 */
	EEnum getLoopType();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.code.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.ContainerType
	 * @generated
	 */
	EEnum getContainerType();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.code.CodeContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeContainerType
	 * @generated
	 */
	EEnum getCodeContainerType();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.code.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.ExpressionType
	 * @generated
	 */
	EEnum getExpressionType();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.code.CaseType <em>Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.CaseType
	 * @generated
	 */
	EEnum getCaseType();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.code.SelectionType <em>Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Selection Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.SelectionType
	 * @generated
	 */
	EEnum getSelectionType();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.code.CodeBlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Block Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.CodeBlockType
	 * @generated
	 */
	EEnum getCodeBlockType();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.code.LoopPartType <em>Loop Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loop Part Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.LoopPartType
	 * @generated
	 */
	EEnum getLoopPartType();

	/**
	 * Returns the meta object for enum '{@link es.um.uschema.code.metamodels.code.UnaryOperationType <em>Unary Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operation Type</em>'.
	 * @see es.um.uschema.code.metamodels.code.UnaryOperationType
	 * @generated
	 */
	EEnum getUnaryOperationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeFactory getCodeFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.CodeImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__LANGUAGE = eINSTANCE.getCode_Language();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__CONTAINER = eINSTANCE.getCode_Container();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__TYPES = eINSTANCE.getCode_Types();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__EXCEPTION = eINSTANCE.getCode_Exception();

		/**
		 * The meta object literal for the '<em><b>Global Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__GLOBAL_VARIABLE = eINSTANCE.getCode_GlobalVariable();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.ContainerImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__TYPE = eINSTANCE.getContainer_Type();

		/**
		 * The meta object literal for the '<em><b>Code Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CODE_CONTAINER = eINSTANCE.getContainer_CodeContainer();

		/**
		 * The meta object literal for the '<em><b>Sub Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__SUB_CONTAINER = eINSTANCE.getContainer_SubContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.CodeContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.CodeContainerImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCodeContainer()
		 * @generated
		 */
		EClass CODE_CONTAINER = eINSTANCE.getCodeContainer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CONTAINER__TYPE = eINSTANCE.getCodeContainer_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CONTAINER__NAME = eINSTANCE.getCodeContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Code Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_CONTAINER__CODE_BLOCK = eINSTANCE.getCodeContainer_CodeBlock();

		/**
		 * The meta object literal for the '<em><b>Data Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_CONTAINER__DATA_CONTAINER = eINSTANCE.getCodeContainer_DataContainer();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_CONTAINER__VARIABLE = eINSTANCE.getCodeContainer_Variable();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.PropertyImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__INITIALIZATION = eINSTANCE.getProperty_Initialization();

		/**
		 * The meta object literal for the '<em><b>Data Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DATA_CONTAINER = eINSTANCE.getProperty_DataContainer();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.TypeImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.PrimitiveTypeImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPE = eINSTANCE.getPrimitiveType_Type();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.StatementImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__START = eINSTANCE.getStatement_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__END = eINSTANCE.getStatement_End();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.ExpressionImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__TYPE = eINSTANCE.getExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Conditional Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__CONDITIONAL_EXPRESSION = eINSTANCE.getExpression_ConditionalExpression();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.OperationImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__TYPE = eINSTANCE.getOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Data Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__DATA_PRODUCERS = eINSTANCE.getOperation_DataProducers();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.LoopImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__TYPE = eINSTANCE.getLoop_Type();

		/**
		 * The meta object literal for the '<em><b>Code Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__CODE_BLOCK = eINSTANCE.getLoop_CodeBlock();

		/**
		 * The meta object literal for the '<em><b>Loop Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__LOOP_PART = eINSTANCE.getLoop_LoopPart();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.SelectionImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__TYPE = eINSTANCE.getSelection_Type();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__CASE = eINSTANCE.getSelection_Case();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.CodeBlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.CodeBlockImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__STATEMENTS = eINSTANCE.getCodeBlock_Statements();

		/**
		 * The meta object literal for the '<em><b>Code Block Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_BLOCK__CODE_BLOCK_TYPE = eINSTANCE.getCodeBlock_CodeBlockType();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__VARIABLES = eINSTANCE.getCodeBlock_Variables();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__RETURN_TYPE = eINSTANCE.getCodeBlock_ReturnType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.CaseImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__TYPE = eINSTANCE.getCase_Type();

		/**
		 * The meta object literal for the '<em><b>Code Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CODE_BLOCK = eINSTANCE.getCase_CodeBlock();

		/**
		 * The meta object literal for the '<em><b>Conditional Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CONDITIONAL_EXPRESSION = eINSTANCE.getCase_ConditionalExpression();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.VariableImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.LoopPartImpl <em>Loop Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.LoopPartImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getLoopPart()
		 * @generated
		 */
		EClass LOOP_PART = eINSTANCE.getLoopPart();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_PART__STATEMENT = eINSTANCE.getLoopPart_Statement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_PART__TYPE = eINSTANCE.getLoopPart_Type();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.ParameterImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Callable Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__CALLABLE_BLOCK = eINSTANCE.getParameter_CallableBlock();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.DataContainerImpl <em>Data Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.DataContainerImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getDataContainer()
		 * @generated
		 */
		EClass DATA_CONTAINER = eINSTANCE.getDataContainer();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTAINER__PROPERTIES = eINSTANCE.getDataContainer_Properties();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTAINER__PARENT = eINSTANCE.getDataContainer_Parent();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.DataProducerImpl <em>Data Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.DataProducerImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getDataProducer()
		 * @generated
		 */
		EClass DATA_PRODUCER = eINSTANCE.getDataProducer();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.CallableBlockImpl <em>Callable Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.CallableBlockImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCallableBlock()
		 * @generated
		 */
		EClass CALLABLE_BLOCK = eINSTANCE.getCallableBlock();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_BLOCK__PARAMETERS = eINSTANCE.getCallableBlock_Parameters();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE_BLOCK__FUNCTION_NAME = eINSTANCE.getCallableBlock_FunctionName();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.ExceptionImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em><b>Exception Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__EXCEPTION_NAME = eINSTANCE.getException_ExceptionName();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.ReturnImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Data Producers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__DATA_PRODUCERS = eINSTANCE.getReturn_DataProducers();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.ThrowImpl <em>Throw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.ThrowImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getThrow()
		 * @generated
		 */
		EClass THROW = eINSTANCE.getThrow();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW__EXCEPTION = eINSTANCE.getThrow_Exception();

		/**
		 * The meta object literal for the '<em><b>Data Producer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW__DATA_PRODUCER = eINSTANCE.getThrow_DataProducer();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.NewDataContainerImpl <em>New Data Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.NewDataContainerImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getNewDataContainer()
		 * @generated
		 */
		EClass NEW_DATA_CONTAINER = eINSTANCE.getNewDataContainer();

		/**
		 * The meta object literal for the '<em><b>Data Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_DATA_CONTAINER__DATA_CONTAINER = eINSTANCE.getNewDataContainer_DataContainer();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.AssignImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__OUTPUTS = eINSTANCE.getAssign_Outputs();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__VARIABLE = eINSTANCE.getAssign_Variable();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__INPUTS = eINSTANCE.getAssign_Inputs();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__TYPE = eINSTANCE.getAssign_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__NAME = eINSTANCE.getAssign_Name();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.AssignableImpl <em>Assignable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.AssignableImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getAssignable()
		 * @generated
		 */
		EClass ASSIGNABLE = eINSTANCE.getAssignable();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.ConstantImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.IndexBasedAccessImpl <em>Index Based Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.IndexBasedAccessImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getIndexBasedAccess()
		 * @generated
		 */
		EClass INDEX_BASED_ACCESS = eINSTANCE.getIndexBasedAccess();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_BASED_ACCESS__VARIABLE = eINSTANCE.getIndexBasedAccess_Variable();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_BASED_ACCESS__INDEX = eINSTANCE.getIndexBasedAccess_Index();

		/**
		 * The meta object literal for the '<em><b>Data Producer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_BASED_ACCESS__DATA_PRODUCER = eINSTANCE.getIndexBasedAccess_DataProducer();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.VariableDeclarationImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__VARIABLE = eINSTANCE.getVariableDeclaration_Variable();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__INITIALIZATION = eINSTANCE.getVariableDeclaration_Initialization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__KIND = eINSTANCE.getVariableDeclaration_Kind();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.LiteralImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__LITERAL = eINSTANCE.getLiteral_Literal();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__TYPE = eINSTANCE.getLiteral_Type();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.UnaryOperationImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getUnaryOperation()
		 * @generated
		 */
		EClass UNARY_OPERATION = eINSTANCE.getUnaryOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_OPERATION__TYPE = eINSTANCE.getUnaryOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATION__VARIABLE = eINSTANCE.getUnaryOperation_Variable();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.VariableAccessImpl <em>Variable Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.VariableAccessImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getVariableAccess()
		 * @generated
		 */
		EClass VARIABLE_ACCESS = eINSTANCE.getVariableAccess();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ACCESS__VARIABLE = eINSTANCE.getVariableAccess_Variable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ACCESS__NAME = eINSTANCE.getVariableAccess_Name();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.ConditionalExpressionImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getConditionalExpression()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.TryImpl <em>Try</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.TryImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getTry()
		 * @generated
		 */
		EClass TRY = eINSTANCE.getTry();

		/**
		 * The meta object literal for the '<em><b>Catchs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY__CATCHS = eINSTANCE.getTry_Catchs();

		/**
		 * The meta object literal for the '<em><b>Code Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY__CODE_BLOCK = eINSTANCE.getTry_CodeBlock();

		/**
		 * The meta object literal for the '<em><b>Finally</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY__FINALLY = eINSTANCE.getTry_Finally();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.CatchImpl <em>Catch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.CatchImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCatch()
		 * @generated
		 */
		EClass CATCH = eINSTANCE.getCatch();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH__EXCEPTION = eINSTANCE.getCatch_Exception();

		/**
		 * The meta object literal for the '<em><b>Code Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH__CODE_BLOCK = eINSTANCE.getCatch_CodeBlock();

		/**
		 * The meta object literal for the '<em><b>Data Producer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH__DATA_PRODUCER = eINSTANCE.getCatch_DataProducer();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.CallImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Callable Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__CALLABLE_BLOCK = eINSTANCE.getCall_CallableBlock();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__ARGUMENTS = eINSTANCE.getCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__NAME = eINSTANCE.getCall_Name();

		/**
		 * The meta object literal for the '<em><b>Data Producer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__DATA_PRODUCER = eINSTANCE.getCall_DataProducer();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.ArgumentImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Data Producer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__DATA_PRODUCER = eINSTANCE.getArgument_DataProducer();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__PARAMETER = eINSTANCE.getArgument_Parameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.PropertyAccessImpl <em>Property Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.PropertyAccessImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getPropertyAccess()
		 * @generated
		 */
		EClass PROPERTY_ACCESS = eINSTANCE.getPropertyAccess();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ACCESS__PROPERTY = eINSTANCE.getPropertyAccess_Property();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_ACCESS__NAME = eINSTANCE.getPropertyAccess_Name();

		/**
		 * The meta object literal for the '<em><b>Next Access</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ACCESS__NEXT_ACCESS = eINSTANCE.getPropertyAccess_NextAccess();

		/**
		 * The meta object literal for the '<em><b>Data Producer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ACCESS__DATA_PRODUCER = eINSTANCE.getPropertyAccess_DataProducer();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.PropertyAssignImpl <em>Property Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.PropertyAssignImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getPropertyAssign()
		 * @generated
		 */
		EClass PROPERTY_ASSIGN = eINSTANCE.getPropertyAssign();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSIGN__PROPERTY = eINSTANCE.getPropertyAssign_Property();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.BreakImpl <em>Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.BreakImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getBreak()
		 * @generated
		 */
		EClass BREAK = eINSTANCE.getBreak();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.NewArrayImpl <em>New Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.NewArrayImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getNewArray()
		 * @generated
		 */
		EClass NEW_ARRAY = eINSTANCE.getNewArray();

		/**
		 * The meta object literal for the '<em><b>Data Producer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_ARRAY__DATA_PRODUCER = eINSTANCE.getNewArray_DataProducer();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.NewClassImpl <em>New Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.NewClassImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getNewClass()
		 * @generated
		 */
		EClass NEW_CLASS = eINSTANCE.getNewClass();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_CLASS__ARGUMENTS = eINSTANCE.getNewClass_Arguments();

		/**
		 * The meta object literal for the '<em><b>Code Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_CLASS__CODE_CONTAINER = eINSTANCE.getNewClass_CodeContainer();

		/**
		 * The meta object literal for the '<em><b>Callable Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_CLASS__CALLABLE_BLOCK = eINSTANCE.getNewClass_CallableBlock();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.ThisImpl <em>This</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.ThisImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getThis()
		 * @generated
		 */
		EClass THIS = eINSTANCE.getThis();

		/**
		 * The meta object literal for the '<em><b>Data Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIS__DATA_CONTAINER = eINSTANCE.getThis_DataContainer();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.UnaryExpressionImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Data Producer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__DATA_PRODUCER = eINSTANCE.getUnaryExpression_DataProducer();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.FinallyImpl <em>Finally</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.FinallyImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getFinally()
		 * @generated
		 */
		EClass FINALLY = eINSTANCE.getFinally();

		/**
		 * The meta object literal for the '<em><b>Code Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALLY__CODE_BLOCK = eINSTANCE.getFinally_CodeBlock();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.impl.CodeLocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.impl.CodeLocationImpl
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCodeLocation()
		 * @generated
		 */
		EClass CODE_LOCATION = eINSTANCE.getCodeLocation();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_LOCATION__LINE = eINSTANCE.getCodeLocation_Line();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_LOCATION__COLUMN = eINSTANCE.getCodeLocation_Column();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.OperationType
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.LoopType <em>Loop Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.LoopType
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getLoopType()
		 * @generated
		 */
		EEnum LOOP_TYPE = eINSTANCE.getLoopType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.ContainerType <em>Container Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.ContainerType
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getContainerType()
		 * @generated
		 */
		EEnum CONTAINER_TYPE = eINSTANCE.getContainerType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.CodeContainerType <em>Container Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.CodeContainerType
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCodeContainerType()
		 * @generated
		 */
		EEnum CODE_CONTAINER_TYPE = eINSTANCE.getCodeContainerType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.ExpressionType <em>Expression Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.ExpressionType
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getExpressionType()
		 * @generated
		 */
		EEnum EXPRESSION_TYPE = eINSTANCE.getExpressionType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.CaseType <em>Case Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.CaseType
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCaseType()
		 * @generated
		 */
		EEnum CASE_TYPE = eINSTANCE.getCaseType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.SelectionType <em>Selection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.SelectionType
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getSelectionType()
		 * @generated
		 */
		EEnum SELECTION_TYPE = eINSTANCE.getSelectionType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.CodeBlockType <em>Block Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.CodeBlockType
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getCodeBlockType()
		 * @generated
		 */
		EEnum CODE_BLOCK_TYPE = eINSTANCE.getCodeBlockType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.LoopPartType <em>Loop Part Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.LoopPartType
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getLoopPartType()
		 * @generated
		 */
		EEnum LOOP_PART_TYPE = eINSTANCE.getLoopPartType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.code.UnaryOperationType <em>Unary Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.code.UnaryOperationType
		 * @see es.um.uschema.code.metamodels.code.impl.CodePackageImpl#getUnaryOperationType()
		 * @generated
		 */
		EEnum UNARY_OPERATION_TYPE = eINSTANCE.getUnaryOperationType();

	}

} //CodePackage
