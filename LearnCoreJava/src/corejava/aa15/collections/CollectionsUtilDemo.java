package corejava.aa15.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilDemo {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("z");
		l.add("a");
		l.add("x");
		l.add("b");
		l.add("a");
		l.add("g");

		System.out.println("Before Sorting :: " + l);
		Collections.sort(l);
		System.out.println("After Sorting :: " + l);

		int index = Collections.binarySearch(l, "a");
		System.out.println("index :: " + index);
		
		index = Collections.binarySearch(l, "e");
		System.out.println("index :: " + index);

		Collections.reverse(l);
		System.out.println("After Reversing :: " + l);

	}

}
