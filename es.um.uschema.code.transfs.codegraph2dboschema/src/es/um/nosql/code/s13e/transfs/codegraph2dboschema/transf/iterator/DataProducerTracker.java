package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator;

import es.um.nosql.code.s13e.metamodels.code.Argument;
import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.Literal;
import es.um.nosql.code.s13e.metamodels.code.PropertyAccess;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;

public class DataProducerTracker
{
	private ArgumentTracker argumentTracker;

	public DataProducerTracker(ArgumentTracker argumentTracker)
	{
		this.argumentTracker = argumentTracker;
	}

	public String track(Node node, DataProducer dataProducer)
	{
		if (dataProducer instanceof PropertyAccess)
		{
			PropertyAccess propertyAccess = (PropertyAccess) dataProducer;
			DataProducer objectAccess = propertyAccess.getDataProducer();
			if (objectAccess instanceof VariableAccess)
			{
				return track(node, (VariableAccess) objectAccess);
			} else if (objectAccess instanceof Call)
			{
				return getCallArgument(objectAccess);
			}
		} else if (dataProducer instanceof VariableAccess)
		{
			VariableAccess variableAccess = (VariableAccess) dataProducer;
			return argumentTracker.trackVariableBackwards(node, variableAccess.getVariable());
		}
		
		return null;
	}

	private String getCallArgument(DataProducer objectAccess)
	{
		Call call = (Call) objectAccess;
		for (Argument argument : call.getArguments())
		{
			DataProducer argumentDataProducer = argument.getDataProducer();
			if (argumentDataProducer instanceof Literal) {
				Literal literal = (Literal) argumentDataProducer;
				return literal.getLiteral();
				
			}
		}
		
		return null;
	}

}
