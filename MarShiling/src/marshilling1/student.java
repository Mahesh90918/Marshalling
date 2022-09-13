package marshilling1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class student {
	int id;
	String name;
	double slary;
public student() {
	// TODO Auto-generated constructor stub
}
	public student(int id, String name, double slary) {
		super();
		this.id = id;
		this.name = name;
		this.slary = slary;
	}

	@XmlElement
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

	@XmlElement
	public double getSlary() {
		return slary;
	}

	public void setSlary(double slary) {
		this.slary = slary;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", slary=" + slary + "]";
	}
}
