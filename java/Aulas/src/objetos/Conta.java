package objetos;

public class Conta {

	// atributo
	private int numero;
	private double saldo;
	private double limite;

	// construtor
	public Conta(int numero) {
		this.numero = numero;
	}

	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public Conta(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	// encapsulamento - Getters(tras o dado) e Setters (altera o dado)

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacar(double valorSaque) {
		if (valorSaque < 0) {
			System.out.println("Valor informado invalido");
		} else if (valorSaque > saldo) {
			System.out.println("Saldo indisponivel");
		} else {
			saldo = saldo - valorSaque;
			System.out.println("Saldo realizado");
		}
	}

	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}

	public void imprimirExtrato() {
		System.out.println("Conta " + numero + " Saldo Atual: R$ " + saldo);
	}
}
