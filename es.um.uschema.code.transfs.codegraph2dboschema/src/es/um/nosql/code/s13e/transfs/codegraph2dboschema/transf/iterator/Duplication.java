package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import es.um.uschema.code.metamodels.codeGraph.Node;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Collection;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Composition;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Container;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Read;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Reference;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Type;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.builder.DBOSchemaBuilder;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.model.repository.DBOSchemaRepository;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils.FieldsUtils;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils.TypeUtils;
import es.um.uschema.code.metamodels.code.Argument;
import es.um.uschema.code.metamodels.code.Call;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.Parameter;
import es.um.uschema.code.metamodels.code.PropertyAccess;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.Variable;

public class Duplication
{
	private DBOSchemaBuilder dboSchemaBuilder;
	@SuppressWarnings("unused")
	private DBOSchemaRepository dboSchemaRepository;
	private VariableForwardTracker variableForwardTracker;
	private List<Field> newDuplicates;

	public Duplication(DBOSchemaBuilder dboSchemaBuilder, DBOSchemaRepository dboSchemaRepository)
	{
		this.dboSchemaBuilder = dboSchemaBuilder;
		this.dboSchemaRepository = dboSchemaRepository;
		this.variableForwardTracker = new VariableForwardTracker();
		this.newDuplicates = new LinkedList<Field>();
	}

	public void duplicatePossibles(Map<DatabaseOperation, Node> dataOperationNodes, DatabaseOperation databaseOperation, Node node)
	{
		if (databaseOperation instanceof Read) {
			lookupReferences(dataOperationNodes, (Read) databaseOperation);
		}
	}

	private void lookupReferences(Map<DatabaseOperation, Node> dataOperationNodes, Read firstRead)
	{
		this.newDuplicates = new LinkedList<Field>();
		DataStructure dataStructure = firstRead.getResultDataStructure();
		if (dataStructure != null) {		
			processDataStructure(dataOperationNodes, firstRead, dataStructure);
			dataStructure.getFields().addAll(newDuplicates);
	
			newDuplicates.clear();
		}
	}

	private void processDataStructure(Map<DatabaseOperation, Node> dataOperationNodes, Read firstRead,
		DataStructure dataStructure) {
		if (dataStructure != null) {
			for (Field field : dataStructure.getFields())
			{
				Type type = field.getType();
				if (type instanceof Reference) {
					Reference reference = (Reference) type;
					Container targetContainer = reference.getTargetContainer();
					
					lookupTargetContainerInFollowingDatabaseOperations(dataOperationNodes, firstRead, targetContainer, field);
				} else {
					navigateCollectionsAndCompositions(dataOperationNodes, firstRead, type);
				}
			}
		}
	}

	private void navigateCollectionsAndCompositions(Map<DatabaseOperation, Node> dataOperationNodes, Read firstRead, Type type) {
		if (type instanceof Collection) {Collection collection = (Collection) type;
			for (Type collectionType : collection.getTypes()) {
				navigateCollectionsAndCompositions(dataOperationNodes, firstRead, collectionType);
			}
		} else if (type instanceof Composition) {
			Composition composition = (Composition) type;
			DataStructure dataStructure = composition.getDataStructure();
			if (dataStructure != null) {
				processDataStructure(dataOperationNodes, firstRead, dataStructure);
	
				dataStructure.getFields().addAll(newDuplicates);
				newDuplicates.clear();
			}
		}
	}

	private void lookupTargetContainerInFollowingDatabaseOperations(Map<DatabaseOperation, Node> dataOperationNodes, Read read,
			Container targetContainer, Field keyField)
	{
		for (DatabaseOperation followingDatabaseOperation : read.getFollowingDatabaseOperation())
		{
			if (followingDatabaseOperation instanceof Read && 
					followingDatabaseOperation.getContainer().equals(targetContainer)) {
				Variable variable = getVariable((Read) followingDatabaseOperation);
				if (variable != null) {
					Node followingDatabaseOperationNode = dataOperationNodes.get(followingDatabaseOperation);
					lookupVariableUsages(followingDatabaseOperation, variable, followingDatabaseOperationNode);
				}
			}
		}
	}

	private void lookupVariableUsages(DatabaseOperation followingDatabaseOperation, Variable variable,
			Node followingDatabaseOperationNode)
	{
		variableForwardTracker.trackForwards(followingDatabaseOperationNode, variable);
		for (DataProducer dataProducer : variableForwardTracker.getDataProducerList())
		{
			if (dataProducer instanceof PropertyAccess) 
			{
				duplicateProperty((Read) followingDatabaseOperation, ((PropertyAccess) dataProducer).getName());
			}
		}
		variableForwardTracker.clearDataProducerList();
	}

	private Variable getVariable(Read read)
	{
		Statement statement = read.getStatement();
		if (statement instanceof Call) {
			Call call = (Call) statement;
			
			List<Argument> arguments = call.getArguments();
			if (arguments.size() >= 2) {
				return lookupParameter(arguments.get(1));
			} 
		}
		
		return null;
	}

	private Parameter lookupParameter(Argument argument)
	{
		DataProducer dataProducer = argument.getDataProducer();
		if (dataProducer instanceof CallableBlock) {
			CallableBlock callableBlock = (CallableBlock) dataProducer;
			
			List<Parameter> parameters = callableBlock.getParameters();
			if (parameters.size() >= 2) {
				Parameter parameter = parameters.get(1);
				return parameter;
			}
		}
		
		return null;
	}

	private void duplicateProperty(Read followingDatabaseOperation, String name)
	{
		Field duplicatedField = dboSchemaBuilder.createField(name);
		
		Field originalField = FieldsUtils.getFieldByName(followingDatabaseOperation, name);
		if (originalField != null) {
			duplicatedField.setDuplicatedField(originalField);
			Type clonedType = TypeUtils.cloneType(originalField.getType(), dboSchemaBuilder);
			duplicatedField.setType(clonedType);
		}
		newDuplicates.add(duplicatedField);
	}

}
