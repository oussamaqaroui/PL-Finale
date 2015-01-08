package com.PL.Spring.Metier;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javassist.bytecode.Descriptor.Iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Document;
import com.PL.Spring.Entities.Module;
import com.PL.Spring.Entities.Note;
import com.PL.Spring.Entities.NoteID;
import com.PL.Spring.Entities.Phase;
import com.PL.Spring.Entities.Professor;
import com.PL.Spring.Entities.Role;
import com.PL.Spring.Entities.Student;
import com.PL.Spring.Entities.TypeNote;
import com.PL.Spring.Entities.User;


public class testUser {

	@Autowired
	private static ClassPathXmlApplicationContext context;
	private static UserServiceInt metier;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		metier=(UserServiceInt) context.getBean("metier");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	
	/*@Test
	public void testAddprof() {
		Professor p=new Professor();
		p.setActived(true);
		p.setEmail("a@gmail.com");
		p.setNom("JDIDI");
		p.setPassword("pass");
		p.setPrenom("Nedal");
		p.setUser_name("hila");
		
		metier.addProfessor(p);
		
	}*/

	
	
	@Test
	public void getTNbymodule() {
		
		Module m=metier.findModule(new Long(1));
		List<TypeNote> tns=new ArrayList<TypeNote>();
				tns=metier.getTypeNoteByModule(m);
		
	 
	  
		List<TypeNote> tmp=metier.getAllTypeNote();

		System.out.println("\n\n"+tns.size()+" type notes :"+tns);
		System.out.println("\n"+tmp.size()+" type notes All :"+tmp);
	
	}
	

	@Test
	public void deletTN() {
	
		
		metier.deleteTypeNote(new Long(6));
		
		
	}
	
	@Test
	public void testeditTN() {
		 /*TypeNote tn=new TypeNote();
		 tn.setNomType("TD");
		 tn.setPourcentage(new Long(12));
		 metier.addTypeNote(tn);*/
		
		TypeNote tn=metier.findTypeNote(new Long(3));
		System.out.println("type  : "+tn);
		
		tn.setPourcentage(new Long(55));
		metier.editTypeNote(tn);
		
	}
	
	@Test
	public void testAddNote() {
		Student s=metier.findStudent(new Long(4));
		Module m =metier.findModule(new Long(2));
		TypeNote tn=metier.findTypeNote(new Long(3));
		System.out.println("\n\n\nStudent : "+s+"  \nModule :"+m+"\nTypeNote  :"+tn);
		
		
		Note n=new Note();
		
	
		
		n.setValeur(new Double(19));
		n.setModule(m);
		n.setStudent(s);
		n.setType(tn);
		
		
		 //metier.addNote(n);
	    s.getNotes().add(n);
	    m.getNotes().add(n);
	    tn.getNotes().add(n);
	   
	    metier.editModule(m);
	    metier.editStudent(s);
	    metier.editTypeNote(tn);
	    
	    
	    
	   // TypeNote tn=new TypeNote();
	    
	    
	    
	    
	    /*----------------------------------------------------------------*/
	   // TypeNote tn=metier.findTypeNote(new Long(4));
	    
	    
	    
	    //tn.setNomType("TP2");
	    //tn.setPourcentage(new Long(25));
	    
	   // metier.addTypeNote(tn);

System.out.println("--------------- Typenote ajouté-----------------");
	    
	    
	   // tn.getNotes().add(n);
	    //n.setType(tn);
	    
	   // metier.editTypeNote(tn);
	    
	    
	    //n.setType(tn);
	     
	   // metier.editNote(n);
	   
	   
	    
	    
		//System.out.println("profs  :"+metier.getAllProfessors());
		
	}
	
	
	@Test
	public void testGetUsersProf() {
		Professor pr=metier.findProfessorByName("CHANTIT");
		System.out.println("users Professor :"+pr);
		
	}
	
	@Test
	public void testAddUser() {
		
		
		
		
		
		
		
		
		
		/*Phase p=new Phase();
		p.setNomPhase("phase3");
		p.setDescriptionPhase("phase3 test");
		
		Module m=new Module();
		
		m.setDescriptionModule("geej test3");
		m.setNombreHeures(20);
		m.setNomModule("C#");
		
		Set<Phase> cph= new List<Phase>();
		Collection<Module> cmo= new Vector<Module>();
		
		cph.add(p);
		cmo.add(m);
		p.setModules(cmo);
		m.setPhases(cph);
		
		metier.addModule(m);
		metier.addPhase(p);
		*/
		
		
		/*Document d=new Document();
		d.setDatedoc(new Date());
		d.setNom("JEE test");
		metier.addDocument(d);*/
		
		/*
		User u=new User();
		
		Role r=new Role();
		r.setRoleName("ROLE_STUDENT");
		
		Collection<Role> c;
		c=new Vector<Role>();
		c.add(r);
		
		u.setActived(true);
		u.setUser_name("toto");
		u.setRoles(c);
		
		metier.addUser(u);
		*/
		/*Admin a=new Admin();
		a.setUser_name("admin1");
		a.setPassword("admin1");
		
		Role r=new Role();
		r.setRoleName("ROLE_ADMIN_PR");
		Role r2=new Role();
		r2.setRoleName("ROLE_PROFESSOR");
		
		Collection<Role> c;
		c=new Vector<Role>();
		c.add(r);
		c.add(r2);
		
		
		a.setRoles(c);
		
		a.setAdresse("My Youssef/Bousskoura");
		
		a.setDateNaissance(new Date());
		a.setNom("NAJIH");
		a.setPrenom("Yahya");
		a.setEmail("YahyaNajih@gmail.com");
		metier.addAdmin(a);
		*/
		}

	@Test
	public void testEditUser() {
		/*
		User u=metier.findUserByName("toto");
		u.setPassword("toto");
		metier.editUser(u);
		*/
		/*Admin a=metier.findAdmin(new Long(4));
		a.setActived(true);
		metier.editAdmin(a);*/
		
		
	}

	@Test
	public void testDeletedoc() {
		//metier.deleteUser(new Long(5));
		//metier.deleteLDocument(new Long(5));
	}

	@Test
	public void testFindUser() {
		
		//System.out.println("Doc1 => " + metier.findDocument(new Long(1)));
		//System.out.println("Admin => " + metier.findAdmin(new Long(1)));
		//System.out.println("Utilisateur => " + metier.findUser(new Long(1)));
	}

	@Test
	public void testFindProfessorbyname() {
		//System.out.println(metier.findAdminByName("admin1"));
		//System.out.println(metier.findModule(new Long(1)));
		
		System.out.println("\n Professor"+metier.findProfessor(new Long(1)));
	}

	@Test
	public void testGetAllModules() {
		System.out.println("*** \n"+metier.getAllModules()+" \n***");
	}
	@Test
	public void testGetAllModulesByProf() {
		System.out.println("*** \n"+metier.getAllModulesByProfessor(new Long(1))+" \n***");
	}

}
