package introducao;

import java.util.Scanner;

public class ex4lista2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num;
		System.out.println("Digite um numero: ");
		num = leia.nextDouble();
		
		if((num%2)==0) {
			System.out.printf("O numero � par e sua raiz quadrada �: %.2f \n", Math.sqrt(num));
		}
		else{
			System.out.printf("O numero � impar e seu quadrado �: %.2f \n", Math.pow(num,2));
		}
	}

}
