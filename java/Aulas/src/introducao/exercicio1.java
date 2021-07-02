package introducao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade, mes, dias, idadeAno, resulDias;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		System.out.println("Digite o mes: ");
		mes = leia.nextInt();
		System.out.println("Digite os dias: ");
		dias = leia.nextInt();
		
		idadeAno = (idade*365);
		mes= (mes*30);
		
		resulDias = (idadeAno+mes+dias);
		
		System.out.println("Total de dias é: " + resulDias);
		
				
	}

}
