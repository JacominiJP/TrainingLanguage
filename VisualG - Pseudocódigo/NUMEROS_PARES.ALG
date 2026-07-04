Algoritmo "numeros_pares"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/04/2026
Var
vet:vetor[0..99] de inteiro
Pares:vetor[0..99] de inteiro
numeros,i,Num, ePar, topo:inteiro


Inicio


topo <- 0
       escreva("Quantos Números Deseja Digitar?:")
       leia(numeros)
       
       para i de 0 ate (numeros - 1) faca
            escreva("Digite um número: ")
            leia(Num)
            
            ePar <- Num%2
            se (ePar = 0) entao
               Pares[topo] <- Num
               topo <- topo + 1
            fimse
            
       fimpara
       
       escreval("São Pares os Seguintes Números:")
       para i de 0 ate topo-1 faca
            escreva(Pares[i]," ")
       fimpara
       escreval("")
       
       escreva("Quantidades de Pares: ",topo)
       
Fimalgoritmo