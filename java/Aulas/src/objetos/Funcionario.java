package objetos;

public class Funcionario {
	
		public String nome;
		public String sexo;
		public int anoNascimento;
		public int inscricao;
		
		public String sexo() {
			
			if(sexo.equalsIgnoreCase("feminino")) {
				return "Bem Vinda ao Sistema RH!";
			}
			else if(sexo.equalsIgnoreCase("masculino")){
				return "Bem Vindo ao Sistema RH!";
			}
			else {
				return "Bem Vinde ao Sistema RH!";
			}
			
			
				}
		
		public int calcularIdade() {
			return (2021-anoNascimento);
		}
		public int calcularIdade(int anoAtual) {
			return (anoAtual - anoNascimento);
		}
		public int inscricao() {
			return (anoNascimento + 505);
			}
		
		}
		




