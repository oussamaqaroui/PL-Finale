package com.PL.Spring.Entities;

import java.util.Collection;
import java.util.Date;
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
@Table(name="Phases")
public class Phase implements java.io.Serializable{
	


	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PhaseID")
	private Long PhaseID;
	
	@NotEmpty
	private String nomPhase;
	
	@NotEmpty
	private String DescriptionPhase;

	private Date dateDPhase;
	
	private Date dateDFhase;
	
	@ManyToMany
	private Collection<Module> Modules;
	
	public Date getDateDPhase() {
		return dateDPhase;
	}

	public void setDateDPhase(Date dateDPhase) {
		this.dateDPhase = dateDPhase;
	}

	public Date getDateDFhase() {
		return dateDFhase;
	}

	public void setDateDFhase(Date dateDFhase) {
		this.dateDFhase = dateDFhase;
	}

	
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
		return "Phase [PhaseID=" + PhaseID + ", nomPhase=" + nomPhase
				+ ", DescriptionPhase=" + DescriptionPhase + ", dateDPhase="
				+ dateDPhase + ", dateDFhase=" + dateDFhase + ", Modules="
				+ Modules + "]";
	}

	public Phase(Long phaseID, String nomPhase, String descriptionPhase,
			Date dateDPhase, Date dateDFhase, Collection<Module> modules) {
		super();
		PhaseID = phaseID;
		this.nomPhase = nomPhase;
		DescriptionPhase = descriptionPhase;
		this.dateDPhase = dateDPhase;
		this.dateDFhase = dateDFhase;
		Modules = modules;
	}

	public Phase(){}
	

}
