package com.test;

public class ExceptionTest {
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		int a = 511709;
		int sum =0;
		while(a!=0) {
			int x = a%10;
			sum +=x;
			a=a/100;
		}
		System.out.println(sum);
	}

	public static int exceptionTest() {
		int i = 6;
		try {
			throw new NullPointerException();
		} catch (Exception e) {
			i = 10;
			System.out.println("-------" + i);
			return i;
		} finally {
			i = 20;
			System.out.println("In finally block  " + i);
		}

	}
}