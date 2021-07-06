package exerciciosjavalista4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int valor[][] = new int[3][3];
		int soma = 0, diagonal = 0, l = 0, c = 0;

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.println("Digite um valor:");
				valor[l][c] = leia.nextInt();
				soma += valor[l][c];

				if (l == c) {
					diagonal = diagonal + valor[l][c];
				}
			}

		}
		System.out.printf("Somatorio da diagonal principal é :  %d ", diagonal);

	}

}
