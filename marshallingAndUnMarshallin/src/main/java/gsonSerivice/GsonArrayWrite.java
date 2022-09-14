package gsonSerivice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;

public class GsonArrayWrite {
	public static void main(String[] args) throws IOException {
		ArrayList arr = new ArrayList();
		arr.add(new empolyee(01, "siva", 765327, "Developer"));
		arr.add(new empolyee(02, "shankar", 765327, "Developer"));
		arr.add(new empolyee(03, "mahesh", 765327, "Developer"));
		arr.add(new empolyee(04, "shan", 765327, "Developer"));
		arr.add(new empolyee(05, "sriman", 765327, "Developer"));

		Gson gson = new Gson();
		String s = (String) gson.toJson(arr);
		FileWriter file = new FileWriter("src/main/java/gsonSerivice/GsonArray.json");
		gson.toJson(arr, file);
		file.flush();
		file.close();
		System.out.println("sucess");
		System.out.println(arr);
	}
}
