package corejava.a9.thread;

public class ThradPriority extends Thread {

	static int threadNumber = 1;

	public static void main(String[] args) throws InterruptedException {

		SetNameToThread m = new SetNameToThread();
		m.setName("Thread " + (threadNumber++));
		m.setPriority(MAX_PRIORITY);
		m.start();

		SetNameToThread m1 = new SetNameToThread();
		m1.setName("Thread " + (threadNumber++));
		m1.setPriority(MIN_PRIORITY);
		m1.start();

		Thread t = Thread.currentThread();
		System.out.println("Thread name is " + t.getName());
	}

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread name is " + t.getName());
	}

}
