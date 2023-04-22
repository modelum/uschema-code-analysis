package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator;

import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.FIND;
import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.FIND_ONE;
import static es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants.ConstantsDBSchema.AGGREGATE;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import java.util.Optional;

import es.um.nosql.code.s13e.metamodels.code.Argument;
import es.um.nosql.code.s13e.metamodels.code.Assignable;
import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess;
import es.um.nosql.code.s13e.metamodels.code.Operation;
import es.um.nosql.code.s13e.metamodels.code.Parameter;
import es.um.nosql.code.s13e.metamodels.code.PrimitiveType;
import es.um.nosql.code.s13e.metamodels.code.Property;
import es.um.nosql.code.s13e.metamodels.code.PropertyAccess;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.metamodels.codeGraph.Edge;
import es.um.nosql.code.s13e.metamodels.codeGraph.EdgeType;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Collection;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Composition;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DataStructure;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Read;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Type;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.builder.DBOSchemaBuilder;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.model.repository.DBOSchemaRepository;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils.FieldsUtils;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils.StringUtils;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils.TypeUtils;

public class CodeGraphForwardIterator
{
	private DBOSchemaBuilder dboSchemaBuilder;
	@SuppressWarnings("unused")
	private DBOSchemaRepository dboSchemaRepository;
	private VariableForwardTracker variableForwardTracker;
	private Node actualNode;

	public CodeGraphForwardIterator(DBOSchemaBuilder dboSchemaBuilder, DBOSchemaRepository dboSchemaRepository)
	{
		this.dboSchemaBuilder = dboSchemaBuilder;
		this.dboSchemaRepository = dboSchemaRepository;
		this.variableForwardTracker = new VariableForwardTracker();
	}

	public void trackDatabaseCall(Entry<Call, Node> entrySet, DatabaseOperation databaseOperation, Map<String, String> aggregateFields)
	{
		Call call = entrySet.getKey();
		Node node = entrySet.getValue();
		trackVariablesForward(call, node, databaseOperation, aggregateFields);
	}

	private void trackVariablesForward(Call call, Node node, DatabaseOperation databaseOperation, Map<String, String> aggregateFields)
	{
		if (FIND_ONE.equals(call.getName()) || FIND.equals(call.getName()))
		{
			List<Argument> arguments = call.getArguments();
			if (arguments.size() >= 2) {
				Argument argument = arguments.get(1);
				DataProducer dataProducer = argument.getDataProducer();
				if (dataProducer instanceof CallableBlock) 
				{
					processCallableBlock(node, databaseOperation, (CallableBlock) dataProducer, aggregateFields);
				}
			}
		} else if (AGGREGATE.equals(call.getName()))
		{
			List<Edge> outgoingEdges = node.getOutgoingEdges().stream().filter(e -> e.getType().equals(EdgeType.NEXT)).collect(Collectors.toList());
			for (Edge edge : outgoingEdges)
			{
				Node targetNode = edge.getTarget();
				Statement statement = targetNode.getStatement();
				if (statement instanceof Call) {
					navigateToParameter(databaseOperation, targetNode, (Call) statement, aggregateFields);
				}
			}
		}
	}

	private void navigateToParameter(DatabaseOperation databaseOperation, Node targetNode, Call insideCall, Map<String, String> aggregateFields)
	{
		List<Argument> arguments = insideCall.getArguments();
		if (arguments.size() > 0) {
			Argument argument = arguments.get(0);
			DataProducer dataProducer = argument.getDataProducer();
			if (dataProducer instanceof CallableBlock) {
				processCallableBlockToFindParameter(databaseOperation, targetNode, (CallableBlock) dataProducer, aggregateFields);
			}
			
		}
	}

	private void processCallableBlockToFindParameter(DatabaseOperation databaseOperation, Node targetNode, CallableBlock callableBlock, Map<String, String> aggregateFields)
	{
		List<Parameter> parameters = callableBlock.getParameters();
		if (parameters.size() > 0) {
			Parameter variable = parameters.get(0);
			if (parameters.size() > 1) {
				variable = parameters.get(1);
			}

			variableForwardTracker.trackForwards(targetNode, variable);
			List<DataProducer> dataProducerList = variableForwardTracker.getDataProducerList();
			variableForwardTracker.clearDataProducerList();
			
			if (databaseOperation instanceof Read) 	{
				Read read = (Read) databaseOperation;
				addFieldsUsedToRead(read, dataProducerList, read.getResultDataStructure(), aggregateFields);
			}
		} 
	}

