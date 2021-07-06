package introducao;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// String alunos[] = new String [4];
		String alunos[] = { "Caroline", "Joao", "Lucas", "Gio" };
		String matricula[]= new String [4];
		int notas[] = new int[4];
		String aux;
		

		// System.out.println(alunos[2].toUpperCase());// exemplo de maiusculo e
		// minusculo na string
		
			System.out.println("Cadastro de Alunos");
			
		 for(int i=0; i<alunos.length;i++) {
			 System.out.println("Aluno " +(i+1));
			 matricula[i] = "Mat-"+(i+1);
			 System.out.println("Matricula " +matricula[i] + "Aluno " +alunos[i].toUpperCase()+" : "); // jeito feito anteriormente
			 notas[i] = leia.nextInt();
		 }
		 System.out.println("Boletim");
		 
		 for(int i=0; i<4;i++) {
			 if( notas[i]>=5) {
				 System.out.println("Matricula " +matricula[i] + "Aluno " +alunos[i].toUpperCase()+" : "+ "Aprovado "+notas[i]);
			 }else {
				 System.out.println("Matricula " +matricula[i] + "Aluno " +alunos[i].toUpperCase()+" : "+ "Reprovado "+notas[i]); 
			 }
		 }
		 
		 System.out.println("Escolha o aluno que deseja pesquisar a nota pela matricula");
		 System.out.println("Digite a matricula: ");
		 aux = leia.next().toUpperCase();
		 
		 for(int i=0; i<4; i++) {
			 if(matricula[i].toUpperCase().equals(aux)) {
				if(notas[i]>=5) {
					System.out.println("Matricula " +matricula[i] + "Aluno " +alunos[i].toUpperCase()+" : "+ "Aprovado "+notas[i]);
				}else {
					System.out.println("Matricula " +matricula[i] + "Aluno " +alunos[i].toUpperCase()+" : "+ "Reprovado "+notas[i]);
				}
			 }
			 
		 }

		// for(int i=0; i<alunos.length;i++) { // jeito feito com o tamanho do array em
		// string
		// System.out.println(alunos[i]);

		// }
		//for (int i : notas) { // for each
			//System.out.println(i);

		//}

	}

}
