package maven2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class marshalling {
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		Employees emp = new Employees();
		// ArrayList<Employee> al = new ArrayList<Employee>();
		emp.setEmployees(new ArrayList<Employee>());
		Employee e1 = new Employee(01, "HariNarayana", "unukuru", 25000);
		Employee e2 = new Employee(02, "HymaVathi", "unukuru", 25000);
		Employee e3 = new Employee(03, "mahesh", "unukuru", 25000);
		Employee e4 = new Employee(04, "Chintu", "unukuru", 25000);
//		al.add(e1);
//		al.add(e2);
//		al.add(e3);
//		al.add(e4);

		emp.getEmployees().add(e1);
		emp.getEmployees().add(e2);
		emp.getEmployees().add(e3);
		emp.getEmployees().add(e4);
		JAXBContext j = JAXBContext.newInstance(Employees.class);
		Marshaller m = j.createMarshaller();
		// m.marshal(emp, System.out);
		m.marshal(emp, new FileOutputStream("src/main/java/maven2/marshalling1.xml"));
		System.out.println("sucess");

	}
}
