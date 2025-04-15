package es.um.nosql.code.s13e.transfs.dboschema2code.transf;

import java.util.Optional;

import es.um.uschema.code.metamodels.databaseOperationsSchema.Collection;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Composition;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Container;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperation;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DatabaseOperationsSchema;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Read;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Reference;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Type;
import es.um.nosql.code.s13e.transfs.code2text.javascript.transf.Code2Text;
import es.um.nosql.code.s13e.transfs.dboschema2code.transf.rewritters.AggregateRewritter;
import es.um.nosql.code.s13e.transfs.dboschema2code.transf.rewritters.FindRewritter;
import es.um.uschema.code.metamodels.code.Call;
import es.um.uschema.code.metamodels.code.Code;
import es.um.uschema.code.metamodels.code.utils.CodeWriter;
import es.um.uschema.code.metamodels.databaseOperationsSchema.utils.DatabaseOperationsSchemaReader;

public class DboSchema2Code
{
	public void dboSchema2code(String inputUri, String modelOutputUri, String outputUri)
	{
		DatabaseOperationsSchemaReader databaseOperationsSchemaReader = new DatabaseOperationsSchemaReader();
		DatabaseOperationsSchema dboSchemaModel = databaseOperationsSchemaReader.readDBOSchemaModel(inputUri);
		Code code = databaseOperationsSchemaReader.getCode();
		
		process(dboSchemaModel);
		
		CodeWriter codeWriter = new CodeWriter(code);
		codeWriter.printToXmi(modelOutputUri);

		Code2Text code2Text = new Code2Text();
		code2Text.code2text(modelOutputUri.substring(0, modelOutputUri.lastIndexOf('/')), outputUri);
	}

	private void process(DatabaseOperationsSchema dboSchemaModel)
	{
		for (Container targetContainer : dboSchemaModel.getContainers()) 
		{
			for (DataStructure targetDataStructure : targetContainer.getDataStructures()) 
			{
				for (DatabaseOperation databaseOperation : dboSchemaModel.getDatabaseOperations())
				{
					if (databaseOperation instanceof Read) {
						Read read = (Read) databaseOperation;
						if (read.getResultDataStructure() != null && !read.getResultDataStructure().getContainer().equals(targetContainer))
							processRead(targetDataStructure, read);
					}
				}
			}
		}
	}

	private void processRead(DataStructure targetDataStructure, Read read)
	{
		DataStructure resultDataStructure = read.getResultDataStructure();
		
		if (read.getStatement() instanceof Call) {
			Call call = (Call) read.getStatement();
			if (call.getName().startsWith("find")) {
				processFindOperation(targetDataStructure, read, call, resultDataStructure); 
			} else if (call.getName().equals("aggregate")) {
				processAggregateOperation(targetDataStructure, read, call, resultDataStructure);
			}
		}
	}

	private void processFindOperation(DataStructure targetDataStructure, Read read, Call call, DataStructure resultDataStructure)
	{
		Field referenceField = findReferenceInDataStructure(targetDataStructure);
		
		if (referenceField != null) {
			new FindRewritter().processStatement(read, call, resultDataStructure.getContainer().getName(), referenceField);
		}
	}
	
	private Field findReferenceInDataStructure(DataStructure dataStructure) {
		if (dataStructure != null) {
			for (Field field : dataStructure.getFields()) {
				if (field.getType() instanceof Reference) {
					return field;
				}
				Field fieldFound = findReference(field.getType());
				if (fieldFound != null)
					return fieldFound;
			}
		}
		
		return null;
	}

	private Field findReference(Type type) {
		if (type instanceof Collection) {
			Collection collection = (Collection) type;
			for (Type collectionType : collection.getTypes()) {
				Field fieldFound = findReference(collectionType);
				if (fieldFound != null)
					return fieldFound;
			}
		} else if (type instanceof Composition) {
			Composition composition = (Composition) type;
			return findReferenceInDataStructure(composition.getDataStructure());
		}
		
		return null;
	}

	private void processAggregateOperation(DataStructure targetDataStructure, Read read,
			Call call, DataStructure resultDataStructure)
	{
		Optional<Field> referenceField = resultDataStructure.getFields().stream()
			.filter(f -> {
				if (f.getType() instanceof Collection) {
					Collection collection = (Collection) f.getType();
					if (collection.getTypes().size() > 0) {
						if (collection.getTypes().get(0) instanceof Reference) 
							return true;
					}
				}
				return false;
			}).findFirst();
		
		if (referenceField.isPresent()) {
			new AggregateRewritter().processStatement(read, call, targetDataStructure.getContainer().getName(), referenceField.get());
		}
	}

	
}
