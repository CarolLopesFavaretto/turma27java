package objetos;

public class pessoa {

	//atributos
	public String nome;
	public String sexo;
	public int anoNascimento;
	
	public String sexo() {
		
		if(sexo.equalsIgnoreCase("feminino")) {
			return "Oi Aluna!";
		}
		else if(sexo.equalsIgnoreCase("masculino")){
			return "Oi Aluno!";
		}
		else {
			return "Oi Alune!";
		}
		
		
			}
	
	public int calcularIdade() {
		return (2021-anoNascimento);
	}
	public int calcularIdade(int anoAtual) {
		return (anoAtual - anoNascimento);
	}
	
	}
	
	
	
	


