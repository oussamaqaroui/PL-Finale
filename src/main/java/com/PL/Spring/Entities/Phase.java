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
@Table(name="Phase")
public class Phase implements java.io.Serializable{
	


	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PhaseID")
	private Long PhaseID;
	
	private Set<Module> listModules = new HashSet<Module>(0);
	
	public Set<Module> getListModules() {
		return listModules;
	}

	public void setListModules(Set<Module> listModules) {
		this.listModules = listModules;
	}

	@NotEmpty
	private String nomPhase;
	
	@NotEmpty
	private String DescriptionPhase;

	public Long getPhaseID() {
		return PhaseID;
	}

	public void setPhaseID(Long phaseID) {
		PhaseID = phaseID;
	}

	public String getNomPhase() {
		return nomPhase;
	}

	public void setNomPhase(String nomPhase) {
		this.nomPhase = nomPhase;
	}

	public String getDescriptionPhase() {
		return DescriptionPhase;
	}

	public void setDescriptionPhase(String descriptionPhase) {
		DescriptionPhase = descriptionPhase;
	}

	@Override
	public String toString() {
		return "Phase [PhaseID=" + PhaseID + ", listModules=" + listModules
				+ ", nomPhase=" + nomPhase + ", DescriptionPhase="
				+ DescriptionPhase + "]";
	}

	
	

}
