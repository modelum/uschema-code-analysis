package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator;

import java.util.LinkedList;
import java.util.List;

import es.um.nosql.code.s13e.metamodels.code.Assignable;
import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.Literal;
import es.um.nosql.code.s13e.metamodels.code.NewArray;
import es.um.nosql.code.s13e.metamodels.code.PrimitiveType;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.code.VariableDeclaration;
import es.um.nosql.code.s13e.metamodels.codeGraph.Node;

public class VariableBackwardTracker extends BackwardTracker
{
	private PrimitiveType type;
	private List<Call> callsList;
	
	public VariableBackwardTracker()
	{
		this.callsList = new LinkedList<Call>();
	}
	
	public PrimitiveType trackVariableBackwardsForType(Node node, Variable variable)
	{
		type = null;
		trackBackwards(node, variable);
		
		return type;
	}

	@Override
	public Node processNodeWithExpectedVariable(Node node, Variable variable)
	{
		Statement statement = node.getStatement();
		
		if (statement instanceof Literal)
		{
			return trackBackwards(node, variable);
		} else if (statement instanceof VariableDeclaration)
		{
			VariableDeclaration variableDeclaration = (VariableDeclaration) statement;
			Assignable initialization = variableDeclaration.getInitialization();
			if (initialization instanceof Literal) 
			{
				type = ((Literal) initialization).getType();
				return node;
			}
		} else if (statement instanceof NewArray)
		{
			return node;
		} else if (statement instanceof Call)
		{
//			type = CodeFactory.eINSTANCE.createPrimitiveType();
//			type.setType("Object");
			callsList.add((Call) statement);
			
			return node;
		} else {
			return trackBackwards(node, variable);
		}
		
		return node;
	}
	
	
	public List<Call> getCallsList()
	{
		return callsList;
	}
	
	public void clearCallsList()
	{
		callsList.clear();
	}
	
}
