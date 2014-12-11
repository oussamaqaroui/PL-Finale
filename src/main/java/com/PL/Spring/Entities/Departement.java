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
@Table(name="Departement")
public class Departement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Dep_ID")
	private Long Dep_ID;
	
	private String Title;
	private String Description;
	
	/*@OneToOne
	@JoinColumn(name="HeadOfDep")
	private Professor HeadOfDep;*/
	
	@OneToMany
	@JoinColumn(name="Dep_ID")
	private Collection<Professor> Instroctors;
	
	@OneToMany
	@JoinColumn(name="Dep_ID")
	private Collection<FI_M_D> FMDS;

	public Long getDep_ID() {
		return Dep_ID;
	}

	public void setDep_ID(Long dep_ID) {
		Dep_ID = dep_ID;
	}

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

/*	public Professor getHeadOfDep() {
		return HeadOfDep;
	}

	public void setHeadOfDep(Professor headOfDep) {
		HeadOfDep = headOfDep;
	}
*/
	public Collection<Professor> getInstroctors() {
		return Instroctors;
	}

	public void setInstroctors(Collection<Professor> instroctors) {
		Instroctors = instroctors;
	}

	public Collection<FI_M_D> getFMDS() {
		return FMDS;
	}

	public void setFMDS(Collection<FI_M_D> fMDS) {
		FMDS = fMDS;
	}


	
	public Departement(Long dep_ID, String title, String description,
			Collection<Professor> instroctors, Collection<FI_M_D> fMDS) {
		super();
		Dep_ID = dep_ID;
		Title = title;
		Description = description;
		Instroctors = instroctors;
		FMDS = fMDS;
	}

	@Override
	public String toString() {
		return "Departement [Dep_ID=" + Dep_ID + ", Title=" + Title
				+ ", Description=" + Description + ", Instroctors="
				+ Instroctors + ", FMDS=" + FMDS + "]";
	}

	public Departement(){}

}
