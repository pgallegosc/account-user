package com.nautilus.account.register.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nautilus.account.register.domain.User;
import com.nautilus.account.register.serviceJPA.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
	private UserService serviceUser;
    
   @GetMapping("/")
	public String UserRegistration(Model model) {
    	return "redirect:/user/formRegistro";
	}
    
    @GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int idUsuario, RedirectAttributes attributes) {		    	
		// Eliminamos el usuario
    	serviceUser.delete(idUsuario);			
		attributes.addFlashAttribute("msg", "El usuario fue eliminado!.");
		return "redirect:/user/index";
	}
    
    @PostMapping("/user/signup")
	public String guardarRegistro(@RequestBody User user ) {
		
		serviceUser.saveUser(user);
				
		//attributes.addFlashAttribute("msg", "El registro fue guardado correctamente!");
		
		return "el registro fue guardado";
	}

}
