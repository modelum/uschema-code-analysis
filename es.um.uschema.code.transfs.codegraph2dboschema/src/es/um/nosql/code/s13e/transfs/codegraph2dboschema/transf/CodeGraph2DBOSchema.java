package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf;

import java.util.HashMap;
import java.util.Map;

import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.builder.DBOSchemaBuilder;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator.CodeGraphBackwardIterator;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator.CodeGraphForwardIterator;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.iterator.Duplication;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.model.repository.DBOSchemaRepository;
import es.um.uschema.code.metamodels.code.Call;
import es.um.uschema.code.metamodels.code.Code;
import es.um.uschema.code.metamodels.codeGraph.CodeGraph;
import es.um.uschema.code.metamodels.codeGraph.Node;
import es.um.uschema.code.metamodels.codeGraph.utils.CodeGraphReader;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Container;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchema;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field;
import es.um.uschema.code.metamodels.databaseOperationsSchema.utils.DatabaseOperationsSchemaWriter;

public class CodeGraph2DBOSchema
{
	private DBOSchemaRepository dboSchemaRepository;
	private DBOSchemaBuilder dboSchemaBuilder;
	private CodeGraphBackwardIterator codeGraphBackwardIterator;
	private CodeGraphForwardIterator codeGraphForwardIterator;
	private Duplication duplicactionTracker;

	public CodeGraph2DBOSchema()
	{
		this.dboSchemaRepository = new DBOSchemaRepository();
		this.dboSchemaBuilder = new DBOSchemaBuilder(dboSchemaRepository);
		this.codeGraphBackwardIterator = new CodeGraphBackwardIterator(dboSchemaBuilder, dboSchemaRepository);
		this.codeGraphForwardIterator = new CodeGraphForwardIterator(dboSchemaBuilder, dboSchemaRepository);
		this.duplicactionTracker = new Duplication(dboSchemaBuilder, dboSchemaRepository);
	}
	
	public void codeGraph2DBOSchema(String inputsUri, String outputsUri)
	{
		CodeGraphReader codeGraphReader = new CodeGraphReader();
		CodeGraph codeGraphModel = codeGraphReader.readCodeGraphModel(inputsUri);
		Code codeModel = codeGraphReader.getCode();
		
		DatabaseOperationsSchema dboSchema = codeGraph2DBOSchema(codeModel, codeGraphModel);
		DatabaseOperationsSchemaWriter databaseOperationsSchemaWriter = 
				new DatabaseOperationsSchemaWriter(codeModel, codeGraphModel, dboSchema);
		
		databaseOperationsSchemaWriter.printToXmi(outputsUri);
	}
	
	public DatabaseOperationsSchema codeGraph2DBOSchema(Code codeModel, CodeGraph codeGraphModel)
	{
		DatabaseOperationsSchema databaseOperationsSchema = dboSchemaBuilder.createDatabaseOperationsSchema();
		
		Map<Call, Node> databaseOperationCalls = codeGraphBackwardIterator.findDatabaseOperations(codeGraphModel);
		Map<DatabaseOperation, Node> dataOperationNodes = new HashMap<DatabaseOperation, Node>();
		
		databaseOperationCalls.entrySet().forEach(c -> {
			DatabaseOperation databaseOperation = codeGraphBackwardIterator.trackDatabaseCall(c);
			codeGraphForwardIterator.trackDatabaseCall(c, databaseOperation, codeGraphBackwardIterator.getAggregateFields());
			dataOperationNodes.put(databaseOperation, c.getValue());
		});
		
		dboSchemaRepository.getDBOperations().forEach(dbo -> codeGraphBackwardIterator.setPrecedingAndFollowingDBOperations(dbo));
		
		dataOperationNodes.entrySet().forEach(don -> {
			duplicactionTracker.duplicatePossibles(dataOperationNodes, don.getKey(), don.getValue());
		});
		
		refreshFeilds(databaseOperationsSchema);

		return databaseOperationsSchema;
	}

	private void refreshFeilds(DatabaseOperationsSchema databaseOperationsSchema) {
		for (Container container : databaseOperationsSchema.getContainers()) {
		    for (DataStructure dataStructure : container.getDataStructures()) {
		        for (Field field : dataStructure.getFields()) {
		        	if (field.getType() == null)
		        		field.setType(dboSchemaBuilder.createPrimitiveType("String"));
		            
		        }
		    }
		}
	}

}
