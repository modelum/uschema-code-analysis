/**
 */
package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.impl;

import es.um.nosql.code.s13e.metamodels.code.CodePackage;

import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Attribute;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Collection;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Composition;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DataStructure;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchema;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaFactory;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Delete;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Insert;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.OperationParameter;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Read;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Type;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Update;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseOperationsSchemaPackageImpl extends EPackageImpl implements DatabaseOperationsSchemaPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseOperationsSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

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
	 * @see es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseOperationsSchemaPackageImpl()
	{
		super(eNS_URI, DatabaseOperationsSchemaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatabaseOperationsSchemaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatabaseOperationsSchemaPackage init()
	{
		if (isInited) return (DatabaseOperationsSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(DatabaseOperationsSchemaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatabaseOperationsSchemaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatabaseOperationsSchemaPackageImpl theDatabaseOperationsSchemaPackage = registeredDatabaseOperationsSchemaPackage instanceof DatabaseOperationsSchemaPackageImpl ? (DatabaseOperationsSchemaPackageImpl)registeredDatabaseOperationsSchemaPackage : new DatabaseOperationsSchemaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CodePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatabaseOperationsSchemaPackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseOperationsSchemaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseOperationsSchemaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatabaseOperationsSchemaPackage.eNS_URI, theDatabaseOperationsSchemaPackage);
		return theDatabaseOperationsSchemaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseOperationsSchema()
	{
		return databaseOperationsSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseOperationsSchema_DatabaseOperations()
	{
		return (EReference)databaseOperationsSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseOperationsSchema_Containers()
	{
		return (EReference)databaseOperationsSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseOperation()
	{
		return databaseOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseOperation_FollowingDatabaseOperation()
	{
		return (EReference)databaseOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseOperation_PrecedingDatabaseOperation()
	{
		return (EReference)databaseOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseOperation_Container()
	{
		return (EReference)databaseOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseOperation_Statement()
	{
		return (EReference)databaseOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseOperation_TargetingParameter()
	{
		return (EReference)databaseOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataStructure()
	{
		return dataStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataStructure_Fields()
	{
		return (EReference)dataStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataStructure_Container()
	{
		return (EReference)dataStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getField()
	{
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getField_Type()
	{
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Name()
	{
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getField_DuplicatedField()
	{
		return (EReference)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType()
	{
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute()
	{
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Name()
	{
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference()
	{
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_TargetContainer()
	{
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_TargetField()
	{
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_ReferenceType()
	{
		return (EReference)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer()
	{
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_DataStructures()
	{
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Name()
	{
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposition()
	{
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposition_DataStructure()
	{
		return (EReference)compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRead()
	{
		return readEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRead_ResultDataStructure()
	{
		return (EReference)readEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInsert()
	{
		return insertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsert_InsertDataStructure()
	{
		return (EReference)insertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdate()
	{
		return updateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdate_UpdateParameter()
	{
		return (EReference)updateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelete()
	{
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationParameter()
	{
		return operationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationParameter_ParameterFields()
	{
		return (EReference)operationParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollection()
	{
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollection_CollectionType()
	{
		return (EAttribute)collectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollection_Types()
	{
		return (EReference)collectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseOperationsSchemaFactory getDatabaseOperationsSchemaFactory()
	{
		return (DatabaseOperationsSchemaFactory)getEFactoryInstance();
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
		databaseOperationsSchemaEClass = createEClass(DATABASE_OPERATIONS_SCHEMA);
		createEReference(databaseOperationsSchemaEClass, DATABASE_OPERATIONS_SCHEMA__DATABASE_OPERATIONS);
		createEReference(databaseOperationsSchemaEClass, DATABASE_OPERATIONS_SCHEMA__CONTAINERS);

		databaseOperationEClass = createEClass(DATABASE_OPERATION);
		createEReference(databaseOperationEClass, DATABASE_OPERATION__FOLLOWING_DATABASE_OPERATION);
		createEReference(databaseOperationEClass, DATABASE_OPERATION__PRECEDING_DATABASE_OPERATION);
		createEReference(databaseOperationEClass, DATABASE_OPERATION__CONTAINER);
		createEReference(databaseOperationEClass, DATABASE_OPERATION__STATEMENT);
		createEReference(databaseOperationEClass, DATABASE_OPERATION__TARGETING_PARAMETER);

		dataStructureEClass = createEClass(DATA_STRUCTURE);
		createEReference(dataStructureEClass, DATA_STRUCTURE__FIELDS);
		createEReference(dataStructureEClass, DATA_STRUCTURE__CONTAINER);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__TYPE);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEReference(fieldEClass, FIELD__DUPLICATED_FIELD);

		typeEClass = createEClass(TYPE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__TARGET_CONTAINER);
		createEReference(referenceEClass, REFERENCE__TARGET_FIELD);
		createEReference(referenceEClass, REFERENCE__REFERENCE_TYPE);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__DATA_STRUCTURES);
		createEAttribute(containerEClass, CONTAINER__NAME);

		compositionEClass = createEClass(COMPOSITION);
		createEReference(compositionEClass, COMPOSITION__DATA_STRUCTURE);

		readEClass = createEClass(READ);
		createEReference(readEClass, READ__RESULT_DATA_STRUCTURE);

		insertEClass = createEClass(INSERT);
		createEReference(insertEClass, INSERT__INSERT_DATA_STRUCTURE);

		updateEClass = createEClass(UPDATE);
		createEReference(updateEClass, UPDATE__UPDATE_PARAMETER);

		deleteEClass = createEClass(DELETE);

		operationParameterEClass = createEClass(OPERATION_PARAMETER);
		createEReference(operationParameterEClass, OPERATION_PARAMETER__PARAMETER_FIELDS);

		collectionEClass = createEClass(COLLECTION);
		createEAttribute(collectionEClass, COLLECTION__COLLECTION_TYPE);
		createEReference(collectionEClass, COLLECTION__TYPES);
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
		attributeEClass.getESuperTypes().add(this.getType());
		referenceEClass.getESuperTypes().add(this.getType());
		compositionEClass.getESuperTypes().add(this.getType());
		readEClass.getESuperTypes().add(this.getDatabaseOperation());
		insertEClass.getESuperTypes().add(this.getDatabaseOperation());
		updateEClass.getESuperTypes().add(this.getDatabaseOperation());
		deleteEClass.getESuperTypes().add(this.getDatabaseOperation());
		collectionEClass.getESuperTypes().add(this.getType());

		// Initialize classes, features, and operations; add parameters
		initEClass(databaseOperationsSchemaEClass, DatabaseOperationsSchema.class, "DatabaseOperationsSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseOperationsSchema_DatabaseOperations(), this.getDatabaseOperation(), null, "databaseOperations", null, 0, -1, DatabaseOperationsSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseOperationsSchema_Containers(), this.getContainer(), null, "containers", null, 0, -1, DatabaseOperationsSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseOperationEClass, DatabaseOperation.class, "DatabaseOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseOperation_FollowingDatabaseOperation(), this.getDatabaseOperation(), null, "followingDatabaseOperation", null, 0, -1, DatabaseOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseOperation_PrecedingDatabaseOperation(), this.getDatabaseOperation(), null, "precedingDatabaseOperation", null, 0, -1, DatabaseOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseOperation_Container(), this.getContainer(), null, "container", null, 0, 1, DatabaseOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseOperation_Statement(), theCodePackage.getStatement(), null, "statement", null, 0, 1, DatabaseOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseOperation_TargetingParameter(), this.getOperationParameter(), null, "targetingParameter", null, 0, 1, DatabaseOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataStructureEClass, DataStructure.class, "DataStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataStructure_Fields(), this.getField(), null, "fields", null, 0, -1, DataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataStructure_Container(), this.getContainer(), null, "container", null, 0, 1, DataStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Type(), this.getType(), null, "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_DuplicatedField(), this.getField(), null, "duplicatedField", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_TargetContainer(), this.getContainer(), null, "targetContainer", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_TargetField(), this.getField(), null, "targetField", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_ReferenceType(), this.getAttribute(), null, "referenceType", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_DataStructures(), this.getDataStructure(), null, "dataStructures", null, 0, -1, es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposition_DataStructure(), this.getDataStructure(), null, "dataStructure", null, 0, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readEClass, Read.class, "Read", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRead_ResultDataStructure(), this.getDataStructure(), null, "resultDataStructure", null, 0, 1, Read.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertEClass, Insert.class, "Insert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInsert_InsertDataStructure(), this.getDataStructure(), null, "insertDataStructure", null, 0, -1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateEClass, Update.class, "Update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdate_UpdateParameter(), this.getOperationParameter(), null, "updateParameter", null, 0, 1, Update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationParameterEClass, OperationParameter.class, "OperationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationParameter_ParameterFields(), this.getField(), null, "parameterFields", null, 0, -1, OperationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollection_CollectionType(), ecorePackage.getEString(), "collectionType", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollection_Types(), this.getType(), null, "types", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DatabaseOperationsSchemaPackageImpl
