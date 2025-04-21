package corejava.aa16.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethodsDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("c");

		printList(list);
	}

	public static <T> void printList(List<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}

}
