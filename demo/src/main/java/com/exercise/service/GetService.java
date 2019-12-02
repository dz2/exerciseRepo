package com.exercise.service;

import java.net.UnknownHostException;
import org.springframework.stereotype.Service;

import com.exercise.model.Userlog;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

@Service
public class GetService{
	
	
	public Userlog getTestUserlogs(){
		Userlog userlog = new Userlog("ABC123XYZ", "XYZ456ABC", "\"actions\": [\n" + 
				"    {\n" + 
				"      \"time\": \"2018-10-18T21:37:28-06:00\",\n" + 
				"      \"type\": \"CLICK\",\n" + 
				"      \"properties\": {\n" + 
				"        \"locationX\": 52,\n" + 
				"        \"locationY\": 11\n" + 
				"      }\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"time\": \"2018-10-18T21:37:30-06:00\",\n" + 
				"      \"type\": \"VIEW\",\n" + 
				"      \"properties\": {\n" + 
				"        \"viewedId\": \"FDJKLHSLD\"\n" + 
				"      }\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"time\": \"2018-10-18T21:37:30-06:00\",\n" + 
				"      \"type\": \"NAVIGATE\",\n" + 
				"      \"properties\": {\n" + 
				"        \"pageFrom\": \"communities\",\n" + 
				"        \"pageTo\": \"inventory\"\n" + 
				"      }\n" + 
				"    }\n" + 
				"  ]\n" + 
				"" );
		
		
		
		return userlog;
		
		
	}
	
	public String postUserlogs(String logstring) {
		
		try {
			MongoClient mongoClient = new MongoClient();
			
			DB database = mongoClient.getDB("TheDatabaseName");
			DBCollection collection = database.getCollection("TheCollectionName");
			
			DBObject dbObject = (DBObject) JSON.parse(logstring);
			
			collection.insert(dbObject);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "done";
	}

}
