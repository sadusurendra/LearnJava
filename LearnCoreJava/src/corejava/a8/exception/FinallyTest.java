package corejava.a8.exception;

public class FinallyTest {

	public static void main(String[] args) {

		try {
			int c = 100/0;
			System.out.println("Result ::"+c);
//		} catch (Exception e) {
//			System.out.println("Error");
		} finally {
			System.out.println("Finally");
		}
	}

}
