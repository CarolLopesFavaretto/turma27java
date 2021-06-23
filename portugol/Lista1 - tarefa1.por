programa
{
	
	funcao inicio()
	{
		inteiro idade, mes, dias, idadeAno, resulDias
		
		escreva ("Digite sua idade:")
		leia (idade)
		escreva ("Digite o mes: ")
		leia (mes)
		escreva ("Digite os dias: ")
		leia (dias)

		idadeAno = idade*365
		mes = mes*30
		dias = dias
		resulDias = (idadeAno + mes + dias)
		

	     escreva ("Total de dias é:" + resulDias + "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */