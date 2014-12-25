package com.PL.Spring.Entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;



@Embeddable
public class NoteID implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Student student;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Module module;


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Module getModule() {
		return module;
	}


	public void setModule(Module module) {
		this.module = module;
	}


	@Override
	public String toString() {
		return "NoteID [student=" + student + ", module=" + module + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((module == null) ? 0 : module.hashCode());
		result = prime * result + ((student == null) ? 0 : student.hashCode());
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
		NoteID other = (NoteID) obj;
		if (module == null) {
			if (other.module != null)
				return false;
		} else if (!module.equals(other.module))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}
	
	
	
	

}
