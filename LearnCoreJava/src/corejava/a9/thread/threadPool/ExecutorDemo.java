package corejava.a9.thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		CheckProcessorTask[] cps = { new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web") };

		ExecutorService service = Executors.newFixedThreadPool(2);

		for (CheckProcessorTask c : cps) {
			service.submit(c);
		}

		service.shutdown();
	}

}
