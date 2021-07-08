package objetos;

public abstract class AnimaisCorrem extends Animal{
	
	private String corre;
	
	public AnimaisCorrem(String nome, int idade, String especie, String corre) {
		super(nome, idade, especie);
		this.corre = corre;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

}
