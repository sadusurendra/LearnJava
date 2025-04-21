package corejava.aa16.generics;

public class MyCustomGenericwithRestrictions<T extends Employee, U> {

	T obj1;
	U obj2;

	public MyCustomGenericwithRestrictions(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void print() {
		System.out.println("Restricted Type 1 :: " + obj1.getClass().getName() + " :: " + obj1);
		System.out.println("Object Type 2 :: " + obj2.getClass().getName() + " :: " + obj2);
	}
}
