package demo.collections;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<>();
		vec.addElement("kishore");
		vec.addElement("Tharun");
		vec.addElement("bhagvat");
		System.out.println(vec);
		
		vec.remove("bhagvat");
		System.out.println(vec);
		
		
		
		
		
	}

}
