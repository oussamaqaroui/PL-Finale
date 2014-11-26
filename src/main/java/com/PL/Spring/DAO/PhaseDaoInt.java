package com.PL.Spring.DAO;

import java.util.List;

import com.PL.Spring.Entities.Phase;



public interface PhaseDaoInt {

	void addPhase(Phase phase);
	void editPhase(Phase phase);
	void deletePhase(Long phaseID);
	Phase  findPhase(Long phaseID);
	Phase  findPhaseByName(String nomPhase);
	List<Phase> getAllPhase();
}
