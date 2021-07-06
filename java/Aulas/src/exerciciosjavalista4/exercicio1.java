package exerciciosjavalista4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		
		int pontuacao[] = new int[5];
		int maior = 0, i;

		for (i = 0; i < 5; i++) {
			System.out.println("Pontuação: ");
			pontuacao[i] = leia.nextInt();
			if (pontuacao[i] > maior) {
				maior = pontuacao[i];

			}

		}
		System.out.printf("A maior pontuação é %d: ", maior);
	}

}
