package string_demo;

public class VariablesDemo {
	int x = 10; // instance variables/object level variables
	static int y = 20; // static variables/class level variables

	public void add() {
		System.out.println("--start funct----");
		int z = 20;// local variables - inside class and inside function
		System.out.println("--------end fun----");
	}

	public static void main(String[] args) {

		System.out.println("----start main-----");
		VariablesDemo var = new VariablesDemo();
		var.add();
		System.out.println("--------end main---");

	}

}
