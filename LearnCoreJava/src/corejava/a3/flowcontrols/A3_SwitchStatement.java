package corejava.a3.flowcontrols;

public class A3_SwitchStatement {

	public static void main(String[] args) {
		int a = 20;
		final int b = 20;
		switch (a) {
		case 10:
			System.out.println(a);
			break;
		case b:
			System.out.println(a);
			break;
		case 30:
			System.out.println(a);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + a);
		}
	}

}
