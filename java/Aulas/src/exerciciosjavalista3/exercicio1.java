package exerciciosjavalista3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		 //Informar todos os n�meros de 1000 a 1999 que quando divididos 
		 //por 11 obtemos resto = 5. 
		
		
		 int num, i;
		 
		 for(i=1000;i<1999;i++) {
			
			 if(i % 11==5) {
				 System.out.printf("Os numeros s�o: %d\n",i);
			 }
		 }

	}

}
