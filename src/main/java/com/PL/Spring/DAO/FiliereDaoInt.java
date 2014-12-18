package com.PL.Spring.DAO;

import java.util.List;



import com.PL.Spring.Entities.Filiere;


public interface FiliereDaoInt {
	
	void addFiliere(Filiere F);
	void editFiliere(Filiere F);
	void deleteFiliere(Long F_ID);
	Filiere findFiliere(Long F_ID);
	Filiere findFiliereByTitle(String FiName);
	List<Filiere> getAllFilieres();


}
