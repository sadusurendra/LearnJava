package corejava.a9.thread.active;

public class ThreadGroupMethods {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup mtg = new ThreadGroup("MyThreadGroup");

		MyCustomThreadForActive t1 = new MyCustomThreadForActive(mtg, "Thread - 1");
		MyCustomThreadForActive t2 = new MyCustomThreadForActive(mtg, "Thread - 2");
		MyCustomThreadForActive t3 = new MyCustomThreadForActive(mtg, "Thread - 3");

		t1.start();
		t2.start();
		t3.start();

		System.out.println(mtg.activeCount());
		mtg.list();

		Thread.sleep(5000);

		System.out.println(mtg.activeCount());
		mtg.list();
	}

}
