package oops.abstraction.interfacedemo;

public class ATMImpl2 implements ATM{

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		System.out.println("======in second impl======");
	}

	@Override
	public int balance(String acc) {
		// TODO Auto-generated method stub
		System.out.println("-------in second impl----------");
		return 0;
	}

}
