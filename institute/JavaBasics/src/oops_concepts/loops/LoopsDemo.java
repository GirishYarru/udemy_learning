package oops_concepts.loops;

public class LoopsDemo {
	// for loop -> simple for loop and enhanced for loop
	// while
	// do while

	public static void main(String[] args) {
		// simple for loop
		// for(initialization;condition;increment/decrement){}
		// print numbers from 1 to 10
		for (int x = 1; x <= 10; x++) {

			System.out.println(x);

		}

		// for each loop/enhanced for loop - introduced java 1.5
		// only used for arrays and collections
		// for(dataType var : array){}
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int x : arr) {
			System.out.println(x);
		}

		// while loop
		// while(condition){}
		// print numbers from 1 to 10
		int x = 1;
		while (x <= 10) {
			System.out.println(x);
			x++;
		}

		// do while loop
		// do{
		// }while(condition);
		// print numbers from 1 to 10
		int j = 1;

		do {
			System.out.println(j);
			j++;

		} while (j <= 10);

	}

}
