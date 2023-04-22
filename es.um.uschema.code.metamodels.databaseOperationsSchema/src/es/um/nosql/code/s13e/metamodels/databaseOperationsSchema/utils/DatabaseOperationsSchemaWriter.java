package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.utils;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import es.um.nosql.code.s13e.metamodels.code.Code;
import es.um.nosql.code.s13e.metamodels.code.CodePackage;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraph;
import es.um.nosql.code.s13e.metamodels.codeGraph.CodeGraphPackage;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchema;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchemaPackage;

public class DatabaseOperationsSchemaWriter
{
	private Code code;
	private CodeGraph codeGraph;
	private DatabaseOperationsSchema databaseOperationsSchema;

	public DatabaseOperationsSchemaWriter(Code code, CodeGraph codeGraph, DatabaseOperationsSchema databaseOperationsSchema)
	{
		this.code = code;
		this.codeGraph = codeGraph;
		this.databaseOperationsSchema = databaseOperationsSchema;
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
		resourceSet.getPackageRegistry().put(DatabaseOperationsSchemaPackage.eNS_URI, DatabaseOperationsSchemaPackage.eINSTANCE);

		Resource resource = resourceSet.createResource(URI.createFileURI(outputUri));
		resource.getContents().add(code);
		resource.getContents().add(codeGraph);
		resource.getContents().add(databaseOperationsSchema);

		try
		{
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
