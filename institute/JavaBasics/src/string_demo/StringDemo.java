package string_demo;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "kishore";
		String s2 = "kishore";
		System.out.println(s1 == s2);
		
		String s3 = new String("kishore");
		System.out.println(s1==s3);
		
		String s4 = new String("kishore");
		System.out.println(s3 == s4);
		
		//equals operator
		System.out.println(s3.equals(s4));
		
//String methids
		
		String s5 = "hello";
		s5 = s5.concat("hai");
		System.out.println(s5+ "<<<< concat");
		System.out.println(s5.toUpperCase()+" <<<<uppercase");
		System.out.println(s5.substring(5)+" <<<< substring");
		System.out.println(s5.substring(5,7)+" <<<< substring 2");
		System.out.println(s5.length()+" <<<length");
		System.out.println(s5.indexOf('h')+" <<< first index of h");
		System.out.println(s5.lastIndexOf('h')+" <<< last index of h");

	}

}
