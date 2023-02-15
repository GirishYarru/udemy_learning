package oops_concepts.encapsulation;

public class EncapsulationExample {
	private int majorAge;

	public int getMajorAge() {
		return majorAge;
	}

	public void setMajorAge(int majorAge) {
		if(majorAge>18) {
			this.majorAge = majorAge;
		}else {
			System.out.println("not a valid age");
		}
		
	}
	
	


}
