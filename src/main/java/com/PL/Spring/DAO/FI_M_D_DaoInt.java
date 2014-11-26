package com.PL.Spring.DAO;

import java.util.List;


import com.PL.Spring.Entities.FI_M_D;

public interface FI_M_D_DaoInt {
	
	void addFI_M_D(FI_M_D F);
	void editFI_M_D(FI_M_D F);
	void deleteFI_M_D(Long F_ID);
	FI_M_D  findFI_M_D(Long F_ID);
	FI_M_D findFI_M_D_ByTitle(String FiName);
	List<FI_M_D> getAllFI_D_M();

}
