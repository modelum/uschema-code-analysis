package es.um.nosql.code.s13e.transfs.dboschema2unosqlschema.transf;

import java.io.File;

import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DatabaseOperationsSchema;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.utils.DatabaseOperationsSchemaReader;
import es.um.nosql.code.s13e.transfs.dboschema2unosqlschema.transf.builder.NoSQLSchemaBuilder;
import es.um.nosql.code.s13e.transfs.dboschema2unosqlschema.transf.repositories.NoSQLSchemaRepository;
import es.um.uschema.USchema.EntityType;
import es.um.uschema.USchema.StructuralVariation;
import es.um.uschema.USchema.USchema;
import es.um.uschema.utils.EcoreModelIO;

public class DboSchema2uNoSQLSchema
{
	private NoSQLSchemaBuilder noSQLSchemaBuilder;

	public DboSchema2uNoSQLSchema()
	{
		this.noSQLSchemaBuilder = new NoSQLSchemaBuilder(new NoSQLSchemaRepository());
	}
	
	public void dboSchema2uNoSQLSchema(String inputUri, String outputUri)
	{
		DatabaseOperationsSchemaReader dboSchemaReader = new DatabaseOperationsSchemaReader();
		DatabaseOperationsSchema dboSchemaModel = dboSchemaReader.readDBOSchemaModel(inputUri);
		
		USchema uSchema = processDboSchema(dboSchemaModel);
		
		EcoreModelIO noSQLSchemaWriter = new EcoreModelIO();
		new File(outputUri.substring(0, outputUri.lastIndexOf('/'))).mkdirs();
		noSQLSchemaWriter.write(uSchema, new File(outputUri).toPath());
	
	}

	private USchema processDboSchema(DatabaseOperationsSchema dboSchemaModel)
	{
		USchema noSQLSchema = noSQLSchemaBuilder.createAndSaveNoSQLSchema("MongoDB");
		dboSchemaModel.getContainers().forEach(c -> {
			EntityType et = noSQLSchemaBuilder.createEntityTypeAndSave(c.getName());
			c.getDataStructures().forEach(ds -> {
				StructuralVariation sv = noSQLSchemaBuilder.createStructuralVariationAndSave(et);
				ds.getFields().forEach(f -> {
					if (f.getDuplicatedField() == null)
						noSQLSchemaBuilder.createPropertyAndSave(f.getName(), f.getType(), sv);
				});
			});
		});
		
		return noSQLSchema;
	}

}
