package com.PL.Spring.DAO;

import java.util.List;


import com.PL.Spring.Entities.Niveau;

public interface NiveauDaoInt {

	void addNiveau(Niveau niveau);
	void editNiveau(Niveau niveau);
	void deleteLNiveau(Long niveauID);
	Niveau  findNiveau(Long niveauID);
	Niveau  findNiveauByName(String nomNiveau);
	List<Niveau> getAllNiveaux();
	
}
