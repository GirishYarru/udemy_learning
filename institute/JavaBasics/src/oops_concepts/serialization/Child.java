package oops_concepts.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Child extends Parent {
	
	int j = 20;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//serialization
		Child ch = new Child();
		FileOutputStream fos = new FileOutputStream("C:\\codebase\\ser\\abc1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ch);
		fos.close();
		oos.close();
		
		//deserialization
		FileInputStream fis = new FileInputStream("C:\\codebase\\ser\\abc1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Child ch1 = (Child) ois.readObject();
		System.out.println(ch1.j);
		System.out.println(ch1.x);
		ois.close();
		fis.close();
		
		
		
		
	}

}
