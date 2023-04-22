package es.um.nosql.code.s13e.transfs.code2codegraph.transf.model.repository;

import java.util.HashMap;
import java.util.Map;

import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CallableBlockSubGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeBlockSubGraph;

public class CodeGraphModelRepository
{

	private CodeGraph application;
	private Map<CallableBlock, CallableBlockSubGraph> callableBlockFlows;
	private CallHierarchy callHierarchy;

	public CodeGraphModelRepository()
	{
		this.callableBlockFlows = new HashMap<CallableBlock, CallableBlockSubGraph>();
		this.callHierarchy = new CallHierarchy(this);
	}

	public void saveApplication(CodeGraph application)
	{
		this.application = application;
	}

	public CodeGraph getApplication()
	{
		return application;
	}

	public void saveCallableBlockSubGraph(CallableBlockSubGraph callableBlockFlow)
	{
		CallableBlock callableBlock = callableBlockFlow.getCallableBlock();

		if (!callableBlockFlows.containsKey(callableBlock))
		{
			callableBlockFlows.put(callableBlock, callableBlockFlow);
			application.getSubGrahps().add(callableBlockFlow);
		}
	}

	public void saveCodeBlockSubGraph(CodeBlockSubGraph codeBlockFlow)
	{
		application.getSubGrahps().add(codeBlockFlow);
	}

	public CallHierarchy getCallHierarchy()
	{
		return callHierarchy;
	}

	public void solveUnprocessedCalls()
	{
		callHierarchy.solveUnprocessedCalls();
	}

}
