package demo.collections;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("kishire");
		s.push("Tharun");
		s.push("bhagvat");
		
		System.out.println(s);
		//peek()
		System.out.println(s.peek());
		//pop()
		System.out.println(s.pop());
		System.out.println(s);
		
	}

}
