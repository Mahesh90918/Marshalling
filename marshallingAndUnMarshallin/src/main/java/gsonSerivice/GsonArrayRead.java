package gsonSerivice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

public class GsonArrayRead {
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, IOException {
		Gson gson = new Gson();
		FileReader file = new FileReader("src/main/java/gsonSerivice/GsonArray.json");
		JsonElement a = gson.fromJson(file, JsonElement.class);
		// String s=gson.toJson(a);
		System.out.println(a);
		
		
	}
}
