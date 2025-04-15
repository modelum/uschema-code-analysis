package es.um.nosql.code.s13e.transfs.text2json.transf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import es.um.nosql.code.s13e.transfs.text2json.transf.utils.FileUriUtils;

public class TextReader2Json {
	
	public void javascript2json(String inputsUri, String outputsUri) throws IOException {
		outputsUri = FileUriUtils.setSlashLastCharacter(outputsUri);
		
		File file = new File(inputsUri);
		for (File newFile : file.listFiles()) {
			textCodeFile2json(newFile, outputsUri);
		}
	}

	private void textCodeFile2json(File file, String outputUri) throws IOException {
		if (file.isDirectory()) {
			for (File newFile : file.listFiles()) {
				textCodeFile2json(newFile, outputUri + "/" + file.getName() + "/");
			}
		} else if (file.isFile()) {
			System.out.println("\tParsing File: " + file);
			String code = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
			String json = new Text2Json().textCode2json(code);
			printToFile(outputUri + FileUriUtils.replaceExtension(file.getName(), ".json"), json);
		} else {
			throw new FileNotFoundException("Unable to find: " + file.getAbsolutePath());
		}
	}

	private void printToFile(String outputFileUri, String json)
			throws FileNotFoundException, UnsupportedEncodingException {
		String dir = outputFileUri.substring(0, outputFileUri.lastIndexOf('/'));
		new File(dir).mkdirs();
		PrintWriter writer = new PrintWriter(outputFileUri, "UTF-8");
		writer.write(json);
		writer.close();
	}

}
