package com.PL.Spring.Metier;

import java.util.List;
import java.util.Map;

import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Departement;
import com.PL.Spring.Entities.FI_M_D;
import com.PL.Spring.Entities.LC_D;
import com.PL.Spring.Entities.Module;
import com.PL.Spring.Entities.Professor;
import com.PL.Spring.Entities.Student;
import com.PL.Spring.Entities.User;

public interface UserServiceInt {
	
	void addUser(User user);
	void editUser(User user);
	void deleteUser(Long userId);
	User findUser(Long userId);
	User findUserByName(String username);
	List<User> getAllUsers();
	
	void addAdmin(Admin admin);
	void editAdmin(Admin admin);
	void deleteAdmin(Long userId);
	Admin findAdmin(Long userId);
	Admin findAdminByName(String username);
	List<Admin> getAllAdmins();
	List<Admin> finAdminByProps(Map<String,Object> props);
	
	void addProfessor(Professor professor);
	void editProfessor(Professor professor);
	void deleteProfessor(Long userId);
	Professor  findProfessor(Long userId);
	Professor findProfessorByName(String username);
	List<Professor> getAllProfessors();
	
	void addStudent(Student student);
	void editStudent(Student student);
	void deleteStudent(Long userId);
	Student findStudent(Long userId);
	Student findStudentByName(String username);
	List<Student> getAllStudents();
	
	
	void addDepartement(Departement departement);
	void editDepartement(Departement departement);
	void deleteDepartement(Long Dep_Id);
	Departement  findDepartement(Long Dep_Id);
	Departement findDepByTitle(String DepTitle);
	List<Departement> getAllDepartements();
	
	
	void addFI_M_D(FI_M_D F);
	void editFI_M_D(FI_M_D F);
	void deleteFI_M_D(Long F_ID);
	FI_M_D  findFI_M_D(Long F_ID);
	FI_M_D findFI_M_D_ByTitle(String FiName);
	List<FI_M_D> getAllFI_D_M();
	
	
	
	void addLC_D(LC_D L);
	void editLC_D(LC_D F);
	void deleteLC_D(Long F_ID);
	LC_D  findLC_D(Long F_ID);
	LC_D findLC_DByTitle(String FiName);
	List<LC_D> getAllLC_D();
	
	void addModule(Module module);
	void editModule(Module module);
	void deleteLModule(Long moduleID);
	Module findModule(Long moduleID);
	Module findModuleByTitle(String nomModule);
	List<Module> getAllModules();
	

}
