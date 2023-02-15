package demo.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teacher {
	private String name;
	private int id;
	private int age;
	
	public Teacher(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		List<Teacher> list = new ArrayList<>();
		Teacher tharun = new Teacher("tharun", 3, 22);
		Teacher bhagvat = new Teacher("bhagvat", 2, 23);
		Teacher kishore = new Teacher("kishore", 1, 21);
		list.add(tharun);
		list.add(bhagvat);
		list.add(kishore);
		
		System.out.println(list);
		IdComparator idComp = new IdComparator();
		Collections.sort(list,idComp);
		System.out.println(list);
		
		AgeComparator ageComp = new AgeComparator();
		Collections.sort(list,ageComp);
		System.out.println(list);
		
		
		
		
		
	}
	
	

}
