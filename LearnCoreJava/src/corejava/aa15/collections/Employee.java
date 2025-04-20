package corejava.aa15.collections;

//public class Employee {
public class Employee implements Comparable<Employee> {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee e) {
		int id1 = this.id;
		int id2 = e.id;
		if (id1 < id2) {
			return 1;
		} else if (id1 > id2) {
			return -1;
		}
		return 0;
	}

//	@Override
//	public int compareTo(Employee e) {
//		String id1 = this.name;
//		String id2 = e.name;
//		if (id1.compareTo(id2) < 0) {
//			return 1;
//		} else if (id1.compareTo(id2) > 0) {
//			return -1;
//		}
//		return 0;
//	}

}
