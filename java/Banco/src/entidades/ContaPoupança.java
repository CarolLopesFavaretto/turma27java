package entidades;

public class ContaPoupanša extends Conta {
	
	private int diaAniversarioConta;

	public ContaPoupanša(int numero, String nome, int diaAniversarioConta) {
		super(numero, nome);
		this.diaAniversarioConta = diaAniversarioConta;
	}

	public int getDiaAniversarioConta() {
		return diaAniversarioConta;
	}

	public void setDiaAniversarioConta(int diaAniversarioConta) {
		this.diaAniversarioConta = diaAniversarioConta;
	}
	
	

}
