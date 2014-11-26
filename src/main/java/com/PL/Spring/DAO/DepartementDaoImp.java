package com.PL.Spring.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.PL.Spring.Entities.Departement;
import com.PL.Spring.Entities.User;

public class DepartementDaoImp implements DepartementDaoInt {

	
	
	@PersistenceContext
	private EntityManager em;
	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
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

}
