package corejava.aa15.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
//		ArrayList a = new ArrayList();
//
//		a.add(123);
//		a.add(123.45);
//		a.add("Hello");

		ArrayList a = new ArrayList(Arrays.asList(123, 123.45, "Hello"));

		System.out.println(a);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		a.add(1, "World");
		System.out.println(a);

//		a.add(100, "World");
//		System.out.println(a);

		a.set(2, "!");
		System.out.println(a);

		ArrayList b = new ArrayList(Arrays.asList(123, 123.45, "Hello"));

		a.addAll(b);

		a.addAll(2, b);
		System.out.println(a);

		if (a.contains(123)) {
			System.out.println("List has the value");
		} else {
			System.out.println("List doesn't have the value");
		}

		for (int i = 0; i < a.size(); i++) {
			a.get(i);
		}
		a.remove(1);
		System.out.println(a);

	}

}
