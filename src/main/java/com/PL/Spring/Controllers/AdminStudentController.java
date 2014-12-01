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
import com.PL.Spring.Entities.Student;
import com.PL.Spring.Metier.UserServiceInt;

@Controller
@RequestMapping(value="studentUsers")
public class AdminStudentController {

		@Autowired
		private UserServiceInt metier;
			
		private static List<Student> studs; // Pour avoir la liste a afficher
		private static Map<String,Object> props; 
		
		
		//Première page on récupère tout les admins
		@RequestMapping(value="/index")
		public String Index(Model model){
			studs=metier.getAllStudents();
			model.addAttribute("stud", new Admin());
			model.addAttribute("studs",studs);
			return "studs";
		}
		
		// Formulaire : on apuie sur le bouton getAll on récupère tous les admins
		@RequestMapping(value="/saveStud",params="getAll")
		public String afficherTousLesAdmins(Model model){
			studs=metier.getAllStudents();
			props=null;
			model.addAttribute("stud", new Admin());
			model.addAttribute("studs",studs);
			return "studs";
		}
		
		@RequestMapping(value="/suppStudent")
		public String supp(long userID,Model model){
			
			metier.deleteAdmin(userID);
			if(props==null)studs=metier.getAllStudents();
			else studs=metier.findStudentByProps(props);
			model.addAttribute("stud", new Admin());	
			model.addAttribute("studs",studs);
			return "studs";
		}
		@RequestMapping(value="/editStudent")
		public String edit(long userID,Model model){
			Student u=metier.findStudent(userID);
			model.addAttribute("stud", u);	
			model.addAttribute("studs",studs);
			return "studs";
		}
		
		@RequestMapping(value="/saveStud",params="save")
		public String saveUser(Student u,BindingResult bindingResult,Model model,MultipartFile file) throws IOException{
			
			
			if(!file.isEmpty()){
				//String path=System.getProperty("java.io.tmpdir");
				BufferedImage bi=ImageIO.read(file.getInputStream());
				u.setPhoto(file.getBytes());
				Long idP=null;
				if(u.getUser_id() == null){
					u.setDateCreation(new Date());	
					metier.addStudent(u);
				}
				else{
					u.setDateModification(new Date());
				  metier.editStudent(u);
				  
				}
				//file.transferTo(new File(path+"/"+"PROD_"+idP+"_"+file.getOriginalFilename()));
			}
			else{
				if(u.getUser_id()==null)
				{
					u.setDateCreation(new Date());
					metier.addStudent(u);
					
				}
				else 
				{
					u.setDateModification(new Date());
					metier.editStudent(u);
				}
			}
			
			
			if(props==null)studs=metier.getAllStudents();
			//else studs=metier.finStudentByProps(props);
			
			model.addAttribute("stud", new Admin());	
			model.addAttribute("studs",studs);
			return "studs";
		}
	    
		@RequestMapping(value="photoStudent",produces=MediaType.IMAGE_JPEG_VALUE)
		@ResponseBody
		public  byte[] photoUser(Long userID) throws IOException{
			//Comment afficher une image
			Student e=metier.findStudent(userID);
			
			
			return IOUtils.toByteArray(new ByteArrayInputStream(e.getPhoto()));
		}
		
		@RequestMapping(value="/saveStud",params="find")
		public String findUsers(Student u,BindingResult bindingResult,Model model,MultipartFile file) throws IOException{
			
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
				props.put("actived",u.isActived());
				
				
				
			}
			studs=metier.findStudentByProps(props);
			model.addAttribute("stud", new Student());	
			model.addAttribute("studs",studs);
			return "studs";
		}
	}


