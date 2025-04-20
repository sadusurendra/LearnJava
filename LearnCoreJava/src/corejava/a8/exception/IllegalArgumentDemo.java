package corejava.a8.exception;

public class IllegalArgumentDemo {

	public static int sum(int a, int b) {
		if(a ==0 || b ==0) {
			throw new IllegalArgumentException("a and b should not be zero");
		}
		return a+b;
	}
	
	public static void main(String[] args) {
//		Thread t = new Thread();
//		t.setPriority(11); // it takes only 1 to 10
		
		sum(0, 0);
	}

}
