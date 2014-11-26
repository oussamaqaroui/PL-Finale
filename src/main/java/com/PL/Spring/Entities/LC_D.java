package com.PL.Spring.Entities;

import java.util.Collection;

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

@Entity
@Table(name="Licence_Deust")
public class LC_D extends Filiere{
	
	
	
	@OneToMany 
	@JoinColumn(name="F_ID")
	private Collection<Niveau> Niveaux;

	public Collection<Niveau> getNiveaux() {
		return Niveaux;
	}

	public void setNiveaux(Collection<Niveau> niveaux) {
		Niveaux = niveaux;
	}

	@Override
	public String toString() {
		return "LC_D [Niveaux=" + Niveaux + "]";
	}

	public LC_D(Collection<Niveau> niveaux) {
		super();
		Niveaux = niveaux;
	}
	
	public LC_D(){}

	

}
