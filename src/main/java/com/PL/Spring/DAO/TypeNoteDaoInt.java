package com.PL.Spring.DAO;

import java.util.List;





import com.PL.Spring.Entities.Module;
import com.PL.Spring.Entities.TypeNote;

public interface TypeNoteDaoInt {

	
	
	void addTypeNote(TypeNote type);
	void editTypeNote(TypeNote type);
	void deleteTypeNote(Long typeId);
	TypeNote findTypeNote(Long typeId);
	List<TypeNote> getAllTypeNote();
	List<TypeNote> getTypeNoteByModule(Module m);
	
}
