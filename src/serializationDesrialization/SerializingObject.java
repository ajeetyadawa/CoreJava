package serializationDesrialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingObject {
public static void main(String[] args) {
	Employee employeeOutput = null;
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	employeeOutput = new Employee();
	employeeOutput.setSerializeablevaleName("Ajeet");
	employeeOutput.setNonSerializeValueSalary(500);
	try {
	fos = new FileOutputStream("Employee.ser");
	oos = new ObjectOutputStream(fos);
	oos.writeObject(employeeOutput);
	System.out.println("Serialized data is saved in Employee.ser file");
	oos.close();
	fos.close();
	} catch (IOException e) {
	e.printStackTrace();
	} 
	}
}

