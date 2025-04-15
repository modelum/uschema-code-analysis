package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils;

import es.um.uschema.code.metamodels.databaseOperationsSchema.Composition;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Attribute;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Collection;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Reference;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Type;
import es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.builder.DBOSchemaBuilder;

public class TypeUtils
{
	public static Type getType(es.um.uschema.code.metamodels.code.Type type, DBOSchemaBuilder dboSchemaBuilder)
	{
		if (type instanceof es.um.uschema.code.metamodels.code.PrimitiveType)
		{
			es.um.uschema.code.metamodels.code.PrimitiveType codePrimitiveType = 
					(es.um.uschema.code.metamodels.code.PrimitiveType) type;
			
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
