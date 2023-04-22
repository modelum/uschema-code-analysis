package es.um.nosql.code.s13e.transfs.json2code.transf.utils;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public class ListUtils
{

	public static List<Statement> toList(Statement... statements)
	{
		return Arrays.asList(statements);
	}

	public static <A> void addAllObjects(WarningRepository warningRepository, EList<A> expressions,
			List<Statement> statements, Class<A> listClassType, JSONObject sideObject, Class<?> errorClass)
	{
		if (statements.size() > 0 && statements.stream().allMatch(listClassType::isInstance))
		{
			statements.forEach(e -> {
				expressions.add(listClassType.cast(e));
			});
		} else
		{
			warningRepository.createStatementNotProcessed(sideObject, errorClass);
		}
	}
}
