package com.PL.Spring.DAO;

import java.util.List;
import java.util.Map;

import com.PL.Spring.Entities.Professor;



public interface ProfessorDaoInt {

	void addProfessor(Professor professor);
	void editProfessor(Professor professor);
	void deleteProfessor(Long userId);
	Professor  findProfessor(Long userId);
	Professor findProfessorByName(String username);
	List<Professor> getAllProfessors();
	List<Professor> finProfessorByProps(Map<String, Object> props);
}
