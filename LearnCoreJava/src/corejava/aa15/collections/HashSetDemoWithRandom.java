package corejava.aa15.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemoWithRandom {

	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			l.add(r.nextInt(20));
		}

		Set<Integer> s = new HashSet<Integer>();
		for (int i : l) {
			s.add(i);
		}

		Set<Integer> lhs = new LinkedHashSet<Integer>();
		for (int i : l) {
			lhs.add(i);
		}

		Set<Integer> ts = new TreeSet<Integer>();
		for (int i : l) {
			ts.add(i);
		}

		System.out.println("List      :: " + l);
		System.out.println("HashSet   :: " + s);
		System.out.println("LinkedSet :: " + lhs);
		System.out.println("TreeSet   :: " + ts);

		// run again and again to see difference

	}

}
