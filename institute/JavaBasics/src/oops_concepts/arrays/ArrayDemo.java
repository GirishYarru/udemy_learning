package oops_concepts.arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		// single dimension
		int[] arr = new int[2];
		// or int arr[] = new int[2]

		// 1.inserting values into arrary
		arr[0] = 10;
		arr[1] = 20;

		// 2.Accessing values from array
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		System.out.println("======================");

		// 3.iterating array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 2d array

		int[][] arr1 = new int[2][2];
		arr1[0][0] = 1;

		// inserting values to 2d array
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {
				arr1[i][j] = 1;
			}

		}
		System.out.println("-------------print 2d array------------");
		
		//print 2d array
		for(int i =0;i<2;i++) {
			for(int j =0;j<2;j++) {
				System.out.print(arr1[i][j] +" ");
			}
			System.out.println();
		}
		

	}

}
