package es.um.nosql.code.s13e.transfs.json2code.transf.model.repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import es.um.nosql.code.s13e.metamodels.code.Argument;
import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeContainer;
import es.um.nosql.code.s13e.metamodels.code.Parameter;

public class CallHierarchy
{

	private List<CallableBlock> callableBlocks;
	private Map<String, List<Call>> unprocessedCalls;
	private CodeModelRepository codeModelRepository;

	public CallHierarchy(CodeModelRepository codeModelRepository)
	{
		this.callableBlocks = new LinkedList<CallableBlock>();
		this.unprocessedCalls = new HashMap<String, List<Call>>();
		this.codeModelRepository = codeModelRepository;
	}

	public CallableBlock saveCallableBlock(CallableBlock callableBlock)
	{
		callableBlocks.add(callableBlock);
		return callableBlock;
	}

	public void setUnprocessedCall(String callableBlockName, Call call)
	{
		List<Call> calls = unprocessedCalls.get(callableBlockName);
		if (calls == null)
		{
			calls = new LinkedList<Call>();
			unprocessedCalls.put(callableBlockName, calls);
		}

		calls.add(call);
	}

	public void resolveUnprocessedCalls()
	{
		Map<String, CallableBlock> callables = callableBlocks.stream()
				.collect(Collectors.toMap(c -> generateCallName(c), c -> c));

		unprocessedCalls.entrySet().forEach(entrySet -> {
			String functionName = entrySet.getKey();

			entrySet.getValue().forEach(call -> {
				String callName = generateCallName(functionName, call);
				CallableBlock callableBlock = callables.get(callName);

				if (callableBlock != null)
				{
					call.setCallableBlock(callableBlock);
					call.setName(callName);
					processArguments(call, callableBlock);
				} else
				{
					processMethodAccess(call, functionName);
				}
			});
		});
	}

	private void processMethodAccess(Call call, String callName)
	{
 		if (callName.contains("."))
		{
			String identifierName = callName.substring(0,  callName.indexOf('.'));
			String propertyName = callName.substring(callName.indexOf('.') + 1);
			if (identifierName != null && propertyName != null)
			{
				String className = codeModelRepository.getVariablesRepository().getClassName(identifierName);
				CodeContainer classDataContainer = codeModelRepository.getType().getClassDataContainer(className);
				if (className != null && classDataContainer != null)
				{
					Optional<CallableBlock> method = classDataContainer.getCodeBlock().stream()
						.filter(CallableBlock.class::isInstance).map(CallableBlock.class::cast)
						.filter(cb -> propertyName.equals(cb.getName())).findFirst();
					if (method.isPresent())
					{
						call.setCallableBlock(method.get());
					}
				}
			}
		}
	}

	private String generateCallName(CallableBlock callableBlock)
	{
		return callableBlock.getName() + "(" + callableBlock.getParameters().size() + " parameters)";
	}

	private String generateCallName(String callableBlockName, Call call)
	{
		return callableBlockName + "(" + call.getArguments().size() + " parameters)";
	}

	private void processArguments(Call call, CallableBlock callableBlock)
	{
		EList<Parameter> parameters = callableBlock.getParameters();
		EList<Argument> arguments = call.getArguments();

		for (int i = 0; i < parameters.size() && i < arguments.size(); i++)
		{
			Parameter parameter = parameters.get(i);
			Argument argument = arguments.get(i);

			argument.setParameter(parameter);
		}
	}

	public CallableBlock getCall(String name)
	{
		Optional<CallableBlock> findFirst = callableBlocks.stream().filter(c -> c.getName().equals(name)).findFirst();
		return findFirst.isPresent() ? findFirst.get() : null;
	}

}
