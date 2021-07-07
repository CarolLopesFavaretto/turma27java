package objetos;

public class Paciente {
	
	public String nome;
	public String sexo;
	public int anoNascimento;
	public String cadastro;
	
	
	public String sexo() {
		
		if(sexo.equalsIgnoreCase("feminino")) {
			return "Bem Vinda ao Sistema do Laboratorio Pfizer!";
		}
		else if(sexo.equalsIgnoreCase("masculino")){
			return "Bem Vindo ao Sistema do Laboratorio Pfizer!";
		}
		else {
			return "Bem Vinde ao Sistema do Laboratorio Pfizer!";
		}
		
		
			}
	
	public int calcularIdade() {
		return (2021-anoNascimento);
	}
	public int calcularIdade(int anoAtual) {
		return (anoAtual - anoNascimento);
	}
	public String cadastro() {
		return (nome.toUpperCase() + "VACINASIM");
		}
	
	}


