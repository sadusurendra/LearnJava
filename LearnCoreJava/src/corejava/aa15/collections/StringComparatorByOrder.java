package corejava.aa15.collections;

import java.util.Comparator;

public class StringComparatorByOrder implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		if (s1.compareTo(s2) < 0) {
			return 1;
		} else if (s1.compareTo(s2) > 0) {
			return -1;
		}

		return 0;
	}

}
