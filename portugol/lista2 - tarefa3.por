programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		//Desenvolva um sistema em que:
		//Leia 4 (quatro) números;
		//Calcule o quadrado de cada um;
		//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

		
		real num1, num2, num3, num4, result
			
		escreva("Digite o primeiro numero :")
		leia (num1)
		escreva("Digite o segundo um numero :")
		leia (num2)
		escreva("Digite o terceiro numero :")
		leia (num3)
		escreva("Digite o quarto numero :")
		leia (num4)

		 num1 = Mat.raiz(num1,2) 
		 num2 = Mat.raiz(num2,2) 
		 num3 =Mat.raiz(num3,2) 
		 num4 = Mat.raiz(num4,2)

		se(num3>= 1000){
			escreva ( num3 )
			escreva ("Fim de programa")			
		}senao{
			escreva ("A raiz quadrada do primeiro numero é:" ,num1, "\n")
			escreva ("A raiz quadrada do segundo é:" ,num2, "\n")
			escreva ("A raiz quadrada do terceiro é:" ,num3, "\n")
			escreva ("A raiz quadrada do quarto é:" ,num4, "\n")
		}
		}
		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1034; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */