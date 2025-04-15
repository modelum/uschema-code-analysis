package es.um.nosql.code.s13e.transfs.json2code.transf.builders.functions;

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
import es.um.uschema.code.metamodels.code.Return;
import es.um.uschema.code.metamodels.code.Statement;

public class ReturnBuilder extends StatementBuilder
{
	private static final String ARGUMENT_PROPERTY = "argument";
	
	private CodeFactory codeFactory;

	public ReturnBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Return returnCode = codeFactory.createReturn();

		JSONObject argumentObject = jsonObject.optJSONObject(ARGUMENT_PROPERTY);
		if (argumentObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(argumentObject, false);
			statements.stream()
				.filter(DataProducer.class::isInstance).map(DataProducer.class::cast)
				.forEach(dp -> returnCode.getDataProducers().add(dp));
		} else
			warningRepository.createPropertyNotFoundWarning(ARGUMENT_PROPERTY, jsonObject, this.getClass());

		new LocationBuilder().createLocation(jsonObject, returnCode);
		return ListUtils.toList(returnCode);
	}

}
