package es.um.nosql.code.s13e.transfs.json2code.transf.model.repository;

import java.util.HashMap;
import java.util.Map;

import es.um.nosql.code.s13e.metamodels.code.Code;
import es.um.nosql.code.s13e.metamodels.code.CodeContainer;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.DataContainer;
import es.um.nosql.code.s13e.metamodels.code.PrimitiveType;

public class TypesRepository
{
	private Code code;
	private CodeFactory codeFactory;
	private Map<String, PrimitiveType> primitiveTypes;
	private Map<String, CodeContainer> classes;

	public TypesRepository()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
		this.primitiveTypes = new HashMap<String, PrimitiveType>();
		this.classes = new HashMap<String, CodeContainer>();
	}

	public PrimitiveType getPrimitiveType(String typeName)
	{
		PrimitiveType primitiveType = primitiveTypes.get(typeName);
		if (primitiveType == null)
		{
			primitiveType = codeFactory.createPrimitiveType();
			primitiveType.setType(typeName);

			primitiveTypes.put(typeName, primitiveType);
			code.getTypes().add(primitiveType);
		}
		
		return primitiveType;
	}

	public void saveDataContainerType(DataContainer dataContainer)
	{
		code.getTypes().add(dataContainer);
	}

	public void saveCodeContainerType(CodeContainer codeContainer)
	{
		code.getTypes().add(codeContainer);
	}
	
	public void saveClassType(CodeContainer classContainer)
	{
		CodeContainer codeContainer = classes.get(classContainer.getName());
		if (codeContainer == null)
		{
			classes.put(classContainer.getName(), classContainer);
		}
	}

	public CodeContainer getClassDataContainer(String className)
	{
		return classes.get(className);
	}
	
	public void setCode(Code code)
	{
		this.code = code;
	}
	
}
