programa
{
	
	funcao inicio()
	{

		//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		//a) média do salário da população; 
		//b) média do número de filhos; 
		//c) maior salário; 
		//d) percentual de pessoas com salário até R$100,00.  


		real salario=0,salarioPopulacao=0,maiorSalario=0,totalSalario100=0, mediaSalario =0, percentualSalario=0, numPessoas=20
		inteiro mediaFilhos=0, numeroFilhos=0, totalFilhos=0, i, filhos=0
		

		
		para(i=0 ; i<20;i++){
			escreva ("Digite o salário:")
			leia (salario)
			escreva("Digite a quantidade de filhos:")
			leia (numeroFilhos)

			salarioPopulacao += salario
			totalFilhos += numeroFilhos

			se (salario > maiorSalario){
				maiorSalario = salario
			}
		
			se (salario <= 100){
				totalSalario100++	
			}
			
		}
		
			mediaSalario = salarioPopulacao/numPessoas
			mediaFilhos = totalFilhos/numPessoas
		
			percentualSalario = (totalSalario100*100/numPessoas)
		
			
		
		escreva("A media de salario da população é " , mediaSalario, "\n")
          escreva("A media de numero de filhos é ",  mediaFilhos, "\n") 
          escreva("O maior salario é " , maiorSalario, "\n")
          escreva("O percentual de pessoas com salario de R$100 é  " , percentualSalario, "\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 568; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */