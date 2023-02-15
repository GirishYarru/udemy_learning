package demo.map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
		map.put("bhagvat", 1);
		map.put(new String("bhagvat"), 2);
		
		System.out.println(map);
	}

}
