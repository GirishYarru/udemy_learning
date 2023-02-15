package PracticeQues;

public class EmployeeBonus {
	private double salary;
	private float experience;
	public EmployeeBonus(double salary, float experience) {
		super();
		this.salary = salary;
		this.experience = experience;
	}
	//calculate bonus
	private double calculateBonus(double salary,float experience) {
		if(experience >= 5) {
			double bonus = (salary*5)/100;
			//update salary
			this.salary = salary + bonus;
			return bonus;
		}
		return 0.0;
	}
	public static void main(String[] args) {
		EmployeeBonus danusha = new EmployeeBonus(1000000, 5);
		double danushBonus = danusha.calculateBonus(danusha.salary, danusha.experience);
		System.out.println("danush salary before:- "+danusha.salary);
		System.out.println("danush bonus:- "+danushBonus);
		System.out.println("danush salary after:- "+danusha.salary);
		
		System.out.println("-----------------------------------------------------------------");
		
		EmployeeBonus spidy = new EmployeeBonus(8000000, 4);
		double spidyBonus = spidy.calculateBonus(spidy.salary, spidy.experience);
		System.out.println("Spidy salary before:- "+spidy.salary);
		System.out.println("Spidy bonus:- "+spidyBonus);
		System.out.println("Spidy salary after:- "+spidy.salary);
		
		
	}

}
