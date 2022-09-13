package marshiling.xml;

import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

public class test {
public static void main(String[] args) {
	
	marshallingTest m= new marshallingTest();
	try {
		marshallingTest.marshalling();
		m.Unmarshalling();
	} catch (FileNotFoundException | JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
