package com.PL.Spring.Controllers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.PL.Spring.Comparator.StudentComparator;
import com.PL.Spring.Entities.Document;
import com.PL.Spring.Entities.Module;
import com.PL.Spring.Entities.Note;
import com.PL.Spring.Entities.Professor;
import com.PL.Spring.Entities.Student;
import com.PL.Spring.Entities.TypeNote;
import com.PL.Spring.Metier.UserServiceInt;





@Controller
@RequestMapping(value="InterfaceProfessorNotes")
public class InterfaceProfessorNotesController {
	
	
	
	@Autowired
	private UserServiceInt metier;
	
	
	private static List<Module> modules;
	private static List<Student> students;
	private static Module module;
	private static Professor prof;
	private static List<TypeNote> tns;
	
	
	@RequestMapping(value="/modules")
	public String modules(Model model,Principal p){
		
		System.out.println("principal nom :"+p.getName());
		Professor pr=metier.findProfessorByName(p.getName());
		
		System.out.println("principal nom :"+p.getName());
		
		//modules=metier.getAllModulesByProfessor(pr.getUser_id());
		
		modules=new ArrayList<Module>(pr.getModules());
		
		
		//modules=metier.getAllModulesByProfessor(new Long(1));
		//modules=metier.getAllModules();
		
		
		
		
		model.addAttribute("module", new Module());
		model.addAttribute("modules",modules);
		System.out.println(modules);
		
		return "modulesnotes";
	}
	
	
	@RequestMapping(value="/Notes")
	public String cours(Model model,Principal p,long moduleID,HttpServletRequest request){
		
		System.out.println("\n\n\n***********************************\n\n\n");
		
		
		Module m=metier.findModule(moduleID);
		
		
		tns=metier.getTypeNoteByModule(m);

		List<TypeNote> tnstmp=metier.getAllTypeNote();
		
		
		System.out.println("\n\n\n Type Notes  :"+tns);
		System.out.println("\n\n\n Type Notes [All]  :"+tnstmp);
		
		int nbr=0;
		if(tns.get(0).getNotes().size()!=0)
		{
			nbr=tns.get(0).getNotes().size();
		}
		//tns.get(0)m.getNotes().
		Iterator<Note> it=tns.get(0).getNotes().iterator();
		//it.
		
		List<Student> studs=new ArrayList<Student>();
		
		while (it.hasNext())
		{
			studs.add(it.next().getStudent());
		}
		//studs.get(0).getUser_id();
		
		
		
		
		TypeNote tno=tns.get(0);
		//tno.getNotes().
		
		
		
		Collections.sort(studs, new StudentComparator());
		
		model.addAttribute("studs", studs);
		model.addAttribute("lignes", nbr);
		model.addAttribute("type", tns);
		model.addAttribute("module", m);
		model.addAttribute("note", new Note());
		model.addAttribute("prof", p);

		return "notes";
	}
	
	@RequestMapping(value="photoStudent",produces=MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public  byte[] photoUser(Long userID) throws IOException{
		//Comment afficher une image
		Student e=metier.findStudent(userID);
		
		
		return IOUtils.toByteArray(new ByteArrayInputStream(e.getPhoto()));
	}
	

}
