package gsonSerivice;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class GsonReading {
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson g = new Gson();
		empolyee gs = g.fromJson(new FileReader("src/main/java/gsonSerivice/gson.json"), empolyee.class);
		System.out.println(gs);
		
//		// 2. JSON string to Java object
//		String json = "{'name' : 'mkyong'}";
//		empolyee staff = g.fromJson(json, empolyee.class);
//		System.out.println(staff);
		
		// 3. JSON file to JsonElement, later String
		JsonElement j = g.fromJson(new FileReader("src/main/java/gsonSerivice/gson.json"), JsonElement.class);
		String result = g.toJson(j);
		System.out.println(j);
		System.out.println(result);
	}
}
