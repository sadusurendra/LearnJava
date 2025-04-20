package corejava.a9.thread.active;

public class DemonDemo extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());

		DemonDemo d = new DemonDemo();
//		d.setDaemon(true);
		System.out.println(d.isDaemon());
		d.start();
		
	}

}
