package corejava.aa15.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Jhon", 70);
		map.put("Tom", 60);
		map.put("Brad", 90);
		map.put("Lee", 80);

		for (String key : map.keySet()) {
			System.out.println(key + " :: " + map.get(key));
		}

		System.out.println("=========================");

		Set<String> keys = map.keySet();
		Collection<Integer> values = map.values();

		System.out.println(keys);
		System.out.println(values);

		for (String key : keys) {
			System.out.println(key + " :: " + map.get(key));
		}

		System.out.println("=========================");

		Map<String, Integer> lmap = new LinkedHashMap<String, Integer>();
		lmap.put("Jhon", 70);
		lmap.put("Tom", 60);
		lmap.put("Brad", 90);
		lmap.put("Lee", 80);

		for (String key : lmap.keySet()) {
			System.out.println(key + " :: " + lmap.get(key));
		}

	}

}
