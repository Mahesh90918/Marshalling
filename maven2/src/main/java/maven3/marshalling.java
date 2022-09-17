package maven3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class marshalling {
public static void main(String[] args) throws JAXBException, FileNotFoundException {
	Students ss= new Students();
	ArrayList<student> al=new ArrayList<student>();
	ss.setStudents(al);
	al.add(new student(01, "siva", 2500));
	al.add(new student(02, "sriman", 2500));
	al.add(new student(03, "mahesh", 2500));
	al.add(new student(04, "shan", 2500));
	
	JAXBContext j=JAXBContext.newInstance(Students.class);
	Marshaller m= j.createMarshaller();
	m.marshal(ss, new FileOutputStream("src/main/java/maven3/student1.xml"));
	System.out.println("success");
}
}
