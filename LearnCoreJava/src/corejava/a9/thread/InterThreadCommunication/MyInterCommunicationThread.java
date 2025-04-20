package corejava.a9.thread.InterThreadCommunication;

public class MyInterCommunicationThread extends Thread {

	int totalSum;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				totalSum += i;
			}
			this.notify();
		}
	}
}
