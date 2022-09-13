package marshiling.xml;

import java.io.*;

import javax.xml.bind.*;
import javax.xml.transform.Result;

import org.w3c.dom.Node;

public class marshallingTest {
	public static void marshalling() throws JAXBException, FileNotFoundException {
		empolye e1 = new empolye(01, "mahesh", 5413.0);
		JAXBContext jaxbContext = JAXBContext.newInstance(empolye.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(e1, new FileOutputStream("src/marshiling/xml/marshalling.xml"));
		System.out.println("sucess");

	}

	public static void Unmarshalling() throws JAXBException, FileNotFoundException {
		JAXBContext jaxbContext = JAXBContext.newInstance(empolye.class);
		Unmarshaller un = jaxbContext.createUnmarshaller();
		FileInputStream file = new FileInputStream("src/marshiling/xml/marshalling.xml");
		empolye ee = (empolye) un.unmarshal(file);
		System.out.println(".......UNMARSHALLING.......");
		System.out.println(ee);
		System.out.println("id :"+ee.getId());
		System.out.println("name :"+ee.getName());
		System.out.println("salary :"+ee.getSalary());
	}
}
