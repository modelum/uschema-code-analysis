package es.um.nosql.code.s13e.transfs.json2code.transf.iterators;

import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.CodeBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeBlockType;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.ContainersBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class JSONFileIterator
{
	private static final String FUNCTION_DECLARATION = "FunctionDeclaration";
	private static final String TYPE_PROPERTY = "type";
	private static final String BODY_PROPERTY = "body";
	private static final String COMMENTS_PROPERTY = "comments";

	private JSONAnalyzer jsonAnalyzer;
	private WarningRepository warningRepository;
	private CodeModelRepository codeModelRepository;

	public JSONFileIterator(WarningRepository warningRepository, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository)
	{
		this.warningRepository = warningRepository;
		this.jsonAnalyzer = jsonAnalyzer;
		this.codeModelRepository = codeModelRepository;
	}

	public void processFile(JSONObject jsonObject, CodeBlock inlineCodeBlock)
	{
		JSONArray bodyArray = jsonObject.optJSONArray(BODY_PROPERTY);
		if (bodyArray != null)
		{
			for (int i = 0; i < bodyArray.length(); i++)
			{
				JSONObject statementJSONObject = bodyArray.optJSONObject(i);
				setContainer(statementJSONObject, inlineCodeBlock);
				jsonAnalyzer.analyzeStatement(statementJSONObject, true);
			}
		} else
		{
			warningRepository.createPropertyNotFoundWarning(BODY_PROPERTY, jsonObject, this.getClass());
		}
	}

	private void setContainer(JSONObject jsonObject, CodeBlock inlineCodeBlock)
	{
		String typeProperty = getType(jsonObject);
		if (FUNCTION_DECLARATION.equals(typeProperty))
		{
			ContainersBuilder containersBuilder = new ContainersBuilder(codeModelRepository);
			containersBuilder.createAndSaveCallableBlock(CodeBlockType.FUNCTION);
		} else if (!COMMENTS_PROPERTY.equals(typeProperty))
		{
			codeModelRepository.setLastCodeBlock(inlineCodeBlock);
		}
	}

	private String getType(JSONObject jsonObject)
	{
		String typeProperty = jsonObject.optString(TYPE_PROPERTY);
		if (typeProperty != null)
		{
			return typeProperty;
		} else
		{
			warningRepository.createPropertyNotFoundWarning(TYPE_PROPERTY, jsonObject, this.getClass());
		}

		return "";
	}

}
