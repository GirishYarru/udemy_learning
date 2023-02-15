package oops.inheritancedemo;

public class Child3 extends Parent3 {

	public Child3() {
		//always super call should be at the first line
		super("hai");
		System.out.println(" === in child 3 default const ======");
		
	}

	public static void main(String[] args) {
		Child3 c3 = new Child3();

	}
}
