package Interview;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent{
	@Override
	public void methodm1() throws FileNotFoundException{
		System.out.println("====in child ====");

	}
	
	public void method2() {
		System.out.println("-----in method 2--");
	}

}
