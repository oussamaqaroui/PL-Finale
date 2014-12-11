package com.PL.Spring.Entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="Module")
public class Module implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ModuleID")
	private Long ModuleID;
	
	
	
	
	
	/*@ManyToMany(fetch= FetchType.LAZY , cascade=CascadeType.ALL)
	@JoinTable(name = "phases_modules",  joinColumns = { 
			@JoinColumn(name = "ModuleID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "PhaseID", 
					nullable = false, updatable = false) })
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<Phase> Phases;*/
	
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL) // eager parce qu'il ne trouve pas les role et cascade problème d'enregistrement des fils avant le père
	@JoinColumn(name="ModuleID")
	private Collection<Document> docs;
	
	@NotEmpty
	private String nomModule;
	
	@NotEmpty
	private String DescriptionModule;
	
	
	private int NombreHeures;


	public Long getModuleID() {
		return ModuleID;
	}


	public void setModuleID(Long moduleID) {
		ModuleID = moduleID;
	}


	public Collection<Document> getDocs() {
		return docs;
	}


	public void setDocs(Collection<Document> docs) {
		this.docs = docs;
	}


	public String getNomModule() {
		return nomModule;
	}


	public void setNomModule(String nomModule) {
		this.nomModule = nomModule;
	}


	public String getDescriptionModule() {
		return DescriptionModule;
	}


	public void setDescriptionModule(String descriptionModule) {
		DescriptionModule = descriptionModule;
	}


	public int getNombreHeures() {
		return NombreHeures;
	}


	public void setNombreHeures(int nombreHeures) {
		NombreHeures = nombreHeures;
	}


	@Override
	public String toString() {
		return "Module [ModuleID=" + ModuleID + ", docs=" + docs
				+ ", nomModule=" + nomModule + ", DescriptionModule="
				+ DescriptionModule + ", NombreHeures=" + NombreHeures + "]";
	}


	public Module(Long moduleID, Collection<Document> docs, String nomModule,
			String descriptionModule, int nombreHeures) {
		super();
		ModuleID = moduleID;
		this.docs = docs;
		this.nomModule = nomModule;
		DescriptionModule = descriptionModule;
		NombreHeures = nombreHeures;
	}


	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	
	
	

}
