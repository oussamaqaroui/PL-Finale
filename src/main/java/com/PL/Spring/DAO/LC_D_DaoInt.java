package com.PL.Spring.DAO;

import java.util.List;


import com.PL.Spring.Entities.LC_D;

public interface LC_D_DaoInt {
	
	void addLC_D(LC_D L);
	void editLC_D(LC_D F);
	void deleteLC_D(Long F_ID);
	LC_D  findLC_D(Long F_ID);
	LC_D findLC_DByTitle(String FiName);
	List<LC_D> getAllLC_D();

}
