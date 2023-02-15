package demo.exceptional.handling;

public class Test {

	public void wish() {
		wish();
	}

	public static void main(String[] args) {
		// exception
//		System.out.println(10/0);
//		System.out.println(" >>>>>>>> execution completed >>>>>>>");

		// error
		Test t = new Test();
		t.wish();

	}

}
