package programas;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3Lista5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		String produto1 = "Lapis";
		String produto2 = "Caneta";
		String produto3 = "Borracha";
		String produto4 = "Apontador";
		String produto5 = "Caderno";
		
		//armazenando os produtos na lista de estoque;
		
		ArrayList<String> produto = new ArrayList<String>();
		produto.add(produto1);
		produto.add(produto2);
		produto.add(produto3);
		produto.add(produto4);
		produto.add(produto5);
		
		System.out.println(produto);
		
		// removendo item "Apontador" do estoque;
		
		produto.remove(3);
		System.out.println(produto);
		
		// atualizando novo item na mesma posição;
		produto.add(3, "Canetinha");
		System.out.println(produto);
		
		//apresentando toda lista de produtos atualizados;
		for(int i=0; i<produto.size(); i++) {
			System.out.println("Produto: " + produto.get(i));
		}
		
		
		
		}
	}


