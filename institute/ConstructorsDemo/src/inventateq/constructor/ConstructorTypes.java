package inventateq.constructor;

public class ConstructorTypes {
	
	int x;
	int y;
	int z;
	
	//default
	//parameterized
	
	public ConstructorTypes() {
		//no any arguments
		//also known as default const
		this(5,6);
	}
	
	//parameterized const
	public ConstructorTypes(int a,int b) {
		//
		//this(); //atleast one constructor should not have this() function
		this.x = a;
		this.y = b;

	}
	
}
