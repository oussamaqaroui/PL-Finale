package com.PL.Spring.DAO;

import java.util.List;
import java.util.Map;

import com.PL.Spring.Entities.Departement;
import com.PL.Spring.Entities.Professor;

public interface DepartementDaoInt {
	
	void addDepartement(Departement departement);
	void editDepartement(Departement departement);
	void deleteDepartement(Long Dep_Id);
	Departement  findDepartement(Long Dep_Id);
	Departement findDepByTitle(String DepTitle);
	List<Departement> getAllDepartements();
	

	List<Departement> getDepsByProps(Map<String,Object> props);
}
