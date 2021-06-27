programa
{
	
	funcao inicio()
	{
		//Receber valores de base e altura de um triângulo e 
		//verificar se são valores válidos (positivos maiores que zero). 
		//Em caso afirmativo, calcular a área do triângulo.

		inteiro base, altura, areaTriangulo 
		
		
		escreva("Digite um valor para base do triangulo:")
		leia (base)
		escreva("Digite um valor para altura do triangulo:")
		leia (altura)

		se (base > 0 e altura > 0){
			areaTriangulo = (base*altura/2)
			escreva ("O calculo da area do triangulo é  " ,areaTriangulo,"\n")
		}
		senao
		escreva("O valor tem que ser positivo")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 590; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */