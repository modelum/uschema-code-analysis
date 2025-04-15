package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.utils;

import es.um.uschema.code.metamodels.databaseOperationsSchema.Collection;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Composition;
import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Read;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Type;

public class FieldsUtils
{

	public static Field getFieldByName(Read read, String name)
	{
		DataStructure dataStructure = read.getResultDataStructure();
		
		return findFieldByNameInDataStructure(name, dataStructure);
	}

	private static Field findFieldByNameInDataStructure(String name, DataStructure dataStructure) {
		if (dataStructure != null) {
			for (Field field : dataStructure.getFields()) {
				if (field.getName().equals(name)) {
					return field;
				}
				Field fieldFound = checkType(name, field.getType());
				if (fieldFound != null)
					return fieldFound;
			}
		}
		return null;
	}

	private static Field checkType(String name, Type type) {
		if (type instanceof Collection) {
			Collection collection = (Collection) type;
			for (Type collectionType : collection.getTypes()) {
				Field fieldFound = checkType(name, collectionType);
				if (fieldFound != null)
					return fieldFound;
			}
		} else if (type instanceof Composition) {
			Composition composition = (Composition) type;
			return findFieldByNameInDataStructure(name, composition.getDataStructure());
		}
		
		return null;
	}
}
