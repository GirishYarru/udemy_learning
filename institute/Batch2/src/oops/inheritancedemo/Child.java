package oops.inheritancedemo;

public class Child extends Parent{
	
	public Child() {
		System.out.println(">>>>> in child const >>>>>>>>");
	}
	
	public void wish() {
		System.out.println("-----in child -  Good morning ------");
	}
	
	@Override
	public void message() {
		
		System.out.println(" ---- In child message() --------");

	}
	
	public static void main(String[] args) {
		//
		Child c = new Child();
		c.message();
		c.wish();
		
		Parent p = new Parent();
		p.message();
		//p.wish();// paent cannot access child methods //error';
		
		
		
		Parent pc = new Child();
		pc.message();
		//pc.wish(); //error
		
		
		//Child ch = new Parent(); //error
		
	}

}
