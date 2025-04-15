package es.um.nosql.code.s13e.transfs.dboschema2code.transf.rewritters;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import es.um.uschema.code.metamodels.databaseOperationsSchema.Collection;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Composition;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Read;
import es.um.nosql.code.s13e.transfs.dboschema2code.transf.builders.CodeBuilder;
import es.um.nosql.code.s13e.transfs.dboschema2code.transf.trackers.VariableTracker;
import es.um.uschema.code.metamodels.code.Argument;
import es.um.uschema.code.metamodels.code.Call;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.Case;
import es.um.uschema.code.metamodels.code.CodeBlock;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.IndexBasedAccess;
import es.um.uschema.code.metamodels.code.Operation;
import es.um.uschema.code.metamodels.code.Parameter;
import es.um.uschema.code.metamodels.code.PropertyAccess;
import es.um.uschema.code.metamodels.code.Selection;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.Variable;
import es.um.uschema.code.metamodels.code.VariableAccess;

public class FindRewritter
{
	private CodeBuilder codeBuilder;
	private VariableTracker variableTracker;

	public FindRewritter()
	{
		this.variableTracker = new VariableTracker();
		this.codeBuilder = new CodeBuilder();
	}
	
	public void processStatement(Read read, Call call, String containerName, Field field)
	{
		Variable variable = variableTracker.getVariable(read);
		if (variable != null) {
			EObject eContainer = call.eContainer();
			if (eContainer instanceof CodeBlock) {
				CodeBlock codeBlock = (CodeBlock) eContainer;
				moveAndReplaceVariable(containerName, field, variable, call, codeBlock, call);
				codeBlock.getStatements().remove(call);
			}
		}
	}

	private void moveAndReplaceVariable(String containerName, Field field, Variable variable, Statement statement,
			CodeBlock codeBlock, Call call)
	{
		EList<Argument> arguments = call.getArguments();
		if (arguments.size() >= 2) 
		{
			Argument argument = arguments.get(1);
			processInnerCallableBlock(containerName, field, variable, statement, codeBlock, argument);
		}
	}

	private void processInnerCallableBlock(String containerName, Field field, Variable variable, Statement statement,
			CodeBlock codeBlock, Argument argument)
	{
		DataProducer dataProducer = argument.getDataProducer();
		if (dataProducer instanceof CallableBlock) {
			CallableBlock callableBlock = (CallableBlock) dataProducer;
			processStatements(callableBlock, containerName, field, variable);
			codeBlock.getStatements().addAll(
					codeBlock.getStatements().indexOf(statement), 
					callableBlock.getStatements());
		}
	}

	private void processStatements(CallableBlock callableBlock, String containerName, Field field, Variable variable)
	{
		List<Parameter> parameters = callableBlock.getParameters();
		if (parameters.size() >= 2) {
			Parameter parameter = parameters.get(1);
			
			List<Statement> statements = callableBlock.getStatements();
			processStatements(containerName, field, variable, parameter, statements);
		}
	}

	private void processStatements(String containerName, Field field, Variable variable, Parameter parameter,
			List<Statement> statements) {
		for (Statement innerStatement : statements)
		{
			if (innerStatement instanceof CallableBlock) {
				CallableBlock callableBlock2 = (CallableBlock) innerStatement;
				processStatements(callableBlock2, containerName, field, variable);
			} else if (innerStatement instanceof Call) {
				Call call = (Call) innerStatement;
				for (Argument argument : call.getArguments())
				{
					processDataProducer(argument.getDataProducer(), parameter.getName(), containerName, field, variable);
				}
			} else if (innerStatement instanceof Selection) {
				Selection selection = (Selection) innerStatement;
				for (Case ifCase : selection.getCase()) {
					processStatements(containerName, field, variable, parameter, ifCase.getCodeBlock().getStatements());
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

	private void processDataProducer(DataProducer dataProducer, String targetName, String containerName, Field field, Variable variable)
	{
		if (dataProducer instanceof Operation) {
			Operation operation = (Operation) dataProducer;
			processDataProducers(operation.getDataProducers(), targetName, containerName, field, variable);
		} else if (dataProducer instanceof PropertyAccess) {
			PropertyAccess propertyAccess = (PropertyAccess) dataProducer;
			if (propertyAccess.getDataProducer() instanceof VariableAccess) {
				VariableAccess variableAccess = (VariableAccess) propertyAccess.getDataProducer();
				
				if (variableAccess.getName().equals(targetName)) {
					String propertyName = field.getName().toLowerCase() + "_" +  propertyAccess.getName();
					insertPropertyInMiddle(variable, propertyAccess, variableAccess, propertyName, field);
				}
			}
		}
	}

	private void insertPropertyInMiddle(Variable variable, PropertyAccess propertyAccess, VariableAccess variableAccess, String propertyName, Field field)
	{
		propertyAccess.setName(propertyName);
		
		EObject eContainer = field.eContainer();
		if (eContainer instanceof DataStructure) {
			DataStructure dataStructure = (DataStructure) eContainer;
			if (dataStructure.eContainer() instanceof Composition) {
				Composition composition = (Composition) dataStructure.eContainer();
				if (composition.eContainer() instanceof Collection) {
					Collection collection = (Collection) composition.eContainer();
					if (collection.eContainer() instanceof Field) {
						Field embeddedField = (Field) collection.eContainer();
						IndexBasedAccess newIndexBasedAccess = codeBuilder.createNewIndexBasedAccess(propertyAccess, embeddedField.getName(), "0");
						PropertyAccess newPropertyAccess = codeBuilder.createNewPropertyAccess(newIndexBasedAccess, variableAccess, embeddedField.getName());
					}
				} else if (composition.eContainer() instanceof Field) {
					Field embeddedField = (Field) composition.eContainer();
					codeBuilder.createNewPropertyAccess(propertyAccess, variableAccess, embeddedField.getName());
				}
			}
		}
		
		variableAccess.setVariable(variable);
		variableAccess.setName(variable.getName());
	}
}
