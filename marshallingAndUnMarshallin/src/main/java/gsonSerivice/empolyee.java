package gsonSerivice;

import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlAttribute;

// active Automatic dependiences
// convert java Object to Xml
// maven is one of the Serivice

public class empolyee {
	int id;
	String name;
	double salary;
	String JobRole;
public empolyee() {
	// TODO Auto-generated constructor stub
}
	public empolyee(int id, String name, double salary, String jobRole) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		JobRole = jobRole;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getJobRole() {
		return JobRole;
	}

	public void setJobRole(String jobRole) {
		JobRole = jobRole;
	}

	@Override
	public String toString() {
		return "empolyee [id=" + id + ", name=" + name + ", salary=" + salary + ", JobRole=" + JobRole + "]";
	}

}
