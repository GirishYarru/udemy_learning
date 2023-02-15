package demo.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetsDemo {
	public static void main(String[] args) {
		//1) Hashset
		
		Set<String> set = new HashSet<>();
		//all the elements are sored based on hashing technique
		set.add("abc");
		set.add("bhagvat");
		set.add("tharun");
		set.add("tharun");
		set.add(null);
		System.out.println(set);
		
		
		//Linked hash set
		Set<String> linkedSet = new LinkedHashSet<>();
		//all the elements are sored based on hashing technique
		linkedSet.add("abc");
		linkedSet.add("bhagvat");
		linkedSet.add("tharun");
		linkedSet.add("tharun");
		linkedSet.add(null);
		System.out.println(linkedSet);
		
		
		//sorted set
		SortedSet<Integer> sortedSet = new TreeSet<>();
		sortedSet.add(120);
		sortedSet.add(110);
		sortedSet.add(115);
		sortedSet.add(106);
		sortedSet.add(104);
		sortedSet.add(100);
		sortedSet.add(101);
		
		System.out.println(sortedSet);
		
		//methods in sored set
		System.out.println(sortedSet.first());//100 
		System.out.println(sortedSet.last()); //120
		System.out.println(sortedSet.headSet(106));//[100,101,104]
		System.out.println(sortedSet.tailSet(106));//[106,110,115,120]
		System.out.println(sortedSet.subSet(110, 120)); //110,115
		
		//Tree set
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("b");
		treeSet.add("a");
		treeSet.add("c");
		
		System.out.println(treeSet);
		
		Set<Tharun> treeSet1 = new TreeSet<>();
		Tharun  t1 = new Tharun();
		Tharun t2 = new Tharun();
		treeSet1.add(t1);//class cast exception
		treeSet1.add(t2);
		System.out.println(treeSet1);
		
		
		
		
		
		
		
		
		
	}

}
