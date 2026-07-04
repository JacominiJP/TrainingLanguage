Algoritmo "abaixo_media"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/05/2026
Var
   i, Num: inteiro
   vet: vetor[0..9] de real
   media, valores, soma : real

Inicio

      escreva("Quantos Números deseja digitar?: ")
      leia(Num)
      
      para i de 0 ate (Num - 1) faca
      
           leia(valores)
           vet[i] <- valores
      
      fimpara
      
      soma <- 0
      media <- soma/Num
      para i de 0 ate (Num - 1) faca
      
          soma <- soma + vet[i]
          media <- soma/Num
          
      fimpara
      
      escreval("A Média do Vetor é ",media:5:3)

      escreval("Elementos Abaixo da Média: ")
      para i de 0 ate (Num  - 1) faca
      
           se vet[i] < media entao
              escreval(vet[i])
           fimse
           
      fimpara


Fimalgoritmo