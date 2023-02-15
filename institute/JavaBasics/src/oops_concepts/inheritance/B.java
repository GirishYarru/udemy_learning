package oops_concepts.inheritance;

public class B extends A {
	public B() {
		System.out.println("in child class constructor");
	}
	
@Override
public void message() {
	// TODO Auto-generated method stub
	System.out.println("====heyyyy");
}
	
	public void greet() {
		System.out.println("In child class - hello");
	}
	
	
	public static void main(String[] args) {
		B obj1 = new B();//when ever object for child is created then first parent class consrtructor is invoked adn then child class cinstructor is called
		
		obj1.message();
		obj1.wish();
		obj1.greet();
		
		System.out.println("=============2================");
		A obj2 = new A();
		obj2.message();
		//obj2.greet();
		
		System.out.println("=============3================");
		A obj3 = new B();
		obj3.message();
		//obj3.greet();
		
		
	}

}
