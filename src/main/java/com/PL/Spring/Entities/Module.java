package com.PL.Spring.Entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
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
	
	private Set<Phase> listPhases = new HashSet<Phase>(0);
	
	
	
	
	public Set<Phase> getListPhases() {
		return listPhases;
	}


	public void setListPhases(Set<Phase> listPhases) {
		this.listPhases = listPhases;
	}


	@NotEmpty
	private String nomModule;
	
	@NotEmpty
	private String DescriptionModule;
	
	
	private int NombreHeures;
	
	
	


	@Override
	public String toString() {
		return "Module [ModuleID=" + ModuleID + ", listPhases=" + listPhases
				+ ", nomModule=" + nomModule + ", DescriptionModule="
				+ DescriptionModule + ", NombreHeures=" + NombreHeures + "]";
	}


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


	
	
	

}
