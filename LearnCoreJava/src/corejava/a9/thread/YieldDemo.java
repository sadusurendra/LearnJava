package corejava.a9.thread;

public class YieldDemo extends Thread {

	public static void main(String[] args) {
		YieldDemo t1 = new YieldDemo();
		t1.setName("Yield 1 ");
		t1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " :: " + i);
		}

	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " :: " + i);
			Thread.yield();
		}
	}

}
