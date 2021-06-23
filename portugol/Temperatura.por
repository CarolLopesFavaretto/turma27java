programa
{
	
	funcao inicio()
	{
	    cadeia nomeUsuario
	    real temperaturaF, conversaoTemperatura
        
         escreva("Digite seu nome:")
         leia (nomeUsuario)
         escreva ("Qual temperatura em Fahrenheit:")
         leia (temperaturaF)
         
         conversaoTemperatura = (temperaturaF - 32 )/1.8
         escreva("O nome do usuario é:", nomeUsuario, "\n")
         escreva("A temperatura em graus Celsius é:" , conversaoTemperatura)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */