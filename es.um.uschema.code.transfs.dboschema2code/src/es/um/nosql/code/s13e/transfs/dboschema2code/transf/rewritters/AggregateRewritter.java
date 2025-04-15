package es.um.nosql.code.s13e.transfs.dboschema2code.transf.rewritters;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import es.um.uschema.code.metamodels.databaseOperationsSchema.Field;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Read;
import es.um.nosql.code.s13e.transfs.dboschema2code.transf.builders.CodeBuilder;
import es.um.uschema.code.metamodels.code.Argument;
import es.um.uschema.code.metamodels.code.Call;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.DataContainer;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.NewArray;
import es.um.uschema.code.metamodels.code.NewDataContainer;
import es.um.uschema.code.metamodels.code.Operation;
import es.um.uschema.code.metamodels.code.Parameter;
import es.um.uschema.code.metamodels.code.Property;
import es.um.uschema.code.metamodels.code.PropertyAccess;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.Variable;
import es.um.uschema.code.metamodels.code.VariableAccess;

public class AggregateRewritter
{
	private CodeBuilder codeBuilder;

	public AggregateRewritter()
	{
		this.codeBuilder = new CodeBuilder();
	}
	
	public void processStatement(Read read, Call call, String containerName, Field field)
	{
		renameCall(call);
		replaceArgument(call);
		createNewForEach(call, containerName, field);
	}

	private void createNewForEach(Call call, String containerName, Field field)
	{
		EObject eContainer = call.eContainer();
		if (eContainer instanceof PropertyAccess) {
			PropertyAccess propertyAccess = (PropertyAccess) eContainer;
			EObject eContainer2 = propertyAccess.eContainer();
			if (eContainer2 instanceof Call) {
				Call nextCall = (Call) eContainer2;
				CallableBlock callableBlock = getArgument(nextCall, 0);
				if (callableBlock != null) {
					createNewCode(containerName, field, callableBlock);
				}
			}
		}
	}

	private void createNewCode(String containerName, Field field, CallableBlock callableBlock)
	{
		Parameter parameter = getParameter(callableBlock, 0);
		VariableAccess variableAccess = codeBuilder.createVariableAccess(parameter);
		PropertyAccess firstPropertyAccess = codeBuilder.createPropertyAccess(variableAccess, containerName + "_" + field.getName());
		PropertyAccess secondPropertyAccess = codeBuilder.createPropertyAccess(firstPropertyAccess, "forEach");
		
		Parameter newParameter = codeBuilder.createParameter(containerName);
		CallableBlock arrowFunction = codeBuilder.createArrowFunction("forEach", newParameter);
		Call innerCall = codeBuilder.createInnerCall(secondPropertyAccess, arrowFunction, "forEach");
		
		moveStatements(callableBlock, arrowFunction, innerCall);
		replaceVariableAccess(arrowFunction, containerName, field, parameter, newParameter);
	}

	private void moveStatements(CallableBlock callableBlock, CallableBlock arrowFunction, Call innerCall)
	{
		arrowFunction.getStatements().addAll(callableBlock.getStatements());
		callableBlock.getStatements().clear();
		callableBlock.getStatements().add(innerCall);
	}

	private Parameter getParameter(CallableBlock callableBlock, int parameterNumber)
	{
		List<Parameter> parameters = callableBlock.getParameters();
		if (parameters.size() >= parameterNumber + 1) {
			return parameters.get(parameterNumber);
		}
		
		return null;
	}

	private CallableBlock getArgument(Call nextCall, int argumentNumber)
	{
		List<Argument> arguments = nextCall.getArguments();
		if (arguments.size() >= argumentNumber) {
			Argument argument = arguments.get(argumentNumber);
			DataProducer innerDataProducer = argument.getDataProducer();
			if (innerDataProducer instanceof CallableBlock) {
				return (CallableBlock) innerDataProducer;
			}
		}
		
		return null;
	}

