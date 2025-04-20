package corejava.aa14.objectClassMethods;

public class TestObject_toString {

	public static void main(String[] args) {
		Passenger p = new Passenger();
		p.setTicketId(100);
		p.setName("Surendra");
		p.setAge(30);

		System.out.println(p);
		System.out.println(p.hashCode());

		Passenger p2 = new Passenger();
		p2.setTicketId(100);
		p2.setName("Surendra");
		p2.setAge(30);

		System.out.println(p.equals(p2));

	}

}
