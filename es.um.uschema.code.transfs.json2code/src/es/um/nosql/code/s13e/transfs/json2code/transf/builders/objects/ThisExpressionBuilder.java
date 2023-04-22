package es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.CodeContainer;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.DataContainer;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.This;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class ThisExpressionBuilder extends StatementBuilder
{
	private CodeFactory codeFactory;

	public ThisExpressionBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}
	
	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		CodeContainer lastClassContainer = codeModelRepository.getLastClassContainer();
		EList<Variable> variables = lastClassContainer.getVariable();
		
		Optional<This> variable = variables.stream().filter(v -> v instanceof This).map(This.class::cast).findFirst();
		This thisStatement = codeFactory.createThis();
		if (variable.isPresent())
		{
			thisStatement = variable.get();
		} else
		{
			DataContainer dataContainer = lastClassContainer.getDataContainer();
			thisStatement.setDataContainer(dataContainer);
			thisStatement.setName("this");
			lastClassContainer.getVariable().add(thisStatement);
		}
		
		VariableAccess variableAccess = codeFactory.createVariableAccess();
		variableAccess.setVariable(thisStatement);
		variableAccess.setName(thisStatement.getName());
		
		new LocationBuilder().createLocation(jsonObject, variableAccess);
		
		return ListUtils.toList(variableAccess);
	}

}
