package corejava.a6.abstraction;

public class Honda implements Car {

	public Honda() {
		System.out.println("Constructor Honda");
	}
	
	@Override
	public void accerleration() {
		System.out.println("accerleration Honda");
	}
	
	public void breaks() {
		System.out.println("breaks Honda");
	}

}
