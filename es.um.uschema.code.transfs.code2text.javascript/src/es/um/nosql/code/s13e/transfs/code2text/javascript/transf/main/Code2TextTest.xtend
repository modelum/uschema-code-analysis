package es.um.nosql.code.s13e.transfs.code2text.javascript.transf.main

import es.um.nosql.code.s13e.transfs.code2text.javascript.transf.Code2Text

class Code2TextTest {
	
	def static void main(String[] args) {
		var code2Text = new Code2Text
		code2Text.code2text("inputs", "outputs")
	}

}