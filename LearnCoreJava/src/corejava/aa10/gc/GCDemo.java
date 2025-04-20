package corejava.aa10.gc;

public class GCDemo {
	int id;

	public GCDemo(int id) {
		this.id = id;
		System.out.println("Created " + this.id);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 500000; i++) { // we are pusing the value to check Finalize method to invoke
			new GCDemo(i);
		}
	}

	// Finalized method invokes when the memory is full
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized " + this.id);
	}

}
