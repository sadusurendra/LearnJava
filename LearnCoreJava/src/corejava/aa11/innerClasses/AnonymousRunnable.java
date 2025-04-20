package corejava.aa11.innerClasses;

public class AnonymousRunnable {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous Runnable Thread");
			}
		});

		t.start();
	}

}
