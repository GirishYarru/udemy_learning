
public class ClassDemo {

	int x = 10;

	public static void main(String[] args) {
		
		//ClassName objName = new ClassName();
		ClassDemo b1 = new ClassDemo();
		
		System.out.println(b1.x);
		b1.x = 20;
		System.out.println(b1.x);
		
		ClassDemo b2 = new ClassDemo();
		System.out.println(b2.x);
		

	}

}
