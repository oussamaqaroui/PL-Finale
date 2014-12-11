package com.PL.Spring.Controllers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.Principal;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;







import org.springframework.web.bind.annotation.ResponseBody;

import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Document;
import com.PL.Spring.Entities.Module;
import com.PL.Spring.Entities.Professor;
import com.PL.Spring.Metier.UserServiceInt;



@Controller
@RequestMapping(value="interfaceProfessor")
public class InterfaceProfessorController {
	
	@Autowired
	private UserServiceInt metier;
	
	private static List<Module> modules;
	private static List<Document> docs;
	
	
	@RequestMapping(value="/modules")
	public String modules(Model model,Principal p){
		//Professor pr=metier.findProfessorByName(p.getName());
		//modules=metier.getAllModulesByProfessor(pr.getUser_id());
		
		modules=metier.getAllModulesByProfessor(new Long(1));
		//modules=metier.getAllModules();
		model.addAttribute("module", new Module());
		model.addAttribute("modules",modules);
		System.out.println(modules);
		
		return "modules";
	}
	
	@RequestMapping(value="/Documents")
	public String cours(Model model,Principal p,long moduleID){
		//Professor pr=metier.findProfessorByName(p.getName());
		//modules=metier.getAllModulesByProfessor(pr.getUser_id());
		Module m=metier.findModule(moduleID);
		docs=(List<Document>) m.getDocs();
		//modules=metier.getAllModulesByProfessor(new Long(1));
		model.addAttribute("prof", p);
		model.addAttribute("module", m);
		model.addAttribute("documents",docs);
		System.out.println(docs);
		
		return "documents";
	}
	
	
	@RequestMapping(value="downloadfile",produces=MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public  byte[] downloadfile(Long docID) throws IOException{
		//Comment afficher une image
		//Admin e=metier.findAdmin(userID);
		
		//if(e.getPhoto()!=null)
		//return IOUtils.toByteArray(new ByteArrayInputStream(e.getPhoto()));
		
		//else 
			return null;
	

}
}
