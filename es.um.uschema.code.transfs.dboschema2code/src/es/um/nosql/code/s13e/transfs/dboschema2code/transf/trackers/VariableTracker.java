package es.um.nosql.code.s13e.transfs.dboschema2code.transf.trackers;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import es.um.nosql.code.s13e.metamodels.code.Argument;
import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.Parameter;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperation;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Read;

public class VariableTracker
{
	public Variable getVariable(Read read)
	{
		List<DatabaseOperation> precedingDatabaseOperation = read.getPrecedingDatabaseOperation();
		if (precedingDatabaseOperation.size() > 0) {
			DatabaseOperation databaseOperation = precedingDatabaseOperation.get(0);
			Statement statement = databaseOperation.getStatement();
			if (statement instanceof Call) {
				Call call = (Call) statement;
				EList<Argument> arguments = call.getArguments();
				if (arguments.size() >= 2) 
				{
					return searchVariableInArguments(arguments);
				}
			}
			
		}
		
		return null;
	}

	public Variable searchVariableInArguments(EList<Argument> arguments)
	{
		Argument argument = arguments.get(1);
		DataProducer dataProducer = argument.getDataProducer();
		if (dataProducer instanceof CallableBlock) {
			CallableBlock callableBlock = (CallableBlock) dataProducer;
			EList<Parameter> parameters = callableBlock.getParameters();
			if (parameters.size() >= 2) {
				Parameter parameter = parameters.get(1);
				return parameter;
			}
			
		}
		
		return null;
	}
}
