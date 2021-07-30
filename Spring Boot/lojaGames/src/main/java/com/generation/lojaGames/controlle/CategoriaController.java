package com.generation.lojaGames.controlle;

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

import com.generation.lojaGames.model.Categoria;
import com.generation.lojaGames.repository.CategoriaRepository;

@RestController
@RequestMapping ("/categoria")
@CrossOrigin (value = "*", allowedHeaders = "*") //aceita requisição de qualquer origem;

public class CategoriaController {
	
	
		@Autowired // garantindo que o serviço do repositorio seja acessado a partir do controller;
		private CategoriaRepository repository;
		
		@GetMapping // abre uma porta no medoto/end point ao chamar um verbo Get;
		public ResponseEntity<List<Categoria>> GetAll (){ // ResponseEntity cria um objeto padrao HTTP;
			
			return ResponseEntity.ok(repository.findAll());
		}
		@GetMapping ("/{id}")
		public ResponseEntity<Categoria> GetById (@PathVariable long id) { // utiliza-se o @PathVariable para capturar o valor que vem pela URL (id)
			return repository.findById(id)
					.map (resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		}
		
		@GetMapping ("/descricao/{descricao}") 
		public ResponseEntity<List<Categoria>> GetByDescricao (@PathVariable String descricao) { 
			return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
		}
		
		@PostMapping
		public ResponseEntity<Categoria> post (@RequestBody Categoria post){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(post));
		}

		@PutMapping
		public ResponseEntity<Categoria> put (@RequestBody Categoria put){
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(put));
		}
		
		@DeleteMapping ("/{id}")
		public void delete (@PathVariable long id){
			repository.deleteById(id);
		}
		
		
}
