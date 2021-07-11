package programas;

import java.util.Scanner;

import objetos.ProdutoEletronico;

public class Exercicio3Lista4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		ProdutoEletronico eletronico = new ProdutoEletronico();
		
		eletronico.tipoProduto = "Fone de Ouvido";
		eletronico.marca = "Sony";
		eletronico.codigo = 1234568;
		eletronico.origem = "Internacional";
		eletronico.garatia = 6;
		eletronico.valor = 1.385;
		
		System.out.println("Você acabou de adquirir o produto: " + eletronico.tipoProduto + " "+ eletronico.marca + " no valor de R$ " + eletronico.valor + " com garatia de " + eletronico.garatia + " meses.");
		
		
		
		
	}

}
