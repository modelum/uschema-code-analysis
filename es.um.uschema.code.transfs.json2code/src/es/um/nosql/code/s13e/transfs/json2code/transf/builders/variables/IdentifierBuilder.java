package es.um.nosql.code.s13e.transfs.json2code.transf.builders.variables;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class IdentifierBuilder extends StatementBuilder
{

	private static final String NAME_PROPERTY = "name";

	private CodeFactory codeFactory;

	public IdentifierBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		VariableAccess variableAccess = codeFactory.createVariableAccess();

		String name = jsonObject.optString(NAME_PROPERTY);
		if (name != null)
		{
			CallableBlock call = codeModelRepository.getCallHierarchy().getCall(name);
			if (call != null)
			{
				variableAccess.setVariable(call);	
				variableAccess.setName(call.getName());
			} else {
				Variable variable = codeModelRepository.getVariablesRepository().getVariable(name);
				variableAccess.setVariable(variable);
				variableAccess.setName(variable.getName());
			}
		} else
			warningRepository.createPropertyNotFoundWarning(NAME_PROPERTY, jsonObject, this.getClass());

		new LocationBuilder().createLocation(jsonObject, variableAccess);
		
		return ListUtils.toList(variableAccess);
	}

}
