package es.um.nosql.code.s13e.transfs.json2code.transf.builders.location;

import org.json.JSONObject;

import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.CodeLocation;
import es.um.uschema.code.metamodels.code.Statement;

public class LocationBuilder
{
	private static final String LOC = "loc";
	private static final String START = "start";
	private static final String END = "end";
	
	private static final String LINE = "line";
	private static final String COLUMN = "column";
	
	private CodeFactory codeFactory;

	public LocationBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}
	
	public void createLocation(JSONObject jsonObject, Statement statement)
	{
		JSONObject locObject = jsonObject.optJSONObject(LOC);
		if (locObject != null)
		{
			statement.setStart(getLocObject(locObject, START, statement));
			statement.setEnd(getLocObject(locObject, END, statement));
		}
	}


	private CodeLocation getLocObject(JSONObject jsonObject, String type, Statement statement)
	{
		JSONObject locObject = jsonObject.getJSONObject(type);
		CodeLocation codeLocation = codeFactory.createCodeLocation();
		codeLocation.setLine(locObject.getInt(LINE));
		codeLocation.setColumn(locObject.getInt(COLUMN));
		
		return codeLocation;
	}
	
}
