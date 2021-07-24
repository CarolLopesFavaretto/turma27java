package br.com.exercicio1.exercicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/exercicio1")

public class Exercicio1_controller {
		
	@GetMapping
	public String exercicio1 () {
		return "Para a realização desta atividade utilizei a mentalidade"
				+ "de crescimento persistencia e muita atenção aos detalhes";
	}
}
