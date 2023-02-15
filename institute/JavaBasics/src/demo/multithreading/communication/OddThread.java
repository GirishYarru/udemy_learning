package demo.multithreading.communication;

public class OddThread extends Thread{
	
	private PrintEvenOdd evenOdd;
	
	public OddThread(PrintEvenOdd evenOdd) {
		this.evenOdd = evenOdd;
	}
	
	
	@Override
	public void run() {
		
		
		try {
			evenOdd.printOddNumbers();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
