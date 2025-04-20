package corejava.a6.abstraction;

public class CarTest {

	public static void main(String[] args) {
		
		Car h = new Honda();
		
		h.accerleration();

		Honda h1 = new Honda();
		Honda h2 = (Honda) h;
		
		h1.breaks();
		h2.breaks();
		
	}

}
