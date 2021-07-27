package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/postagem")
@CrossOrigin (value = "*", allowedHeaders = "*") //aceita requisição de qualquer origem;

public class PostagemController {
	
	@Autowired // garantindo que o serviço do repositorio seja acessado a partir do controller;
	private PostagemRepository repository;
	
	@GetMapping // abre uma porta no medoto/end point ao chamar um verbo Get;
	public ResponseEntity<List<Postagem>> GetAll (){ // ResponseEntity cria um objeto padrao HTTP;
		
		return ResponseEntity.ok(repository.findAll());
	}
}
