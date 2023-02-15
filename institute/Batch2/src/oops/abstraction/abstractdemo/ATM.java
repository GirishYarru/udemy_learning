package oops.abstraction.abstractdemo;

public abstract class ATM {
	//abstract method
	public abstract int balance(String accountNumber);
	
	
	//non abstarct method
	public void deposit(int amount) {
		System.out.println("===Implementration code for deposoit method ====");
	}
	

}