	private void replaceArgument(Call call)
	{
		EList<Argument> arguments = call.getArguments();
		if (arguments.size() > 0) {
			Argument argument = arguments.get(0);
			
			List<Property> targetDataContainer = getTargetingProperties(argument);
			if (targetDataContainer != null) 
			{
				Argument newArgument = codeBuilder.createNewArgument(targetDataContainer);
				arguments.clear();
				arguments.add(newArgument);
			} else {
				arguments.clear();
			}
		}
	}

	private void renameCall(Call call)
	{
		call.setName("find");
		DataProducer dataProducer = call.getDataProducer();
		if (dataProducer instanceof PropertyAccess) {
			PropertyAccess propertyAccess = (PropertyAccess) dataProducer;
			propertyAccess.setName("find");
		}
	}

	private List<Property> getTargetingProperties(Argument argument)
	{
		List<Property> targetDataContainer = null;
		DataProducer dataProducer = argument.getDataProducer();
		if (dataProducer instanceof NewArray) {
			NewArray newArray = (NewArray) dataProducer;
			for (DataProducer arrayDataProducer : newArray.getDataProducer())
			{
				targetDataContainer = getNewDataContainer(targetDataContainer, arrayDataProducer);
			}
		}
			
		return targetDataContainer;
	}

	private List<Property> getNewDataContainer(List<Property> targetDataContainer, DataProducer arrayDataProducer)
	{
		if (arrayDataProducer instanceof NewDataContainer) {
			NewDataContainer newDataContainer = (NewDataContainer) arrayDataProducer;
			DataContainer dataContainer = newDataContainer.getDataContainer();
			Optional<Property> match = dataContainer.getProperties()
					.stream().filter(p -> p.getName().equals("$match")).findFirst();
			if (match.isPresent())  {
				Property property = match.get();
				if (property instanceof DataContainer) {
					DataContainer innerDataContainer = (DataContainer) property;
					targetDataContainer = innerDataContainer.getProperties();
				}
			} 
		}
		
		return targetDataContainer;
	}

	private void replaceVariableAccess(CallableBlock arrowFunction, String containerName, Field field, Parameter oldParameter, Parameter newParameter)
	{
		processStatements(arrowFunction, containerName, field, oldParameter, newParameter);		
	}

	private void processStatements(CallableBlock callableBlock, String containerName, Field field, Variable variable, Parameter newParameter)
	{
			List<Statement> statements = callableBlock.getStatements();
		for (Statement innerStatement : statements)
		{
			if (innerStatement instanceof CallableBlock) {
				CallableBlock callableBlock2 = (CallableBlock) innerStatement;
				processStatements(callableBlock2, containerName, field, variable, newParameter);
			} else if (innerStatement instanceof Call) {
				Call call = (Call) innerStatement;
				for (Argument argument : call.getArguments())
				{
					processDataProducer(argument.getDataProducer(), variable.getName(), containerName, field, newParameter);
				}
			}
		}
	}

	private void processDataProducers(List<DataProducer> dataProducers, String targetName, String containerName, Field field, Variable variable)
	{
		for (DataProducer dataProducer : dataProducers)
		{
			processDataProducer(dataProducer, targetName, containerName, field, variable);
		}
	}

	private void processDataProducer(DataProducer dataProducer, String targetName, 
			String containerName, Field field, Variable variable)
	{
		if (dataProducer instanceof Operation) {
			Operation operation = (Operation) dataProducer;
			processDataProducers(operation.getDataProducers(), targetName, containerName, field, variable);
		} else if (dataProducer instanceof PropertyAccess) {
			PropertyAccess propertyAccess = (PropertyAccess) dataProducer;
			if (propertyAccess.getDataProducer() instanceof PropertyAccess) {
				PropertyAccess innerPropertyAccess = (PropertyAccess) propertyAccess.getDataProducer();
			
				if (innerPropertyAccess.getDataProducer() instanceof VariableAccess) {
					VariableAccess variableAccess = (VariableAccess) innerPropertyAccess.getDataProducer();
					
					if (variableAccess.getName().equals(targetName)) {
						variableAccess.setVariable(variable);
						propertyAccess.setDataProducer(variableAccess);
					}
				}
			}
		}
	}

	
}
