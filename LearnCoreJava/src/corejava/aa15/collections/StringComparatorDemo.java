package corejava.aa15.collections;

import java.util.Set;
import java.util.TreeSet;

public class StringComparatorDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("xyz");
		ts.add("efg");
		ts.add("abc");
		ts.add("hij");

		System.out.println(ts);

		/* Reverse order of Strings using Comparator */
		TreeSet<String> tsReverse = new TreeSet<String>(new StringComparatorByOrder());
		tsReverse.add("xyz");
		tsReverse.add("efg");
		tsReverse.add("abc");
		tsReverse.add("hij");

		System.out.println(tsReverse);

		/* order of Strings by length using Comparator */
		TreeSet<String> tsLen = new TreeSet<String>(new StringComparatorByLength());
		tsLen.add("xyzasa");
		tsLen.add("efgasd");
		tsLen.add("abcasdasda");
		tsLen.add("hiasdadasdj");

		System.out.println(tsLen);

		/*
		 * order of Object by id using Comparable
		 * 
		 * If we don't use Comparable in Employee class we get below error like Employee
		 * cannot be cast to class java.lang.Comparable
		 * 
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * corejava.aa15.collections.Employee cannot be cast to class
		 * java.lang.Comparable (corejava.aa15.collections.Employee is in unnamed module
		 * of loader 'app'; java.lang.Comparable is in module java.base of loader
		 * 'bootstrap')
		 * 
		 */
		Set<Employee> tsEmployee = new TreeSet<Employee>();
		tsEmployee.add(new Employee(1, "Jhon 1"));
		tsEmployee.add(new Employee(5, "Doe 5"));
		tsEmployee.add(new Employee(3, "Will 3"));
		tsEmployee.add(new Employee(2, "Peter 2"));
		tsEmployee.add(new Employee(4, "Smith 4"));

		for (Employee e : tsEmployee) {
			System.out.println(e.id + " : " + e.name);
		}

		System.out.println("========================================");
		
		Set<Employee> tsEmployee2 = new TreeSet<Employee>(new EmployeeComparatorByName());
		tsEmployee2.add(new Employee(1, "Jhon 1"));
		tsEmployee2.add(new Employee(5, "Doe 5"));
		tsEmployee2.add(new Employee(3, "Will 3"));
		tsEmployee2.add(new Employee(2, "Peter 2"));
		tsEmployee2.add(new Employee(4, "Smith 4"));

		for (Employee e : tsEmployee2) {
			System.out.println(e.id + " : " + e.name);
		}

	}

}
