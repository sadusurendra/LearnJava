package corejava.aa12.iostreams;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student id, name, score");
		int id = s.nextInt();
		String name = s.next();
		double score = s.nextDouble();

		System.out.println("Student Details");
		System.out.println("Id :: " + id);
		System.out.println("Name :: " + name);
		System.out.println("Score :: " + score);

	}

}
