package com.PL.Spring.Controllers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Principal;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;







import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
	public String cours(Model model,Principal p,long moduleID,HttpServletRequest request){
		//Professor pr=metier.findProfessorByName(p.getName());
		//modules=metier.getAllModulesByProfessor(pr.getUser_id());
		Module m=metier.findModule(moduleID);
		docs= new ArrayList<Document>(m.getDocs());
		//modules=metier.getAllModulesByProfessor(new Long(1));
		
		request.getSession().setAttribute("mod",m);
		
		//ShoppingCart cart = (ShoppingCart)request.getSession().setAttribute("cart",value);
		
		
		
		
		
		model.addAttribute("document", new Document());
		model.addAttribute("prof", p);
		model.addAttribute("module", m);
		model.addAttribute("documents",docs);
		System.out.println(docs);
		
		return "documents";
	}
	
	
	
	
	
	
	
	@RequestMapping(value="/saveFile")
	public String save(Document d,BindingResult bindingResult,Model model,Principal p,@RequestParam("fichier") MultipartFile fichier,HttpServletRequest request) {
		
		
		Module m = (Module)request.getSession().getAttribute("mod");
		
		
		System.out.println("\n \n Module :"+m.getNomModule());
		System.out.println("desc :"+d.getDescription());
		System.out.println("File :"+fichier.getName());
		System.out.println("ContentType:" + fichier.getContentType()+"\n \n ");
		
		
		try {
            Blob blob = Hibernate.createBlob(fichier.getInputStream());
 
            d.setNom((fichier.getOriginalFilename()));
            d.setFichier(blob);
            d.setType(fichier.getContentType());
            d.setDatedoc(new Date());
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		metier.addDocument(d);
		m.getDocs().add(d);
		metier.editModule(m);
		
		docs=new ArrayList<Document>(m.getDocs());
		
		model.addAttribute("document", new Document());
		model.addAttribute("prof", p);
		model.addAttribute("module", m);
		model.addAttribute("documents",docs);
		return "documents";
		
	}
	
	
	@RequestMapping("/download")
    public String download(Long documentId,Model model, HttpServletResponse response,Principal p) {
		
		Document d=metier.findDocument(documentId);
		
		
		try {
            response.setHeader("Content-Disposition", "inline;filename=\"" +d.getNom()+ "\"");
            OutputStream out = response.getOutputStream();
            response.setContentType(d.getType());
            IOUtils.copy(d.getFichier().getBinaryStream(), out);
            out.flush();
            out.close();
         
		} catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	
		return "documents";
	}
	
	
	@RequestMapping("/delet")
    public String delet(Long docId,Model model, HttpServletResponse response,Principal p,HttpServletRequest request) {
		
		Module m = (Module)request.getSession().getAttribute("mod");
		Document d =metier.findDocument(docId);
		
	
		//m.getDocs().remove(d);
		//metier.editModule(m);
		Long id= m.getModuleID();
		metier.deleteLDocument(docId,m.getModuleID());
		//m=metier.findModule(id);
		
		/*List<Document> docprov;
		
		docprov=(List<Document>) m.getDocs();
		
		System.out.println("\n \n avant \n:"+docprov);
		
		
		 
			List<Document> toRemove = new ArrayList<Document>();
		
		for(Document a:docprov)
		{
			if(a.getIdDoc()!=d.getIdDoc())
			{
				System.out.println("to remove : "+a+"  id a ="+a.getIdDoc()+ " id docs "+d.getIdDoc() );
				toRemove.add(a);
				//iter.remove();
			}
		}
		*/
		//docprov.removeAll(toRemove);
		
		//docprov.remove(d);
		//System.out.println("\n \n après \n:"+toRemove);
		
		
		
		//metier.editModule(m);
		m=metier.findModule(id);
		docs=new ArrayList<Document>(m.getDocs());
		
		model.addAttribute("document", new Document());
		model.addAttribute("prof", p);
		model.addAttribute("module", m);
		model.addAttribute("documents",docs);
		return "documents";
		//return "modules";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/saveeeFile")
	public String savFile(Document d,BindingResult bindingResult,Model model,Principal p) throws IOException{
		
		 /*InputStream inputStream = null;  
		  OutputStream outputStream = null; 
		  
		  MultipartFile f = d.getFichier();  
		  System.out.println("\n \n file name  :"+f.getOriginalFilename()+"  getname "+d.getFichier().getName()+"\n \n");
		  d.setNom(d.getFichier().getOriginalFilename());
		  System.out.println("\n \n file name  (obj)"+d.getNom()+"\n \n");
		  //fileValidator.validate(uploadedFile, result);  
		 // docs=(List<Document>) m.getDocs();
		  //String fileName = file.getOriginalFilename(); 
		
		  
		  
		  
		  try {  
			   inputStream = d.getFichier().getInputStream();  
			  
			   File newFile = new File("C:/Users/Aymane/Desktop/filetest/" + d.getFichier().getOriginalFilename());  
			   if (!newFile.exists()) {  
			    newFile.createNewFile();  
			   }  
			   outputStream = new FileOutputStream(newFile);  
			   int read = 0;  
			   byte[] bytes = new byte[1024];  
			  
			   while ((read = inputStream.read(bytes)) != -1) {  
			    outputStream.write(bytes, 0, read);  
			   }  
			   
			   
			   
			   
			   
			  } catch (IOException e) {  
			   // TODO Auto-generated catch block  
			   e.printStackTrace();  
			  } 
		  
		  metier.addDocument(d);
		  
		  model.addAttribute("document", new Document());
		  model.addAttribute("prof", p);
			//model.addAttribute("module", m);
			model.addAttribute("documents",docs);*/
		  
			return "documents";
	}
	
}
