programa
{
	
	funcao inicio()
	{
		
		//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
		//e em seguida, exiba a soma dos valores dela e a soma dos valores da 
		//primeira diagonal, ou seja, diagonal principal.

		inteiro valor[3][3]
		inteiro soma=0, diagonal =0, l, c
		
		para(l=0;l <3;l++){
			para(c=0;c <3;c++){
				escreva ("Digite um valor :")
				leia (valor[l][c])
				soma += valor[l][c]
				
			}
		}	
		
		diagonal = valor[0][0]+ valor[1][1]+valor[2][2]
		escreva("Soma :",soma,"\n")
		escreva("Soma diagonal principal: ",diagonal)
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 594; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valor, 11, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */