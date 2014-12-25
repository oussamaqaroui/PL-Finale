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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
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
	
	
	
	
	
	/*@ManyToMany(fetch= FetchType.EAGER , cascade=CascadeType.ALL)
	@JoinTable(name = "filiere_module",  joinColumns = { 
			@JoinColumn(name = "ModuleID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "phaseID", 
					nullable = false, updatable = false) })
	private Set<Phase> phases;*/
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Phase phase;
	
	
	
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="professor")
	private Professor professor;
	
	
	
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL) // eager parce qu'il ne trouve pas les role et cascade problème d'enregistrement des fils avant le père
	@JoinColumn(name="ModuleID")
	private Set<Document> docs;
	
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pk.module",orphanRemoval=true, cascade = 
	    {CascadeType.PERSIST, CascadeType.MERGE})
	    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, 
	    })
	private Set<Note> absences=new HashSet<Note>(0);
	
	
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


	public Phase getPhase() {
		return phase;
	}


	public void setPhase(Phase phase) {
		this.phase = phase;
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	public Set<Document> getDocs() {
		return docs;
	}


	public void setDocs(Set<Document> docs) {
		this.docs = docs;
	}


	public Set<Note> getAbsences() {
		return absences;
	}


	public void setAbsences(Set<Note> absences) {
		this.absences = absences;
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


/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((DescriptionModule == null) ? 0 : DescriptionModule
						.hashCode());
		result = prime * result
				+ ((ModuleID == null) ? 0 : ModuleID.hashCode());
		result = prime * result + NombreHeures;
		result = prime * result
				+ ((absences == null) ? 0 : absences.hashCode());
		result = prime * result + ((docs == null) ? 0 : docs.hashCode());
		result = prime * result
				+ ((nomModule == null) ? 0 : nomModule.hashCode());
		result = prime * result + ((phase == null) ? 0 : phase.hashCode());
		result = prime * result
				+ ((professor == null) ? 0 : professor.hashCode());
		return result;
	}
*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Module other = (Module) obj;
		if (DescriptionModule == null) {
			if (other.DescriptionModule != null)
				return false;
		} else if (!DescriptionModule.equals(other.DescriptionModule))
			return false;
		if (ModuleID == null) {
			if (other.ModuleID != null)
				return false;
		} else if (!ModuleID.equals(other.ModuleID))
			return false;
		if (NombreHeures != other.NombreHeures)
			return false;
		if (absences == null) {
			if (other.absences != null)
				return false;
		} else if (!absences.equals(other.absences))
			return false;
		if (docs == null) {
			if (other.docs != null)
				return false;
		} else if (!docs.equals(other.docs))
			return false;
		if (nomModule == null) {
			if (other.nomModule != null)
				return false;
		} else if (!nomModule.equals(other.nomModule))
			return false;
		if (phase == null) {
			if (other.phase != null)
				return false;
		} else if (!phase.equals(other.phase))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Module [ModuleID=" + ModuleID + ", phase=" + phase
				+ ", professor=" + professor + ", docs=" + docs + ", absences="
				+ absences + ", nomModule=" + nomModule
				+ ", DescriptionModule=" + DescriptionModule
				+ ", NombreHeures=" + NombreHeures + "]";
	}


	public Module(Long moduleID, Phase phase, Professor professor,
			Set<Document> docs, Set<Note> absences, String nomModule,
			String descriptionModule, int nombreHeures) {
		super();
		ModuleID = moduleID;
		this.phase = phase;
		this.professor = professor;
		this.docs = docs;
		this.absences = absences;
		this.nomModule = nomModule;
		DescriptionModule = descriptionModule;
		NombreHeures = nombreHeures;
	}


	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}




	


	
	
	

}
