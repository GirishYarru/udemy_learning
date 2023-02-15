
public class ConstructorDemo {
	
	int x = 100;

	
	//constructor
	public ConstructorDemo() {
		x = 20;
		System.out.println("inside constructor");
	}

	public static void main(String[] args) {
	//creating object	
		ConstructorDemo demo = new ConstructorDemo();
		;
		System.out.println(demo.x);
	}

}