	private void processCallableBlock(Node node, DatabaseOperation databaseOperation, CallableBlock callableBlock,Map<String, String> aggregateFields)
	{
		actualNode = node;
		List<Parameter> parameters = callableBlock.getParameters();
		if (parameters.size() >= 2) {
			Parameter parameter = parameters.get(1);

			variableForwardTracker.trackForwards(node, parameter);
			List<DataProducer> dataProducerList = variableForwardTracker.getDataProducerList();
			variableForwardTracker.clearDataProducerList();
			
			if (databaseOperation instanceof Read)
			{
				Read read = (Read) databaseOperation;
				addFieldsUsedToRead(read, dataProducerList, read.getResultDataStructure(), aggregateFields);
			}
		}
	}

	private void addFieldsUsedToRead(Read read, List<DataProducer> dataProducerList, DataStructure resultDataStructure, Map<String, String> aggregateFields)
	{
		addFieldsToResultDataStructureFromVariableUses(read, dataProducerList, resultDataStructure, aggregateFields);
		copyTargetingFieldsIntoResultFields(read, resultDataStructure);
	}

	private void addFieldsToResultDataStructureFromVariableUses(Read read,
			List<DataProducer> dataProducerList, DataStructure resultDataStructure, Map<String, String> aggregateFields)
	{
		dataProducerList.forEach(dataProducer -> {
			Field newField = processDataProducer(read, resultDataStructure, dataProducer, aggregateFields, null);
			if (newField != null)
				resultDataStructure.getFields().add(newField);
		});
		read.setResultDataStructure(resultDataStructure);
	}

	private void copyTargetingFieldsIntoResultFields(Read read, DataStructure resultDataStructure)
	{
		DataStructure targetingDataStructure = read.getResultDataStructure();
		targetingDataStructure.getFields().forEach(targetingField -> {
			if (!targetingField.getName().startsWith("$")) {
				Field field = getField(resultDataStructure, targetingField.getName());
				if (field == null) {
					field = dboSchemaBuilder.createField(targetingField.getName());
					field.setType(TypeUtils.cloneType(targetingField.getType(), dboSchemaBuilder));
					resultDataStructure.getFields().add(field);
				} else if (field.getType() == null) {
					field.setType(TypeUtils.cloneType(targetingField.getType(), dboSchemaBuilder));
				} 
			}
		});
	}

	private Field getField(DataStructure resultDataStructure, String name)
	{
		Optional<Field> findFirst = resultDataStructure.getFields().stream().filter(f -> f.getName().equals(name)).findFirst();
		return findFirst.isPresent() ? findFirst.get() : null;
	}

