programa
{
	
	funcao inicio()
	{
		//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem 
		//do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem 
		//do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo 
		//de fábrica de um carro e escreva o custo ao consumidor. 

		
		real distribuidor=28, impostos=45, custoFabrica=0, custoConsumidor=0, valorDistribuidor=0, valorImpostos=0
		
		escreva("Digita o valor do carro:")
		leia (custoFabrica)
		
		valorDistribuidor = (custoFabrica* distribuidor /100)
		valorImpostos = (custoFabrica* impostos /100)
		
				
		
		custoConsumidor= valorDistribuidor + valorImpostos + custoFabrica

		escreva("O custo do carro para o consumidor será de R$",custoConsumidor, "reais" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 831; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */