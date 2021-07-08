package entidades;

public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;
	
	
	public Conta(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}


	public int getNumero() {
		return numero;
	}

	/*
	public void setNumero(int numero) {
		this.numero = numero;
	}
	*/
	
	public String getNome() {
		return nome;
	}
	 

	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void credito (double valorCredito) {
		
		this.saldo = saldo + valorCredito;
	}
	public void debito (double valorDebito) {
		if(valorDebito<=0) {
			System.out.println("Impossivel realizar operação");
		}
		else if(valorDebito > saldo) {
			System.out.println("Saldo Insuficiente");
		}
		this.saldo = saldo + valorDebito;
	}
	
}
