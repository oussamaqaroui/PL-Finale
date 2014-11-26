package com.PL.Spring.DAO;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Departement;
import com.PL.Spring.Entities.FI_M_D;
import com.PL.Spring.Entities.LC_D;
import com.PL.Spring.Entities.Module;
import com.PL.Spring.Entities.Professor;
import com.PL.Spring.Entities.Student;
import com.PL.Spring.Entities.User;




public class UserDaoImp implements UserDaoInt,AdminDaoInt,StudentDaoInt,ProfessorDaoInt,DepartementDaoInt,FI_M_D_DaoInt,LC_D_DaoInt,ModuleDaoInt{

	@PersistenceContext
	private EntityManager em;
	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public void addUser(User user) {
		em.persist(user);	
	}

	@Override
	public void editUser(User user) {
		this.em.merge(user);
		
	}

	

	@Override
	public User findUserByName(String username) {
		Query query=this.em.createQuery("SELECT o from User o where o.user_name =:username");
		query.setParameter("username", username);
		return (User)query.getSingleResult();
		
	}

	@Override
	public List<User> getAllUsers() {
		Query query=this.em.createQuery("SELECT o from User o");
		return query.getResultList();
	}


	@Override
	public void deleteUser(Long userId) {
		User u=em.getReference(User.class, userId);
		em.remove(u);
		
	}

	@Override
	public User findUser(Long userId) {
		return em.find(User.class, userId);
	}

	@Override
	public void addAdmin(Admin admin) {
		
		
		em.persist(admin);
		
	}

	@Override
	public void editAdmin(Admin admin) {
		
		this.em.merge(admin);
	}

	@Override
	public void deleteAdmin(Long userId) {
		Admin a=em.getReference(Admin.class, userId);
		em.remove(a);
		
	}

	@Override
	public Admin findAdmin(Long userId) {
		return em.find(Admin.class, userId);
	}

	@Override
	public Admin findAdminByName(String username) {
		Query query=this.em.createQuery("SELECT o from Admin o where o.user_name =:username");
		query.setParameter("username", username);
		return (Admin)query.getSingleResult();
	}

	@Override
	public List<Admin> finAdminByProps(Map<String, Object> props) {
String req=new String("select o from Admin o where ");
		
		//Construction de la requete
		
		Iterator it=props.keySet().iterator();
		
		while(it.hasNext())
		{
			String aide =(String)it.next();
			req+="o."+aide+" = :"+aide;
			if(it.hasNext())req+=" and ";
		}
		
		//Creation de la requete 
		Query query=this.em.createQuery(req);
		
		//Affectation des parametre
		for(Entry<String,Object> e:props.entrySet())
		{
			query.setParameter(e.getKey(), e.getValue());
		}
		
		return  query.getResultList();
	}
	
	@Override
	public List<Admin> getAllAdmins() {
		Query query=this.em.createQuery("SELECT o from Admin o");
		return query.getResultList();
	}

	@Override
	public void addStudent(Student student) {
		em.persist(student);
		
	}

	@Override
	public void editStudent(Student student) {
		em.merge(student);
		
	}

	@Override
	public void deleteStudent(Long userId) {
		Student s=em.getReference(Student.class, userId);
		em.remove(s);
		
	}

	@Override
	public Student findStudent(Long userId) {
		return em.find(Student.class, userId);
	}

	@Override
	public Student findStudentByName(String username) {
		Query query=this.em.createQuery("SELECT o from Student o where o.user_name =:username");
		query.setParameter("username", username);
		return (Student)query.getSingleResult();
	}

	@Override
	public List<Student> getAllStudents() {
		Query query=this.em.createQuery("SELECT o from Student o");
		return query.getResultList();
	}

	@Override
	public void addProfessor(Professor professor) {
		em.persist(professor);
	}

	@Override
	public void editProfessor(Professor professor) {
		em.merge(professor);
		
	}

	@Override
	public void deleteProfessor(Long userId) {
		Professor u=em.getReference(Professor.class, userId);
		em.remove(u);	
	}

	@Override
	public Professor findProfessor(Long userId) {
		return em.find(Professor.class, userId);
		
	}

	@Override
	public Professor findProfessorByName(String username) {
		Query query=this.em.createQuery("SELECT o from Professor o where o.user_name =:username");
		query.setParameter("username", username);
		return (Professor)query.getSingleResult();
	}

	@Override
	public List<Professor> getAllProfessors() {
		Query query=this.em.createQuery("SELECT o from Professor o");
		return query.getResultList();
	}

	@Override
	public void addDepartement(Departement departement) {
		em.persist(departement);	
		
	}

	@Override
	public void editDepartement(Departement departement) {
		this.em.merge(departement);
		
	}

	@Override
	public void deleteDepartement(Long Dep_Id) {
		Departement d=em.getReference(Departement.class, Dep_Id);
		em.remove(d);
		
	}

	@Override
	public Departement findDepartement(Long Dep_Id) {
		return em.find(Departement.class, Dep_Id);
	}

	@Override
	public Departement findDepByTitle(String DepTitle) {
		Query query=this.em.createQuery("SELECT o from Departement o where o.Title =:nomdep");
		query.setParameter("nomdep", DepTitle);
		return (Departement)query.getSingleResult();
	}

	@Override
	public List<Departement> getAllDepartements() {
		Query query=this.em.createQuery("SELECT o from Departement o");
		return query.getResultList();
	}

	@Override
	public void addFI_M_D(FI_M_D F) {
		em.persist(F);
		
	}

	@Override
	public void editFI_M_D(FI_M_D F) {
		this.em.merge(F);
		
	}

	@Override
	public void deleteFI_M_D(Long F_ID) {
		FI_M_D d=em.getReference(FI_M_D.class, F_ID);
		em.remove(d);
		
	}

	@Override
	public FI_M_D findFI_M_D(Long F_ID) {
		return em.find(FI_M_D.class, F_ID);
	}

	@Override
	public FI_M_D findFI_M_D_ByTitle(String FiName) {
		Query query=this.em.createQuery("SELECT o from FI_M_D o where o.Title =:nomf");
		query.setParameter("nomf", FiName);
		return (FI_M_D)query.getSingleResult();
	}

	@Override
	public List<FI_M_D> getAllFI_D_M() {
		Query query=this.em.createQuery("SELECT o from FI_M_D o");
		return query.getResultList();
	}

	@Override
	public void addLC_D(LC_D L) {
		em.persist(L);
		
	}

	@Override
	public void editLC_D(LC_D F) {
		em.merge(F);
		
	}

	@Override
	public void deleteLC_D(Long F_ID) {
		LC_D d=em.getReference(LC_D.class, F_ID);
		em.remove(d);
		
	}

	@Override
	public LC_D findLC_D(Long F_ID) {
		return em.find(LC_D.class, F_ID);
	}

	@Override
	public LC_D findLC_DByTitle(String FiName) {
		Query query=this.em.createQuery("SELECT o from LC_D o where o.Title =:nomf");
		query.setParameter("nomf", FiName);
		return (LC_D)query.getSingleResult();
	}

	@Override
	public List<LC_D> getAllLC_D() {
		Query query=this.em.createQuery("SELECT o from LC_D o");
		return query.getResultList();
	}

	@Override
	public void addModule(Module module) {
			em.persist(module);
	
		
	}

	@Override
	public void editModule(Module module) {
		em.merge(module);
		
	}

	@Override
	public void deleteLModule(Long moduleID) {
		Module d=em.getReference(Module.class, moduleID);
		em.remove(d);
		
	}

	@Override
	public Module findModule(Long moduleID) {
		return em.find(Module.class, moduleID);
	}

	@Override
	public Module findModuleByTitle(String nomModule) {
		
		Query query=this.em.createQuery("SELECT o from Module o where o.Title =:nomm");
		query.setParameter("nomm", nomModule);
		return (Module)query.getSingleResult();
	}

	@Override
	public List<Module> getAllModules() {
		Query query=this.em.createQuery("SELECT o from Module o");
		return query.getResultList();
	}

	
}
