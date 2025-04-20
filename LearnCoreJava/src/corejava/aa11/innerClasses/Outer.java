package corejava.aa11.innerClasses;

public class Outer {

	private static int x = 50;
	private int y;

	public Outer(int y) {
		this.y = y;
	}

	public static void of1() {
		System.out.println("Outer of1");
	}

	public void of2() {
		System.out.println("Outer of2");
	}

	static class StaticInner {
		public static void sif1() {
			System.out.println("Static Inner sif1");
		}

		public void sif2() {
			System.out.println("Static Inner sif2");
		}
	}

	class NonStaticInner {
		private int y;

		public NonStaticInner(int y) {
			this.y = y;
		}

		public void nsif1() {
			System.out.println("Non-Static Inner nsif1");
			System.out.println("outer x" + Outer.x);
			System.out.println("outer y" + Outer.this.y);
			System.out.println("non-static inner y" + this.y);
		}
	}

	public static void main(String[] args) {
		Outer.of1();
		Outer.StaticInner.sif1();

		Outer.StaticInner si = new Outer.StaticInner();
		si.sif2();

		Outer outer = new Outer(100);
		outer.of2();

		// we need to use outer object to create object for non-static inner class
		Outer.NonStaticInner nsi = outer.new NonStaticInner(20);
		nsi.nsif1();
		System.out.println(nsi.y);

	}

}
