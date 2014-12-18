package com.PL.Spring.Entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Students")
@PrimaryKeyJoinColumn(name="user_id")
public class Student extends User implements Serializable {
	@Override
	public String toString() {
		return "Student [nom=" + nom + ", prenom=" + prenom + ", email="
				+ email + ", photo=" + Arrays.toString(photo)
				+ ", dateNaissance=" + dateNaissance + ", adresse=" + adresse
				+ ", dateCreation=" + dateCreation + ", dateModification="
				+ dateModification + "]";
	}

	private static final long serialVersionUID = -3939879473294951527L;
	
	
	@NotEmpty
	private String nom;
	@NotEmpty
	private String prenom;
	@NotEmpty
	private String email;
	@Lob
	private byte[] photo;
	
	private Date dateNaissance;
	
	private String adresse;
	
	private Date dateCreation;
	
	private Date dateModification;

	@ManyToMany(fetch= FetchType.EAGER , cascade=CascadeType.ALL)
	@JoinTable(name = "niveaux_students",  joinColumns = { 
			@JoinColumn(name = "user_id", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "NiveauID", 
					nullable = false, updatable = false) })
	private Set<Niveau> Niveaux;
	
	public Set<Niveau> getNiveaux() {
		return Niveaux;
	}

	public void setNiveaux(Set<Niveau> niveaux) {
		Niveaux = niveaux;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public Student(String username, String password, boolean actived,String nom, String prenom, String email, byte[] photo,
			Date dateNaissance, String adresse, Date dateCreation,
			Date dateModification) {
		super(username, password, actived);
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}

	
	
	