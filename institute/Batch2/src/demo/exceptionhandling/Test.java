package demo.exceptionhandling;

public class Test {
	
	Test(){
		
	}
	
	
	public static void main(String[] args) throws InvalidAgeException {
		
		
		int age =20;
		if(age <18) {
			throw new InvalidAgeException("age is less than 18");
		}
		
	}

}
