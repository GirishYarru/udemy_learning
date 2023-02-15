package oops.inheritancedemo;

public class Child4 extends Parent4
{
	
	int num = 50;
	public void message() {
		System.out.println(num);
		System.out.println(super.num);
	}
	
	
	public static void main(String[] args) {
		Child4 ch = new Child4();
	    ch.message();
	}

}
