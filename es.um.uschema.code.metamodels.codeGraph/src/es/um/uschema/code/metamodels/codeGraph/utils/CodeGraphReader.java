package es.um.uschema.code.metamodels.codeGraph.utils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import es.um.uschema.code.metamodels.codeGraph.CodeGraph;
import es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage;
import es.um.uschema.code.metamodels.code.Code;
import es.um.uschema.code.metamodels.code.CodePackage;

public class CodeGraphReader
{
	private Code code;
	private CodeGraph codeGraph;

	/**
	 * Reads a Model from the URI
	 * 
	 * @param outputName
	 */
	public CodeGraph readCodeGraphModel(String inputFileName) {
			ResourceSet rSet = new ResourceSetImpl();
			rSet.getPackageRegistry().put(CodePackage.eNS_URI, CodePackage.eINSTANCE);
			rSet.getPackageRegistry().put(CodeGraphPackage.eNS_URI, CodeGraphPackage.eINSTANCE);
			
			rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			Resource r = rSet.getResource(URI.createFileURI(inputFileName), true);
			code = (Code) r.getContents().get(0);
			codeGraph = (CodeGraph) r.getContents().get(1);
			
			return codeGraph;
	}

	public Code getCode()
	{
		return code;
	}
	
	public CodeGraph getCodeGraph()
	{
		return codeGraph;
	}

}
