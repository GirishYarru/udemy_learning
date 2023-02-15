package demo.map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	public static void main(String[] args) {
		String str = "tharun";
		WeakHashMap<String, Integer> map = new WeakHashMap<>();
		
		map.put(str, 1);
		System.out.println(map);
		str = null;
		
		System.out.println(map);
	}

}
