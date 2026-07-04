Algoritmo "soma_impares"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19/03/2026
Var
    Num1, Num2, maior, menor, i, soma, impar: inteiro


Inicio

      escreval("Digite 2 Números Inteiros Qualquer: ")
      leia(Num1)
      leia(Num2)
      
       se Num1 < Num2 entao
        maior <- Num2
        menor <- Num1
        senao
         se Num1 > Num2 entao
          maior <- Num1
          menor <- Num2
          senao
           maior <- Num1
           menor <- Num2
         fimse
       fimse
       
       soma <- 0
       para i de menor+1 até maior-1 faca
         impar <- (i % 2)
          se impar <> 0 entao
             soma <- soma + i
          fimse
       
       fimpara
       
       escreva("A Soma dos Ímpares de ",Num1," e ",Num2," é igual a ",soma:1)

Fimalgoritmo