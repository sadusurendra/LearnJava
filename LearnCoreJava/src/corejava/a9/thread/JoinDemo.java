package corejava.a9.thread;

import java.util.Scanner;

public class JoinDemo extends Thread {

	static int number, sum = 0;

	public static void main(String[] args) {
		System.out.println("Enter a number for calculating sum: ");
		Scanner s = new Scanner(System.in);
		JoinDemo.number = s.nextInt();

		JoinDemo j = new JoinDemo();
		j.start();
		try {
			j.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("sum of first " + JoinDemo.number + " numbers is " + JoinDemo.sum);
		
		
		JoinDemo j1 = new JoinDemo();
		j1.start();
		try {
			j1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("sum of Second " + JoinDemo.number + " numbers is " + JoinDemo.sum);
	}

	@Override
	public void run() {
		for (int i = 1; i <= JoinDemo.number; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(100); // added this line just to make sure .join() is waiting for result
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
