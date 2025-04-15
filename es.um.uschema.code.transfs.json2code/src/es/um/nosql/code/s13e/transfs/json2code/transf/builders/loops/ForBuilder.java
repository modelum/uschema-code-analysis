package es.um.nosql.code.s13e.transfs.json2code.transf.builders.loops;

import java.util.List;

import org.json.JSONObject;

import es.um.nosql.code.s13e.transfs.json2code.transf.analyzers.JSONAnalyzer;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.location.LocationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.model.repository.CodeModelRepository;
import es.um.nosql.code.s13e.transfs.json2code.transf.utils.ListUtils;
import es.um.nosql.code.s13e.transfs.json2code.transf.warnings.WarningRepository;
import es.um.uschema.code.metamodels.code.CodeFactory;
import es.um.uschema.code.metamodels.code.Loop;
import es.um.uschema.code.metamodels.code.LoopType;
import es.um.uschema.code.metamodels.code.Statement;

public class ForBuilder extends StatementBuilder
{
	private CodeFactory codeFactory;
	private LoopPartsBuilder loopPartsBuilder;

	public ForBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
		this.loopPartsBuilder = new LoopPartsBuilder();
	}

	@Override
	public List<Statement> build(JSONObject jsonObject, JSONAnalyzer jsonAnalyzer,
			CodeModelRepository codeModelRepository, WarningRepository warningRepository)
	{
		Loop forLoop = codeFactory.createLoop();
		forLoop.setType(LoopType.FOR);

		loopPartsBuilder.createCodeBlock(codeModelRepository, forLoop);
		loopPartsBuilder.processInitialization(jsonObject, warningRepository, jsonAnalyzer, forLoop);
		loopPartsBuilder.processTest(jsonObject, warningRepository, jsonAnalyzer, forLoop);
		loopPartsBuilder.processUpdate(jsonObject, warningRepository, jsonAnalyzer, forLoop);
		loopPartsBuilder.processBody(jsonObject, warningRepository, jsonAnalyzer, forLoop);

		codeModelRepository.clearTemporallyCodeBlock();

		new LocationBuilder().createLocation(jsonObject, forLoop);
		
		return ListUtils.toList(forLoop);
	}

}
