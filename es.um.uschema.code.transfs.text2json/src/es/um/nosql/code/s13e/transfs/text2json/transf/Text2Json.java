package es.um.nosql.code.s13e.transfs.text2json.transf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.security.CodeSource;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Text2Json {
	
	private static final String ESPRIMA_JS_URI = "/lib/esprima.js";

	private static final String PARSING_SCRIPT_JS_URI = "lib/parsingScript.js";
	private static final String PARSING_METHOD_NAME = "parse";

	public String textCode2json(String code)
	{
    	try {
    	    ScriptEngineManager factory = new ScriptEngineManager();
    	    ScriptEngine engine = factory.getEngineByName("nashorn"); 
        	String baseDirLocation = getClassParentLocation();
        	
        	System.out.println(baseDirLocation + "/" + PARSING_SCRIPT_JS_URI);
        	
			engine.eval(new FileReader(baseDirLocation + "/" + PARSING_SCRIPT_JS_URI));
			Invocable invocable = (Invocable) engine;
			String result = (String) invocable.invokeFunction(PARSING_METHOD_NAME, baseDirLocation + "/" + ESPRIMA_JS_URI, code);

	       	return result;
		} catch (NoSuchMethodException | ScriptException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	
    	return null;
	}

	private String getClassParentLocation() throws FileNotFoundException 
	{
		CodeSource codeSource = Text2Json.class.getProtectionDomain().getCodeSource();
		if (codeSource != null) {
			URL location = codeSource.getLocation();
			File file = new File(location.getPath());
			if (file.exists()) {
				File parentFile = file.getParentFile();
				return parentFile.getAbsolutePath();
			}
		}
		
		throw new FileNotFoundException("Unable to find base dir");
	}
}
