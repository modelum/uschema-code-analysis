package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator;

import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.AGGREGATE;
import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.DELETE;
import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.DELETE_ONE;
import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.FIND;
import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.FIND_ONE;
import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.INSERT;
import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.INSERT_ONE;
import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.NAMES;
import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.UPDATE;
import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.UPDATE_ONE;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import es.um.nosql.code.s13e.metamodels.code.Argument;
import es.um.nosql.code.s13e.metamodels.code.Assignable;
import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.DataContainer;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess;
import es.um.nosql.code.s13e.metamodels.code.Literal;
import es.um.nosql.code.s13e.metamodels.code.NewArray;
import es.um.nosql.code.s13e.metamodels.code.NewDataContainer;
import es.um.nosql.code.s13e.metamodels.code.Operation;
import es.um.nosql.code.s13e.metamodels.code.Property;
import es.um.nosql.code.s13e.metamodels.code.PropertyAccess;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.metamodels.code.VariableDeclaration;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Composition;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Container;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DataStructure;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Delete;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Insert;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.OperationParameter;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Read;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Type;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Update;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.builder.DBOSchemaBuilder;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.model.repository.DBOSchemaRepository;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils.StringUtils;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils.TypeUtils;

public class CodeGraphBackwardIterator
{
	private static final String SET = "$set";
	private DBOSchemaBuilder dboSchemaBuilder;
	private DBOSchemaRepository dboSchemaRepository;
	private ArgumentTracker argumentTracker;
	private VariableBackwardTracker variableBackwardTracker;
	private DataProducerTracker dataProducerTracker;
	private PropertyAssignsTracker propertyAssignsTracker;
	private ReferencesTracker referencesTracker;
	private Map<String, String> aggregateFields;

	public CodeGraphBackwardIterator(DBOSchemaBuilder dboSchemaBuilder, DBOSchemaRepository dboSchemaRepository)
	{
		this.dboSchemaBuilder = dboSchemaBuilder;
		this.dboSchemaRepository = dboSchemaRepository;
		this.variableBackwardTracker = new VariableBackwardTracker();
		this.argumentTracker = new ArgumentTracker(variableBackwardTracker);
		this.dataProducerTracker = new DataProducerTracker(argumentTracker);
		this.propertyAssignsTracker = new PropertyAssignsTracker(this);
		this.referencesTracker = new ReferencesTracker(dboSchemaBuilder, dboSchemaRepository, variableBackwardTracker);
		this.aggregateFields = new HashMap<String, String>();
	}

	public Map<Call, Node> findDatabaseOperations(CodeGraph codeGraphModel)
	{
		Map<Call, Node> calls = codeGraphModel.getSubGrahps().stream()
			.flatMap(sg -> 
				sg.getNodes().stream()
					.filter(n -> n.getStatement() instanceof Call)
					.filter(n -> NAMES.contains(((Call) n.getStatement()).getName()))
			).collect(
				Collectors.toMap(n -> (Call) n.getStatement(), n -> n)
			);
		
		return calls;
	}

	public void trackBackwardCalls(Map<Call, Node> databaseOperationCalls)
	{
		databaseOperationCalls.entrySet().forEach(c -> trackDatabaseCall(c));
		dboSchemaRepository.getDBOperations().forEach(dbo -> setPrecedingAndFollowingDBOperations(dbo));
	}

	public void setPrecedingAndFollowingDBOperations(DatabaseOperation dbOperation)
	{
		referencesTracker.setPrecedingAndFollowingDBOperations(dbOperation);
	}

	public DatabaseOperation trackDatabaseCall(Entry<Call, Node> entrySet)
	{
		Call call = entrySet.getKey();
		Node node = entrySet.getValue();
		
		String collectionName = getCollectionName(call, node);
		
		return createDatabaseOperation(call, node, collectionName);
	}

	private String getCollectionName(Call call, Node node)
	{
		DataProducer dataProducer = call.getDataProducer();
		String collectionName = dataProducerTracker.track(node, dataProducer);
		collectionName = StringUtils.cleanLiteralString(collectionName);
		return collectionName;
	}

