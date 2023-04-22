package es.um.nosql.code.s13e.transfs.json2code.transf.model.repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeContainer;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.Variable;

public class VariablesRepository {

	private CodeModelRepository codeModelRepository;
	private CodeFactory codeFactory;
	private Map<String, String> classContainingVariables;

	public VariablesRepository(CodeModelRepository codeModelRepository) {
		this.codeModelRepository = codeModelRepository;
		this.codeFactory = CodeFactory.eINSTANCE;
		this.classContainingVariables = new HashMap<String, String>();
	}

	public Variable getVariable(String name) {
		if (name == null || name.isEmpty()) return null;
		
		List<CodeBlock> codeBlocks = new LinkedList<CodeBlock>();
		CodeContainer codeContainer = getAllCodeBlocks(codeBlocks);
		
		Variable variable = searchVariableInCodeBlocks(name, codeBlocks, codeContainer);
		if (variable != null) {
			return variable;
		} else {
			return createNewVariable(name);
		}
		
	}

	private Variable searchVariableInCodeBlocks(String name, List<CodeBlock> codeBlocks, CodeContainer codeContainer) {
		// New last Code Block
		CodeBlock temporallyLastCodeBlock = codeModelRepository.getTemporallyLastCodeBlock();
		if (temporallyLastCodeBlock != null) {
			for (Variable variable : temporallyLastCodeBlock.getVariables()) {
				if (name.equals(variable.getName())) {
					return variable;
				}
			}
		}
		
		// Parents CodeBlocks
		for (CodeBlock codeBlock : codeBlocks) {
			EList<Variable> variables = codeBlock.getVariables();
			for (Variable variable : variables) {
				if (name.equals(variable.getName())) {
					return variable;
				}
			}
		}
		
		// CodeContainer
		if (codeContainer != null) {
			for (Variable variable : codeContainer.getVariable()) {
				if (name.equals(variable.getName())) {
					return variable;
				}			
			}
		}
		
		return null;
	}

	private Variable createNewVariable(String name) {
		Variable variable = codeFactory.createVariable();
		variable.setName(name);
		
		CodeBlock temporallyLastCodeBlock = codeModelRepository.getTemporallyLastCodeBlock();
		if (temporallyLastCodeBlock != null) {
			temporallyLastCodeBlock.getVariables().add(variable);
		} else {
			CodeBlock lastCodeBlock = codeModelRepository.getLastCodeBlock();
			lastCodeBlock.getVariables().add(variable);
		}
		
		return variable;
	}

	private CodeContainer getAllCodeBlocks(List<CodeBlock> codeBlocks) {
		CodeContainer codeContainer = null;
		EObject lastCodeBlock = codeModelRepository.getLastCodeBlock();
		
		while(lastCodeBlock != null) {
			if (lastCodeBlock instanceof CodeBlock) {
				codeBlocks.add((CodeBlock) lastCodeBlock);
			} else if (lastCodeBlock instanceof CodeContainer) {
				codeContainer = (CodeContainer) lastCodeBlock;
			}
			lastCodeBlock = lastCodeBlock.eContainer();
		}

		return codeContainer;
	}

	public void saveClassContainingVariable(String className, String variableName)
	{
		classContainingVariables.put(variableName, className);
	}

	public String getClassName(String variableName)
	{
		return classContainingVariables.get(variableName);
	}

}
