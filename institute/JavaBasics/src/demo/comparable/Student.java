package demo.comparable;

import java.util.TreeSet;

public class Student implements Comparable<Student>{
	
	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "bhagvat");
		Student s2 = new Student(3, "tharun");
		Student s3 = new Student(5,"kishore");
		
		TreeSet<Student> set = new TreeSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set);
		
		
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.rollNo<o.rollNo) {
			return 1;
		}else if(this.rollNo> o.rollNo) {
			return -1;
		}else {
			return 0;	
		}
		
	}
	

}
