package oops_concepts.abstraction;

public class ATMImpl1 implements InterfaceATM {

	public static int balance = 10000;

	@Override
	public int balanceEnquiry() {
     System.out.println(x);
		return balance;
	}

	@Override
	public int withDraw(int x) {
		balance = balance - x;

		return x;
	}

	@Override
	public String deposit(int y) {
		balance = balance + y;
		return "deposit successfull";
	}
	
	public static void main(String[] args) {
		InterfaceATM obj1 = new ATMImpl1();
		System.out.println(balance);
		obj1.withDraw(500);
		System.out.println(balance);
		obj1.deposit(1000);
		System.out.println(balance);
		
		
	}
	
	

}
