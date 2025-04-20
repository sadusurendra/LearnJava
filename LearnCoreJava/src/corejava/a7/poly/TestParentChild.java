package corejava.a7.poly;

public class TestParentChild {

	public static void main(String[] args) {
		Parent.printSomething();
		Child.printSomething();

		Child.doSomething();

//		> Methods resolution happens at run time
//		> Variables resolution happens at compile time
//				
		Parent p = new Parent();
		System.out.println(p.s);

		Child c = new Child();
		System.out.println(c.s);

		Parent pc = new Child();
		System.out.println(pc.s);
		pc.methodoverload();

	}

}
