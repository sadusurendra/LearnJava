package corejava.aa15.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] sa = { "a", "b", "c", "d" };
		List<String> la = Arrays.asList(sa);

		System.out.println(la);
		sa[1] = "aa";
		System.out.println(la);
//		la.add("e"); // throws Exception in thread "main" java.lang.UnsupportedOperationException
		// error is because the list still points to int[]

		List<String> la2 = new ArrayList<String>(Arrays.asList(sa));
		System.out.println(la2);
		sa[1] = "bb";
		System.out.println(la2);
		la2.add("e");
		// No error because it creates new list
	}

}
