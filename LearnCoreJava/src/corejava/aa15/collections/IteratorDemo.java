package corejava.aa15.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			l.add(r.nextInt(10));
		}

		Set<Integer> s = new HashSet<Integer>();
		for (int i : l) {
			s.add(i);
		}

		System.out.println("List Before :: " + l);
		Iterator<Integer> li = l.iterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			li.remove(); // we can remove the object in the List using Iterator object also
		}
		System.out.println("List After :: " + l);

		System.out.println("Set Before :: " + s);
		Iterator<Integer> si = s.iterator();
		while (si.hasNext()) {
			System.out.println(si.next());
			si.remove(); // we can remove the object in the Set using Iterator object also
		}
		System.out.println("Set After :: " + s);

		List<Integer> l2 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			l2.add(r.nextInt(10));
		}

		System.out.println("List 2 Before :: " + l2);
		ListIterator<Integer> li2 = l2.listIterator();
		while (li2.hasPrevious()) {
			System.out.println(li2.previous());
		}
		System.out.println("List 2 After :: " + l2);

		
		Set<Integer> s2 = new HashSet<Integer>();
		for (int i : l2) {
			s2.add(i);
		}

		/* ListIterator works only for List interface */
//		ListIterator<Integer> si2 = s2.listIterator();
		

	}

}
