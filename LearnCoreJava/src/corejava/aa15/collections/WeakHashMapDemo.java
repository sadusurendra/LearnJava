package corejava.aa15.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		User u = new User();
		System.out.println("User:: " + u);

//		Map<User, String> map = new HashMap<User, String>();
		Map<User, String> map = new WeakHashMap<User, String>();
		map.put(u, "Tom");

		System.out.println("map:: " + map);

		u = null;

		System.gc();
		Thread.sleep(5000);

		System.out.println("map After:: " + map);

	}

}
