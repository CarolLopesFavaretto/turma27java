package objetos;

public class Cavalo extends AnimaisCorrem {


	public Cavalo(String nome, int idade,  String especie, String corre) {

		super(nome, idade,  especie, corre);
	}

	@Override
	public String emiteSom() {
		return "Relincha";
	}
	
}
