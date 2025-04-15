package es.um.nosql.code.s13e.transfs.json2code.transf.builders.exceptions;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.DataProducer;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.Throw;

public class ThrowBuilder extends StatementBuilder
{
	private CodeFactory codeFactory;

	public ThrowBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}
	
	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Throw throwStatement = codeFactory.createThrow();
		
		JSONObject argument = jsonObject.optJSONObject("argument");
		if (argument != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(argument, false);
			if (statements.size() == 1)
			{
				Statement statement = statements.get(0);
				if (statement instanceof DataProducer)
					throwStatement.setDataProducer((DataProducer) statement);
			}
		} else
			warningRepository.createPropertyNotFoundWarning("argument", jsonObject, this.getClass());
		
		new LocationBuilder().createLocation(jsonObject, throwStatement);

		return ListUtils.toList(throwStatement);
	}

}
