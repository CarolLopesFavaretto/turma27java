package entidades;

public class ContaPoupan�a extends Conta {
	
	private int diaAniversarioConta;
	private double taxaRendimento = 0.05;
	

	public ContaPoupan�a(int numero, String nome, int diaAniversarioConta) {
		super(numero, nome);
		this.diaAniversarioConta = diaAniversarioConta;
	}

	public int getDiaAniversarioConta() {
			return diaAniversarioConta;
	}

	public void setDiaAniversarioConta(int diaAniversarioConta) {
		this.diaAniversarioConta = diaAniversarioConta;
	}
	
	
	public void correcaoDeSaldo() {
		if(diaAniversarioConta == 5) {
			 this.setSaldo(this.getSaldo()+ this.getSaldo()*this.taxaRendimento);
			 System.out.println("Aplica��o de taxa de rendimento. Seu saldo atual �: "+getSaldo());
		} else  {
			System.out.println( "Seu saldo atual �: "+getSaldo());
		} 
		}
	}
	



