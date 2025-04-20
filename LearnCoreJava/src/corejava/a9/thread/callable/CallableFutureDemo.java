package corejava.a9.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableFutureDemo {

	public static void main(String[] args) {
		MyCallable[] cs = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), new MyCallable(60) };

		ExecutorService service = Executors.newFixedThreadPool(3);

		for (MyCallable c : cs) {
			Future<Integer> f = service.submit(c);

			try {
				System.out.println(f);
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException | CancellationException e) {
				e.printStackTrace();
			}
		}

		service.shutdown();
	}

	public static void main1(String[] args) {

		FutureTask<Integer>[] tasks = new FutureTask[5];

		for (int i = 10, j = 0; i < 60; i += 10, j++) {
			Callable<Integer> c = new MyCallable(i);
			tasks[j] = new FutureTask<Integer>(c);

			Thread t = new Thread(tasks[j]);
			t.start();

		}

		for (FutureTask<Integer> t : tasks) {
			try {
				System.out.println(t.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main0(String[] args) {

		Callable<Integer> c = new MyCallable(100);
		FutureTask<Integer> task = new FutureTask<Integer>(c);

		Thread t = new Thread(task);
		t.start();
		try {
			System.out.println(task.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
