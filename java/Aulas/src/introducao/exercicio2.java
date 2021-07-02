package introducao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int totalDias, resulMes, resulDias, restMes, resulAno;

		System.out.println("Digite sua idade em dias: ");
		totalDias = leia.nextInt();

		resulAno = totalDias / 365;
		restMes = totalDias % 365;
		resulMes = restMes / 30;
		resulDias = restMes % 30;

		System.out.println("Total de anos é: \n" + resulAno);
		System.out.println("Total de meses é: \n" + resulMes);
		System.out.println("Total de dias é: \n" + resulDias);
	}

}
