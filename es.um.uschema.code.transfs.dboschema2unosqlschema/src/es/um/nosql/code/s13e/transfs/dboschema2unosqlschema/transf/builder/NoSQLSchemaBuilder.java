package es.um.nosql.code.s13e.transfs.dboschema2unosqlschema.transf.builder;

import org.eclipse.emf.common.util.EList;

import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Attribute;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Collection;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Composition;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.DataStructure;
import es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Type;

import es.um.nosql.code.s13e.transfs.dboschema2unosqlschema.transf.repositories.NoSQLSchemaRepository;

import es.um.uschema.USchema.Aggregate;
import es.um.uschema.USchema.DataType;
import es.um.uschema.USchema.EntityType;
import es.um.uschema.USchema.Feature;
import es.um.uschema.USchema.USchema;
import es.um.uschema.USchema.PList;
import es.um.uschema.USchema.PrimitiveType;
import es.um.uschema.USchema.Reference;
import es.um.uschema.USchema.StructuralVariation;
import es.um.uschema.USchema.USchemaFactory;

public class NoSQLSchemaBuilder
{
	private static final String STRING = "String";

	private NoSQLSchemaRepository noSQLSchemaRepository;
	private USchemaFactory noSQLSchemaFactory;

	public NoSQLSchemaBuilder(NoSQLSchemaRepository noSQLSchemaRepository)
	{
		this.noSQLSchemaRepository = noSQLSchemaRepository;
		this.noSQLSchemaFactory = USchemaFactory.eINSTANCE;
	}

	public USchema createAndSaveNoSQLSchema(String name)
	{
		USchema noSQLSchema = noSQLSchemaFactory.createUSchema();
		noSQLSchema.setName(name);
		
		noSQLSchemaRepository.saveNoSQLSchema(noSQLSchema);
		
		return noSQLSchema;
	}
	
	public EntityType createEntityTypeAndSave(String entityTypeName)
	{
		return createEntityTypeAndSave(entityTypeName, true);
	}

	public EntityType createEntityTypeAndSave(String entityTypeName, boolean root)
	{
		EntityType entityType = noSQLSchemaRepository.getEntityType(entityTypeName);
		if (entityType == null)
		{
			entityType = noSQLSchemaFactory.createEntityType();
			entityType.setName(entityTypeName);
			entityType.setRoot(root);
			noSQLSchemaRepository.saveEntityType(entityType);
		}
		
		return entityType;
	}

	public StructuralVariation createStructuralVariation()
	{
		StructuralVariation structuralVariation = noSQLSchemaFactory.createStructuralVariation();
		structuralVariation.setVariationId(1);
		return structuralVariation;
	}

	public StructuralVariation createStructuralVariationAndSave(EntityType entityType)
	{
		StructuralVariation structuralVariation = createStructuralVariation();
		structuralVariation.setVariationId(entityType.getVariations().size() + 1);
		entityType.getVariations().add(structuralVariation);
		
		return structuralVariation;
	}

	public Feature createPropertyAndSave(String name, Type type, StructuralVariation structuralVariation)
	{
		Feature property = createPropertyByType(name, type, structuralVariation);
		if (property != null) 
		{
			structuralVariation.getFeatures().add(property);
		}
			
		return property;
	}

