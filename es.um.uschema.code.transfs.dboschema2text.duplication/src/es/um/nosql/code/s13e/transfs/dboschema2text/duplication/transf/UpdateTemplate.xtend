package es.um.nosql.code.s13e.transfs.dboschema2text.duplication.transf

import es.um.uschema.code.metamodels.databaseOperationsSchema.DataStructure
import es.um.uschema.code.metamodels.databaseOperationsSchema.Field
import java.util.List

class UpdateTemplate 
{
	def applyTemplate(String sourceContainerName, String targetContainerName, DataStructure sourceDataStructure, 
				 Field referenceField, Field referredField, List<Field> duplicatedFieldList, String insertType)
	'''
		const MongoClient = require('mongodb').MongoClient;
		
		const url = 'mongodb://localhost:27017';
		const dbName = 'mydb';
		
		const client = new MongoClient(url, { useNewUrlParser: true });
		client.connect(conErr = >{
			const db = client.db(dbName);
			db.collection('«sourceContainerName»').find()
				.forEach(source => {	
			        db.collection('«targetContainerName»').updateMany(
			            {
			                «referenceField.name»: source.«referredField.name»
			            }, {
			                «insertType»: {
			                	«IF duplicatedFieldList.size > 0»
			                	«sourceContainerName»_«referenceField.name»: {
			                		«FOR duplicatedField : duplicatedFieldList SEPARATOR ","»
			                		«duplicatedField.name»: source.«duplicatedField.name»
			                		«ENDFOR»
			                	}
			                	«ENDIF»
			                }
			            }, { 
			                multi: true,
			                upsert: false
			            }
			        );
				}).then(() => {
					client.close();
				});
		});
	'''


}