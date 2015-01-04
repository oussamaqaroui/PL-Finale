package com.PL.Spring.Comparator;

import java.util.Comparator;

import com.PL.Spring.Entities.Note;

public class CustomComparator implements Comparator<Note> {

	@Override
	public int compare(Note n1, Note n2) {
		
		return n1.getStudent().getUser_id().compareTo(n2.getStudent().getUser_id());
	}
	

}
