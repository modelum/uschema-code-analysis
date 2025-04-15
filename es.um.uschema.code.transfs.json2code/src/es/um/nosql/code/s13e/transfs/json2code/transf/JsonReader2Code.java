package es.um.nosql.code.s13e.transfs.json2code.transf;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.utils.uri.FileUriUtils;
import es.um.uschema.code.metamodels.code.utils.CodeWriter;

public class JsonReader2Code
{

	private Json2Code json2Code;

	public JsonReader2Code()
	{
		this.json2Code = new Json2Code();
	}

	public void json2Code(String inputsUri, String outputsUri)
	{
		outputsUri = FileUriUtils.setSlashLastCharacter(outputsUri);

		File file = new File(inputsUri);
		if (file.isDirectory())
		{
			json2Code.createFolder(file.getName());
			for (File newFile : file.listFiles())
			{
				jsonFile2code(newFile, outputsUri);
			}
			json2Code.leaveFolder();
		}

		CodeWriter codePrinter = json2Code.getCodePrinter();
		codePrinter.printToXmi(outputsUri + "/codeModel.xmi");

		json2Code.printWarnings();
	}

	private void jsonFile2code(File file, String outputsUri)
	{
		if (file.isDirectory())
		{
			json2Code.createFolder(file.getName());
			for (File newFile : file.listFiles())
			{
				jsonFile2code(newFile, file.getName() + "/" + outputsUri);
			}
			json2Code.leaveFolder();
		} else if (file.isFile())
		{
			try
			{
				String json = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
				JSONObject jsonObject = new JSONObject(json);

				json2Code.processFile(jsonObject, file.getName());
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
