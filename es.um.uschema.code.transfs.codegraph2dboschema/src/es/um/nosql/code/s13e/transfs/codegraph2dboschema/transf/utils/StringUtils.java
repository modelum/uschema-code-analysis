package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils;

public class StringUtils
{
	public static String cleanLiteralString(String literal)
	{
		if (literal != null && literal.length() > 1) {
			if (literal.startsWith("'") && literal.endsWith("'"))
			{
				return literal.substring(1, literal.length() - 1);
			}
			else if (literal.startsWith("\"") && literal.endsWith("\""))
			{
				return literal.substring(1, literal.length() - 1);
			}	
		}
		
		return literal;
	}
	
	
}
