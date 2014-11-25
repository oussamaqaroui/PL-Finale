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
	
	@OneToOne
	@JoinColumn(name="HeadOfDep")
	private Professor HeadOfDep;
	
	@OneToMany
	@JoinColumn(name="Dep_ID")
	private Collection<Professor> Instroctors;
	
	@OneToMany
	@JoinColumn(name="Dep_ID")
	private Collection<FI_M_D> FMDS;

}
