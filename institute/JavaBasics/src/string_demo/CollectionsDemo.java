package string_demo;

import java.util.ArrayList;

public class CollectionsDemo {
	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add(null);
		
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.addAll(list);
		System.out.println(list2);
		
		
		
	}

}
