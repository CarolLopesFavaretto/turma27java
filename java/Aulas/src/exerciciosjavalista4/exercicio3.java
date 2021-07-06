package exerciciosjavalista4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int N1[][]= new int [4][6];
		int N2[][]= new int [4][6];
		int M1[][]= new int [4][6];
		int M2[][]= new int [4][6];

		int diagonal=0,l=0,c=0;
		
		for( l=0; l<4; l++) {
			for( c=0; c<6; c++) {
			
				N1[l][c] = 0 + (int) (Math.random()*4);// função de sorteio
				N2[l][c] = 4 + (int) (Math.random()*6);
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] - N2[l][c];
				
				
				if (l==c){
				diagonal = diagonal + N1[l][c];
						
				}
			}
		}
		System.out.printf("Somatorio da diagonal principal é :  %d ",diagonal);
			
	}

}
