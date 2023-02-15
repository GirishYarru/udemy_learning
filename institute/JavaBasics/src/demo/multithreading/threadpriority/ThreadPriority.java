package demo.multithreading.threadpriority;

public class ThreadPriority {
	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(3);
		System.out.println(Thread.currentThread().getPriority());
		Thread t = new Thread();
		t.setPriority(8);
		System.out.println(t.getPriority());
	}

}
