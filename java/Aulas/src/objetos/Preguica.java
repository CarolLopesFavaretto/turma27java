package objetos;

public class Preguica extends Animal{
	
	private String sobeEmArvore;
	
	public Preguica (String nome, int idade,  String especie, String sobeEmArvore) {
		
		super(nome, idade,  especie);
		this.sobeEmArvore = sobeEmArvore;
	}

	public String getSobeEmArvore() {
		return sobeEmArvore;
	}

	public void setSobeEmArvore(String sobeEmArvore) {
		this.sobeEmArvore = sobeEmArvore;
	}

	@Override
	public String emiteSom() {
		return "ZzZzZzZz";
	}
	

}
