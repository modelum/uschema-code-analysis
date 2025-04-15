package es.um.nosql.code.s13e.transfs.json2code.transf.builders.literals;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.TypesRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.Literal;
import es.um.uschema.code.metamodels.code.PrimitiveType;
import es.um.uschema.code.metamodels.code.Statement;

public class LiteralBuilder extends StatementBuilder
{

	private static final String RAW_PROPERTY = "raw";

	private static final String VALUE_PROPERTY = "value";

	private CodeFactory codeFactory;

	public LiteralBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{

		if (jsonObject.keySet().contains(VALUE_PROPERTY))
		{
			if (jsonObject.keySet().contains(RAW_PROPERTY))
			{
				String raw = jsonObject.optString(RAW_PROPERTY);

				Literal literal = codeFactory.createLiteral();
				literal.setLiteral(raw);
				literal.setType(getType(codeModelRepository, raw));

				new LocationBuilder().createLocation(jsonObject, literal);
				
				return ListUtils.toList(literal);
			} else
				warningRepository.createPropertyNotFoundWarning(RAW_PROPERTY, jsonObject, this.getClass());

		} else
			warningRepository.createPropertyNotFoundWarning(VALUE_PROPERTY, jsonObject, this.getClass());

		return ListUtils.toList();
	}

	private PrimitiveType getType(CodeModelRepository codeModelRepository, String raw)
	{
		TypesRepository typeRepository = codeModelRepository.getType();
		
		if (raw.startsWith("\"") && raw.endsWith("\""))
			return typeRepository.getPrimitiveType("String");
		else if (raw.startsWith("'") && raw.endsWith("'"))
				return typeRepository.getPrimitiveType("String");
		else if (raw.contains("true") || raw.contains("false"))
			return typeRepository.getPrimitiveType("Boolean");
		else if (raw.contains("."))
			return typeRepository.getPrimitiveType("Double");
		else if (raw.contains(","))
			return typeRepository.getPrimitiveType("Double");
		else if (raw.matches("^[-+]?\\d*$"))
			return typeRepository.getPrimitiveType("Integer");
		else
			return typeRepository.getPrimitiveType("String");
	}

}
