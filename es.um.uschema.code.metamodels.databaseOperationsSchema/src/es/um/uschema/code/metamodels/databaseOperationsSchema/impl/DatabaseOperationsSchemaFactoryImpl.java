/**
 */
package es.um.uschema.code.metamodels.databaseOperationsSchema.impl;

import es.um.uschema.code.metamodels.databaseOperationsSchema.*;

import org.eclipse.emf.ecore.EClass;
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
public class DatabaseOperationsSchemaFactoryImpl extends EFactoryImpl implements DatabaseOperationsSchemaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatabaseOperationsSchemaFactory init() {
		try {
			DatabaseOperationsSchemaFactory theDatabaseOperationsSchemaFactory = (DatabaseOperationsSchemaFactory)EPackage.Registry.INSTANCE.getEFactory(DatabaseOperationsSchemaPackage.eNS_URI);
			if (theDatabaseOperationsSchemaFactory != null) {
				return theDatabaseOperationsSchemaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatabaseOperationsSchemaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseOperationsSchemaFactoryImpl() {
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
			case DatabaseOperationsSchemaPackage.DATABASE_OPERATIONS_SCHEMA: return createDatabaseOperationsSchema();
			case DatabaseOperationsSchemaPackage.DATA_STRUCTURE: return createDataStructure();
			case DatabaseOperationsSchemaPackage.FIELD: return createField();
			case DatabaseOperationsSchemaPackage.ATTRIBUTE: return createAttribute();
			case DatabaseOperationsSchemaPackage.REFERENCE: return createReference();
			case DatabaseOperationsSchemaPackage.CONTAINER: return createContainer();
			case DatabaseOperationsSchemaPackage.COMPOSITION: return createComposition();
			case DatabaseOperationsSchemaPackage.READ: return createRead();
			case DatabaseOperationsSchemaPackage.INSERT: return createInsert();
			case DatabaseOperationsSchemaPackage.UPDATE: return createUpdate();
			case DatabaseOperationsSchemaPackage.DELETE: return createDelete();
			case DatabaseOperationsSchemaPackage.OPERATION_PARAMETER: return createOperationParameter();
			case DatabaseOperationsSchemaPackage.COLLECTION: return createCollection();
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
	public DatabaseOperationsSchema createDatabaseOperationsSchema() {
		DatabaseOperationsSchemaImpl databaseOperationsSchema = new DatabaseOperationsSchemaImpl();
		return databaseOperationsSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataStructure createDataStructure() {
		DataStructureImpl dataStructure = new DataStructureImpl();
		return dataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public es.um.uschema.code.metamodels.databaseOperationsSchema.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Read createRead() {
		ReadImpl read = new ReadImpl();
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Insert createInsert() {
		InsertImpl insert = new InsertImpl();
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameter createOperationParameter() {
		OperationParameterImpl operationParameter = new OperationParameterImpl();
		return operationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection createCollection() {
		CollectionImpl collection = new CollectionImpl();
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseOperationsSchemaPackage getDatabaseOperationsSchemaPackage() {
		return (DatabaseOperationsSchemaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatabaseOperationsSchemaPackage getPackage() {
		return DatabaseOperationsSchemaPackage.eINSTANCE;
	}

} //DatabaseOperationsSchemaFactoryImpl
