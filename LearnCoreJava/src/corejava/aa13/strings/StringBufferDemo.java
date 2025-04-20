package corejava.aa13.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer();
		StringBuffer sb = new StringBuffer(0);
		System.out.println("Default initial capacity :: " + sb.capacity());
		
		sb.append("Hello");
		System.out.println("After appending value, capacity :: " + sb.capacity());
		
		sb.append(" World! Welcome to Java Online Course");
		System.out.println("After appending value, capacity :: " + sb.capacity());
		
		sb.insert(5, "! Welocme to this");
		System.out.println(sb);
		
		sb.delete(5, 22);
		System.out.println(sb);
		
		
	}

}
