programa
{
	
	funcao inicio()
	{
		
		//Faça um programa que crie um vetor por leitura com 5 valores 
		//de pontuação de uma atividade e o escreva em seguida. 
		//Encontre após a maior pontuação e a apresente. 

		inteiro pontuaca[5]
		inteiro maior = 0, i
		
		para (i=0; i<5;i++){
			escreva ("Pontuação :")
			leia (pontuaca[i])
			se (pontuaca[i] > maior){
				maior= pontuaca[i]
				
			}
		}
			escreva("A maior pontuação é :", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */