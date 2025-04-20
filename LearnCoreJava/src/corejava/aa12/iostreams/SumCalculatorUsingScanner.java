package corejava.aa12.iostreams;

import java.util.Scanner;

public class SumCalculatorUsingScanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter numbers to calculate sum : ");

		while (s.hasNextInt()) {
			int num = s.nextInt();
			sum += num;
		}

		System.out.println("Sum :: " + sum);
	}

}
