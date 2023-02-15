
public class Calc {
	int x = 10;
	String a = "shiva";

	public int add(int b, int c) {
		return b + c;
	}
	
	public static void main(String[] args) {
		Calc obj1 =  new Calc();
		System.out.println(obj1.a);
		System.out.println(obj1.x);
		System.out.println("=============================");
		Calc obj2 = new Calc();
		System.out.println(obj2.a);
		System.out.println(obj2.x);
		obj2.x = 20;
		System.out.println("After modifying x value in obj2");
		System.out.println(obj2.x);
	}

}
