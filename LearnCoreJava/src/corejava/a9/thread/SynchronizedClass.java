package corejava.a9.thread;

public class SynchronizedClass {
	public synchronized void printNumbers(String threadName) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(threadName + " :: " + i);
		}
	}
}
