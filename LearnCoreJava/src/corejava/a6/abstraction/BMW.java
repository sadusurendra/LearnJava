package corejava.a6.abstraction;

public abstract class BMW {

	public BMW() {
		System.out.println("BMU Constructor");
	}
	
	void commonFunc() {
		System.out.println("Commfunction in abstract class");
	}
	
	abstract void acceleration();
	
	abstract void speed();
	
}
