package com.gft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class paginaController {
	@RequestMapping("/home")
	 public String novo() {
		 return "home";
	}
	
	@RequestMapping("/habilidades")
	 public String habalidades() {
		 return "habilidades";
	 }


	@RequestMapping("/contatos")
	 public String conatatos() {
		 return "contatos";
	 }

}
