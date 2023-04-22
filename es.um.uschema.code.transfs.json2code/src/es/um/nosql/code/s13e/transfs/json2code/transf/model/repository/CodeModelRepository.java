package es.um.nosql.code.s13e.transfs.json2code.transf.model.repository;

import org.eclipse.emf.ecore.EObject;

import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.Code;
import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeContainer;
import es.um.nosql.code.s13e.metamodels.code.Container;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.ContainersBuilder;

public class CodeModelRepository
{

	private ContainersBuilder codeBuilder;
	private Code code;
	private Container lastContainer;
	private CodeContainer lastCodeContainer;
	private CodeContainer lastClassCodeContainer;
	private CodeBlock lastCodeBlock;
	private CodeBlock temporallyLastCodeBlock;

	private VariablesRepository variableRepository;
	private CallHierarchy callHierarchy;
	private CallableBlock lastCallableCodeBlock;
	private TypesRepository typeRepository;
	private Container folderContainer;

	public CodeModelRepository()
	{
		this.variableRepository = new VariablesRepository(this);
		this.callHierarchy = new CallHierarchy(this);
		this.typeRepository = new TypesRepository();
	}

	public void saveCode(Code code)
	{
		this.code = code;
		this.typeRepository.setCode(code);
	}

	public Code getCode()
	{
		return code;
	}

	public void saveContainer(Container container)
	{
		if (lastContainer == null)
		{
			code.getContainer().add(container);
		} else
		{
			lastContainer.getSubContainer().add(container);
		}

		lastContainer = container;
	}


	public void saveFolderContainer(Container container) {
		if (lastContainer == null)
		{
			code.getContainer().add(container);
		} else
		{
			lastContainer.getSubContainer().add(container);
		}

		lastContainer = container;
		folderContainer = container;
	}

	public void parentContainer()
	{
		EObject newLastContainer = lastContainer.eContainer();
		while (newLastContainer != null && !(newLastContainer instanceof Container))
		{
			newLastContainer = newLastContainer.eContainer();
		}

		if (newLastContainer instanceof Container)
		{
			lastContainer = (Container) newLastContainer;
		}
	}

	public void saveCodeContainer(CodeContainer codeContainer)
	{
		lastContainer.getCodeContainer().add(codeContainer);
		lastCodeContainer = codeContainer;
	}

	public void saveClassCodeContainer(CodeContainer codeContainer)
	{
		lastContainer.getCodeContainer().add(codeContainer);
	}

	public void saveCodeBlock(CodeBlock codeBlock)
	{
		lastCodeContainer.getCodeBlock().add(codeBlock);
		setLastCodeBlock(codeBlock);
	}

	public void setLastCodeBlock(CodeBlock codeBlock)
	{
		lastCodeBlock = codeBlock;
		temporallyLastCodeBlock = null;
	}

	public void clearTemporallyCodeBlock()
	{
		temporallyLastCodeBlock = null;
	}

	public void saveCallableBlock(CallableBlock callableBlock)
	{
		lastCallableCodeBlock = callableBlock;
		saveCodeBlock(callableBlock);
	}

	public void saveTemporallyCodeBlock(CodeBlock codeBlock)
	{
		temporallyLastCodeBlock = codeBlock;
	}

	public CodeBlock getTemporallyLastCodeBlock()
	{
		return temporallyLastCodeBlock;
	}

	public CodeBlock getLastCodeBlock()
	{
		return lastCodeBlock;
	}

	public CallableBlock getLastCallableBlock()
	{
		return lastCallableCodeBlock;
	}

	public CodeBlock getBestCodeBlockChoice()
	{
		if (temporallyLastCodeBlock != null)
		{
			return temporallyLastCodeBlock;
		} else
		{
			return lastCodeBlock;
		}
	}

	public VariablesRepository getVariablesRepository()
	{
		return variableRepository;
	}

	public void setCodeBuilder(ContainersBuilder codeBuilder)
	{
		this.codeBuilder = codeBuilder;
	}

	public ContainersBuilder getCodeBuilder()
	{
		return codeBuilder;
	}

	public CallHierarchy getCallHierarchy()
	{
		return callHierarchy;
	}

	public void resolveUnprocessedCalls()
	{
		callHierarchy.resolveUnprocessedCalls();
	}

	public TypesRepository getType()
	{
		return typeRepository;
	}
	
	public void setLastClassContainer(CodeContainer classCodeContainer)
	{
		this.lastClassCodeContainer = classCodeContainer;
	}

	public CodeContainer getLastClassContainer()
	{
		return lastClassCodeContainer;
	}

	public void resetFoldercontainer() {
		this.lastContainer = folderContainer;
	}


}
