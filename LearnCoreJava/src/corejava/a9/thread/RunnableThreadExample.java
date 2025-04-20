package corejava.a9.thread;

public class RunnableThreadExample implements Runnable {

	public static void main(String[] args) {
		RunnableThreadExample r = new RunnableThreadExample();

		Thread t1 = new Thread(r);
		t1.start();

		Thread t2 = new Thread(r);
		t2.start();
	}

	@Override
	public void run() {
		System.out.println("Processed the checks");
	}

}
