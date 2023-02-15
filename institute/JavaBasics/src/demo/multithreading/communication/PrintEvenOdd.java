package demo.multithreading.communication;
//common class used by 2 threads
public class PrintEvenOdd {

	private static int n = 1;

	public void printEvenNumbers() throws InterruptedException {

		synchronized (this) {
			while (n <= 10) {
				if (n % 2 == 0) {
					System.out.println(" even Number: " + n);
					this.notify();
					n++;

				} else {
					this.wait();
				}
			}
		}
	}

	public void printOddNumbers() throws InterruptedException {
		synchronized (this) {

			while (n <= 10) {
				if (n % 2 != 0) {
					System.out.println("Odd number " + n);
					this.notify();
					n++;
				} else {
					this.wait();
				}
			}

		}
	}
	
	
	

}
