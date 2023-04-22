package es.um.nosql.code.s13e.transfs.json2code.transf;

import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Code;
import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeBlockType;
import es.um.nosql.code.s13e.metamodels.code.CodeContainerType;
import es.um.nosql.code.s13e.metamodels.code.ContainerType;
import es.um.nosql.code.s13e.metamodels.code.utils.CodeWriter;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.ContainersBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.iterators.JSONFileIterator;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class Json2Code
{

	private CodeModelRepository codeModelRepository;
	private ContainersBuilder containersBuilder;
	private JSONAnalyzer jsonAnalyzer;
	private JSONFileIterator jsonIterator;
	private WarningRepository warningRepository;

	public Json2Code()
	{
		this.warningRepository = new WarningRepository();
		this.codeModelRepository = new CodeModelRepository();
		this.containersBuilder = new ContainersBuilder(codeModelRepository);
		this.jsonAnalyzer = new JSONAnalyzer(warningRepository, codeModelRepository);
		this.jsonIterator = new JSONFileIterator(warningRepository, jsonAnalyzer, codeModelRepository);

		codeModelRepository.setCodeBuilder(containersBuilder);
		containersBuilder.createCodeAndSave("JavaScript");
	}

	public void processFile(JSONObject jsonObject, String fileName)
	{
		containersBuilder.createContainerAndSave(fileName, ContainerType.FILE);
		containersBuilder.createCodeContainerAndSave(CodeContainerType.SCRIPT);
		CodeBlock inlineCodeBlock = containersBuilder.createAndSaveCodeBlock(CodeBlockType.INLINE_CODE);
		jsonIterator.processFile(jsonObject, inlineCodeBlock);
		codeModelRepository.resolveUnprocessedCalls();
		codeModelRepository.resetFoldercontainer();
	}

	public Code getResultRoot()
	{
		return codeModelRepository.getCode();
	}

	public void createFolder(String folderName)
	{
		containersBuilder.createContainerAndSave(folderName, ContainerType.FOLDER);
	}

	public void leaveFolder()
	{
		codeModelRepository.parentContainer();
	}

	public void printWarnings()
	{
		warningRepository.printAll();
	}

	public CodeWriter getCodePrinter()
	{
		return new CodeWriter(codeModelRepository.getCode());
	}

}