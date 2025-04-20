package corejava.aa11.innerClasses;

public class DriverManager {

	static Connection getConnection() {
		Connection con = new Connection() {
			@Override
			public void createStatement() {
				System.out.println("Anonymouse inner classes method");
			}
		};
		return con;
	}

}
