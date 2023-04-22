package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import es.um.nosql.code.s13e.metamodels.code.Argument;
import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.Literal;
import es.um.nosql.code.s13e.metamodels.code.NewArray;
import es.um.nosql.code.s13e.metamodels.code.NewDataContainer;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.metamodels.code.VariableDeclaration;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation;

public class ArgumentTracker
{
	private VariableBackwardTracker variableTracker;
	private String targetLiteral;

	public ArgumentTracker(VariableBackwardTracker variableTracker)
	{
		this.variableTracker = variableTracker;
	}
	
	public Statement track(DatabaseOperation databaseOperation, Statement statement, Node sourceNode)
	{
		if (statement instanceof NewDataContainer || statement instanceof NewArray) 
		{
			return statement;
		} else if (statement instanceof VariableAccess)
		{
			VariableAccess variableAccess = (VariableAccess) statement;
			Node newNode = variableTracker.trackBackwards(sourceNode, variableAccess.getVariable());
			
			Statement nodeStatement = newNode.getStatement();
			if (nodeStatement instanceof NewArray) 
			{
				NewArray newArray = (NewArray) nodeStatement;
				EObject eContainer = newArray.eContainer();
				if (eContainer instanceof VariableDeclaration) 
				{
					return newArray;
				} else if (eContainer instanceof Statement){
					return track(databaseOperation, (Statement) eContainer, newNode);
				}
			} else if (nodeStatement instanceof NewDataContainer || nodeStatement instanceof VariableDeclaration) {
				return nodeStatement;
			}
		}
		
		return null;
	}

	private Node trackArgumentsBackwards(Node sourceNode, List<Argument> arguments)
	{
		for (Argument argument : arguments)
		{
			DataProducer dataProducer = argument.getDataProducer();
			if (dataProducer instanceof VariableAccess)
			{
				VariableAccess variableAccess = (VariableAccess) dataProducer;
				Variable variable = variableAccess.getVariable();
				trackVariableBackwards(sourceNode, variable);
				return sourceNode;
			}
		}
		
		return null;
	}

	public String trackVariableBackwards(Node node, Variable variable)
	{
		targetLiteral = null;
		node.getIncomingEdges().forEach(edge -> {
			Node sourceNode = edge.getSource();
			if (sourceNode.getVariables().contains(variable))
			{
				Node newNode = processNodeWithExpectedVariable(sourceNode);
				if (newNode == null) 
					trackVariableBackwards(sourceNode, variable);
			} else {
				trackVariableBackwards(sourceNode, variable);
			}
		});
		
		return targetLiteral;
	}

	private Node processNodeWithExpectedVariable(Node sourceNode)
	{
		Statement statement = sourceNode.getStatement();

		EObject eObject = statement.eContainer();
		if (eObject instanceof VariableDeclaration)
		{
			if (statement instanceof Literal) 
			{
				targetLiteral = ((Literal) statement).getLiteral();
				return sourceNode;
			} else if (statement instanceof Call)
			{
				return processCall(sourceNode, statement);
			}
		} 
		
		return null;
	}

	private Node processCall(Node sourceNode, Statement statement)
	{
		Call call = (Call) statement;
		for (Argument argument : call.getArguments())
		{
			DataProducer dataProducer = argument.getDataProducer();
			if (dataProducer instanceof Literal) 
			{
				targetLiteral = ((Literal) dataProducer).getLiteral();
				return sourceNode;
			}
		}
		
		return trackArgumentsBackwards(sourceNode, call.getArguments());
	}
	
}
