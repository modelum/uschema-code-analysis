package es.um.nosql.code.s13e.transfs.json2code.transf.builders.switchstatement;

import java.util.List;
import java.util.Optional;

import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Case;
import es.um.nosql.code.s13e.metamodels.code.CaseType;
import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeBlockType;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.ConditionalExpression;
import es.um.nosql.code.s13e.metamodels.code.Expression;
import es.um.nosql.code.s13e.metamodels.code.Selection;
import es.um.nosql.code.s13e.metamodels.code.SelectionType;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class SwitchBuilder extends StatementBuilder
{
	private static final String CASES_PROPERTY = "cases";
	private static final String DISCRIMINANT_PROPERTY = "discriminant";
	private static final String CONSEQUENT_PROPERTY = "consequent";
	private static final String TEST_PROPERTY = "test";
	
	private CodeFactory codeFactory;

	public SwitchBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}
	

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Selection selection = codeFactory.createSelection();
		selection.setType(SelectionType.SWITCH);
		
		JSONObject discrimantObject = jsonObject.optJSONObject(DISCRIMINANT_PROPERTY);
		Variable variable = getDiscriminant(jsonAnalyzer, discrimantObject); 
		
		createCases(jsonObject, jsonAnalyzer, warningRepository, selection, variable);

		new LocationBuilder().createLocation(jsonObject, selection);
		
		return ListUtils.toList(selection);
	}


	private Variable getDiscriminant(JSONAnalyzer jsonAnalyzer, JSONObject discrimantObject)
	{
		if (discrimantObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(discrimantObject, false);
			if (statements.size() == 1)
			{
				Statement statement = statements.get(0);
				if (statement instanceof VariableAccess)
				{
					VariableAccess variableAccess = (VariableAccess) statement;
					return variableAccess.getVariable();
				}
			}
		}
		
		return null;
	}


	private void createCases(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			Selection selection, Variable variable)
	{
		JSONArray casesArray = jsonObject.optJSONArray(CASES_PROPERTY);
		if (casesArray != null)
		{
			for (int i = 0; i < casesArray.length(); i++)
			{
				JSONObject switchCase = casesArray.getJSONObject(i);
				if (switchCase != null)
				{
					createCase(switchCase, jsonAnalyzer, warningRepository, selection, variable);
				}
			}
		} else
			warningRepository.createJSONObjectNotFoundWarning(CASES_PROPERTY, jsonObject, this.getClass());
	}

	private void createCase(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			Selection selection, Variable variable)
	{
		JSONObject testObject = jsonObject.optJSONObject(TEST_PROPERTY);
		if (testObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(testObject, false);
			if (statements.size() > 0)
			{
				Case caseStatement = codeFactory.createCase();
				selection.getCase().add(caseStatement);
				
				createCaseTest(caseStatement, statements, variable);
				createCaseCodeBlock(jsonObject, jsonAnalyzer, warningRepository, caseStatement);
			}
			else
				warningRepository.createStatementNotProcessed(testObject, this.getClass());
		} else
		{
			Case caseStatement = codeFactory.createCase();
			selection.getCase().add(caseStatement);
			createCaseCodeBlock(jsonObject, jsonAnalyzer, warningRepository, caseStatement);
			caseStatement.setType(CaseType.DEFAULT);
		}
	}

	private Case createCaseTest(Case caseStatement, List<Statement> statements, Variable variable)
	{
		caseStatement.setType(CaseType.CASE);
		Optional<ConditionalExpression> findFirst = statements.stream()
			.filter(ConditionalExpression.class::isInstance)
			.map(ConditionalExpression.class::cast)
			.findFirst();
		if (findFirst.isPresent())
		{
			VariableAccess variableAccess = codeFactory.createVariableAccess();
			variableAccess.setVariable(variable);
			variableAccess.setName(variable.getName());
			
			Expression expression = codeFactory.createExpression();
			expression.setType("===");
			expression.getConditionalExpression().add(variableAccess);
			expression.getConditionalExpression().add(findFirst.get());

			caseStatement.getConditionalExpression().add(expression);
		}
				
		return caseStatement;
	}

	private void createCaseCodeBlock(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			Case caseStatement)
	{
		JSONArray testArray = jsonObject.optJSONArray(CONSEQUENT_PROPERTY);
		if (testArray != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(testArray, false);
			if (statements != null)
			{
				CodeBlock codeBlock = codeFactory.createCodeBlock();
				codeBlock.setCodeBlockType(CodeBlockType.CASE_BLOCK);
				caseStatement.setCodeBlock(codeBlock);
				caseStatement.getCodeBlock().getStatements().addAll(statements);
			}
			else
				warningRepository.createJSONArrayNotFoundWarning(testArray, jsonObject, this.getClass());
		} else
			warningRepository.createJSONObjectNotFoundWarning(CONSEQUENT_PROPERTY, jsonObject, this.getClass());
	}

}
