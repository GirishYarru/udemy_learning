package PracticeQues;

import java.util.Arrays;
import java.util.Scanner;

public class TestTcs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}

		int temp = sum;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (temp >= arr[i]) {
				count++;
				temp = temp - arr[i];
			} else {
				break;
			}

		}
		System.out.println(count);
	}

}
