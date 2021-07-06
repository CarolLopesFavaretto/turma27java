package exerciciosjavalista4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int dadosLancados[] = new int[10];
		int media =0, maior = 0, cont=0, soma=0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite o valor do lançamento de dados: ");
			dadosLancados[i]= leia.nextInt();
			soma+=dadosLancados[i];
			if(dadosLancados[i]> maior) {
				cont=1;
				if(dadosLancados[i] == maior) {
					cont++;
				}
			}
		}
			media=soma/10;
			
			System.out.printf("A quantidade de maior pontuação é %d:\n", cont);
			System.out.printf("A media de lançamentos é : %d:\n", media);
	}

}
