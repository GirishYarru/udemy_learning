package demo.multithreading.communication;

public class EvenThread extends Thread{
	private PrintEvenOdd evenOdd;
	
	public EvenThread(PrintEvenOdd evenOdd) {
		
		this.evenOdd = evenOdd;
	}
	
	
	@Override
	public void run() {
		try {
			evenOdd.printEvenNumbers();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
