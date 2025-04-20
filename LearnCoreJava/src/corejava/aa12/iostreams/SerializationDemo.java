package corejava.aa12.iostreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		try (FileOutputStream fr = new FileOutputStream(new File("C:\\Learn_Java\\LearnCoreJava\\files\\Emp.ser"));
				ObjectOutputStream os = new ObjectOutputStream(fr);) {

			Employee e = new Employee(1, "Jhon", 10000, 12345);
			os.writeObject(e);

			System.out.println("Employee Serialization is Done");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
