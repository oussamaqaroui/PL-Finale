package com.PL.Spring.DAO;

import java.util.List;

import com.PL.Spring.Entities.Note;



public interface NoteDaoInt {
	
	
	void addNote(Note note);
	void editNote(Note note);
	void deleteLNote(Long noteID);
	Note  findNote(Long noteID);
	
	

}
