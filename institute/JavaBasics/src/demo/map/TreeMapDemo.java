package demo.map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(10, "a");
		map.put(5, "b");
		map.put(1, "c");
		map.put(3, "d");
		
		System.out.println(map);
		
		MyComparator comp = new MyComparator();
		TreeMap<Integer, String> map1 = new TreeMap<>(comp);
		
		map1.put(10, "a");
		map1.put(5, "b");
		map1.put(1, "c");
		map1.put(3, "d");
		System.out.println(map1);
	}

}
