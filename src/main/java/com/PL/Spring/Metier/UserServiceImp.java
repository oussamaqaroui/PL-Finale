package com.PL.Spring.Metier;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.PL.Spring.DAO.UserDaoImp;
import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Departement;
import com.PL.Spring.Entities.Document;
import com.PL.Spring.Entities.Filiere;
import com.PL.Spring.Entities.Module;
import com.PL.Spring.Entities.Niveau;
import com.PL.Spring.Entities.Phase;
import com.PL.Spring.Entities.Professor;
import com.PL.Spring.Entities.Student;
import com.PL.Spring.Entities.User;

@Transactional
public class UserServiceImp implements UserServiceInt{
	
	private UserDaoImp userDaoImp;

	public UserDaoImp getUserDaoImp() {
		return userDaoImp;
	}

	public void setUserDaoImp(UserDaoImp userDaoImp) {
		this.userDaoImp = userDaoImp;
	}

	@Override
	public void addUser(User user) {
		userDaoImp.addUser(user);
		
	}

	@Override
	public void editUser(User user) {
		userDaoImp.editUser(user);
		
	}

	@Override
	public void deleteUser(Long userId) {
		userDaoImp.deleteUser(userId);
		
	}

	@Override
	public User findUser(Long userId) {
		return userDaoImp.findUser(userId);
		
	}

	@Override
	public User findUserByName(String username) {
		return userDaoImp.findUserByName(username);
		
	}

	@Override
	public List<User> getAllUsers() {
		return userDaoImp.getAllUsers();
	}

	@Override
	public void addAdmin(Admin admin) {
		userDaoImp.addAdmin(admin);
		
	}

	@Override
	public void editAdmin(Admin admin) {
		userDaoImp.editAdmin(admin);
		
	}

	@Override
	public void deleteAdmin(Long userId) {
		userDaoImp.deleteAdmin(userId);
		
	}

	@Override
	public Admin findAdmin(Long userId) {
		return userDaoImp.findAdmin(userId);
	}

	@Override
	public Admin findAdminByName(String username) {
		return userDaoImp.findAdminByName(username);
	}

	@Override
	public List<Admin> getAllAdmins() {
		return userDaoImp.getAllAdmins();
		
	}

	@Override
	public void addProfessor(Professor professor) {
		userDaoImp.addProfessor(professor);
		
	}

	@Override
	public void editProfessor(Professor professor) {
		userDaoImp.editProfessor(professor);
		
	}

	@Override
	public void deleteProfessor(Long userId) {
		userDaoImp.deleteProfessor(userId);
		
	}

	@Override
	public Professor findProfessor(Long userId) {
		return userDaoImp.findProfessor(userId);
		
	}

	@Override
	public Professor findProfessorByName(String username) {
		return userDaoImp.findProfessorByName(username);
	}

	@Override
	public List<Professor> getAllProfessors() {
		return userDaoImp.getAllProfessors();
		
	}

	@Override
	public void addStudent(Student student) {
		userDaoImp.addStudent(student);
		
	}

	@Override
	public void editStudent(Student student) {
		userDaoImp.editStudent(student);
		
	}

	@Override
	public void deleteStudent(Long userId) {
		userDaoImp.deleteStudent(userId);
		
	}

	@Override
	public Student findStudent(Long userId) {
		
		return userDaoImp.findStudent(userId);
	}

	@Override
	public Student findStudentByName(String username) {
		
		return userDaoImp.findStudentByName(username);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return userDaoImp.getAllStudents();
	}

	@Override
	public List<Admin> finAdminByProps(Map<String, Object> props) {
		return userDaoImp.finAdminByProps(props);
	}

	@Override
	public void addPhase(Phase phase) {
		userDaoImp.addPhase(phase);		
	}

	@Override
	public void editPhase(Phase phase) {
		userDaoImp.editPhase(phase);
		
	}

	@Override
	public void deletePhase(Long phaseID) {
		userDaoImp.deletePhase(phaseID);
		
	}

	@Override
	public Phase findPhase(Long phaseID) {
		return userDaoImp.findPhase(phaseID);
	}

	@Override
	public Phase findPhaseByName(String nomPhase) {
		return userDaoImp.findPhaseByName(nomPhase);
	}

	@Override
	public List<Phase> getAllPhase() {
		return userDaoImp.getAllPhase();
	}

