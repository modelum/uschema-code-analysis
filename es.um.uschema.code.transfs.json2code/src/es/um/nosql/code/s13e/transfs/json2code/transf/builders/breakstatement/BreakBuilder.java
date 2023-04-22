package es.um.nosql.code.s13e.transfs.json2code.transf.builders.breakstatement;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Break;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class BreakBuilder extends StatementBuilder
{
	private CodeFactory codeFactory;

	public BreakBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Break breakStatement = codeFactory.createBreak();
		
		new LocationBuilder().createLocation(jsonObject, breakStatement);

		return ListUtils.toList(breakStatement);
	}

}
