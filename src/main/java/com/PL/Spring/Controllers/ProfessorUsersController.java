package com.PL.Spring.Controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.imageio.ImageIO;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Professor;
import com.PL.Spring.Metier.UserServiceInt;





@Controller
@RequestMapping(value="professorUsers")
public class ProfessorUsersController {
	
	
	@Autowired
	private UserServiceInt metier;
	
	
	private static List<Professor> professors; // Pour avoir la liste a afficher
	private static Map<String,Object> props; 
	
	
	
	@RequestMapping(value="/index")
	public String Index(Model model){
		professors=metier.getAllProfessors();
		model.addAttribute("professor", new Professor());
		model.addAttribute("professors",professors);
		
		return "professors";
	}
	
	
	// Formulaire : on apuie sur le bouton getAll on récupère tous les admins
		@RequestMapping(value="/saveProfessor",params="getAll")
		public String afficherTousLesProfesseurs(Model model){
			professors=metier.getAllProfessors();
			props=null;
			model.addAttribute("professor", new Professor());
			model.addAttribute("professors",professors);
			return "professors";
		}
		
		
		@RequestMapping(value="/suppProfessor")
		public String supp(long userID,Model model){
			
			metier.deleteProfessor(userID);
			if(props==null)professors=metier.getAllProfessors();
			else professors=metier.finProfessorByProps(props);
			model.addAttribute("professor", new Professor());
			model.addAttribute("professors",professors);
			return "professors";
		}
		
		@RequestMapping(value="/editProfessor")
		public String edit(long userID,Model model){
			Professor p=metier.findProfessor(userID);
			
			model.addAttribute("professor", p);
			model.addAttribute("professors",professors);
			return "professors";
		}
		
	
		
		
		@RequestMapping(value="/saveProfessor",params="save")
		public String saveProfessor(Professor p,BindingResult bindingResult,Model model,MultipartFile file) throws IOException{
			
			
			if(!file.isEmpty()){
				//String path=System.getProperty("java.io.tmpdir");
				BufferedImage bi=ImageIO.read(file.getInputStream());
				p.setPhoto(file.getBytes());
				Long idP=null;
				if(p.getUser_id() == null){
					p.setDateCreation(new Date());	
					metier.addProfessor(p);
				}
				else{
					p.setDateModification(new Date());
				  metier.editProfessor(p);
				  
				}
				//file.transferTo(new File(path+"/"+"PROD_"+idP+"_"+file.getOriginalFilename()));
			}
			else{
				if(p.getUser_id()==null)
				{
					p.setDateCreation(new Date());
					metier.addProfessor(p);
					
				}
				else 
				{
					p.setDateModification(new Date());
					metier.editProfessor(p);
				}
			}
			
			
			if(props==null)professors=metier.getAllProfessors();
			else professors=metier.finProfessorByProps(props);
			
			model.addAttribute("professor", new Professor());
			model.addAttribute("professors",professors);
			return "professors";
		}
	    
		@RequestMapping(value="photoProfessor",produces=MediaType.IMAGE_JPEG_VALUE)
		@ResponseBody
		public  byte[] photoUser(Long userID) throws IOException{
			//Comment afficher une image
			Professor p=metier.findProfessor(userID);
			
			
			return IOUtils.toByteArray(new ByteArrayInputStream(p.getPhoto()));
		}
		
		@RequestMapping(value="/saveProfessor",params="find")
		public String findUsers(Professor u,BindingResult bindingResult,Model model,MultipartFile file) throws IOException{
			
			props=new TreeMap<String,Object>();
			
			if(u.getUser_id()!=null) props.put("user_id", u.getUser_id());
			else
			{
				if(u.getUser_name()!=null && !u.getUser_name().equals(""))props.put("user_name",u.getUser_name());
				if(u.getNom()!=null && !u.getNom().equals(""))props.put("nom", u.getNom());
				if(u.getPrenom()!=null && !u.getPrenom().equals(""))props.put("prenom",u.getPrenom());
				if(u.getEmail()!=null && !u.getEmail().equals(""))props.put("email",u.getEmail());
				if(u.getDateNaissance()!=null && !u.getDateNaissance().equals("")) 
					props.put("dateNaissance", u.getDateNaissance());
				if(u.getAdresse()!=null && !u.getAdresse().equals("")) props.put("adresse", u.getAdresse());
				//if(u.getActive()==true)props.put("active", 1);
				props.put("actived",u.isActived());
				
				
				
			}
			professors=metier.finProfessorByProps(props);
			model.addAttribute("professor", new Professor());
			model.addAttribute("professors",professors);
			return "professors";
		}

}
