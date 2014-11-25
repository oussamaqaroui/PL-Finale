package com.PL.Spring.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Filiere {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="F_ID")
	private Long F_ID;
	
	public Long getF_ID() {
		return F_ID;
	}
	public void setF_ID(Long f_ID) {
		F_ID = f_ID;
	}
	private String Title;
	private String Description;
	private int NombreAnnee;
	private Date DateCreation;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getNombreAnnee() {
		return NombreAnnee;
	}
	public void setNombreAnnee(int nombreAnnee) {
		NombreAnnee = nombreAnnee;
	}
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	
	

}
