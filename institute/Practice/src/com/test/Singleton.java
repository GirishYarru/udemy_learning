package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Singleton {
	public static int[] funcDistance(int[] inputDist, int start, int end) {
		List<Integer> result = new ArrayList<>();

		int j = 0;
		for (int i = 0; i < inputDist.length; i++) {
			if (inputDist[i] >= start && inputDist[i] <= end) {
				result.add(inputDist[i]);
			}
		}
		if (result.size() == 0) {
			int[] answer = new int[1];
			answer[0] = -1;
		} else {
			int[] answer = new int[result.size()];
			for (Integer e : result) {
				answer[j++] = e;
			}
			return answer;
		}
		return new int[] { -1 };

	}
	static class Employee{
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		
		public Employee(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}

	public static void main(String[] args) {
//		int[] inputDist = { 29, 38, 12, 48, 39, 55 };
//		int[] res = funcDistance(inputDist, 30, 50);
//		System.out.println(Arrays.toString(res));
//		Map<String, List<String>> map = new HashMap<>();
//		map.computeIfAbsent("mapped", k->new ArrayList<>()).add("a");
//		map.computeIfAbsent("mapped", k->new ArrayList<>()).add("b");
//		System.out.println(map);
		Employee emp = new Employee(1,"a");
		Employee emp2 = new Employee(1,"a");
		
		
		Map<Employee,String> map = new HashMap<>();
		map.put(emp, "before");
		System.out.println(map.get(emp)+" >>> before >>>>");
		emp.setName("hello");
		emp.setId(2);
		System.out.println(map.get(emp)+" <<<< after >>>>");
		
		Vector<Integer> list = new Vector<>();  
		  
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
        list.add(5);  
  
        Iterator<Integer> it = list.iterator();  
        while (it.hasNext()) {                   
Integer value = it.next();              
            System.out.println("List Value:" + value);  
            //if (value.equals(3))  
              //  list.remove(value);  
        } 
        
        
        final String str = "hello";
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(str.equals(s1));
        System.out.println(s1==s2);
       // String s3 = new String(null);
        //System.out.println(s3);
		

	}

}
