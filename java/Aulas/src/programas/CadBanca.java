package programas;

import java.util.Scanner;

import objetos.pessoa;

public class CadBanca {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		pessoa cliente1 = new pessoa();
		
		System.out.println("Digite seu nome: ");
		cliente1.nome = leia.next();
		System.out.println("Digite seu ano de nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		
		if(cliente1.calcularIdade(2021)>=18) {
			System.out.println("Você pode comprar revista");
			
		}else {
			System.out.println("Proibido conteudo menor de 18 anos");
		}

	}

}
