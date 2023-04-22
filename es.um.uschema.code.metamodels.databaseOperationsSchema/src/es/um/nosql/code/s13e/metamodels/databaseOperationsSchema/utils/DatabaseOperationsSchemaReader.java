package es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.utils;

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

public class DatabaseOperationsSchemaReader
{
	private Code code;
	private CodeGraph codeGraph;
	private DatabaseOperationsSchema databaseOperationsSchema;

	/**
	 * Reads a Model from the URI
	 * 
	 * @param outputName
	 */
	public DatabaseOperationsSchema readDBOSchemaModel(String inputFileName)
	{
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getPackageRegistry().put(CodePackage.eNS_URI, CodePackage.eINSTANCE);
		rSet.getPackageRegistry().put(CodeGraphPackage.eNS_URI, CodeGraphPackage.eINSTANCE);
		rSet.getPackageRegistry().put(DatabaseOperationsSchemaPackage.eNS_URI,
				DatabaseOperationsSchemaPackage.eINSTANCE);

		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource r = rSet.getResource(URI.createFileURI(inputFileName), true);
		code = (Code) r.getContents().get(0);
		codeGraph = (CodeGraph) r.getContents().get(1);
		databaseOperationsSchema = (DatabaseOperationsSchema) r.getContents().get(2);

		return databaseOperationsSchema;
	}

	public Code getCode()
	{
		return code;
	}

	public CodeGraph getCodeGraph()
	{
		return codeGraph;
	}

	public DatabaseOperationsSchema getDatabaseOperationsSchema()
	{
		return databaseOperationsSchema;
	}

}
