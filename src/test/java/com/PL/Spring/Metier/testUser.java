package com.PL.Spring.Metier;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Date;
import java.util.Vector;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.PL.Spring.Entities.Admin;
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
		a.setUser_name("Yahya");
		a.setPassword("0000");
		
		Role r=new Role();
		r.setRoleName("ROLE_STUDENT");
		Role r2=new Role();
		r2.setRoleName("ROLE_ADMIN");
		
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
		metier.addAdmin(a);*/
		
		}

	@Test
	public void testEditUser() {
		/*
		User u=metier.findUserByName("toto");
		u.setPassword("toto");
		metier.editUser(u);
		*/
		Admin a=metier.findAdmin(new Long(4));
		a.setActived(true);
		metier.editAdmin(a);
		
		
	}

	@Test
	public void testDeleteUser() {
		//metier.deleteUser(new Long(5));
	}

	@Test
	public void testFindUser() {
		
		//System.out.println("Admin => " + metier.findAdmin(new Long(1)));
		//System.out.println("Utilisateur => " + metier.findUser(new Long(1)));
	}

	@Test
	public void testFindUserByName() {
		System.out.println(metier.findAdminByName("admin1"));
	}

	@Test
	public void testGetAllUsers() {
		System.out.println("*** \n"+metier.getAllAdmins()+" \n***");
	}

}
