package com.PL.Spring.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FI_Master_DOC")
public class FI_M_D extends Filiere{


	/*
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL) // eager parce qu'il ne trouve pas les role et cascade problème d'enregistrement des fils avant le père
	@JoinColumn(name="F_ID")
	private Collection<Niveau> Niveaux;
	*/

	
	
}