	private DatabaseOperation createDatabaseOperation(Call call, Node node, String collectionName)
	{
		aggregateFields.clear();
		if (INSERT_ONE.equals(call.getName()) || INSERT.equals(call.getName()))
		{
			Insert insert = dboSchemaBuilder.createInsert(call);
			Container container = dboSchemaBuilder.createContainer(collectionName);
			insert.setContainer(container);
			processInsertCall(insert, call, node);
			return insert;
		} 
		else if (FIND_ONE.equals(call.getName()) || FIND.equals(call.getName()))
		{
			Read read = dboSchemaBuilder.createRead(call);
			Container container = dboSchemaBuilder.createContainer(collectionName);
			read.setContainer(container);
			processFindOrDeleteCall(read, call, node);
			return read;
		} 
		else if (DELETE_ONE.equals(call.getName()) || DELETE.equals(call.getName()))
		{
			Delete delete = dboSchemaBuilder.createDelete(call);
			Container container = dboSchemaBuilder.createContainer(collectionName);
			delete.setContainer(container);
			processFindOrDeleteCall(delete, call, node);
			return delete;
		} else if (UPDATE_ONE.equals(call.getName()) || UPDATE.equals(call.getName()))
		{
			Update update = dboSchemaBuilder.createUpdate(call);
			Container container = dboSchemaBuilder.createContainer(collectionName);
			update.setContainer(container);
			processUpdateCall(update, call, node);
			return update;
		} 
		else if (AGGREGATE.equals(call.getName()))
		{
			Read read = dboSchemaBuilder.createRead(call);
			Container container = dboSchemaBuilder.createContainer(collectionName);
			read.setContainer(container);
			createFromNewArray((Call) read.getStatement());
			processAggregateFields(read);
			
			return read;
		} 
		
		return null;
	}

	private void processAggregateFields(Read read)
	{
		String from = aggregateFields.get("from");
		Container targetContainer = dboSchemaBuilder.createContainer(from);
		DataStructure targetDataStructure = dboSchemaBuilder.createDataStructure(targetContainer);
		targetContainer.getDataStructures().add(targetDataStructure);
		String foreignField = aggregateFields.get("foreignField");
		
		Optional<Field> findField = targetDataStructure.getFields().stream().filter(f -> f.getName().equals(foreignField)).findAny();
		Field targetField = null;
		if (findField.isPresent()) {
			targetField = findField.get();
		} else {
			targetField = dboSchemaBuilder.createField(foreignField);
			targetDataStructure.getFields().add(targetField);
		}
		
		createLocalFields(read, targetContainer, targetField);
	}

	private void createLocalFields(Read read, Container targetContainer, Field targetField)
	{
		DataStructure resultDataStructure =  dboSchemaBuilder.createDataStructure(read.getContainer());
		read.getContainer().getDataStructures().add(resultDataStructure);
		read.setResultDataStructure(resultDataStructure);
		String localField = aggregateFields.get("localField");
		Field referenceField = dboSchemaBuilder.createField(localField);
		Reference reference = dboSchemaBuilder.createReference(targetContainer, targetField);
		if (aggregateFields.containsKey("$unwind")) {
			referenceField.setType(dboSchemaBuilder.createCollection("list", reference));
		} else {
			referenceField.setType(reference);
		}
		resultDataStructure.getFields().add(referenceField);
	}

	private void processInsertCall(Insert insert, Call databaseOperationCall, Node node)
	{
		List<Argument> arguments = databaseOperationCall.getArguments();
		
		if (arguments.size() >= 1)
		{
			DataStructure dataStructure = getDataStructure(insert, node, arguments.get(0));
			insert.getInsertDataStructure().add(dataStructure);
		} 
	}
	
	private void processFindOrDeleteCall(DatabaseOperation databaseOperation, Call databaseOperationCall, Node node)
	{
		List<Argument> arguments = databaseOperationCall.getArguments();
		
		if (arguments.size() >= 1)
		{
			DataStructure dataStructure = getDataStructure(databaseOperation, node, arguments.get(0));
			if (databaseOperation instanceof Read) {
				((Read) databaseOperation).setResultDataStructure(dataStructure);
			}
			OperationParameter operationParameter = dboSchemaBuilder.createOpeationParameter();
			databaseOperation.setTargetingParameter(operationParameter);
			processArgument(arguments.get(0), dataStructure, operationParameter);
		} 
	}

	private void processArgument(Argument argument, DataStructure dataStructure, OperationParameter operationParameter)
	{
		DataProducer dataProducer = argument.getDataProducer();
		if (dataProducer instanceof NewDataContainer) {
			processNewDataContainer(dataStructure, operationParameter, dataProducer);
		} 
	}

