package corejava.aa15.collections;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(40);
		ts.add(30);
		ts.add(20);
		ts.add(50);
		System.out.println(ts);

		System.out.println("Ceiling :: " + ts.ceiling(20) + " :: " + ts.ceiling(24) + " :: " + ts.ceiling(25));
		System.out.println("Floor   :: " + ts.floor(20) + " :: " + ts.floor(31));

		System.out.println("Higher  :: " + ts.higher(20) + " :: " + ts.higher(31));
		System.out.println("Lower   :: " + ts.lower(20) + " :: " + ts.lower(31));

		System.out.println("Poll    :: " + ts.pollFirst() + " :: " + ts.pollLast());

		System.out.println(ts);
		
		System.out.println(ts.descendingSet());

	}

}
