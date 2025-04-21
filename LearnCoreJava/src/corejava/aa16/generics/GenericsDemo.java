package corejava.aa16.generics;

public class GenericsDemo {

	public static void main(String[] args) {

		/* Generic class......................... */

		MyCustomGeneric<Integer> ig = new MyCustomGeneric<Integer>(100);
		System.out.println(ig.getObject());

		MyCustomGeneric<String> sg = new MyCustomGeneric<String>("Jhon");
		System.out.println(sg.getObject());

		/* Generic class with multiple type parameters */
		MyCustomGenericWithMultipleParams<String, Integer> mg = new MyCustomGenericWithMultipleParams<String, Integer>(
				"Jhon", 100);
		mg.print();

		/* Generic class with Object type Restriction */
//		MyCustomGenericwithRestrictions<String, Integer> mo = new MyCustomGenericwithRestrictions<String, Integer>(
//				"Jhon", 100);
		/*
		 * The above initialization is throwing compilation error because we used String
		 * in generics. Below we changed it to Employee it worked
		 */

		MyCustomGenericwithRestrictions<Employee, Integer> mo = new MyCustomGenericwithRestrictions<Employee, Integer>(
				new Employee(1, "Jhon"), 100);
		mo.print();

		/* Generic method......................... */

	}

}
