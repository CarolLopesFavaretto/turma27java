package exerciciosjavalista4;

import java.util.Scanner;

public class lojinhadoed {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String produtos[] = { "Lapis de cor", "borracha", "Caneta", "Canetinha","Estojo", "Fichario", "Agenda", "Marca-Texto", "Post it", "Caderno"};
		double preço[]= { 40.00, 2.50, 1.20 , 8.50 , 12.00, 68.00 , 32.00 , 4.20 , 6.50 , 30.00};
		String codigo[] = {"G3-01","G3-02", "G3-03", "G3-04","G3-05","G3-06","G3-07","G3-08","G3-09","G3-10"};
		int estoque[] = new int [10];
		int carrinho[]= new int [10]; 
		double imposto=0.00;
		double total=0.00;
		String auxCodigo;
		int auxQ;
		char op;
		char fecha;
		
		
		System.out.println("Papelaria G3\n");
		
		//montando a primeira entrada
		
		for(int x=0;x<10;x++) {
			codigo[x]="G3-0"+(x+1);
			estoque[x]=10;
		}
		
		do {
			System.out.println("CÓDIGO \t PRODUTO \t ESTOQUE \t PREÇO");
			
		for(int x=0; x<10; x++) {
			System.out.println(codigo[x]+ "\t"+ produtos[x]+ "\t"+ estoque[x] + "\t" + preço[x]);
		}
		System.out.println("carrinho:");
		System.out.println("CÓDIGO\t PRODUTO\t ESTOQUE\t PREÇO\t SUBTOTAL");
		for(int x=0; x<10; x++) {
			if(carrinho[x] != 0) {
				System.out.println(codigo[x]+ "\t" +produtos[x]+ "\t" +estoque[x]+ "\t" +preço[x]+ "\t"+carrinho[x]+"\t"+(carrinho[x]*preço[x]));
			}
		}
		System.out.print("Digite o codigo do produto que deseja compra: ");
		auxCodigo = leia.next().toUpperCase();
		for (int x=0; x<10; x++) {
			if (codigo[x].equals(auxCodigo)) {
				System.out.println("PRODUTO SELECIONADO");
				System.out.println("CODIGO\tPRODUTO\tESTOQUE\tPREÇO");
				System.out.println(codigo[x]+"\t"+produtos[x]+"\t"+estoque[x]+"\t"+preço[x]);
				if (estoque[x]==0) {
					System.out.println("Impossivel realizar!!");
				} else {
					System.out.print("Qual quantidade vc deseja: ");
					auxQ= leia.nextInt();
					if (auxQ > estoque[x] ) {
						System.out.println("Valor invalido!!!");
					}
					else {
						carrinho[x] = auxQ;
					}
				}
			}
		}
		System.out.print("Finalizar a compra S/N? ");
		fecha = leia.next().toUpperCase().charAt(0);
		if (fecha =='S') {
			for (int x=0; x<10; x++) {
				total=total+(carrinho[x]*preço[x]);
			}
			imposto = total*0.09;
			System.out.println("NOTA FISCAL");
			System.out.println();
			System.out.println("CODIGO\tPRODUTO\tPREÇO\tCOMPRA\tSUB-TOTAL");
			for (int x=0; x<10; x++) {
				
				if(carrinho[x]!=0) {
					
					System.out.println(codigo[x]+"\t"+produtos[x]+"\t"+preço[x]+"\t"+carrinho[x]+"\t"+(carrinho[x]*preço[x]));			
				}
			}
			System.out.println("Valor imposto 9% :"+imposto);
			System.out.println("Valor total da compra: R$ "+total);
			for (int x=0; x<10; x++) {
				if(carrinho[x]>0) {
				   estoque[x]-=carrinho[x];
				  // estoque[x]=estoque[x]-carrinho[x];
				   carrinho[x]=0;
				}
				
			}
			
		}
			System.out.println("Continua S/N");
			op = leia.next().toUpperCase().charAt(0);
		} while (op =='S');
		System.out.println("VOLTE SEMPRE, COMPRE MAIS!!!");
	}
}
