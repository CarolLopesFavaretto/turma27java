programa
{
funcao inicio()
	{
		
		//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente 
		//no final o total do somatório, a média e o total de valores lidos. O programa deve fazer 
		//as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
		//Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.

	
	real valorNum1, soma=0, media=0, total=0

						
			enquanto (verdadeiro){
				escreva("Digite um numero: ")
				leia (valorNum1)

				se (valorNum1 < 0){
					//total++
					pare
				}

				soma+= valorNum1 
				total++
								
			
			}
			media = soma/total
			escreva("Resultado soma:", soma, "Resultado media" , media, "Resultado Total lido:", total, "\n")
		}
}		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 650; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */