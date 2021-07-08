package programas;

import objetos.Cachorro;
import objetos.Cavalo;
import objetos.Preguica;

public class Exerc1And2Lista5 {

	public static void main(String[] args) {
		
		Cachorro  cachorro = new Cachorro ("Pipoca", 5, "canino", "Corre" );
		Cavalo Defogo= new Cavalo("Defogo", 4, "Equus", "Corre");
		Preguica Soneca = new Preguica("Soneca", 10, "mamifero", "Sobe na Arvore");
		
		//System.out.println(cachorro.getNome());
		//System.out.println(Defogo.getEmiteSom());
		//System.out.println(Soneca.getEspecie());

		
		System.out.println("Os sons emitidos são: " + cachorro.emiteSom() + " - " +  Defogo.emiteSom()+ " - " +Soneca.emiteSom());
		
	}

}
