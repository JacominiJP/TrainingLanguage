Algoritmo "media_pares"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/05/2026
Var
   vet: vetor[0..9] de inteiro
   i, Num, numPar, Valores, soma:inteiro
   media:real


Inicio

      escreva("Quantos elements Deseja Digitar?  ")
      leia(Num)
      
      para i de 0 ate (Num - 1) faca
      
           escreva("Digite Um Número: ")
           leia(Valores)
           vet[i] <- Valores
      
      fimpara
      
      soma <- 0
      numPar <- 0
      para i de 0 ate (Num - 1) faca
      
           se (vet[i]%2) = 0 entao
              soma <- soma + vet[i]
              numPar <- numPar + 1
           fimse
      
      fimpara
      

      se numPar = 0 entao
         escreva("SEM NÚMEROS PARES")
         senao
           media <- soma/numPar
           escreval("MÉDIA DOS PARES = ",media:4:2)
      fimse
         


Fimalgoritmo