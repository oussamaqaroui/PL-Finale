package com.PL.Spring.DAO;

import java.util.List;

import com.PL.Spring.Entities.Professor;



public interface ProfessorDaoInt {

	void addProfessor(Professor professor);
	void editProfessor(Professor professor);
	void deleteProfessor(Long userId);
	Professor  findProfessor(Long userId);
	Professor findProfessorByName(String username);
	List<Professor> getAllProfessors();
}
