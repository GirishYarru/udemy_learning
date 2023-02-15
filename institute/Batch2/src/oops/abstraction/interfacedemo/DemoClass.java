package oops.abstraction.interfacedemo;

public class DemoClass {
	
	public static void main(String[] args) {
		ATM objName = new ATMImplementation();
	   objName.deposit(200);
	   
	   
	   ATM obj2 = new ATMImpl2();
	   obj2.deposit(300);
	}

}
