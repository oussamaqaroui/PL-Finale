package com.PL.Spring.Entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Departements")
public class Departement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dep_ID")
	private Long dep_ID;
	
	private String title;
	private String description;
	
	/*@OneToOne
	@JoinColumn(name="HeadOfDep")
	private Professor headOfDep;*/
	
	@OneToMany
	@JoinColumn(name="dep_ID")
	private Collection<Professor> instroctors;
	
	@OneToMany
	@JoinColumn(name="dep_ID")
	private Collection<Filiere> filieres;

	public Long getDep_ID() {
		return dep_ID;
	}

	public void setDep_ID(Long dep_ID) {
		this.dep_ID = dep_ID;
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

	public Collection<Professor> getInstroctors() {
		return instroctors;
	}

	public void setInstroctors(Collection<Professor> instroctors) {
		this.instroctors = instroctors;
	}

	public Collection<Filiere> getFilieres() {
		return filieres;
	}

	public void setFilieres(Collection<Filiere> filieres) {
		this.filieres = filieres;
	}

	@Override
	public String toString() {
		return "Departement [dep_ID=" + dep_ID + ", title=" + title
				+ ", description=" + description + ", instroctors="
				+ instroctors + ", filieres=" + filieres + "]";
	}

	public Departement(Long dep_ID, String title, String description,
			Collection<Professor> instroctors, Collection<Filiere> filieres) {
		super();
		this.dep_ID = dep_ID;
		this.title = title;
		this.description = description;
		this.instroctors = instroctors;
		this.filieres = filieres;
	}

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	
}