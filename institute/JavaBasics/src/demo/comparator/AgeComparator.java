package demo.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Teacher> {

	@Override
	public int compare(Teacher o1, Teacher o2) {
		if (o1.getAge() < o2.getAge()) {
			return -1;
		} else if (o1.getAge() > o2.getAge()) {
			return 1;
		}
		return 0;
	}

}
