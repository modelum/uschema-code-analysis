package es.um.nosql.code.s13e.transfs.json2code.transf.warnings;

import java.util.LinkedList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Assignable;
import es.um.nosql.code.s13e.metamodels.code.Statement;

public class WarningRepository
{

	private List<Warning> warnings;

	public WarningRepository()
	{
		warnings = new LinkedList<Warning>();
	}

	public void createWarning(String description)
	{
		warnings.add(new Warning(description));
	}

	public void createPropertyNotFoundWarning(String property, JSONObject jsonObject, Class<?> class1)
	{
		warnings.add(new Warning("Property: " + property + " not found in object." + "\n on Class: " + class1 + "\n"
				+ jsonObject.toString(2)));
	}

	public void createJSONArrayNotFoundWarning(JSONArray testArray, JSONObject jsonObject, Class<?> class1)
	{
		warnings.add(new Warning("JSONArray: " + testArray + " not found in object." + "\n on Class: " + class1 + "\n"
				+ jsonObject.toString(2)));
	}
	
	public void createPropertyNotFoundInJSONArrayWarning(int i, JSONObject jsonObject, Class<?> class1)
	{
		warnings.add(new Warning("JSONObject not found in array at index " + i + "." + "\n on Class: " + class1 + "\n"
				+ jsonObject.toString(2)));
	}

	public void createTypeNotFoundWarning(String type, JSONObject jsonObject, Class<?> class1)
	{
		warnings.add(new Warning("Type: " + type + " not defined." + "\n on Class: " + class1));
	}

	public void createJSONObjectNotFoundWarning(String property, JSONObject jsonObject, Class<?> class1)
	{
		warnings.add(new Warning("Property: " + property + " is not a JSONObject or it is not present."
				+ "\n on Class: " + class1 + "\n" + jsonObject.toString(2)));
	}

	public void createJSONArrayNotFoundWarning(String property, JSONObject jsonObject, Class<?> class1)
	{
		warnings.add(new Warning("Property: " + property + " is not a JSONArray or it is not present. "
				+ "\n on Class: " + class1 + "\n" + jsonObject.toString(2)));
	}

	public void createStatementIsNot(Statement statement, Class<Assignable> assignable, Class<?> class1)
	{
		warnings.add(new Warning("Statement: " + statement + " is not a " + assignable.getName() + ". "
				+ "\n on Class: " + class1 + "\n"));
	}

	public void createStatementIsNot(List<Statement> statements, Class<Assignable> assignable, Class<?> class1)
	{
		warnings.add(new Warning("Statement: " + statements + " is not a " + assignable.getName() + ". "
				+ "\n on Class: " + class1 + "\n"));
	}

	public void createStatementNotProcessed(JSONObject optJSONObject, Class<?> class1)
	{
		warnings.add(new Warning(
				"Statement not processed: \n" + optJSONObject.toString(2) + "\n on Class: " + class1 + "\n"));
	}

	public void printAll()
	{
		warnings.forEach(Warning::print);
	}

}