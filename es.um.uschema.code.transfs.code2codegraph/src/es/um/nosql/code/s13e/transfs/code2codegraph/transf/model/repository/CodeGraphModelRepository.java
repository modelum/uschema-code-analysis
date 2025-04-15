package es.um.nosql.code.s13e.transfs.code2codegraph.transf.model.repository;

import java.util.HashMap;
import java.util.Map;

import es.um.uschema.code.metamodels.codeGraph.CodeGraph;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.codeGraph.CallableBlockSubGraph;
import es.um.uschema.code.metamodels.codeGraph.CodeBlockSubGraph;

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

	public CallableBlockSubGraph saveCallableBlockSubGraph(CallableBlockSubGraph callableBlockFlow)
	{
		CallableBlock callableBlock = callableBlockFlow.getCallableBlock();

		if (!callableBlockFlows.containsKey(callableBlock))
		{
			callableBlockFlows.put(callableBlock, callableBlockFlow);
			application.getSubGrahps().add(callableBlockFlow);
		}
		return callableBlockFlows.get(callableBlock);
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
