programa
{
	inclua biblioteca Util
	inclua biblioteca Matematica --> mat
	inclua biblioteca Texto --> tx
	
	
	funcao inicio(){
		
		cadeia movimento=" "
		inteiro numero, tipoConta=1, contador=0
		real saldo, debito=0.0, credito=0.0, saldoAtual=0.0

	     cabecalho()
		escreva("1 - CONTA POUPANÇA\n2 - CONTA CORRENTE\n3 - CONTA ESPECIAL\n4 - CONTA EMPRESA\n5 - CONTA ESTUDANTIL\n6 - SAIR\n")
          escreva("\n")
          escreva("DIGITE O CODIGO DA CONTA QUE DESEJA ACESSAR (1 - 6): ")
          leia(tipoConta)
          
          enquanto(tipoConta < 1 ou tipoConta > 6){ 
                                   	
              escreva("DIGITE UM CODIGO VALIDO (1 - 6): ")
              leia(tipoConta)        	 	
          }       
		limpa()
		
		se(tipoConta == 1){
          	contaPoupanca()
          }

		
          se(tipoConta == 4){
          	contaEmpresa()
          }
          senao se(tipoConta == 6){
          	sair()
          }
	}
	
     funcao contaPoupanca(){
     	inteiro diaAniversarioPoupanca = 5
     	real correcao=0.0, saldoAtual=0.0, operacao=0.0, c=0.0, d=0.0
     	cadeia continua , movimento    

		cabecalho()
     	escreva("DIGITE A DATA DE ANIVERSARIO DA CONTA POUPANÇA:")
    		leia(diaAniversarioPoupanca)

    		limpa()
     	
     	
     	enquanto (diaAniversarioPoupanca != 5){
      		escreva("POR FAVOR, DIGITE UMA DATA VÁLIDA!\n")
      		leia(diaAniversarioPoupanca)
      		limpa()
     	}
     	
     		      	          		
      		     	
		para(inteiro i=0; i<10; i++){

			saldoAtual = saldoAtual + (saldoAtual*0.05)
			saldoAtual = mat.arredondar(saldoAtual,2)
      		
		     escreva("                        CONTA POUPANÇA\n")
		     escreva("\n")
               
     		escreva("DIA 5 - DATA DE ANIVERSARIO DE CONTA POUPANÇA\n")
     	     escreva("SALDO ATUAL: R$ " + saldoAtual + "\n")	

			faca{
				escreva("MOVIMENTO - DEBITO(D) OU CREDITO(C): \n")
      			leia(movimento)
      			movimento = tx.caixa_alta(movimento)
      			limpa()
			}enquanto ((movimento != "C") e (movimento != "D"))
        		
		     se(movimento == "C"){
		     	escreva("QUANTO DESEJA DEPOSITAR R$? ")
		        	leia(operacao)
		        	saldoAtual += operacao
		        	escreva("SALDO ATUAL: R$ " + saldoAtual + "\n")
     	               escreva("=======================================================\n")
		    
		     }senao {
		        escreva("QUANTO DESEJA DEBITAR R$? ")
		        leia(operacao)
		        saldoAtual -= operacao
		        escreva("SALDO ATUAL: R$ " + saldoAtual + "\n")
     	        escreva("=======================================================\n")
		     }	      
		}
     }
     
     funcao contaCorrente(){
     	inteiro contadorTalao
     }
     
     funcao contaEspecial(){
     	real limite
     }
     
     funcao contaEmpresa(){
     	real emprestimoEmpresa=10000.00, saldoAtual=0.0, operacao=0.0
     	cadeia movimento, continua

     	para(inteiro i=0; i<10; i++){

               cabecalho()
		     escreva("                        CONTA EMPRESA\n")
		     escreva("\n")
               
     		escreva("EMPRESTIMO DISPONIVEL NO VALOR DE R$: " + emprestimoEmpresa + "\n")
     	     escreva("SALDO ATUAL: R$ " + saldoAtual + "\n")	
     	     	
     		escreva("MOVIMENTO - DEBITO(D) OU CREDITO(C): ")
		     leia(movimento)

		     se(movimento == "D" ou movimento == "d"){
		     	
		        escreva("MOVIMENTO - DEBITAR O VALOR DO SALDO (S) OU RESGATAR DO EMPRESTIMO (E): ")
		        leia(movimento)

		        se(movimento == "S" ou movimento == "s"){
		        	
		           escreva("VALOR A DEBITAR: R$ ")
		           leia(operacao)

		           se(operacao > saldoAtual){
		           	limpa()
		           	cabecalho()
		           	escreva("SALDO INSUFICIENTE PARA OPERAÇÃO!" + "\n")
		           	escreva("\n")
		           	escreva("SALDO ATUAL: " + saldoAtual + ". VALOR SOLICITADO: R$ " + operacao + "\n")
		           	escreva("\n")
		           	repitaOperacao()		           	
		           }
		           senao{
		               saldoAtual -= operacao
		           }
		        }
		        se(movimento == "E" ou movimento == "e"){
		        	
		           escreva("QUANTO DESEJA RESGATAR DO EMPRESTIMO: R$ ")
		           leia(operacao)

		           se(operacao > emprestimoEmpresa){
		           	limpa()
		           	escreva("DESCULPE, O SENHOR(A) NÃO TEM ESSE VALOR DISPONIVEL PARA EMPRESTIMO." + "\n")
		           	escreva("\n")
		           	repitaOperacao()
		           }
		           senao{
		               emprestimoEmpresa -= operacao
		               saldoAtual = operacao
		               limpa()
		               escreva("EMPRESTIMO DISPONIVEL NO VALOR DE R$: " + emprestimoEmpresa + "\n")
     	               escreva("SALDO ATUAL: R$ " + saldoAtual + "\n")
     	               escreva("=======================================================\n")
     	               repitaOperacao()
		           }
		        }		     
		     }
		     senao{
		     	se(movimento == "C" ou movimento == "c"){
		     		escreva("QUANTO DESEJA DEPOSITAR R$: ")
		     		leia(operacao)
		     		saldoAtual += operacao
		     		limpa()	
		     		cabecalho()
		     		escreva("EMPRESTIMO DISPONIVEL NO VALOR DE R$: " + emprestimoEmpresa + "\n")
     	               escreva("SALDO ATUAL: R$ " + saldoAtual + "\n")
     	               escreva("=======================================================\n")
     	                	               	 	     		                                         	     				     		
		     	}
		     	repitaOperacao() 	   		     	
		     }
     	}
		escreva("O SENHOR(A) TENTOU REALIZAR MAIS DE 10 OPERAÇÕES NO MESMO DIA. FAVOR RETORNAR NO DIA SEGUINTE! \n")
     }
     
     funcao contaEstudantil(){
     	real limiteEstudantil
     }
     
     funcao sair(){
     	limpa()
     	cabecalho()
		escreva("                     OPERAÇÃO FINALIZADA!\n")
          escreva("\n")
		escreva("                       VOLTE SEMPRE :)\n")		     
		
     }
     funcao repitaOperacao(){

     	cadeia continua 
     	
     	escreva("DESEJA REPETIR A OPERAÇÃO S/N: ")
		leia(continua)
          
		se(continua == "N" ou continua == "n"){

          limpa()
		escreva("                     OPERAÇÃO FINALIZADA!\n")
          escreva("\n")
		escreva("                       VOLTE SEMPRE :)\n")		
		escreva("\n")
			     
		}
		senao{
		       limpa()
		}
     }
     funcao cabecalho(){
     	escreva("                        G5 JEDBANK\n")
          escreva("===========================================================\n")
		escreva("SE VOCÊ NÃO CUIDA DO SEU DINHEIRO, A GENTE CUIDA PARA VOCÊ! \n")
		escreva("===========================================================\n")
		escreva("\n")
     }
	

	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1679; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */