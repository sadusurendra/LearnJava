package corejava.a9.thread;

public class MultiThreaded extends Thread {

	public static void main(String[] args) throws InterruptedException {

		MultiThreaded m = new MultiThreaded();
		m.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("j :: " + i);
			Thread.sleep(1000);
		}
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i :: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Exception in Thread..");
			}
		}
	}

}
