package corejava.a9.thread.synchBlock;

public class SynchronizedClass {
	public void printNumbers(String threadName) {

		System.out.println(threadName + " :: Reached to start...........");

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(threadName + " :: " + i);
			}
		}

		System.out.println(threadName + " :: Reached to End...........");

	}
}
