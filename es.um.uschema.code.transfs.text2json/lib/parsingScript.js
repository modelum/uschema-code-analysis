function parse(esprimaPath, code){
	load(esprimaPath);
	ast = esprima.parseScript(code, {	
		jsx	: false,
		range	: false,
		loc	:	true,
		tolerant : false,
		tokens	: false,
		comment : true		
	});
	
	return JSON.stringify(ast, null, 2);
}