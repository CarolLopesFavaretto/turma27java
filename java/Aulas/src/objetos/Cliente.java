package objetos;

public class Cliente {

	public String nome;
	public int anoNascimento;
	public String sexo;
	public int codigoCliente;
	
	
	public String sexo() {
		
		if(sexo.equalsIgnoreCase("feminino")) {
			return "Seja Bem Vinda!";
		}
		else if(sexo.equalsIgnoreCase("masculino")){
			return "Seja Bem Vindo!";
		}
		else {
			return "Seja bem Vinde!";
		}
		}
	
		public String codigoCliente() {
		return (nome.toUpperCase() +"BRAMODAS");
		}
		
		public int calcularIdade() {
			return (2021-anoNascimento);
		}
}
