package demo.multithreading;

public class DefineThreadUsingRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("bhagvath");
		System.out.println("Thread name ==>>> "+ Thread.currentThread().getName());
		for(int i =0;i<50;i++) {
			System.out.println(i+ " In child class");
		}
	}
	
	
	public static void main(String[] args) {
		Thread.currentThread().setName("kishore");
		System.out.println("Thread name ==>>> "+ Thread.currentThread().getName());
		Runnable r = new DefineThreadUsingRunnable();
		Thread t = new Thread(r);
		t.start();
		
		
		for(int i=0;i<50;i++) {
			System.out.println(" In main classs ");
		}
	}
	

}
