package introducao;

import java.util.Scanner;

public class exportugolparajava1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pesoLimite =50;
		int pesoTomate, excesso, multa;
		
		System.out.println("Qual o valor do peso do tomate:");
		pesoTomate = leia.nextInt();
		
		excesso = pesoTomate-pesoLimite;
		multa = excesso * 4;
		
		if(pesoTomate> pesoLimite){
			System.out.printf("Você tem um peso de excesso de %d kg e recebera uma multa de R$ %d", excesso, multa);
		}
		else if(pesoTomate == pesoLimite) {
			System.out.printf("Você não teve excesso na sua carga!Valor de multa é R$ 0");
		}
		else if(pesoTomate < pesoLimite) {
			System.out.printf("Você não teve excesso na sua carga!Valor de multa é R$ 0");
		}
	}

}
