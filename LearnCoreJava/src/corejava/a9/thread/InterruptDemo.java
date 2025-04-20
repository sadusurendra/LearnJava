package corejava.a9.thread;

public class InterruptDemo extends Thread {

//	 // It will continue executing the code after catch block
//	@Override
//	public void run() {
//		try {
//			Thread.sleep(1000);
//			System.out.println("Sleeping completed");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Executing after Sleeping");
//	}

	// We are checking for interrupted if interrupted we have different logic else
	// we have another logic

	// Way 1
//	@Override
//	public void run() {
//		for (int i = 1; i <= 2; i++) {
//			if (Thread.interrupted()) {
//				System.out.println(Thread.currentThread().getName() + "code for interrupted thread :: " + i);
//			} else {
//				System.out.println(Thread.currentThread().getName() + "code for normal thread :: " + i);
//			}
//
//		}
//		System.out.println("Execution completed...");
//	}

	// Way 2
//	@Override
//	public void run() {
//		for (int i = 1; i <= 2; i++) {
//			if (Thread.interrupted()) {
//				System.out.println(Thread.currentThread().getName() + "code for interrupted thread :: " + i);
//			} else {
//				System.out.println(Thread.currentThread().getName() + "code for normal thread :: " + i);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//
//		}
//		System.out.println("Execution completed...");
//	}
	
	// We don;t find any difference here

	@Override
	public void run() {
		for (int i = 1; i <= 2; i++) {
			System.out.println(Thread.currentThread().getName() + "code for normal thread :: " + i);
		}
	}

	public static void main(String[] args) {

		InterruptDemo i = new InterruptDemo();
		i.setName("Thread -1 :: ");
		i.start();
		i.interrupt();

		InterruptDemo i2 = new InterruptDemo();
		i2.setName("Thread -2 :: ");
		i2.start();

	}

}
