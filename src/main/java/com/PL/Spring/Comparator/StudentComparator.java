package com.PL.Spring.Comparator;

import java.util.Comparator;
import com.PL.Spring.Entities.Student;
public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getUser_id().compareTo(s2.getUser_id());
	}

}
