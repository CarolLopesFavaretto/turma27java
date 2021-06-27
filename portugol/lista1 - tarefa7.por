programa
{
	
	funcao inicio()
	{
		
		//*Um sistema de equações lineares do tipo: 
 		//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 


		real  A=0 , B=0 , C=0, D=0, E=0, F=0 , X=0, Y=0
		
		
		escreva("Digite o coeficiente A:")
		leia (A)
		escreva("Digite o coeficiente B:")
		leia (B)
		escreva("Digite o coeficiente C:")
		leia (C)
		escreva("Digite o coeficiente D:")
		leia (D)
		escreva("Digite o coeficiente E:")
		leia (E)
		escreva("Digite o coeficiente F:")
		leia (F)

		X = ((C+E) - (B+F)) / ((A+E) - (B+D))
		Y = ((A+F) - (C+D)) / ((A+E) - (B+D))

		escreva ("O valor de x é:" ,X, "\n" )
		escreva ("O valor de y é:" ,Y, "\n" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 618; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */