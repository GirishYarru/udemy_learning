package demo.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<>();
		map.put(1, "tharun");
		map.put(2, "bhagvat");
		map.put(3, "kishore");
		//map.put(null,"hello");
		//map.put(4, null);
	
		
		System.out.println(map);
		
		
		//hash collision
		//hash map working
	}

}
