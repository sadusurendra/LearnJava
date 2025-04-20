package corejava.aa12.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(new File("C:\\Learn_Java\\LearnCoreJava\\files\\Emp.ser"));
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();

		Employee e = (Employee) obj;

		System.out.println("Employee Id: " + e.id);
		System.out.println("Employee Name: " + e.name);
		System.out.println("Employee Salary: " + e.salary);
		System.out.println("Employee SSN: " + e.ssn);

	}

}
