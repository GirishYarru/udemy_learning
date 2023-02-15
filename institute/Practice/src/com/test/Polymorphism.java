package com.test;

public class Polymorphism {
	
//	public static  void overloadString(String s) {
//		System.out.println("in string");
//		
//	}
	
	public static void overloadString(Integer s) {
		System.out.println("in integer");
	}
	
//	public static static void overloadString(int s) {
//		System.out.println("in int");
//	}
	
	public static void overloadString(Character s) {
		System.out.println("in Object");
	}
	
	public static void main(String[] args) {
		overloadString(2);
	}

}
