package com.generarion.Farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generarion.Farmacia.model.Produto;
import com.generarion.Farmacia.repository.ProdutoRepository;



@RestController
@RequestMapping ("/produto")
@CrossOrigin (value = "*", allowedHeaders = "*")

public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping // abre uma porta no medoto/end point ao chamar um verbo Get;
	public ResponseEntity<List<Produto>> GetAll (){ // ResponseEntity cria um objeto padrao HTTP;
		
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping ("/{id}")
	public ResponseEntity<Produto> GetById (@PathVariable long id) { // utiliza-se o @PathVariable para capturar o valor que vem pela URL (id)
		return repository.findById(id)
				.map (resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping ("/nome/{nome}") 
	public ResponseEntity<List<Produto>> GetByTipo (@PathVariable String nome) { 
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post (@RequestBody Produto post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(post));
	}

	@PutMapping
	public ResponseEntity<Produto> put (@RequestBody Produto put){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(put));
	}
	
	@DeleteMapping ("/{id}")
	public void delete (@PathVariable long id){
		repository.deleteById(id);
	}
	
}

	

