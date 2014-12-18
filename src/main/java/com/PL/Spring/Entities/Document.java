package com.PL.Spring.Entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

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
	
	private String type;
	
	private String description;
	
	private String nom;
	@Lob
	 private Blob fichier;
	
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

	
	@OneToOne
	public Document getCorrection() {
		return correction;
	}

	public void setCorrection(Document correction) {
		this.correction = correction;
	}



	public Document(Long idDoc, String type, String description, String nom,
			Blob fichier, Document correction, Date datedoc) {
		super();
		this.idDoc = idDoc;
		this.type = type;
		this.description = description;
		this.nom = nom;
		this.fichier = fichier;
		this.correction = correction;
		this.datedoc = datedoc;
	}

	@Override
	public String toString() {
		return "Document [idDoc=" + idDoc + ", type=" + type + ", description="
				+ description + ", nom=" + nom + ", fichier=" + fichier
				+ ", correction=" + correction + ", datedoc=" + datedoc + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Blob getFichier() {
		return fichier;
	}

	public void setFichier(Blob fichier) {
		this.fichier = fichier;
	}

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