	private void processNewDataContainer(DataStructure dataStructure, OperationParameter opeationParameter,
			DataProducer dataProducer)
	{
		NewDataContainer newDataContainer = (NewDataContainer) dataProducer;
		DataContainer dataContainer = newDataContainer.getDataContainer();
		
		for (Property property : dataContainer.getProperties())
		{
			Optional<Field> optionalField = dataStructure.getFields().stream()
					.filter(f -> f.getName().equals(property.getName()))
					.findFirst();
			if (optionalField.isPresent()) {
				opeationParameter.getParameterFields().add(optionalField.get());
			}
		}
	}

	private void processUpdateCall(Update update, Call databaseOperationCall, Node node)
	{
		List<Argument> arguments = databaseOperationCall.getArguments();
		
		if (arguments.size() >= 1)
		{
			DataStructure dataStructure = getDataStructure(update, node, arguments.get(0));
			OperationParameter opeationParameter = dboSchemaBuilder.createOpeationParameter();
			update.setTargetingParameter(opeationParameter);
			processArgument(arguments.get(0), dataStructure, opeationParameter);
		} 

		if (arguments.size() >= 2)
		{
			DataStructure dataStructure = getDataStructure(update, node, arguments.get(1));
			OperationParameter opeationParameter = dboSchemaBuilder.createOpeationParameter();
			update.setTargetingParameter(opeationParameter);
			processArgument(arguments.get(1), dataStructure, opeationParameter);
		}
	}

	private DataStructure getDataStructure(DatabaseOperation callDBOperation, Node node, Argument argument)
	{
		Container container = callDBOperation.getContainer();
		
		DataProducer dp = argument.getDataProducer();
		Statement tracked = argumentTracker.track(callDBOperation, dp, node);
		
		return generateDataStructure(node, container, tracked);
	}

	private DataStructure generateDataStructure(Node node, Container container, Statement tracked)
	{
		DataStructure dataStructure = null;
		if (tracked instanceof NewDataContainer) 
		{
			dataStructure = createDataStructure((NewDataContainer) tracked, container, node);
		} else if (tracked instanceof VariableDeclaration) {
			VariableDeclaration variableDeclaration = (VariableDeclaration) tracked;
			Assignable initialization = variableDeclaration.getInitialization();
			if (initialization instanceof NewDataContainer) 
			{
				dataStructure = createDataStructureFromNewDataContainer((NewDataContainer) initialization, container, node);
				propertyAssignsTracker.trackPropertyAssigns(variableDeclaration.getVariable(), node, dataStructure);
				dataStructure = dboSchemaBuilder.getUniqueDataStructure(dataStructure);
			}
		}
		
		return dataStructure;
	}

	private void createFromNewArray(Call call)
	{
		EList<Argument> arguments = call.getArguments();
		for (Argument argument : arguments)
		{
			DataProducer dataProducer = argument.getDataProducer();
			if (dataProducer instanceof NewArray) {
				NewArray newArray = (NewArray) dataProducer;
				for (DataProducer insideDp : newArray.getDataProducer())
				{
					if (insideDp instanceof NewDataContainer)
					{
						NewDataContainer newDataContainer = (NewDataContainer) insideDp;
						DataContainer dataContainer = newDataContainer.getDataContainer();
						processDataContainer(dataContainer);
					}
				}
			}
		}
	}

	private void processDataContainer(DataContainer dataContainer)
	{
		List<Property> properties = dataContainer.getProperties();
		for (Property property : properties)
		{
			Assignable initialization = property.getInitialization();
			if (initialization instanceof Literal) {
				Literal literal = (Literal) initialization;
				aggregateFields.put(property.getName(), StringUtils.cleanLiteralString(literal.getLiteral()));
			} else if (property instanceof DataContainer) {
				aggregateFields.put(property.getName(), "dataContainer");
				processDataContainer((DataContainer) property);
			}
		}
	}

	private DataStructure createDataStructure(NewDataContainer newDataContainer, Container container, Node node)
	{
		DataStructure dataStructure = createDataStructureFromNewDataContainer(newDataContainer, container, node);
		dataStructure = dboSchemaBuilder.getUniqueDataStructure(dataStructure);
		
		return dataStructure;
	}
	

	private DataStructure createDataStructureFromNewDataContainer(NewDataContainer newDataContainer, Container container, Node node)
	{
		DataContainer dataContainer = newDataContainer.getDataContainer();
		DataStructure dataStructure = dboSchemaBuilder.createDataStructure(container);
		propertiesToFields(node, dataStructure, dataContainer, container);
		
		return dataStructure;
	}

