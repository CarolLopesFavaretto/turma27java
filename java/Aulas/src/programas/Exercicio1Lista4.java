package programas;

import java.util.Scanner;

import objetos.Cliente;

public class Exercicio1Lista4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente(); 
		
		System.out.println("Digite o nome:");
		cliente1.nome= leia.next();
		System.out.println("Digite o sexo Masculino/Feminino/Outros:");
		cliente1.sexo = leia.next();
		System.out.println("Digite o ano de nascimento:");
		cliente1.anoNascimento = leia.nextInt();
		
		System.out.println( cliente1.nome.toUpperCase() + "! "  +  cliente1.sexo() + " seu codigo de cliente é " + cliente1.codigoCliente());

	}

}
