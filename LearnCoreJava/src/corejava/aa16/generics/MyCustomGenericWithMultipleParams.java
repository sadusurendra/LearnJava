package corejava.aa16.generics;

public class MyCustomGenericWithMultipleParams<T, U> {

	T obj1;
	U obj2;

	public MyCustomGenericWithMultipleParams(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void print() {
		System.out.println("Object Type 1 :: " + obj1.getClass().getName() + " :: " + obj1);
		System.out.println("Object Type 2 :: " + obj2.getClass().getName() + " :: " + obj2);
	}

}
