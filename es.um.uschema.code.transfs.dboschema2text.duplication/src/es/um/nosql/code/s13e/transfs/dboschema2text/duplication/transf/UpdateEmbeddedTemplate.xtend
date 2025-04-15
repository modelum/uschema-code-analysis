package es.um.nosql.code.s13e.transfs.dboschema2text.duplication.transf

import es.um.uschema.code.metamodels.databaseOperationsSchema.Field
import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure
import java.util.List
import es.um.uschema.code.metamodels.databaseOperationsSchema.Container

class UpdateEmbeddedTemplate {
		def applyTemplate(String sourceContainerName, String targetContainerName, Container targetContainer, DataStructure sourceDataStructure, 
				 Field referenceField, Field referredField, List<Field> duplicatedFieldList, String sourceFieldName)
	'''
		const MongoClient = require('mongodb').MongoClient;
		
		const url = 'mongodb://localhost:27017';
		const dbName = 'mydb';
		
		const client = new MongoClient(url, { useNewUrlParser: true });
		client.connect(conErr => {
		  const db = client.db(dbName);
		  db.collection('«sourceContainerName»').find()
		    .forEach(source => {
		      db.collection('«targetContainer.name»').updateMany(
		        {«referenceField.name»: {$elemMatch: {«sourceFieldName»: source.«referredField.name»}}},
		        {$set: {'«referenceField.name».$[it].«sourceContainerName.toLowerCase»_«duplicatedFieldList.get(0).name»': source.«duplicatedFieldList.get(0).name»}},
		        {arrayFilters: [{"it.«sourceFieldName»": source.«referredField.name»}]}
		      );
		  })	
		});
	'''
}

