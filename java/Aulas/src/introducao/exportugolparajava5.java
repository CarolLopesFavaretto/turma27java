package introducao;

import java.util.Scanner;

public class exportugolparajava5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double indice;
		
		System.out.println("Digite o indice de polui��o:");
		indice = leia.nextDouble();
		
		if(indice > 0.05 && indice <= 0.25) {
			System.out.println("Indice de polui��o aceitavel");
		
		}
		else if(indice == 0.3) {
			System.out.println("Empresas do 1� grupo s�o intimadas a suspenderem suas atividades");
		
		}
		else if(indice == 0.4) {
			System.out.println("Empresas do 1� grupo e 2� grupo s�o intimadas a suspenderem suas atividades");
		
		}
		else if(indice >= 0.5){
			System.out.println("Todos os grupo s�o intimados a paralisarem suas atividades");
		
		}
		else {
			System.out.println("Fim de Programa");
		}
			
		

	}

}
