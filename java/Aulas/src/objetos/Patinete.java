package objetos;

public class Patinete {

	public String marca;
	public String classificacao;
	public String cor;
	public int rodas;
	public boolean dobravel;
	public double codigo;
	public int capacidade;
	
	
	public String dobravel () {
		if(dobravel == true) {
			return "dobravel";
	}
		return "Não dobravel";	
		
	}	

}