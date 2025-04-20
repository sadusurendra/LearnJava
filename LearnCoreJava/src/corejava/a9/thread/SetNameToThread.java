package corejava.a9.thread;

public class SetNameToThread extends Thread {

//	// way 1
//	
//	public static void main(String[] args) throws InterruptedException {
//
//		SetNameToThread m = new SetNameToThread();
//		m.start();
//
//		Thread t = Thread.currentThread();
//		System.out.println("Thread name is " + t.getName());
//	}
//
//	@Override
//	public void run() {
//		Thread t = Thread.currentThread();
//		t.setName("Run Method");
//		System.out.println("Thread name is " + t.getName());
//	}

	// way 2

	static int threadNumber = 1;

	public static void main(String[] args) throws InterruptedException {

		SetNameToThread m = new SetNameToThread();
		m.setName("Thread " + (threadNumber++));
		m.start();

		SetNameToThread m1 = new SetNameToThread();
		m1.setName("Thread " + (threadNumber++));
		m1.start();

		SetNameToThread m2 = new SetNameToThread();
		m2.setName("Thread " + (threadNumber++));
		m2.start();

		Thread t = Thread.currentThread();
		System.out.println("Thread name is " + t.getName());
	}

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread name is " + t.getName());
	}

}
