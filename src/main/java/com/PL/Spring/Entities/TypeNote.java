package com.PL.Spring.Entities;

import java.util.HashSet;
import java.util.Set;

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
@Table(name="TypeNote")
public class TypeNote implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TypeID")
	private Long TypeID;
	
	
	@OneToMany(fetch= FetchType.EAGER , cascade=CascadeType.ALL)
	@JoinColumn(name="pk")
	private Set<Note> notes=new HashSet<Note>(0);
	
	
    @NotEmpty
	private String nomType;
	

	private Long pourcentage;

	public Long getTypeID() {
		return TypeID;
	}

	public void setTypeID(Long typeID) {
		TypeID = typeID;
	}

	public Set<Note> getNotes() {
		return notes;
	}

	public void setNotes(Set<Note> notes) {
		this.notes = notes;
	}

	public String getNomType() {
		return nomType;
	}

	public void setNomType(String nomType) {
		this.nomType = nomType;
	}

	public Long getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Long pourcentage) {
		this.pourcentage = pourcentage;
	}


	

	
	
	
	
	

	@Override
	public String toString() {
		return "TypeNote [TypeID=" + TypeID + ", notes=" + notes + ", nomType="
				+ nomType + ", pourcentage=" + pourcentage + "]";
	}

	public TypeNote(Long typeID, Set<Note> notes, String nomType,
			Long pourcentage) {
		super();
		TypeID = typeID;
		this.notes = notes;
		this.nomType = nomType;
		this.pourcentage = pourcentage;
	}

	public TypeNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TypeID == null) ? 0 : TypeID.hashCode());
		result = prime * result + ((nomType == null) ? 0 : nomType.hashCode());
		//result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result
				+ ((pourcentage == null) ? 0 : pourcentage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeNote other = (TypeNote) obj;
		if (TypeID == null) {
			if (other.TypeID != null)
				return false;
		} else if (!TypeID.equals(other.TypeID))
			return false;
		if (nomType == null) {
			if (other.nomType != null)
				return false;
		} else if (!nomType.equals(other.nomType))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		if (pourcentage == null) {
			if (other.pourcentage != null)
				return false;
		} else if (!pourcentage.equals(other.pourcentage))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
