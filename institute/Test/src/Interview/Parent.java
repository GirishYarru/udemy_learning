package Interview;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
	public Parent() {
		// TODO Auto-generated constructor stub
	}

	
	public void methodm1() throws IOException{
		System.out.println("----in parent ---");
	}
	
	public static void main(String[] args) {
		boolean var1 = false;
		boolean var2 = true;
		boolean var3 = true;
		System.out.println(var1&&var3||var2);
	}

}
