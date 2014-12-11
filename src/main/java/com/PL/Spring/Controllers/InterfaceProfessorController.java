package com.PL.Spring.Controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;






import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Module;
import com.PL.Spring.Entities.Professor;
import com.PL.Spring.Metier.UserServiceInt;



@Controller
@RequestMapping(value="interfaceProfessor")
public class InterfaceProfessorController {
	
	@Autowired
	private UserServiceInt metier;
	
	private static List<Module> modules;
	
	
	@RequestMapping(value="/modules")
	public String modules(Model model,Principal p){
		//Professor pr=metier.findProfessorByName(p.getName());
		//modules=metier.getAllModulesByProfessor(pr.getUser_id());
		
		//modules=metier.getAllModulesByProfessor(new Long(1));
		modules=metier.getAllModules();
		model.addAttribute("module", new Module());
		model.addAttribute("modules",modules);
		System.out.println(modules);
		
		return "modules";
	}
	
	@RequestMapping(value="/cours")
	public String cours(Model model,Principal p){
		//Professor pr=metier.findProfessorByName(p.getName());
		//modules=metier.getAllModulesByProfessor(pr.getUser_id());
		
		modules=metier.getAllModulesByProfessor(new Long(1));
		model.addAttribute("module", new Module());
		model.addAttribute("modules",modules);
		System.out.println(modules);
		
		return "modules";
	}

}
