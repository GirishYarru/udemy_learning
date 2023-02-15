package demo.multithreading.communication;

public class Test {
	
	public static void main(String[] args) {
		PrintEvenOdd commonObj = new PrintEvenOdd();
		
		OddThread t1 = new OddThread(commonObj);
		EvenThread t2 = new EvenThread(commonObj);
		
		t1.start();
		t2.start();
	}

}
