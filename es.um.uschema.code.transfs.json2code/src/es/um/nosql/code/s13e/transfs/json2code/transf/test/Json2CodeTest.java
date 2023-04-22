package es.um.nosql.code.s13e.transfs.json2code.transf.test;

import es.um.nosql.code.s13e.transfs.json2code.transf.JsonReader2Code;

public class Json2CodeTest
{

	public static void main(String[] args)
	{
		JsonReader2Code jsonReader2Code = new JsonReader2Code();
		jsonReader2Code.json2Code(System.getProperty("user.dir") + "/inputs",
				System.getProperty("user.dir") + "/outputs");
	}
}
