package Unmarshalling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.w3c.dom.Node;

public class marshallTest {
	public static void main(String[] args) {
		student s = new student(01, "mahesh", 6236);
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(student.class);
			Unmarshaller mar = jaxbContext.createUnmarshaller();
			FileInputStream file= new FileInputStream("src/Unmarshalling/student.xml");
			student ss=(student) mar.unmarshal(file);
			System.out.println(ss);
			System.out.println("sucess");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
