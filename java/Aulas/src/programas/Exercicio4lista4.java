package programas;

import java.util.Scanner;

import objetos.Funcionario;

public class Exercicio4lista4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Funcionario func1 = new Funcionario();
		
		System.out.println("Digite o nome:");
		func1.nome= leia.next();
		System.out.println("Digite o sexo Masculino/Feminino/Outros:");
		func1.sexo = leia.next();
		System.out.println("Digite o ano de nascimento:");
		func1.anoNascimento = leia.nextInt();
		
		System.out.println( func1.nome.toUpperCase() + "! "  +  func1.sexo() + " Sua inscrição é " + func1.inscricao());


}

}
