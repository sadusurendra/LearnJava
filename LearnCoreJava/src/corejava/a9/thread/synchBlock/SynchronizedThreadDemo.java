package corejava.a9.thread.synchBlock;

public class SynchronizedThreadDemo {

	public static void main(String[] args) {
		SynchronizedClass s = new SynchronizedClass();

		MyCustomThread s1 = new MyCustomThread(s, "Thread - 1");
		MyCustomThread s2 = new MyCustomThread(s, "Thread - 2");

		s1.start();
		s2.start();
	}

}
