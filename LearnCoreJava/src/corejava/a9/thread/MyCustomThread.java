package corejava.a9.thread;

public class MyCustomThread extends Thread {

	SynchronizedClass s;
	String threadName;

	public MyCustomThread(SynchronizedClass s, String threadName) {
		this.s = s;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		s.printNumbers(threadName);
	}

}
