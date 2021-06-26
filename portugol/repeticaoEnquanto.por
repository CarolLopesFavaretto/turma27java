programa
{
	
	funcao inicio()
	{
		//escopo de variaveis
		inteiro idade
		inteiro contador=1
		
		escreva("Digite a sua idade:")
		leia (idade)

		enquanto(idade < 18){
				escreva ("Você não tem permissão para acessar \n")
	
				
				contador++
				se(contador > 3){
					escreva ("Você é guerreiro\n")
					pare
						
					}
					escreva("Digite a sua idade:")
					leia (idade)
					
				}
				se(contador==1){
					escreva("Parabens, agora você tem acesso")	
				}
				senao{
					escreva("Este programa não é para você")
				}
		
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */