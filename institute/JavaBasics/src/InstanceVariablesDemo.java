
public class InstanceVariablesDemo {
	
	int x = 100;
	
	public void add() 
	{
		
	}

	public void multiply() 
	{
		
	}
	
	
	public static void main(String[] args) {
		InstanceVariablesDemo inst_c1 = new InstanceVariablesDemo();
		InstanceVariablesDemo inst_c2 = new InstanceVariablesDemo();
		System.out.println("-----------before modifying----------");
		System.out.println(inst_c1.x);//100
		System.out.println(inst_c2.x);//100
		
		System.out.println("-----------After modifying----------");

		
		inst_c1.x = 50;
		System.out.println(inst_c1.x);//50
		System.out.println(inst_c2.x);//100

	}

}
