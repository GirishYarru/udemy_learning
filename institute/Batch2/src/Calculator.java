
public class Calculator {
	
	//instance variables/Object level variables
	int price = 100;
	int model = 2022;
	
	public void addTwoNumbers() {
		
	}
	
	public void subtractTwoNumbers() {
		
	}
	
	
	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		System.out.println("==========initial values for obj1=============");
		System.out.println(calc1.model); 
		System.out.println(calc1.price);
		
		
		Calculator calc2 = new Calculator();
		System.out.println("==========initial values for obj2=============");
		System.out.println(calc2.model);
		System.out.println(calc2.price);
		
		calc1.price = 200;
		System.out.println("==========after updating values for obj1=============");
		System.out.println(calc1.model);
		System.out.println(calc1.price);
		
		
	}
	


}
