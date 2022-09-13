package gsonSerivice;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class gsonCreation {
	// gson Writer
	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		empolyee e = new empolyee(01, "mahesh", 765327, "Developer");
		String output=gson.toJson(e);
		FileWriter file = new FileWriter("src/main/java/gsonSerivice/gson.json");
		gson.toJson(e,file);
		file.flush();
		file.close();
		System.out.println(e);
	}
}
