package oops.abstraction.interfacedemo;

public interface ATM {
	
	//interface will not constructors, so we can't create object for interface
	//all methods in interface are public and abstract by default
	//all variables in interface are public static and final
	
	
	public static final  int x =230;
	
	public abstract void deposit(int amount);
	
	public abstract int balance(String acc);

}
