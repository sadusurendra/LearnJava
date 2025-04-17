package corejava.a5.inheritance;

public class B extends A {

	B() {
		this(10);
		System.out.println("Default  B");
	}

	B(int x) {
		super(x);
		System.out.println("Param B" + x);
	}

	public static void main(String[] args) {

		B b = new B();

	}

}
