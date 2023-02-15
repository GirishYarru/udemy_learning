package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ABC {
	
	public static void main(String[] args) {
		
//		System.out.println("Kishore");
//		System.out.println("bhagwat");
//		
//		int abc=1001;
//		System.out.println(abc);
//		String abc1 = "bhagwat";
//		System.out.println(abc1);
//		Map<String,Double> map = new HashMap<>();
//		map.put("lenovo", 34450.00);
//		map.put("apple", 92500.00);
//		map.put("toshiba", 53600.00);
//		System.out.println(map);
		
		
		List<Samsung> list = new ArrayList<>();
		Samsung s = new Samsung("a", 1);
		Samsung s1 = new Samsung("b", 2);
		Samsung s2 = new Samsung("b", 6);
		list.add(s);
		list.add(s1);
		list.add(s2);
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(Samsung::getName,Samsung::getAge,(oldValue,newValue)->oldValue));
		System.out.println(map);
		
		
		
		
		
		
				
	}
	

}
