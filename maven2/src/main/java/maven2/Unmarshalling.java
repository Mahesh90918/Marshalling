package maven2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshalling {
public static void main(String[] args) throws JAXBException, FileNotFoundException {
	JAXBContext j= JAXBContext.newInstance(Employees.class);
	Unmarshaller un=j.createUnmarshaller();
	//We had written this file in marshalling example
	Employees al1=(Employees) un.unmarshal(new FileInputStream("src/main/java/maven2/marshalling2.xml"));
	for (Employee emp : al1.getEmployees()) {
		System.out.println(emp.getId());
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getIncome());
		// this is When to String Avaliable
		System.out.println("toString  :"+emp.toString());
	}
}
}
