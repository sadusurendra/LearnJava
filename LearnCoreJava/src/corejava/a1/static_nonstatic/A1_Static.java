package corejava.a1.static_nonstatic;

public class A1_Static {

	static int num = 0;
	public static void main(String[] args) {
		System.out.println("Main method");
		A1_Static obj = new A1_Static();
		print1();
		obj.print2();
		
		System.out.println("number :: "+num);
	}
	
	static {
		System.out.println("Static blocks will execute before main methods. 1");
	} 
	
	public static void print1() {
		System.out.println("Print 1");
	}
	
	public void print2() {
		System.out.println("Print 2");
	}

	static {
		System.out.println("Static blocks will execute before main methods. 2");
		print1();
	}
	
}
