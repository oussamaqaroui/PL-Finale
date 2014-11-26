package com.PL.Spring.Entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="Modules")
public class Module implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ModuleID")
	private Long ModuleID;
	
	@ManyToMany(mappedBy="Modules")
	private Collection<Phase> Phases;
	
	
	
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}


	
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
		return "Module [ModuleID=" + ModuleID + ", Phases=" + Phases
				+ ", nomModule=" + nomModule + ", DescriptionModule="
				+ DescriptionModule + ", NombreHeures=" + NombreHeures + "]";
	}


	public Module(Long moduleID, Collection<Phase> phases, String nomModule,
			String descriptionModule, int nombreHeures) {
		super();
		ModuleID = moduleID;
		Phases = phases;
		this.nomModule = nomModule;
		DescriptionModule = descriptionModule;
		NombreHeures = nombreHeures;
	}

	
	
	
	

}
