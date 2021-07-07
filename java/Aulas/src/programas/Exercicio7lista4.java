package programas;

import java.util.Scanner;

import objetos.Paciente;

public class Exercicio7lista4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Paciente pact1 = new Paciente();
		
		System.out.println("Digite o nome:");
		pact1.nome= leia.next();
		System.out.println("Digite o sexo Masculino/Feminino/Outros:");
		pact1.sexo = leia.next();
		System.out.println("Digite o ano de nascimento:");
		pact1.anoNascimento = leia.nextInt();
		
		System.out.println( pact1.nome.toUpperCase() + "! "  +  pact1.sexo() + " Seu cadastro é " + pact1.cadastro());


	}

}
