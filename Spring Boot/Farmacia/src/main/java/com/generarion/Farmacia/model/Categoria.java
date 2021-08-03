package com.generarion.Farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Data;

@Entity
@Table (name= "tb_categoria")
@Data

public class Categoria {
	
	@Id // chave primária
	@GeneratedValue (strategy = GenerationType.IDENTITY) // auto increment da chave primaria
	private long id;
	
	@NotBlank // não aceita se for nulo e se for vazio
	@Size (min= 4, max= 25) // especificando o tamanho minimo e maximo de caracteres da String
	private String tipo;
	
	@NotBlank //não aceita se for nulo e se for vazio
	@Size (min= 4, max= 25) // especificando o tamanho minimo e maximo de caracteres da String
	private String validade;
	
	private boolean disponivel; // boolean não necessita de annotation
	
	@OneToMany (mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties ("categoria")
	private List <Produto> produto;
}
