package exerciciosjavalista3;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Escrever um programa que receba vários números inteiros no teclado. 
		//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
		
		
		int num=0, soma =0, media=0, contador=0;
	
		
		do {
			System.out.println("Digite um numero inteiro:");
			num = leia.nextInt();
			
			if(num%3==0&& num!=0) {
				soma+=num;
				contador++;
				media= soma/contador;
				
			}
			
			System.out.println("Digite um numero inteiro:");
			num = leia.nextInt();	
			
		}while (num!=0);
		
		System.out.println("A media dos numeros multiplos de 3 é:"+media);
	}

	}


