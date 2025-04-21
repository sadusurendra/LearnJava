package corejava.aa15.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		String key1 = new String("10");
		String key2 = new String("10");

		Map<String, String> hmap = new HashMap<String, String>();
		hmap.put(key1, "Jhon 1");
		hmap.put(key2, "Jhon 2");

		System.out.println(hmap);

		for (String key : hmap.keySet()) {
			System.out.println(key + " :: " + hmap.get(key));
		}
		System.out.println("=========================");

		Map<String, String> imap = new IdentityHashMap<String, String>();
		imap.put(key1, "Jhon 1");
		imap.put(key2, "Jhon 2");

		System.out.println(imap);

		for (String key : imap.keySet()) {
			System.out.println(key + " :: " + imap.get(key));
		}
		System.out.println("=========================");

		Set<String> keys = imap.keySet();
		Collection<String> values = imap.values();

		System.out.println(keys);
		System.out.println(values);

		for (String key : keys) {
			System.out.println(key + " :: " + imap.get(key));
		}

	}

}
