package com.PL.Spring.DAO;


import java.util.List;

import com.PL.Spring.Entities.Student;

public interface StudentDaoInt {

	void addStudent(Student student);
	void editStudent(Student student);
	void deleteStudent(Long userId);
	Student findStudent(Long userId);
	Student findStudentByName(String username);
	List<Student> getAllStudents();
}
