package gsonSerivice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

public class GsonArrayRead {
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, IOException {
		Gson gson = new Gson();
		FileReader file = new FileReader("src/main/java/gsonSerivice/GsonArray.json");
		// 1.way Read
		JsonElement json = gson.fromJson(file, JsonElement.class);
		System.out.println(json);

		// 2.way Read
		// line bye Line Reading
		ArrayList a = gson.fromJson(file, ArrayList.class);
		// String s=gson.toJson(a);
		System.out.println(a);
		ArrayList al = new ArrayList(a);
		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
