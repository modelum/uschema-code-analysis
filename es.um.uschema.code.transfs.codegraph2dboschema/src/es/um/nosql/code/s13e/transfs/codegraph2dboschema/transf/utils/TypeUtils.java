package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils;

import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Composition;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DataStructure;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Field;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Attribute;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Collection;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Type;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.builder.DBOSchemaBuilder;

public class TypeUtils
{
	public static Type getType(es.um.nosql.code.s13e.metamodels.code.Type type, DBOSchemaBuilder dboSchemaBuilder)
	{
		if (type instanceof es.um.nosql.code.s13e.metamodels.code.PrimitiveType)
		{
			es.um.nosql.code.s13e.metamodels.code.PrimitiveType codePrimitiveType = 
					(es.um.nosql.code.s13e.metamodels.code.PrimitiveType) type;
			
			Attribute primitiveType = dboSchemaBuilder.createPrimitiveType(codePrimitiveType.getType());
			
			return primitiveType;
		}
		
		return null;
	}

	public static Type cloneType(Type type, DBOSchemaBuilder dboSchemaBuilder)
	{
		Type returnType = null;
		if (type instanceof Attribute) {
			returnType = dboSchemaBuilder.createPrimitiveType(((Attribute) type).getName());
		} else if (type instanceof Reference) {
			Reference reference = (Reference) type;
			returnType = dboSchemaBuilder.createReference(reference.getTargetContainer(), reference.getTargetField());
		} else if (type instanceof Composition) {
			Composition originalComposition = (Composition) type;
			DataStructure dataStructure = cloneDataStructure(originalComposition.getDataStructure(), dboSchemaBuilder);
			returnType = dboSchemaBuilder.createComposition(dataStructure);
		} else if (type instanceof Collection) {
			Collection originalCollection = (Collection) type;
			Collection collection = dboSchemaBuilder.createCollection(originalCollection.getCollectionType());
			for (Type collectionType : collection.getTypes()) {
				collection.getTypes().add(cloneType(collectionType, dboSchemaBuilder));
			}
			returnType = collection;
		}
		
		return returnType;
	}

	private static DataStructure cloneDataStructure(DataStructure originDataStructure, DBOSchemaBuilder dboSchemaBuilder)
	{
		DataStructure dataStructure = dboSchemaBuilder.createDataStructure();
		dataStructure.setContainer(originDataStructure.getContainer());
		
		originDataStructure.getFields().forEach(originalField -> {
			if (!originalField.getName().startsWith("$")) {
				Field field = dboSchemaBuilder.createField(originalField.getName());
				field.setType(cloneType(originalField.getType(), dboSchemaBuilder));
			}
		});
		
		return dataStructure;
	}
}
