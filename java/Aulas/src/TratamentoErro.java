import java.util.Scanner;

public class TratamentoErro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int valor = 0;
		
		String nome [] = new String [3];
		
		try {
		
		System.out.println("Digite a posi��o do vetor de 0 a 2 para cadastro de nome: ");
		valor = leia.nextInt();
		System.out.println("Digite o nome da pessoa em quest�o: ");
		nome[valor] = leia.next();
		} catch(java.lang.ArrayIndexOutOfBoundsException erro1) {
			System.out.println("Voc� colocou um tamanho errado ou posi��o incorreta na matriz");
		}
		
		System.out.println("Posi��o escolhida " +valor+ "nome registrado:" + nome[valor]);
		

	}

}
