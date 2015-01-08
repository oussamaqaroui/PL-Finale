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
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.PL.Spring.Comparator.StudentComparator;
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
		
		request.getSession().setAttribute("mod",m);
		request.getSession().setAttribute("studs",studs);
		
		
		
		
		Collections.sort(studs, new StudentComparator());
		
		model.addAttribute("studs", studs);
		//model.addAttribute("lignes", nbr);
		model.addAttribute("type", tns);
		model.addAttribute("module", m);
		//model.addAttribute("note", new Note());
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
	
	
	

	
	@RequestMapping(value="/saveNote")
	public String saveNote(Model model,Principal p,@RequestParam(value = "nomtype")String nomtype,@RequestParam(value = "pourcentage")  String pourcentage,@RequestParam(value = "listNotes") String[] listnotes,@RequestParam(value = "idStudent") String[] idstudents,HttpServletRequest request)
	{
		Module m = (Module)request.getSession().getAttribute("mod");
		List<Student> studs=new ArrayList<Student>();
		studs=(List<Student>)request.getSession().getAttribute("studs");
		
		
		
	
		System.out.println("\n \n \n nom  : "+nomtype );
		System.out.println("\n  pourcentage  : "+pourcentage );
		System.out.println("\n  notes  : "+listnotes[0] );
		System.out.println("\n  id student  : "+idstudents[0] );
		System.out.println("\n  module  : "+m.getNomModule() );
		System.out.println("\n  stud 1  : "+studs.get(0).getNom() );
		
		
		
		TypeNote tn=new TypeNote();
		tn.setNomType(nomtype);
		tn.setPourcentage(Long.valueOf(pourcentage));
		
		metier.addTypeNote(tn);
		
		Student s;
		Note n;
		for(int i=0;i<idstudents.length;i++)
		{
			s=metier.findStudent(Long.valueOf(idstudents[i]));
			n=new Note();
			n.setValeur(Double.valueOf(listnotes[i]));
			n.setModule(m);
			n.setStudent(s);
			n.setType(tn);
			
			s.getNotes().add(n);
			m.getNotes().add(n);
			tn.getNotes().add(n);
			   
			metier.editModule(m);
			metier.editStudent(s);
		    metier.editTypeNote(tn);
		    
			
		}
		
		
		tns=metier.getTypeNoteByModule(m);
	
		//m.getmo
		model.addAttribute("studs", studs);
		model.addAttribute("type", tns);
		model.addAttribute("module", m);
		model.addAttribute("prof", p);
		
		return "notes";
	}
	
	@RequestMapping("/delet")
    public String delet(Long typeId, HttpServletResponse response,Principal p,HttpServletRequest request) {

		//TypeNote tn=metier.findTypeNote(typeId);
		metier.deleteTypeNote(typeId);
		
		
		return "notes";
	}
	
	
	
	@RequestMapping(value="/updateNote")
	public String updateNote(Model model,Principal p,@RequestParam(value = "noteedit")String noteedit,@RequestParam(value = "idstudent")  String idstudent,@RequestParam(value = "idtype") String idtype,HttpServletRequest request)
	{
		
		Module m = (Module)request.getSession().getAttribute("mod");
		List<Student> studs=new ArrayList<Student>();
		studs=(List<Student>)request.getSession().getAttribute("studs");
		
		Long idt=new Long(idtype);
		Long ids=new Long(idstudent);
		
		Student s=metier.findStudent(ids);
		TypeNote tn=metier.findTypeNote(idt);
		
		
		System.out.println("\n \n \n note  : "+noteedit );
		System.out.println("\n id etudinant  : "+s.getNom() );
		System.out.println("\n id idtype  : "+tn.getNomType() );
		System.out.println("\n id module  : "+m.getNomModule() );
		
		Iterator<Note> it=tn.getNotes().iterator();
		Note n=new Note();
		boolean b=false;
		while(it.hasNext())
		{
			n=it.next();
			if(n.getModule().getModuleID().longValue()==m.getModuleID().longValue() && n.getStudent().getUser_id().longValue()==s.getUser_id().longValue() && n.getType().getTypeID()==tn.getTypeID().longValue())
			{
				b=true;
				//it.next().setValeur(new Double(noteedit));
				break;
				
			}
		}
		if(b)
		{
			n.setValeur(new Double(noteedit));
			metier.editNote(n);
		}
		
		
		tns=metier.getTypeNoteByModule(m);
		
		model.addAttribute("studs", studs);
		model.addAttribute("type", tns);
		model.addAttribute("module", m);
		model.addAttribute("prof", p);
		
		return "notes";
	}
	
	@RequestMapping(value="/updateTN")
	public String updatetn(Model model,Principal p,@RequestParam(value = "nomtype")String nomtype,@RequestParam(value = "idtypeedit")  String idtypeedit,@RequestParam(value = "pourcentageedit") String pourcentageedit,HttpServletRequest request)
	{
		Module m = (Module)request.getSession().getAttribute("mod");
		List<Student> studs=new ArrayList<Student>();
		studs=(List<Student>)request.getSession().getAttribute("studs");
		
		
		Long idt=new Long(idtypeedit);
		String nom=nomtype;
		TypeNote tn=metier.findTypeNote(idt);
	    Long pr=new Long(pourcentageedit);
	    tn.setNomType(nom);
	    tn.setPourcentage(pr);
	    metier.editTypeNote(tn);
	    
	    System.out.println("\n \n \nType note nom  : "+nom );
	    
	    tns=metier.getTypeNoteByModule(m);
		
		model.addAttribute("studs", studs);
		model.addAttribute("type", tns);
		model.addAttribute("module", m);
		model.addAttribute("prof", p);
		return"notes";
	}
	

}
