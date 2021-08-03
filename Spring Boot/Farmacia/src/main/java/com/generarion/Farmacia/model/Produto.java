package com.generarion.Farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Data;

@Entity
@Table (name= "tb_produto")
@Data

public class Produto {

	@Id // chave primária;
	@GeneratedValue (strategy = GenerationType.IDENTITY) // auto increment da chave primária;
	private long id;
	
	@NotBlank // não aceita se for nulo e nem se for vazio;
	@Size (min = 5, max= 30) // especificando o tamanho minimo e maximo de caracteres da String
	private String nome;
	
	@NotBlank // não aceita se for nulo e nem se for vazio;
	@Size (min = 5, max= 30) // especificando o tamanho minimo e maximo de caracteres da String
	private String marca;
	
	@NotBlank // não aceita se for nulo e nem se for vazio;
	@Size (min = 5, max= 30) // especificando o tamanho minimo e maximo de caracteres da String
	private String composicao;
	
	@NotBlank // não aceita se for nulo e nem se for vazio;
	@Size (min = 5, max= 30) // especificando o tamanho minimo e maximo de caracteres da String
	private String codigo;
	
	
	private double preco;
	
	
	@ManyToOne
	@JsonIgnoreProperties ("produto")
	private Categoria categoria; // o tipo de dado deve ser o mesmo nome da classe que eu quero relacionar
}
