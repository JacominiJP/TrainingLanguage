Algoritmo "Maior_Posição"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/04/2026
Var
vet:vetor[0..9] de real
Num, maiorNum:real
valor, i, posicao:inteiro


Inicio
      escreva("Quantos números deseja digitar?: ")
      leia(valor)


      para i de 0 ate (valor - 1) faca
           escreva("Digite um Número: ")
           leia(Num)
           vet[i] <- Num
      fimpara
      
          posicao <- 0
          maiorNum <- 0
      para i de 0 ate (valor - 1) faca
           se vet[i] > maiorNum entao
              maiorNum <- vet[i]
              posicao <- i
           fimse
      fimpara

      escreval("O MAIOR NÚMERO É O ",maiorNum:3:2)
      escreval("E ele se encontra na Posição do Vetor Número ",posicao:1 )
           
      




Fimalgoritmo