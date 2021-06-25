programa
{
	
	funcao inicio()
	{
		cadeia codigoFuncionario
		inteiro numeroHorasTrabalhadas=0
		real excesso=0
		const real VALORHORATRABALHADA = 10.00
		const real VALORHORAEXCEDENTE = 20.00 
		const inteiro LIMITEHORAS = 50
		real salarioTotal=0.00 , salarioExcedente=0.00
		
		escreva("Digite o codigo do funcionario:")
		leia (codigoFuncionario)
		escreva("Qual a quantidade de horas trabalhadas:")
		leia (numeroHorasTrabalhadas)

		se (numeroHorasTrabalhadas <= LIMITEHORAS){
			salarioTotal = numeroHorasTrabalhadas * VALORHORATRABALHADA
			
			escreva("Salario Total",salarioTotal,"\n")
		     escreva("Salario Total",salarioExcedente,"\n")
			
		}senao {
			salarioExcedente = (numeroHorasTrabalhadas - LIMITEHORAS)*VALORHORAEXCEDENTE
			salarioTotal = (LIMITEHORAS *VALORHORATRABALHADA) + salarioExcedente
			
			escreva("Salario Total"  ,salarioTotal,"\n")
			escreva("Salario Total"  ,salarioExcedente,"\n")
		
		}
		
		 
	}
 }
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 903; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */