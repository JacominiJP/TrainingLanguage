Algoritmo "soma_vetor"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 24/04/2026
Var

   i, digitos: inteiro
   media, numero, soma:real
   vet: vetor[0..99] de real



Inicio
        repita
        escreva("Quantos Números Deseja Digitar?: ")
        leia(digitos)
        ate (digitos > 0) ou (digitos < 101)
        
        escreval("Preencha seu vetor: ")
         para i de 0 ate (digitos-1) faca
          escreva("Digite um número: ")
          leia(numero)
          vet[i] <- numero
         fimpara
         
         soma <- 0
         escreva("Valores: ")
         para i de 0 ate (digitos-1) faca
          escreva(vet[i]:3:1,", ")
          soma <- soma + vet[i]
         fimpara
                 escreval("")
         media <- (soma/digitos)
         escreval("SOMA = ",soma)
         escreval("MEDIA = ",media)
Fimalgoritmo