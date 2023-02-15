package oops.abstraction.abstractdemo;

public class ATMImplementation extends ATM{

	@Override
	public int balance(String accountNumber) {
	
		return 0;
	}
	
	
	public static void main(String[] args) {
		ATM atm = new ATMImplementation();
		atm.deposit(1000);
	}

}
