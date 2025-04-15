package es.um.nosql.code.s13e.transfs.json2code.transf.builders.variables;

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.Assignable;
import es.um.uschema.code.metamodels.code.CallableBlock;
import es.um.uschema.code.metamodels.code.CodeBlock;
import es.um.uschema.code.metamodels.code.CodeContainer;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.DataContainer;
import es.um.uschema.code.metamodels.code.NewClass;
import es.um.uschema.code.metamodels.code.NewDataContainer;
import es.um.uschema.code.metamodels.code.Statement;
import es.um.uschema.code.metamodels.code.Variable;
import es.um.uschema.code.metamodels.code.VariableDeclaration;

public class VariableDeclaratorBuilder extends StatementBuilder
{

	private static final String INIT_PROPERTY = "init";
	private static final String ID_PROPERTY = "id";
	private static final String NAME_PROPERTY = "name";

	private CodeFactory codeFactory;

	public VariableDeclaratorBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Variable variable = getVariable(jsonObject, warningRepository, codeModelRepository);
		VariableDeclaration variableDeclaration = codeFactory.createVariableDeclaration();
		variableDeclaration.setVariable(variable);
		variableDeclaration.setName(variable.getName());

		processInitialization(jsonObject, warningRepository, jsonAnalyzer, codeModelRepository, variableDeclaration);

		CodeBlock codeBlock = codeModelRepository.getBestCodeBlockChoice();
		if (codeBlock != null)
		{
			codeBlock.getStatements().add(variableDeclaration);
		}

		new LocationBuilder().createLocation(jsonObject, variableDeclaration);
		
		return ListUtils.toList(variableDeclaration);
	}

	private void processInitialization(JSONObject jsonObject, WarningRepository warningRepository,
			JSONAnalyzer jsonAnalyzer, CodeModelRepository codeModelRepository, VariableDeclaration variableDeclaration)
	{
		JSONObject initObject = jsonObject.optJSONObject(INIT_PROPERTY);
		if (initObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(initObject, false);
			if (statements.size() == 1)
			{
				processInsideStatement(codeModelRepository, variableDeclaration, statements.get(0));
			} else
				warningRepository.createStatementIsNot(statements, Assignable.class, this.getClass());
		}
	}

	private void processInsideStatement(CodeModelRepository codeModelRepository,
			VariableDeclaration variableDeclaration, Statement statement)
	{
		if (statement instanceof CallableBlock)
		{
			CallableBlock callableBlock = (CallableBlock) statement;
			variableDeclaration.setInitialization(callableBlock);
			callableBlock.setName(variableDeclaration.getName());
		} else if (statement instanceof NewClass)
		{
			NewClass newClass = (NewClass) statement;
			variableDeclaration.setInitialization(newClass);
			CodeContainer codeContainer = newClass.getCodeContainer();
			variableDeclaration.getVariable().setType(codeContainer);
			codeModelRepository.getVariablesRepository()
				.saveClassContainingVariable(codeContainer.getName(), variableDeclaration.getName());
		} else if (statement instanceof NewDataContainer)
		{
			NewDataContainer newDatacontainer = (NewDataContainer) statement;
			variableDeclaration.setInitialization(newDatacontainer);
			DataContainer dataContainer = EcoreUtil.copy(newDatacontainer.getDataContainer());
			codeModelRepository.getType().saveDataContainerType(dataContainer);
			variableDeclaration.getVariable().setType(dataContainer);
		} else if (statement instanceof Assignable)
		{
			variableDeclaration.setInitialization((Assignable) statement);
		}
	}

	private Variable getVariable(JSONObject jsonObject, WarningRepository warningRepository,
			CodeModelRepository codeModelRepository)
	{
		JSONObject idObject = jsonObject.optJSONObject(ID_PROPERTY);
		if (idObject != null)
		{
			String name = idObject.optString(NAME_PROPERTY);
			if (name != null)
			{
				Variable variable = codeModelRepository.getVariablesRepository().getVariable(name);
				CodeBlock codeBlock = codeModelRepository.getBestCodeBlockChoice();
				
				if (codeBlock != null)
					codeBlock.getVariables().add(variable);

				return variable;
			} else
				warningRepository.createPropertyNotFoundWarning(NAME_PROPERTY, jsonObject, this.getClass());
		} else
			warningRepository.createJSONObjectNotFoundWarning(ID_PROPERTY, jsonObject, this.getClass());

		return null;
	}

}
