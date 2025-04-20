package corejava.aa13.strings;

public class ImmutableClassDemo {
	int x;

	public ImmutableClassDemo(int x) {
		this.x = x;
	}

	public ImmutableClassDemo change(int x) {
		if (this.x == x) {
			return this;
		} else {
			return new ImmutableClassDemo(x);
		}
	}

	public static void main(String[] args) {

		ImmutableClassDemo m1 = new ImmutableClassDemo(10);
		ImmutableClassDemo m2 = m1.change(10);
		System.out.println(m1 == m2);

		ImmutableClassDemo m3 = m1.change(20);
		System.out.println(m1 == m3);

	}

}
