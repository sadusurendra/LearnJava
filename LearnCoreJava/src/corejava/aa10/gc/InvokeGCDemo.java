package corejava.aa10.gc;

public class InvokeGCDemo {
	int id;

	public InvokeGCDemo(int id) {
		this.id = id;
		System.out.println("Created " + this.id);
	}

	public static void main(String[] args) {
		new InvokeGCDemo(1);
		new InvokeGCDemo(2);
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			System.gc();
		}
	}

	// Finalized method invokes when the memory is full
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized " + this.id);
	}

}
