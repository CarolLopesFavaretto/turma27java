package programas;

import java.util.Scanner;

import objetos.Patinete;

public class Exercicio5Lista4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Patinete patinete = new Patinete();
		
		patinete.marca = "Scotter";
		patinete.cor = "preto";
		patinete.capacidade = 90 ;
		patinete.classificacao = "Adulto";
		patinete.codigo = 12345;
		patinete.dobravel = true;
		patinete.rodas = 2;
		
		
		
		System.out.println("Por favor, confirme sua compra: Patinete da marca " + patinete.marca + " cor " + patinete.cor + " com capacidade de " +patinete.capacidade + " Kg e " + patinete.dobravel());
		
	}

}
