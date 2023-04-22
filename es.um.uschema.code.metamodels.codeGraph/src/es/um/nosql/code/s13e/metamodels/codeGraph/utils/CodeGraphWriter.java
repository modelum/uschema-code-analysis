package es.um.nosql.code.s13e.metamodels.codeGraph.utils;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import es.um.nosql.code.s13e.metamodels.code.Code;
import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphPackage;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class CodeGraphWriter
{
	private Code code;
	private CodeGraph codeGraph;

	public CodeGraphWriter(Code code, CodeGraph codeGraph)
	{
		this.code = code;
		this.codeGraph = codeGraph;
	}

	/**
	 * Prints a Model at the URI
	 * 
	 * @param outputName
	 */
	public void printToXmi(String outputUri)
	{
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = reg.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(CodePackage.eNS_URI, CodePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(CodeGraphPackage.eNS_URI, CodeGraphPackage.eINSTANCE);

		Resource resource = resourceSet.createResource(URI.createFileURI(outputUri));
		resource.getContents().add(code);
		resource.getContents().add(codeGraph);

		try
		{
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
