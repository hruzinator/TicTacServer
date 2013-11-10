package dabaseInterfaces;

import com.google.gson.JsonElement;

/**
 * Provides a toolkit with interfacing with a JSON file
 * 
 * @author Matthew Hruz
 *
 */
public class JsonManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String JsonToString(JsonElement j){
		return j.getAsString();
	}
	
	//public JsonElement StringToJson(String s){}

}
