package corejava.aa15.collections;

import java.util.Comparator;

public class StringComparatorByLength implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 < len2) {
			return -1;
		} else if (len1 > len2) {
			return 1;
		} else {
//			return 0; If we return zero the second string will be removed from TreeSet because of same length.
			// That is the reason we need to compare for order of strings in cas of same
			// length
			return s1.compareTo(s2); // If length both strings same we need compare the order of strings.
		}
	}

}
