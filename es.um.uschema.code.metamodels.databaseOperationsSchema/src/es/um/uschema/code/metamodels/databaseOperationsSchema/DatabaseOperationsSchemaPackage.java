/**
 */
package es.um.uschema.code.metamodels.databaseOperationsSchema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaFactory
 * @model kind="package"
 * @generated
 */
public interface DatabaseOperationsSchemaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "databaseOperationsSchema";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.um.uschema.code.metamodels/dboSchema";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "databaseOperationsSchema";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabaseOperationsSchemaPackage eINSTANCE = es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaImpl <em>Database Operations Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getDatabaseOperationsSchema()
	 * @generated
	 */
	int DATABASE_OPERATIONS_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Database Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATIONS_SCHEMA__DATABASE_OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATIONS_SCHEMA__CONTAINERS = 1;

	/**
	 * The number of structural features of the '<em>Database Operations Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATIONS_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Database Operations Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATIONS_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationImpl <em>Database Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getDatabaseOperation()
	 * @generated
	 */
	int DATABASE_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Following Database Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Preceding Database Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION__CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION__STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Targeting Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION__TARGETING_PARAMETER = 4;

	/**
	 * The number of structural features of the '<em>Database Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Database Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DataStructureImpl <em>Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DataStructureImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getDataStructure()
	 * @generated
	 */
	int DATA_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.FieldImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Duplicated Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DUPLICATED_FIELD = 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.TypeImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getType()
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
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.AttributeImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ReferenceImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Target Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET_CONTAINER = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET_FIELD = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE_TYPE = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ContainerImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Data Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DATA_STRUCTURES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.CompositionImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 8;

	/**
	 * The feature id for the '<em><b>Data Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__DATA_STRUCTURE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ReadImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getRead()
	 * @generated
	 */
	int READ = 9;

	/**
	 * The feature id for the '<em><b>Following Database Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__FOLLOWING_DATABASE_OPERATION = DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Preceding Database Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__PRECEDING_DATABASE_OPERATION = DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__CONTAINER = DATABASE_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__STATEMENT = DATABASE_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Targeting Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__TARGETING_PARAMETER = DATABASE_OPERATION__TARGETING_PARAMETER;

	/**
	 * The feature id for the '<em><b>Result Data Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__RESULT_DATA_STRUCTURE = DATABASE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = DATABASE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION_COUNT = DATABASE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.InsertImpl <em>Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.InsertImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getInsert()
	 * @generated
	 */
	int INSERT = 10;

	/**
	 * The feature id for the '<em><b>Following Database Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__FOLLOWING_DATABASE_OPERATION = DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Preceding Database Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__PRECEDING_DATABASE_OPERATION = DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__CONTAINER = DATABASE_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__STATEMENT = DATABASE_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Targeting Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__TARGETING_PARAMETER = DATABASE_OPERATION__TARGETING_PARAMETER;

	/**
	 * The feature id for the '<em><b>Insert Data Structure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__INSERT_DATA_STRUCTURE = DATABASE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_FEATURE_COUNT = DATABASE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_OPERATION_COUNT = DATABASE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.UpdateImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 11;

	/**
	 * The feature id for the '<em><b>Following Database Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__FOLLOWING_DATABASE_OPERATION = DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Preceding Database Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__PRECEDING_DATABASE_OPERATION = DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__CONTAINER = DATABASE_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__STATEMENT = DATABASE_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Targeting Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__TARGETING_PARAMETER = DATABASE_OPERATION__TARGETING_PARAMETER;

	/**
	 * The feature id for the '<em><b>Update Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__UPDATE_PARAMETER = DATABASE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = DATABASE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = DATABASE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DeleteImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 12;

	/**
	 * The feature id for the '<em><b>Following Database Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__FOLLOWING_DATABASE_OPERATION = DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Preceding Database Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__PRECEDING_DATABASE_OPERATION = DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CONTAINER = DATABASE_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__STATEMENT = DATABASE_OPERATION__STATEMENT;

	/**
	 * The feature id for the '<em><b>Targeting Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__TARGETING_PARAMETER = DATABASE_OPERATION__TARGETING_PARAMETER;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = DATABASE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = DATABASE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.OperationParameterImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getOperationParameter()
	 * @generated
	 */
	int OPERATION_PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Parameter Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER__PARAMETER_FIELDS = 0;

	/**
	 * The number of structural features of the '<em>Operation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.CollectionImpl
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 14;

	/**
	 * The feature id for the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__COLLECTION_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__TYPES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchema <em>Database Operations Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Operations Schema</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchema
	 * @generated
	 */
	EClass getDatabaseOperationsSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchema#getDatabaseOperations <em>Database Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database Operations</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchema#getDatabaseOperations()
	 * @see #getDatabaseOperationsSchema()
	 * @generated
	 */
	EReference getDatabaseOperationsSchema_DatabaseOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchema#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchema#getContainers()
	 * @see #getDatabaseOperationsSchema()
	 * @generated
	 */
	EReference getDatabaseOperationsSchema_Containers();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation <em>Database Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Operation</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation
	 * @generated
	 */
	EClass getDatabaseOperation();

	/**
	 * Returns the meta object for the reference list '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation#getFollowingDatabaseOperation <em>Following Database Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Following Database Operation</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation#getFollowingDatabaseOperation()
	 * @see #getDatabaseOperation()
	 * @generated
	 */
	EReference getDatabaseOperation_FollowingDatabaseOperation();

	/**
	 * Returns the meta object for the reference list '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation#getPrecedingDatabaseOperation <em>Preceding Database Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preceding Database Operation</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation#getPrecedingDatabaseOperation()
	 * @see #getDatabaseOperation()
	 * @generated
	 */
	EReference getDatabaseOperation_PrecedingDatabaseOperation();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation#getContainer()
	 * @see #getDatabaseOperation()
	 * @generated
	 */
	EReference getDatabaseOperation_Container();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation#getStatement()
	 * @see #getDatabaseOperation()
	 * @generated
	 */
	EReference getDatabaseOperation_Statement();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation#getTargetingParameter <em>Targeting Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Targeting Parameter</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation#getTargetingParameter()
	 * @see #getDatabaseOperation()
	 * @generated
	 */
	EReference getDatabaseOperation_TargetingParameter();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Structure</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure
	 * @generated
	 */
	EClass getDataStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure#getFields()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_Fields();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure#getContainer()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_Container();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Field#getDuplicatedField <em>Duplicated Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duplicated Field</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Field#getDuplicatedField()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_DuplicatedField();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getTargetContainer <em>Target Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Container</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getTargetContainer()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_TargetContainer();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getTargetField <em>Target Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Field</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getTargetField()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_TargetField();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Type</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Reference#getReferenceType()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ReferenceType();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Container#getDataStructures <em>Data Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Structures</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Container#getDataStructures()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_DataStructures();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Composition#getDataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Structure</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Composition#getDataStructure()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_DataStructure();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for the reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Read#getResultDataStructure <em>Result Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Data Structure</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Read#getResultDataStructure()
	 * @see #getRead()
	 * @generated
	 */
	EReference getRead_ResultDataStructure();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Insert
	 * @generated
	 */
	EClass getInsert();

	/**
	 * Returns the meta object for the reference list '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Insert#getInsertDataStructure <em>Insert Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Insert Data Structure</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Insert#getInsertDataStructure()
	 * @see #getInsert()
	 * @generated
	 */
	EReference getInsert_InsertDataStructure();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Update#getUpdateParameter <em>Update Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Parameter</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Update#getUpdateParameter()
	 * @see #getUpdate()
	 * @generated
	 */
	EReference getUpdate_UpdateParameter();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.OperationParameter <em>Operation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Parameter</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.OperationParameter
	 * @generated
	 */
	EClass getOperationParameter();

	/**
	 * Returns the meta object for the reference list '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.OperationParameter#getParameterFields <em>Parameter Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Fields</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.OperationParameter#getParameterFields()
	 * @see #getOperationParameter()
	 * @generated
	 */
	EReference getOperationParameter_ParameterFields();

	/**
	 * Returns the meta object for class '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the attribute '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Collection#getCollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Type</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Collection#getCollectionType()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_CollectionType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.Collection#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.Collection#getTypes()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Types();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabaseOperationsSchemaFactory getDatabaseOperationsSchemaFactory();

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
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaImpl <em>Database Operations Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getDatabaseOperationsSchema()
		 * @generated
		 */
		EClass DATABASE_OPERATIONS_SCHEMA = eINSTANCE.getDatabaseOperationsSchema();

		/**
		 * The meta object literal for the '<em><b>Database Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_OPERATIONS_SCHEMA__DATABASE_OPERATIONS = eINSTANCE.getDatabaseOperationsSchema_DatabaseOperations();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_OPERATIONS_SCHEMA__CONTAINERS = eINSTANCE.getDatabaseOperationsSchema_Containers();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationImpl <em>Database Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getDatabaseOperation()
		 * @generated
		 */
		EClass DATABASE_OPERATION = eINSTANCE.getDatabaseOperation();

		/**
		 * The meta object literal for the '<em><b>Following Database Operation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION = eINSTANCE.getDatabaseOperation_FollowingDatabaseOperation();

		/**
		 * The meta object literal for the '<em><b>Preceding Database Operation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION = eINSTANCE.getDatabaseOperation_PrecedingDatabaseOperation();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_OPERATION__CONTAINER = eINSTANCE.getDatabaseOperation_Container();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_OPERATION__STATEMENT = eINSTANCE.getDatabaseOperation_Statement();

		/**
		 * The meta object literal for the '<em><b>Targeting Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_OPERATION__TARGETING_PARAMETER = eINSTANCE.getDatabaseOperation_TargetingParameter();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DataStructureImpl <em>Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DataStructureImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getDataStructure()
		 * @generated
		 */
		EClass DATA_STRUCTURE = eINSTANCE.getDataStructure();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__FIELDS = eINSTANCE.getDataStructure_Fields();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__CONTAINER = eINSTANCE.getDataStructure_Container();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.FieldImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Duplicated Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__DUPLICATED_FIELD = eINSTANCE.getField_DuplicatedField();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.TypeImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.AttributeImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ReferenceImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Target Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TARGET_CONTAINER = eINSTANCE.getReference_TargetContainer();

		/**
		 * The meta object literal for the '<em><b>Target Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TARGET_FIELD = eINSTANCE.getReference_TargetField();

		/**
		 * The meta object literal for the '<em><b>Reference Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REFERENCE_TYPE = eINSTANCE.getReference_ReferenceType();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ContainerImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Data Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__DATA_STRUCTURES = eINSTANCE.getContainer_DataStructures();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.CompositionImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Data Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__DATA_STRUCTURE = eINSTANCE.getComposition_DataStructure();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.ReadImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '<em><b>Result Data Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ__RESULT_DATA_STRUCTURE = eINSTANCE.getRead_ResultDataStructure();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.InsertImpl <em>Insert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.InsertImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getInsert()
		 * @generated
		 */
		EClass INSERT = eINSTANCE.getInsert();

		/**
		 * The meta object literal for the '<em><b>Insert Data Structure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT__INSERT_DATA_STRUCTURE = eINSTANCE.getInsert_InsertDataStructure();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.UpdateImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '<em><b>Update Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE__UPDATE_PARAMETER = eINSTANCE.getUpdate_UpdateParameter();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DeleteImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.OperationParameterImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getOperationParameter()
		 * @generated
		 */
		EClass OPERATION_PARAMETER = eINSTANCE.getOperationParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PARAMETER__PARAMETER_FIELDS = eINSTANCE.getOperationParameter_ParameterFields();

		/**
		 * The meta object literal for the '{@link es.um.uschema.code.metamodels.databaseOperationsSchema.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.CollectionImpl
		 * @see es.um.uschema.code.metamodels.databaseOperationsSchema.impl.DatabaseOperationsSchemaPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Collection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__COLLECTION_TYPE = eINSTANCE.getCollection_CollectionType();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__TYPES = eINSTANCE.getCollection_Types();

	}

} //DatabaseOperationsSchemaPackage
