package corejava.aa16.generics;

public class MyCustomGeneric<T> {

	T obj;

	public MyCustomGeneric(T obj) {
		this.obj = obj;
	}

	public T getObject() {
		System.out.println("Object Type :: " + obj.getClass().getName());
		return this.obj;
	}

}
