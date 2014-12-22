package com.PL.Spring.Controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;
 
/**
 * @author Crunchify.com
 * 
 */
 
@Controller
@RequestMapping(value="test")
public class CrunchifySpringAjaxJQuery {
 
    @RequestMapping("/ajax")
    public ModelAndView helloAjaxTest() {
        return new ModelAndView("ajax", "message", "Crunchify Spring MVC with Ajax and JQuery Demo..");
    }
 
    @RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
    public @ResponseBody
    String getTime(@RequestParam("param1") String nom) {
    	System.out.println("teeeeeeeest started nom :"+nom);
        Random rand = new Random();
        float r = rand.nextFloat() * 100;
        String result = "<br>Next Random # is <b>" + r + "</b>. Generated on <b>" + new Date().toString() + " nom  :</b>" + nom + "</b>";
        //System.out.println("\n \n Hello Aymane.. \n" + nom);
        return result;
    }
}