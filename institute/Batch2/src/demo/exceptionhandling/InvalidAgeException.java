package demo.exceptionhandling;

//creating user defined exception
public class InvalidAgeException extends Exception{
	
	
	public InvalidAgeException(String message) {
		
		super(message);
		
	}

}