	private Feature createPropertyByType(String name, Type type, StructuralVariation structuralVariation)
	{
		Feature property = null;
		
		if (type instanceof es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Attribute) {
			property = createAttribute(name, createDataType(type));
		} else if (type instanceof es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Collection) {
			Collection collection = (Collection) type;
			EList<Type> types = collection.getTypes();
			if (types.size() > 0) {
				Type collectionType = types.get(0);
				if (collectionType instanceof Composition) {
					Aggregate aggregate = createAggregate(name, collectionType, structuralVariation);
					aggregate.setUpperBound(-1);
					aggregate.setLowerBound(0);
					
					structuralVariation.getFeatures().add(aggregate);
				} else if (collectionType instanceof es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference) {
					es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference dosReference = (es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference) collectionType;
					
					Reference reference = createReference("", dosReference);
					
					Attribute referenceType = dosReference.getReferenceType();
					
					es.um.uschema.USchema.Attribute attribute = null;
					if (dosReference.eContainer() instanceof Collection) {
						DataType dataType = createDataType((Collection) dosReference.eContainer());
						if (dataType instanceof PList) {
							PList pList = (PList) dataType;
							DataType pListDataType = createDataType(referenceType);
							pList.setElementType(pListDataType);

							reference.setLowerBound(0);
							reference.setUpperBound(-1);
						}
						attribute = createAttribute(name, dataType);
					} else {
						DataType dataType = createDataType(referenceType);
						attribute = createAttribute(name, dataType);
						
						reference.setLowerBound(0);
						reference.setUpperBound(1);
					}

					reference.getAttributes().add(attribute);
					attribute.getReferences().add(reference);
					
					structuralVariation.getFeatures().add(reference);
					structuralVariation.getFeatures().add(attribute);
				}
			}
			
		} else if (type instanceof es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference) {
			es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference dosReference = (es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference) type;
			
			Reference reference = createReference(name, dosReference);
			property = reference;

			Attribute referenceType = dosReference.getReferenceType();
			DataType dataType = createDataType(referenceType);
			es.um.uschema.USchema.Attribute attribute = createAttribute(name, dataType);
			
			reference.getAttributes().add(attribute);
			attribute.getReferences().add(reference);

			structuralVariation.getFeatures().add(attribute);
			structuralVariation.getFeatures().add(reference);
		} else if (type instanceof Composition) {
			property = createAggregate(name, type, structuralVariation);
		} else {
			property = createSimpleAttribute(name);
		}
		
		return property;
	}

	private es.um.uschema.USchema.Attribute createSimpleAttribute(String name)
	{
		es.um.uschema.USchema.Attribute attribute = noSQLSchemaFactory.createAttribute();
		attribute.setName(name);
		
		PrimitiveType primitiveType = noSQLSchemaFactory.createPrimitiveType();
		primitiveType.setName(STRING);
		attribute.setType(primitiveType);
		
		return attribute;
	}

	private es.um.uschema.USchema.Attribute createAttribute(String name, DataType dataType)
	{
		es.um.uschema.USchema.Attribute attribute = noSQLSchemaFactory.createAttribute();
		attribute.setName(name);
		attribute.setType(dataType);
		
		return attribute;
	}

	private Reference createReference(String name, es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Reference reference)
	{
		Reference noSqlSchemaReference = noSQLSchemaFactory.createReference();
		String targetContainerName = reference.getTargetContainer().getName();
		EntityType entityType = noSQLSchemaRepository.getEntityType(targetContainerName);
		if (entityType == null) {
			entityType = createEntityTypeAndSave(targetContainerName, false);
		}
		
		noSqlSchemaReference.setRefsTo(entityType);
		noSqlSchemaReference.setLowerBound(1);
		noSqlSchemaReference.setUpperBound(1);
		
		return noSqlSchemaReference;
	}

	private Aggregate createAggregate(String name, Type type, StructuralVariation structuralVariation)
	{
		Composition composition = (Composition) type;
		Aggregate aggregate = noSQLSchemaFactory.createAggregate();
		aggregate.setName(name);

		StructuralVariation aggregates = createStructuralVariationFromDataStructure(name, structuralVariation, composition.getDataStructure());
		aggregate.getAggregates().add(aggregates);
		
		return aggregate;
	}

	private StructuralVariation createStructuralVariationFromDataStructure(String name, StructuralVariation structuralVariation,
			DataStructure dataStructure)
	{
		StructuralVariation innerStructuralVariation = createStructuralVariation();
		EntityType entityType = createEntityTypeAndSave(name, false);
		entityType.getVariations().add(innerStructuralVariation);
		dataStructure.getFields().forEach(f -> {
			if (f.getDuplicatedField() == null)
				createPropertyAndSave(f.getName(), f.getType(), innerStructuralVariation);
		});
		
		return structuralVariation;
	}

	private DataType createDataType(Type type)
	{
		if (type instanceof es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Attribute) {
			es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Attribute dboSchemaPrimitiveType = (es.um.nosql.code.s13e.metamodels.databaseOperationsSchema.Attribute) type;
			
			PrimitiveType noSQLSchemaPrimitiveType = noSQLSchemaFactory.createPrimitiveType();
			noSQLSchemaPrimitiveType.setName(dboSchemaPrimitiveType.getName());
			
			return noSQLSchemaPrimitiveType;
		} else if (type instanceof Collection) {
			Collection collection = (Collection) type;
			if (collection.getTypes().size() > 0) {
				DataType collectionType = createDataType(collection.getTypes().get(0));
				PList pList = noSQLSchemaFactory.createPList();
				pList.setElementType(collectionType);
				
				return pList;
			}
		} 
		
		return null;
	}
	
}
