package oops_concepts.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable{
	
	int x =10;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//serialization
		Test t = new Test();
		FileOutputStream fos = new FileOutputStream("C:\\codebase\\ser\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.close();
		fos.close();
		
		//de serialization
		FileInputStream fis = new FileInputStream("C:\\codebase\\ser\\abc.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Test t1 = (Test)ois.readObject();
		System.out.println(t1.x);
		fis.close();
		oos.close();
	}
	
}
