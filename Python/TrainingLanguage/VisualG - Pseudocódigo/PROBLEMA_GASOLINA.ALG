Algoritmo "problema_gasolina"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 31/03/2026
Var
 cod, alcool, gasolina, disel : inteiro


Inicio
     alcool <- 0
     gasolina <- 0
     disel <- 0

      repita
            escreval("Informe o Código(1, 2, 3) ou 4 para finalizar o processo")
            leia(cod)
            
            escolha cod
                   caso 1
                        alcool <- alcool + 1
                   caso 2
                        gasolina <- gasolina + 1
                   caso 3
                        disel <- disel + 1
            fimescolha

      até (cod = 4 )
      
      escreval("MUITO OBRIGADO!")
      escreval("Álcool: ",alcool:1)
      escreval("Gasolina: ",gasolina:1)
      escreval("Disel: ", disel:1)
Fimalgoritmo