package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.comparators;

import java.util.List;

import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Attribute;
import es.um.uschema.code.metamodels.databaseOperationsSchema.Type;

public class DataStructureComparator
{
	public static boolean areDataStructureEquals(DataStructure dataStructure, DataStructure ds)
	{
		boolean dataStructureEquals = false;
		if (ds.getFields().size() == dataStructure.getFields().size()) {
			for (Field f1 : ds.getFields())
			{
				boolean fieldEquals = false;
				int i = 0;
				List<Field> fields = dataStructure.getFields();
				while (fieldEquals == false && i < fields.size())
				{
					fieldEquals = areFieldsEquals(f1, fields.get(i));
					i++;
				}
				dataStructureEquals = fieldEquals;
			}
		}
		
		return dataStructureEquals;
	}

	private static boolean areFieldsEquals(Field f1, Field f2)
	{
		if (f1.getName() != null && f2.getName() != null && f1.getName().equals(f2.getName())) {
			Type type1 = f1.getType();
			Type type2 = f2.getType();
			
			return areTypeEquals(type1, type2);
		}
		
		return false;
	}

	private static boolean areTypeEquals(Type type1, Type type2)
	{
		if (type1 != null && type2 != null && type2.getClass() == type2.getClass() ) 
		{
			if (type1 instanceof Attribute && type2 instanceof Attribute) 
			{
				Attribute primitiveType1 = (Attribute) type1;
				Attribute primitiveType2 = (Attribute) type2;
				
				if (primitiveType1.getName().equals(primitiveType2.getName()))
				{
					return true;
				}
			}
		}
		
		return false;
	}
}
