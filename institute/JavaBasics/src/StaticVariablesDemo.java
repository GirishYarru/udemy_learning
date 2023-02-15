
public class StaticVariablesDemo {
	static int y = 100;
	
	void add() {}
	void sub() {}
	
	public static void main(String[] args) {
		//using class name
		System.out.println(StaticVariablesDemo.y);
		
		//access using obj name
		StaticVariablesDemo stat_c1 = new StaticVariablesDemo();
		StaticVariablesDemo stat_c2 = new StaticVariablesDemo();
		System.out.println("-------------before modifying---------");
		System.out.println(stat_c1.y);//100
		System.out.println(stat_c2.y);//100
		
		System.out.println("-------------After modifying---------");
		stat_c1.y = 50;
		System.out.println(stat_c1.y);//50
		System.out.println(stat_c2.y);//50
	
		
	}

}
