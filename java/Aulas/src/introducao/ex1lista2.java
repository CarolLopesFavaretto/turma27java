package introducao;

import java.util.Scanner;

public class ex1lista2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int  num1, num2, num3, maior=0;
		
		System.out.println("Digite um numero inteiro: ");
		num1 = leia.nextInt();
		System.out.println("Digite um numero inteiro: ");
		num2 = leia.nextInt();
		System.out.println("Digite um numero inteiro: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3) {
		maior = num1;
		}
		if(num2>num1 && num2>num3) {
		maior = num2;
		}
		if(num3>num1 && num3>num2) {
		maior = num3;
		}
		System.out.printf("O maior valor é %d",maior);
		
		
		}
		
	}


