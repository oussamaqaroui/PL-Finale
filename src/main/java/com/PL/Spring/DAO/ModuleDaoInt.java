package com.PL.Spring.DAO;

import java.util.List;

import com.PL.Spring.Entities.Module;

public interface ModuleDaoInt {

	void addModule(Module module);
	void editModule(Module module);
	void deleteLModule(Long moduleID);
	Module findModule(Long moduleID);
	Module findModuleByTitle(String nomModule);
	List<Module> getAllModules();
	
}
