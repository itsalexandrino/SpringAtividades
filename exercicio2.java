package com.helloworld.helloworld.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ex2")
public class exercicio2 {
	
	@GetMapping
	public String objetivos() {
		
		return "Entender melhor a estrutura do spring";
				
	}
}
