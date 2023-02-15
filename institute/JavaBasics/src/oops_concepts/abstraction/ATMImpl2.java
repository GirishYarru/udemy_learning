package oops_concepts.abstraction;

public class ATMImpl2 implements InterfaceATM{
	public static int balance = 10000;

	@Override
	public int balanceEnquiry() {
		System.out.println("balance enquiry initiated");
		System.out.println("balance enquiry initiatedis "+balance);
		return balance;
	}

	@Override
	public int withDraw(int x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String deposit(int y) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	public static void main(String[] args) {
		ATMImpl2 obj = new ATMImpl2();
	}

}
