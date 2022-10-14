package marshilling1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class arrayListMarshallin {
	public static void main(String[] args) {
		student s1 = new student(01, "siva", 5000);
		student s2 = new student(02, "sriman", 1000);
		student s3 = new student(03, "san", 2000);
		student s4 = new student(04, "mahesh", 1000);
		student[] s = { s1, s2, s3, s4 };
		ArrayList<student> al = new ArrayList<student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(student.class);
			// must change class name as a ArrayList
			Marshaller mar = jaxbContext.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			PrintWriter file = new PrintWriter("src//marshilling1//ArrayListMar1.xml");
			for (student student : al) {
			//	file.println(student.toString());
				mar.marshal(student, file);
			}
			System.out.println("sucess");
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
