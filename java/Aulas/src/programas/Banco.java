package programas;

import objetos.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Conta cliente1 = new Conta(1, 55.60);
		Conta cliente2 = new Conta(2, 0, 580.66);
		
		cliente1.setNumero(10);
		System.out.println("Numero da conta: " +cliente1.getNumero());
		
		cliente1.imprimirExtrato();
		cliente1.sacar(-1);
		cliente1.imprimirExtrato();
		cliente2.depositar(50);
		cliente2.imprimirExtrato();
		cliente2.sacar(51);
	}	

}
