package exerciciosjavalista4;

import java.util.Random;
import java.util.Scanner;
public class testerandom {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int valor = aleatorio.nextInt(30)+1;
		System.out.println("Número Gerado: "+valor);
	}

}
