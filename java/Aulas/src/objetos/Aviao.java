package objetos;

public class Aviao {

	public int rodas;
	public String modelo;
	public String tipo;
	public boolean noAr;
	public int velocidade;
	public boolean ligado;
	
	
	public void ligar() {
		ligado= true;
	}
	public void desliga() {
		ligado= false;
		}
	
	
	public void decolando() {
		for(int i=0;i<9;i++) {
			aumentarVelocidade();
			noAr = true;
		}	
	}
	public void pousar() {
		noAr = false;
	}
	public void aumentarVelocidade() {
		velocidade++;
	}
	public void aumentarVelocidade(int acrescimo) {
		velocidade += acrescimo;
	}
	public void diminuirVelocidade() {
		velocidade--;
	}
	public void diminuirVelocidade(int decrescimo) {
		velocidade-= decrescimo;
		}

}


