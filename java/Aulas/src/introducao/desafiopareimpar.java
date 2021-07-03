package introducao;

import java.util.Scanner;

public class desafiopareimpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int  num;
		
		System.out.println("Digite um numero inteiro: ");
		num = leia.nextInt();
		
		if (num < 0) {
			System.out.println("Numero negativo. Apenas numero positivo");
		}
		else if (num==0) {
			System.out.println("Numero 0 é um numero neutro");
		} 
		else if (num%2==0){
			System.out.printf("Numero %d é par", num);
		} 
		else {
			System.out.printf("Numero %d é impar",num);
		}

	}
}