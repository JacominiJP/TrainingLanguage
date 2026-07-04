Algoritmo "media_ponderada"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/03/2026
Var
     Num1, i: inteiro
     a, b, c, mediaP: real

Inicio
       escreva("Quantos Casos Deseja Fazer?: ")
       leia(Num1)
       
       para i de 1 até Num1 faca
            escreval("Digite 3 Números: ")
            leia(a)
            leia(b)
            leia(c)
            
            mediaP <- (a*2 + b*3 + c*5)/10
            escreval("Sua Média é de ", mediaP:3:1)
       fimpara


Fimalgoritmo