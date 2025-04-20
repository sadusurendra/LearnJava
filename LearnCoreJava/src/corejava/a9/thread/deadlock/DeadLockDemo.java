package corejava.a9.thread.deadlock;

public class DeadLockDemo implements Runnable {

	FirstResource fr = new FirstResource();
	SecondResource sr = new SecondResource();

	public static void main(String[] args) {
		DeadLockDemo dd = new DeadLockDemo();

		Thread thread1 = new Thread(dd);
		thread1.start();

		dd.sr.method1(dd.fr);

	}

	public void run() {
		fr.method1(sr);
	}

}
