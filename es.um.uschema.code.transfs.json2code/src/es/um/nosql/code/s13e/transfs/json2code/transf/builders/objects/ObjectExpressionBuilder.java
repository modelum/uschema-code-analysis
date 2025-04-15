package es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.Assignable;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.DataContainer;
import es.um.uschema.code.metamodels.code.Literal;
import es.um.uschema.code.metamodels.code.NewDataContainer;
import es.um.uschema.code.metamodels.code.Property;
import es.um.uschema.code.metamodels.code.Statement;

public class ObjectExpressionBuilder extends StatementBuilder
{
	private static final String PROPERTY_PROPERTY = "Property";
	private static final String PROPERTIES_PROPERTY = "properties";
	private static final String TYPE_PROPERTY = "type";
	private static final String VALUE_PROPERTY = "value";
	private static final String KEY_PROPERTY = "key";
	private static final String NAME_PROPERTY = "name";
	
	private CodeFactory codeFactory;

	public ObjectExpressionBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}
	
	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		NewDataContainer newDataContainer = codeFactory.createNewDataContainer();
		DataContainer dataContainer = codeFactory.createDataContainer();
		newDataContainer.setDataContainer(dataContainer);
		
		JSONArray properties = jsonObject.optJSONArray(PROPERTIES_PROPERTY);
		if (properties != null)
		{
			for (int i = 0; i < properties.length(); i++)
			{
				JSONObject propertyObject = properties.optJSONObject(i);
				processProperty(jsonAnalyzer, warningRepository, dataContainer, propertyObject);
			}
		} else
			warningRepository.createJSONObjectNotFoundWarning(PROPERTIES_PROPERTY, jsonObject, this.getClass());


		new LocationBuilder().createLocation(jsonObject, newDataContainer);
		
		return ListUtils.toList(newDataContainer);
	}

	private void processProperty(JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			DataContainer dataContainer, JSONObject propertyObject)
	{
		String type = propertyObject.optString(TYPE_PROPERTY);
		if (type != null)
		{
			if (PROPERTY_PROPERTY.equals(type)) 
			{
				Property property = processValue(jsonAnalyzer, warningRepository, dataContainer, propertyObject);
				
				String name = getName(warningRepository, propertyObject);
				property.setName(name);
				property.setDataContainer(dataContainer);

				dataContainer.setName(name);
				dataContainer.getProperties().add(property);
			}
		} else
			warningRepository.createJSONObjectNotFoundWarning(TYPE_PROPERTY, propertyObject, this.getClass());
	}

	private Property processValue(JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			DataContainer dataContainer, JSONObject propertyObject)
	{
		Property property = codeFactory.createProperty();
		
		JSONObject valueObject = propertyObject.optJSONObject(VALUE_PROPERTY);
		if (valueObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(valueObject, false);
			for (Statement statement : statements)
			{
				if (statement instanceof NewDataContainer)
				{
					property = ((NewDataContainer)statement).getDataContainer();
					property.setDataContainer(dataContainer);
				}
				else if (statement instanceof Assignable)
				{
					property.setInitialization((Assignable) statement);
					if (statement instanceof Literal)
					{
						Literal literal = (Literal) statement;
						property.setType(literal.getType());
					}
				} 
			} 
		} else
			warningRepository.createJSONObjectNotFoundWarning(VALUE_PROPERTY, propertyObject, this.getClass());
		return property;
	}

	private String getName(WarningRepository warningRepository, JSONObject propertyObject)
	{
		JSONObject keyObject = propertyObject.optJSONObject(KEY_PROPERTY);
		if (keyObject != null)
		{
			String name = keyObject.optString(NAME_PROPERTY);
			if (name != null && !name.equals(""))
				return name;

			keyObject = propertyObject.optJSONObject(KEY_PROPERTY);
			name = keyObject.optString(VALUE_PROPERTY);
			if (name != null && !name.equals(""))
				return name;
			else
				warningRepository.createJSONObjectNotFoundWarning(KEY_PROPERTY, propertyObject, this.getClass());
		} else
			warningRepository.createJSONObjectNotFoundWarning(KEY_PROPERTY, propertyObject, this.getClass());
		
		return "";
	}

}
