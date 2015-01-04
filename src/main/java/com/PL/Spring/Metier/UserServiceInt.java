package com.PL.Spring.Metier;

import java.util.List;
import java.util.Map;

import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Departement;
import com.PL.Spring.Entities.Document;
import com.PL.Spring.Entities.Filiere;
import com.PL.Spring.Entities.Module;
import com.PL.Spring.Entities.Niveau;
import com.PL.Spring.Entities.Note;
import com.PL.Spring.Entities.Phase;
import com.PL.Spring.Entities.Professor;
import com.PL.Spring.Entities.Student;
import com.PL.Spring.Entities.TypeNote;
import com.PL.Spring.Entities.User;

public interface UserServiceInt {
	
	void addNote(Note note);
	void editNote(Note note);
	void deleteLNote(Long noteID);
	Note  findNote(Long noteID);
	
	
	void addTypeNote(TypeNote type);
	void editTypeNote(TypeNote type);
	void deleteTypeNote(Long typeId);
	TypeNote findTypeNote(Long typeId);
	List<TypeNote> getAllTypeNote();
	List<TypeNote> getTypeNoteByModule(Module m);
	
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
	public List<Professor> finProfessorByProps(Map<String, Object> props);
	
	void addStudent(Student student);
	void editStudent(Student student);
	void deleteStudent(Long userId);
	Student findStudent(Long userId);
	Student findStudentByName(String username);
	List<Student> getAllStudents();
	List<Student> findStudentByProps(Map<String,Object> props);
	
	
	
	
	void addPhase(Phase phase);
	void editPhase(Phase phase);
	void deletePhase(Long phaseID);
	Phase  findPhase(Long phaseID);
	Phase  findPhaseByName(String nomPhase);
	List<Phase> getAllPhase();
	
	
	
	
	void addNiveau(Niveau niveau);
	void editNiveau(Niveau niveau);
	void deleteLNiveau(Long niveauID);
	Niveau  findNiveau(Long niveauID);
	Niveau  findNiveauByName(String nomNiveau);
	List<Niveau> getAllNiveaux();
	List<Niveau> findNiveauxByProps(Map<String,Object> props);
	
	

	void addModule(Module module);
	void editModule(Module module);
	void deleteLModule(Long moduleID);
	Module findModule(Long moduleID);
	Module findModuleByTitle(String nomModule);
	List<Module> getAllModules();
	List<Module> getAllModulesByProfessor(Long uid);
	
	void addDocument(Document doc);
	void editDocument(Document doc);
	void deleteLDocument(Long docID,Long moduleId);
	Document findDocument(Long docID);
	Document findDocumentByTitle(String nomdoc);
	List<Document> getAllDocuments();
	

	
	void addDepartement(Departement departement);
	void editDepartement(Departement departement);
	void deleteDepartement(Long Dep_Id);
	Departement  findDepartement(Long Dep_Id);
	Departement findDepByTitle(String DepTitle);
	List<Departement> getAllDepartements();
	List<Departement> getDepsByProps(Map<String,Object> props);
	
	
	
	void addFiliere(Filiere F);
	void editFiliere(Filiere F);
	void deleteFiliere(Long F_ID);
	Filiere findFiliere(Long F_ID);
	Filiere findFiliereByTitle(String FiName);
	List<Filiere> getAllFilieres();
	
	
	
}
