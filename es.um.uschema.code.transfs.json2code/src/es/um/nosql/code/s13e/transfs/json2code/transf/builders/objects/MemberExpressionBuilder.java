package es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects;

import java.util.List;
import java.util.Optional;

import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.CodeContainer;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.DataContainer;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.IndexBasedAccess;
import es.um.uschema.code.metamodels.code.Property;
import es.um.uschema.code.metamodels.code.PropertyAccess;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.Type;
import es.um.uschema.code.metamodels.code.Variable;
import es.um.uschema.code.metamodels.code.VariableAccess;

public class MemberExpressionBuilder extends StatementBuilder
{
	private static final String OBJECT_PROPERTY = "object";
	private static final String VALUE_PROPERTY = "value";
	private static final String PROPERTY_PROPERTY = "property";
	private static final String NAME_PROPERTY = "name";
	
	private CodeFactory codeFactory;

	public MemberExpressionBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}
	
	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Boolean computed = jsonObject.optBoolean("computed");
		if (computed != null && computed)
		{
			return processAsArray(jsonObject, jsonAnalyzer, warningRepository);
		} else
		{		
			return processAsObject(jsonObject, jsonAnalyzer, codeModelRepository, warningRepository);
		}
	}

	private List<Statement> processAsArray(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			WarningRepository warningRepository)
	{
		IndexBasedAccess indexBasedAccess = codeFactory.createIndexBasedAccess();
		setVariable(jsonObject, jsonAnalyzer, warningRepository, indexBasedAccess);
		setIndex(jsonObject, jsonAnalyzer, warningRepository, indexBasedAccess);
		
		return ListUtils.toList(indexBasedAccess);
	}

	private void setVariable(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			IndexBasedAccess indexBasedAccess)
	{
		JSONObject object = jsonObject.optJSONObject(OBJECT_PROPERTY);
		if (object != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(object, false);
			if (statements.size() == 1)
			{
				Statement statement = statements.get(0);
				if (statement instanceof VariableAccess)
				{
					VariableAccess variableAccess = (VariableAccess) statement;
					indexBasedAccess.setDataProducer(variableAccess.getVariable());
				} else if (statement instanceof PropertyAccess)
				{
					PropertyAccess propertyAccess = (PropertyAccess) statement;
					indexBasedAccess.setDataProducer(propertyAccess);
				}
			}
		} else
			warningRepository.createPropertyNotFoundWarning(OBJECT_PROPERTY, jsonObject, this.getClass());
	}

	private void setIndex(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			IndexBasedAccess indexBasedAccess)
	{
		JSONObject propertyObject = jsonObject.optJSONObject(PROPERTY_PROPERTY);
		if (propertyObject != null)
		{

			List<Statement> statements = jsonAnalyzer.analyzeStatement(propertyObject, false);
			if (statements.size() == 1)
			{
				Statement statement = statements.get(0);
				if (statement instanceof DataProducer)
				{
					indexBasedAccess.setIndex((DataProducer) statement);
				}
			}
		} else
			warningRepository.createPropertyNotFoundWarning(PROPERTY_PROPERTY, jsonObject, this.getClass());
	}

	private List<Statement> processAsObject(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		PropertyAccess propertyAccess = codeFactory.createPropertyAccess();
		DataProducer insideDataProducer = 
				setObject(jsonObject, jsonAnalyzer, warningRepository, propertyAccess);
		setProperty(jsonObject, warningRepository, codeModelRepository, propertyAccess, insideDataProducer);

		return ListUtils.toList(propertyAccess);
	}

	private DataProducer setObject(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			WarningRepository warningRepository, PropertyAccess propertyAccess)
	{
		DataProducer insideDataProducer = null;

		JSONObject object = jsonObject.optJSONObject(OBJECT_PROPERTY);
		if (object != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(object, false);
			if (statements.size() == 1)
			{
				Statement statement = statements.get(0);
				if (statement instanceof DataProducer)
				{
					propertyAccess.setDataProducer((DataProducer) statement);
					insideDataProducer = (DataProducer) statement;
				}
			}
		} else
			warningRepository.createPropertyNotFoundWarning(OBJECT_PROPERTY, jsonObject, this.getClass());
		
		return insideDataProducer;
	}

	private void setProperty(JSONObject jsonObject, WarningRepository warningRepository, 
			CodeModelRepository codeModelRepository, PropertyAccess propertyAccess, DataProducer insideDataProducer)
	{
		JSONObject propertyObject = jsonObject.optJSONObject(PROPERTY_PROPERTY);
		if (propertyObject != null)
		{
			String name = propertyObject.optString(NAME_PROPERTY);	// variable.prop access
			if (name != null && !name.isEmpty())
			{
				processProperty(codeModelRepository, propertyAccess, insideDataProducer, name);
			} else	// variable.["prop"] access
			{
				name = propertyObject.optString(VALUE_PROPERTY);
				if (name != null && !name.isEmpty())
					processProperty(codeModelRepository, propertyAccess, insideDataProducer, name);
				else
					warningRepository.createPropertyNotFoundWarning(NAME_PROPERTY, propertyObject, this.getClass());
			}
		} else
			warningRepository.createPropertyNotFoundWarning(PROPERTY_PROPERTY, jsonObject, this.getClass());
	}

	private void processProperty(CodeModelRepository codeModelRepository, PropertyAccess propertyAccess, DataProducer insideDataProducer, String name)
	{
		propertyAccess.setName(name);
		if (insideDataProducer != null)
		{
			Property insideProperty = getProperty(insideDataProducer, name);
			if (insideProperty != null)
			{
				DataContainer objectProperty = insideProperty.getDataContainer();
				Property property = lookupProperty(name, objectProperty);
				propertyAccess.setProperty(property);
			} else  if (insideDataProducer instanceof VariableAccess)
			{
				Property property = processVariableAccess(codeModelRepository, insideDataProducer, name);
				propertyAccess.setProperty(property);
			}
		}
	}

	private Property processVariableAccess(CodeModelRepository codeModelRepository, DataProducer insideDataProducer,
			String name)
	{
		VariableAccess variableAccess = (VariableAccess) insideDataProducer;
		Property property = codeFactory.createProperty();
		property.setName(name);

		Type type = variableAccess.getVariable().getType();
		if (type == null) 
		{
			type = codeFactory.createDataContainer();
			variableAccess.getVariable().setType(type);
		}
		
		if (type instanceof DataContainer)
		{
			DataContainer dataContainer = (DataContainer) type;
			dataContainer.getProperties().add(property);
			dataContainer.setName(variableAccess.getVariable().getName());
			property.setDataContainer(dataContainer);
			
			codeModelRepository.getType().saveDataContainerType(dataContainer);
		} else if (type instanceof CodeContainer)
		{
			CodeContainer codeContainer = (CodeContainer) type;
			DataContainer dataContainer = codeContainer.getDataContainer();
			Optional<Property> codeContainerProperty = 
					dataContainer.getProperties().stream().filter(p -> p.getName().equals(name)).findFirst();
			if (codeContainerProperty.isPresent())
			{
				property = codeContainerProperty.get();
			} else {
				dataContainer.getProperties().add(property);
				property.setDataContainer(dataContainer);
			}
		}
		
		return property;
	}

	private Property getProperty(DataProducer insideDataProducer, String name)
	{
		if (insideDataProducer instanceof PropertyAccess)
		{
			PropertyAccess propertyAccess = (PropertyAccess) insideDataProducer;
			Property property = propertyAccess.getProperty();
			if (property instanceof DataContainer)
				return lookupProperty(name, (DataContainer) property);
		} else if (insideDataProducer instanceof VariableAccess)
		{
			VariableAccess variableAccess = (VariableAccess) insideDataProducer;
			Variable variable = variableAccess.getVariable();
			if (variable != null)
			{
				Type type = variable.getType();
				if (type instanceof DataContainer)
					return lookupProperty(name, (DataContainer) type);
			}
		}
		
		return null;
	}

	private Property lookupProperty(String name, DataContainer dataContainer)
	{
		Optional<Property> optionalProperty = dataContainer.getProperties()
				.stream()
				.filter(p -> name.equals(p.getName()))
				.findFirst();
		
		if (optionalProperty.isPresent())
			return optionalProperty.get();
		
		return null;
	}

}
