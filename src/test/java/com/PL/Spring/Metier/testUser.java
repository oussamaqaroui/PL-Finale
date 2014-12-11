package com.PL.Spring.Metier;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.Vector;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Document;
import com.PL.Spring.Entities.Module;
import com.PL.Spring.Entities.Phase;
import com.PL.Spring.Entities.Role;
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
	public void testDeleteUser() {
		//metier.deleteUser(new Long(5));
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
