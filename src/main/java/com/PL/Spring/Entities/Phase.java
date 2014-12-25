package com.PL.Spring.Entities;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	@Column(name="phaseID")
	private Long phaseID;
	
	@NotEmpty
	private String nomPhase;
	
	@NotEmpty
	private String descriptionPhase;

	private Date dateDPhase;
	
	private Date dateDFhase;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="niveauID")
	private Niveau niveau;
	
	
	
	@ManyToMany(fetch= FetchType.EAGER , cascade=CascadeType.ALL)
	@JoinTable(name = "filiere_module",  joinColumns = { 
			@JoinColumn(name = "phaseID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "ModuleID", 
					nullable = false, updatable = false) })
	private Set<Niveau> modules;



	public Long getPhaseID() {
		return phaseID;
	}



	public void setPhaseID(Long phaseID) {
		this.phaseID = phaseID;
	}



	public String getNomPhase() {
		return nomPhase;
	}



	public void setNomPhase(String nomPhase) {
		this.nomPhase = nomPhase;
	}



	public String getDescriptionPhase() {
		return descriptionPhase;
	}



	public void setDescriptionPhase(String descriptionPhase) {
		this.descriptionPhase = descriptionPhase;
	}



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



	public Niveau getNiveau() {
		return niveau;
	}



	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}



	public Set<Niveau> getModules() {
		return modules;
	}



	public void setModules(Set<Niveau> modules) {
		this.modules = modules;
	}



	@Override
	public String toString() {
		return "Phase [phaseID=" + phaseID + ", nomPhase=" + nomPhase
				+ ", descriptionPhase=" + descriptionPhase + ", dateDPhase="
				+ dateDPhase + ", dateDFhase=" + dateDFhase + ", niveau="
				+ niveau + ", modules=" + modules + "]";
	}



	public Phase(Long phaseID, String nomPhase, String descriptionPhase,
			Date dateDPhase, Date dateDFhase, Niveau niveau, Set<Niveau> modules) {
		super();
		this.phaseID = phaseID;
		this.nomPhase = nomPhase;
		this.descriptionPhase = descriptionPhase;
		this.dateDPhase = dateDPhase;
		this.dateDFhase = dateDFhase;
		this.niveau = niveau;
		this.modules = modules;
	}



	public Phase() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
