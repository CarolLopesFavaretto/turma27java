package app;

import entidades.ContaPoupança;

public class Testebanco {
	
	public static void main(String[] args) {
		
		ContaPoupança conta1 = new ContaPoupança (1,"Caroline",10);
		
		System.out.println("Data de aniversario conta é: " +conta1.getDiaAniversarioConta());
		conta1.correcaoDeSaldo();
		
		// efetuando debito;
		conta1.debito(50);
		System.out.println("Saldo Atual " +conta1.getSaldo());
		//efetuando credito;
		conta1.credito(500);
		System.out.println("Deposito de R$:" +conta1.getSaldo());
		
		// se data for igual a de aniversario conta poupança, aplicará correção de 0.05%;
		conta1.correcaoDeSaldo();
		
		
	}

}
