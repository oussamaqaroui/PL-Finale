package com.PL.Spring.Entities;

import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="Niveaux")
public class Niveau implements java.io.Serializable,Comparable<Niveau>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5012989335252959821L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="niveauID")
	private Long niveauID;
	
	//A modifier pour avoir la clé primaire composée dans la table résultante students_niveaux
	@ManyToMany(fetch= FetchType.EAGER , cascade=CascadeType.ALL)
	@JoinTable(name = "niveaux_students",  joinColumns = { 
			@JoinColumn(name = "NiveauID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "user_id", 
					nullable = false, updatable = false) })
	private Set<Student> students; // Set et non collection pour avoir une clé primaire composée des deux dans niveaux_student
	
	/// mot de passe problème dans l'edition taydir md5 dial md5
	@OneToMany(fetch= FetchType.EAGER , cascade=CascadeType.ALL)
	@JoinColumn(name="niveauID")
	private Set<Phase> Phases;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="f_ID")
	private Filiere filiere;
	

	@NotEmpty
	private String nomNiveau;
	

	//@NotEmpty
	private String descriptionNiveau;
	
	private Date dateDebut;
	
	private Date dateFin;
	
	//private String annescolaire;
	
	//private boolean active;
	

	
	
	
	
	


	@Override
	public int compareTo(Niveau o) {
		return this.niveauID.compareTo(o.niveauID);
	}

	public Long getNiveauID() {
		return niveauID;
	}

	public void setNiveauID(Long niveauID) {
		this.niveauID = niveauID;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Phase> getPhases() {
		return Phases;
	}

	public void setPhases(Set<Phase> phases) {
		Phases = phases;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public String getNomNiveau() {
		return nomNiveau;
	}

	public void setNomNiveau(String nomNiveau) {
		this.nomNiveau = nomNiveau;
	}

	public String getDescriptionNiveau() {
		return descriptionNiveau;
	}

	public void setDescriptionNiveau(String descriptionNiveau) {
		this.descriptionNiveau = descriptionNiveau;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	@Override
	public String toString() {
		return "Niveau [niveauID=" + niveauID + ", students=" + students
				+ ", Phases=" + Phases + ", filiere=" + filiere
				+ ", nomNiveau=" + nomNiveau + ", descriptionNiveau="
				+ descriptionNiveau + ", dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + "]";
	}

	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Niveau(Long niveauID, Set<Student> students, Set<Phase> phases,
			Filiere filiere, String nomNiveau, String descriptionNiveau,
			Date dateDebut, Date dateFin) {
		super();
		this.niveauID = niveauID;
		this.students = students;
		Phases = phases;
		this.filiere = filiere;
		this.nomNiveau = nomNiveau;
		this.descriptionNiveau = descriptionNiveau;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	

}
