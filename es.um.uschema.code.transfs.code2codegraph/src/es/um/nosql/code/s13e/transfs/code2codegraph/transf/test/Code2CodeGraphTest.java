package es.um.nosql.code.s13e.transfs.code2codegraph.transf.test;

import es.um.nosql.code.s13e.transfs.code2codegraph.transf.Code2CodeGraph;

public class Code2CodeGraphTest
{
	public static void main(String[] args)
	{
		Code2CodeGraph code2codeGraph = new Code2CodeGraph();
		code2codeGraph.code2codeGraph("inputs/codeModel.xmi", "outputs/codeGraphModel.xmi");
	}

}
