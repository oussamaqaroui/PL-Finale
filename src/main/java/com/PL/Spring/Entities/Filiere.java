package com.PL.Spring.Entities;

import java.util.Date;

public abstract class Filiere {
	
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
