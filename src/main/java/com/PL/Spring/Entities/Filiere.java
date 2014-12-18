package com.PL.Spring.Entities;

import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Filiere")
public  class Filiere implements  Comparable<Filiere>{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="f_ID")
	private Long f_ID;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL) // eager parce qu'il ne trouve pas les role et cascade problème d'enregistrement des fils avant le père
	@JoinColumn(name="f_ID")
	private Set<Niveau> niveaux;
	
	
	
	public Long getF_ID() {
		return f_ID;
	}
	public void setF_ID(Long f_ID) {
		this.f_ID = f_ID;
	}
	public Collection<Niveau> getNiveaux() {
		return niveaux;
	}
	public void setNiveaux(Set<Niveau> niveaux) {
		this.niveaux = niveaux;
	}
	private String title;
	private String description;
	private int nombreAnnee;
	private Date dateCreation;
	
	
	
	public Filiere(Long ff_ID, String ttitle, String ddescription,
			int nnombreAnnee, Date ddateCreation) {
		super();
		f_ID = ff_ID;
		title = ttitle;
		description = ddescription;
		nombreAnnee = nnombreAnnee;
		dateCreation = ddateCreation;
	}
	
	
	@Override
	public String toString() {
		return "Filiere [f_ID=" + f_ID + ", niveaux=" + niveaux + ", title="
				+ title + ", description=" + description + ", nombreAnnee="
				+ nombreAnnee + ", dateCreation=" + dateCreation + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNombreAnnee() {
		return nombreAnnee;
	}
	public void setNombreAnnee(int nombreAnnee) {
		this.nombreAnnee = nombreAnnee;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Filiere(){}
	
	@Override
	public int compareTo(Filiere arg0) {
		return this.f_ID.compareTo(arg0.f_ID);
	}
	

}
