package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator;

import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Read;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Reference;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.builder.DBOSchemaBuilder;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.model.repository.DBOSchemaRepository;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils.FieldsUtils;
import es.um.uschema.code.metamodels.code.Assignable;
import es.um.uschema.code.metamodels.code.Call;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.IndexBasedAccess;
import es.um.uschema.code.metamodels.code.NewDataContainer;
import es.um.uschema.code.metamodels.code.Property;
import es.um.uschema.code.metamodels.code.PropertyAccess;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.Variable;
import es.um.uschema.code.metamodels.code.VariableAccess;

public class ReferencesTracker
{
	private DBOSchemaBuilder dboSchemaBuilder;
	private DBOSchemaRepository dboSchemaRepository;
	private VariableBackwardTracker variableBackwardTracker;
	
	public ReferencesTracker(DBOSchemaBuilder dboSchemaBuilder, DBOSchemaRepository dboSchemaRepository, VariableBackwardTracker variableBackwardTracker)
	{
		this.dboSchemaBuilder = dboSchemaBuilder;
		this.dboSchemaRepository = dboSchemaRepository;
		this.variableBackwardTracker = variableBackwardTracker;
	}
	
	public void setPrecedingAndFollowingDBOperations(DatabaseOperation secondDBOperation)
	{
		variableBackwardTracker.getCallsList().forEach(targetCall -> {
			dboSchemaRepository.getDBOperations().forEach(firstDBOperation -> {
				if (secondDBOperation != firstDBOperation && firstDBOperation.getStatement().equals(targetCall)) 
				{
					secondDBOperation.getPrecedingDatabaseOperation().add(firstDBOperation);
					firstDBOperation.getFollowingDatabaseOperation().add(secondDBOperation);
					createReferencesBetweenDataStructures(firstDBOperation, secondDBOperation);
				}
			});
		});
	}
	
	private void createReferencesBetweenDataStructures(DatabaseOperation firstDBOperation, DatabaseOperation secondDBOperation)
	{
		Statement statement = secondDBOperation.getStatement();
		if (statement instanceof Call) {
			checkArguments(firstDBOperation, secondDBOperation, (Call) statement);
		}
	}

	private void checkArguments(DatabaseOperation firstDBOperation, DatabaseOperation secondDBOperation, Call call)
	{
		call.getArguments().forEach(a -> {
			DataProducer dp = a.getDataProducer();
			if (dp instanceof NewDataContainer) {
				NewDataContainer newDataContainer = (NewDataContainer) dp;
				checkParameter(firstDBOperation, secondDBOperation, newDataContainer);
			}
		});
	}

	private void checkParameter(DatabaseOperation firstDBOperation, DatabaseOperation secondDBOperation, NewDataContainer newDataContainer)
	{
		newDataContainer.getDataContainer().getProperties().forEach(p -> {
			Assignable initialization = p.getInitialization();
			if (initialization instanceof PropertyAccess) {
				checkReferences(firstDBOperation, secondDBOperation, p);
			}
		});
	}

	private void checkReferences(DatabaseOperation firstDBOperation, DatabaseOperation secondDBOperation,
			Property property)
	{
		Assignable initialization = property.getInitialization();
		if (initialization instanceof PropertyAccess) {
			PropertyAccess propertyAccess = (PropertyAccess) initialization;
			if (firstDBOperation instanceof Read && secondDBOperation instanceof Read) {
				Field field = FieldsUtils.getFieldByName((Read) firstDBOperation, propertyAccess.getName());
				if (field != null) {					
					Field referredField = FieldsUtils.getFieldByName((Read) secondDBOperation, property.getName());
					Reference reference = dboSchemaBuilder.createReference(secondDBOperation.getContainer(), referredField);
					field.setType(reference);
				}
			}
		}
	}

}
