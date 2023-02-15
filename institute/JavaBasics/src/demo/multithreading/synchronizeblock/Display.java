package demo.multithreading.synchronizeblock;

public class Display {

	public static synchronized void message(String name) {
	
		for(int i =0;i<20;i++) {
			System.out.println("name is " + name);
		}
	}

}
