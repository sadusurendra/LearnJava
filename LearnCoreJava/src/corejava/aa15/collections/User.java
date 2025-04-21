package corejava.aa15.collections;

public class User {

	@Override
	public String toString() {
		return "user";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method is called");
	}

}
