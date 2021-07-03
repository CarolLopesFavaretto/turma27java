package introducao;

import java.util.Scanner;

public class exportugolparajava5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double indice;
		
		System.out.println("Digite o indice de poluição:");
		indice = leia.nextDouble();
		
		if(indice > 0.05 && indice <= 0.25) {
			System.out.println("Indice de poluição aceitavel");
		
		}
		else if(indice == 0.3) {
			System.out.println("Empresas do 1º grupo são intimadas a suspenderem suas atividades");
		
		}
		else if(indice == 0.4) {
			System.out.println("Empresas do 1º grupo e 2º grupo são intimadas a suspenderem suas atividades");
		
		}
		else if(indice >= 0.5){
			System.out.println("Todos os grupo são intimados a paralisarem suas atividades");
		
		}
		else {
			System.out.println("Fim de Programa");
		}
			
		

	}

}
