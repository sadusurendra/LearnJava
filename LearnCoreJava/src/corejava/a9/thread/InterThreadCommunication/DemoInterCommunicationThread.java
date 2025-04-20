package corejava.a9.thread.InterThreadCommunication;

public class DemoInterCommunicationThread {

	public static void main(String[] args) throws InterruptedException {
		MyInterCommunicationThread t = new MyInterCommunicationThread();
		t.start();

		synchronized (t) {
			System.out.println("Main Thread is waiting for Inter communication thread");
			t.wait();
			System.out.println("Main Thread is notified");
			
			System.out.println("Total Sum is " + t.totalSum);
		}

	}

}