	private Field processDataProducer(Read read, DataStructure resultDataStructure, DataProducer dataProducer, Map<String, String> aggregateFields, Field innerField)
	{
		Field field = null;
		
		if (dataProducer instanceof PropertyAccess) {
			PropertyAccess propertyAccess = (PropertyAccess) dataProducer;
			if (propertyAccess.getDataProducer() instanceof VariableAccess) {
				field = processFinalVariableAccess(read, resultDataStructure, aggregateFields, propertyAccess);
			} else if (propertyAccess.getDataProducer() instanceof IndexBasedAccess) {
				Field newField = dboSchemaBuilder.createField(propertyAccess.getName());

				Type typeFromVariable = getTypeFromVariable(propertyAccess);
				newField.setType(typeFromVariable);
				
				IndexBasedAccess indexBasedAccess = (IndexBasedAccess) propertyAccess.getDataProducer();
				field = processDataProducer(read, resultDataStructure, indexBasedAccess, aggregateFields, newField);
			} else if (propertyAccess.getDataProducer() instanceof PropertyAccess) {
				PropertyAccess innerPropertyAccess = (PropertyAccess) propertyAccess.getDataProducer();
				field = processDataProducer(read, resultDataStructure, innerPropertyAccess, aggregateFields, innerField);
			}
			
			processAggregate(read, aggregateFields, field, propertyAccess);
			
		} else if (dataProducer instanceof Property) {
			Property property = (Property) dataProducer;
			Assignable initialization = property.getInitialization();
			if (initialization instanceof DataProducer)
				field = processDataProducer(read, resultDataStructure, (DataProducer) initialization, aggregateFields, innerField);
		} else if (dataProducer instanceof Operation) 
		{
			((Operation) dataProducer).getDataProducers().forEach(dp -> 
				processDataProducer(read, resultDataStructure, dp, aggregateFields, innerField)
			);
		} else if (dataProducer instanceof IndexBasedAccess) {
			IndexBasedAccess indexBasedAccess = (IndexBasedAccess) dataProducer;
			field = processDataProducer(read, resultDataStructure, indexBasedAccess.getDataProducer(), aggregateFields, innerField);
			field = processPossibleComposition(resultDataStructure, innerField, field, indexBasedAccess);
		} else if (dataProducer instanceof PropertyAccess) {
			PropertyAccess innerPropertyAccess = (PropertyAccess) dataProducer;
			processDataProducer(read, resultDataStructure, innerPropertyAccess, aggregateFields, innerField);
		}
		
		return field;
	}

	private Type getTypeFromVariable(PropertyAccess propertyAccess) {
		DataProducer navigateToRight = navigateToRight(propertyAccess);
		while (!(navigateToRight instanceof VariableAccess)) {
			navigateToRight = navigateToRight(navigateToRight);
		}
		if (navigateToRight instanceof VariableAccess) {
			VariableAccess variableAccess = (VariableAccess) navigateToRight;
			return new VariableForwardTracker().trackVariableBackwardsForType(actualNode, variableAccess.getVariable());
		}
		
		return null;
	}

	private DataProducer navigateToRight(DataProducer dataProducer) {
		DataProducer typeFinderDataProducer = dataProducer;
		
		if (typeFinderDataProducer instanceof IndexBasedAccess) {
			IndexBasedAccess typeFinderIndexBasedAccess = (IndexBasedAccess) typeFinderDataProducer;
			return typeFinderIndexBasedAccess.getDataProducer();
		} else if (typeFinderDataProducer instanceof PropertyAccess) {
			PropertyAccess typeFinderPropertyAccess = (PropertyAccess) typeFinderDataProducer;
			return typeFinderPropertyAccess.getDataProducer();
		} else if (typeFinderDataProducer instanceof VariableAccess) {
			VariableAccess variableAccess = (VariableAccess) typeFinderDataProducer;
			return variableAccess;
		}
		
		return null;
	}

	private void processAggregate(Read read, Map<String, String> aggregateFields, Field field,
			PropertyAccess propertyAccess) {
		PropertyAccess firstPropertyAccess = getFirstPropertyAccess(propertyAccess);
		if (firstPropertyAccess != null && firstPropertyAccess.getName().equals(StringUtils.cleanLiteralString(aggregateFields.get("as"))))
		{
			Field referenceField = FieldsUtils.getFieldByName(read, aggregateFields.get("localField"));
			Type type = referenceField.getType();
			if (type != null && type instanceof Collection) {
				Collection collection = (Collection) type;
				if (collection.getTypes().size() > 0)
				type = collection.getTypes().get(0);
			}
			if (field != null && type != null && type instanceof Reference) 
			{
				Reference reference = (Reference) type;
				Field targetField = reference.getTargetField();
				EObject eContainer = targetField.eContainer();
				if (eContainer instanceof DataStructure) {
					
					Property property = propertyAccess.getProperty();
					String name = "";
					if (property != null)  
						name = property.getName();
					else 
						name = propertyAccess.getName();
					Field originfield = dboSchemaBuilder.createField(name);
					originfield.setType(TypeUtils.cloneType(field.getType(), dboSchemaBuilder));
					DataStructure dataStructure = (DataStructure) eContainer;
					dataStructure.getFields().add(originfield);
					
					field.setDuplicatedField(originfield);
				}
			}
		}
	}

