package es.um.nosql.code.s13e.transfs.json2code.transf.builders.ifstatement;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Case;
import es.um.nosql.code.s13e.metamodels.code.CaseType;
import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeBlockType;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.ConditionalExpression;
import es.um.nosql.code.s13e.metamodels.code.Selection;
import es.um.nosql.code.s13e.metamodels.code.SelectionType;
import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class IfBuilder extends StatementBuilder
{
	private static final String IF_STATEMENT_TYPE_PROPERTY = "IfStatement";
	private static final String ALTERNATE_PROPERTY = "alternate";
	private static final String CONSEQUENT_PROPERTY = "consequent";
	private static final String TEST_PROPERTY = "test";

	private CodeFactory codeFactory;

	public IfBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}
	
	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Selection selection = codeFactory.createSelection();
		selection.setType(SelectionType.IF);
		
		createIf(jsonObject, jsonAnalyzer, warningRepository, selection);
		createElseIf(jsonObject, jsonAnalyzer, warningRepository, selection);

		new LocationBuilder().createLocation(jsonObject, selection);
		
		return ListUtils.toList(selection);
	}

	private void createElseIf(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			WarningRepository warningRepository, Selection selection)
	{
		JSONObject alternateObject = jsonObject.optJSONObject(ALTERNATE_PROPERTY);
		if (alternateObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(alternateObject, false);
			if (alternateObject.get("type").equals(IF_STATEMENT_TYPE_PROPERTY))
			{
				transformIfsIntoElseIFs(selection, statements); 
			} else // Else
			{
				createElse(selection, statements);
			}
		} 
	}

	private void transformIfsIntoElseIFs(Selection selection, List<Statement> statements)
	{
		for (Statement statement : statements)
		{
			if (statement instanceof Selection) // ElseIf
			{
				Selection interalIf = (Selection) statement;
				for (Case caseStatement : new LinkedList<Case>(interalIf.getCase()))
				{
					selection.getCase().add(caseStatement);
					if (CaseType.IF.equals(caseStatement.getType())) 
						caseStatement.setType(CaseType.ELSE_IF);
				}
			} 
		}
	}

	private void createElse(Selection selection, List<Statement> statements)
	{
		CodeBlock codeBlock = codeFactory.createCodeBlock();
		codeBlock.setCodeBlockType(CodeBlockType.CASE_BLOCK);
		codeBlock.getStatements().addAll(statements);

		Case caseStatement = codeFactory.createCase();
		caseStatement.setCodeBlock(codeBlock);
		caseStatement.setType(CaseType.ELSE);
		
		selection.getCase().add(caseStatement);
	}

	private void createIf(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			Selection selection)
	{
		JSONObject testObject = jsonObject.optJSONObject(TEST_PROPERTY);
		if (testObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(testObject, false);
			if (statements.size() > 0)
			{
				Case caseStatement = codeFactory.createCase();
				selection.getCase().add(caseStatement);
				
				createIfTest(caseStatement, statements);
				createIfCodeBlock(jsonObject, jsonAnalyzer, warningRepository, caseStatement);
			}
			else
				warningRepository.createStatementNotProcessed(testObject, this.getClass());
		} else
			warningRepository.createJSONObjectNotFoundWarning(TEST_PROPERTY, jsonObject, this.getClass());
	}

	private Case createIfTest(Case caseStatement, List<Statement> statements)
	{
		caseStatement.setType(CaseType.IF);
		caseStatement.getConditionalExpression().addAll(
				statements.stream()
					.filter(ConditionalExpression.class::isInstance)
					.map(ConditionalExpression.class::cast)
					.collect(Collectors.toList())
		);
		return caseStatement;
	}

	private void createIfCodeBlock(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, WarningRepository warningRepository,
			Case caseStatement)
	{
		JSONObject testObject = jsonObject.optJSONObject(CONSEQUENT_PROPERTY);
		if (testObject != null)
		{
			List<Statement> statements = jsonAnalyzer.analyzeStatement(testObject, false);
			if (statements != null)
			{
				CodeBlock codeBlock = codeFactory.createCodeBlock();
				codeBlock.setCodeBlockType(CodeBlockType.CASE_BLOCK);
				caseStatement.setCodeBlock(codeBlock);
				caseStatement.getCodeBlock().getStatements().addAll(statements);
			}
			else
				warningRepository.createStatementNotProcessed(testObject, this.getClass());
		} else
			warningRepository.createJSONObjectNotFoundWarning(CONSEQUENT_PROPERTY, jsonObject, this.getClass());
	}
}
