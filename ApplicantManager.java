import org.bson.Document;

import com.mongodb.client.MongoDatabase;

public class ApplicantManager {
	public static void insertOne(MongoDatabase db, String data){
		
		try{
			// parse data to DBOject & insert to data
			// DBObject dbObject = (DBObject)JSON.parse(data);
			Document data_doc = Document.parse(data);
			db.getCollection("applicant").insertOne(data_doc);
			db.getCollection("applicant").updateOne(null, null);
			db.getCollection("applicant").deleteOne(null);
			
		}
		catch (com.mongodb.MongoCommandException e){
			System.out.println("Can't insert from some error.");
		}
		
	}
}
