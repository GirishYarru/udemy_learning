
public class LocalVariablesDemo {
	
	public static void add() {
		
		int a =10;
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		add();
		System.out.println("add() method executio completed");
		
		LocalVariablesDemo refVariable = new LocalVariablesDemo();
		System.out.println(refVariable);
				
		
	}
 
}
