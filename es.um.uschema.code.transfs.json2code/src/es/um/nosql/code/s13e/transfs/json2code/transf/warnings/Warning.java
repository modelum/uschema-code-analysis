package es.um.nosql.code.s13e.transfs.json2code.transf.warnings;

public class Warning
{

	private String description;

	public Warning(String description)
	{
		this.description = description;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public void print()
	{
		System.err.println(description);
	}

}
