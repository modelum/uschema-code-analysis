package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.model.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import es.um.uschema.code.metamodels.databaseOperationsSchema.Container;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchema;

public class DBOSchemaRepository
{
	private DatabaseOperationsSchema databaseOperationsSchema;
	private Container lastContainer;
	private Map<String, Container> containers;

	public DBOSchemaRepository()
	{
		this.containers = new HashMap<String, Container>();
	}
	
	public void saveDatabaseOperationsSchema(DatabaseOperationsSchema databaseOperationsSchema)
	{
		this.databaseOperationsSchema = databaseOperationsSchema;
	}

	public void saveDatabaseOperation(DatabaseOperation databaseOperation)
	{
		databaseOperationsSchema.getDatabaseOperations().add(databaseOperation);
	}

	public void saveDataStructure(DataStructure dataStructure)
	{
		lastContainer.getDataStructures().add(dataStructure);
	}

	public void saveContainer(Container container)
	{
		databaseOperationsSchema.getContainers().add(container);
	}
	
	public void setAsLastContainer(Container container)
	{
		lastContainer = container;
	}

	public Container getContainer(String collectionName)
	{
		return containers.get(collectionName);
	}

	public Container putContainer(String collectionName, Container container)
	{
		return containers.put(collectionName, container);
	}

	public Container getLastContainer()
	{
		return lastContainer;
	}

	public List<DatabaseOperation> getDBOperations()
	{
		return databaseOperationsSchema.getDatabaseOperations();
	}
	
}
