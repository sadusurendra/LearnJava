package corejava.aa15.collections;

import java.util.TreeSet;

public class TreeSetDemoWithStrings {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("xyz");
		ts.add("efg");
		ts.add("abc");
		ts.add("hij");

		System.out.println(ts);

		TreeSet<StringBuffer> tsb = new TreeSet<StringBuffer>();
		tsb.add(new StringBuffer("xyz"));
		tsb.add(new StringBuffer("efg"));
		tsb.add(new StringBuffer("abc"));
		tsb.add(new StringBuffer("hij"));

		System.out.println(tsb);

	}

}
