package mavenRepostary;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {
public static void main(String[] args) {
	
	try {
		empolyee e= new empolyee(01, "mahesh", 63465, "software Developer");
		JAXBContext jaxb=JAXBContext.newInstance(empolyee.class);
		Marshaller mar=jaxb.createMarshaller();
		mar.marshal(e, new FileOutputStream("src/main/java/mavenRepostary/emp.xml"));
		System.out.println("sucess");
	} catch (JAXBException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}
