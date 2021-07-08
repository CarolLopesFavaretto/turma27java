package objetos;

public class Cachorro extends AnimaisCorrem {

	
	public Cachorro (String nome, int idade, String especie, String corre) {
		
		super(nome, idade, especie, corre);
	}


	@Override
	public String emiteSom() {
		return "Latir";
	}
}
