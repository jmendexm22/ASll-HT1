package com.grup.springboot.id.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Configuration
//@EnableWebSecurity
@Controller
public class WebSecurityConfig {

	/**
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		
		//MapModel
		//Map<String, Object> map
		//ModelAndView mv
	   // mv.addObject("titulo","hola spring freamework odelAndView");
		//mv.setViewName("index");\
		
		//model.addAttribute("titulo", textoIndex);
		
		return "index";
		
		}**/
}
