package corejava.aa12.iostreams;

import java.util.StringTokenizer;

public class StrinTokenizerDemo {

	public static void main(String[] args) {
//		String s = "You are the creator of your destiny";
//		StringTokenizer st = new StringTokenizer(s);

		String s = "You,are,the,creator,of,your,destiny";
//		StringTokenizer st = new StringTokenizer(s, ",");
		StringTokenizer st = new StringTokenizer(s, ",", true);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
