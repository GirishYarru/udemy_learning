package demo.exceptionhandling;

public class UncheckedException {
	
	public static void main(String[] args) {
		
		
		int i =0;
		int j = 10;
		try {
		System.out.println(j/i);
		
		}catch(ArithmeticException e) {
			System.out.println("----- exception occured ------");
		}
		
		System.out.println("============");
		System.out.println("------------------");
		
	}

}
