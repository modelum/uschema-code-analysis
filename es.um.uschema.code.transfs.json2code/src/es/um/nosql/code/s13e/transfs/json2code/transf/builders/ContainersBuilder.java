package es.um.nosql.code.s13e.transfs.json2code.transf.builders;

import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.Code;
import es.um.uschema.code.metamodels.code.CodeBlock;
import es.um.uschema.code.metamodels.code.CodeBlockType;
import es.um.uschema.code.metamodels.code.CodeContainer;
import es.um.uschema.code.metamodels.code.CodeContainerType;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.Container;
import es.um.uschema.code.metamodels.code.ContainerType;
import es.um.uschema.code.metamodels.code.DataContainer;

public class ContainersBuilder {
	
	private CodeFactory codeFactory;
	private CodeModelRepository codeModelRepository;
	
	public ContainersBuilder(CodeModelRepository codeModelRepository) {
		this.codeFactory = CodeFactory.eINSTANCE;
		this.codeModelRepository = codeModelRepository;
	}
	
	public Code createCode(String language) {
		Code code = codeFactory.createCode();
		code.setLanguage(language);
		
		return code;
	}
	
	public Code createCodeAndSave(String language) {
		Code code = createCode(language);
		codeModelRepository.saveCode(code);
		
		return code;
	}

	public Container createContainer(String name, ContainerType containerType) {
		Container container = codeFactory.createContainer();
		container.setName(name);
		container.setType(containerType);
		
		return container;
	}
	
	public void createContainerAndSave(String name, ContainerType containerType) {
		Container container = createContainer(name, containerType);
		if (containerType.equals(ContainerType.FOLDER))
			codeModelRepository.saveFolderContainer(container);
		else
			codeModelRepository.saveContainer(container);
	}

	public CodeContainer createCodeContainer(CodeContainerType codeContainerType) {
		CodeContainer codeContainer = codeFactory.createCodeContainer();
		codeContainer.setType(codeContainerType);
		
		return codeContainer;
	}

	public void createCodeContainerAndSave(CodeContainerType codeContainerType) {
		CodeContainer codeContainer = createCodeContainer(codeContainerType);
		codeModelRepository.saveCodeContainer(codeContainer);
	}

	public CodeBlock createCodeBlock(CodeBlockType codeBlockType) {
		CodeBlock codeBlock = codeFactory.createCodeBlock();
		codeBlock.setCodeBlockType(codeBlockType);
		
		return codeBlock;
	}

	public CodeBlock createAndSaveCodeBlock(CodeBlockType codeBlockType) {
		CodeBlock codeBlock = createCodeBlock(codeBlockType);
		codeModelRepository.saveCodeBlock(codeBlock);
		
		return codeBlock;
	}
	
	public CallableBlock createCallableBlock(CodeBlockType codeBlockType) {
		CallableBlock callableBlock = codeFactory.createCallableBlock();
		callableBlock.setCodeBlockType(codeBlockType);
		
		return callableBlock;
	}

	public CallableBlock createAndSaveCallableBlock(CodeBlockType codeBlockType) {
		CallableBlock callableBlock = createCallableBlock(codeBlockType);
		codeModelRepository.saveCallableBlock(callableBlock);
		codeModelRepository.getCallHierarchy().saveCallableBlock(callableBlock);
		
		return callableBlock;
	}

	public CodeContainer createClassContainer(String className)
	{
		CodeContainer classContainer = codeFactory.createCodeContainer();
		classContainer.setDataContainer(createDataContainer(className));
		classContainer.setType(CodeContainerType.CLASS);
		classContainer.setName(className);
		
		return classContainer;
	}

	public DataContainer createDataContainer(String dataContainerName)
	{
		DataContainer dataContainer = codeFactory.createDataContainer();
		dataContainer.setName(dataContainerName);
		
		return dataContainer;
	}

	public CodeContainer createAndSaveClassContainer(String className)
	{
		CodeContainer classContainer = createClassContainer(className);
		codeModelRepository.saveClassCodeContainer(classContainer);
		
		return classContainer;
	}

}
