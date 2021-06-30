programa
{
	
	funcao inicio()
	{
		//Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		//A seguir determine e imprima a média aritmética dos lançamentos, 
		//contabilize e apresente também quantas foram as ocorrências da maior pontuação.

		
		inteiro dadosLancado[10]
		inteiro media = 0, i, maior = 0, contador=0, soma =0
		
		para (i=0; i<10;i++){
			escreva ("Digite um valor do lançamento de dado :")
			leia (dadosLancado[i])
			soma += dadosLancado[i]
			se (dadosLancado[i] > maior){
				maior= dadosLancado[i]
				contador=1
				se (dadosLancado[i] == maior){
					contador++
				}
			}
		}
			
		media = soma/10
		escreva("A quantidade de maior pontuação é :", contador, "\n")
		escreva("A media de lançamentos é :", media, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 845; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */