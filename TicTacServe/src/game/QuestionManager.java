package game;
import java.util.ArrayList;
import java.util.Map;

import com.google.*;
import com.google.gson.*;
import com.google.gson.annotations.*;

public class QuestionManager {
	String questions;
		
	//for debugging ONLY
	public static void main(String[] args){
		
	}
	
	public Question getUnansweredQuestion(){
		
		return null;
	}
	
	private void readFromJSONFile(JsonElement j){
		Gson gson = new Gson();
		Response response = gson.fromJson(j, Response.class);
	}
	
	private class Response {
		  private Map<String, App> descriptor;
		  //getters&setters
		}
	
	private class App {
		  private String name;
		  private int age;
		  private String[] messages;
		  //getters&setters
		}
}
