package es.um.uschema.code.metamodels.code.utils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import es.um.uschema.code.metamodels.code.Code;
import es.um.uschema.code.metamodels.code.CodePackage;

public class CodeReader
{
	private Code code;

	/**
	 * Reads a Model from the URI
	 * 
	 * @param outputName
	 */
	public Code readCodeModel(String inputFileName)
	{
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getPackageRegistry().put(CodePackage.eNS_URI, CodePackage.eINSTANCE);

		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource r = rSet.getResource(URI.createFileURI(inputFileName), true);
		code = (Code) r.getContents().get(0);

		return code;
	}

	public Code getCode()
	{
		return code;
	}
}
