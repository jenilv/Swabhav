package com.techlabs.student.comparator;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getRollNo() > o2.getRollNo()) {
			return 1;
		} else if (o1.getRollNo() < o2.getRollNo()) {
			return -1;
		} else {
			return 0;
		}
	}

}
