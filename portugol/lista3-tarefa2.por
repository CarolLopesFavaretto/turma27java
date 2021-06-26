programa
{
	
	funcao inicio()
	{
		inteiro numero=0, contadorImpar=0
		inteiro somaImpar=0, i, media=0

		
			para(i=0 ; i<5;i++){
				escreva("Digite um numero inteiro:")
				leia (numero)

						
				se (numero > 0 e numero <=500){
				contadorImpar++
				
					se ((numero%2!=0) e (numero%3==0)){
					somaImpar += numero	
					}
			}
			
			}
			escreva("A soma de numeros impares multiplos de três:   "     ,somaImpar, "\n")	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */