programa
{
	
	funcao inicio()
	{
		inteiro totalDias, resultAno, resultMes, resulDias, restMes 
		escreva("Digite sua idade em dias:")
		leia (totalDias)
	
		resultAno = totalDias/365
		restMes = totalDias % 365
		resultMes = restMes/30
		resulDias = restMes % 30

		
	escreva ("Total de anos é:" + resultAno + "\n")
	escreva ("Total de meses é:" + resultMes + "\n")
	escreva ("Total de dias é:" + resulDias + "\n")
	//escreva ("Total:" + totalDias % 365) 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */