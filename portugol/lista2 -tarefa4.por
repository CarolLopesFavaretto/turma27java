programa
{
	
	funcao inicio()
	{
		//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
		//se este número é par ou ímpar, e se é positivo ou negativo.

		inteiro num, numPar, numImpar=0, positivo, negativo
		
		escreva("Digite um numero inteiro:")
		leia (num)

			se ((num%2==0)){
			escreva ("Este numero é par \n")
			}
			
			senao {
			escreva ("Este numero é impar\n")
			}
			
			se (num > 0){
			escreva("Este numero é positivo\n")
			}
			
			senao {
			escreva("Este numero é negativo\n")
				}
				
	}
			    
}
				
		
		

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */