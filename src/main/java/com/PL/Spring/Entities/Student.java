package com.PL.Spring.Entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Students")
@PrimaryKeyJoinColumn(name="user_id")
public class Student extends User implements Serializable {
	
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

	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pk.student",orphanRemoval=true, cascade = 
	    {CascadeType.PERSIST, CascadeType.MERGE})
	    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, 
	    })
	private Set<Note> absences=new HashSet<Note>(0);
	
	
	
	@ManyToMany(fetch= FetchType.EAGER , cascade=CascadeType.ALL)
	@JoinTable(name = "niveaux_students",  joinColumns = { 
			@JoinColumn(name = "user_id", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "NiveauID", 
					nullable = false, updatable = false) })
	private Set<Niveau> Niveaux;



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



	public Set<Note> getAbsences() {
		return absences;
	}



	public void setAbsences(Set<Note> absences) {
		this.absences = absences;
	}



	public Set<Niveau> getNiveaux() {
		return Niveaux;
	}



	public void setNiveaux(Set<Niveau> niveaux) {
		Niveaux = niveaux;
	}



/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Niveaux == null) ? 0 : Niveaux.hashCode());
		result = prime * result
				+ ((absences == null) ? 0 : absences.hashCode());
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result
				+ ((dateCreation == null) ? 0 : dateCreation.hashCode());
		result = prime
				* result
				+ ((dateModification == null) ? 0 : dateModification.hashCode());
		result = prime * result
				+ ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + Arrays.hashCode(photo);
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}*/



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Niveaux == null) {
			if (other.Niveaux != null)
				return false;
		} else if (!Niveaux.equals(other.Niveaux))
			return false;
		if (absences == null) {
			if (other.absences != null)
				return false;
		} else if (!absences.equals(other.absences))
			return false;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (dateCreation == null) {
			if (other.dateCreation != null)
				return false;
		} else if (!dateCreation.equals(other.dateCreation))
			return false;
		if (dateModification == null) {
			if (other.dateModification != null)
				return false;
		} else if (!dateModification.equals(other.dateModification))
			return false;
		if (dateNaissance == null) {
			if (other.dateNaissance != null)
				return false;
		} else if (!dateNaissance.equals(other.dateNaissance))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (!Arrays.equals(photo, other.photo))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Student [nom=" + nom + ", prenom=" + prenom + ", email="
				+ email + ", photo=" + Arrays.toString(photo)
				+ ", dateNaissance=" + dateNaissance + ", adresse=" + adresse
				+ ", dateCreation=" + dateCreation + ", dateModification="
				+ dateModification + ", absences=" + absences + ", Niveaux="
				+ Niveaux + "]";
	}



	public Student(String nom, String prenom, String email, byte[] photo,
			Date dateNaissance, String adresse, Date dateCreation,
			Date dateModification, Set<Note> absences, Set<Niveau> niveaux) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.absences = absences;
		Niveaux = niveaux;
	}



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(String username, String password, boolean actived) {
		super(username, password, actived);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}

	
	
	