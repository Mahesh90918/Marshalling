package marshilling1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class marshallTest {
	public static void main(String[] args) {
		student s = new student(01, "mahesh", 6236);
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(student.class);
			Marshaller mar = jaxbContext.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			mar.marshal(s, new FileOutputStream("src//marshilling1//student.xml"));
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
