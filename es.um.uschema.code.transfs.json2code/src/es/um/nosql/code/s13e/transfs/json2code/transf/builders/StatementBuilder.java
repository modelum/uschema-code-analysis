package es.um.nosql.code.s13e.transfs.json2code.transf.builders;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.metamodels.code.Statement;
import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;

public abstract class StatementBuilder {
	
	public abstract List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer, 
			CodeModelRepository codeModelRepository, WarningRepository warningRepository);
}
