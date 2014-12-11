package com.PL.Spring.Entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Document")
//@PrimaryKeyJoinColumn(name="doc_id")
public class Document implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1461621553597764403L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDoc;
	public Long getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(Long idDoc) {
		this.idDoc = idDoc;
	}

	@NotEmpty
	private String nom;
	@Lob
	private byte[] fichier;
	
	private Document correction;
	
	private Date datedoc;

	public Date getDatedoc() {
		return datedoc;
	}

	public void setDatedoc(Date datedoc) {
		this.datedoc = datedoc;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public byte[] getFichier() {
		return fichier;
	}

	public void setFichier(byte[] fichier) {
		this.fichier = fichier;
	}
	@OneToOne
	public Document getCorrection() {
		return correction;
	}

	public void setCorrection(Document correction) {
		this.correction = correction;
	}



	public Document(Long idDoc, String nom, byte[] fichier,
			Document correction, Date datedoc) {
		super();
		this.idDoc = idDoc;
		this.nom = nom;
		this.fichier = fichier;
		this.correction = correction;
		this.datedoc = datedoc;
	}

	@Override
	public String toString() {
		return "Document [idDoc=" + idDoc + ", nom=" + nom + ", fichier="
				+ Arrays.toString(fichier) + ", correction=" + correction
				+ ", datedoc=" + datedoc + "]";
	}

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
