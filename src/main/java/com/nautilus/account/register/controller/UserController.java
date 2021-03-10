package com.nautilus.account.register.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nautilus.account.register.domain.User;
import com.nautilus.account.register.serviceJPA.UserService;



@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
	private UserService serviceUser;
    
   @GetMapping("/user/signup")
	public String mostrarIndex(Model model) {
    	List<User> list = serviceUser.findAllUser();
    	model.addAttribute("user", list);
		return "user/user-list";
	}
    
    @GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int idUsuario, RedirectAttributes attributes) {		    	
		// Eliminamos el usuario
    	serviceUser.delete(idUsuario);			
		attributes.addFlashAttribute("msg", "El usuario fue eliminado!.");
		return "redirect:/user/index";
	}

}
