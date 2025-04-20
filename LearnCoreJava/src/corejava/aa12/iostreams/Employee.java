package corejava.aa12.iostreams;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	String name;
	double salary;
	transient int ssn; // If we use transient data will not be serializable

	public Employee(int id, String name, double salary, int ssn) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}

}
