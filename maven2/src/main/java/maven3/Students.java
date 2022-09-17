package maven3;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "students")
@XmlAccessorType(XmlAccessType.FIELD)
public class Students {
	@XmlElement(name = "student")
	private List<student> students=null;

	public List<student> getStudents() {
		return students;
	}

	public void setStudents(List<student> students) {
		this.students = students;
	}
	
}
