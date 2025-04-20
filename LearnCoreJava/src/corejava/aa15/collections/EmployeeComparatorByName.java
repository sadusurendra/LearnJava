package corejava.aa15.collections;

import java.util.Comparator;

public class EmployeeComparatorByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		String id1 = e1.name;
		String id2 = e2.name;
		if (id1.compareTo(id2) < 0) {
			return 1;
		} else if (id1.compareTo(id2) > 0) {
			return -1;
		}
		return 0;
	}

}
