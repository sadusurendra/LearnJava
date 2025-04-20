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

		/* TreeSet with StringBuffer works from Java 11 Before Java 11 It throws  
		 * Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
		 * 
		 * If  we want to check the error Check same file in v8 project 
		 * */
		TreeSet<StringBuffer> tsb = new TreeSet<StringBuffer>();
		tsb.add(new StringBuffer("xyz"));
		tsb.add(new StringBuffer("efg"));
		tsb.add(new StringBuffer("abc"));
		tsb.add(new StringBuffer("hij"));

		System.out.println(tsb);

	}

}
