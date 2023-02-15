package oops.abstraction.interfacedemo;

public class ATMImplementation implements ATM{

	@Override
	public void deposit(int amount) {
		System.out.println("---------in first impl-----");
		//code
	}

	@Override
	public int balance(String acc) {
		//code
		System.out.println("---------in first impl-----");
		return 0;
	}

}
