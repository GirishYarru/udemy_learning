package oops.inheritancedemo;

public class Child2 extends Parent2{
	
	public void message() {
		System.out.println(y);
		System.out.println(str);
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.message();
	}
	

}
