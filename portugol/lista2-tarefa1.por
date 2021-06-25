programa
{
	
	funcao inicio()
	{
		inteiro pesoLimite = 50
		inteiro pesoTomate, excesso, multa
		escreva("Qual o valor do peso do tomate:")
		leia (pesoTomate)

         excesso = pesoTomate-pesoLimite
         multa = excesso * 4
         
	se (pesoTomate > pesoLimite){
		escreva(" Vocé tem um peso de excesso" ,excesso, " e receberá uma multa de"  , multa,  "reais \n")
	}senao se (pesoTomate == pesoLimite){
		escreva("Você receberá 0 multa") 
  	}


	
} 

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 457; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */