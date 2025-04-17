package corejava.a2.datatypes;

public class A2_wrapper {

	public static void main(String[] args) {
		
		int a =100;
		
		String s1 = Integer.toString(a);
		String s2 = String.valueOf(a);
		
		Integer i = new Integer(s1);
		
		int z = i.intValue();
		
		String s3 = i.toString();
		
		int e = Integer.parseInt(s3);
		
		
	}

}
