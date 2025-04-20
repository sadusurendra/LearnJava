package corejava.aa15.collections;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();

		int x = r.nextInt();
		int y = r.nextInt(100);
		float f = r.nextFloat();

		System.out.println(x + " :: " + y + " :: " + f);
	}

}
