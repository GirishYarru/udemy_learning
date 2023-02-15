package oops_concepts.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ArrayListSerialization implements Serializable {
	int x = 10;
	ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayListSerialization obj = new ArrayListSerialization();
		System.out.println("-----------before-----------");
		System.out.println(obj.x);
		System.out.println(obj.list);
		obj.list.add(100);
		obj.list.add(20);
		System.out.println("-----------after-----------");
		System.out.println(obj.x);
		System.out.println(obj.list);
		
		System.out.println("-----------Serialization-----------");

		FileOutputStream fos = new FileOutputStream("C:\\codebase\\ser\\abc2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();
		oos.close();
		System.out.println("----------- de Serialization-----------");
		// deserialization
		FileInputStream fis = new FileInputStream("C:\\codebase\\ser\\abc2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayListSerialization ch1 = (ArrayListSerialization) ois.readObject();
		System.out.println(ch1.x);
		System.out.println(ch1.list);
		ois.close();
		fis.close();

	}

}
