package com.PL.Spring.Controllers;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;







import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.PL.Spring.Entities.Admin;
import com.PL.Spring.Entities.Filiere;
import com.PL.Spring.Entities.Niveau;
import com.PL.Spring.Entities.Role;
import com.PL.Spring.Metier.UserServiceInt;

@Controller
@RequestMapping(value="Niveaux")
public class NiveauxController {

	@Autowired
	private UserServiceInt metier;
	private static Map<String,Object> props;
	private static List<Filiere> filieres;
	//private static List<FI_M_D> fil_FIMD;
	
	private static List<Niveau> niveaux; // Pour avoir la liste a afficher
	
	//Première page on récupère tout les admins
	@RequestMapping(value="/index")
	public String Index(Model model){
		niveaux=metier.getAllNiveaux();
		
		if(props==null)niveaux=metier.getAllNiveaux();
		else niveaux=metier.findNiveauxByProps(props);
		filieres=metier.getAllFilieres();
		model.addAttribute("filieres", filieres);
		model.addAttribute("niveau", new Niveau());
		model.addAttribute("niveaux",niveaux);
		return "niveaux";
		
		
	}
	@RequestMapping(value="/saveNiveau",params="save")
	public String saveNiveau(@Valid Niveau u,BindingResult bindingResult,Model model,@RequestParam(value = "select_filiere") String fil ,
		@RequestParam(value = "dateDebut") String dateDebut,@RequestParam(value = "dateFin") String dateFin) throws IOException{
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date a= null,b=null;
		
		try {
			 a =  simpleDateFormat.parse(dateDebut);
			 b =  simpleDateFormat.parse(dateFin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(fil!=null && !fil.equals("#"))
		{
			u.setFiliere(metier.findFiliereByTitle(fil));
		}
		
		u.setDateDebut(a);
		u.setDateFin(b);
		
		if(u.getNiveauID()==null)
		{ 
			System.out.println("id NULL");
			metier.addNiveau(u);
		}
		else metier.editNiveau(u);

		if(props==null)niveaux=metier.getAllNiveaux();
		else niveaux=metier.findNiveauxByProps(props);
		filieres=metier.getAllFilieres();
		model.addAttribute("filieres", filieres);
		model.addAttribute("niveau", new Niveau());
		model.addAttribute("niveaux",niveaux);
		return "niveaux";
		
	}
	// Formulaire : on apuie sur le bouton getAll on récupère tous les admins
		@RequestMapping(value="/saveNiveau",params="getAll")
		public String afficherTousLesNiveaux(Model model){
			niveaux=metier.getAllNiveaux();
			props=null;
			filieres=metier.getAllFilieres();
			model.addAttribute("filieres", filieres);
			model.addAttribute("niveau", new Niveau());
			model.addAttribute("niveaux",niveaux);	
			return "niveaux";
		}
		
		@RequestMapping(value="/suppNiveau")
		public String supp(long niveauID,Model model){
			
			metier.deleteLNiveau(niveauID);
			if(props==null)niveaux=metier.getAllNiveaux();
			else niveaux=metier.findNiveauxByProps(props);
			filieres=metier.getAllFilieres();
			model.addAttribute("filieres", filieres);
			model.addAttribute("niveau", new Niveau());
			model.addAttribute("niveaux",niveaux);
			return "niveaux";
		}
		
		@RequestMapping(value="/editNiveau")
		public String edit(long niveauID,Model model){
			Niveau niveau=metier.findNiveau(niveauID);
			
			if(props==null)niveaux=metier.getAllNiveaux();
			else niveaux=metier.findNiveauxByProps(props);
			filieres=metier.getAllFilieres();
			model.addAttribute("filieres", filieres);
			model.addAttribute("niveau", niveau);
			model.addAttribute("niveaux",niveaux);
			return "niveaux";
			
		}
		
		@RequestMapping(value="/saveNiveau",params="find")
		public String findUsers(Niveau u,BindingResult bindingResult,Model model,@RequestParam(value = "select_filiere") String fil ,
				@RequestParam(value = "dateDebut") String dateDebut,@RequestParam(value = "dateFin") String dateFin) throws IOException{
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date a= null,b=null;
			try {
				 a =  simpleDateFormat.parse(dateDebut);
				 b =  simpleDateFormat.parse(dateFin);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			props=new TreeMap<String,Object>();
			
			if(u.getNiveauID()!=null && !u.getNiveauID().equals("")) props.put("niveauID", u.getNiveauID());
			else
			{
				if(u.getNomNiveau()!=null && !u.getNomNiveau().equals(""))props.put("nomNiveau",u.getNomNiveau());
				if(u.getDescriptionNiveau()!=null && !u.getDescriptionNiveau().equals(""))props.put("descriptionNiveau",u.getDescriptionNiveau());
				if(fil!=null &&  !fil.equals("#"))
				{
					//props.put("f_ID",metier.findFiliereByTitle(fil).getF_ID());
					props.put("filiere", metier.findFiliereByTitle(fil)); // penser a comparator java
				}
				
				//if(u.getDateDebut()!=null && !u.getDateDebut().equals(""))props.put("dateDebut",u.getDateDebut());
				//if(u.getDateFin()!=null && !u.getDateFin().equals(""))props.put("dateFin",u.getDateFin());
				//if(u.getAnnescolaire()!=null && !u.getAnnescolaire().equals(""))props.put("anneescolaire",u.getAnnescolaire());
				//props.put("active",u.isActive());
								
			}
			if(props.size()!=0)niveaux=metier.findNiveauxByProps(props);
			else niveaux=metier.getAllNiveaux();
			filieres=metier.getAllFilieres();
			model.addAttribute("filieres", filieres);
			model.addAttribute("niveau", new Niveau());
			model.addAttribute("niveaux",niveaux);
			return "niveaux";
		}
		
		
}
