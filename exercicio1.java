package com.helloworld.helloworld.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex1")
public class exercicio1 {
	
	@GetMapping
	public String habilidade() {
		
		return "Trabalho em equipe\r\n" + 
				"Persistência";
				
	}
	
}
