package exerciciosjavalista3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num, i;
		int par = 0, impar = 0;

		for (i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();

			if (num < 0 || num == 0) {
				System.out.println("Por favor,digite um numero v�lido!");

			} else if (num % 2 == 0) {
				System.out.printf("%d � par \n", num);
				par += 1;

			} else {
				System.out.printf("%d � impar \n", num);
				impar += 1;
					
				}
			}
		System.out.printf("%d valores s�o pares\n", par);
		System.out.printf("%d valores s�o impares", impar);
	}
		
	}


