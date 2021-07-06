package introducao;

import java.util.Scanner;

public class agenda {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String agenda[][]= new String [24][31];
		int horaaux=0, diaaux=0;
		
		System.out.println("Digite o dia do evento");
		diaaux = leia.nextInt();
		System.out.println("Digite a hora");
		horaaux = leia.nextInt();
		System.out.println("Digite qual a informação deseja: ");
		agenda[horaaux][diaaux] = leia.next().toUpperCase();
		
		//agenda [11][6] = "Fazer programa em java";
		//agenda [17][7] ="Barometro";
		
		for(int hora=0; hora<24; hora++) {
			for(int dia=0; dia<31; dia++) {
				if(agenda[hora][dia] != null) {
					System.out.println("Agenda do dia " +dia+ " hora " +hora+": " +agenda[hora][dia]);
					
				}
			}
		}

	}

}
