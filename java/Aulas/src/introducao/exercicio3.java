package introducao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int tempoEvento, minutos, horas, segundos;

		System.out.println("Digite a duração do evento em segundos: ");
		tempoEvento = leia.nextInt();
		
		horas = tempoEvento/3600;
		minutos = (tempoEvento%3600)/60;
		segundos = (tempoEvento%3600)%60;
		
		System.out.println("Horas \n"+horas);
		System.out.println("Minutos \n"+minutos);
		System.out.println("Segundos \n"+segundos);
	}

}
