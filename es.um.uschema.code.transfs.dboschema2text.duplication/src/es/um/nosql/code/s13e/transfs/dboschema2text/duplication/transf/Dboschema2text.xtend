package es.um.nosql.code.s13e.transfs.dboschema2text.duplication.transf

import es.um.uschema.code.metamodels.databaseOperationsSchema.Collection
import es.um.uschema.code.metamodels.databaseOperationsSchema.Composition
import es.um.uschema.code.metamodels.databaseOperationsSchema.Container
import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field
import es.um.uschema.code.metamodels.databaseOperationsSchema.Reference
import es.um.uschema.code.metamodels.databaseOperationsSchema.Type
import es.um.uschema.code.metamodels.databaseOperationsSchema.utils.DatabaseOperationsSchemaReader
import java.io.File
import java.io.FileWriter
import java.util.HashMap
import java.util.List

class Dboschema2text 
{
	def dboschema2text(String inputsUri, String outputsUri)
	{
		var dboSchemaModel = new DatabaseOperationsSchemaReader().readDBOSchemaModel(inputsUri)
		var updatesText = newLinkedList
		var tipsText = newLinkedList
		
		for (targetContainer : dboSchemaModel.containers) 
		{
			for (dataStructure : targetContainer.dataStructures) 
			{
				var duplicatedFields = generateDuplicateMap(dataStructure)
				if (duplicatedFields.size > 0)
					generateUpdateText(dataStructure, targetContainer, duplicatedFields, updatesText, tipsText)
			}
		}
		
		printCode(outputsUri, updatesText)
		printTips(outputsUri, tipsText)
	}
	
	protected def void generateUpdateText(DataStructure dataStructure, Container targetContainer, 
			HashMap<DataStructure, List<Field>> duplicatedFields, List<CharSequence> updatesText,
			List<CharSequence> tipsText
	) {
		for (field : dataStructure.fields) 
		{
			if (field.type instanceof Reference) {
				generateReferenceUpdate(field, updatesText, targetContainer, duplicatedFields, tipsText)
			} else if (field.type instanceof Collection) {
				generateReferencesListUpdate(field, updatesText, targetContainer, duplicatedFields, tipsText)
			}
		}
	}
	
	protected def void generateReferenceUpdate(Field field, List<CharSequence> updatesText, Container targetContainer, 
		HashMap<DataStructure, List<Field>> duplicatedFields, List<CharSequence> tipsText
	) {
		var reference = field.type as Reference
		var referredField = reference.targetField
		var sourceContainer  = reference.targetContainer
		
		for (sourceDataStructure : sourceContainer.dataStructures) 
		{
			tipsText.add("Copy : " + sourceContainer.name + 
				duplicatedFields.get(sourceDataStructure).map[f | f.name].toList + " to: " + targetContainer.name);

			updatesText.add(
				new UpdateTemplate().applyTemplate(sourceContainer.name, targetContainer.name, sourceDataStructure,
						 field, referredField, duplicatedFields.get(sourceDataStructure), "$set")
			)
		}
	}
	
	protected def void generateReferencesListUpdate(Field field, List<CharSequence> updatesText, 
		Container targetContainer, HashMap<DataStructure, List<Field>> duplicatedFields, List<CharSequence> tipsText
	) {
		var collection = field.type as Collection
		if (collection.types.size > 0) {
			var type = collection.types.get(0)
			
			if (type instanceof Composition) {
				for (embeddedField : type.dataStructure.fields) {
					var embeddedType = embeddedField.type
					if (embeddedType instanceof Reference) {
						duplicateReference(embeddedType, tipsText, duplicatedFields, targetContainer, field.name, updatesText, field)
					}
				}
				
			}
			
			if (type instanceof Reference) {
				duplicateReference(type, tipsText, duplicatedFields, targetContainer, targetContainer.name, updatesText, field)
			}
		}
	}
	
	protected def void duplicateReference(Reference type, List<CharSequence> tipsText, HashMap<DataStructure, List<Field>> duplicatedFields, Container targetContainer, String targetContainerName, List<CharSequence> updatesText, Field field) {
		var reference = type as Reference
		if (reference.eContainer instanceof Field) {
			generateEmbeddedUpdate(reference, duplicatedFields, tipsText, targetContainer, targetContainerName, updatesText, field, reference.eContainer as Field)
		} else if (reference.eContainer instanceof Collection) {
			var collection = reference.eContainer as Collection
			if (collection.eContainer instanceof Field) {
				generateEmbeddedUpdate(reference, duplicatedFields, tipsText, targetContainer, targetContainerName, updatesText, field, collection.eContainer as Field)
			}
		} 
	}
	
	protected def void generateEmbeddedUpdate(Reference reference, HashMap<DataStructure, List<Field>> duplicatedFields, List<CharSequence> tipsText, Container targetContainer, String targetContainerName, List<CharSequence> updatesText, Field field, Field sourceFieldName) {
		var referredField = reference.targetField
		var sourceContainer  = reference.targetContainer
		
		for (sourceDataStructure : sourceContainer.dataStructures) 
		{
			var sourceField = duplicatedFields.get(sourceDataStructure);
			
			if (!targetContainer.name.equals(targetContainerName)) {
				tipsText.add("Copy : " + sourceContainer.name + sourceField.map[f | f.name].toList + " to: " + (targetContainer.name + ".") + targetContainerName);
			} else {
				tipsText.add("Copy : " + sourceContainer.name + sourceField.map[f | f.name].toList + " to: " + targetContainerName);
			}				
			
			updatesText.add(
				new UpdateEmbeddedTemplate().applyTemplate(sourceContainer.name, targetContainerName, targetContainer, sourceDataStructure,
						 field, referredField, duplicatedFields.get(sourceDataStructure), sourceFieldName.name)
			)
		}
	}
	
	protected def HashMap<DataStructure, List<Field>> generateDuplicateMap(DataStructure dataStructure) 
	{
		var duplicatedFields = newHashMap
		processDataStructure(dataStructure, duplicatedFields)
		
		return duplicatedFields
	}
	
	protected def void processDataStructure(DataStructure dataStructure, HashMap<DataStructure, List<Field>> duplicatedFields) {
		if (dataStructure != null) {
			for (field : dataStructure.fields) 
			{
				if (field.duplicatedField !== null) 
				{
					var sourceDataStructure = field.duplicatedField.eContainer as DataStructure
					pushFieldToMapList(duplicatedFields, sourceDataStructure, field);
				} 
				checkType(field.type, duplicatedFields)
			}
		}
	}
	
	protected def Object checkType(Type type, HashMap<DataStructure, List<Field>> duplicatedFields) {
		if (type instanceof Collection) {
			for (collectionType : type.types) {
				checkType(collectionType, duplicatedFields)
			}
		} else if (type instanceof Composition) {
			processDataStructure( type.dataStructure, duplicatedFields)
		}
		
		return null
	}
	
	protected def boolean pushFieldToMapList(HashMap<DataStructure, List<Field>> duplicatedFields, 
		DataStructure sourceDataStructure, Field field
	) {
		var duplicatedFieldList = duplicatedFields.get(sourceDataStructure)
		if (duplicatedFieldList === null) 
		{
			duplicatedFieldList = newLinkedList
			duplicatedFields.put(sourceDataStructure, duplicatedFieldList)
		}
		duplicatedFieldList.add(field)
	}
	
	protected def void printCode(String outputsUri, List<CharSequence> updatesText) 
	{
		var i = 0;
		new File(outputsUri).mkdirs
		
		for (text : updatesText) 
		{
			val file = new File(outputsUri + "/update" + (i++) + ".js")
			val fileWriter = new FileWriter(file)
			fileWriter.append(text)
			fileWriter.close
		}
		
	}
	
	protected def void printTips(String outputsUri, List<CharSequence> tipsText) 
	{
		new File(outputsUri).mkdirs
		
		val file = new File(outputsUri + "/possibles-duplication.js")
		val fileWriter = new FileWriter(file)
		val newLine = System.getProperty("line.separator")
		fileWriter.append("Duplication: " + newLine)
		for (text : tipsText) 
		{
			fileWriter.append("\t" + text +  newLine)
		}
			fileWriter.close
		
	}
	
}