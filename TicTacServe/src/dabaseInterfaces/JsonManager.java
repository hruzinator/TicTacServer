package dabaseInterfaces;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import org.json.*;

import com.google.gson.*;

/**
 * Provides a toolkit with interfacing with a JSON file
 * 
 * @author Matthew Hruz
 *
 */
public class JsonManager {

	/*
	 * USE ONLY FOR TESTING
	 */
	public static void main(String[] args) {
		String[] s = new String[5];
		s[0] = "test0";
		s[1] = "test1";
		s[2] = "test2";
		s[3] = "test3";
		s[4] = "test4";
		
		String[] k = new String[5];
		k[0] = "test0";
		k[1] = "test1";
		k[2] = "test2";
		k[3] = "test3";
		k[4] = "test4";
		
//		JsonManager jm = new JsonManager();
//		try {
//			jm.createJsonFile(k, s,);
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public String JsonToString(JsonElement j){
		return j.getAsString();
	}
	
	//TODO create a method to read from JSon
	public void readFRomJsonFile(String filename) throws FileNotFoundException{
//		FileReader fRead = new FileReader(filename);
	}
	
	public String createJsonString(String[] key, String[] value) throws JSONException{
		JSONObject obj = new JSONObject();
		if(key.length != value.length){
			System.out.println("Bad input for JsonManager. Key array is not the same size ans value array");
			return "";
		}
		for(int i = 0; i < key.length; i++){
			obj.put(key[i], value[i]);
		}
		
		return obj.toString();
	}
	
	public void createJsonFile(String[] key, String[] value, String filename) throws JSONException{
		String jsonString = createJsonString(key, value);
		try {
			FileWriter jsonWriter = new FileWriter(filename);
			jsonWriter.write(jsonString);
			jsonWriter.close();
		} catch (IOException e) {
			System.out.println("Error! File not found in JsonManager");
			e.printStackTrace();
		}
	}

}
