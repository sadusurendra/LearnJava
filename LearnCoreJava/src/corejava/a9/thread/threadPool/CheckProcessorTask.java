package corejava.a9.thread.threadPool;

public class CheckProcessorTask implements Runnable {

	String name;

	public CheckProcessorTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " check process has began " + Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " check process has Ended " + Thread.currentThread().getName());
	}

}
