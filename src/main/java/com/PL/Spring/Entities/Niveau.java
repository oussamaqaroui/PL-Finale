package com.PL.Spring.Entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="Niveau")
public class Niveau implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NiveauID")
	private Long NiveauID;
	
	//@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL) // eager parce qu'il ne trouve pas les role et cascade problème d'enregistrement des fils avant le père
	@JoinColumn(name="NiveauID")
	private Collection<Student> roles;
	
	@NotEmpty
	private String nomNiveau;
	
	@NotEmpty
	private String DescriptionNiveau;
	
	private Date dateDebut;
	
	private Date dateFin;
	
	private String annescolaire;

	
	
	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Niveau(Long niveauID, Collection<Student> roles, String nomNiveau,
			String descriptionNiveau, Date dateDebut, Date dateFin,
			String annescolaire) {
		super();
		NiveauID = niveauID;
		this.roles = roles;
		this.nomNiveau = nomNiveau;
		DescriptionNiveau = descriptionNiveau;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.annescolaire = annescolaire;
	}

	@Override
	public String toString() {
		return "Niveau [NiveauID=" + NiveauID + ", roles=" + roles
				+ ", nomNiveau=" + nomNiveau + ", DescriptionNiveau="
				+ DescriptionNiveau + ", dateDebut=" + dateDebut + ", dateFin="
				+ dateFin + ", annescolaire=" + annescolaire + "]";
	}

	public Long getNiveauID() {
		return NiveauID;
	}

	public void setNiveauID(Long niveauID) {
		NiveauID = niveauID;
	}

	public Collection<Student> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Student> roles) {
		this.roles = roles;
	}

	public String getNomNiveau() {
		return nomNiveau;
	}

	public void setNomNiveau(String nomNiveau) {
		this.nomNiveau = nomNiveau;
	}

	public String getDescriptionNiveau() {
		return DescriptionNiveau;
	}

	public void setDescriptionNiveau(String descriptionNiveau) {
		DescriptionNiveau = descriptionNiveau;
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

	public String getAnnescolaire() {
		return annescolaire;
	}

	public void setAnnescolaire(String annescolaire) {
		this.annescolaire = annescolaire;
	}
	
	

}
