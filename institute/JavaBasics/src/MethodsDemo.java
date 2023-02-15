
public class MethodsDemo {
	
	public int add(int a,int b) {
		int c = a+b;
		return c;
		
	}
	public int sub(int a,int b) {
		int c = a-b;
		return c;
	}

	public void wish() {
		System.out.println("Good morning");
	}
	
	public static void main(String[] args) {
		MethodsDemo demo = new MethodsDemo();
		int res = demo.add(10, 20);
		System.out.println(res);
		demo.wish();
		
		String str = "1234";
		Integer abc = Integer.valueOf(str);
		System.out.println(abc);
		
		Boolean b = Boolean.valueOf("FlAg");
		System.out.println(b);
		
		Integer n = new Integer(6);
		Boolean b1 = new Boolean(false);
		System.out.println(n);
	}

}
