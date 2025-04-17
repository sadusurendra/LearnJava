package corejava.a2.datatypes;

public class A2_Implicit_Explicit {

	public static void main(String[] args) {

		int a = 70;
		byte b = (byte) a; // explicit -- we have to explicitly convert

		char c = (char) a;
		System.out.println(c);

		byte b1 = 100;
		int a1 = b1; // implicit -- it auto converts

		
		int a2 = 130;
		byte b2 = (byte) a2;
		System.out.println(b2);
		
	}

}
