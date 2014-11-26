package com.PL.Spring.Metier;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;



import com.PL.Spring.DAO.UserDaoImp;
import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Departement;
import com.PL.Spring.Entities.FI_M_D;
import com.PL.Spring.Entities.LC_D;
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
	public void addFI_M_D(FI_M_D F) {
		userDaoImp.addFI_M_D(F);
		
	}

	@Override
	public void editFI_M_D(FI_M_D F) {
		userDaoImp.editFI_M_D(F);
		
	}

	@Override
	public void deleteFI_M_D(Long F_ID) {
		userDaoImp.deleteFI_M_D(F_ID);
		
	}

	@Override
	public FI_M_D findFI_M_D(Long F_ID) {
		
		return userDaoImp.findFI_M_D(F_ID);
	}

	@Override
	public FI_M_D findFI_M_D_ByTitle(String FiName) {
		
		return userDaoImp.findFI_M_D_ByTitle(FiName);
	}

	@Override
	public List<FI_M_D> getAllFI_D_M() {
		
		return userDaoImp.getAllFI_D_M();
	}

	@Override
	public void addLC_D(LC_D L) {
		userDaoImp.addLC_D(L);
		
	}

	@Override
	public void editLC_D(LC_D F) {
		userDaoImp.editLC_D(F);
		
	}

	@Override
	public void deleteLC_D(Long F_ID) {
		userDaoImp.deleteLC_D(F_ID);
		
	}

	@Override
	public LC_D findLC_D(Long F_ID) {
		
		return userDaoImp.findLC_D(F_ID);
	}

	@Override
	public LC_D findLC_DByTitle(String FiName) {
		
		return userDaoImp.findLC_DByTitle(FiName);
	}

	@Override
	public List<LC_D> getAllLC_D() {
		
		return userDaoImp.getAllLC_D();
	}

}
