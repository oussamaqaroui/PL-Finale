package com.PL.Spring.Entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FI_Master_DOC")
public class FI_M_D extends Filiere{


	
	@OneToMany 
	@JoinColumn(name="F_ID")
	private Collection<Niveau> Niveaux;

	public Collection<Niveau> getNiveaux() {
		return Niveaux;
	}

	public void setNiveaux(Collection<Niveau> niveaux) {
		Niveaux = niveaux;
	}

	public FI_M_D(Collection<Niveau> niveaux,Long f_ID, String title, String description,
					int nombreAnnee, Date dateCreation) {
				super(f_ID,title,description,nombreAnnee,dateCreation );
		Niveaux = niveaux;
	}
	
	public FI_M_D(){}

	@Override
	public String toString() {
		return "FI_M_D [Niveaux=" + Niveaux + "]";
	}
	
	
}