	@Override
	public void addNiveau(Niveau niveau) {
		
		userDaoImp.addNiveau(niveau);
	}

	@Override
	public void editNiveau(Niveau niveau) {
		
		userDaoImp.editNiveau(niveau);
	}

	@Override
	public void deleteLNiveau(Long niveauID) {
		
		userDaoImp.deleteLNiveau(niveauID);
	}

	@Override
	public Niveau findNiveau(Long niveauID) {
		
		return userDaoImp.findNiveau(niveauID);
	}

	@Override
	public Niveau findNiveauByName(String nomNiveau) {
		
		return userDaoImp.findNiveauByName(nomNiveau);
	}

	@Override
	public List<Niveau> getAllNiveaux() {
	
		return userDaoImp.getAllNiveaux();
	}
	

	
	@Override
	public void addModule(Module module) {
		userDaoImp.addModule(module);
		
	}

	@Override
	public void editModule(Module module) {
		userDaoImp.editModule(module);
		
	}

	@Override
	public void deleteLModule(Long moduleID) {
		userDaoImp.deleteLModule(moduleID);
		
	}

	@Override
	public Module findModule(Long moduleID) {
		
		return userDaoImp.findModule(moduleID);
	}

	@Override
	public Module findModuleByTitle(String nomModule) {
	
		return userDaoImp.findModuleByTitle(nomModule);
	}

	@Override
	public List<Module> getAllModules() {
		
		return userDaoImp.getAllModules();
	}
	
	@Override
	public List<Professor> finProfessorByProps(Map<String, Object> props) {
		
		return userDaoImp.finProfessorByProps(props);
	}
	
	@Override
	public List<Student> findStudentByProps(Map<String, Object> props) {
		
		return userDaoImp.findStudentByProps(props);
	}

	@Override
	public void addDocument(Document doc) {
		userDaoImp.addDocument(doc);
	}

	@Override
	public void editDocument(Document doc) {
		userDaoImp.editDocument(doc);
		
	}

	@Override
	public void deleteLDocument(Long docID,Long documentId) {
		userDaoImp.deleteLDocument(docID,documentId);
		
	}

	@Override
	public Document findDocument(Long docID) {
		
		return userDaoImp.findDocument(docID);
	}

	@Override
	public Document findDocumentByTitle(String nomdoc) {
		
		return userDaoImp.findDocumentByTitle(nomdoc);
	}

	@Override
	public List<Document> getAllDocuments() {
		
		return userDaoImp.getAllDocuments();
	}

	@Override
	public List<Module> getAllModulesByProfessor(Long uid) {
		
		return userDaoImp.getAllModulesByProfessor(uid);
	}


	@Override
	public List<Niveau> findNiveauxByProps(Map<String, Object> props) {
		return userDaoImp.findNiveauxByProps(props);
	}


	@Override
	public void addDepartement(Departement departement) {
		userDaoImp.addDepartement(departement);
		
	}

	@Override
	public void editDepartement(Departement departement) {
		userDaoImp.editDepartement(departement);
		
	}

	@Override
	public void deleteDepartement(Long Dep_Id) {
		userDaoImp.deleteDepartement(Dep_Id);
		
	}

	@Override
	public Departement findDepartement(Long Dep_Id) {
		return userDaoImp.findDepartement(Dep_Id);
	}

	@Override
	public Departement findDepByTitle(String DepTitle) {
		return userDaoImp.findDepByTitle(DepTitle);
	}

	@Override
	public List<Departement> getAllDepartements() {
		return userDaoImp.getAllDepartements();
	}

	@Override
	public List<Departement> getDepsByProps(Map<String, Object> props) {
		return userDaoImp.getDepsByProps(props);
	}

	
	
	@Override
	public void addFiliere(Filiere F) {
		userDaoImp.addFiliere(F);
		
	}

	@Override
	public void editFiliere(Filiere F) {
		userDaoImp.editFiliere(F);
		
	}

	@Override
	public void deleteFiliere(Long F_ID) {
		userDaoImp.deleteFiliere(F_ID);
		
	}

	@Override
	public Filiere findFiliere(Long F_ID) {
		return userDaoImp.findFiliere(F_ID);
	}

	@Override
	public Filiere findFiliereByTitle(String FiName) {
		return userDaoImp.findFiliereByTitle(FiName);
	}

	@Override
	public List<Filiere> getAllFilieres() {
		return userDaoImp.getAllFilieres();
	}
}
