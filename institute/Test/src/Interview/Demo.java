package Interview;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
	public static int test() {
		int i = 10;
		try {
			throw new NullPointerException();
		}catch (Exception e) {
			i = 20;
			return i;
		}finally{
			i = 30;
			//return i;
		}
		
	}

	public static void main(String[] args) throws IOException {
		Parent p = new Child();
		p.methodm1();
int i = test();
System.out.println(i);

		

	}

}
