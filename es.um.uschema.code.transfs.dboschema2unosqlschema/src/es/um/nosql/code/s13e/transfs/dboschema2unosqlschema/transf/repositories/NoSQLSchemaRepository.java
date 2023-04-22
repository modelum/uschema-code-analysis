package es.um.nosql.code.s13e.transfs.dboschema2unosqlschema.transf.repositories;

import java.util.HashMap;
import java.util.Map;

import es.um.uschema.USchema.EntityType;
import es.um.uschema.USchema.USchema;

public class NoSQLSchemaRepository
{
	private USchema noSQLSchema;
	private Map<String, EntityType> entityTypes;

	public void saveNoSQLSchema(USchema noSQLSchema)
	{
		this.noSQLSchema = noSQLSchema;
		this.entityTypes = new HashMap<String, EntityType>();
	}

	public void saveEntityType(EntityType entityType)
	{
		entityTypes.put(entityType.getName(), entityType);
		this.noSQLSchema.getEntities().add(entityType);
	}

	public EntityType getEntityType(String name)
	{
		return entityTypes.get(name);
	}

	
}
