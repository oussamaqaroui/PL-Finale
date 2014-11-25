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
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FilID")
	private Long FilID;
	/*
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL) // eager parce qu'il ne trouve pas les role et cascade problème d'enregistrement des fils avant le père
	@JoinColumn(name="FilID")
	private Collection<Niveau> Niveaux;
	*/

	public Long getFilID() {
		return FilID;
	}

	public void setFilID(Long filID) {
		FilID = filID;	
	}
	
	

}
