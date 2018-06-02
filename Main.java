
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Main {

	private static MongoClient mongoClient;

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		InputStream is = new URL(url).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
		}
	}

	public ArrayList<String> cleanData(String data){
		
		// We can't know how many applicant from JSON
		ArrayList<String> applicants = new ArrayList<>();
		
		String temp = "";
		int pos = 0;
		
		// analyze data
		while(true){
			if( data.indexOf("{\"Add") != -1 ){
				pos = data.indexOf("{\"Add");
				data = data.substring(pos);
			}
			if( data.indexOf("},{\"Add") != -1 ){
				pos = data.indexOf("},{\"Add");
				temp = data.substring(0, pos+1);
				applicants.add(temp);
				data = data.substring(pos+2);
			}
			else{
				pos = data.indexOf("\"completed\"");
				temp = data.substring(0,pos-2);
				applicants.add(temp);
				break;
			}
		}
		
		
		// end loop we can know how many applicant
		return applicants;

	}
	
	public static void main(String[] args) throws JSONException, IOException {

		// 1. first step read data from JSON to CRUD operation.
		// read data here.
		Main main = new Main();
		
		// read JSON from URL
		JSONObject json = readJsonFromUrl("http://www.lstpch.com/android/somo/conInfoResume.php?task=select&task_sub=all_plus");
		
		// analyze all data in applicants
		ArrayList<String> applicants = main.cleanData(json.toString());
		
		mongoClient = new MongoClient();
		MongoDatabase db = mongoClient.getDatabase("Users");
		
		/*
		for(String e : applicants){
			ApplicantManager.insertOne(db, e);
		}
		*/
		

		// 3. Show response to JSON file or something
		

	}

}
