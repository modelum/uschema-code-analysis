package es.um.nosql.code.s13e.transfs.text2json.transf.test;

import java.io.IOException;

import es.um.nosql.code.s13e.transfs.text2json.transf.TextReader2Json;

public class Text2JsonTest {

	public static void main(String[] args) {
		TextReader2Json javascriptRun = new TextReader2Json();
		try {
			javascriptRun.javascript2json(System.getProperty("user.dir") + "/inputs", System.getProperty("user.dir") + "/outputs");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
