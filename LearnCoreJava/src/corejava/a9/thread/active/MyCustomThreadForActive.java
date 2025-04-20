package corejava.a9.thread.active;

public class MyCustomThreadForActive extends Thread {

	public MyCustomThreadForActive(ThreadGroup tg, String name) {
		super(tg, name);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
