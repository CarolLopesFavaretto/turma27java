package exerciciosjavalista3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade=0, maior = 0, menor = 0;


		System.out.println("Digite sua idade ");
		idade = leia.nextInt();
		
		while (idade != -99) {

			if (idade > 50) {
				maior++;
			} 
			else if (idade < 21) {
				menor++;
			}
			System.out.println("Digite sua idade ");
			idade = leia.nextInt();
		}
		System.out.printf("%d menor que 21 anos\n", menor);
		System.out.printf("%d maior que 50 anos\n", maior);

	}

}