	private void propertiesToFields(Node node, DataStructure dataStructure, DataContainer dataContainer, Container container)
	{
		dataContainer.getProperties().forEach(p -> {
			if (!SET.equals(p.getName())) {
				createField(node, dataStructure, container, p);
			} else  if (p instanceof DataContainer) { // Ignore $set
				propertiesToFields(node, dataStructure, (DataContainer) p, container);
			}
		});
	}

	public void createField(Node node, DataStructure dataStructure, Container container, Property p)
	{
		if (!dataStructure.getFields().stream().filter(f -> f.getName().equals(p.getName())).findAny().isPresent()) {
			Field field = dboSchemaBuilder.createField(p.getName());
			dataStructure.getFields().add(field);
			
			es.um.nosql.code.s13e.metamodels.code.Type type = p.getType();
			if (type != null) {
				field.setType(TypeUtils.getType(p.getType(), dboSchemaBuilder));
			} else if (p.getInitialization() != null) {
				field.setType(generateType(node, container, p.getInitialization()));
			} else  if (p instanceof DataContainer) 
			{
				DataStructure insideDataStructure = dboSchemaBuilder.createDataStructure();
				Composition composition = dboSchemaBuilder.createComposition(insideDataStructure);
				field.setType(composition);
				propertiesToFields(node, insideDataStructure, (DataContainer) p, null);
			} 
		}
	}

	private Type generateType(Node node, Container container, Assignable initialization)
	{
		Type generatedType = null; 
		
		if (initialization instanceof VariableAccess)
		{
			generatedType = processVariableAccess(node, initialization);
		} else if (initialization instanceof Operation) {
			generatedType = processOperation(node, container, initialization, generatedType);
		} else if (initialization instanceof NewDataContainer) {
			generatedType = processNewDataContainer(node, container, initialization);
		} else if (initialization instanceof PropertyAccess) {
			generatedType = processPropertyAccess(node, (PropertyAccess) initialization);
		}
		
		return generatedType;
	}

	private Type processNewDataContainer(Node node, Container container, Assignable initialization)
	{
		Type generatedType;
		NewDataContainer newDataContainer = (NewDataContainer) initialization;
		DataStructure dataStructure = createDataStructureFromNewDataContainer(newDataContainer, container, node);
		
		generatedType = dboSchemaBuilder.createComposition(dataStructure);
		return generatedType;
	}

	private Type processPropertyAccess(Node node, PropertyAccess propertyAccess)
	{
		DataProducer dataProducer = propertyAccess.getDataProducer();
		return processDataProducer(node, dataProducer); 
	}

	private Type processDataProducer(Node node, DataProducer dataProducer) {
		if (dataProducer instanceof VariableAccess) {
			VariableAccess variableAccess = (VariableAccess) dataProducer;
			Variable variable = variableAccess.getVariable();
			es.um.nosql.code.s13e.metamodels.code.PrimitiveType type = variableBackwardTracker.trackVariableBackwardsForType(node, variable);
			return TypeUtils.getType(type, dboSchemaBuilder);
		} else if (dataProducer instanceof PropertyAccess) {
			PropertyAccess propertyAccess = (PropertyAccess) dataProducer;
			return processDataProducer(node, propertyAccess.getDataProducer());
		} else if (dataProducer instanceof IndexBasedAccess) {
			IndexBasedAccess indexBasedAccess = (IndexBasedAccess) dataProducer;
			return processDataProducer(node, indexBasedAccess.getDataProducer());
		}
		
		return null;
	}

	private Type processOperation(Node node, Container container, Assignable initialization, Type generatedType)
	{
		Operation operation = (Operation) initialization;
		List<DataProducer> dataProducers = operation.getDataProducers();
		if (dataProducers.size() > 1)
		{
			DataProducer left = dataProducers.get(0);
			generatedType = generateType(node, container, left);
			
			if (generatedType == null) {
				DataProducer right = dataProducers.get(1);
				generatedType = generateType(node, container, right);
			}
		}
		return generatedType;
	}

	private Type processVariableAccess(Node node, Assignable initialization)
	{
		VariableAccess variableAccess = (VariableAccess) initialization;
		es.um.nosql.code.s13e.metamodels.code.PrimitiveType primitiveType = variableBackwardTracker.trackVariableBackwardsForType(node, variableAccess.getVariable());
		return TypeUtils.getType(primitiveType, dboSchemaBuilder);
	}
	
	public Map<String, String> getAggregateFields()
	{
		return new HashMap<String, String>(aggregateFields);
	}

}
