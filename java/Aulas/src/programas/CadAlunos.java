package programas;

import java.util.Scanner;

import objetos.pessoa;

public class CadAlunos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		pessoa aluno1 = new pessoa();
		pessoa aluno2 = new pessoa();
		pessoa aluno3 = new pessoa();
		
		
		
		System.out.println("Digite seu nome: ");
		aluno1.nome = leia.next();
		System.out.println("Digite o sexo  Masculino/Feminino/Outros:");
		aluno1.sexo = leia.next();
		System.out.println("Digite a data de nascimento:");
		aluno1.anoNascimento = leia.nextInt();
		
//		System.out.println("Digite seu nome: ");
//		aluno2.nome = leia.next();
//		System.out.println("Digite o sexo Masculino/Feminino/Outros:");
//		aluno2.sexo = leia.next();
//		System.out.println("Digite a data de nascimento:");
//		aluno2.anoNascimento = leia.nextInt();
//		
//		System.out.println("Digite seu nome: ");
//		aluno3.nome = leia.next();
//		System.out.println("Digite o sexo  Masculino/Feminino/Outros:");
//		aluno3.sexo = leia.next();
//		System.out.println("Digite a data de nascimento:");
//		aluno3.anoNascimento = leia.nextInt();
		
		if((aluno1.calcularIdade(2021))<=16) {
			System.out.println("Ensino Fundamental");
			
		}else if((aluno1.calcularIdade(2021) > 16 && (aluno1.calcularIdade(2021) <= 21))) {
			System.out.println("Ensino medio");
			
		}
		else {
			System.out.println("Ensino Superior");
			
			
		}
		System.out.print(aluno1.sexo()+ "você tem "+ aluno1.calcularIdade(2021)+ " anos e é do ensino");
	}

}
