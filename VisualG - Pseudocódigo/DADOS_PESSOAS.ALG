Algoritmo "dados_pessoas"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/05/2026
Var
i, Num, nMasculinos, nFemininos:inteiro
Altura: vetor[0..9] de real
Genero: vetor[0..9] de caractere
mediaF, soma, menorAltura, maiorAltura: real


Inicio

      escreva("Quantas Pessoas serão representadas?:  ")
      leia(Num)
      
      para i de 0 ate (Num - 1) faca
           escreva("Altura da ",i+1,"a pessoa:  ")
           leia(Altura[i])
           escreva("Gênero da ",i+1,"a pessoa:  ")
           leia(Genero[i])
           escrevaL("")
      
      fimpara
      
      
      menorAltura <- Altura[0]
      maiorAltura <- Altura[0]
      para i de 0 ate (Num - 1) faca
           se Altura[i] > maiorAltura entao
              maiorAltura <- Altura[i]
              senao
                se Altura[i] < menorAltura entao
                   menorAltura <- Altura[i]
                fimse
           fimse
      fimpara
      
      escreval("Menor Altura = ",menorAltura:3:2)
      escreval("Maior Altura = ",maiorAltura:3:2)
      
      nMasculinos <- 0
      nFemininos <- 0
      soma <- 0
      para i de 0 ate (Num - 1) faca
           se Genero[i] = "F" entao
              soma <- soma + Altura[i]
              nFemininos <- nFemininos + 1
              mediaF <- soma/nFemininos
              senao
               se Genero[i] = "M" entao
                  nMasculinos <- nMasculinos + 1
               fimse
           fimse
      fimpara
      
      escreval("A Média das Alturas das Mulheres é = ",mediaF:3:2)
      escreval("O número de Homens é = ",nMasculinos)



Fimalgoritmo