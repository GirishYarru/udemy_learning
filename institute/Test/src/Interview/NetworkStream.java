package Interview;

import java.util.*;

public class NetworkStream {
	public static void main(String[] args) {
int n =5;
		int arr[] = {13,25,12,2,8};
		int temp = 1, max = Integer.MIN_VALUE;
		for (int i = 0; i < n - 1; i++) {
			temp = 1;
			while (2 * temp <= arr[i])
				temp = temp * 2;
			max = Math.max(temp, max);
			arr[i + 1] += arr[i] - temp;
		}
		System.out.println(max+" ----------");
		temp = 1;
		while (2 * temp <= arr[n - 1])
			temp = temp * 2;
		max = Math.max(temp, max);
		System.out.println(max);
	}
}