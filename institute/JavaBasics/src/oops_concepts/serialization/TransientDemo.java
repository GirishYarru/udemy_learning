package oops_concepts.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientDemo implements Serializable{
	int x =10;
	transient int y = 20;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TransientDemo demo = new TransientDemo();
		FileOutputStream fos = new FileOutputStream("C:\\codebase\\ser\\abc2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(demo);
		fos.close();
		oos.close();
		
		
		//deserialization
		FileInputStream fis = new FileInputStream("C:\\codebase\\ser\\abc2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		TransientDemo ch1 = (TransientDemo) ois.readObject();
		System.out.println(ch1.x);
		System.out.println(ch1.y);
		ois.close();
		fis.close();
		
	}

}
