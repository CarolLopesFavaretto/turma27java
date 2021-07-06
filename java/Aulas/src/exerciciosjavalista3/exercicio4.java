package exerciciosjavalista3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int sexo;
		int opcoes= 0;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0;
		int pessoaNervosasMais40anos=0, pessoaCalmasMenos18anos=0;
		char op= 'S';
		final int LIMITE = 150;
		int contador=1;
		
		while(op=='S'&& contador <= LIMITE) {
			System.out.println("Participante " +contador);
			System.out.println("Digite a idade:");
			idade= leia.nextInt();
			System.out.println("Digite:");
			System.out.println("1-Feminino\n2-Masculino\n3-Outros: ");
			sexo = leia.nextInt();
			System.out.println("Selecione: ");
			System.out.println("1-Pessoa Calma\n2-Pessoa Nervosa\n3-Pessoa Agressiva: ");
			opcoes = leia.nextInt();
			
			if(opcoes==1) {
				pessoasCalmas++;
			}
			if(sexo==1 && opcoes==2) {
				mulheresNervosas++;
			}
			if(sexo==2 && opcoes==3) {
				homensAgressivos++;
			}
			if(sexo==3 && opcoes==1) {
				outrosCalmos++;
			}
			if(idade<18 && opcoes==1) {
				pessoaCalmasMenos18anos++;
			}
			if(idade>40 && opcoes==2) {
				pessoaNervosasMais40anos++;
			}
			
			System.out.println("Continua S/N:");
			op = leia.next().toUpperCase().charAt(0);
			contador++;
			
			
		}
		System.out.println("Pessoas Calmas :" +pessoasCalmas);
		System.out.println("Mulheres Nervosas :" + mulheresNervosas);
		System.out.println("Homens  Agressivos :" + homensAgressivos);
		System.out.println("Outros Calmos :" + outrosCalmos);
		System.out.println("Menores de 18 calmos :" + pessoaCalmasMenos18anos);
		System.out.println("Maiores de 40 nervosos :" + pessoaNervosasMais40anos);
	}
	

}
