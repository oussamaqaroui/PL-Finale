package com.PL.Spring.Entities;

import java.beans.Transient;
import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "note")
@AssociationOverrides({
	@AssociationOverride(name = "pk.student", 
		joinColumns = @JoinColumn(name = "user_id")),
	@AssociationOverride(name = "pk.module", 
		joinColumns = @JoinColumn(name = "moduleID")),
	@AssociationOverride(name = "pk.type", 
		joinColumns = @JoinColumn(name = "TypeID"))})
public class Note implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@EmbeddedId
	private NoteID pk =new NoteID();
	
	Double valeur;

	
	
	

	
	


	public NoteID getPk() {
		return pk;
	}

	public void setPk(NoteID pk) {
		this.pk = pk;
	}

	public Double getValeur() {
		return valeur;
	}

	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}


	
	
	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pk == null) ? 0 : pk.hashCode());
		result = prime * result + ((valeur == null) ? 0 : valeur.hashCode());
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
		Note other = (Note) obj;
		if (pk == null) {
			if (other.pk != null)
				return false;
		} else if (!pk.equals(other.pk))
			return false;
		if (valeur == null) {
			if (other.valeur != null)
				return false;
		} else if (!valeur.equals(other.valeur))
			return false;
		return true;
	}



	public Note(NoteID pk, Double valeur) {
		super();
		this.pk = pk;
		this.valeur = valeur;
	}

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	} 




	

	@Override
	public String toString() {
		return "Note [pk=" + pk + ", valeur=" + valeur + "]";
	}

	@Transient
	public Student getStudent()
	{
		return this.pk.getStudent();
	}
	
	public void setStudent(Student s)
	{
		this.pk.setStudent(s);
	}
	
	@Transient
	public Module getModule()
	{
		return this.pk.getModule();
	}
	
	public void setModule(Module m)
	{
		this.pk.setModule(m);
	}
	
	@Transient
	public TypeNote getType()
	{
		return this.pk.getType();
	}
	
	public void setType(TypeNote tn)
	{
		this.pk.setType(tn);
	}


	
	
	
	
}
