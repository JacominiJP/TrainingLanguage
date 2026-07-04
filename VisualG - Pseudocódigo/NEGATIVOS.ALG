Algoritmo "negativos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 24/04/2026
Var
   vet: vetor[0..9] de inteiro
   i,n1,n2: inteiro

Inicio

      repita
      escreva("Quantos Números Deseja Digitar? (Máximo 10 Números)")
      leia(n1)
      até (n1 > 0) ou (n1 < 11)
      
      escreval("Preencha O Vetor:")
      para i de 0 até (n1-1) faca
       leia(n2)
       vet[i] <- n2
      fimpara
      
      escreval("Seu Vetor Possui os Seguintes Números Negativos: ")
      
      para i de 0 até (n1 - 1) faca
       se vet[i] < 0 entao
        escreval(vet[i])
       fimse
      fimpara
      



Fimalgoritmo