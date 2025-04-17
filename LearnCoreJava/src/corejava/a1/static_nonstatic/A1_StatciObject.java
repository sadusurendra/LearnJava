package corejava.a1.static_nonstatic;

public class A1_StatciObject {

	static A1_StatciObject obj;
	
	static {
		System.out.println(obj);
		obj = new A1_StatciObject();
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println(obj);
	}
	
}
