programa
{
	
	funcao inicio()
	{
		inteiro tempoEvento, minutos, horas, segundos
		escreva("Digite o tempo de duraçãi do evento em segundos: ")
		leia (tempoEvento)

		horas = tempoEvento /3600
          minutos = (tempoEvento % 3600) /60
          segundos = (tempoEvento % 3600) %60
          

          escreva ("Horas: " +horas +"\n")
          escreva ("Minutos:" +minutos +"\n")
          escreva ("Segundos:" +segundos +"\n\n")
         
         escreva ("Fim de Programa")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 488; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */