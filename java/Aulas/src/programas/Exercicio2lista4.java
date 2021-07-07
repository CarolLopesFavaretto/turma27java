package programas;

import objetos.Aviao;

public class Exercicio2lista4 {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.modelo= "Bimotor";
		aviao1.rodas = 3;
		aviao1.tipo = "Passageiro 14 lugares";
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade = 0;
		
		System.out.println("Situação do Avião");
		System.out.println("Velocimentro atual:" +aviao1.velocidade + " No ar "+ aviao1.noAr + " Ligado " + aviao1.ligado );
		System.out.println("Situação na pista");
		aviao1.ligar();
		System.out.println("Velocimentro atual:" +aviao1.velocidade + " No ar "+ aviao1.noAr + " Ligado " + aviao1.ligado );
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.decolando();
		System.out.println("Velocimentro atual:" +aviao1.velocidade + " No ar "+ aviao1.noAr + " Ligado " + aviao1.ligado );
		aviao1.aumentarVelocidade(40);
		System.out.println("Velocimentro atual:" +aviao1.velocidade + " No ar "+ aviao1.noAr + " Ligado " + aviao1.ligado );
		aviao1.diminuirVelocidade(40);
		System.out.println("Velocimentro atual:" +aviao1.velocidade + " No ar "+ aviao1.noAr + " Ligado " + aviao1.ligado );
		aviao1.diminuirVelocidade(10);
		aviao1.pousar();
		System.out.println("Velocimentro atual:" +aviao1.velocidade + " No ar "+ aviao1.noAr + " Ligado " + aviao1.ligado );
		aviao1.desliga();
		System.out.println("Velocimentro atual:" +aviao1.velocidade + " No ar "+ aviao1.noAr + " Ligado " + aviao1.ligado );
	}
	

}
