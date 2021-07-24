package com.generation.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Hello")

public class HelloController {
	
	@GetMapping
	public String Hello () {
		return "Vem Mundão!!! Agora eu sei Spring Boot!!!";
	}
}