	private Field processPossibleComposition(DataStructure resultDataStructure, Field innerField, Field field,
			IndexBasedAccess indexBasedAccess) {
		if (indexBasedAccess.getDataProducer() instanceof PropertyAccess) {
			PropertyAccess propertyAccess = (PropertyAccess) indexBasedAccess.getDataProducer();
		
			Optional<Field> possibleField = resultDataStructure.getFields().stream().filter(f -> f.getName().equals(propertyAccess.getName())).findAny();
			if (possibleField.isPresent()) {
				field = possibleField.get();
				if (field.getType() instanceof Collection) {
					Collection array = (Collection) field.getType();
					for (Type type : array.getTypes()) {
						if (type instanceof Composition) {
							if (innerField != null) {
								Composition composition = (Composition) type;
								DataStructure newDataStructure = composition.getDataStructure();
								newDataStructure.getFields().add(innerField);
							}
						}
					}
				}
			} else {
				Collection array = dboSchemaBuilder.createCollection("Array");
				if (field.getType() != null)
					array.getTypes().add(field.getType());
				
				DataStructure newDataStructure = dboSchemaBuilder.createDataStructure();
				if (innerField != null) {
					newDataStructure.getFields().add(innerField);
				}
				Composition composition = dboSchemaBuilder.createComposition(newDataStructure);
				array.getTypes().add(composition);
				field.setType(array);
			}
		}
		return field;
	}

	private Field processFinalVariableAccess(Read read, DataStructure resultDataStructure,
			Map<String, String> aggregateFields, PropertyAccess propertyAccess) {
		String name = propertyAccess.getName();
		Field possibleDuplicatedField = getField(resultDataStructure, name);
		if (possibleDuplicatedField == null) {
			Property property = propertyAccess.getProperty();
			if (property != null)  
				name = property.getName();
			possibleDuplicatedField = dboSchemaBuilder.createField(name);

			if (property != null)  
				possibleDuplicatedField.setType(TypeUtils.getType(property.getType(), dboSchemaBuilder));
		}

		if (propertyAccess.getDataProducer() instanceof PropertyAccess) 
		{
			PropertyAccess firstPropertyAccess = getFirstPropertyAccess(propertyAccess);
			if (firstPropertyAccess.getName().equals(StringUtils.cleanLiteralString(aggregateFields.get("as"))))
			{
				Field referenceField = FieldsUtils.getFieldByName(read, aggregateFields.get("localField"));
				Type type = referenceField.getType();
				if (type != null && type instanceof Collection) {
					Collection collection = (Collection) type;
					if (collection.getTypes().size() > 0)
					type = collection.getTypes().get(0);
				}
				if (type != null && type instanceof Reference) 
				{
					Reference reference = (Reference) type;
					Field targetField = reference.getTargetField();
					EObject eContainer = targetField.eContainer();
					if (eContainer instanceof DataStructure) {
						
						Property property = propertyAccess.getProperty();
						if (property != null)  
							name = property.getName();
						Field originfield = dboSchemaBuilder.createField(name);
						originfield.setType(TypeUtils.cloneType(possibleDuplicatedField.getType(), dboSchemaBuilder));
						DataStructure dataStructure = (DataStructure) eContainer;
						dataStructure.getFields().add(originfield);
						
						possibleDuplicatedField.setDuplicatedField(originfield);
					}
				}
			}
		}
		
		return possibleDuplicatedField;
	}

	private PropertyAccess getFirstPropertyAccess(PropertyAccess propertyAccess)
	{
		if (propertyAccess.getDataProducer() instanceof PropertyAccess) {
			PropertyAccess exteriorPropertyAccess = (PropertyAccess) propertyAccess.getDataProducer();
			while (exteriorPropertyAccess != null && exteriorPropertyAccess.getDataProducer() instanceof PropertyAccess) {
				exteriorPropertyAccess = (PropertyAccess) exteriorPropertyAccess.getDataProducer();
			}
			return exteriorPropertyAccess;
		}
		
		return null;
	}

}
