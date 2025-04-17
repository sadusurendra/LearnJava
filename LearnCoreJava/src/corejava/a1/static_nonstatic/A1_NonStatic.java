package corejava.a1.static_nonstatic;

public class A1_NonStatic {
	
	A1_NonStatic() {
		System.out.println("Non-static Constructor");
	}
	{
		System.out.println("Non-static block");
	} 
	
	static{
		System.out.println("Static block");
	} 
	
	public void print1() {
		System.out.println("Non-static mehod");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		new A1_NonStatic();
		new A1_NonStatic();
	}

}
