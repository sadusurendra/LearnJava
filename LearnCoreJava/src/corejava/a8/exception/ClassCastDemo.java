package corejava.a8.exception;

public class ClassCastDemo {

	public static void main(String[] args) {
		Object object = new Object();
//		String s = (String) object;
		
		if(object instanceof String) {
			String s = (String) object;
			
		}
	}

}
