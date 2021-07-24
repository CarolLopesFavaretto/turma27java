package br.com.exercicio2.exercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/exercicio2")

public class exercicio2_controller {
	@GetMapping
	public String exercicio2 () {
		return "Tenho como objetivo de aprendizagem me aperfeiçoar melhor neste assunto"
				+ "\n para conseguir aplica-lo de forma correta e eficaz.";
	}
}
