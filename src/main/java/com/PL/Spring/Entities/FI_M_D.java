package com.PL.Spring.Entities;

import java.util.Collection;

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
	

	
	
}
