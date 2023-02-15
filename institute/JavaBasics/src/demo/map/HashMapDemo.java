package demo.map;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		//Hash Map constructors
		HashMap<Integer,String> map1 = new HashMap<>(); //capcity - 16, loadfactor - 0.75
		HashMap<Integer, String> map2 = new HashMap<>(20); //capacity-20
		HashMap<Integer, String> map3 = new HashMap<>(20,0.5f);
		HashMap<Integer, String> map4 = new HashMap<>(map3);
		
		
		//map operatrions
		map1.put(1,"bhagvat");
		map1.put(2, "tharun");
		
		System.out.println(map1);
		String str = map1.get(2);
		System.out.println(str);
		
		String str2 = map1.get(12);
		System.out.println(str2);
		
		map1.put(2, "tharun kumar");
		System.out.println(map1);
		
		map1.putIfAbsent(2, "THARUN K");
		System.out.println(map1);
		
		
		HashMap<String, String> map = new HashMap<>();
		map.put("abc", "tharun");
		map.put(new String("abc"), "bhagvat");
		
		System.out.println(map);
		
		
		
		
		
	}

}
