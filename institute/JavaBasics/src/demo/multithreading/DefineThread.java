package demo.multithreading;

public class DefineThread extends Thread {
	// a thread can be defined in 2 ways
	// By extending thread class
	// By implementing runnable interface

	// we will see extending thread class

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("******in child class******");
		}

	}
	
	
	public int test() {
		return 10;
	}

	public static void main(String[] args) {
		DefineThread t = new DefineThread();
		t.start();
		// t.run();//you should not call run method directly

		for (int i = 0; i < 30; i++) {
			System.out.println(" -----in main method -------");
		}
		
		
		//int result = t.test();
	}

}
