package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.builder;

import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Collection;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Composition;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DataStructure;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchema;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaFactory;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Delete;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Insert;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.OperationParameter;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Attribute;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Read;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Update;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.comparators.DataStructureComparator;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.model.repository.DBOSchemaRepository;

public class DBOSchemaBuilder
{

	private static final String STRING = "String";
	
	private DBOSchemaRepository dboSchemaRepository;
	private DatabaseOperationsSchemaFactory dbosFactory;

	public DBOSchemaBuilder(DBOSchemaRepository dboSchemaRepository)
	{
		this.dboSchemaRepository = dboSchemaRepository;
		this.dbosFactory = DatabaseOperationsSchemaFactory.eINSTANCE;
	}

	public DatabaseOperationsSchema createDatabaseOperationsSchema()
	{
		DatabaseOperationsSchema databaseOperationsSchema = dbosFactory.createDatabaseOperationsSchema();
		dboSchemaRepository.saveDatabaseOperationsSchema(databaseOperationsSchema);
		
		return databaseOperationsSchema;
	}
	
	public Insert createInsert(Statement statement)
	{
		Insert insert = dbosFactory.createInsert();
		dboSchemaRepository.saveDatabaseOperation(insert);
		insert.setStatement(statement);
		
		return insert;
	}

	public Read createRead(Statement statement)
	{
		Read read = dbosFactory.createRead();
		dboSchemaRepository.saveDatabaseOperation(read);
		read.setStatement(statement);
		
		return read;
	}

	public Update createUpdate(Statement statement)
	{
		Update update = dbosFactory.createUpdate();
		dboSchemaRepository.saveDatabaseOperation(update);
		update.setStatement(statement);
		
		return update;
	}

	public Delete createDelete(Statement statement)
	{
		Delete delete = dbosFactory.createDelete();
		dboSchemaRepository.saveDatabaseOperation(delete);
		delete.setStatement(statement);
		
		return delete;
	}

	public Container createContainer(String collectionName)
	{
		Container container = dboSchemaRepository.getContainer(collectionName);
		if (container == null)
		{
			container = dbosFactory.createContainer();
			container.setName(collectionName);
			dboSchemaRepository.saveContainer(container);
			dboSchemaRepository.putContainer(collectionName, container);
		}
		dboSchemaRepository.setAsLastContainer(container);
		
		return container;
	}

	public DataStructure createDataStructure(Container container)
	{
		if (container.getDataStructures().size() == 1) {
			return container.getDataStructures().get(0);
		}
		
		DataStructure dataStructure = dbosFactory.createDataStructure();
		dataStructure.setContainer(container);
		
		return dataStructure;
	}

	public DataStructure createDataStructure()
	{
		DataStructure dataStructure = dbosFactory.createDataStructure();
		
		return dataStructure;
	}

	public Field createField(String name)
	{
		Field field = dbosFactory.createField();
		field.setName(name);
		
		return field;
	}

	public Attribute createPrimitiveType(String type)
	{
		Attribute primitiveType = dbosFactory.createAttribute();
		primitiveType.setName(type);
		
		return primitiveType;
	}

	public Composition createComposition(DataStructure dataStructure)
	{
		Composition composition = dbosFactory.createComposition();
		composition.setDataStructure(dataStructure);
		
		return composition;
	}

	public DataStructure getUniqueDataStructure(DataStructure dataStructure)
	{
		Container lastContainer = dboSchemaRepository.getLastContainer();
		for (DataStructure ds : lastContainer.getDataStructures())
		{
			if (DataStructureComparator.areDataStructureEquals(dataStructure, ds)) {
				return ds;
			}
		}

		dboSchemaRepository.saveDataStructure(dataStructure);
		return dataStructure;
	}

	public OperationParameter createOpeationParameter()
	{
		OperationParameter operationParameter = dbosFactory.createOperationParameter();
		
		return operationParameter;
	}

	public Reference createReference(Container container, Field targetField)
	{
		Reference reference = dbosFactory.createReference();
		reference.setTargetContainer(container);
		reference.setTargetField(targetField);
		
		if (targetField.getType() instanceof Attribute) {
			Attribute attribute = (Attribute) targetField.getType();
			reference.setReferenceType(createPrimitiveType(attribute.getName()));
		} else {
			reference.setReferenceType(createPrimitiveType(STRING));
		}
		
		return reference;
	}

	public Collection createCollection(String collectionType)
	{
		Collection collection = dbosFactory.createCollection();
		collection.setCollectionType(collectionType);
		
		return collection;
	}

	public Collection createCollection(String collectionType, Reference reference)
	{
		Collection collection = dbosFactory.createCollection();
		collection.setCollectionType(collectionType);
		collection.getTypes().add(reference);
		
		return collection;
	}
	

}
