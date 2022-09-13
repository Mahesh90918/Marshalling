package marshiling.xml;

import java.beans.JavaBean;

import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlAttribute;

// marshalling means convertin java file to Xml file
@XmlRootElement
public class empolye {
	int id;
	String name;
	double salary;

	public empolye() {

	}

	public empolye(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//@XmlElement
	@javax.xml.bind.annotation.XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "empolye [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
