package oops_concepts.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	public static void main(String[] args) throws FileNotFoundException {
		

		
		try {
			File f = new File("C:\\codebase\\Csrf_Test\\hello-world\\tsconfig");
			FileInputStream fis = new FileInputStream(f);
		}finally {
			System.out.println("======finally=============");
		}
		
		System.out.println("--------------------");
		
	}
	
	
	

}
