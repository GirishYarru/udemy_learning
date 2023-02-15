package demo.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C://codebase//TEST//abchjsgkdfgikgdfjhvjfsd.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("-----exeception occured ---- file not found ----");

		}

		System.out.println("-------------hello---");
		System.out.println("-------------hello---");
		System.out.println("-------------hello---");
		System.out.println("-------------hello---");
		System.out.println("-------------hello---");

	}

}
