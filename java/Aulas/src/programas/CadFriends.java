package programas;

import java.util.Scanner;

import objetos.pessoa;

public class CadFriends {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		pessoa amigo1 = new pessoa();
		pessoa amigo2 = new pessoa();
		
		System.out.println("Digite o nome:");
		amigo1.nome= leia.next();
		System.out.println("Digite o sexo M/F/O:");
		amigo1.sexo = leia.next();
		System.out.println("Digite a data de nascimento:");
		amigo1.anoNascimento = leia.nextInt();
		
		System.out.println("Idade :"+(2021-amigo1.anoNascimento));
		
		
		System.out.println("Digite o nome:");
		amigo2.nome= leia.next();
		System.out.println("Digite o sexo M/F/O:");
		amigo2.sexo = leia.next();
		System.out.println("Digite a data de nascimento:");
		amigo2.anoNascimento = 2000;
		
		System.out.println(amigo1.nome + "Sua idade é:" + amigo1.calcularIdade());
		System.out.println(amigo2.nome + "Sua idade é:" + amigo2.calcularIdade());
		
		/*System.out.printf("Meus amigos são %s e %s\n", amigo1.nome.toUpperCase(), amigo2.nome.toUpperCase());
		
		if((2021-amigo1.anoNascimento)> (2021-amigo2.anoNascimento)) {
			System.out.printf(" %s é mais velho que %s", amigo1.nome.toUpperCase(), amigo2.nome.toUpperCase());	
		}else if((2021-amigo1.anoNascimento)< (2021-amigo2.anoNascimento)) {
			System.out.printf(" %s é mais novo que %s", amigo1.nome.toUpperCase(), amigo2.nome.toUpperCase());
		}
		else {
			System.out.println("Eles tem a mesma idade!");
		*/}
		
	}


