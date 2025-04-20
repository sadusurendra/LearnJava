package corejava.aa11.innerClasses;

public class LocalInnerDemo {

	void f1() {
		System.out.println("Inside Outer f1()");
		class LocalInner {
			void f2() {
				System.out.println("Inside Local Inner f2()");
			}
		}
		LocalInner l = new LocalInner();
		l.f2();
	}

	public static void main(String[] args) {
		LocalInnerDemo outer = new LocalInnerDemo();
		outer.f1();
	}

}
