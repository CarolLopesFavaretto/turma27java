package introducao;

import java.util.Scanner;

public class ex2lista2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int  num1, num2, num3;
		
		System.out.println("Digite um numero inteiro: ");
		num1 = leia.nextInt();
		System.out.println("Digite um numero inteiro: ");
		num2 = leia.nextInt();
		System.out.println("Digite um numero inteiro: ");
		num3 = leia.nextInt();
		
		if (num1 == num2 && num2 == num3) {
			System.out.printf("A ordem crescente: %d %d %d\n", num1, num2, num3);
		}
		else if (num1 > num2 && num2 > num3) {
			System.out.printf("A ordem crescente: %d %d %d\n", num3, num2, num1);
		}
		else if (num1 > num2 && num1 > num3 && num3 > num2) {
				System.out.printf("A ordem crescente: %d %d %d\n",num2, num3, num1);
		}
		else if (num2 >= num1 && num2 >= num3 && num3 >=num1) {
		    	System.out.printf("A ordem crescente: %d %d %d\n", num1, num3, num2);
		}
		  
	     
		
		
		
		
	}

}
