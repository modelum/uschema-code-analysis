package es.um.nosql.code.s13e.transfs.code2codegraph.transf;

import es.um.nosql.code.s13e.metamodels.code.Code;
import es.um.nosql.code.s13e.metamodels.code.utils.CodeReader;
import es.um.nosql.code.s13e.metamodels.codeGraph.utils.CodeGraphWriter;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.analyzers.CodeAnalyzer;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.builders.CodeGraphBuilder;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.iterators.CodeIterator;
import es.um.nosql.code.s13e.transfs.code2codegraph.transf.model.repository.CodeGraphModelRepository;

public class Code2CodeGraph 
{
	private CodeGraphModelRepository codeGraphModelRepository;
	private CodeGraphBuilder codeGraphBuilder;
	private CodeAnalyzer codeAnalyzer;
	private CodeIterator codeIterator;

	public Code2CodeGraph()
	{
		this.codeGraphModelRepository = new CodeGraphModelRepository();
		this.codeGraphBuilder = new CodeGraphBuilder(codeGraphModelRepository);
		this.codeAnalyzer = new CodeAnalyzer(codeGraphBuilder, codeGraphModelRepository);
		this.codeIterator = new CodeIterator(codeAnalyzer, codeGraphBuilder, codeGraphModelRepository);
		this.codeAnalyzer.setCodeIterator(codeIterator);
	}

	public void code2codeGraph(Code code) 
	{
		codeIterator.processCode(code);
		codeGraphModelRepository.solveUnprocessedCalls();
	}
	
	public void code2codeGraph(String inputFileName, String outputsUri) 
	{
		Code code = new CodeReader().readCodeModel(inputFileName);
		code2codeGraph(code);
		new CodeGraphWriter(code, codeGraphModelRepository.getApplication()).printToXmi(outputsUri);
	}
}
