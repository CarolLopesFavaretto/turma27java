package exerciciosjavalista3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		//No final, mostre a soma dos n�meros digitados.
	
		int numDigitado=0, soma =0;
	
		
		do {
			System.out.println("Digite um numero:");
			numDigitado = leia.nextInt();
			
			if(numDigitado != 0) {
				soma+=numDigitado;
			}
		}while (numDigitado > 0);
		
		System.out.println("A soma dos numeros digitados �:"+soma);
	}
	
	

}
