import java.util.Scanner;

public class TratamentoErro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int valor = 0;
		
		String nome [] = new String [3];
		
		try {
		
		System.out.println("Digite a posição do vetor de 0 a 2 para cadastro de nome: ");
		valor = leia.nextInt();
		System.out.println("Digite o nome da pessoa em questão: ");
		nome[valor] = leia.next();
		} catch(java.lang.ArrayIndexOutOfBoundsException erro1) {
			System.out.println("Você colocou um tamanho errado ou posição incorreta na matriz");
		}
		
		System.out.println("Posição escolhida " +valor+ "nome registrado:" + nome[valor]);
		

	}

}
