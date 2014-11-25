package com.PL.Spring.Controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Metier.UserServiceInt;



@Controller
@RequestMapping(value="adminUsers")
public class AdminUsersController {

	@Autowired
	private UserServiceInt metier;
		
	private static List<Admin> admins; // Pour avoir la liste a afficher
	private static Map<String,Object> props; 
	
	
	//Première page on récupère tout les admins
	@RequestMapping(value="/index")
	public String Index(Model model){
		admins=metier.getAllAdmins();
		model.addAttribute("admin", new Admin());
		model.addAttribute("admins",admins);
		
		return "admins";
	}
	
	// Formulaire : on apuie sur le bouton getAll on récupère tous les admins
	@RequestMapping(value="/saveAdmin",params="getAll")
	public String afficherTousLesAdmins(Model model){
		admins=metier.getAllAdmins();
		props=null;
		model.addAttribute("admin", new Admin());
		model.addAttribute("admins",admins);
		return "admins";
	}
	
	@RequestMapping(value="/suppAdmin")
	public String supp(long userID,Model model){
		
		metier.deleteAdmin(userID);
		if(props==null)admins=metier.getAllAdmins();
		else admins=metier.finAdminByProps(props);
		model.addAttribute("admin", new Admin());	
		model.addAttribute("admins",admins);
		return "admins";
	}
	@RequestMapping(value="/editAdmin")
	public String edit(long userID,Model model){
		Admin u=metier.findAdmin(userID);
		
		model.addAttribute("admin", u);	
		model.addAttribute("admins",admins);
		return "admins";
	}
	
	@RequestMapping(value="/saveAdmin",params="save")
	public String saveUser(Admin u,BindingResult bindingResult,Model model,MultipartFile file) throws IOException{
		
		
		if(!file.isEmpty()){
			//String path=System.getProperty("java.io.tmpdir");
			BufferedImage bi=ImageIO.read(file.getInputStream());
			u.setPhoto(file.getBytes());
			Long idP=null;
			if(u.getIdUser() == null){
				u.setDateCreation(new Date());	
				metier.addAdmin(u);
			}
			else{
				u.setDateModification(new Date());
			  metier.editAdmin(u);
			  
			}
			//file.transferTo(new File(path+"/"+"PROD_"+idP+"_"+file.getOriginalFilename()));
		}
		else{
			if(u.getIdUser()==null)
			{
				u.setDateCreation(new Date());
				metier.addAdmin(u);
				
			}
			else 
			{
				u.setDateModification(new Date());
				metier.editAdmin(u);
			}
		}
		
		
		if(props==null)admins=metier.getAllAdmins();
		else admins=metier.finAdminByProps(props);
		
		model.addAttribute("admin", new Admin());	
		model.addAttribute("adminss",admins);
		return "admins";
	}
    
	@RequestMapping(value="photoAdmin",produces=MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public  byte[] photoUser(Long userID) throws IOException{
		//Comment afficher une image
		Admin e=metier.findAdmin(userID);
		
		
		return IOUtils.toByteArray(new ByteArrayInputStream(e.getPhoto()));
	}
	
	@RequestMapping(value="/saveAdmin",params="find")
	public String findUsers(Admin u,BindingResult bindingResult,Model model,MultipartFile file) throws IOException{
		
		props=new TreeMap<String,Object>();
		
		if(u.getIdUser()!=null) props.put("user_id", u.getIdUser());
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
		admins=metier.finAdminByProps(props);
		model.addAttribute("admin", new Admin());	
		model.addAttribute("admins",admins);
		return "admins";
	}
}
