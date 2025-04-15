package es.um.nosql.code.s13e.transfs.json2code.transf.builders.arrays;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.NewArray;
import es.um.uschema.code.metamodels.code.Statement;

public class ArrayExpressionBuilder extends StatementBuilder
{
	private CodeFactory codeFactory;

	public ArrayExpressionBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}
	
	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		NewArray newArray = codeFactory.createNewArray();
		
		JSONArray elements = jsonObject.optJSONArray("elements");
		for (int i = 0; i < elements.length(); i++)
		{
			JSONObject element = elements.getJSONObject(i);
			List<Statement> statements = jsonAnalyzer.analyzeStatement(element, false);
			for (Statement statement : statements)
			{
				if (statement instanceof DataProducer)
					newArray.getDataProducer().add((DataProducer) statement);
			}
		}
		
		new LocationBuilder().createLocation(jsonObject, newArray);
		
		return ListUtils.toList(newArray);
	}

}
