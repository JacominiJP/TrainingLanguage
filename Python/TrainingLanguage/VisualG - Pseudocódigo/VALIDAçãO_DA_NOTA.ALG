Algoritmo "validação_da_nota"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/03/2026
Var
    nota1, nota2: inteiro
    media:real


Inicio
       escreval("Digite Sua Primeira Nota: ")
       leia(nota1)
                  enquanto (nota1 < 0) ou (nota1 > 10) faca
                           escreval("Valor Inadequado! Insire Novamente: ")
                           leia(nota1)
                  fimenquanto
                  
                  
       escreval("Digite Sua Segunda Nota: ")
       leia(nota2)
       
                   enquanto (nota2 < 0) ou (nota2 > 10) faca
                           escreval("Valor Inadequado! Insire Novamente: ")
                           leia(nota2)
                  fimenquanto
                  
                  media <- (nota1+nota2)/2
                  escreva("Sua média foi: ",media:2:1)


Fimalgoritmo