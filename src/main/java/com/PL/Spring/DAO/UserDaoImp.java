package com.PL.Spring.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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




public class UserDaoImp implements UserDaoInt,AdminDaoInt,StudentDaoInt,ProfessorDaoInt,DepartementDaoInt
,PhaseDaoInt,NiveauDaoInt,FiliereDaoInt,ModuleDaoInt,DocumentDaoInt

{

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
		
		Iterator<String> it=props.keySet().iterator();
		
		while(it.hasNext())
		{
			String aide =it.next();
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
		Query query=this.em.createQuery("SELECT o from Professor o where o.nom =:username");
		query.setParameter("username", username);
		return (Professor)query.getSingleResult();
	}

	@Override
	public List<Professor> getAllProfessors() {
		Query query=this.em.createQuery("SELECT o from Professor o");
		return query.getResultList();
	}
	
	@Override
	public List<Professor> finProfessorByProps(Map<String, Object> props) {
		String req=new String("select o from Professor o where ");
		
		//Construction de la requete
		
		Iterator<String> it=props.keySet().iterator();
		
		while(it.hasNext())
		{
			String aide =it.next();
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
	public void addPhase(Phase phase) {
		em.persist(phase);
		
	}

	@Override
	public void editPhase(Phase phase) {
		em.merge(phase);
		
	}

	@Override
	public void deletePhase(Long phaseID) {
		Phase p=em.getReference(Phase.class,phaseID);
		em.remove(p);
		
	}

	@Override
	public Phase findPhase(Long phaseID) {
		return em.find(Phase.class, phaseID);
	}

	@Override
	public Phase findPhaseByName(String nomPhase) {
		Query query=this.em.createQuery("SELECT o from Phase o where o.Title =:nomp");
		query.setParameter("nomp", nomPhase);
		return (Phase)query.getSingleResult();
	}

	@Override
	public List<Phase> getAllPhase() {
		Query query=this.em.createQuery("SELECT o from Phase o");
		return query.getResultList();
	}
	
	@Override
	public void addNiveau(Niveau niveau) {
		
		em.persist(niveau);
		
	}

	@Override
	public void editNiveau(Niveau niveau) {
		
		this.em.merge(niveau);
		
	}

	@Override
	public void deleteLNiveau(Long niveauID) {
		
		Niveau d=em.getReference(Niveau.class, niveauID);
		em.remove(d);
	}

	@Override
	public Niveau findNiveau(Long niveauID) {
		
		return em.find(Niveau.class, niveauID);
	}

	@Override
	public Niveau findNiveauByName(String nomNiveau) {
		
		Query query=this.em.createQuery("SELECT o from Niveau o where o.nomNiveau =:nomN");
		query.setParameter("nomN", nomNiveau);
		return (Niveau)query.getSingleResult();
	}

	@Override
	public List<Niveau> getAllNiveaux() {
		
		Query query=this.em.createQuery("SELECT o from Niveau o");
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
		
		Query query=this.em.createQuery("SELECT o from Module o where o.nomModule =:nomm");
		query.setParameter("nomm", nomModule);
		return (Module)query.getSingleResult();
	}

	@Override
	public List<Module> getAllModules() {
		Query query=this.em.createQuery("SELECT o from Module o");
		return query.getResultList();
	}
	
	
	@Override
	public List<Module> getAllModulesByProfessor(Long u_id) {
		//Query query=this.em.createQuery("SELECT o from Module o where o.user_id =: uid");
		//query.setParameter("uid", u_id);
		
		
		
		Professor p= em.find(Professor.class, u_id);
		
		//List<Module> cmo=(List<Module>)p.getModules();
		List list = new ArrayList(p.getModules());
		
		
		return  list;
	}

	@Override
	public List<Student> findStudentByProps(Map<String, Object> props) {
			String req=new String("select o from Student o where ");
					
					//Construction de la requete
					
					Iterator<String> it=props.keySet().iterator();
					
					while(it.hasNext())
					{
						String aide =it.next();
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
	public void addDocument(Document doc) {
		em.persist(doc);
		
	}

	@Override
	public void editDocument(Document doc) {
		em.merge(doc);
		
	}

	@Override
	public void deleteLDocument(Long docID, Long moduleId) {
		Module m=em.getReference(Module.class, moduleId);
		
		Document d=em.getReference(Document.class, docID);
		m.getDocs().remove(d);
	    em.merge(m);
		
		em.remove(d);
		
	}

	@Override
	public Document findDocument(Long docID) {
		return em.find(Document.class, docID);
	}

	@Override
	public Document findDocumentByTitle(String nomdoc) {
		Query query=this.em.createQuery("SELECT o from Document o where o.nom =:nomm");
		query.setParameter("nomm", nomdoc);
		return (Document)query.getSingleResult();
	}

	@Override
	public List<Document> getAllDocuments() {
		Query query=this.em.createQuery("SELECT o from Document o");
		return query.getResultList();
	}

	
	
	
	
	
	
	

	@Override
	public void addFiliere(Filiere F) {
		em.persist(F);
		
	}

	@Override
	public void editFiliere(Filiere F) {
		em.merge(F);
		
	}

	@Override
	public void deleteFiliere(Long F_ID) {
		Filiere f=em.getReference(Filiere.class,F_ID );
		em.remove(f);
		
	}

	@Override
	public Filiere findFiliere(Long F_ID) {
		return em.find(Filiere.class, F_ID);
	}

	@Override
	public Filiere findFiliereByTitle(String FiName) {
		Query query=this.em.createQuery("SELECT o from Filiere o where o.title =:nomf");
		query.setParameter("nomf", FiName);
		return (Filiere) query.getSingleResult();
	}

	@Override
	public List<Filiere> getAllFilieres() {
		Query query=this.em.createQuery("SELECT o from Filiere o");
		return query.getResultList();
	}

	@Override
	public List<Niveau> findNiveauxByProps(Map<String, Object> props) {
String req=new String("select o from Niveau o where ");
		
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
	public List<Departement> getDepsByProps(Map<String, Object> props) {
String req=new String("select o from Departement o where ");
		
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



}
