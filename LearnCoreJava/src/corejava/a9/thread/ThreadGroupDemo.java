package corejava.a9.thread;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		System.out.println("========================================");

		ThreadGroup parent = new ThreadGroup("Parent");
		System.out.println(parent.getName());

		ThreadGroup child = new ThreadGroup(parent, "Child");
		System.out.println(child.getName());
		System.out.println(child.getParent().getName());

		System.out.println("========================================");

		System.out.println("Thread Priority for Groups");

		Thread t1 = new Thread(child, "Thread - 1");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t1.getPriority());

		child.setMaxPriority(3);
		Thread t2 = new Thread(child, "Thread - 2");
		System.out.println(t2.getPriority());

	}

}
