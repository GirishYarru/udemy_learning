//package oops_concepts.serialization;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
//public class SerializationDemo implements Serializable{
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	int x =10;
//	public static void main(String[] args) {
//		SerializationDemo v   = new SerializationDemo();
//		//file output stream
//		try {
//			FileOutputStream fos = new FileOutputStream("C:\\codebase\\ser\\abc.ser");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(d);
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("----------file not found----------");
//			e.printStackTrace();
//		}catch (IOException e) {
//			System.out.println("error with object output stream");
//			System.out.println(e);
//		}
//		
//		
//	}
//
//}
