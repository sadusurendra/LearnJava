package corejava.aa15.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeArraysDemo {

	public static void main(String[] args) {
		String s1[] = { "A", "B", "C" };
		String s2[] = { "E", "F", "G" };

		ArrayList<String> a = new ArrayList<String>(Arrays.asList(s1));
		a.addAll(Arrays.asList(s2));

		Object[] obj = a.toArray();

		System.out.println(Arrays.toString(obj));

		Integer[] ia = { 10, 9, 4, 6, 11, 34, 23 };
		int min = Collections.min(Arrays.asList(ia));
		int max = Collections.max(Arrays.asList(ia));
		System.out.println(min + " :: " + max);

	}

}
