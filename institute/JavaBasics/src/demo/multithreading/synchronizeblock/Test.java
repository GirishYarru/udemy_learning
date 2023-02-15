package demo.multithreading.synchronizeblock;

public class Test extends Thread{
	
	
	private Display display;
	private String name;
	
	public Test(Display d, String a) {
		this.display = d;
		this.name = a;
	}
	
	@Override
	public void run() {
		
		display.message(name);

	}
	
	public static void main(String[] args) {
		
		Display d1 = new Display();
		Display d2 = new Display();
		Test t1 = new Test(d1, "tharun");
		Test t2 = new Test(d2, "bhagvat");
		t1.start();
		t2.start();
		
		
	}

}
